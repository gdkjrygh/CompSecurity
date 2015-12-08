// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import android.widget.TextView;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.beta.Beta;
import com.crashlytics.android.internal.CrashEventDataProvider;
import com.crashlytics.android.internal.models.SessionEventData;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.KitGroup;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.ExecutorUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.concurrency.Priority;
import io.fabric.sdk.android.services.concurrency.PriorityCallable;
import io.fabric.sdk.android.services.concurrency.Task;
import io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import io.fabric.sdk.android.services.network.HttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.AppSettingsData;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.PromptSettingsData;
import io.fabric.sdk.android.services.settings.SessionSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.crashlytics.android:
//            CrashlyticsExecutorServiceWrapper, CrashlyticsUncaughtExceptionHandler, DialogStringResolver, CrashlyticsPinningInfoProvider, 
//            BuildIdValidator, CrashTest, ReportUploader, DefaultCreateReportSpiCall, 
//            CrashlyticsMissingDependencyException, SessionDataWriter, CrashlyticsListener, PinningInfoProvider, 
//            CreateReportSpiCall

public class Crashlytics extends Kit
    implements KitGroup
{
    public static class Builder
    {

        private float delay;
        private boolean disabled;
        private CrashlyticsListener listener;
        private PinningInfoProvider pinningInfoProvider;

        public Crashlytics build()
        {
            if (delay < 0.0F)
            {
                delay = 1.0F;
            }
            return new Crashlytics(delay, listener, pinningInfoProvider, disabled);
        }

        public Builder delay(float f)
        {
            if (f <= 0.0F)
            {
                throw new IllegalArgumentException("delay must be greater than 0");
            }
            if (delay > 0.0F)
            {
                throw new IllegalStateException("delay already set.");
            } else
            {
                delay = f;
                return this;
            }
        }

        public Builder disabled(boolean flag)
        {
            disabled = flag;
            return this;
        }

        public Builder listener(CrashlyticsListener crashlyticslistener)
        {
            if (crashlyticslistener == null)
            {
                throw new IllegalArgumentException("listener must not be null.");
            }
            if (listener != null)
            {
                throw new IllegalStateException("listener already set.");
            } else
            {
                listener = crashlyticslistener;
                return this;
            }
        }

        public Builder pinningInfo(PinningInfoProvider pinninginfoprovider)
        {
            if (pinninginfoprovider == null)
            {
                throw new IllegalArgumentException("pinningInfoProvider must not be null.");
            }
            if (pinningInfoProvider != null)
            {
                throw new IllegalStateException("pinningInfoProvider already set.");
            } else
            {
                pinningInfoProvider = pinninginfoprovider;
                return this;
            }
        }

        public Builder()
        {
            delay = -1F;
            disabled = false;
        }
    }

    private class OptInLatch
    {

        private final CountDownLatch latch;
        private boolean send;
        final Crashlytics this$0;

        void await()
        {
            try
            {
                latch.await();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        }

        boolean getOptIn()
        {
            return send;
        }

        void setOptIn(boolean flag)
        {
            send = flag;
            latch.countDown();
        }

        private OptInLatch()
        {
            this$0 = Crashlytics.this;
            super();
            send = false;
            latch = new CountDownLatch(1);
        }

    }


    static final float CLS_DEFAULT_PROCESS_DELAY = 1F;
    static final String COLLECT_CUSTOM_KEYS = "com.crashlytics.CollectCustomKeys";
    static final String COLLECT_CUSTOM_LOGS = "com.crashlytics.CollectCustomLogs";
    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_ATTRIBUTES = 64;
    static final int MAX_ATTRIBUTE_SIZE = 1024;
    private static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
    private static final boolean SHOULD_PROMPT_BEFORE_SENDING_REPORTS_DEFAULT = false;
    public static final String TAG = "Fabric";
    private final ConcurrentHashMap attributes;
    private String buildId;
    private float delay;
    private boolean disabled;
    private CrashlyticsExecutorServiceWrapper executorServiceWrapper;
    private CrashEventDataProvider externalCrashEventDataProvider;
    private CrashlyticsUncaughtExceptionHandler handler;
    private HttpRequestFactory httpRequestFactory;
    private File initializationMarkerFile;
    private String installerPackageName;
    private final Collection kits;
    private CrashlyticsListener listener;
    private String packageName;
    private final PinningInfoProvider pinningInfo;
    private final long startTime;
    private String userEmail;
    private String userId;
    private String userName;
    private String versionCode;
    private String versionName;

    public Crashlytics()
    {
        this(1.0F, null, null, false);
    }

    Crashlytics(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag)
    {
        this(f, crashlyticslistener, pinninginfoprovider, flag, ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler"));
    }

    Crashlytics(float f, CrashlyticsListener crashlyticslistener, PinningInfoProvider pinninginfoprovider, boolean flag, ExecutorService executorservice)
    {
        userId = null;
        userEmail = null;
        userName = null;
        attributes = new ConcurrentHashMap();
        startTime = System.currentTimeMillis();
        delay = f;
        listener = crashlyticslistener;
        pinningInfo = pinninginfoprovider;
        disabled = flag;
        executorServiceWrapper = new CrashlyticsExecutorServiceWrapper(executorservice);
        kits = Collections.unmodifiableCollection(Arrays.asList(new Kit[] {
            new Answers(), new Beta()
        }));
    }

    private int dipsToPixels(float f, int i)
    {
        return (int)((float)i * f);
    }

    private static void doLog(int i, String s, String s1)
    {
        Crashlytics crashlytics;
        if (!isDisabled())
        {
            if (ensureFabricWithCalled("prior to logging messages.", crashlytics = getInstance()))
            {
                long l = System.currentTimeMillis();
                long l1 = crashlytics.startTime;
                crashlytics.handler.writeToLog(l - l1, formatLogMessage(i, s, s1));
                return;
            }
        }
    }

    private static boolean ensureFabricWithCalled(String s, Crashlytics crashlytics)
    {
        if (crashlytics == null || crashlytics.handler == null)
        {
            Fabric.getLogger().e("Fabric", (new StringBuilder()).append("Crashlytics must be initialized by calling Fabric.with(Context) ").append(s).toString(), null);
            return false;
        } else
        {
            return true;
        }
    }

    private void finishInitSynchronously()
    {
        Object obj = new PriorityCallable() {

            final Crashlytics this$0;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                return doInBackground();
            }

            public Priority getPriority()
            {
                return Priority.IMMEDIATE;
            }

            
            {
                this$0 = Crashlytics.this;
                super();
            }
        };
        for (Iterator iterator = getDependencies().iterator(); iterator.hasNext(); ((PriorityCallable) (obj)).addDependency((Task)iterator.next())) { }
        obj = getFabric().getExecutorService().submit(((Callable) (obj)));
        Fabric.getLogger().d("Fabric", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try
        {
            ((Future) (obj)).get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Fabric.getLogger().e("Fabric", "Crashlytics was interrupted during initialization.", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            Fabric.getLogger().e("Fabric", "Problem encountered during Crashlytics initialization.", executionexception);
            return;
        }
        catch (TimeoutException timeoutexception)
        {
            Fabric.getLogger().e("Fabric", "Crashlytics timed out during initialization.", timeoutexception);
        }
    }

    private static String formatLogMessage(int i, String s, String s1)
    {
        return (new StringBuilder()).append(CommonUtils.logPriorityToString(i)).append("/").append(s).append(" ").append(s1).toString();
    }

    public static Crashlytics getInstance()
    {
        Crashlytics crashlytics;
        try
        {
            crashlytics = (Crashlytics)Fabric.getKit(com/crashlytics/android/Crashlytics);
        }
        catch (IllegalStateException illegalstateexception)
        {
            Fabric.getLogger().e("Fabric", "Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()", null);
            throw illegalstateexception;
        }
        return crashlytics;
    }

    public static PinningInfoProvider getPinningInfoProvider()
    {
        if (!isDisabled())
        {
            return getInstance().pinningInfo;
        } else
        {
            return null;
        }
    }

    private boolean getSendDecisionFromUser(final Activity activity, final PromptSettingsData promptData)
    {
        final DialogStringResolver stringResolver = new DialogStringResolver(activity, promptData);
        final OptInLatch latch = new OptInLatch();
        activity.runOnUiThread(new Runnable() {

            final Crashlytics this$0;
            final Activity val$activity;
            final OptInLatch val$latch;
            final PromptSettingsData val$promptData;
            final DialogStringResolver val$stringResolver;

            public void run()
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
                android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

                    final _cls7 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        latch.setOptIn(true);
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                };
                float f = activity.getResources().getDisplayMetrics().density;
                int i = dipsToPixels(f, 5);
                TextView textview = new TextView(activity);
                textview.setAutoLinkMask(15);
                textview.setText(stringResolver.getMessage());
                textview.setTextAppearance(activity, 0x1030044);
                textview.setPadding(i, i, i, i);
                textview.setFocusable(false);
                ScrollView scrollview = new ScrollView(activity);
                scrollview.setPadding(dipsToPixels(f, 14), dipsToPixels(f, 2), dipsToPixels(f, 10), dipsToPixels(f, 12));
                scrollview.addView(textview);
                builder.setView(scrollview).setTitle(stringResolver.getTitle()).setCancelable(false).setNeutralButton(stringResolver.getSendButtonTitle(), onclicklistener);
                if (promptData.showCancelButton)
                {
                    android.content.DialogInterface.OnClickListener onclicklistener1 = new android.content.DialogInterface.OnClickListener() {

                        final _cls7 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            latch.setOptIn(false);
                            dialoginterface.dismiss();
                        }

            
            {
                this$1 = _cls7.this;
                super();
            }
                    };
                    builder.setNegativeButton(stringResolver.getCancelButtonTitle(), onclicklistener1);
                }
                if (promptData.showAlwaysSendButton)
                {
                    android.content.DialogInterface.OnClickListener onclicklistener2 = new android.content.DialogInterface.OnClickListener() {

                        final _cls7 this$1;

                        public void onClick(DialogInterface dialoginterface, int i)
                        {
                            setShouldSendUserReportsWithoutPrompting(true);
                            latch.setOptIn(true);
                            dialoginterface.dismiss();
                        }

            
            {
                this$1 = _cls7.this;
                super();
            }
                    };
                    builder.setPositiveButton(stringResolver.getAlwaysSendButtonTitle(), onclicklistener2);
                }
                builder.show();
            }

            
            {
                this$0 = Crashlytics.this;
                activity = activity1;
                latch = optinlatch;
                stringResolver = dialogstringresolver;
                promptData = promptsettingsdata;
                super();
            }
        });
        Fabric.getLogger().d("Fabric", "Waiting for user opt-in.");
        latch.await();
        return latch.getOptIn();
    }

    private static boolean isDisabled()
    {
        Crashlytics crashlytics = getInstance();
        return crashlytics == null || crashlytics.disabled;
    }

    private boolean isRequiringBuildId(Context context)
    {
        return CommonUtils.getBooleanResourceValue(context, "com.crashlytics.RequireBuildId", true);
    }

    public static void log(int i, String s, String s1)
    {
        doLog(i, s, s1);
        Fabric.getLogger().log(i, (new StringBuilder()).append("").append(s).toString(), (new StringBuilder()).append("").append(s1).toString(), true);
    }

    public static void log(String s)
    {
        doLog(3, "Fabric", s);
    }

    public static void logException(Throwable throwable)
    {
        Crashlytics crashlytics;
        if (!isDisabled())
        {
            if (ensureFabricWithCalled("prior to logging exceptions.", crashlytics = getInstance()))
            {
                if (throwable == null)
                {
                    Fabric.getLogger().log(5, "Fabric", "Crashlytics is ignoring a request to log a null exception.");
                    return;
                } else
                {
                    crashlytics.handler.writeNonFatalException(Thread.currentThread(), throwable);
                    return;
                }
            }
        }
    }

    static void recordFatalExceptionEvent(String s)
    {
        Answers answers = (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
        if (answers != null)
        {
            answers.onException(new io.fabric.sdk.android.services.common.Crash.FatalException(s));
        }
    }

    static void recordLoggedExceptionEvent(String s)
    {
        Answers answers = (Answers)Fabric.getKit(com/crashlytics/android/answers/Answers);
        if (answers != null)
        {
            answers.onException(new io.fabric.sdk.android.services.common.Crash.LoggedException(s));
        }
    }

    private static String sanitizeAttribute(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s = s.trim();
            s1 = s;
            if (s.length() > 1024)
            {
                s1 = s.substring(0, 1024);
            }
        }
        return s1;
    }

    private void setAndValidateKitProperties(Context context, String s)
    {
        Object obj;
        if (pinningInfo != null)
        {
            obj = new CrashlyticsPinningInfoProvider(pinningInfo);
        } else
        {
            obj = null;
        }
        httpRequestFactory = new DefaultHttpRequestFactory(Fabric.getLogger());
        httpRequestFactory.setPinningInfoProvider(((io.fabric.sdk.android.services.network.PinningInfoProvider) (obj)));
        packageName = context.getPackageName();
        installerPackageName = getIdManager().getInstallerPackageName();
        Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Installer package name is: ").append(installerPackageName).toString());
        obj = context.getPackageManager().getPackageInfo(packageName, 0);
        versionCode = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        obj = "0.0";
_L1:
        try
        {
            versionName = ((String) (obj));
            buildId = CommonUtils.resolveBuildId(context);
        }
        catch (Exception exception)
        {
            Fabric.getLogger().e("Fabric", "Error setting up app properties", exception);
        }
        getIdManager().getBluetoothMacAddress();
        getBuildIdValidator(buildId, isRequiringBuildId(context)).validate(s, packageName);
        return;
        obj = ((PackageInfo) (obj)).versionName;
          goto _L1
    }

    public static void setBool(String s, boolean flag)
    {
        setString(s, Boolean.toString(flag));
    }

    public static void setDouble(String s, double d)
    {
        setString(s, Double.toString(d));
    }

    public static void setFloat(String s, float f)
    {
        setString(s, Float.toString(f));
    }

    public static void setInt(String s, int i)
    {
        setString(s, Integer.toString(i));
    }

    public static void setLong(String s, long l)
    {
        setString(s, Long.toString(l));
    }

    public static void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
    {
        Fabric.getLogger().w("Fabric", "Use of Crashlytics.setPinningInfoProvider is deprecated");
    }

    public static void setString(String s, String s1)
    {
        if (isDisabled())
        {
            return;
        }
        if (s == null)
        {
            if (getInstance().getContext() != null && CommonUtils.isAppDebuggable(getInstance().getContext()))
            {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            } else
            {
                Fabric.getLogger().e("Fabric", "Attempting to set custom attribute with null key, ignoring.", null);
                return;
            }
        }
        String s2 = sanitizeAttribute(s);
        if (getInstance().attributes.size() < 64 || getInstance().attributes.containsKey(s2))
        {
            if (s1 == null)
            {
                s = "";
            } else
            {
                s = sanitizeAttribute(s1);
            }
            getInstance().attributes.put(s2, s);
            return;
        } else
        {
            Fabric.getLogger().d("Fabric", "Exceeded maximum number of custom attributes (64)");
            return;
        }
    }

    public static void setUserEmail(String s)
    {
        if (isDisabled())
        {
            return;
        } else
        {
            getInstance().userEmail = sanitizeAttribute(s);
            return;
        }
    }

    public static void setUserIdentifier(String s)
    {
        if (isDisabled())
        {
            return;
        } else
        {
            getInstance().userId = sanitizeAttribute(s);
            return;
        }
    }

    public static void setUserName(String s)
    {
        if (isDisabled())
        {
            return;
        } else
        {
            getInstance().userName = sanitizeAttribute(s);
            return;
        }
    }

    boolean canSendWithUserApproval()
    {
        return ((Boolean)Settings.getInstance().withSettings(new io.fabric.sdk.android.services.settings.Settings.SettingsAccess() {

            final Crashlytics this$0;

            public Boolean usingSettings(SettingsData settingsdata)
            {
                boolean flag1 = true;
                Activity activity = getFabric().getCurrentActivity();
                boolean flag = flag1;
                if (activity != null)
                {
                    flag = flag1;
                    if (!activity.isFinishing())
                    {
                        flag = flag1;
                        if (shouldPromptUserBeforeSendingCrashReports())
                        {
                            flag = getSendDecisionFromUser(activity, settingsdata.promptData);
                        }
                    }
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object usingSettings(SettingsData settingsdata)
            {
                return usingSettings(settingsdata);
            }

            
            {
                this$0 = Crashlytics.this;
                super();
            }
        }, Boolean.valueOf(true))).booleanValue();
    }

    public void crash()
    {
        (new CrashTest()).indexOutOfBounds();
    }

    boolean didPreviousInitializationComplete()
    {
        return ((Boolean)executorServiceWrapper.executeSyncLoggingException(new Callable() {

            final Crashlytics this$0;

            public Boolean call()
                throws Exception
            {
                return Boolean.valueOf(initializationMarkerFile.exists());
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = Crashlytics.this;
                super();
            }
        })).booleanValue();
    }

    protected volatile Object doInBackground()
    {
        return doInBackground();
    }

    protected Void doInBackground()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        markInitializationStarted();
        handler.cleanInvalidTempFiles();
        flag2 = true;
        flag1 = true;
        flag = flag2;
        Object obj = Settings.getInstance().awaitSettingsData();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        flag = flag2;
        Fabric.getLogger().w("Fabric", "Received null settings, skipping initialization!");
        markInitializationComplete();
        return null;
        flag = flag2;
        if (!((SettingsData) (obj)).featuresData.collectReports) goto _L2; else goto _L1
_L1:
        flag2 = false;
        flag1 = false;
        flag = flag2;
        handler.finalizeSessions();
        flag = flag2;
        obj = getCreateReportSpiCall(((SettingsData) (obj)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag2;
        (new ReportUploader(((CreateReportSpiCall) (obj)))).uploadReports(delay);
_L2:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        Fabric.getLogger().d("Fabric", "Crash reporting disabled.");
        markInitializationComplete();
        return null;
_L4:
        flag = flag2;
        Fabric.getLogger().w("Fabric", "Unable to create a call to upload reports.");
          goto _L2
        Object obj1;
        obj1;
        Fabric.getLogger().e("Fabric", "Error dealing with settings", ((Throwable) (obj1)));
        flag1 = flag;
          goto _L2
        obj1;
        Fabric.getLogger().e("Fabric", "Problem encountered during Crashlytics initialization.", ((Throwable) (obj1)));
        markInitializationComplete();
        return null;
        obj1;
        markInitializationComplete();
        throw obj1;
    }

    Map getAttributes()
    {
        return Collections.unmodifiableMap(attributes);
    }

    String getBuildId()
    {
        return buildId;
    }

    BuildIdValidator getBuildIdValidator(String s, boolean flag)
    {
        return new BuildIdValidator(s, flag);
    }

    CreateReportSpiCall getCreateReportSpiCall(SettingsData settingsdata)
    {
        if (settingsdata != null)
        {
            return new DefaultCreateReportSpiCall(this, getOverridenSpiEndpoint(), settingsdata.appData.reportsUrl, httpRequestFactory);
        } else
        {
            return null;
        }
    }

    public boolean getDebugMode()
    {
        Fabric.getLogger().w("Fabric", "Use of Crashlytics.getDebugMode is deprecated.");
        getFabric();
        return Fabric.isDebuggable();
    }

    SessionEventData getExternalCrashEventData()
    {
        SessionEventData sessioneventdata = null;
        if (externalCrashEventDataProvider != null)
        {
            sessioneventdata = externalCrashEventDataProvider.getCrashEventData();
        }
        return sessioneventdata;
    }

    CrashlyticsUncaughtExceptionHandler getHandler()
    {
        return handler;
    }

    public String getIdentifier()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    String getInstallerPackageName()
    {
        return installerPackageName;
    }

    public Collection getKits()
    {
        return kits;
    }

    String getOverridenSpiEndpoint()
    {
        return CommonUtils.getStringsFileValue(getInstance().getContext(), "com.crashlytics.ApiEndpoint");
    }

    String getPackageName()
    {
        return packageName;
    }

    File getSdkDirectory()
    {
        return (new FileStoreImpl(this)).getFilesDir();
    }

    SessionSettingsData getSessionSettingsData()
    {
        SettingsData settingsdata = Settings.getInstance().awaitSettingsData();
        if (settingsdata == null)
        {
            return null;
        } else
        {
            return settingsdata.sessionData;
        }
    }

    String getUserEmail()
    {
        if (getIdManager().canCollectUserIds())
        {
            return userEmail;
        } else
        {
            return null;
        }
    }

    String getUserIdentifier()
    {
        if (getIdManager().canCollectUserIds())
        {
            return userId;
        } else
        {
            return null;
        }
    }

    String getUserName()
    {
        if (getIdManager().canCollectUserIds())
        {
            return userName;
        } else
        {
            return null;
        }
    }

    public String getVersion()
    {
        return "2.2.3.41";
    }

    String getVersionCode()
    {
        return versionCode;
    }

    String getVersionName()
    {
        return versionName;
    }

    boolean internalVerifyPinning(URL url)
    {
        boolean flag = false;
        if (getPinningInfoProvider() != null)
        {
            url = httpRequestFactory.buildHttpRequest(HttpMethod.GET, url.toString());
            ((HttpsURLConnection)url.getConnection()).setInstanceFollowRedirects(false);
            url.code();
            flag = true;
        }
        return flag;
    }

    void markInitializationComplete()
    {
        executorServiceWrapper.executeAsync(new Callable() {

            final Crashlytics this$0;

            public Boolean call()
                throws Exception
            {
                boolean flag;
                try
                {
                    flag = initializationMarkerFile.delete();
                    Fabric.getLogger().d("Fabric", (new StringBuilder()).append("Initialization marker file removed: ").append(flag).toString());
                }
                catch (Exception exception)
                {
                    Fabric.getLogger().e("Fabric", "Problem encountered deleting Crashlytics initialization marker.", exception);
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = Crashlytics.this;
                super();
            }
        });
    }

    void markInitializationStarted()
    {
        executorServiceWrapper.executeSyncLoggingException(new Callable() {

            final Crashlytics this$0;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                initializationMarkerFile.createNewFile();
                Fabric.getLogger().d("Fabric", "Initialization marker file created.");
                return null;
            }

            
            {
                this$0 = Crashlytics.this;
                super();
            }
        });
    }

    protected boolean onPreExecute()
    {
        return onPreExecute(super.getContext());
    }

    boolean onPreExecute(Context context)
    {
        if (disabled)
        {
            return false;
        }
        Object obj = (new ApiKey()).getValue(context);
        if (obj == null)
        {
            return false;
        }
        Fabric.getLogger().i("Fabric", (new StringBuilder()).append("Initializing Crashlytics ").append(getVersion()).toString());
        initializationMarkerFile = new File(getSdkDirectory(), "initialization_marker");
        boolean flag1 = false;
        Exception exception;
        boolean flag;
        try
        {
            setAndValidateKitProperties(context, ((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new UnmetDependencyException(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Fabric.getLogger().e("Fabric", "Crashlytics was not started due to an exception during initialization", context);
            return false;
        }
        flag = flag1;
        obj = new SessionDataWriter(getContext(), buildId, getPackageName());
        flag = flag1;
        Fabric.getLogger().d("Fabric", "Installing exception handler...");
        flag = flag1;
        handler = new CrashlyticsUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler(), listener, executorServiceWrapper, getIdManager(), ((SessionDataWriter) (obj)), this);
        flag = flag1;
        flag1 = didPreviousInitializationComplete();
        flag = flag1;
        handler.ensureOpenSessionExists();
        flag = flag1;
        Thread.setDefaultUncaughtExceptionHandler(handler);
        flag = flag1;
        Fabric.getLogger().d("Fabric", "Successfully installed exception handler.");
        flag = flag1;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!CommonUtils.canTryConnection(context))
        {
            break; /* Loop/switch isn't completed */
        }
        finishInitSynchronously();
        return false;
        exception;
        Fabric.getLogger().e("Fabric", "There was a problem installing the exception handler.", exception);
        if (true) goto _L2; else goto _L1
_L1:
        return true;
    }

    public void setDebugMode(boolean flag)
    {
        Fabric.getLogger().w("Fabric", "Use of Crashlytics.setDebugMode is deprecated.");
    }

    void setExternalCrashEventDataProvider(CrashEventDataProvider crasheventdataprovider)
    {
        externalCrashEventDataProvider = crasheventdataprovider;
    }

    public void setListener(CrashlyticsListener crashlyticslistener)
    {
        this;
        JVM INSTR monitorenter ;
        Fabric.getLogger().w("Fabric", "Use of Crashlytics.setListener is deprecated.");
        if (crashlyticslistener != null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        throw new IllegalArgumentException("listener must not be null.");
        crashlyticslistener;
        this;
        JVM INSTR monitorexit ;
        throw crashlyticslistener;
        listener = crashlyticslistener;
        this;
        JVM INSTR monitorexit ;
    }

    void setShouldSendUserReportsWithoutPrompting(boolean flag)
    {
        PreferenceStoreImpl preferencestoreimpl = new PreferenceStoreImpl(this);
        preferencestoreimpl.save(preferencestoreimpl.edit().putBoolean("always_send_reports_opt_in", flag));
    }

    boolean shouldPromptUserBeforeSendingCrashReports()
    {
        return ((Boolean)Settings.getInstance().withSettings(new io.fabric.sdk.android.services.settings.Settings.SettingsAccess() {

            final Crashlytics this$0;

            public Boolean usingSettings(SettingsData settingsdata)
            {
                boolean flag = false;
                if (settingsdata.featuresData.promptEnabled)
                {
                    if (!shouldSendReportsWithoutPrompting())
                    {
                        flag = true;
                    }
                    return Boolean.valueOf(flag);
                } else
                {
                    return Boolean.valueOf(false);
                }
            }

            public volatile Object usingSettings(SettingsData settingsdata)
            {
                return usingSettings(settingsdata);
            }

            
            {
                this$0 = Crashlytics.this;
                super();
            }
        }, Boolean.valueOf(false))).booleanValue();
    }

    boolean shouldSendReportsWithoutPrompting()
    {
        return (new PreferenceStoreImpl(this)).get().getBoolean("always_send_reports_opt_in", false);
    }

    public boolean verifyPinning(URL url)
    {
        boolean flag;
        try
        {
            flag = internalVerifyPinning(url);
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            Fabric.getLogger().e("Fabric", "Could not verify SSL pinning", url);
            return false;
        }
        return flag;
    }



}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppEventsLoggerUtility;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            LoggingBehavior, FacebookException, GraphResponse, FacebookRequestError, 
//            GraphRequest, GraphRequestBatch, AccessTokenManager, ProfileManager, 
//            AccessToken, Profile

public final class FacebookSdk
{
    public static interface InitializeCallback
    {

        public abstract void onInitialized();
    }


    public static final String APPLICATION_ID_PROPERTY = "com.facebook.sdk.ApplicationId";
    public static final String APPLICATION_NAME_PROPERTY = "com.facebook.sdk.ApplicationName";
    private static final String ATTRIBUTION_PREFERENCES = "com.facebook.sdk.attributionTracking";
    static final String CALLBACK_OFFSET_CHANGED_AFTER_INIT = "The callback request code offset can't be updated once the SDK is initialized.";
    static final String CALLBACK_OFFSET_NEGATIVE = "The callback request code offset can't be negative.";
    public static final String CLIENT_TOKEN_PROPERTY = "com.facebook.sdk.ClientToken";
    private static final int DEFAULT_CORE_POOL_SIZE = 5;
    private static final int DEFAULT_KEEP_ALIVE = 1;
    private static final int DEFAULT_MAXIMUM_POOL_SIZE = 128;
    private static final ThreadFactory DEFAULT_THREAD_FACTORY = new ThreadFactory() {

        private final AtomicInteger counter = new AtomicInteger(0);

        public Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder()).append("FacebookSdk #").append(counter.incrementAndGet()).toString());
        }

    };
    private static final BlockingQueue DEFAULT_WORK_QUEUE = new LinkedBlockingQueue(10);
    private static final String FACEBOOK_COM = "facebook.com";
    private static final Object LOCK = new Object();
    private static final int MAX_REQUEST_CODE_RANGE = 100;
    private static final String PUBLISH_ACTIVITY_PATH = "%s/activities";
    private static final String TAG = com/facebook/FacebookSdk.getCanonicalName();
    public static final String WEB_DIALOG_THEME = "com.facebook.sdk.WebDialogTheme";
    private static volatile String appClientToken;
    private static Context applicationContext;
    private static volatile String applicationId;
    private static volatile String applicationName;
    private static LockOnGetVariable cacheDir;
    private static int callbackRequestCodeOffset = 64206;
    private static volatile Executor executor;
    private static volatile String facebookDomain = "facebook.com";
    private static volatile boolean isDebugEnabled = false;
    private static boolean isLegacyTokenUpgradeSupported = false;
    private static final HashSet loggingBehaviors;
    private static AtomicLong onProgressThreshold = new AtomicLong(0x10000L);
    private static Boolean sdkInitialized = Boolean.valueOf(false);
    private static volatile int webDialogTheme;

    public FacebookSdk()
    {
    }

    public static void addLoggingBehavior(LoggingBehavior loggingbehavior)
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.add(loggingbehavior);
            updateGraphDebugBehavior();
        }
        return;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    public static void clearLoggingBehaviors()
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.clear();
        }
        return;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Context getApplicationContext()
    {
        Validate.sdkInitialized();
        return applicationContext;
    }

    public static String getApplicationId()
    {
        Validate.sdkInitialized();
        return applicationId;
    }

    public static String getApplicationName()
    {
        Validate.sdkInitialized();
        return applicationName;
    }

    public static String getApplicationSignature(Context context)
    {
        Validate.sdkInitialized();
        PackageManager packagemanager;
        if (context != null)
        {
            if ((packagemanager = context.getPackageManager()) != null)
            {
                context = context.getPackageName();
                Signature asignature[];
                try
                {
                    context = packagemanager.getPackageInfo(context, 64);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return null;
                }
                asignature = ((PackageInfo) (context)).signatures;
                if (asignature != null && asignature.length != 0)
                {
                    MessageDigest messagedigest;
                    try
                    {
                        messagedigest = MessageDigest.getInstance("SHA-1");
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        return null;
                    }
                    messagedigest.update(((PackageInfo) (context)).signatures[0].toByteArray());
                    return Base64.encodeToString(messagedigest.digest(), 9);
                }
            }
        }
        return null;
    }

    public static File getCacheDir()
    {
        Validate.sdkInitialized();
        return (File)cacheDir.getValue();
    }

    public static int getCallbackRequestCodeOffset()
    {
        Validate.sdkInitialized();
        return callbackRequestCodeOffset;
    }

    public static String getClientToken()
    {
        Validate.sdkInitialized();
        return appClientToken;
    }

    public static Executor getExecutor()
    {
        synchronized (LOCK)
        {
            if (executor == null)
            {
                executor = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return executor;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String getFacebookDomain()
    {
        return facebookDomain;
    }

    public static boolean getLimitEventAndDataUsage(Context context)
    {
        Validate.sdkInitialized();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static Set getLoggingBehaviors()
    {
        Set set;
        synchronized (loggingBehaviors)
        {
            set = Collections.unmodifiableSet(new HashSet(loggingBehaviors));
        }
        return set;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static long getOnProgressThreshold()
    {
        Validate.sdkInitialized();
        return onProgressThreshold.get();
    }

    public static String getSdkVersion()
    {
        return "4.7.0";
    }

    public static int getWebDialogTheme()
    {
        Validate.sdkInitialized();
        return webDialogTheme;
    }

    public static boolean isDebugEnabled()
    {
        return isDebugEnabled;
    }

    public static boolean isFacebookRequestCode(int i)
    {
        return i >= callbackRequestCodeOffset && i < callbackRequestCodeOffset + 100;
    }

    public static boolean isInitialized()
    {
        com/facebook/FacebookSdk;
        JVM INSTR monitorenter ;
        boolean flag = sdkInitialized.booleanValue();
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean isLegacyTokenUpgradeSupported()
    {
        return isLegacyTokenUpgradeSupported;
    }

    public static boolean isLoggingBehaviorEnabled(LoggingBehavior loggingbehavior)
    {
        HashSet hashset = loggingBehaviors;
        hashset;
        JVM INSTR monitorenter ;
        boolean flag;
        if (isDebugEnabled() && loggingBehaviors.contains(loggingbehavior))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hashset;
        JVM INSTR monitorexit ;
        return flag;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    static void loadDefaultsFromMetadata(Context context)
    {
        if (context != null)
        {
            try
            {
                context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
            if (context != null && ((ApplicationInfo) (context)).metaData != null)
            {
                if (applicationId == null)
                {
                    Object obj = ((ApplicationInfo) (context)).metaData.get("com.facebook.sdk.ApplicationId");
                    if (obj instanceof String)
                    {
                        obj = (String)obj;
                        if (((String) (obj)).toLowerCase(Locale.ROOT).startsWith("fb"))
                        {
                            applicationId = ((String) (obj)).substring(2);
                        } else
                        {
                            applicationId = ((String) (obj));
                        }
                    } else
                    if (obj instanceof Integer)
                    {
                        throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                    }
                }
                if (applicationName == null)
                {
                    applicationName = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ApplicationName");
                }
                if (appClientToken == null)
                {
                    appClientToken = ((ApplicationInfo) (context)).metaData.getString("com.facebook.sdk.ClientToken");
                }
                if (webDialogTheme == 0)
                {
                    setWebDialogTheme(((ApplicationInfo) (context)).metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                    return;
                }
            }
        }
    }

    static GraphResponse publishInstallAndWaitForResponse(Context context, String s)
    {
        if (context == null || s == null)
        {
            try
            {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Utility.logd("Facebook-publish", context);
            }
            return new GraphResponse(null, null, new FacebookRequestError(null, context));
        }
        String s1;
        String s2;
        SharedPreferences sharedpreferences;
        String s3;
        AttributionIdentifiers attributionidentifiers;
        long l;
        attributionidentifiers = AttributionIdentifiers.getAttributionIdentifiers(context);
        sharedpreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
        s1 = (new StringBuilder()).append(s).append("ping").toString();
        s2 = (new StringBuilder()).append(s).append("json").toString();
        l = sharedpreferences.getLong(s1, 0L);
        s3 = sharedpreferences.getString(s2, null);
        context = AppEventsLoggerUtility.getJSONObjectForGraphAPICall(com.facebook.internal.AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, attributionidentifiers, AppEventsLogger.getAnonymousAppDeviceGUID(context), getLimitEventAndDataUsage(context), context);
        s = GraphRequest.newPostRequest(null, String.format("%s/activities", new Object[] {
            s
        }), context, null);
        if (l == 0L) goto _L2; else goto _L1
_L1:
        if (s3 == null) goto _L4; else goto _L3
_L3:
        context = new JSONObject(s3);
_L6:
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        return (GraphResponse)GraphResponse.createResponsesFromString("true", null, new GraphRequestBatch(new GraphRequest[] {
            s
        })).get(0);
        context;
        throw new FacebookException("An error occurred while publishing install.", context);
        return new GraphResponse(null, null, null, context);
_L2:
        context = s.executeAndWait();
        s = sharedpreferences.edit();
        s.putLong(s1, System.currentTimeMillis());
        if (context.getJSONObject() != null)
        {
            s.putString(s2, context.getJSONObject().toString());
        }
        s.apply();
        return context;
_L4:
        context = null;
        continue; /* Loop/switch isn't completed */
        context;
        context = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void publishInstallAsync(Context context, String s)
    {
        context = context.getApplicationContext();
        getExecutor().execute(new Runnable(context, s) {

            final Context val$applicationContext;
            final String val$applicationId;

            public void run()
            {
                FacebookSdk.publishInstallAndWaitForResponse(applicationContext, applicationId);
            }

            
            {
                applicationContext = context;
                applicationId = s;
                super();
            }
        });
    }

    public static void removeLoggingBehavior(LoggingBehavior loggingbehavior)
    {
        synchronized (loggingBehaviors)
        {
            loggingBehaviors.remove(loggingbehavior);
        }
        return;
        loggingbehavior;
        hashset;
        JVM INSTR monitorexit ;
        throw loggingbehavior;
    }

    public static void sdkInitialize(Context context)
    {
        com/facebook/FacebookSdk;
        JVM INSTR monitorenter ;
        sdkInitialize(context, ((InitializeCallback) (null)));
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void sdkInitialize(Context context, int i)
    {
        com/facebook/FacebookSdk;
        JVM INSTR monitorenter ;
        sdkInitialize(context, i, null);
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void sdkInitialize(Context context, int i, InitializeCallback initializecallback)
    {
        com/facebook/FacebookSdk;
        JVM INSTR monitorenter ;
        if (sdkInitialized.booleanValue() && i != callbackRequestCodeOffset)
        {
            throw new FacebookException("The callback request code offset can't be updated once the SDK is initialized.");
        }
        break MISSING_BLOCK_LABEL_35;
        context;
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
        throw context;
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        throw new FacebookException("The callback request code offset can't be negative.");
        callbackRequestCodeOffset = i;
        sdkInitialize(context);
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
    }

    public static void sdkInitialize(Context context, InitializeCallback initializecallback)
    {
        com/facebook/FacebookSdk;
        JVM INSTR monitorenter ;
        if (!sdkInitialized.booleanValue()) goto _L2; else goto _L1
_L1:
        if (initializecallback == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        initializecallback.onInitialized();
_L4:
        com/facebook/FacebookSdk;
        JVM INSTR monitorexit ;
        return;
_L2:
        Validate.notNull(context, "applicationContext");
        Validate.hasFacebookActivity(context, false);
        Validate.hasInternetPermissions(context, false);
        applicationContext = context.getApplicationContext();
        loadDefaultsFromMetadata(applicationContext);
        Utility.loadAppSettingsAsync(applicationContext, applicationId);
        NativeProtocol.updateAllAvailableProtocolVersionsAsync();
        BoltsMeasurementEventListener.getInstance(applicationContext);
        cacheDir = new LockOnGetVariable(new Callable() {

            public File call()
                throws Exception
            {
                return FacebookSdk.applicationContext.getCacheDir();
            }

            public volatile Object call()
                throws Exception
            {
                return call();
            }

        });
        context = new FutureTask(new Callable(initializecallback) {

            final InitializeCallback val$callback;

            public volatile Object call()
                throws Exception
            {
                return call();
            }

            public Void call()
                throws Exception
            {
                AccessTokenManager.getInstance().loadCurrentAccessToken();
                ProfileManager.getInstance().loadCurrentProfile();
                if (AccessToken.getCurrentAccessToken() != null && Profile.getCurrentProfile() == null)
                {
                    Profile.fetchProfileForCurrentAccessToken();
                }
                if (callback != null)
                {
                    callback.onInitialized();
                }
                return null;
            }

            
            {
                callback = initializecallback;
                super();
            }
        });
        getExecutor().execute(context);
        sdkInitialized = Boolean.valueOf(true);
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    public static void setApplicationId(String s)
    {
        applicationId = s;
    }

    public static void setApplicationName(String s)
    {
        applicationName = s;
    }

    public static void setCacheDir(File file)
    {
        cacheDir = new LockOnGetVariable(file);
    }

    public static void setClientToken(String s)
    {
        appClientToken = s;
    }

    public static void setExecutor(Executor executor1)
    {
        Validate.notNull(executor1, "executor");
        synchronized (LOCK)
        {
            executor = executor1;
        }
        return;
        executor1;
        obj;
        JVM INSTR monitorexit ;
        throw executor1;
    }

    public static void setFacebookDomain(String s)
    {
        Log.w(TAG, "WARNING: Calling setFacebookDomain from non-DEBUG code.");
        facebookDomain = s;
    }

    public static void setIsDebugEnabled(boolean flag)
    {
        isDebugEnabled = flag;
    }

    public static void setLegacyTokenUpgradeSupported(boolean flag)
    {
        isLegacyTokenUpgradeSupported = flag;
    }

    public static void setLimitEventAndDataUsage(Context context, boolean flag)
    {
        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("limitEventUsage", flag).apply();
    }

    public static void setOnProgressThreshold(long l)
    {
        onProgressThreshold.set(l);
    }

    public static void setWebDialogTheme(int i)
    {
        webDialogTheme = i;
    }

    private static void updateGraphDebugBehavior()
    {
        if (loggingBehaviors.contains(LoggingBehavior.GRAPH_API_DEBUG_INFO) && !loggingBehaviors.contains(LoggingBehavior.GRAPH_API_DEBUG_WARNING))
        {
            loggingBehaviors.add(LoggingBehavior.GRAPH_API_DEBUG_WARNING);
        }
    }

    static 
    {
        loggingBehaviors = new HashSet(Arrays.asList(new LoggingBehavior[] {
            LoggingBehavior.DEVELOPER_ERRORS
        }));
    }

}

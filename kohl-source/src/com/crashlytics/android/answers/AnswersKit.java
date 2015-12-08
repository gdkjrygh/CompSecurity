// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.events.GZIPQueueFileEventStorage;
import io.fabric.sdk.android.services.network.DefaultHttpRequestFactory;
import io.fabric.sdk.android.services.persistence.FileStoreImpl;
import io.fabric.sdk.android.services.persistence.PreferenceStore;
import io.fabric.sdk.android.services.persistence.PreferenceStoreImpl;
import io.fabric.sdk.android.services.settings.FeaturesSettingsData;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.crashlytics.android.answers:
//            SessionAnalyticsFilesManager, SessionEventTransform, SessionEventMetadata, AutoSessionAnalyticsManager, 
//            SessionAnalyticsManager

abstract class AnswersKit extends Kit
{

    static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    static final long FIRST_LAUNCH_INTERVAL_IN_MS = 0x36ee80L;
    static final String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
    static final String SESSION_ANALYTICS_FILE_EXTENSION = ".tap";
    static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
    private static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
    public static final String TAG = "Answers";
    private long installedAt;
    private PreferenceStore preferenceStore;
    SessionAnalyticsManager sessionAnalyticsManager;
    private String versionCode;
    private String versionName;

    AnswersKit()
    {
    }

    private void initializeSessionAnalytics(Context context)
    {
        SessionAnalyticsFilesManager sessionanalyticsfilesmanager;
        Object obj;
        Object obj1;
        sessionanalyticsfilesmanager = new SessionAnalyticsFilesManager(context, new SessionEventTransform(), new SystemCurrentTimeProvider(), new GZIPQueueFileEventStorage(getContext(), getSdkDirectory(), "session_analytics.tap", "session_analytics_to_send"));
        Object obj2 = getIdManager();
        Object obj3 = ((IdManager) (obj2)).getDeviceIdentifiers();
        obj = context.getPackageName();
        obj1 = ((IdManager) (obj2)).getAppInstallIdentifier();
        String s = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.ANDROID_ID);
        String s1 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.ANDROID_ADVERTISING_ID);
        obj3 = (String)((Map) (obj3)).get(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType.FONT_TOKEN);
        String s2 = CommonUtils.resolveBuildId(context);
        String s3 = ((IdManager) (obj2)).getOsVersionString();
        obj2 = ((IdManager) (obj2)).getModelName();
        obj = new SessionEventMetadata(((String) (obj)), UUID.randomUUID().toString(), ((String) (obj1)), s, s1, ((String) (obj3)), s2, s3, ((String) (obj2)), versionCode, versionName);
        obj1 = (Application)getContext().getApplicationContext();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        sessionAnalyticsManager = AutoSessionAnalyticsManager.build(((Application) (obj1)), ((SessionEventMetadata) (obj)), sessionanalyticsfilesmanager, new DefaultHttpRequestFactory(Fabric.getLogger()));
_L2:
        if (isFirstLaunch(installedAt))
        {
            Fabric.getLogger().d("Answers", "First launch");
            sessionAnalyticsManager.onInstall();
            preferenceStore.save(preferenceStore.edit().putBoolean("analytics_launched", true));
            return;
        }
        break MISSING_BLOCK_LABEL_304;
        sessionAnalyticsManager = SessionAnalyticsManager.build(context, ((SessionEventMetadata) (obj)), sessionanalyticsfilesmanager, new DefaultHttpRequestFactory(Fabric.getLogger()));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        CommonUtils.logControlledError(context, "Crashlytics failed to initialize session analytics.", exception);
    }

    protected Boolean doInBackground()
    {
        Context context = getContext();
        initializeSessionAnalytics(context);
        SettingsData settingsdata;
        try
        {
            settingsdata = Settings.getInstance().awaitSettingsData();
        }
        catch (Exception exception)
        {
            Fabric.getLogger().e("Answers", "Error dealing with settings", exception);
            return Boolean.valueOf(false);
        }
        if (settingsdata != null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        return Boolean.valueOf(false);
        if (settingsdata.featuresData.collectAnalytics)
        {
            sessionAnalyticsManager.setAnalyticsSettingsData(settingsdata.analyticsSettingsData, getOverridenSpiEndpoint());
            return Boolean.valueOf(true);
        }
        CommonUtils.logControlled(context, "Disabling analytics collection based on settings flag value.");
        sessionAnalyticsManager.disable();
        return Boolean.valueOf(false);
    }

    protected volatile Object doInBackground()
    {
        return doInBackground();
    }

    boolean getAnalyticsLaunched()
    {
        return preferenceStore.get().getBoolean("analytics_launched", false);
    }

    public String getIdentifier()
    {
        return "com.crashlytics.sdk.android:answers";
    }

    String getOverridenSpiEndpoint()
    {
        return CommonUtils.getStringsFileValue(getContext(), "com.crashlytics.ApiEndpoint");
    }

    File getSdkDirectory()
    {
        return (new FileStoreImpl(this)).getFilesDir();
    }

    public String getVersion()
    {
        return "1.1.2.37";
    }

    boolean installedRecently(long l)
    {
        return System.currentTimeMillis() - l < 0x36ee80L;
    }

    boolean isFirstLaunch(long l)
    {
        return !getAnalyticsLaunched() && installedRecently(l);
    }

    void onCustom(String s, Map map)
    {
        if (sessionAnalyticsManager != null)
        {
            sessionAnalyticsManager.onCustom(s, map);
        }
    }

    public void onException(io.fabric.sdk.android.services.common.Crash.FatalException fatalexception)
    {
        if (sessionAnalyticsManager != null)
        {
            sessionAnalyticsManager.onCrash(fatalexception.getSessionId());
        }
    }

    public void onException(io.fabric.sdk.android.services.common.Crash.LoggedException loggedexception)
    {
        if (sessionAnalyticsManager != null)
        {
            sessionAnalyticsManager.onError(loggedexception.getSessionId());
        }
    }

    protected boolean onPreExecute()
    {
        Context context;
        PackageInfo packageinfo;
        preferenceStore = new PreferenceStoreImpl(this);
        context = getContext();
        packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        versionCode = Integer.toString(packageinfo.versionCode);
        String s;
        if (packageinfo.versionName == null)
        {
            s = "0.0";
        } else
        {
            try
            {
                s = packageinfo.versionName;
            }
            catch (Exception exception)
            {
                Fabric.getLogger().e("Answers", "Error setting up app properties", exception);
                return false;
            }
        }
        versionName = s;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            installedAt = packageinfo.firstInstallTime;
            break MISSING_BLOCK_LABEL_133;
        }
        installedAt = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
        return true;
    }

    void setAnalyticsManager(SessionAnalyticsManager sessionanalyticsmanager)
    {
        sessionAnalyticsManager = sessionanalyticsmanager;
    }
}

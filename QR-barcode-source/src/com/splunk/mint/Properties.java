// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            ExcludedUrls, BreadcrumbsLimited, ExtraData, EnumStateStatus, 
//            TransactionsDatabase, EnumActionType, Utils, UidManager, 
//            Logger, RemoteSettings, RemoteSettingsData, Mint, 
//            MintLogLevel

public class Properties
{
    public static class RemoteSettingsProps
    {

        protected static JSONObject devSettings = new JSONObject();
        protected static Integer eventLevel;
        protected static String hashCode = "none";
        protected static Integer logLevel;
        public static Boolean netMonitoringEnabled = Boolean.valueOf(true);
        protected static Integer sessionTime = Integer.valueOf(60);

        public static String toReadableFormat()
        {
            return (new StringBuilder()).append("loglevel: ").append(String.valueOf(logLevel)).append(" eventLevel: ").append(String.valueOf(eventLevel)).append(" netMonitoring: ").append(String.valueOf(netMonitoringEnabled)).append(" sessionTime: ").append(String.valueOf(sessionTime)).append(" devSettings: ").append(devSettings.toString()).append(" hashCode: ").append(hashCode).toString();
        }

        static 
        {
            logLevel = Integer.valueOf(Utils.convertLoggingLevelToInt(MintLogLevel.Verbose));
            eventLevel = Integer.valueOf(Utils.convertLoggingLevelToInt(MintLogLevel.Verbose));
        }

        public RemoteSettingsProps()
        {
        }
    }


    protected static String API_KEY = "unknown";
    protected static final String API_VERSION = "1";
    protected static String APP_PACKAGE = "unknown";
    protected static String APP_VERSIONCODE = "unknown";
    protected static String APP_VERSIONNAME = "unknown";
    protected static String CARRIER = "unknown";
    public static String CONNECTION = "NA";
    protected static String FILES_PATH = null;
    protected static boolean HAS_ROOT = false;
    protected static EnumStateStatus IS_GPS_ON;
    protected static String LOCALE = "unknown";
    protected static String LOG_FILTER = "";
    protected static int LOG_LINES = 0;
    protected static String OS_VERSION = "unknown";
    protected static String PHONE_BRAND = null;
    protected static String PHONE_MODEL = "unknown";
    public static final String REMOTEIP_PLACEHOLDER = "{%#@@#%}";
    public static final String REST_VERSION = "1.0";
    protected static final String SDK_PLATFORM = "Android";
    protected static final String SDK_VERSION = "4.0";
    protected static boolean SEND_LOG = false;
    public static String STATE = "NA";
    public static final String TAG = "Mint";
    protected static long TIMESTAMP = 0L;
    protected static String UID = "";
    protected static BreadcrumbsLimited breadcrumbs = new BreadcrumbsLimited();
    private static final String defaultExcludedUrls[] = {
        "splkmobile.com"
    };
    public static final ExcludedUrls excludedUrls = new ExcludedUrls(defaultExcludedUrls);
    protected static ExtraData extraData = new ExtraData();
    private static boolean initialized = false;
    public static boolean isKitKat = false;
    public static long lastPingTime = 0L;
    protected static boolean proxyEnabled = false;
    protected static boolean sendOnlyWiFi = false;
    protected static TransactionsDatabase transactionsDatabase = new TransactionsDatabase();
    protected static String userIdentifier = null;

    public Properties()
    {
    }

    protected static final String getSeparator(EnumActionType enumactiontype)
    {
        return (new StringBuilder()).append("{^1^").append(enumactiontype.toString()).append("^").append(Utils.getTime()).append("}").toString();
    }

    protected static void initialize(Context context)
    {
        if (!initialized)
        {
            UID = UidManager.getUid(context);
            RemoteSettingsData remotesettingsdata;
            try
            {
                PackageInfo packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                APP_VERSIONNAME = packageinfo.versionName;
                APP_VERSIONCODE = String.valueOf(packageinfo.versionCode);
                APP_PACKAGE = packageinfo.packageName;
            }
            catch (Exception exception)
            {
                Logger.logError("Error collecting information about the package!");
                if (Mint.DEBUG)
                {
                    exception.printStackTrace();
                }
            }
            PHONE_MODEL = Build.MODEL;
            PHONE_BRAND = Build.MANUFACTURER;
            OS_VERSION = android.os.Build.VERSION.RELEASE;
            HAS_ROOT = Utils.checkForRoot();
            isKitKat = Utils.isKitKat();
            if (breadcrumbs == null)
            {
                breadcrumbs = new BreadcrumbsLimited();
            }
            if (extraData == null)
            {
                extraData = new ExtraData();
            }
            if (transactionsDatabase == null)
            {
                transactionsDatabase = new TransactionsDatabase();
            }
            try
            {
                FILES_PATH = context.getFilesDir().getAbsolutePath();
            }
            catch (Exception exception1)
            {
                if (Mint.DEBUG)
                {
                    exception1.printStackTrace();
                }
            }
            Logger.logInfo((new StringBuilder()).append("Files Path set to: ").append(FILES_PATH).toString());
            remotesettingsdata = RemoteSettings.loadRemoteSettings(context);
            if (remotesettingsdata != null)
            {
                RemoteSettingsProps.logLevel = remotesettingsdata.logLevel;
                RemoteSettingsProps.eventLevel = remotesettingsdata.eventLevel;
                RemoteSettingsProps.netMonitoringEnabled = remotesettingsdata.netMonitoring;
                RemoteSettingsProps.sessionTime = remotesettingsdata.sessionTime;
                RemoteSettingsProps.hashCode = remotesettingsdata.hashCode;
                try
                {
                    RemoteSettingsProps.devSettings = new JSONObject(remotesettingsdata.devSettings);
                }
                catch (JSONException jsonexception)
                {
                    jsonexception.printStackTrace();
                }
            }
            initialized = true;
        }
        IS_GPS_ON = Utils.isGPSOn(context);
        LOCALE = Locale.getDefault().getCountry();
        CARRIER = Utils.getCarrier(context);
        context = Utils.getConnectionInfo(context);
        CONNECTION = (String)context.get("connection");
        STATE = (String)context.get("state");
    }

    public static boolean isPluginInitialized()
    {
        if (!initialized)
        {
            Logger.logWarning("Mint SDK is not initialized!");
        }
        return initialized;
    }

    static 
    {
        HAS_ROOT = false;
        SEND_LOG = false;
        LOG_LINES = 5000;
        IS_GPS_ON = EnumStateStatus.NA;
    }
}

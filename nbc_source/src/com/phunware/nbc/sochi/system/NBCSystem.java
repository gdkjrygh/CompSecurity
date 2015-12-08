// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.system;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.nbcsports.liveextra.ApplicationComponent;
import com.phunware.nbc.sochi.NBCSportsApplication;
import com.phunware.nbc.sochi.content.GeoRequestResponse;
import com.phunware.nbc.sochi.services.GeoTrackingService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.phunware.nbc.sochi.system:
//            AppSharedPreferences

public class NBCSystem
{

    public static final int ALERTS = 9;
    public static final String ALERT_TAG_DONT_MISS_24_7 = "dont_miss_24_7";
    public static final String ALERT_TAG_DONT_MISS_9_11 = "dont_miss_9_11_ET";
    public static final String ALERT_TAG_FULL_EVENT_24_7 = "full_event_24_7";
    public static final String ALERT_TAG_FULL_EVENT_9_11 = "full_event_9_11_ET";
    public static final String ALERT_TAG_ON_TV = "on_tv";
    private static String APP_CATEGORY = "nbcliveextra";
    private static String CACHE_DIR = null;
    private static String CACHE_LOCATION = "/Android/data/com.phunware.nbc.sochi/[app]/cache";
    public static String CURRENT_CONFIG_URL = "http://stream.nbcsports.com/data/mobile/configuration-liveextra-android.json";
    public static boolean DEVICE_IS_LOW_RES = false;
    public static final boolean ENABLE_ADOBE_STAGING = false;
    public static final String EVENT_ALERT_INTERVAL = "event_alert_interval";
    public static final int FAVORITES_ACTION = 6;
    public static final int FEATURE_HOME_NBCSPORTS = 1;
    public static final int FEATURE_HOME_SOCHI = -1;
    public static final int FULL_EVENT_NBCSPORTS = 3;
    public static boolean GEO_LOCATION_RETRY = false;
    public static final int HIGHLIGHTS_HOME_NBCSPORTS = 2;
    public static boolean IS_DEBUG = false;
    public static boolean IS_DEEPLINKING_ACTIVE = false;
    public static boolean IS_GEO_DEBUG = false;
    public static boolean IS_GEO_LOCATION_ENABLED = false;
    public static boolean IS_LANDSCAPE = false;
    public static boolean IS_TAB = false;
    public static GeoRequestResponse LAST_KNOWN_GEO_LOCATION = null;
    public static final String LOG_TAG = "NBCSOCHISYSTEM";
    public static com.nbcsports.liveextra.library.tve.NbcGeoService.NbcGeoReponse NBC_GEO_LOCATION = null;
    public static final String PREFS_ALERTS_DEFAULT_OPT_IN = "PREFS_ALERTS_DEFAULT_OPT_IN";
    public static final String PREFS_ENABLE_ALERTS = "PREFS_ENABLE_ALERTS";
    public static final String PREFS_NATIONAL_ALERTS_FIRST_LAUNCH = "PREFS_NATIONAL_ALERTS_FIRST_LAUNCH";
    public static final String PREFS_TUTORIAL_FIRST_LAUNCH = "PREFS_TUTORIAL_FIRST_LAUNCH";
    public static final int REFRESH_ACTION = 7;
    public static final int SCHEDULE_ACTION = 4;
    public static boolean SDK_IS_JELLY_BEAN_PLUS = false;
    public static final int SETTINGS_ACTION = 8;
    public static final int SPLASH_INTRO_TIMEOUT = 5000;
    public static String SPONSOR_LINK_URL_ADBANNER_1 = "https://everystep.citi.com/#home";
    private static final String TOKEN_VALIDATOR_ENDPOINT = "http://sp.auth.adobe.com/tvs/v1/validate";
    public static final String TOKEN_VALIDATOR_ENDPOINT_CURRENT = "http://sp.auth.adobe.com/tvs/v1/validate";
    private static final String TOKEN_VERIFIER_ENDPOINT = "http://sp.auth.adobe.com/tvs/v1/sign";
    public static final String TOKEN_VERIFIER_ENDPOINT_CURRENT = "http://sp.auth.adobe.com/tvs/v1/sign";
    public static final int TOUR_1 = 6;
    public static final int TOUR_2 = 7;
    public static final int TOUR_3 = 8;
    private static List errorTailArray = new ArrayList();
    private static NBCSystem mInstance = new NBCSystem();

    private NBCSystem()
    {
        int i = android.os.Build.VERSION.SDK_INT;
        boolean flag;
        if (i >= 15)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SDK_IS_JELLY_BEAN_PLUS = flag;
        debugLog("NBCSOCHISYSTEM", (new StringBuilder()).append("SDK VERSION: ").append(i).toString());
    }

    public static void clearSettings(Context context)
    {
        AppSharedPreferences.addSetting(context, "lastsynch", null);
        AppSharedPreferences.addSetting(context, "lastlogin", null);
        AppSharedPreferences.addSetting(context, "autosynch", null);
        AppSharedPreferences.addSetting(context, "keyauthorized", null);
    }

    public static void debugLog(String s, String s1)
    {
        if (!IS_DEBUG);
    }

    public static String getCacheLocation()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            File file = new File(Environment.getExternalStorageDirectory().toString(), CACHE_LOCATION);
            if (!file.exists())
            {
                file.mkdirs();
            } else
            {
                CACHE_LOCATION = file.getAbsolutePath();
            }
        } else
        {
            File file1 = Environment.getDownloadCacheDirectory();
            if (!file1.exists())
            {
                debugLog("NBCSOCHISYSTEM", (new StringBuilder()).append("Tried internal directory failed, External failed").append(file1).toString());
            } else
            {
                CACHE_LOCATION = file1.getAbsolutePath();
            }
        }
        if (CACHE_LOCATION != null && !CACHE_LOCATION.isEmpty())
        {
            CACHE_DIR = CACHE_LOCATION;
        }
        return CACHE_LOCATION;
    }

    public static NBCSystem getInstance()
    {
        return mInstance;
    }

    public static String getLastKnownErrorTail()
    {
        if (errorTailArray.isEmpty()) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        Iterator iterator;
        stringbuilder = new StringBuilder();
        iterator = errorTailArray.iterator();
_L4:
        String s;
        Long long1;
        String s1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (String)iterator.next();
        (new StringBuilder()).append("").append(System.currentTimeMillis()).toString();
        s = s1;
        long1 = Long.valueOf(0L);
        Object obj = s1.substring(s1.indexOf(":") + 1);
        s = ((String) (obj));
        long l = Long.parseLong(s1.substring(0, s1.indexOf(":")));
        long1 = Long.valueOf(l);
        s = ((String) (obj));
        obj = long1;
_L5:
        obj = DateUtils.getRelativeTimeSpanString(((Long) (obj)).longValue(), System.currentTimeMillis(), 1000L).toString();
        stringbuilder.append((new StringBuilder()).append(((String) (obj))).append(":").append(s).toString());
        stringbuilder.append("\r\n");
        if (true) goto _L4; else goto _L3
_L3:
        return stringbuilder.toString();
_L2:
        return "No Errors Recorded.";
        Exception exception;
        exception;
        exception = long1;
          goto _L5
    }

    public static String getVersion()
    {
        return "4.3.5.4000784";
    }

    public static void init(Context context)
    {
        if ("nbclive".equalsIgnoreCase("telemundo") && android.os.Build.VERSION.SDK_INT > 16)
        {
            context.getApplicationContext().getResources().getConfiguration().setLocale(new Locale("es"));
        }
        CACHE_LOCATION = CACHE_LOCATION.replace("[app]", "nbclive");
    }

    public static boolean isForcedUpdateRequred(Context context)
    {
        String s;
        String s1;
        boolean flag1;
        flag1 = false;
        s1 = "";
        s = "";
        String s2 = NBCSportsApplication.component().configuration().getMinApplicationVersionAndroid();
        String s3;
        String s4;
        String s5;
        boolean flag;
        s3 = s2;
        flag = flag1;
        s4 = s2;
        s5 = s3;
        if (s2 == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        s4 = s2;
        s5 = s3;
        s = s2;
        s1 = s3;
        if (TextUtils.isEmpty(s2)) goto _L2; else goto _L3
_L3:
        if ("4.3.5" == null) goto _L5; else goto _L4
_L4:
        s = s2;
        s1 = s3;
        if (!TextUtils.isEmpty("4.3.5")) goto _L6; else goto _L5
_L5:
        s = s2;
        s1 = s3;
        AppSharedPreferences.addSetting(context, "MinApplicationVersionAndroid", s2.trim());
        s = s2;
        s1 = s3;
        s2.trim();
        s5 = s3;
        s4 = s2;
        flag = flag1;
_L2:
        debugLog("NBCSystem", (new StringBuilder()).append("MinApplicationVersionAndroid config:").append(s4).append(" App:").append(s5).toString());
        return flag;
_L6:
        s = s2;
        s1 = s3;
        int i = "4.3.5".compareTo(s2);
        flag = flag1;
        s4 = s2;
        s5 = s3;
        if (i < 0)
        {
            flag = true;
            s4 = s2;
            s5 = s3;
        }
        continue; /* Loop/switch isn't completed */
        context;
        debugLog("NBCSystem:isForcedUpdateRequired", (new StringBuilder()).append("No values found:").append(context.toString()).toString());
        flag = false;
        s4 = s;
        s5 = s1;
        if (true) goto _L2; else goto _L7
_L7:
    }

    public static boolean isNetworkAvailable(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    public static void resetGeoTrackingService(Context context)
    {
        context.startService(new Intent(new Intent(context, com/phunware/nbc/sochi/services/GeoTrackingService)));
    }

    public static void setLastKnownError(String s)
    {
        if (s != null && !TextUtils.isEmpty(s))
        {
            String s1 = (new StringBuilder()).append("").append(System.currentTimeMillis()).toString();
            errorTailArray.add((new StringBuilder()).append(s1.trim()).append(":").append(s).toString());
        }
    }

    public String getNBCLiveConfigurationUrl()
    {
        return CURRENT_CONFIG_URL;
    }

    static 
    {
        IS_DEBUG = false;
        IS_GEO_DEBUG = false;
        GEO_LOCATION_RETRY = true;
        IS_TAB = false;
        IS_DEEPLINKING_ACTIVE = false;
        DEVICE_IS_LOW_RES = false;
        SDK_IS_JELLY_BEAN_PLUS = true;
        IS_GEO_LOCATION_ENABLED = false;
    }
}

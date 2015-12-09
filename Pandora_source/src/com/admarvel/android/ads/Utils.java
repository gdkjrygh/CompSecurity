// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.admarvel.android.offline.AdmarvelOfflineUtils;
import com.admarvel.android.util.Base64;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.OptionalUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.admarvel.android.ads:
//            Version, AdMarvelView, AdMarvelInterstitialAds, AdMarvelSensorManager, 
//            AdMarvelAd, AdMarvelXMLReader, AdMarvelXMLElement, AdMarvelInstallTrackerCleanupAsyncTask

class Utils
{
    private static class AdMarvelInstallTrackerCleanupAsyncTaskRunnable
        implements Runnable
    {

        public void run()
        {
            (new AdMarvelInstallTrackerCleanupAsyncTask()).execute(new Object[] {
                null
            });
        }

        private AdMarvelInstallTrackerCleanupAsyncTaskRunnable()
        {
        }

        AdMarvelInstallTrackerCleanupAsyncTaskRunnable(AdMarvelInstallTrackerCleanupAsyncTaskRunnable admarvelinstalltrackercleanupasynctaskrunnable)
        {
            this();
        }
    }

    private static class AdMarvelInstallTrackerCleanupAsyncTaskRunnablePostAPI11
        implements Runnable
    {

        public void run()
        {
            (new AdMarvelInstallTrackerCleanupAsyncTask()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                null
            });
        }

        private AdMarvelInstallTrackerCleanupAsyncTaskRunnablePostAPI11()
        {
        }

        AdMarvelInstallTrackerCleanupAsyncTaskRunnablePostAPI11(AdMarvelInstallTrackerCleanupAsyncTaskRunnablePostAPI11 admarvelinstalltrackercleanupasynctaskrunnablepostapi11)
        {
            this();
        }
    }

    private static class FeatureSupport
    {

        public static boolean testFeature(Context context, String s)
        {
            context = context.getPackageManager();
            if (s.equals("camera"))
            {
                return context.hasSystemFeature("android.hardware.camera");
            }
            if (Version.getAndroidSDKVersion() >= 8)
            {
                if (s.equals("location"))
                {
                    return context.hasSystemFeature("android.hardware.location");
                }
                if (s.equals("accelerometer"))
                {
                    return context.hasSystemFeature("android.hardware.sensor.accelerometer");
                }
                if (s.equals("compass"))
                {
                    return context.hasSystemFeature("android.hardware.sensor.compass");
                }
            }
            return false;
        }

        private FeatureSupport()
        {
        }
    }

    private class FirePixelTask extends AsyncTask
    {

        final Utils this$0;
        private String urlString;

        protected transient Boolean doInBackground(Void avoid[])
        {
            avoid = (Context)contextReference.get();
            if (avoid != null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
            return Boolean.valueOf(false);
            if (!((ConnectivityManager)avoid.getSystemService("connectivity")).getActiveNetworkInfo().isConnected())
            {
                break MISSING_BLOCK_LABEL_102;
            }
            avoid = (HttpURLConnection)(new URL(urlString)).openConnection();
            avoid.setReadTimeout(10000);
            avoid.setConnectTimeout(5000);
            avoid.connect();
            if (avoid.getResponseCode() == 200)
            {
                return Boolean.valueOf(true);
            }
            return Boolean.valueOf(false);
            avoid;
            avoid.printStackTrace();
            return Boolean.valueOf(false);
        }

        protected volatile transient Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        public FirePixelTask(String s)
        {
            this$0 = Utils.this;
            super();
            urlString = s;
        }
    }

    private class FirePixelUsingHTTPPostAPI11
        implements Runnable
    {

        final Utils this$0;
        private String url;

        public void run()
        {
            (new FirePixelTask(url)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }

        public FirePixelUsingHTTPPostAPI11(String s)
        {
            this$0 = Utils.this;
            super();
            url = s;
        }
    }

    public static final class PROTOCOL_TYPE extends Enum
    {

        private static final PROTOCOL_TYPE ENUM$VALUES[];
        public static final PROTOCOL_TYPE NONE;
        public static final PROTOCOL_TYPE WITHOUT_SLASH;
        public static final PROTOCOL_TYPE WITH_SLASH;

        public static PROTOCOL_TYPE valueOf(String s)
        {
            return (PROTOCOL_TYPE)Enum.valueOf(com/admarvel/android/ads/Utils$PROTOCOL_TYPE, s);
        }

        public static PROTOCOL_TYPE[] values()
        {
            PROTOCOL_TYPE aprotocol_type[] = ENUM$VALUES;
            int i = aprotocol_type.length;
            PROTOCOL_TYPE aprotocol_type1[] = new PROTOCOL_TYPE[i];
            System.arraycopy(aprotocol_type, 0, aprotocol_type1, 0, i);
            return aprotocol_type1;
        }

        static 
        {
            WITH_SLASH = new PROTOCOL_TYPE("WITH_SLASH", 0);
            WITHOUT_SLASH = new PROTOCOL_TYPE("WITHOUT_SLASH", 1);
            NONE = new PROTOCOL_TYPE("NONE", 2);
            ENUM$VALUES = (new PROTOCOL_TYPE[] {
                WITH_SLASH, WITHOUT_SLASH, NONE
            });
        }

        private PROTOCOL_TYPE(String s, int i)
        {
            super(s, i);
        }
    }


    private static int $SWITCH_TABLE$com$admarvel$android$ads$AdMarvelUtils$ErrorReason[];
    public static String dsd;
    public static String mess;
    public static boolean testFlag;
    private WeakReference contextReference;
    private final Handler handler;
    private String mPixelHtml;

    static int[] $SWITCH_TABLE$com$admarvel$android$ads$AdMarvelUtils$ErrorReason()
    {
        int ai[] = $SWITCH_TABLE$com$admarvel$android$ads$AdMarvelUtils$ErrorReason;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[AdMarvelUtils.ErrorReason.values().length];
        try
        {
            ai[AdMarvelUtils.ErrorReason.AD_REQUEST_IN_PROCESS_EXCEPTION.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.AD_REQUEST_MISSING_XML_ELEMENTS.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.AD_REQUEST_SDK_TYPE_UNSUPPORTED.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.AD_REQUEST_XML_PARSING_EXCEPTION.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.AD_UNIT_NOT_ABLE_TO_RENDER.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.BOT_USER_AGENT_FOUND.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.NETWORK_CONNECTIVITY_DISRUPTED.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.NO_AD_FOUND.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.NO_BANNER_FOUND.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.NO_NETWORK_CONNECTIVITY.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.NO_USER_AGENT_FOUND.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.PARTNER_ID_NOT_PRESENT.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.SITE_ID_NOT_PRESENT.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[AdMarvelUtils.ErrorReason.SITE_ID_OR_PARTNER_ID_NOT_PRESENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$admarvel$android$ads$AdMarvelUtils$ErrorReason = ai;
        return ai;
    }

    public Utils(Context context)
    {
        contextReference = new WeakReference(context);
        handler = null;
    }

    public Utils(Context context, Handler handler1)
    {
        contextReference = new WeakReference(context);
        handler = handler1;
    }

    public static void appendParams(StringBuilder stringbuilder, String s, String s1)
        throws UnsupportedEncodingException
    {
        if (stringbuilder != null && s1 != null && s != null)
        {
            stringbuilder.append("&").append(s).append("=").append(URLEncoder.encode(s1, "UTF-8"));
        }
    }

    public static void blockingFirePixel(Context context, String s)
    {
        if (s != null && context != null && s.length() > 0)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("<img src=\"").append(s).append("\" />");
            if (stringbuilder != null && stringbuilder.length() > 0)
            {
                if (Thread.currentThread().getName().equalsIgnoreCase("main"))
                {
                    if (context != null)
                    {
                        (new WebView(context)).loadDataWithBaseURL(null, stringbuilder.toString(), "text/html", "utf-8", null);
                        return;
                    }
                } else
                {
                    Logging.log("Pixel Fire allowed from main thread only");
                    return;
                }
            }
        }
    }

    public static String captureTargetingParams(Map map, String s)
        throws Exception
    {
        if (map == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = map.keySet().iterator();
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    return stringbuilder.toString();
                }
                String s2 = (String)iterator.next();
                String s1;
                if (map.get(s2) instanceof String)
                {
                    s1 = (String)map.get(s2);
                } else
                {
                    s1 = null;
                }
            } while (s1 == null || s1.length() <= 0);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(s);
            }
            stringbuilder.append(URLEncoder.encode(s2, "UTF-8")).append("=>").append(URLEncoder.encode(s1, "UTF-8"));
        } while (true);
    }

    public static boolean checkIfPrivateProtocol(String s)
    {
        return isPrivateProtocol(s, "admarvelsdk") != PROTOCOL_TYPE.NONE || isPrivateProtocol(s, "admarvelinternal") != PROTOCOL_TYPE.NONE || isPrivateProtocol(s, "admarvelvideo") != PROTOCOL_TYPE.NONE || isPrivateProtocol(s, "admarvelexternal") != PROTOCOL_TYPE.NONE || isPrivateProtocol(s, "admarvelcustomvideo") != PROTOCOL_TYPE.NONE;
    }

    public static boolean checkNetworkConnection(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        return context.getActiveNetworkInfo() != null && context.getActiveNetworkInfo().isAvailable() && context.getActiveNetworkInfo().isConnected();
    }

    static String decodeString(String s)
    {
        try
        {
            s = new String(Base64.decode(URLDecoder.decode(s, "UTF-8"), 8), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logging.log(Log.getStackTraceString(s));
            return "";
        }
        return s;
    }

    public static boolean detectDeviceForWebViewCrash()
    {
        return Version.getAndroidSDKVersion() == 16;
    }

    static String encodeString(String s)
    {
        try
        {
            s = URLEncoder.encode(Base64.encodeToString(s.getBytes(), 8), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logging.log(Log.getStackTraceString(s));
            return "";
        }
        return s;
    }

    static String getDeviceConnectivitiy(Context context)
    {
        if (context == null)
        {
            throw new NullPointerException();
        }
        if (isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE"))
        {
            Object obj = (ConnectivityManager)context.getSystemService("connectivity");
            context = ((ConnectivityManager) (obj)).getNetworkInfo(1);
            obj = ((ConnectivityManager) (obj)).getNetworkInfo(0);
            if (context != null && context.isAvailable())
            {
                return "wifi";
            }
            if (obj != null && ((NetworkInfo) (obj)).isAvailable())
            {
                return "mobile";
            } else
            {
                return "none";
            }
        } else
        {
            return "unknown";
        }
    }

    public static float getDeviceDensity(Context context)
    {
        context = (WindowManager)context.getApplicationContext().getSystemService("window");
        DisplayMetrics displaymetrics = new DisplayMetrics();
        context.getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.density;
    }

    public static int getDeviceHeight(Context context)
    {
        return ((WindowManager)context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getHeight();
    }

    public static int getDeviceWidth(Context context)
    {
        return ((WindowManager)context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getWidth();
    }

    public static int getErrorCode(AdMarvelUtils.ErrorReason errorreason)
    {
        switch ($SWITCH_TABLE$com$admarvel$android$ads$AdMarvelUtils$ErrorReason()[errorreason.ordinal()])
        {
        default:
            return -1;

        case 1: // '\001'
            return 201;

        case 2: // '\002'
            return 202;

        case 3: // '\003'
            return 203;

        case 4: // '\004'
            return 204;

        case 5: // '\005'
            return 205;

        case 6: // '\006'
            return 206;

        case 7: // '\007'
            return 207;

        case 8: // '\b'
            return 208;

        case 9: // '\t'
            return 301;

        case 10: // '\n'
            return 302;

        case 11: // '\013'
            return 303;

        case 12: // '\f'
            return 304;

        case 13: // '\r'
            return 305;

        case 14: // '\016'
            return 306;

        case 15: // '\017'
            return 307;
        }
    }

    public static AdMarvelUtils.ErrorReason getErrorReason(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 201: 
            return AdMarvelUtils.ErrorReason.SITE_ID_OR_PARTNER_ID_NOT_PRESENT;

        case 202: 
            return AdMarvelUtils.ErrorReason.SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH;

        case 203: 
            return AdMarvelUtils.ErrorReason.BOT_USER_AGENT_FOUND;

        case 204: 
            return AdMarvelUtils.ErrorReason.NO_BANNER_FOUND;

        case 205: 
            return AdMarvelUtils.ErrorReason.NO_AD_FOUND;

        case 206: 
            return AdMarvelUtils.ErrorReason.NO_USER_AGENT_FOUND;

        case 207: 
            return AdMarvelUtils.ErrorReason.SITE_ID_NOT_PRESENT;

        case 208: 
            return AdMarvelUtils.ErrorReason.PARTNER_ID_NOT_PRESENT;

        case 301: 
            return AdMarvelUtils.ErrorReason.NO_NETWORK_CONNECTIVITY;

        case 302: 
            return AdMarvelUtils.ErrorReason.NETWORK_CONNECTIVITY_DISRUPTED;

        case 303: 
            return AdMarvelUtils.ErrorReason.AD_REQUEST_XML_PARSING_EXCEPTION;

        case 304: 
            return AdMarvelUtils.ErrorReason.AD_REQUEST_IN_PROCESS_EXCEPTION;

        case 305: 
            return AdMarvelUtils.ErrorReason.AD_UNIT_NOT_ABLE_TO_RENDER;

        case 306: 
            return AdMarvelUtils.ErrorReason.AD_REQUEST_MISSING_XML_ELEMENTS;

        case 307: 
            return AdMarvelUtils.ErrorReason.AD_REQUEST_SDK_TYPE_UNSUPPORTED;
        }
    }

    public static float getScalingFactor(Context context, int i, int j)
    {
        context = (WindowManager)context.getApplicationContext().getSystemService("window");
        DisplayMetrics displaymetrics = new DisplayMetrics();
        context.getDefaultDisplay().getMetrics(displaymetrics);
        return Math.min(displaymetrics.density, (float)i / (float)j);
    }

    static int getScreenOrientation(Context context)
    {
        if (context == null)
        {
            throw new NullPointerException();
        }
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        return context.getWidth() <= context.getHeight() ? 1 : 2;
    }

    public static String getSupportedInterfaceOrientations(Activity activity)
    {
        int i = activity.getRequestedOrientation();
        if (Version.getAndroidSDKVersion() < 9)
        {
            switch (i)
            {
            default:
                return "0";

            case -1: 
                return "0,90";

            case 2: // '\002'
                return "0,90";

            case 3: // '\003'
                return "0,90";

            case 0: // '\0'
                return "90";

            case 1: // '\001'
                return "0";

            case 4: // '\004'
                return "0,90";

            case 5: // '\005'
                return "0";
            }
        }
        switch (i)
        {
        default:
            return "";

        case -1: 
            return "0,-90,90";

        case 2: // '\002'
            return "0,90,-90";

        case 3: // '\003'
            return "0,90,-90";

        case 0: // '\0'
            return "90";

        case 1: // '\001'
            return "0";

        case 8: // '\b'
            return "-90";

        case 9: // '\t'
            return "180";

        case 6: // '\006'
            return "90,-90";

        case 7: // '\007'
            return "180,-180";

        case 4: // '\004'
            return "0,-90,90";

        case 10: // '\n'
            return "0,-90,90,180";

        case 5: // '\005'
            return "0";
        }
    }

    static String getUniqueId(Context context, Map map, String s)
    {
        if (s != null)
        {
            return s;
        } else
        {
            return OptionalUtils.getId(context);
        }
    }

    public static String getUserAgentApprox()
    {
        StringBuffer stringbuffer = new StringBuffer();
        Object obj = android.os.Build.VERSION.RELEASE;
        String s;
        if (((String) (obj)).length() > 0)
        {
            stringbuffer.append(((String) (obj)));
        } else
        {
            stringbuffer.append("1.0");
        }
        stringbuffer.append("; ");
        obj = Locale.getDefault();
        s = ((Locale) (obj)).getLanguage();
        if (s != null)
        {
            stringbuffer.append(s.toLowerCase());
            obj = ((Locale) (obj)).getCountry();
            if (obj != null)
            {
                stringbuffer.append("-");
                stringbuffer.append(((String) (obj)).toLowerCase());
            }
        } else
        {
            stringbuffer.append("en");
        }
        obj = Build.MODEL;
        if (((String) (obj)).length() > 0)
        {
            stringbuffer.append("; ");
            stringbuffer.append(((String) (obj)));
        }
        obj = Build.ID;
        if (((String) (obj)).length() > 0)
        {
            stringbuffer.append(" Build/");
            stringbuffer.append(((String) (obj)));
        }
        return String.format("Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/525.10+ (KHTML, like Gecko) Version/3.0.4 Mobile Safari/523.12.2", new Object[] {
            stringbuffer
        });
    }

    static boolean handledBySpecialIntents(Context context, String s)
    {
        if (!AdMarvelView.enableOfflineSDK && !AdMarvelInterstitialAds.enableOfflineSDK || s == null)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        Object obj;
        Object obj1;
        Object obj2;
        if (!s.contains("/") || URLUtil.isNetworkUrl(s))
        {
            break MISSING_BLOCK_LABEL_553;
        }
        obj = s.substring(s.lastIndexOf("/") + 1);
        if (!isSms(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_184;
        }
        obj2 = Uri.parse(((String) (obj)));
        obj1 = new Intent("android.intent.action.VIEW");
        if (!s.contains("?body="))
        {
            break MISSING_BLOCK_LABEL_155;
        }
        obj2 = s.split("\\?body=");
        ((Intent) (obj1)).putExtra("address", URLDecoder.decode(obj2[0]).substring(4));
        ((Intent) (obj1)).putExtra("sms_body", URLDecoder.decode(obj2[1]));
_L1:
        ((Intent) (obj1)).setType("vnd.android-dir/mms-sms");
        ((Intent) (obj1)).addFlags(0x10000000);
        if (!isIntentAvailable(context, ((Intent) (obj1))))
        {
            break MISSING_BLOCK_LABEL_229;
        }
        context.startActivity(((Intent) (obj1)));
        return true;
        try
        {
            ((Intent) (obj1)).putExtra("address", ((Uri) (obj2)).toString().substring(4));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logging.log(" Exception in handling special intents");
            return false;
        }
          goto _L1
        if (!isDailer(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_229;
        }
        obj1 = new Intent("android.intent.action.DIAL", Uri.parse(((String) (obj))));
        ((Intent) (obj1)).addFlags(0x10000000);
        if (!isIntentAvailable(context, ((Intent) (obj1))))
        {
            break MISSING_BLOCK_LABEL_229;
        }
        context.startActivity(((Intent) (obj1)));
        return true;
        obj1 = AdmarvelOfflineUtils.readFile(s);
        if (obj1 == null || obj == null)
        {
            break MISSING_BLOCK_LABEL_524;
        }
        if (!isVideoLinkOffline(s))
        {
            break MISSING_BLOCK_LABEL_342;
        }
        obj = AdmarvelOfflineUtils.writeFileToSDCard(((java.io.FileInputStream) (obj1)), ((String) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        obj1 = new Intent("android.intent.action.VIEW");
        ((Intent) (obj1)).addFlags(0x10000000);
        ((Intent) (obj1)).setDataAndType(Uri.fromFile(new File(((String) (obj)))), "video/*");
        if (!isIntentAvailable(context, ((Intent) (obj1))))
        {
            break MISSING_BLOCK_LABEL_1101;
        }
        context.startActivity(((Intent) (obj1)));
        return true;
        obj;
        if (!isVideoLinkOffline(s) && !isPDFOffline(s) && !isAudioLinkOffline(s))
        {
            break MISSING_BLOCK_LABEL_553;
        }
        Logging.log(" ");
        return true;
        if (!isAudioLinkOffline(s))
        {
            break MISSING_BLOCK_LABEL_412;
        }
        obj = AdmarvelOfflineUtils.writeFileToSDCard(((java.io.FileInputStream) (obj1)), ((String) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        obj1 = new Intent("android.intent.action.VIEW");
        ((Intent) (obj1)).addFlags(0x10000000);
        ((Intent) (obj1)).setDataAndType(Uri.fromFile(new File(((String) (obj)))), "audio/*");
        if (!isIntentAvailable(context, ((Intent) (obj1))))
        {
            break MISSING_BLOCK_LABEL_1101;
        }
        context.startActivity(((Intent) (obj1)));
        return true;
        if (!isPDFOffline(s))
        {
            break MISSING_BLOCK_LABEL_553;
        }
        obj = AdmarvelOfflineUtils.writeFileToSDCard(((java.io.FileInputStream) (obj1)), ((String) (obj)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1101;
        }
        obj1 = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
        ((Intent) (obj1)).setDataAndType(Uri.fromFile(new File(((String) (obj)))), "application/pdf");
        ((Intent) (obj1)).setFlags(0x10000000);
        if (!isIntentAvailable(context, ((Intent) (obj1))))
        {
            break MISSING_BLOCK_LABEL_486;
        }
        context.startActivity(((Intent) (obj1)));
        return true;
        obj = new Intent("android.intent.action.VIEW", Uri.parse(s));
        ((Intent) (obj)).addFlags(0x10000000);
        if (!isIntentAvailable(context, ((Intent) (obj))))
        {
            break MISSING_BLOCK_LABEL_1101;
        }
        context.startActivity(((Intent) (obj)));
        return true;
        if (!isVideoLinkOffline(s) && !isPDFOffline(s) && !isAudioLinkOffline(s))
        {
            break MISSING_BLOCK_LABEL_553;
        }
        Logging.log(" ");
        return true;
        obj = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_602;
        }
        obj = s;
        if (s.length() > 0)
        {
            obj = s.replace((new StringBuilder("content://")).append(context.getPackageName()).append(".AdMarvelLocalFileContentProvider").toString(), "");
        }
        if (!isNetworkAvailable(context) || !isVideoLink(((String) (obj)))) goto _L3; else goto _L2
_L2:
        s = new Intent("android.intent.action.VIEW");
        s.addFlags(0x10000000);
        s.setDataAndType(Uri.parse(((String) (obj))), "video/*");
        if (!isIntentAvailable(context, s)) goto _L5; else goto _L4
_L4:
        context.startActivity(s);
        return true;
        context;
        Logging.log(" ActivityNotFoundException");
        testFlag = checkIfPrivateProtocol(((String) (obj)));
        if (!AdMarvelView.enableOfflineSDK && !AdMarvelInterstitialAds.enableOfflineSDK) goto _L5; else goto _L6
_L6:
        boolean flag = testFlag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1101;
        }
_L5:
        return false;
_L3:
        if (!isNetworkAvailable(context) || !isAudioLink(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_760;
        }
        s = new Intent("android.intent.action.VIEW");
        s.addFlags(0x10000000);
        s.setDataAndType(Uri.parse(((String) (obj))), "audio/*");
        if (!isIntentAvailable(context, s)) goto _L5; else goto _L7
_L7:
        context.startActivity(s);
        return true;
        if (!isNetworkAvailable(context) || !isPDF(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_862;
        }
        s = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
        s.setDataAndType(Uri.parse(((String) (obj))), "application/pdf");
        s.setFlags(0x10000000);
        if (!isIntentAvailable(context, s))
        {
            break MISSING_BLOCK_LABEL_824;
        }
        context.startActivity(s);
        return true;
        s = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
        s.addFlags(0x10000000);
        if (!isIntentAvailable(context, s))
        {
            break MISSING_BLOCK_LABEL_1101;
        }
        context.startActivity(s);
        return true;
        if (!isSms(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_985;
        }
        obj1 = Uri.parse(((String) (obj)));
        s = new Intent("android.intent.action.VIEW");
        if (!((String) (obj)).contains("?body="))
        {
            break MISSING_BLOCK_LABEL_966;
        }
        obj1 = ((String) (obj)).split("\\?body=");
        s.putExtra("address", URLDecoder.decode(obj1[0]).substring(4));
        s.putExtra("sms_body", URLDecoder.decode(obj1[1]));
_L9:
        s.setType("vnd.android-dir/mms-sms");
        s.addFlags(0x10000000);
        if (!isIntentAvailable(context, s)) goto _L5; else goto _L8
_L8:
        context.startActivity(s);
        return true;
        s.putExtra("address", ((Uri) (obj1)).toString().substring(4));
          goto _L9
        if (!isDailer(((String) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = new Intent("android.intent.action.DIAL", Uri.parse(((String) (obj))));
        s.addFlags(0x10000000);
        if (!isIntentAvailable(context, s)) goto _L5; else goto _L10
_L10:
        context.startActivity(s);
        return true;
        if (!isGoogleMaps(((String) (obj))) && !isGoogleStreetView(((String) (obj))) && !isMarket(((String) (obj))) && !isVZWMarket(((String) (obj))) && !isEmail(((String) (obj)))) goto _L5; else goto _L11
_L11:
        s = new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj))));
        s.addFlags(0x10000000);
        if (!isIntentAvailable(context, s)) goto _L5; else goto _L12
_L12:
        context.startActivity(s);
        return true;
    }

    static boolean isAppInstalled(Context context, String s)
    {
        try
        {
            context.getPackageManager().getApplicationInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    private static boolean isAudioLink(String s)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (s == null)
            {
                break label0;
            }
            flag = flag1;
            if (s.length() <= 0)
            {
                break label0;
            }
            if (!s.toLowerCase().endsWith(".flac") && !s.toLowerCase().endsWith(".mp3") && !s.toLowerCase().endsWith(".mid") && !s.toLowerCase().endsWith(".xmf") && !s.toLowerCase().endsWith(".mxmf") && !s.toLowerCase().endsWith(".rtttl") && !s.toLowerCase().endsWith(".rtx") && !s.toLowerCase().endsWith(".ota"))
            {
                flag = flag1;
                if (!s.toLowerCase().endsWith(".imy"))
                {
                    break label0;
                }
            }
            try
            {
                s = new URL(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            s = s.getPath();
            flag = flag1;
            if (s == null)
            {
                break label0;
            }
            flag = flag1;
            if (s.length() <= 0)
            {
                break label0;
            }
            if (!s.toLowerCase().endsWith(".flac") && !s.toLowerCase().endsWith(".mp3") && !s.toLowerCase().endsWith(".mid") && !s.toLowerCase().endsWith(".xmf") && !s.toLowerCase().endsWith(".mxmf") && !s.toLowerCase().endsWith(".rtttl") && !s.toLowerCase().endsWith(".rtx") && !s.toLowerCase().endsWith(".ota"))
            {
                flag = flag1;
                if (!s.toLowerCase().endsWith(".imy"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private static boolean isAudioLinkOffline(String s)
    {
        return s != null && s.length() > 0 && (s.toLowerCase().endsWith(".flac") || s.toLowerCase().endsWith(".mp3") || s.toLowerCase().endsWith(".mid") || s.toLowerCase().endsWith(".xmf") || s.toLowerCase().endsWith(".mxmf") || s.toLowerCase().endsWith(".rtttl") || s.toLowerCase().endsWith(".rtx") || s.toLowerCase().endsWith(".ota") || s.toLowerCase().endsWith(".imy"));
    }

    private static boolean isDailer(String s)
    {
        return s != null && s.length() > 0 && (s.toLowerCase().startsWith("tel:") || s.toLowerCase().startsWith("voicemail:"));
    }

    private static boolean isEmail(String s)
    {
        return s != null && s.length() > 0 && s.toLowerCase().startsWith("mailto:");
    }

    public static boolean isFeatureSupported(Context context, String s)
    {
        if (Version.getAndroidSDKVersion() >= 7 && s.equals("camera"))
        {
            return Boolean.valueOf(FeatureSupport.testFeature(context, s)).booleanValue();
        }
        if (Version.getAndroidSDKVersion() >= 8)
        {
            return Boolean.valueOf(FeatureSupport.testFeature(context, s)).booleanValue();
        }
        if (!s.equals("camera")) goto _L2; else goto _L1
_L1:
        context = null;
        s = Camera.open();
        context = s;
_L4:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        context = Boolean.valueOf(true);
_L3:
        return context.booleanValue();
_L2:
        if (s.equals("location"))
        {
            if ((LocationManager)context.getSystemService("location") == null)
            {
                break MISSING_BLOCK_LABEL_173;
            }
            context = Boolean.valueOf(true);
        } else
        if (s.equals("accelerometer"))
        {
            if (!AdMarvelSensorManager.getInstance().isSupported(context))
            {
                break MISSING_BLOCK_LABEL_173;
            }
            context = Boolean.valueOf(true);
        } else
        {
            if (!s.equals("compass") || !AdMarvelSensorManager.getInstance().isHeadingSupported(context))
            {
                break MISSING_BLOCK_LABEL_173;
            }
            context = Boolean.valueOf(true);
        }
          goto _L3
        s;
          goto _L4
        context = Boolean.valueOf(false);
          goto _L3
    }

    private static boolean isGoogleMaps(String s)
    {
        return s != null && s.length() > 0 && s.toLowerCase().startsWith("geo:");
    }

    private static boolean isGoogleStreetView(String s)
    {
        return s != null && s.length() > 0 && s.toLowerCase().startsWith("google.streetview:");
    }

    public static boolean isIntentAvailable(Context context, Intent intent)
    {
        return context.getPackageManager().queryIntentActivities(intent, 0x10000).size() > 0;
    }

    private static boolean isMarket(String s)
    {
        return s != null && s.length() > 0 && s.toLowerCase().startsWith("market://");
    }

    public static boolean isMediaVolumeOff(Context context)
    {
        context = (AudioManager)context.getSystemService("audio");
        boolean flag;
        if (context.getStreamVolume(3) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            int i = context.getRingerMode();
            if (i == 0 || i == 1)
            {
                return true;
            }
        }
        return flag;
    }

    public static final boolean isNetworkAvailable(Context context)
    {
        if (isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE"))
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            if (context.getActiveNetworkInfo() != null && context.getActiveNetworkInfo().isAvailable() && context.getActiveNetworkInfo().isConnected())
            {
                return true;
            }
        }
        return false;
    }

    static boolean isNoLink(String s)
    {
        return s != null && s.length() > 0 && (s.equals("admarvelsdk://noclick") || s.equals("admarvelsdk://nothing"));
    }

    private static boolean isPDF(String s)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (s == null)
            {
                break label0;
            }
            flag = flag1;
            if (s.length() <= 0)
            {
                break label0;
            }
            if (!s.toLowerCase().endsWith(".pdf"))
            {
                flag = flag1;
                if (!s.toLowerCase().endsWith(".pdf"))
                {
                    break label0;
                }
            }
            try
            {
                s = new URL(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            s = s.getPath();
            flag = flag1;
            if (s == null)
            {
                break label0;
            }
            flag = flag1;
            if (s.length() <= 0)
            {
                break label0;
            }
            if (!s.toLowerCase().endsWith(".pdf"))
            {
                flag = flag1;
                if (!s.toLowerCase().endsWith(".pdf"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private static boolean isPDFOffline(String s)
    {
        return s != null && s.length() > 0 && (s.toLowerCase().endsWith(".pdf") || s.toLowerCase().endsWith(".pdf"));
    }

    public static boolean isPermissionGranted(Context context, String s)
    {
        return context.checkCallingOrSelfPermission(s) == 0;
    }

    public static PROTOCOL_TYPE isPrivateProtocol(String s, String s1)
    {
        if (s.startsWith((new StringBuilder(String.valueOf(s1))).append("://").toString()))
        {
            return PROTOCOL_TYPE.WITH_SLASH;
        }
        if (s.startsWith(s1))
        {
            return PROTOCOL_TYPE.WITHOUT_SLASH;
        } else
        {
            return PROTOCOL_TYPE.NONE;
        }
    }

    private static boolean isSms(String s)
    {
        return s != null && s.length() > 0 && s.toLowerCase().startsWith("sms:");
    }

    public static boolean isTelephonySupported(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getPhoneType() != 0;
    }

    private static boolean isVZWMarket(String s)
    {
        return s != null && s.length() > 0 && s.toLowerCase().startsWith("vzw://");
    }

    private static boolean isVideoLink(String s)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (s == null)
            {
                break label0;
            }
            flag = flag1;
            if (s.length() <= 0)
            {
                break label0;
            }
            if (!s.toLowerCase().endsWith(".mp4"))
            {
                flag = flag1;
                if (!s.toLowerCase().endsWith(".3gp"))
                {
                    break label0;
                }
            }
            try
            {
                s = new URL(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            s = s.getPath();
            flag = flag1;
            if (s == null)
            {
                break label0;
            }
            flag = flag1;
            if (s.length() <= 0)
            {
                break label0;
            }
            if (!s.toLowerCase().endsWith(".mp4"))
            {
                flag = flag1;
                if (!s.toLowerCase().endsWith(".3gp"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    private static boolean isVideoLinkOffline(String s)
    {
        return s != null && s.length() > 0 && (s.toLowerCase().endsWith(".mp4") || s.toLowerCase().endsWith(".3gp"));
    }

    public static String parsePrivateProtocol(String s, String s1, String s2, PROTOCOL_TYPE protocol_type, Context context)
    {
        String s3 = s;
        if (s != null)
        {
            s3 = s;
            if (s.length() > 0)
            {
                s3 = s.replace((new StringBuilder("content://")).append(context.getPackageName()).append(".AdMarvelLocalFileContentProvider").toString(), "");
            }
        }
        s = null;
        if (protocol_type == PROTOCOL_TYPE.WITH_SLASH)
        {
            s = s3.replaceFirst((new StringBuilder(String.valueOf(s1))).append("://").toString(), s2);
        } else
        if (protocol_type == PROTOCOL_TYPE.WITHOUT_SLASH)
        {
            return s3.replaceFirst(s1, s2);
        }
        return s;
    }

    static String redirectURLCheck(String s, Context context)
    {
        Object obj;
        Object obj1;
        obj1 = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        obj1 = s;
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        obj = s;
_L1:
        int i;
        obj1 = (HttpURLConnection)(new URL(((String) (obj)))).openConnection();
        ((HttpURLConnection) (obj1)).setRequestMethod("GET");
        ((HttpURLConnection) (obj1)).setDoInput(true);
        ((HttpURLConnection) (obj1)).setUseCaches(false);
        ((HttpURLConnection) (obj1)).setRequestProperty("User-Agent", (new Utils(context)).getUserAgent());
        ((HttpURLConnection) (obj1)).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        ((HttpURLConnection) (obj1)).setRequestProperty("Content-Length", "0");
        ((HttpURLConnection) (obj1)).setConnectTimeout(4000);
        ((HttpURLConnection) (obj1)).setReadTimeout(5000);
        ((HttpURLConnection) (obj1)).setInstanceFollowRedirects(false);
        ((HttpURLConnection) (obj1)).connect();
        i = ((HttpURLConnection) (obj1)).getResponseCode();
        if (i != 301 && i != 302)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        obj1 = ((HttpURLConnection) (obj1)).getHeaderField("Location");
        obj = obj1;
          goto _L1
        context;
        obj1 = s;
        if (obj != null)
        {
            obj1 = s;
            if (((String) (obj)).length() > 0)
            {
                obj1 = obj;
            }
        }
        return ((String) (obj1));
    }

    public void firePixel(AdMarvelAd admarvelad)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (admarvelad == null || admarvelad.getPixels() == null) goto _L2; else goto _L1
_L1:
        admarvelad = admarvelad.getPixels().iterator();
_L5:
        if (admarvelad.hasNext()) goto _L3; else goto _L2
_L2:
        if (stringbuilder != null && stringbuilder.length() > 0)
        {
            if (!Thread.currentThread().getName().equalsIgnoreCase("main"))
            {
                break; /* Loop/switch isn't completed */
            }
            if (contextReference != null)
            {
                admarvelad = (Context)contextReference.get();
                if (admarvelad != null)
                {
                    (new WebView(admarvelad)).loadDataWithBaseURL(null, stringbuilder.toString(), "text/html", "utf-8", null);
                }
            }
        }
        return;
_L3:
        String s = (String)admarvelad.next();
        stringbuilder.append("<img src=\"").append(s).append("\" />");
        if (true) goto _L5; else goto _L4
_L4:
        mPixelHtml = stringbuilder.toString();
        handler.post(new Runnable() {

            final Utils this$0;

            public void run()
            {
                if (contextReference != null)
                {
                    Context context = (Context)contextReference.get();
                    if (context != null)
                    {
                        (new WebView(context)).loadDataWithBaseURL(null, mPixelHtml, "text/html", "utf-8", null);
                    }
                }
            }

            
            {
                this$0 = Utils.this;
                super();
            }
        });
        return;
    }

    public void firePixel(String s)
    {
        if (s != null && s.length() > 0)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("<img src=\"").append(s).append("\" />");
            if (stringbuilder != null && stringbuilder.length() > 0)
            {
                if (Thread.currentThread().getName().equalsIgnoreCase("main"))
                {
                    if (contextReference != null)
                    {
                        s = (Context)contextReference.get();
                        if (s != null)
                        {
                            (new WebView(s)).loadDataWithBaseURL(null, stringbuilder.toString(), "text/html", "utf-8", null);
                            return;
                        }
                    }
                } else
                {
                    mPixelHtml = stringbuilder.toString();
                    handler.post(new Runnable() {

                        final Utils this$0;

                        public void run()
                        {
                            if (contextReference != null)
                            {
                                Context context = (Context)contextReference.get();
                                if (context != null)
                                {
                                    (new WebView(context)).loadDataWithBaseURL(null, mPixelHtml, "text/html", "utf-8", null);
                                }
                            }
                        }

            
            {
                this$0 = Utils.this;
                super();
            }
                    });
                    return;
                }
            }
        }
    }

    public void firePixelUsingHTTP(String s, Handler handler1)
    {
        if (Version.getAndroidSDKVersion() >= 11 && handler1 != null)
        {
            try
            {
                handler1.post(new FirePixelUsingHTTPPostAPI11(s));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_50;
        }
        (new FirePixelTask(s)).execute(new Void[0]);
        return;
    }

    public String getUserAgent()
    {
        Object obj1;
        if (contextReference == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        obj1 = (Context)contextReference.get();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        Object obj;
        obj = android/webkit/WebSettings.getDeclaredConstructor(new Class[] {
            android/content/Context, android/webkit/WebView
        });
        ((Constructor) (obj)).setAccessible(true);
        obj1 = ((WebSettings)((Constructor) (obj)).newInstance(new Object[] {
            ((Context) (obj1)).getApplicationContext(), null
        })).getUserAgentString();
        ((Constructor) (obj)).setAccessible(false);
        return ((String) (obj1));
        Exception exception1;
        exception1;
        try
        {
            ((Constructor) (obj)).setAccessible(false);
            throw exception1;
        }
        catch (Exception exception) { }
        if (Thread.currentThread().getName().equalsIgnoreCase("main") && contextReference != null)
        {
            exception = (Context)contextReference.get();
            if (exception != null)
            {
                return (new WebView(exception)).getSettings().getUserAgentString();
            }
        }
        break MISSING_BLOCK_LABEL_148;
        exception = getUserAgentApprox();
        return exception;
        return getUserAgentApprox();
    }

    void registerTrackingEvent(String s)
    {
        if (Version.getAndroidSDKVersion() < 11) goto _L2; else goto _L1
_L1:
        handler.post(new AdMarvelInstallTrackerCleanupAsyncTaskRunnablePostAPI11(null));
_L7:
        Object obj1;
        AdMarvelXMLElement admarvelxmlelement;
        AdMarvelXMLReader admarvelxmlreader = new AdMarvelXMLReader();
        admarvelxmlreader.parseXMLString(s);
        s = admarvelxmlreader.getParsedXMLData();
        if (!s.getChildren().containsKey("trackers"))
        {
            break MISSING_BLOCK_LABEL_423;
        }
        admarvelxmlelement = (AdMarvelXMLElement)((ArrayList)s.getChildren().get("trackers")).get(0);
        obj1 = (String)admarvelxmlelement.getAttributes().get("id");
        if (!admarvelxmlelement.getChildren().containsKey("tracker")) goto _L4; else goto _L3
_L3:
        int j = ((ArrayList)admarvelxmlelement.getChildren().get("tracker")).size();
        int i;
        i = 0;
        s = null;
_L9:
        if (i < j) goto _L6; else goto _L5
_L5:
        Object obj = obj1;
_L8:
        if (obj == null || ((String) (obj)).length() <= 0)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        String s1;
        if (contextReference != null)
        {
            obj1 = (Context)contextReference.get();
        } else
        {
            obj1 = null;
        }
        if (obj1 == null || isAppInstalled(((Context) (obj1)), ((String) (obj))) || s == null)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        if (!s.isEmpty() && "mounted".equals(Environment.getExternalStorageState()))
        {
            obj = new File(Environment.getExternalStorageDirectory(), (new StringBuilder("/")).append(encodeString("adm_tracker_dir")).append("/").append(encodeString(((String) (obj)))).toString());
            ((File) (obj)).getParentFile().mkdirs();
            obj = new ObjectOutputStream(new FileOutputStream(((File) (obj))));
            ((ObjectOutputStream) (obj)).writeObject(s);
            ((ObjectOutputStream) (obj)).close();
        }
        return;
_L2:
        handler.post(new AdMarvelInstallTrackerCleanupAsyncTaskRunnable(null));
          goto _L7
        obj;
        s = null;
        obj1 = null;
_L10:
        Logging.log(Log.getStackTraceString(((Throwable) (obj))));
        obj = obj1;
          goto _L8
_L6:
        obj = (AdMarvelXMLElement)((ArrayList)admarvelxmlelement.getChildren().get("tracker")).get(i);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        s1 = ((AdMarvelXMLElement) (obj)).getData();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_366;
        }
        obj = new ArrayList();
        s = ((String) (obj));
        s.add(s1);
        i++;
          goto _L9
        s;
        Logging.log(Log.getStackTraceString(s));
        return;
        obj;
        s = null;
          goto _L10
        obj;
          goto _L10
        obj;
          goto _L10
_L4:
        s = null;
        obj = obj1;
          goto _L8
        s = null;
        obj = null;
          goto _L8
    }


}

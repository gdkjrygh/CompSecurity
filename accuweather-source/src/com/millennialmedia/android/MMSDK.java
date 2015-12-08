// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import org.apache.http.conn.util.InetAddressUtils;

// Referenced classes of package com.millennialmedia.android:
//            MMLog, HandShake, AdCache, MMRequest, 
//            MMAdImpl, MMConversionTracker, MMException, HttpGetRequest, 
//            RequestListener, CachedAd

public final class MMSDK
{
    static class Event
    {

        public static final String INTENT_CALENDAR_EVENT = "calendar";
        public static final String INTENT_EMAIL = "email";
        public static final String INTENT_EXTERNAL_BROWSER = "browser";
        public static final String INTENT_MAPS = "geo";
        public static final String INTENT_MARKET = "market";
        public static final String INTENT_PHONE_CALL = "tel";
        public static final String INTENT_STREAMING_VIDEO = "streamingVideo";
        public static final String INTENT_TXT_MESSAGE = "sms";
        private static final String KEY_ERROR = "error";
        static final String KEY_INTENT_TYPE = "intentType";
        static final String KEY_INTERNAL_ID = "internalId";
        static final String KEY_PACKAGE_NAME = "packageName";
        protected static final String TAG = com/millennialmedia/android/MMSDK$Event.getName();

        static void adSingleTap(MMAdImpl mmadimpl)
        {
            if (mmadimpl != null)
            {
                MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                    final MMAdImpl val$adImpl;

                    public void run()
                    {
                        if (adImpl == null || adImpl.requestListener == null)
                        {
                            break MISSING_BLOCK_LABEL_36;
                        }
                        adImpl.requestListener.onSingleTap(adImpl.getCallingAd());
                        return;
                        Exception exception;
                        exception;
                        MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                        return;
                    }

            
            {
                adImpl = mmadimpl;
                super();
            }
                });
                if (MMSDK.isBroadcastingEvents)
                {
                    sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_OVERLAY_TAP"), mmadimpl.internalId);
                    sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_AD_SINGLE_TAP"), mmadimpl.internalId);
                    return;
                }
            }
        }

        static void displayStarted(MMAdImpl mmadimpl)
        {
            if (mmadimpl == null)
            {
                MMLog.w("MMSDK", "No Context in the listener: ");
                return;
            }
            if (MMSDK.isBroadcastingEvents)
            {
                sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_DISPLAY_STARTED"), mmadimpl.internalId);
            }
            overlayOpened(mmadimpl);
        }

        static void fetchStartedCaching(MMAdImpl mmadimpl)
        {
            if (mmadimpl == null)
            {
                MMLog.w("MMSDK", "No Context in the listener: ");
            } else
            {
                MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                    final MMAdImpl val$adImpl;

                    public void run()
                    {
                        if (adImpl == null || adImpl.requestListener == null)
                        {
                            break MISSING_BLOCK_LABEL_36;
                        }
                        adImpl.requestListener.MMAdRequestIsCaching(adImpl.getCallingAd());
                        return;
                        Exception exception;
                        exception;
                        MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                        return;
                    }

            
            {
                adImpl = mmadimpl;
                super();
            }
                });
                if (MMSDK.isBroadcastingEvents)
                {
                    sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_FETCH_STARTED_CACHING"), mmadimpl.internalId);
                    return;
                }
            }
        }

        static void intentStarted(Context context, String s, long l)
        {
            if (MMSDK.isBroadcastingEvents && s != null)
            {
                sendIntent(context, (new Intent("millennialmedia.action.ACTION_INTENT_STARTED")).putExtra("intentType", s), l);
            }
        }

        protected static void logEvent(String s)
        {
            MMLog.d("Logging event to: %s", s);
            Utils.ThreadUtils.execute(new Runnable(s) {

                final String val$logString;

                public void run()
                {
                    HttpGetRequest httpgetrequest = new HttpGetRequest();
                    try
                    {
                        httpgetrequest.get(logString);
                        return;
                    }
                    catch (Exception exception)
                    {
                        MMLog.e(Event.TAG, "Error logging event: ", exception);
                    }
                }

            
            {
                logString = s;
                super();
            }
            });
        }

        static void overlayClosed(MMAdImpl mmadimpl)
        {
            if (mmadimpl == null)
            {
                MMLog.w("MMSDK", "No Context in the listener: ");
            } else
            {
                MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                    final MMAdImpl val$adImpl;

                    public void run()
                    {
                        if (adImpl == null)
                        {
                            break MISSING_BLOCK_LABEL_44;
                        }
                        adImpl.isOverlayLaunched = false;
                        if (adImpl.requestListener == null)
                        {
                            break MISSING_BLOCK_LABEL_44;
                        }
                        adImpl.requestListener.MMAdOverlayClosed(adImpl.getCallingAd());
                        return;
                        Exception exception;
                        exception;
                        MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                        return;
                    }

            
            {
                adImpl = mmadimpl;
                super();
            }
                });
                if (MMSDK.isBroadcastingEvents && mmadimpl.getContext() != null)
                {
                    sendIntent(mmadimpl.getContext(), new Intent("millennialmedia.action.ACTION_OVERLAY_CLOSED"), mmadimpl.internalId);
                    return;
                }
            }
        }

        static void overlayOpened(MMAdImpl mmadimpl)
        {
            if (mmadimpl == null)
            {
                MMLog.w("MMSDK", "No Context in the listener: ");
                return;
            } else
            {
                MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                    final MMAdImpl val$adImpl;

                    public void run()
                    {
                        if (adImpl == null)
                        {
                            break MISSING_BLOCK_LABEL_44;
                        }
                        adImpl.isOverlayLaunched = true;
                        if (adImpl.requestListener == null)
                        {
                            break MISSING_BLOCK_LABEL_44;
                        }
                        adImpl.requestListener.MMAdOverlayLaunched(adImpl.getCallingAd());
                        return;
                        Exception exception;
                        exception;
                        MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                        return;
                    }

            
            {
                adImpl = mmadimpl;
                super();
            }
                });
                overlayOpenedBroadCast(mmadimpl.getContext(), mmadimpl.internalId);
                return;
            }
        }

        static void overlayOpenedBroadCast(Context context, long l)
        {
            if (MMSDK.isBroadcastingEvents)
            {
                sendIntent(context, new Intent("millennialmedia.action.ACTION_OVERLAY_OPENED"), l);
            }
        }

        static void requestCompleted(MMAdImpl mmadimpl)
        {
            if (mmadimpl == null)
            {
                MMLog.w("MMSDK", "No Context in the listener: ");
            } else
            {
                MMSDK.runOnUiThread(new Runnable(mmadimpl) {

                    final MMAdImpl val$adImpl;

                    public void run()
                    {
                        if (adImpl == null || adImpl.requestListener == null)
                        {
                            break MISSING_BLOCK_LABEL_36;
                        }
                        adImpl.requestListener.requestCompleted(adImpl.getCallingAd());
                        return;
                        Exception exception;
                        exception;
                        MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                        return;
                    }

            
            {
                adImpl = mmadimpl;
                super();
            }
                });
                if (MMSDK.isBroadcastingEvents)
                {
                    String s = mmadimpl.getRequestCompletedAction();
                    sendIntent(mmadimpl.getContext(), new Intent(s), mmadimpl.internalId);
                    return;
                }
            }
        }

        static void requestFailed(MMAdImpl mmadimpl, MMException mmexception)
        {
            if (mmadimpl == null)
            {
                MMLog.w("MMSDK", "No Context in the listener: ");
            } else
            {
                MMSDK.runOnUiThread(new Runnable(mmadimpl, mmexception) {

                    final MMAdImpl val$adImpl;
                    final MMException val$error;

                    public void run()
                    {
                        if (adImpl == null || adImpl.requestListener == null)
                        {
                            break MISSING_BLOCK_LABEL_40;
                        }
                        adImpl.requestListener.requestFailed(adImpl.getCallingAd(), error);
                        return;
                        Exception exception;
                        exception;
                        MMLog.e("MMSDK", "Exception raised in your RequestListener: ", exception);
                        return;
                    }

            
            {
                adImpl = mmadimpl;
                error = mmexception;
                super();
            }
                });
                if (MMSDK.isBroadcastingEvents)
                {
                    String s = mmadimpl.getRequestFailedAction();
                    sendIntent(mmadimpl.getContext(), (new Intent(s)).putExtra("error", mmexception), mmadimpl.internalId);
                    return;
                }
            }
        }

        private static final void sendIntent(Context context, Intent intent, long l)
        {
            if (context != null)
            {
                intent.addCategory("millennialmedia.category.CATEGORY_SDK");
                if (l != -4L)
                {
                    intent.putExtra("internalId", l);
                }
                intent.putExtra("packageName", context.getPackageName());
                String s = intent.getStringExtra("intentType");
                if (!TextUtils.isEmpty(s))
                {
                    s = String.format(" Type[%s]", new Object[] {
                        s
                    });
                } else
                {
                    s = "";
                }
                MMLog.v("MMSDK", (new StringBuilder()).append(" @@ Intent: ").append(intent.getAction()).append(" ").append(s).append(" for ").append(l).toString());
                context.sendBroadcast(intent);
            }
        }


        Event()
        {
        }
    }


    private static final String BASE_URL_TRACK_EVENT = "http://ads.mp.mydas.mobi/pixel?id=";
    static final int CACHE_REQUEST_TIMEOUT = 30000;
    static final int CLOSE_ACTIVITY_DURATION = 400;
    static String COMMA = ",";
    public static final String DEFAULT_APID = "28911";
    public static final String DEFAULT_BANNER_APID = "28913";
    public static final String DEFAULT_RECT_APID = "28914";
    static final String EMPTY = "";
    static final int HANDSHAKE_REQUEST_TIMEOUT = 3000;
    static final String JSON_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss ZZZZ";
    public static final int LOG_LEVEL_DEBUG = 1;
    public static final int LOG_LEVEL_ERROR = 0;
    public static final int LOG_LEVEL_INFO = 2;
    public static final int LOG_LEVEL_INTERNAL = 4;
    public static final int LOG_LEVEL_PRIVATE_VERBOSE = 5;
    public static final int LOG_LEVEL_VERBOSE = 3;
    static final int OPEN_ACTIVITY_DURATION = 600;
    static final String PREFS_NAME = "MillennialMediaSettings";
    static final int REQUEST_TIMEOUT = 10000;
    public static final String SDKLOG = "MMSDK";
    public static final String VERSION = "5.4.0-c325424f.a";
    static boolean disableAdMinRefresh = false;
    private static String getMMdidValue = null;
    private static boolean hasSpeechKit = false;
    private static boolean isBroadcastingEvents;
    static int logLevel;
    static String macId;
    static Handler mainHandler = new Handler(Looper.getMainLooper());
    private static int nextDefaultId = 0x711e41a1;

    private MMSDK()
    {
    }

    static String byteArrayToString(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        for (int i = 0; i < abyte0.length; i++)
        {
            stringbuilder.append(String.format("%02X", new Object[] {
                Byte.valueOf(abyte0[i])
            }));
        }

        return stringbuilder.toString();
    }

    static void checkActivity(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        try
        {
            packagemanager.getActivityInfo(new ComponentName(context, "com.millennialmedia.android.MMActivity"), 128);
            return;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            MMLog.e("MMSDK", "Activity MMActivity not declared in AndroidManifest.xml", namenotfoundexception);
            namenotfoundexception.printStackTrace();
            createMissingPermissionDialog(context, "MMActivity class").show();
            return;
        }
    }

    static void checkPermissions(Context context)
    {
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
        {
            createMissingPermissionDialog(context, "INTERNET permission").show();
        }
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == -1)
        {
            createMissingPermissionDialog(context, "ACCESS_NETWORK_STATE permission").show();
        }
    }

    private static AlertDialog createMissingPermissionDialog(Context context, String s)
    {
        context = (new android.app.AlertDialog.Builder(context)).create();
        context.setTitle("Whoops!");
        context.setMessage(String.format("The developer has forgot to declare the %s in the manifest file. Please reach out to the developer to remove this error.", new Object[] {
            s
        }));
        context.setButton(-3, "OK", new android.content.DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.cancel();
            }

        });
        context.show();
        return context;
    }

    static String getAaid(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
    {
        if (info == null)
        {
            return null;
        } else
        {
            return info.getId();
        }
    }

    static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingInfo(Context context)
    {
        try
        {
            context = AdvertisingIdClient.getAdvertisingIdInfo(context.getApplicationContext());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MMLog.e("MMSDK", "Unrecoverable error connecting to Google Play services (e.g.,the old version of the service doesnt support getting AdvertisingId", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MMLog.e("MMSDK", "Google Play services is not available entirely.", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MMLog.e("MMSDK", "IllegalStateException: ", context);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MMLog.e("MMSDK", "Google Play Services is not installed, up-to-date, or enabled", context);
            return null;
        }
        return context;
    }

    public static boolean getBroadcastEvents()
    {
        return isBroadcastingEvents;
    }

    static String getCn(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
    }

    static Configuration getConfiguration(Context context)
    {
        return context.getResources().getConfiguration();
    }

    static String getConnectionType(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            return "unknown";
        }
        if (context.getActiveNetworkInfo() != null && context.getActiveNetworkInfo().isConnected())
        {
            int i = context.getActiveNetworkInfo().getType();
            int j = context.getActiveNetworkInfo().getSubtype();
            if (i == 1)
            {
                return "wifi";
            }
            if (i == 0)
            {
                switch (j)
                {
                default:
                    return "unknown";

                case 7: // '\007'
                    return "1xrtt";

                case 4: // '\004'
                    return "cdma";

                case 2: // '\002'
                    return "edge";

                case 14: // '\016'
                    return "ehrpd";

                case 5: // '\005'
                    return "evdo_0";

                case 6: // '\006'
                    return "evdo_a";

                case 12: // '\f'
                    return "evdo_b";

                case 1: // '\001'
                    return "gprs";

                case 8: // '\b'
                    return "hsdpa";

                case 10: // '\n'
                    return "hspa";

                case 15: // '\017'
                    return "hspap";

                case 9: // '\t'
                    return "hsupa";

                case 11: // '\013'
                    return "iden";

                case 13: // '\r'
                    return "lte";

                case 3: // '\003'
                    return "umts";
                }
            } else
            {
                return "unknown";
            }
        } else
        {
            return "offline";
        }
    }

    public static int getDefaultAdId()
    {
        com/millennialmedia/android/MMSDK;
        JVM INSTR monitorenter ;
        int i;
        i = nextDefaultId + 1;
        nextDefaultId = i;
        com/millennialmedia/android/MMSDK;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        com/millennialmedia/android/MMSDK;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static float getDensity(Context context)
    {
        return context.getResources().getDisplayMetrics().density;
    }

    private static String getDensityString(Context context)
    {
        return Float.toString(getDensity(context));
    }

    static String getDpiHeight(Context context)
    {
        return Integer.toString(context.getResources().getDisplayMetrics().heightPixels);
    }

    static String getDpiWidth(Context context)
    {
        return Integer.toString(context.getResources().getDisplayMetrics().widthPixels);
    }

    static String getIpAddress(Context context)
    {
        StringBuilder stringbuilder;
        Enumeration enumeration;
        stringbuilder = new StringBuilder();
        enumeration = NetworkInterface.getNetworkInterfaces();
_L6:
        Enumeration enumeration1;
        if (!enumeration.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_144;
        }
        enumeration1 = ((NetworkInterface)enumeration.nextElement()).getInetAddresses();
_L3:
        do
        {
            if (!enumeration1.hasMoreElements())
            {
                continue; /* Loop/switch isn't completed */
            }
            context = (InetAddress)enumeration1.nextElement();
        } while (context.isLoopbackAddress());
        if (stringbuilder.length() > 0)
        {
            stringbuilder.append(',');
        }
        context = context.getHostAddress().toUpperCase();
        if (!InetAddressUtils.isIPv4Address(context)) goto _L2; else goto _L1
_L1:
        stringbuilder.append(context);
          goto _L3
_L2:
        int i;
        try
        {
            i = context.indexOf('%');
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            MMLog.e("MMSDK", "Exception getting ip information: ", context);
            return "";
        }
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_133;
        }
_L4:
        stringbuilder.append(context);
          goto _L3
        continue; /* Loop/switch isn't completed */
        context = context.substring(0, i);
          goto _L4
        context = stringbuilder.toString();
        return context;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static int getLogLevel()
    {
        return MMLog.getLogLevel();
    }

    static String getMMdid(Context context)
    {
        Object obj = null;
        com/millennialmedia/android/MMSDK;
        JVM INSTR monitorenter ;
        if (getMMdidValue == null) goto _L2; else goto _L1
_L1:
        context = getMMdidValue;
_L4:
        com/millennialmedia/android/MMSDK;
        JVM INSTR monitorexit ;
        return context;
_L2:
        String s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        context = obj;
        if (s == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = new StringBuilder("mmh_");
        context.append(byteArrayToString(MessageDigest.getInstance("MD5").digest(s.getBytes())));
        context.append("_");
        context.append(byteArrayToString(MessageDigest.getInstance("SHA1").digest(s.getBytes())));
        context = context.toString();
        getMMdidValue = context;
        continue; /* Loop/switch isn't completed */
        context;
        throw context;
        context;
        MMLog.e("MMSDK", "Exception calculating hash: ", context);
        context = obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static String getMcc(Context context)
    {
        Configuration configuration = getConfiguration(context);
        if (configuration.mcc == 0)
        {
            context = getNetworkOperator(context);
            if (context != null && context.length() >= 6)
            {
                return context.substring(0, 3);
            }
        }
        return String.valueOf(configuration.mcc);
    }

    static int getMediaVolume(Context context)
    {
        return ((AudioManager)context.getApplicationContext().getSystemService("audio")).getStreamVolume(3);
    }

    static String getMnc(Context context)
    {
        Configuration configuration = getConfiguration(context);
        if (configuration.mnc == 0)
        {
            context = getNetworkOperator(context);
            if (context != null && context.length() >= 6)
            {
                return context.substring(3);
            }
        }
        return String.valueOf(configuration.mnc);
    }

    static String getNetworkOperator(Context context)
    {
        return ((TelephonyManager)context.getSystemService("phone")).getNetworkOperator();
    }

    static String getOrientation(Context context)
    {
        switch (context.getResources().getConfiguration().orientation)
        {
        default:
            return "default";

        case 1: // '\001'
            return "portrait";

        case 2: // '\002'
            return "landscape";

        case 3: // '\003'
            return "square";
        }
    }

    static final String getOrientationLocked(Context context)
    {
        if (android.provider.Settings.System.getString(context.getContentResolver(), "accelerometer_rotation").equals("1"))
        {
            return "false";
        } else
        {
            return "true";
        }
    }

    static boolean getSupportsCalendar()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }

    static String getSupportsSms(Context context)
    {
        return String.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.telephony"));
    }

    static String getSupportsTel(Context context)
    {
        return String.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.telephony"));
    }

    static boolean hasMicrophone(Context context)
    {
        return context.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    static boolean hasRecordAudioPermission(Context context)
    {
        return context.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0;
    }

    static boolean hasSetTranslationMethod()
    {
        return Integer.parseInt(android.os.Build.VERSION.SDK) >= 11;
    }

    private static String hasSpeechKit(Context context)
    {
        if (hasSpeechKit && hasRecordAudioPermission(context))
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    public static void initialize(Context context)
    {
        context = HandShake.sharedHandShake(context);
        context.sendInitRequest();
        context.startSession();
    }

    static void insertUrlCommonValues(Context context, Map map)
    {
        Object obj;
        MMLog.d("MMSDK", "executing getIDThread");
        map.put("density", getDensityString(context));
        map.put("hpx", getDpiHeight(context));
        map.put("wpx", getDpiWidth(context));
        map.put("sk", hasSpeechKit(context));
        map.put("mic", Boolean.toString(hasMicrophone(context)));
        String s = null;
        Object obj2 = "true";
        obj = s;
        Object obj1 = obj2;
        if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0)
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = getAdvertisingInfo(context);
            obj = s;
            obj1 = obj2;
            if (info != null)
            {
                s = getAaid(info);
                obj = s;
                obj1 = obj2;
                if (s != null)
                {
                    obj = s;
                    obj1 = obj2;
                    if (info.isLimitAdTrackingEnabled())
                    {
                        obj1 = "false";
                        obj = s;
                    }
                }
            }
        }
        float f;
        String s1;
        if (obj != null)
        {
            map.put("aaid", obj);
            map.put("ate", obj1);
        } else
        {
            obj = getMMdid(context);
            if (obj != null)
            {
                map.put("mmdid", obj);
            }
        }
        if (isCachedVideoSupportedOnDevice(context))
        {
            map.put("cachedvideo", "true");
        } else
        {
            map.put("cachedvideo", "false");
        }
        if (Build.MODEL != null)
        {
            map.put("dm", Build.MODEL);
        }
        if (android.os.Build.VERSION.RELEASE != null)
        {
            map.put("dv", (new StringBuilder()).append("Android").append(android.os.Build.VERSION.RELEASE).toString());
        }
        map.put("sdkversion", "5.4.0-c325424f.a");
        map.put("mcc", getMcc(context));
        map.put("mnc", getMnc(context));
        obj = getCn(context);
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            map.put("cn", obj);
        }
        obj = Locale.getDefault();
        if (obj != null)
        {
            map.put("language", ((Locale) (obj)).getLanguage());
            map.put("country", ((Locale) (obj)).getCountry());
        }
        try
        {
            obj = context.getPackageName();
            map.put("pkid", obj);
            obj1 = context.getPackageManager();
            map.put("pknm", ((PackageManager) (obj1)).getApplicationLabel(((PackageManager) (obj1)).getApplicationInfo(((String) (obj)), 0)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            MMLog.e("MMSDK", "Can't insert package information", ((Throwable) (obj)));
        }
        obj = HandShake.sharedHandShake(context).getSchemesList(context);
        if (obj != null)
        {
            map.put("appsids", obj);
        }
        obj = AdCache.getCachedVideoList(context);
        if (obj != null)
        {
            map.put("vid", obj);
        }
        s = getConnectionType(context);
        if (!AdCache.isExternalStorageAvailable(context)) goto _L2; else goto _L1
_L1:
        obj = new StatFs(AdCache.getCacheDirectory(context).getAbsolutePath());
_L3:
        s1 = Long.toString((long)((StatFs) (obj)).getAvailableBlocks() * (long)((StatFs) (obj)).getBlockSize());
        obj1 = null;
        obj = null;
        obj2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_584;
        }
        if (((Intent) (obj2)).getIntExtra("plugged", 0) == 0)
        {
            obj = "false";
        } else
        {
            obj = "true";
        }
        f = 100F / (float)((Intent) (obj2)).getIntExtra("scale", 100);
        obj2 = Integer.toString((int)((float)((Intent) (obj2)).getIntExtra("level", 0) * f));
        obj1 = obj;
        obj = obj2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        if (((String) (obj)).length() > 0)
        {
            map.put("bl", obj);
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_631;
        }
        if (((String) (obj1)).length() > 0)
        {
            map.put("plugged", obj1);
        }
        if (s1.length() > 0)
        {
            map.put("space", s1);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        map.put("conn", s);
        context = URLEncoder.encode(getIpAddress(context), "UTF-8");
        if (!TextUtils.isEmpty(context))
        {
            map.put("pip", context);
        }
_L4:
        MMRequest.insertLocation(map);
        return;
_L2:
        obj = new StatFs(context.getFilesDir().getPath());
          goto _L3
        context;
        MMLog.e("MMSDK", "Exception inserting common parameters: ", context);
          goto _L4
    }

    static boolean isCachedVideoSupportedOnDevice(Context context)
    {
        return context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != -1 && (!android.os.Build.VERSION.SDK.equalsIgnoreCase("8") || Environment.getExternalStorageState().equals("mounted") && AdCache.isExternalEnabled);
    }

    static boolean isConnected(Context context)
    {
        boolean flag = true;
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            return false;
        }
        if (context.getActiveNetworkInfo() == null || !context.getActiveNetworkInfo().isConnected())
        {
            flag = false;
        }
        return flag;
    }

    static boolean isUiThread()
    {
        return mainHandler.getLooper() == Looper.myLooper();
    }

    static void printDiagnostics(MMAdImpl mmadimpl)
    {
        if (mmadimpl != null)
        {
            Context context = mmadimpl.getContext();
            MMLog.i("MMSDK", String.format("MMAd External ID: %d", new Object[] {
                Integer.valueOf(mmadimpl.getId())
            }));
            MMLog.i("MMSDK", String.format("MMAd Internal ID: %d", new Object[] {
                Long.valueOf(mmadimpl.internalId)
            }));
            MMLog.i("MMSDK", String.format("APID: %s", new Object[] {
                mmadimpl.apid
            }));
            if (AdCache.isExternalStorageAvailable(context))
            {
                mmadimpl = "";
            } else
            {
                mmadimpl = "not ";
            }
            MMLog.i("MMSDK", String.format("SD card is %savailable.", new Object[] {
                mmadimpl
            }));
            if (context != null)
            {
                MMLog.i("MMSDK", String.format("Package: %s", new Object[] {
                    context.getPackageName()
                }));
                MMLog.i("MMSDK", String.format("MMDID: %s", new Object[] {
                    getMMdid(context)
                }));
                MMLog.i("MMSDK", "Permissions:");
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == -1)
                {
                    mmadimpl = "not ";
                } else
                {
                    mmadimpl = "";
                }
                MMLog.i("MMSDK", String.format("android.permission.ACCESS_NETWORK_STATE is %spresent", new Object[] {
                    mmadimpl
                }));
                if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1)
                {
                    mmadimpl = "not ";
                } else
                {
                    mmadimpl = "";
                }
                MMLog.i("MMSDK", String.format("android.permission.INTERNET is %spresent", new Object[] {
                    mmadimpl
                }));
                if (context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1)
                {
                    mmadimpl = "not ";
                } else
                {
                    mmadimpl = "";
                }
                MMLog.i("MMSDK", String.format("android.permission.WRITE_EXTERNAL_STORAGE is %spresent", new Object[] {
                    mmadimpl
                }));
                if (context.checkCallingOrSelfPermission("android.permission.VIBRATE") == -1)
                {
                    mmadimpl = "not ";
                } else
                {
                    mmadimpl = "";
                }
                MMLog.i("MMSDK", String.format("android.permission.VIBRATE is %spresent", new Object[] {
                    mmadimpl
                }));
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == -1)
                {
                    mmadimpl = "not ";
                } else
                {
                    mmadimpl = "";
                }
                MMLog.i("MMSDK", String.format("android.permission.ACCESS_COARSE_LOCATION is %spresent", new Object[] {
                    mmadimpl
                }));
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == -1)
                {
                    mmadimpl = "not ";
                } else
                {
                    mmadimpl = "";
                }
                MMLog.i("MMSDK", String.format("android.permission.ACCESS_FINE_LOCATION is %spresent", new Object[] {
                    mmadimpl
                }));
                MMLog.i("MMSDK", "Cached Ads:");
                AdCache.iterateCachedAds(context, 2, new AdCache.Iterator(context) {

                    final Context val$context;

                    boolean callback(CachedAd cachedad)
                    {
                        String s1 = cachedad.getTypeString();
                        String s2 = cachedad.getId();
                        String s;
                        if (cachedad.isOnDisk(context))
                        {
                            s = "";
                        } else
                        {
                            s = "not ";
                        }
                        if (cachedad.isExpired())
                        {
                            cachedad = "";
                        } else
                        {
                            cachedad = "not ";
                        }
                        MMLog.i("MMSDK", String.format("%s %s is %son disk. Is %sexpired.", new Object[] {
                            s1, s2, s, cachedad
                        }));
                        return true;
                    }

            
            {
                context = context1;
                super();
            }
                });
                return;
            }
        }
    }

    static boolean removeAccelForJira1164()
    {
        return Integer.parseInt(android.os.Build.VERSION.SDK) >= 14;
    }

    public static void resetCache(Context context)
    {
        AdCache.resetCache(context);
    }

    static void runOnUiThread(Runnable runnable)
    {
        if (isUiThread())
        {
            runnable.run();
            return;
        } else
        {
            mainHandler.post(runnable);
            return;
        }
    }

    static void runOnUiThreadDelayed(Runnable runnable, long l)
    {
        mainHandler.postDelayed(runnable, l);
    }

    public static void setBroadcastEvents(boolean flag)
    {
        isBroadcastingEvents = flag;
    }

    public static void setLogLevel(int i)
    {
        switch (i)
        {
        default:
            MMLog.setLogLevel(4);
            return;

        case 1: // '\001'
            MMLog.setLogLevel(3);
            return;

        case 2: // '\002'
            MMLog.setLogLevel(4);
            return;

        case 3: // '\003'
            MMLog.setLogLevel(2);
            return;

        case 0: // '\0'
            MMLog.setLogLevel(6);
            return;
        }
    }

    static void setMMdid(String s)
    {
        com/millennialmedia/android/MMSDK;
        JVM INSTR monitorenter ;
        getMMdidValue = s;
        com/millennialmedia/android/MMSDK;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    static boolean supportsFullScreenInline()
    {
        return Integer.parseInt(android.os.Build.VERSION.SDK) >= 11;
    }

    public static void trackConversion(Context context, String s)
    {
        MMConversionTracker.trackConversion(context, s, null);
    }

    public static void trackConversion(Context context, String s, MMRequest mmrequest)
    {
        MMConversionTracker.trackConversion(context, s, mmrequest);
    }

    public static void trackEvent(Context context, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            context = getMMdid(context);
            if (!TextUtils.isEmpty(context))
            {
                Utils.HttpUtils.executeUrl((new StringBuilder()).append("http://ads.mp.mydas.mobi/pixel?id=").append(s).append("&mmdid=").append(context).toString());
            }
        }
    }

    static 
    {
        try
        {
            System.loadLibrary("nmsp_speex");
            hasSpeechKit = true;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror) { }
    }

}

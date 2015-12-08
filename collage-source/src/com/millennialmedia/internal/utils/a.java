// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.internal.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.Camera;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.millennialmedia.c;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.conn.util.InetAddressUtils;

// Referenced classes of package com.millennialmedia.internal.utils:
//            f, ThreadUtils

public class a
{

    private static final String a = com/millennialmedia/internal/utils/a.getSimpleName();
    private static Application b;
    private static Context c;
    private static String d;
    private static boolean e;
    private static boolean f;
    private static boolean g;
    private static boolean h;
    private static boolean i;
    private static boolean j;
    private static boolean k;
    private static boolean l;
    private static Integer m;
    private static a n;

    public a()
    {
    }

    public static String A()
    {
        if (m != null)
        {
            return m.toString();
        } else
        {
            return null;
        }
    }

    public static String B()
    {
        Object obj = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
_L2:
        Object obj1;
        if (!((Iterator) (obj)).hasNext())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj1 = Collections.list(((NetworkInterface)((Iterator) (obj)).next()).getInetAddresses()).iterator();
_L4:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        InetAddress inetaddress = (InetAddress)((Iterator) (obj1)).next();
        if (inetaddress.isLoopbackAddress()) goto _L4; else goto _L3
_L3:
        obj1 = inetaddress.getHostAddress().toUpperCase();
        if (InetAddressUtils.isIPv4Address(((String) (obj1))))
        {
            return ((String) (obj1));
        }
        int i1 = ((String) (obj1)).indexOf('%');
        obj = obj1;
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj = ((String) (obj1)).substring(0, i1);
        return ((String) (obj));
        obj;
        com.millennialmedia.c.c(a, "Unable to determine IP address for device", ((Throwable) (obj)));
        obj = null;
        return ((String) (obj));
    }

    public static String C()
    {
        if (f)
        {
            return ((WifiManager)c.getSystemService("wifi")).getConnectionInfo().getBSSID();
        } else
        {
            return null;
        }
    }

    public static int D()
    {
        return c.getResources().getConfiguration().orientation;
    }

    public static String E()
    {
        switch (c.getResources().getConfiguration().orientation)
        {
        default:
            return G();

        case 1: // '\001'
            return "portrait";

        case 2: // '\002'
            return "landscape";
        }
    }

    public static int F()
    {
        WindowManager windowmanager = (WindowManager)c.getSystemService("window");
        Configuration configuration = c.getResources().getConfiguration();
        int i1 = windowmanager.getDefaultDisplay().getRotation();
        if (configuration.orientation == 2 && (i1 == 0 || i1 == 2))
        {
            return 2;
        }
        return configuration.orientation != 1 || i1 != 1 && i1 != 3 ? 1 : 2;
    }

    public static String G()
    {
        if (F() == 2)
        {
            return "landscape";
        } else
        {
            return "portrait";
        }
    }

    public static Location H()
    {
        if (g)
        {
            LocationManager locationmanager = (LocationManager)c.getSystemService("location");
            if (locationmanager != null)
            {
                return locationmanager.getLastKnownLocation("passive");
            }
        }
        return null;
    }

    public static boolean I()
    {
        return c.getPackageManager().hasSystemFeature("android.hardware.location.gps");
    }

    public static boolean J()
    {
        return g;
    }

    public static boolean K()
    {
        return c.getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean L()
    {
        return l;
    }

    public static a M()
    {
        return n;
    }

    public static boolean N()
    {
        return c.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
    }

    public static boolean O()
    {
        return j;
    }

    public static boolean P()
    {
        return c.getPackageManager().hasSystemFeature("android.hardware.nfc");
    }

    public static boolean Q()
    {
        return k;
    }

    public static boolean R()
    {
        return ((AudioManager)c.getSystemService("audio")).isWiredHeadsetOn();
    }

    public static File S()
    {
        File file = new File((new StringBuilder()).append(c.getFilesDir()).append("/.com.millennialmedia/").toString());
        file.mkdirs();
        return file;
    }

    public static boolean T()
    {
        return c.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    public static boolean U()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }

    public static boolean V()
    {
        return c.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    static String W()
    {
        return a;
    }

    static Integer X()
    {
        return m;
    }

    private static Intent Y()
    {
        return c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    public static int a(int i1)
    {
        switch (i1)
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 10: // '\n'
        default:
            return D();

        case 0: // '\0'
        case 6: // '\006'
        case 8: // '\b'
        case 11: // '\013'
            return 2;

        case 1: // '\001'
        case 7: // '\007'
        case 9: // '\t'
        case 12: // '\f'
            return 1;

        case -1: 
            return 0;
        }
    }

    public static Application a()
    {
        return b;
    }

    static Integer a(Integer integer)
    {
        m = integer;
        return integer;
    }

    public static String a(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
    {
        if (info == null)
        {
            com.millennialmedia.c.d(a, "Unable to get aaid value");
            return null;
        } else
        {
            return info.getId();
        }
    }

    public static String a(String s1)
    {
        Object obj = null;
        com/millennialmedia/internal/utils/a;
        JVM INSTR monitorenter ;
        String s3 = android.provider.Settings.Secure.getString(c.getContentResolver(), "android_id");
        if (s3 != null) goto _L2; else goto _L1
_L1:
        s1 = obj;
_L4:
        com/millennialmedia/internal/utils/a;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        String s2 = com.millennialmedia.internal.utils.f.a(MessageDigest.getInstance(s1).digest(s3.getBytes())).toString();
        s1 = s2;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        com.millennialmedia.c.c(a, (new StringBuilder()).append("Exception calculating <").append(s1).append("> hashed device id with ANDROID_ID <").append(s3).append(">").toString(), exception);
        s1 = obj;
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        throw s1;
    }

    public static void a(Activity activity)
    {
        int i1 = 0;
        b = activity.getApplication();
        c = activity.getApplicationContext();
    /* block-local class not found */
    class a {}

        int j1;
        boolean flag;
        if (c.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if (c.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (c.checkCallingOrSelfPermission("android.permission.WRITE_CALENDAR") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (c.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (c.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (c.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (c.checkCallingOrSelfPermission("android.permission.NFC") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if (c.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        ((TelephonyManager)activity.getSystemService("phone")).listen(new _cls1(), 256);
        com.millennialmedia.internal.utils.ThreadUtils.c(new EnvironmentUtils._cls2());
        n = new a();
        n.a = false;
        n.b = false;
        activity = new android.hardware.Camera.CameraInfo();
        j1 = Camera.getNumberOfCameras();
        while (i1 < j1) 
        {
            Camera.getCameraInfo(i1, activity);
            if (((android.hardware.Camera.CameraInfo) (activity)).facing == 1)
            {
                n.a = true;
            } else
            if (((android.hardware.Camera.CameraInfo) (activity)).facing == 0)
            {
                n.b = true;
            }
            i1++;
        }
        com.millennialmedia.c.b(a, (new StringBuilder()).append("Environment initialized with the following data.\n\tMillennial Media Ad SDK version: 6.1.0-5323db4\n\tAndroid SDK version: ").append(android.os.Build.VERSION.SDK_INT).append("\n\tApplication name: ").append(n()).append("\n\tApplication id: ").append(o()).append("\n\tLocale country ").append(m()).append("\n\tLocale language: ").append(l()).append("\n\tUser agent: ").append(p()).append("\n\tExternal storage available: ").append(v()).append("\n\tDisplay width: ").append(f()).append("\n\tDisplay height: ").append(e()).append("\n\tDisplay density: ").append(c()).append("\n\tDisplay dpi: ").append(d()).append("\n\tNatural screen orientation: ").append(G()).append("\n\tWRITE_EXTERNAL_STORAGE permission available: ").append(e).append("\n\tACCESS_WIFI_STATE permission available: ").append(f).append("\n\tWRITE_CALENDAR permission available: ").append(h).append("\n\tACCESS_FINE_LOCATION permission available: ").append(g).append("\n\tVIBRATE permission available: ").append(i).append("\n\tBLUETOOTH permission available: ").append(j).append("\n\tNFC permission available: ").append(k).append("\n\tRECORD_AUDIO permission available: ").append(l).append("\n\tFront camera available: ").append(n.a).append("\n\tBack camera available: ").append(n.b).append("\n\n").toString());
    }

    public static int b(int i1)
    {
        AudioManager audiomanager = (AudioManager)c.getSystemService("audio");
        int j1 = audiomanager.getStreamMaxVolume(i1);
        if (j1 < 1)
        {
            return 0;
        } else
        {
            float f1 = 100F / (float)j1;
            return (int)((float)audiomanager.getStreamVolume(i1) * f1);
        }
    }

    private static long b(String s1)
    {
        s1 = new StatFs(s1);
        long l1 = s1.getBlockSize();
        return (long)s1.getAvailableBlocks() * l1;
    }

    public static Context b()
    {
        return c;
    }

    public static boolean b(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
    {
        if (info == null)
        {
            com.millennialmedia.c.d(a, "Unable to get limit ad tracking value, ad info is null");
            return false;
        } else
        {
            return info.isLimitAdTrackingEnabled();
        }
    }

    public static float c()
    {
        return c.getResources().getDisplayMetrics().density;
    }

    public static int d()
    {
        return c.getResources().getDisplayMetrics().densityDpi;
    }

    public static int e()
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            Display display = ((WindowManager)c.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            display.getRealSize(point);
            return point.y;
        } else
        {
            return c.getResources().getDisplayMetrics().heightPixels;
        }
    }

    public static int f()
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            Display display = ((WindowManager)c.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            display.getRealSize(point);
            return point.x;
        } else
        {
            return c.getResources().getDisplayMetrics().widthPixels;
        }
    }

    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info g()
    {
        if (ThreadUtils.b())
        {
            com.millennialmedia.c.d(a, "Unable to get AdInfo instance on UI thread!");
        } else
        if (com.google.android.gms.common.e.a(c) == 0)
        {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
            try
            {
                info = AdvertisingIdClient.getAdvertisingIdInfo(c);
            }
            catch (IOException ioexception)
            {
                com.millennialmedia.c.c(a, "Unable to get google play services advertising info, google play services (e.g., the old version of the service doesn't support getting advertising ID)", ioexception);
                return null;
            }
            catch (com.google.android.gms.common.c c1)
            {
                com.millennialmedia.c.c(a, "Unable to get google play services advertising info, google play services is not available", c1);
                return null;
            }
            catch (IllegalStateException illegalstateexception)
            {
                com.millennialmedia.c.c(a, "Unable to get google play services advertising info, illegal state", illegalstateexception);
                return null;
            }
            catch (d d1)
            {
                com.millennialmedia.c.c(a, "Unable to get google play services advertising info, google play services is not installed, up-to-date, or enabled", d1);
                return null;
            }
            return info;
        }
        return null;
    }

    public static Integer h()
    {
        Object obj;
        obj = c.getResources().getConfiguration();
        if (((Configuration) (obj)).mcc != 0)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        obj = j();
        if (obj == null || ((String) (obj)).length() < 6)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        int i1 = Integer.parseInt(((String) (obj)).substring(0, 3));
        return Integer.valueOf(i1);
        obj;
        com.millennialmedia.c.b(a, "Unable to parse mcc from network operator", ((Throwable) (obj)));
        com.millennialmedia.c.c(a, "Unable to retrieve mcc");
        return null;
        return Integer.valueOf(((Configuration) (obj)).mcc);
    }

    public static Integer i()
    {
        Object obj;
        obj = c.getResources().getConfiguration();
        if (((Configuration) (obj)).mnc != 0)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = j();
        if (obj == null || ((String) (obj)).length() < 6)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        int i1 = Integer.parseInt(((String) (obj)).substring(3));
        return Integer.valueOf(i1);
        obj;
        com.millennialmedia.c.b(a, "Unable to parse mnc from network operator", ((Throwable) (obj)));
        com.millennialmedia.c.c(a, "Unable to retrieve mnc");
        return null;
        return Integer.valueOf(((Configuration) (obj)).mnc);
    }

    public static String j()
    {
        return ((TelephonyManager)c.getSystemService("phone")).getNetworkOperator();
    }

    public static String k()
    {
        return ((TelephonyManager)c.getSystemService("phone")).getNetworkOperatorName();
    }

    public static String l()
    {
        return Locale.getDefault().getLanguage();
    }

    public static String m()
    {
        return Locale.getDefault().getCountry();
    }

    public static String n()
    {
        Object obj;
        try
        {
            obj = c.getPackageManager();
            obj = ((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(c.getPackageName(), 0)).toString();
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            com.millennialmedia.c.c(a, "Unable to determine package name", namenotfoundexception);
            return null;
        }
        return ((String) (obj));
    }

    public static String o()
    {
        return c.getPackageName();
    }

    public static String p()
    {
        if (d != null)
        {
            return d;
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            d = WebSettings.getDefaultUserAgent(c);
        } else
        {
            d = (new WebView(c)).getSettings().getUserAgentString();
        }
        return d;
    }

    public static Integer q()
    {
        Intent intent = Y();
        if (intent != null)
        {
            int i1 = intent.getIntExtra("scale", -1);
            int j1 = intent.getIntExtra("level", -1);
            if (i1 != -1 && j1 != -1)
            {
                return Integer.valueOf(Math.round(((float)j1 / (float)i1) * 100F));
            }
        }
        return null;
    }

    public static boolean r()
    {
        for (Intent intent = Y(); intent == null || intent.getIntExtra("plugged", 0) == 0;)
        {
            return false;
        }

        return true;
    }

    public static long s()
    {
        return b(Environment.getRootDirectory().getAbsolutePath());
    }

    public static long t()
    {
        if (v())
        {
            return b(Environment.getExternalStorageDirectory().getAbsolutePath());
        } else
        {
            return 0L;
        }
    }

    public static long u()
    {
        return 0L + s() + t();
    }

    public static boolean v()
    {
        String s1 = Environment.getExternalStorageState();
        return e && ("mounted".equals(s1) || "mounted_ro".equals(s1));
    }

    public static boolean w()
    {
        String s1 = Environment.getExternalStorageState();
        return e && "mounted".equals(s1);
    }

    public static boolean x()
    {
        return e;
    }

    public static boolean y()
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)c.getSystemService("connectivity");
        if (connectivitymanager != null) goto _L2; else goto _L1
_L1:
        NetworkInfo anetworkinfo[];
        return false;
_L2:
        if ((anetworkinfo = connectivitymanager.getAllNetworkInfo()) != null)
        {
            int i1 = 0;
            while (i1 < anetworkinfo.length) 
            {
                if (anetworkinfo[i1].getState() == android.net.NetworkInfo.State.CONNECTED)
                {
                    return true;
                }
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static String z()
    {
        Object obj = (ConnectivityManager)c.getSystemService("connectivity");
        if (obj == null)
        {
            return "unknown";
        }
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj != null && ((NetworkInfo) (obj)).isConnected())
        {
            int i1 = ((NetworkInfo) (obj)).getType();
            if (i1 == 1)
            {
                return "wifi";
            }
            if (i1 == 0)
            {
                switch (((NetworkInfo) (obj)).getSubtype())
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


    /* member class not found */
    class _cls1 {}

}

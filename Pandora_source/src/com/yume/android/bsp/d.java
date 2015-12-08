// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;
import com.yume.android.sdk.YuMeConnectionType;
import com.yume.android.sdk.YuMeDeviceType;
import com.yume.android.sdk.YuMeStorageMode;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

// Referenced classes of package com.yume.android.bsp:
//            p, YuMeBSPInterfaceImpl, r, a, 
//            q, e

final class d
{

    static String b = "";
    static String c;
    static String d;
    static String e = "Android";
    static String f;
    static int g = 0;
    static int h = 0;
    static String i = "";
    static String j = "";
    static List k = null;
    static String l = "";
    static String m = "";
    static String n = "";
    static String o = "";
    static YuMeDeviceType p;
    static float q = 0.0F;
    private static YuMeConnectionType r;
    private static String s = "";
    private static String t = "";
    private static String u = "";
    private static List v = null;
    private String A;
    p a;
    private LocationManager w;
    private TelephonyManager x;
    private ConnectivityManager y;
    private int z;

    public d()
    {
        a = com.yume.android.bsp.p.a();
        w = null;
        x = null;
        y = null;
        z = 2;
    }

    private static void a(Location location)
    {
        if (location == null)
        {
            return;
        } else
        {
            double d1 = location.getLongitude();
            double d2 = location.getLatitude();
            s = Double.toString(d1);
            t = Double.toString(d2);
            return;
        }
    }

    public static List b()
    {
        Enumeration enumeration = NetworkInterface.getNetworkInterfaces();
_L2:
        if (!enumeration.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_127;
        }
        InetAddress inetaddress;
        Enumeration enumeration1 = ((NetworkInterface)enumeration.nextElement()).getInetAddresses();
        do
        {
            if (!enumeration1.hasMoreElements())
            {
                continue; /* Loop/switch isn't completed */
            }
            inetaddress = (InetAddress)enumeration1.nextElement();
        } while (inetaddress.isLoopbackAddress());
        break; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L1
_L1:
        String s1 = inetaddress.getHostAddress().toString();
        if (v == null)
        {
            v = new ArrayList();
        } else
        {
            v.clear();
        }
        v.add(s1);
        v.add(s1);
        return v;
        Object obj;
        obj;
        ((SocketException) (obj)).printStackTrace();
        break MISSING_BLOCK_LABEL_127;
        obj;
        ((Exception) (obj)).printStackTrace();
        return null;
    }

    public static String e()
    {
        Context context = YuMeBSPInterfaceImpl.a();
        if (context == null) goto _L2; else goto _L1
_L1:
        int i1 = ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i1 != 0 && i1 != 2) goto _L4; else goto _L3
_L3:
        u = "portrait";
_L2:
        return u;
_L4:
        if (i1 == 1 || i1 == 3)
        {
            u = "landscape";
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static String h()
    {
        return t;
    }

    public static String i()
    {
        return s;
    }

    private ConnectivityManager k()
    {
        Context context = YuMeBSPInterfaceImpl.a();
        if (context == null)
        {
            return null;
        }
        if (y == null)
        {
            y = (ConnectivityManager)context.getSystemService("connectivity");
        }
        if (y == null)
        {
            a.b("getConnectivityManager(): Invalid Connectivity Manager handle.");
        }
        return y;
    }

    private boolean l()
    {
        NetworkInfo anetworkinfo[];
        if (k() == null)
        {
            return false;
        }
        anetworkinfo = y.getAllNetworkInfo();
        if (anetworkinfo == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L5:
        if (i1 < anetworkinfo.length) goto _L3; else goto _L2
_L2:
        a.a("No Other Networks Available.");
        return false;
_L3:
        NetworkInfo networkinfo = anetworkinfo[i1];
        if (networkinfo != null && networkinfo.getType() != 1 && networkinfo.getType() != 0 && networkinfo.isAvailable())
        {
            a.a((new StringBuilder(String.valueOf(networkinfo.getTypeName()))).append(" Network Available.").toString());
            return true;
        }
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void m()
    {
        String s1;
        Object obj;
        int i1;
        int j1;
        i1 = g;
        j1 = h;
        s1 = u;
        obj = YuMeBSPInterfaceImpl.a();
        if (obj == null) goto _L2; else goto _L1
_L1:
        int k1;
        obj = ((WindowManager)((Context) (obj)).getSystemService("window")).getDefaultDisplay();
        g = ((Display) (obj)).getWidth();
        h = ((Display) (obj)).getHeight();
        k1 = ((Display) (obj)).getRotation();
        if (k1 != 0 && k1 != 2) goto _L4; else goto _L3
_L3:
        u = "portrait";
_L2:
        if (!u.equals(s1))
        {
            a.a((new StringBuilder("Current Display Orientation: ")).append(u).toString());
        }
        if (g != i1 || h != j1)
        {
            a.a((new StringBuilder("Device Resolution: Width: ")).append(g).append(", Height: ").append(h).toString());
        }
        return;
_L4:
        if (k1 == 1 || k1 == 3)
        {
            g = ((Display) (obj)).getHeight();
            h = ((Display) (obj)).getWidth();
            u = "landscape";
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private float n()
    {
        long l2;
        l2 = 0L;
        if (!com.yume.android.bsp.r.a(A))
        {
            a.b("Error Calculating Total Storage Space - Invalid storagePath.");
            return 0.0F;
        }
        if (YuMeBSPInterfaceImpl.c.g == YuMeStorageMode.EXTERNAL_STORAGE && !YuMeBSPInterfaceImpl.b())
        {
            a.b("Error Calculating Total Storage Space - External Storage Not Accessible.");
            return 0.0F;
        }
        if (q >= 0.0F) goto _L2; else goto _L1
_L1:
        StatFs statfs;
        int i1;
        statfs = new StatFs(A);
        i1 = statfs.getBlockSize();
        long l1 = i1;
        i1 = statfs.getBlockCount();
        l2 = i1;
_L4:
        q = l2 * l1;
_L2:
        return q;
        Exception exception;
        exception;
        l1 = 0L;
_L5:
        exception.printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
        exception;
          goto _L5
    }

    public final void a()
    {
        m();
        Context context = YuMeBSPInterfaceImpl.a();
        int i1;
        if (context != null)
        {
            if (context.getPackageManager().hasSystemFeature("com.google.android.tv"))
            {
                p = YuMeDeviceType.TELEVISION;
                a.a("Device identified to be a Google TV.");
            } else
            {
                z = context.getResources().getConfiguration().screenLayout & 0xf;
                if (z >= 3)
                {
                    p = YuMeDeviceType.TABLET;
                    a.a("Device is identified as an Android TABLET.");
                } else
                {
                    p = YuMeDeviceType.PHONE;
                    a.a("Device is identified as an Android PHONE.");
                }
            }
        }
        n();
        j();
        context = YuMeBSPInterfaceImpl.a();
        if (context != null)
        {
            i1 = context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE");
            if (i1 == 0)
            {
                a.a("Permission GRANTED for reading Phone State.");
                x = (TelephonyManager)context.getSystemService("phone");
                if (x != null)
                {
                    j = x.getSimOperatorName();
                    l = x.getSimCountryIso();
                }
            } else
            if (i1 == -1)
            {
                a.a("Permission DENIED for reading Phone State.");
            }
        }
        com.yume.android.bsp.q.a(YuMeBSPInterfaceImpl.a());
        if (com.yume.android.bsp.q.b())
        {
            b = com.yume.android.bsp.q.a();
            a.a((new StringBuilder("Device UUID - 1: ")).append(b).toString());
        } else
        {
            (new Thread(new e(this))).start();
        }
        c();
        b();
        context = YuMeBSPInterfaceImpl.a();
        if (context != null)
        {
            i1 = context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION");
            if (i1 == 0)
            {
                a.a("Permission GRANTED for accessing Location Info.");
                w = (LocationManager)context.getSystemService("location");
                a(true);
            } else
            if (i1 == -1)
            {
                a.a("Permission DENIED for accessing Location Info.");
            }
        }
        d();
    }

    public final void a(String s1)
    {
        A = s1;
    }

    public final void a(boolean flag)
    {
        if (w == null) goto _L2; else goto _L1
_L1:
        if (p != YuMeDeviceType.PHONE && p != YuMeDeviceType.TABLET) goto _L4; else goto _L3
_L3:
        String s1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = w.isProviderEnabled("network");
        flag2 = w.isProviderEnabled("gps");
        flag3 = w.isProviderEnabled("passive");
        if (flag)
        {
            a.a((new StringBuilder("Location Providers Enabled: Network:GPS:Passive => ")).append(flag1).append(":").append(flag2).append(":").append(flag3).toString());
        }
        s1 = "";
        if (!flag1) goto _L6; else goto _L5
_L5:
        s1 = "network";
_L12:
        if (s1.equals("")) goto _L8; else goto _L7
_L7:
        a(w.getLastKnownLocation(s1));
_L2:
        return;
_L6:
        if (flag2)
        {
            s1 = "gps";
        } else
        if (flag3)
        {
            s1 = "passive";
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (!flag) goto _L2; else goto _L9
_L9:
        a.a("None of the Location Providers are enabled.");
        return;
_L4:
        if (p != YuMeDeviceType.TELEVISION) goto _L2; else goto _L10
_L10:
        a(w.getLastKnownLocation("static"));
        return;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final YuMeConnectionType c()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        r = YuMeConnectionType.NONE;
        if (k() != null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L8:
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        r = YuMeConnectionType.WIFI;
_L12:
        return r;
_L2:
        NetworkInfo anetworkinfo[] = y.getAllNetworkInfo();
        if (anetworkinfo == null) goto _L6; else goto _L5
_L5:
        i1 = 0;
_L9:
        if (i1 < anetworkinfo.length) goto _L7; else goto _L6
_L6:
        a.a("WiFi Connectivity not available.");
        i1 = 0;
          goto _L8
_L7:
label0:
        {
            NetworkInfo networkinfo = anetworkinfo[i1];
            if (networkinfo == null || networkinfo.getType() != 1 || !networkinfo.isConnected() || networkinfo.getState() != android.net.NetworkInfo.State.CONNECTED)
            {
                break label0;
            }
            a.a("WiFi Connectivity available.");
            i1 = 1;
        }
          goto _L8
        i1++;
          goto _L9
_L4:
        if (k() != null) goto _L11; else goto _L10
_L10:
        i1 = 0;
_L16:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        r = YuMeConnectionType.CELLULAR;
          goto _L12
_L11:
        anetworkinfo = y.getAllNetworkInfo();
        if (anetworkinfo == null) goto _L14; else goto _L13
_L13:
        i1 = 0;
_L17:
        if (i1 < anetworkinfo.length) goto _L15; else goto _L14
_L14:
        a.a("Cellular Connectivity not available.");
        i1 = 0;
          goto _L16
_L15:
label1:
        {
            NetworkInfo networkinfo1 = anetworkinfo[i1];
            if (networkinfo1 == null || networkinfo1.getType() != 0 || !networkinfo1.isConnected() || networkinfo1.getState() != android.net.NetworkInfo.State.CONNECTED)
            {
                break label1;
            }
            a.a("Cellular Connectivity available.");
            i1 = 1;
        }
          goto _L16
        i1++;
          goto _L17
        if (k() != null) goto _L19; else goto _L18
_L18:
        i1 = ((flag) ? 1 : 0);
_L23:
        if (i1 == 2)
        {
            r = YuMeConnectionType.ETHERNET;
        }
          goto _L12
_L19:
        anetworkinfo = y.getAllNetworkInfo();
        if (anetworkinfo == null) goto _L21; else goto _L20
_L20:
        i1 = ((flag1) ? 1 : 0);
_L24:
        if (i1 < anetworkinfo.length) goto _L22; else goto _L21
_L21:
        i1 = 1;
          goto _L23
_L22:
        NetworkInfo networkinfo2;
label2:
        {
            networkinfo2 = anetworkinfo[i1];
            if (networkinfo2 == null)
            {
                break MISSING_BLOCK_LABEL_395;
            }
            if (networkinfo2.getState() != android.net.NetworkInfo.State.CONNECTED)
            {
                break label2;
            }
            a.a((new StringBuilder("Network ")).append(i1).append(" is Connected (").append(networkinfo2.getTypeName()).append(").").toString());
            i1 = 2;
        }
          goto _L23
        a.a((new StringBuilder("Network ")).append(i1).append(" is Not Connected (").append(networkinfo2.getTypeName()).append(").").toString());
        i1++;
          goto _L24
    }

    public final List d()
    {
        boolean flag1 = false;
        if (k == null)
        {
            boolean flag;
            if (k() == null)
            {
                flag = false;
            } else
            {
                NetworkInfo networkinfo = y.getNetworkInfo(1);
                if (networkinfo != null && networkinfo.isAvailable())
                {
                    a.a("WiFi Network Available.");
                    flag = true;
                } else
                {
                    a.a("WiFi Network not Available.");
                    flag = false;
                }
            }
            if (flag)
            {
                if (k == null)
                {
                    k = new ArrayList();
                }
                k.add(YuMeConnectionType.WIFI);
            }
            if (k() == null)
            {
                flag = flag1;
            } else
            {
                NetworkInfo networkinfo1 = y.getNetworkInfo(0);
                if (networkinfo1 != null && networkinfo1.isAvailable())
                {
                    a.a("Cellular Network Available.");
                    flag = true;
                } else
                {
                    a.a("Cellular Network not Available.");
                    flag = flag1;
                }
            }
            if (flag)
            {
                if (k == null)
                {
                    k = new ArrayList();
                }
                k.add(YuMeConnectionType.CELLULAR);
            }
            if (l() && p == YuMeDeviceType.TELEVISION)
            {
                if (k == null)
                {
                    k = new ArrayList();
                }
                k.add(YuMeConnectionType.ETHERNET);
            }
        }
        return k;
    }

    public final int f()
    {
        m();
        return g;
    }

    public final int g()
    {
        m();
        return h;
    }

    final float j()
    {
        long l2;
        l2 = 0L;
        if (!com.yume.android.bsp.r.a(A))
        {
            a.b("Error Calculating Free Storage Space - Invalid storagePath.");
            return 0.0F;
        }
        if (YuMeBSPInterfaceImpl.c.g == YuMeStorageMode.EXTERNAL_STORAGE && !YuMeBSPInterfaceImpl.b())
        {
            a.b("Error Calculating Free Storage Space - External Storage Not Accessible.");
            return 0.0F;
        }
        StatFs statfs;
        int i1;
        statfs = new StatFs(A);
        i1 = statfs.getBlockSize();
        long l1 = i1;
        i1 = statfs.getAvailableBlocks();
        l2 = i1;
_L2:
        return (float)(l2 * l1);
        Exception exception;
        exception;
        l1 = 0L;
_L3:
        exception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
        exception;
          goto _L3
    }

    static 
    {
        c = Build.MANUFACTURER;
        d = Build.MODEL;
        f = android.os.Build.VERSION.RELEASE;
        r = YuMeConnectionType.NONE;
        p = YuMeDeviceType.PHONE;
    }
}

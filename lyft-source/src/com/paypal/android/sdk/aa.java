// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.Timer;
import java.util.UUID;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

// Referenced classes of package com.paypal.android.sdk:
//            Y, ao, W, ae, 
//            ad, ac, Z, ak, 
//            a, ag, V, af, 
//            ab

public final class aa
    implements LocationListener
{

    private static Y x = new Y();
    private static final Object y = new Object();
    private static aa z;
    private Context a;
    private String b;
    private long c;
    private long d;
    private long e;
    private int f;
    private int g;
    private long h;
    private String i;
    private W j;
    private Z k;
    private Z l;
    private String m;
    private Map n;
    private Map o;
    private Location p;
    private Timer q;
    private Handler r;
    private a s;
    private String t;
    private String u;
    private boolean v;
    private String w;

    private aa()
    {
    }

    private static long a(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return 0L;
_L2:
        long l1;
        try
        {
            if (android.os.Build.VERSION.SDK_INT > 8)
            {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            }
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 0L;
        }
        if (context == null) goto _L1; else goto _L3
_L3:
        l1 = (new File(context)).lastModified();
        return l1;
    }

    static Z a(aa aa1, Z z1)
    {
        aa1.k = z1;
        return z1;
    }

    public static aa a()
    {
        aa aa1;
        synchronized (y)
        {
            if (z == null)
            {
                z = new aa();
            }
            aa1 = z;
        }
        return aa1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static String a(TelephonyManager telephonymanager)
    {
        try
        {
            telephonymanager = telephonymanager.getSimOperatorName();
        }
        // Misplaced declaration of an exception variable
        catch (TelephonyManager telephonymanager)
        {
            ao.a("RiskComponent", "Known SecurityException on some devices", telephonymanager);
            return null;
        }
        return telephonymanager;
    }

    static Map a(aa aa1)
    {
        return aa1.n;
    }

    static Map a(aa aa1, Map map)
    {
        aa1.n = map;
        return map;
    }

    private void a(W w1)
    {
        j = w1;
        i();
        q = new Timer();
        long l1 = j.c();
        long l2 = j.d();
        long l3 = j.e();
        d = l1 * 1000L;
        c = l2 * 1000L;
        e = l3 * 1000L;
        ae.a(c);
        if (j == null || !i.equals(j.a()))
        {
            i();
            q = new Timer();
            q.scheduleAtFixedRate(new ad(this), 0L, 0x927c0L);
        } else
        if (v)
        {
            i();
            q = new Timer();
            q.scheduleAtFixedRate(new ac(this), 0L, d);
            return;
        }
    }

    private void a(Z z1, Z z2)
    {
        if (z1 != null)
        {
            z1.Z = new HashMap(n);
            o = new HashMap(n);
            if (z2 != null)
            {
                z1 = z1.a(z2);
            } else
            {
                z1 = z1.a();
            }
            z2 = new ArrayList();
            z2.add(new BasicNameValuePair("appGuid", b));
            z2.add(new BasicNameValuePair("libraryVersion", c()));
            z2.add(new BasicNameValuePair("additionalData", z1.toString()));
            if (j != null)
            {
                z1 = j.g();
                boolean flag = j.h();
                Handler handler = r;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                (new ak(z1, z2, handler, flag, null)).a();
                return;
            }
        }
    }

    static void a(aa aa1, W w1)
    {
        aa1.a(w1);
    }

    private static long b(Context context)
    {
        if (context != null) goto _L2; else goto _L1
_L1:
        return 0L;
_L2:
        long l1;
        try
        {
            if (android.os.Build.VERSION.SDK_INT > 8)
            {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
            }
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 0L;
        }
        if (context == null) goto _L1; else goto _L3
_L3:
        l1 = (new File(context)).lastModified();
        return l1;
    }

    static Z b(aa aa1, Z z1)
    {
        aa1.l = null;
        return null;
    }

    static Map b(aa aa1)
    {
        return aa1.o;
    }

    static Z c(aa aa1)
    {
        return aa1.l;
    }

    public static String c()
    {
        return String.format(Locale.US, "Dyson/%S (%S %S)", new Object[] {
            "3.1.9", "Android", android.os.Build.VERSION.RELEASE
        });
    }

    static int d(aa aa1)
    {
        int i1 = aa1.f;
        aa1.f = i1 + 1;
        return i1;
    }

    static boolean e(aa aa1)
    {
        return System.currentTimeMillis() - aa1.h > aa1.e;
    }

    static Timer f(aa aa1)
    {
        return aa1.q;
    }

    private static String g()
    {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    static void g(aa aa1)
    {
        if (aa1.l != null)
        {
            if ("full".equals(aa1.m))
            {
                aa1.a(aa1.l, ((Z) (null)));
                return;
            } else
            {
                Z z1 = aa1.j();
                aa1.a(aa1.l, z1);
                return;
            }
        }
        if (!ae.c() || aa1.k == null)
        {
            ae.a();
            aa1.m = "full";
            Z z2 = aa1.j();
            aa1.a(z2, ((Z) (null)));
            aa1.l = z2;
            return;
        } else
        {
            aa1.m = "incremental";
            Z z3 = aa1.j();
            aa1.a(aa1.k, z3);
            aa1.l = z3;
            return;
        }
    }

    static int h(aa aa1)
    {
        int i1 = aa1.g;
        aa1.g = i1 + 1;
        return i1;
    }

    private String h()
    {
        StringBuffer stringbuffer = new StringBuffer("https://b.stats.paypal.com/counter.cgi?p=");
        if (s == null || s == a.a)
        {
            return "Beacon not recognize host app";
        }
        int i1 = s.a();
        if (u == null)
        {
            return "Beacon pairing id empty";
        }
        stringbuffer.append(u).append("&i=");
        Object obj = ao.b();
        if (((String) (obj)).equals(""))
        {
            try
            {
                stringbuffer.append(x.a("emptyIp")).append("&t=");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        } else
        {
            stringbuffer.append(((String) (obj))).append("&t=");
        }
        stringbuffer.append(String.valueOf(System.currentTimeMillis() / 1000L)).append("&a=").append(i1);
        (new ag(stringbuffer.toString(), b, t, ao.a(a), r)).a();
        return stringbuffer.toString();
    }

    static Context i(aa aa1)
    {
        return aa1.a;
    }

    private void i()
    {
        if (q != null)
        {
            q.cancel();
        }
    }

    private Z j()
    {
        Object obj3;
        Z z1;
        obj3 = null;
        if (a == null)
        {
            return null;
        }
        z1 = new Z();
        Object obj;
        Object obj1;
        TelephonyManager telephonymanager;
        telephonymanager = (TelephonyManager)a.getSystemService("phone");
        obj1 = (WifiManager)a.getSystemService("wifi");
        obj = (ConnectivityManager)a.getSystemService("connectivity");
        if (!ao.a(a, "android.permission.ACCESS_WIFI_STATE")) goto _L2; else goto _L1
_L1:
        Object obj2 = ((WifiManager) (obj1)).getConnectionInfo();
_L61:
        if (!ao.a(a, "android.permission.ACCESS_NETWORK_STATE")) goto _L4; else goto _L3
_L3:
        NetworkInfo networkinfo = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
_L62:
        int i1;
        boolean flag;
        if (ao.a(a, "android.permission.ACCESS_COARSE_LOCATION") || ao.a(a, "android.permission.ACCESS_FINE_LOCATION"))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        flag = ao.a(a, "android.permission.READ_PHONE_STATE");
        telephonymanager.getPhoneType();
        JVM INSTR tableswitch 0 2: default 1213
    //                   0 993
    //                   1 1008
    //                   2 1033;
           goto _L5 _L6 _L7 _L8
_L5:
        z1.z = (new StringBuilder("unknown (")).append(telephonymanager.getPhoneType()).append(")").toString();
        obj1 = null;
        obj = null;
_L41:
        z1.a = b;
        z1.R = u;
        if (s != null) goto _L10; else goto _L9
_L9:
        z1.N = a.a.a();
_L48:
        z1.O = t;
        z1.W = w;
        z1.U = android.provider.Settings.Secure.getString(a.getContentResolver(), "android_id");
        V v1 = ao.a(a);
        z1.b = v1.a();
        z1.c = v1.b();
        if (obj1 != null) goto _L12; else goto _L11
_L11:
        i1 = -1;
_L49:
        z1.d = i1;
        if (obj1 != null) goto _L14; else goto _L13
_L13:
        i1 = -1;
_L50:
        z1.L = i1;
        if (obj1 != null) goto _L16; else goto _L15
_L15:
        i1 = -1;
_L51:
        z1.K = i1;
        if (obj2 != null) goto _L18; else goto _L17
_L17:
        obj1 = null;
_L52:
        z1.e = ((String) (obj1));
        if (obj != null) goto _L20; else goto _L19
_L19:
        i1 = -1;
_L53:
        z1.f = i1;
        z1.M = telephonymanager.getNetworkOperator();
        z1.g = "3.1.9";
        z1.h = i;
        if (j != null) goto _L22; else goto _L21
_L21:
        obj1 = null;
_L54:
        z1.i = ((String) (obj1));
        if (networkinfo != null) goto _L24; else goto _L23
_L23:
        obj1 = null;
_L55:
        z1.j = ((String) (obj1));
        if (!flag) goto _L26; else goto _L25
_L25:
        obj1 = telephonymanager.getDeviceId();
_L63:
        z1.k = ((String) (obj1));
        z1.l = Build.MODEL;
        z1.m = Build.DEVICE;
        z1.n = SystemClock.uptimeMillis();
        z1.o = ao.b();
        z1.p = ao.a(true);
        if (!flag) goto _L28; else goto _L27
_L27:
        obj1 = telephonymanager.getLine1Number();
_L64:
        z1.r = ((String) (obj1));
        z1.s = ao.a();
        z1.t = Locale.getDefault().getCountry();
        z1.u = Locale.getDefault().getLanguage();
        if (p != null) goto _L30; else goto _L29
_L29:
        obj1 = null;
_L56:
        z1.v = ((Location) (obj1));
        if (obj != null) goto _L32; else goto _L31
_L31:
        i1 = -1;
_L57:
        z1.w = i1;
        if (obj2 != null) goto _L34; else goto _L33
_L33:
        obj = null;
_L58:
        z1.x = ((String) (obj));
        z1.y = android.os.Build.VERSION.RELEASE;
        z1.A = ae.b();
        z1.B = (new ServiceState()).getRoaming();
        z1.C = a(telephonymanager);
        if (!flag) goto _L36; else goto _L35
_L35:
        obj = telephonymanager.getSimSerialNumber();
_L65:
        z1.D = ((String) (obj));
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            z1.X = Build.SERIAL;
        }
        z1.E = a.getPackageManager().hasSystemFeature("android.hardware.telephony");
        if (obj2 != null) goto _L38; else goto _L37
_L37:
        obj = null;
_L59:
        z1.F = ((String) (obj));
        if (!flag) goto _L40; else goto _L39
_L39:
        obj = telephonymanager.getSubscriberId();
_L60:
        z1.G = ((String) (obj));
        z1.H = System.currentTimeMillis();
        z1.I = ao.c();
        z1.J = TimeZone.getDefault().getDisplayName();
        if (!Build.BRAND.equalsIgnoreCase("generic") && !Build.PRODUCT.equals("sdk") && !Build.HARDWARE.equals("goldfish") && !Build.FINGERPRINT.startsWith("generic") && !Build.MANUFACTURER.equals("unknown") && !Build.PRODUCT.matches(".*_?sdk_?.*"))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        z1.P = flag;
        z1.Q = af.a();
        obj = new ArrayList();
        if (j == null)
        {
            break MISSING_BLOCK_LABEL_913;
        }
        obj1 = j.f();
        try
        {
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                obj2 = (String)((Iterator) (obj1)).next();
                if (ao.a(a.getPackageManager(), (new Intent()).setComponent(ComponentName.unflattenFromString(((String) (obj2))))))
                {
                    ((List) (obj)).add(obj2);
                }
            } while (true);
            break MISSING_BLOCK_LABEL_913;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        ao.a("RiskComponent", "knownApps error", null);
        break MISSING_BLOCK_LABEL_913;
_L6:
        z1.z = "none";
        obj1 = null;
        obj = null;
          goto _L41
_L7:
        z1.z = "gsm";
        if (i1 == 0) goto _L43; else goto _L42
_L42:
        obj = (GsmCellLocation)telephonymanager.getCellLocation();
          goto _L44
_L8:
        z1.z = "cdma";
        if (i1 == 0) goto _L46; else goto _L45
_L45:
        obj = (CdmaCellLocation)telephonymanager.getCellLocation();
          goto _L47
_L10:
        z1.N = s.a();
          goto _L48
_L12:
        i1 = ((CdmaCellLocation) (obj1)).getBaseStationId();
          goto _L49
_L14:
        i1 = ((CdmaCellLocation) (obj1)).getNetworkId();
          goto _L50
_L16:
        i1 = ((CdmaCellLocation) (obj1)).getSystemId();
          goto _L51
_L18:
        obj1 = ((WifiInfo) (obj2)).getBSSID();
          goto _L52
_L20:
        i1 = ((GsmCellLocation) (obj)).getCid();
          goto _L53
_L22:
        obj1 = j.b();
          goto _L54
_L24:
        obj1 = networkinfo.getTypeName();
          goto _L55
_L30:
        obj1 = new Location(p);
          goto _L56
_L32:
        i1 = ((GsmCellLocation) (obj)).getLac();
          goto _L57
_L34:
        obj = ((WifiInfo) (obj2)).getMacAddress();
          goto _L58
_L38:
        obj = ((WifiInfo) (obj2)).getSSID();
          goto _L59
_L40:
        obj = null;
          goto _L60
        if (((List) (obj)).size() == 0)
        {
            obj = obj3;
        }
        try
        {
            z1.q = ((List) (obj));
            z1.S = a(a);
            z1.T = b(a);
            z1.Z = n;
            z1.Y = ao.b(a);
            z1.V = ao.a(a, z1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ao.a("RiskComponent", "Unknown error in RiskComponent", ((Throwable) (obj)));
        }
        return z1;
_L2:
        obj2 = null;
          goto _L61
_L4:
        networkinfo = null;
          goto _L62
_L44:
        obj1 = null;
          goto _L41
_L43:
        obj = null;
          goto _L44
_L47:
        Object obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L41
_L46:
        obj = null;
          goto _L47
_L26:
        obj1 = null;
          goto _L63
_L28:
        obj1 = null;
          goto _L64
_L36:
        obj = null;
          goto _L65
    }

    static String j(aa aa1)
    {
        return aa1.i;
    }

    static Handler k(aa aa1)
    {
        return aa1.r;
    }

    public final String a(Context context, String s1, a a1, String s2, String s3, boolean flag, String s4, 
            String s5)
    {
        a = context;
        b = s1;
        v = flag;
        if (a1 == null)
        {
            s = a.a;
        } else
        {
            s = a1;
        }
        t = s2;
        k = null;
        l = null;
        w = s5;
        n = new HashMap();
        g = 0;
        f = 0;
        u = g();
        context = s3;
        if (s3 == null)
        {
            context = "https://www.paypalobjects.com/webstatic/risk/dyson_config_v2.json";
        }
        i = context;
        h = System.currentTimeMillis();
        if (r != null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        r = new ab(this);
        context = (LocationManager)a.getSystemService("location");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        onLocationChanged(ao.a(context));
        if (context.isProviderEnabled("network"))
        {
            context.requestLocationUpdates("network", 0L, 0.0F, this);
        }
        i();
_L2:
        h();
        a(new W(a));
        return u;
        context;
        ao.a("RiskComponent", null, context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final JSONObject b()
    {
        ae.a();
        k = j();
        if (k == null)
        {
            return null;
        } else
        {
            return k.a();
        }
    }

    public final void d()
    {
        ae.a();
        k = j();
        a(k, ((Z) (null)));
    }

    public final void e()
    {
        h = System.currentTimeMillis();
    }

    public final String f()
    {
        String s1 = g();
        u = s1;
        d();
        h();
        return s1;
    }

    public final void onLocationChanged(Location location)
    {
        if (location != null)
        {
            p = new Location(location);
        }
    }

    public final void onProviderDisabled(String s1)
    {
    }

    public final void onProviderEnabled(String s1)
    {
    }

    public final void onStatusChanged(String s1, int i1, Bundle bundle)
    {
    }

}

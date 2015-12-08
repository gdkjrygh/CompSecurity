// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobileapptracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;

// Referenced classes of package com.mobileapptracker:
//            MATUtils, MATGender, MobileAppTracker

public class MATParameters
{

    private static MATParameters c = null;
    private boolean A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String K;
    private Location L;
    private String M;
    private String N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private String X;
    private String Y;
    private String Z;
    private Context a;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private String af;
    private String ag;
    private String ah;
    private String ai;
    private String aj;
    private String ak;
    private String al;
    private String am;
    private String an;
    private JSONArray ao;
    private String ap;
    private String aq;
    private String ar;
    private MobileAppTracker b;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public MATParameters()
    {
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = false;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        G = null;
        H = null;
        I = null;
        J = null;
        K = null;
        L = null;
        M = null;
        N = null;
        O = null;
        P = null;
        Q = null;
        R = null;
        V = null;
        W = null;
        X = null;
        Y = null;
        Z = null;
        aa = null;
        ab = null;
        ac = null;
        ad = null;
        ae = null;
        af = null;
        ag = null;
        ah = null;
        ai = null;
        aj = null;
        ak = null;
        ao = null;
    }

    private void K(String s1)
    {
        ak = s1;
    }

    public static MATParameters a()
    {
        return c;
    }

    public static MATParameters a(MobileAppTracker mobileapptracker, Context context, String s1, String s2)
    {
        if (c == null)
        {
            c = new MATParameters();
            c.b = mobileapptracker;
            c.a = context;
            c.a(context, s1, s2);
        }
        return c;
    }

    static MobileAppTracker a(MATParameters matparameters)
    {
        return matparameters.b;
    }

    static void a(MATParameters matparameters, String s1)
    {
        matparameters.K(s1);
    }

    private boolean a(Context context, String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        b(s1.trim());
        h(s2.trim());
        j("USD");
        (new Thread(new GetGAID(context))).start();
        (new Handler(Looper.getMainLooper())).post(new GetUserAgent(a));
        s1 = a.getPackageName();
        C(s1);
        s2 = a.getPackageManager();
        PackageInfo packageinfo;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        int i1;
        int j1;
        boolean flag;
        try
        {
            d(s2.getApplicationLabel(s2.getApplicationInfo(s1, 0)).toString());
            r(Long.toString((new Date((new File(s2.getApplicationInfo(s1, 0).sourceDir)).lastModified())).getTime() / 1000L));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1) { }
        packageinfo = s2.getPackageInfo(s1, 0);
        e(Integer.toString(packageinfo.versionCode));
        f(packageinfo.versionName);
_L5:
        s(s2.getInstallerPackageName(s1));
        n(Build.MODEL);
        k(Build.MANUFACTURER);
        m(System.getProperty("os.arch"));
        B(android.os.Build.VERSION.RELEASE);
        F(Float.toString(context.getResources().getDisplayMetrics().density));
        s1 = (WindowManager)context.getSystemService("window");
        if (android.os.Build.VERSION.SDK_INT < 13) goto _L2; else goto _L1
_L1:
        s2 = new Point();
        s1.getDefaultDisplay().getSize(s2);
        j1 = ((Point) (s2)).x;
        i1 = ((Point) (s2)).y;
_L7:
        H(Integer.toString(j1));
        G(Integer.toString(i1));
        if (!((ConnectivityManager)a.getSystemService("connectivity")).getNetworkInfo(1).isConnected()) goto _L4; else goto _L3
_L3:
        g("wifi");
_L8:
        v(Locale.getDefault().getLanguage());
        i(Locale.getDefault().getCountry());
        I(TimeZone.getDefault().getDisplayName(false, 0, Locale.US));
        context = (TelephonyManager)context.getSystemService("phone");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_544;
        }
        if (context.getNetworkCountryIso() != null)
        {
            i(context.getNetworkCountryIso());
        }
        l(context.getNetworkOperatorName());
        s1 = context.getNetworkOperator();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        try
        {
            context = s1.substring(0, 3);
            s1 = s1.substring(3);
            y(context);
            z(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        context = O();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_453;
        }
        if (context.length() != 0)
        {
            break MISSING_BLOCK_LABEL_463;
        }
        x(UUID.randomUUID().toString());
        flag = true;
_L6:
        this;
        JVM INSTR monitorexit ;
        return flag;
        namenotfoundexception;
        e("0");
          goto _L5
_L9:
        Log.d("MobileAppTracker", "MobileAppTracking params initialization failed");
        context.printStackTrace();
        flag = false;
          goto _L6
_L2:
        j1 = s1.getDefaultDisplay().getWidth();
        i1 = s1.getDefaultDisplay().getHeight();
          goto _L7
_L4:
        g("mobile");
          goto _L8
        try
        {
            i(Locale.getDefault().getCountry());
            break MISSING_BLOCK_LABEL_437;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        finally
        {
            throw context;
        }
          goto _L9
    }

    public String A()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = C;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void A(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        MATUtils.a(a, "mat_log_id_open", s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String B()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = D;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void B(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        Q = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String C()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = E;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void C(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        R = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String D()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = F;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void D(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        X = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String E()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = G;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void E(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        Y = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String F()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = H;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void F(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ac = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String G()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = I;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void G(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ad = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String H()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = MATUtils.a(a, "mat_referrer");
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void H(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ae = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String I()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = MATUtils.a(a, "mat_is_paying_user");
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void I(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ag = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String J()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = J;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void J(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        MATUtils.a(a, "mat_user_id", s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String K()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = MATUtils.a(a, "mat_log_id_last_open");
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String L()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = K;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String M()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = M;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String N()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = N;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String O()
    {
        this;
        JVM INSTR monitorenter ;
        if (!a.getSharedPreferences("mat_id", 0).contains("mat_id")) goto _L2; else goto _L1
_L1:
        String s1 = a.getSharedPreferences("mat_id", 0).getString("mat_id", "");
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        s1 = MATUtils.a(a, "mat_id");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public String P()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = O;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String Q()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = P;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String R()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = MATUtils.a(a, "mat_log_id_open");
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String S()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = Q;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String T()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = R;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String U()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = S;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String V()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = T;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String W()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = U;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String X()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = V;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String Y()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = W;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String Z()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = X;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        Z = Long.toString(l1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Location location)
    {
        this;
        JVM INSTR monitorenter ;
        L = location;
        this;
        JVM INSTR monitorexit ;
        return;
        location;
        throw location;
    }

    public void a(MATGender matgender)
    {
        this;
        JVM INSTR monitorenter ;
        if (matgender != MATGender.a) goto _L2; else goto _L1
_L1:
        D = "0";
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (matgender != MATGender.b)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        D = "1";
          goto _L3
        matgender;
        throw matgender;
        D = "";
          goto _L3
    }

    public void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        d = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String aa()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = Y;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String ab()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = Z;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String ac()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ac;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String ad()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ad;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String ae()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ae;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String af()
    {
        this;
        JVM INSTR monitorenter ;
        return "3.10.1";
    }

    public String ag()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = af;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String ah()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ag;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String ai()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ah;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String aj()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ai;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String ak()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = aj;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String al()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ak;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String am()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = al;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String an()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = am;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String ao()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = an;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public JSONArray ap()
    {
        this;
        JVM INSTR monitorenter ;
        JSONArray jsonarray = ao;
        this;
        JVM INSTR monitorexit ;
        return jsonarray;
        Exception exception;
        exception;
        throw exception;
    }

    public String aq()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = MATUtils.a(a, "mat_user_id");
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String ar()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ap;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String as()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = aq;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String at()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ar;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public String b()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = d;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        e = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String c()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = e;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        i = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String d()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = f;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void d(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        n = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String e()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = g;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void e(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        o = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String f()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = h;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void f(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        p = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String g()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = i;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void g(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        q = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String h()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = j;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void h(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        r = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String i()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = k;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void i(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String j()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = l;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void j(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        t = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String k()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = m;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void k(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        u = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String l()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = n;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void l(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        v = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String m()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = o;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void m(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        w = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String n()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = p;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void n(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        z = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String o()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = q;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void o(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        B = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String p()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = r;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void p(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        E = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String q()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = s;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void q(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        F = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String r()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = t;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void r(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        H = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String s()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = u;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void s(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        I = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String t()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = v;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void t(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        MATUtils.a(a, "mat_referrer", s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String u()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = w;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void u(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        MATUtils.a(a, "mat_is_paying_user", s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String v()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = x;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void v(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        J = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String w()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = y;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void w(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        MATUtils.a(a, "mat_log_id_last_open", s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public String x()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = z;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void x(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        MATUtils.a(a, "mat_id", s1);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void y(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        O = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public boolean y()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = A;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public String z()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = B;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public void z(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        P = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }


    private class GetGAID
        implements Runnable
    {

        final MATParameters a;
        private final WeakReference b;

        public void run()
        {
            String s1;
            int i1;
            boolean flag;
            try
            {
                Object obj = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", new Class[] {
                    android/content/Context
                }).invoke(null, new Object[] {
                    b.get()
                });
                s1 = (String)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getDeclaredMethod("getId", new Class[0]).invoke(obj, new Object[0]);
                flag = ((Boolean)Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getDeclaredMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(obj, new Object[0])).booleanValue();
                if (MATParameters.a(a).e != null)
                {
                    break MISSING_BLOCK_LABEL_133;
                }
                a.p(s1);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                Log.d("MobileAppTracker", "MAT SDK failed to get Google Advertising Id, collecting ANDROID_ID instead");
                if (MATParameters.a(a).e == null)
                {
                    a.c(android.provider.Settings.Secure.getString(((Context)b.get()).getContentResolver(), "android_id"));
                }
                MATParameters.a(a).a(android.provider.Settings.Secure.getString(((Context)b.get()).getContentResolver(), "android_id"));
                return;
            }
            if (flag)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            a.q(Integer.toString(i1));
            MATParameters.a(a).a(s1, flag);
            return;
        }

        public GetGAID(Context context)
        {
            a = MATParameters.this;
            super();
            b = new WeakReference(context);
        }
    }


    private class GetUserAgent
        implements Runnable
    {

        final MATParameters a;
        private final WeakReference b;

        public void run()
        {
            try
            {
                WebView webview = new WebView((Context)b.get());
                String s1 = webview.getSettings().getUserAgentString();
                webview.destroy();
                MATParameters.a(a, s1);
                return;
            }
            catch (Exception exception)
            {
                return;
            }
            catch (VerifyError verifyerror)
            {
                return;
            }
        }

        public GetUserAgent(Context context)
        {
            a = MATParameters.this;
            super();
            b = new WeakReference(context);
        }
    }

}

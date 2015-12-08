// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.android.slyce.a;
import com.digitalanalytics.api.DigitalAnalytics;
import com.facebook.s;
import com.google.android.gms.analytics.f;
import com.google.android.gms.analytics.l;
import com.jcp.b.b;
import com.jcp.e.al;
import com.jcp.http.d;
import com.jcp.http.e;
import com.jcp.model.JCPStorePickupSettings;
import com.jcp.model.OrderItemsDetails;
import com.jcp.model.Session;
import com.jcp.pojo.GetAccountResponse;
import com.jcp.settings.model.JCPSettings;
import com.jcp.storepickup.pojo.Stores;
import com.jcp.util.ae;
import com.jcp.util.af;
import com.jcp.util.bo;
import com.jcp.util.bp;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Protocol;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import retrofit.RestAdapter;
import retrofit.client.OkClient;

// Referenced classes of package com.jcp:
//            a, b

public class JCP extends Application
    implements al
{

    private static JCP a;
    private static com.jcp.g.a b;
    private static JCPSettings c;
    private static e d;
    private static GetAccountResponse e;
    private static RestAdapter f;
    private static boolean g;
    private static String h;
    private static Map i;
    private static l j;
    private static af k;
    private static bo l;
    private static OkHttpClient m;
    private static CookieManager n;
    private static a o;
    private static final String q = com/jcp/JCP.getName();
    private static boolean r;
    private static Stores s;
    private static boolean t;
    private static OrderItemsDetails u;
    private static com.jcp.h.d v;
    private static com.jcp.h.d w;
    private int p;

    public JCP()
    {
    }

    public static com.jcp.h.d A()
    {
        return v;
    }

    public static com.jcp.h.d B()
    {
        return w;
    }

    public static void C()
    {
        w = null;
        v = null;
    }

    static String D()
    {
        return q;
    }

    private void E()
    {
        o = com.android.slyce.a.a(this);
        o.a("jcpenney853", new com.jcp.a(this));
    }

    private void F()
    {
        d = new e(this);
        n = new CookieManager(d, CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(n);
    }

    private void G()
    {
        try
        {
            k = af.a(this);
            return;
        }
        catch (Exception exception)
        {
            ae.a(q, "Error initializing login util:", exception);
        }
    }

    private void H()
    {
        j = com.google.android.gms.analytics.f.a(this).a(getString(0x7f0701f5));
        j.a(true);
    }

    private void I()
    {
        this;
        JVM INSTR monitorenter ;
        Thread thread;
        if (!com.jcp.b.b.a(this))
        {
            break MISSING_BLOCK_LABEL_32;
        }
        thread = new Thread(new com.jcp.b());
        thread.start();
        thread.join();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ae.a(q, "Error in loadsettings thread", ((Exception) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    private static void J()
    {
    }

    private void K()
    {
        h = null;
        try
        {
            h = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            return;
        }
        catch (Exception exception)
        {
            h = "DEFAULT";
        }
    }

    private void L()
    {
        r = true;
        if (c != null)
        {
            JCPStorePickupSettings jcpstorepickupsettings = c.getInStorePickup();
            if (jcpstorepickupsettings != null && "true".equalsIgnoreCase(jcpstorepickupsettings.getEnabled()))
            {
                r = false;
            }
        }
    }

    private void M()
    {
        com.jcp.c.l l1 = new com.jcp.c.l(this);
        l1.a(this);
        l1.e();
    }

    private static String a(String s1)
    {
        StringBuilder stringbuilder = new StringBuilder("JCPenney-Android/");
        stringbuilder.append(h);
        stringbuilder.append("/");
        stringbuilder.append(android.os.Build.VERSION.RELEASE);
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(";");
            stringbuilder.append(s1);
        }
        stringbuilder.append(l());
        return stringbuilder.toString();
    }

    public static void a(com.jcp.h.d d1)
    {
        v = d1;
    }

    public static void a(OrderItemsDetails orderitemsdetails)
    {
        u = orderitemsdetails;
    }

    public static void a(GetAccountResponse getaccountresponse)
    {
        e = getaccountresponse;
    }

    protected static void a(JCPSettings jcpsettings)
    {
        c = jcpsettings;
    }

    public static void a(Stores stores)
    {
        s = stores;
    }

    public static void a(HttpURLConnection httpurlconnection)
    {
        httpurlconnection.setRequestProperty("User-Agent", a(httpurlconnection.getRequestProperty("User-Agent")));
    }

    public static void a(Map map)
    {
        i = map;
    }

    public static bo b()
    {
        com/jcp/JCP;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            l = new bo();
        }
        com/jcp/JCP;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        com/jcp/JCP;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void b(com.jcp.h.d d1)
    {
        w = d1;
    }

    public static bp c()
    {
        return new bp();
    }

    public static JCP d()
    {
        return a;
    }

    public static com.jcp.g.a e()
    {
        return b;
    }

    public static JCPSettings f()
    {
        if (c == null)
        {
            c = new JCPSettings();
        }
        return c;
    }

    public static void g()
    {
        d.removeAll();
        J();
    }

    public static List h()
    {
        return d.getCookies();
    }

    public static void i()
    {
        Object obj = d.getCookies();
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((List) (obj)).iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        obj = (HttpCookie)iterator.next();
        if (!((HttpCookie) (obj)).getName().equalsIgnoreCase("itemCount")) goto _L5; else goto _L4
_L4:
        if (obj != null)
        {
            d.remove(null, ((HttpCookie) (obj)));
        }
        return;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static GetAccountResponse j()
    {
        return e;
    }

    public static OkHttpClient k()
    {
        com/jcp/JCP;
        JVM INSTR monitorenter ;
        OkHttpClient okhttpclient;
        if (m == null)
        {
            m = new OkHttpClient();
            m.setConnectTimeout(10L, TimeUnit.SECONDS);
            m.setReadTimeout(60L, TimeUnit.SECONDS);
            m.setWriteTimeout(60L, TimeUnit.SECONDS);
            ArrayList arraylist = new ArrayList();
            arraylist.add(Protocol.HTTP_1_1);
            m.setProtocols(arraylist);
            m.setCookieHandler(n);
            m.networkInterceptors().add(new d());
        }
        okhttpclient = m;
        com/jcp/JCP;
        JVM INSTR monitorexit ;
        return okhttpclient;
        Exception exception;
        exception;
        throw exception;
    }

    public static String l()
    {
        return ";JCP_NATIVE_APPLICATION;TYPE=ANDROID";
    }

    public static RestAdapter m()
    {
        com/jcp/JCP;
        JVM INSTR monitorenter ;
        RestAdapter restadapter;
        if (f == null)
        {
            n();
        }
        restadapter = f;
        com/jcp/JCP;
        JVM INSTR monitorexit ;
        return restadapter;
        Exception exception;
        exception;
        throw exception;
    }

    public static void n()
    {
        com/jcp/JCP;
        JVM INSTR monitorenter ;
        f = (new retrofit.RestAdapter.Builder()).setEndpoint(b.e).setClient(new OkClient(k())).setLogLevel(retrofit.RestAdapter.LogLevel.NONE).build();
        com/jcp/JCP;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean o()
    {
        boolean flag = g;
        g = true;
        return flag;
    }

    public static String p()
    {
        return h;
    }

    public static Map q()
    {
        return i;
    }

    public static l r()
    {
        return j;
    }

    public static af s()
    {
        return k;
    }

    public static boolean u()
    {
        return r;
    }

    public static Stores v()
    {
        return s;
    }

    public static a w()
    {
        return o;
    }

    public static OrderItemsDetails z()
    {
        return u;
    }

    public int a()
    {
        return p;
    }

    public void a(int i1)
    {
        p = i1;
    }

    public void a(int i1, String s1)
    {
        ae.a(q, (new StringBuilder()).append("Could not get session: status [").append(i1).append("] message [").append(s1).append("]").toString());
    }

    public void a(Session session)
    {
        if (session != null)
        {
            com.jcp.c.af.b(this).a(session.isRewardsEligible());
        }
    }

    public void onCreate()
    {
        DigitalAnalytics.startup(this);
        super.onCreate();
        m = null;
        a = this;
        H();
        b = new com.jcp.g.a(this);
        F();
        e = null;
        K();
        G();
        I();
        L();
        E();
        try
        {
            com.facebook.s.a(getApplicationContext());
            com.facebook.a.a.a(this);
        }
        catch (Exception exception)
        {
            ae.a(q, (new StringBuilder()).append("Exception while initializing facebook: ").append(exception.getMessage()).toString());
        }
        v = null;
        w = null;
        M();
    }

    public void onTerminate()
    {
        DigitalAnalytics.shutdown();
        super.onTerminate();
        if (b != null)
        {
            b.d();
        }
    }

    public boolean t()
    {
        boolean flag1 = false;
        PackageInfo packageinfo;
        boolean flag;
        try
        {
            packageinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
        }
        catch (Exception exception)
        {
            ae.a(q, "Exception getting package info", exception);
            exception = null;
        }
        flag = flag1;
        if (packageinfo != null)
        {
            flag = flag1;
            if (packageinfo.firstInstallTime == packageinfo.lastUpdateTime)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void x()
    {
        t = true;
    }

    public boolean y()
    {
        return t;
    }

}

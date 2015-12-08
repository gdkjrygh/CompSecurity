// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.provider;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.j;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.a;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.api.bluetooth.BluetoothService;
import com.pandora.android.fordsync.AppLinkBluetoothService;
import com.pandora.android.util.s;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.af;
import com.pandora.radio.data.o;
import com.pandora.radio.data.y;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import p.cw.c;
import p.cw.f;
import p.cx.p;
import p.dd.an;
import p.dd.ar;
import p.dd.as;
import p.dd.bi;
import p.dd.bn;
import p.dd.bo;
import p.dd.d;

public class b
    implements f
{

    public static volatile b a;
    private af c;
    private boolean d;
    private Application e;
    private String f;
    private String g;
    private boolean h;
    private p.cx.e.a i;
    private com.pandora.android.eureka.a j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private String o;
    private boolean p;
    private boolean q;
    private Intent r;
    private AsyncTask s;
    private final p.dt.b t = new p.dt.b("Android App Bus");
    private c u;
    private boolean v;
    private boolean w;

    public b(Application application)
    {
        k = false;
        l = false;
        a = this;
        e = application;
    }

    private PackageInfo G()
    {
        PackageInfo packageinfo;
        try
        {
            packageinfo = e.getPackageManager().getPackageInfo("com.pandora.android", 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return null;
        }
        return packageinfo;
    }

    private Intent H()
    {
        Intent intent = null;
        if (!I()) goto _L2; else goto _L1
_L1:
        intent = com.pandora.android.activity.a.b(null);
_L4:
        return intent;
_L2:
        y y1;
        y y2 = com.pandora.radio.util.i.b();
        y1 = y2;
        if (!com.pandora.android.fordsync.a.a().G())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (y2 != null)
        {
            y1 = y2;
            if (!com.pandora.radio.util.i.a(y2.c()))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        y1 = com.pandora.android.fordsync.a.a().r();
        if (y1 == null) goto _L4; else goto _L3
_L3:
        return a(y1);
    }

    private boolean I()
    {
        p.cw.a a1 = u.d().u();
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.cw.a.values().length];
                try
                {
                    b[p.cw.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[p.cw.a.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.cw.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.cw.a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[p.cw.a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.b[a1.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("isStationActive used unknown PlayerStateChangeEvent state: ").append(a1).toString());

        case 1: // '\001'
        case 2: // '\002'
            return false;

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            return true;
        }
    }

    private Intent a(y y1)
    {
        if (y1 == null || y1.c() == null)
        {
            return new PandoraIntent("show_no_station_selected");
        } else
        {
            com.pandora.android.activity.a.a(y1, null, false, true, p.cw.b.a, null);
            return new PandoraIntent("show_now_playing");
        }
    }

    public static boolean a()
    {
        return a != null;
    }

    public Intent A()
    {
        return r;
    }

    public AsyncTask B()
    {
        return s;
    }

    public j C()
    {
        return android.support.v4.content.j.a(e);
    }

    public p.cx.e.a D()
    {
        return i;
    }

    public void E()
    {
        p.df.a.a("AppGlobals", "AppGlobals.showHomeScreen()");
        Intent intent = b(new Intent());
        if (intent != null)
        {
            C().a(intent);
        }
    }

    public boolean F()
    {
        if (n()) goto _L2; else goto _L1
_L1:
        VideoAdManager videoadmanager;
        return false;
_L2:
        if ((videoadmanager = com.pandora.android.ads.VideoAdManager.c.a()) == null) goto _L1; else goto _L3
_L3:
        return videoadmanager.l();
        IllegalStateException illegalstateexception;
        illegalstateexception;
        p.df.a.a("AppGlobals", "AppGlobals.isWaitForVideoAd() IllegalStateException from VideoAdManager");
        return false;
    }

    public void a(int i1, String s1)
    {
        n = i1;
        o = s1;
    }

    public void a(Context context)
    {
        context.stopService(new Intent(context, com/pandora/android/api/bluetooth/BluetoothService));
        context.stopService(new Intent(context, com/pandora/android/fordsync/AppLinkBluetoothService));
    }

    public void a(Context context, Intent intent)
    {
        intent.putExtra("android.intent.extra.TITLE", "PandoraService");
        context.startService(intent);
    }

    public void a(Intent intent)
    {
        r = intent;
        if (r != null)
        {
            u.z().a();
        }
    }

    public void a(AsyncTask asynctask)
    {
        s = asynctask;
        if (s != null)
        {
            u.z().a();
        }
    }

    public void a(com.pandora.android.eureka.a a1)
    {
        j = a1;
    }

    public void a(af af1)
    {
        c = af1;
    }

    public void a(c c1)
    {
        if (c1 == null && u != null)
        {
            u.c(this);
        }
        if (c1 != null && u == null)
        {
            c1.b(this);
        }
        u = c1;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public boolean a(int i1)
    {
        return f() || i1 == 0 && c != null && c.v() != null;
    }

    public Intent b(Intent intent)
    {
        com/pandora/android/provider/b;
        JVM INSTR monitorenter ;
        if (i != p.cx.e.a.d && i != p.cx.e.a.a || u.C())
        {
            break MISSING_BLOCK_LABEL_38;
        }
        com/pandora/android/provider/b;
        JVM INSTR monitorexit ;
        return null;
        Object obj = A();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        a(((Intent) (null)));
        com/pandora/android/provider/b;
        JVM INSTR monitorexit ;
        return ((Intent) (obj));
        intent;
        com/pandora/android/provider/b;
        JVM INSTR monitorexit ;
        throw intent;
        if (B() == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        intent = new PandoraIntent("execute_startup_task");
        com/pandora/android/provider/b;
        JVM INSTR monitorexit ;
        return intent;
        if (!u.z().b())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        intent = new PandoraIntent("show_listening_timeout");
        com/pandora/android/provider/b;
        JVM INSTR monitorexit ;
        return intent;
        obj = intent.getStringExtra("intent_search_seed");
        if (com.pandora.radio.util.i.a(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        p.df.a.c("AppGlobals", (new StringBuilder()).append("Search seed: ").append(((String) (obj))).toString());
        a(p.di.p.a(((String) (obj)), new com.pandora.radio.util.c(null), false, true, p.cx.x.e.g));
        intent = new PandoraIntent("execute_startup_task");
        com/pandora/android/provider/b;
        JVM INSTR monitorexit ;
        return intent;
        if (u.y().d())
        {
            break MISSING_BLOCK_LABEL_221;
        }
        intent = new PandoraIntent("show_no_stations");
        com/pandora/android/provider/b;
        JVM INSTR monitorexit ;
        return intent;
        intent = intent.getStringExtra("intent_station_token");
        if (com.pandora.radio.util.i.a(intent))
        {
            break MISSING_BLOCK_LABEL_261;
        }
        intent = a(u.y().a(e, intent));
        com/pandora/android/provider/b;
        JVM INSTR monitorexit ;
        return intent;
        obj = H();
        intent = ((Intent) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        intent = new PandoraIntent("show_no_station_selected");
        p.df.a.a("AppGlobals", (new StringBuilder()).append("AppGlobals.makeStartupIntent --> stationStartIntent = ").append(intent).toString());
        com/pandora/android/provider/b;
        JVM INSTR monitorexit ;
        return intent;
    }

    public c b()
    {
        return u;
    }

    public void b(Context context)
    {
        context.startService(new Intent(context, com/pandora/android/api/bluetooth/BluetoothService));
        context.startService(new Intent(context, com/pandora/android/fordsync/AppLinkBluetoothService));
    }

    public void b(boolean flag)
    {
        k = flag;
    }

    public com.pandora.android.eureka.a c()
    {
        return j;
    }

    public void c(Intent intent)
    {
        p.df.a.a("AppGlobals", (new StringBuilder()).append("AppGlobals.showHomeScreen(followonIntent) : ").append(intent).toString());
        intent = b(intent);
        if (intent != null)
        {
            C().a(intent);
        }
    }

    public void c(boolean flag)
    {
        w = flag;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public af d()
    {
        return c;
    }

    public void d(boolean flag)
    {
        m = flag;
    }

    public p.dt.b e()
    {
        return t;
    }

    public void e(boolean flag)
    {
        p = flag;
    }

    public void f(boolean flag)
    {
        q = flag;
    }

    public boolean f()
    {
        return c != null && c.a();
    }

    public void g(boolean flag)
    {
        h = flag;
    }

    public boolean g()
    {
        return d;
    }

    public Application h()
    {
        return e;
    }

    public void h(boolean flag)
    {
label0:
        {
            if (u() != flag)
            {
                o o1 = a.b().j();
                String s1;
                if (flag)
                {
                    s1 = "on";
                } else
                {
                    s1 = "off";
                }
                o1.c(s1);
                if (!flag)
                {
                    break label0;
                }
                p.df.a.c("AppGlobals", "Bluetooth for Automotive ON - starting Pandora bluetooth services");
                b(e);
            }
            return;
        }
        p.df.a.c("AppGlobals", "Bluetooth for Automotive OFF - stopping Pandora bluetooth services");
        a(e);
    }

    public String i()
    {
        if (com.pandora.android.util.s.a(f))
        {
            PackageInfo packageinfo = G();
            if (packageinfo != null)
            {
                f = packageinfo.versionName;
            }
        }
        return f;
    }

    public void i(boolean flag)
    {
        if (l == flag)
        {
            return;
        } else
        {
            l = flag;
            return;
        }
    }

    public int j()
    {
        PackageInfo packageinfo = G();
        if (packageinfo != null)
        {
            return packageinfo.versionCode;
        } else
        {
            return 0;
        }
    }

    public String k()
    {
        if (g == null)
        {
            g = String.format("(%s %s)", new Object[] {
                com.pandora.android.util.s.o(), "6.3RC4-0-gf147bcb"
            });
        }
        return g;
    }

    public boolean l()
    {
        return k;
    }

    public boolean m()
    {
        return w;
    }

    public boolean n()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (u != null)
        {
            flag = flag1;
            if (!u.C())
            {
                flag = true;
            }
        }
        return flag;
    }

    public boolean o()
    {
        return m;
    }

    public void onAppLaunch(d d1)
    {
        v = d1.a;
    }

    public void onSignInState(an an1)
    {
        c = an1.a;
        i = an1.b;
        switch (com.pandora.android.provider._cls1.a[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            PandoraService.c("none");
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onStartupComplete(ar ar1)
    {
        p.df.a.a("AppGlobals", (new StringBuilder()).append("AppGlobals.onStartupComplete() --> event.intent : ").append(ar1.a).toString());
        ar1 = b(ar1.a);
        if (ar1 != null)
        {
            C().a(ar1);
        }
    }

    public void onStationCreated(as as)
    {
        if (m())
        {
            b().o().a(com.pandora.radio.util.k.k.o);
            c(false);
        }
    }

    public void onTrafficDrivingPartnerData(bi bi1)
    {
        boolean flag = true;
        if (v && bi1.a.containsKey("partnerCode"))
        {
            bi1 = new SearchDescriptor(null, bi1.a.getString("artist"), bi1.a.getString("song"), true, bi1.a.getString("type"), bi1.a);
            com.pandora.radio.util.c c1 = new com.pandora.radio.util.c(Integer.valueOf(0x2942b588));
            if (bi1.c())
            {
                flag = false;
            }
            a(p.di.p.a(bi1, c1, flag, p.cx.x.e.g));
        }
    }

    public void onUserCreated(bn bn)
    {
        b(true);
        c(true);
    }

    public void onUserData(bo bo1)
    {
        a(bo1.a);
    }

    public String p()
    {
        return o;
    }

    public int q()
    {
        return n;
    }

    public boolean r()
    {
        return p;
    }

    public boolean s()
    {
        return q;
    }

    public boolean t()
    {
        return h;
    }

    public boolean u()
    {
        if (!p.cy.b.a())
        {
            return false;
        }
        o o1 = a.b().j();
        String s1 = o1.y();
        if (s1 == null)
        {
            o1.c("on");
            return true;
        } else
        {
            return "on".equals(s1);
        }
    }

    public boolean v()
    {
        boolean flag2 = false;
        boolean flag1 = false;
        boolean flag = flag2;
        if (u.C())
        {
            flag = flag2;
            if (!z())
            {
                Object obj = p.cx.c.a();
                ((p.cx.c) (obj)).d("onResumeIfAccessoryConnected - display Accessory Screen");
                flag = flag1;
                if (((p.cx.c) (obj)).G())
                {
                    ((p.cx.c) (obj)).u();
                    flag = true;
                }
                obj = com.pandora.android.fordsync.a.a();
                if (((com.pandora.android.fordsync.a) (obj)).G())
                {
                    ((com.pandora.android.fordsync.a) (obj)).m();
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean w()
    {
        return false;
    }

    public boolean x()
    {
        return w();
    }

    public boolean y()
    {
        return w();
    }

    public boolean z()
    {
        return l;
    }
}

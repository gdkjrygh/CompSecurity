// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android;

import android.app.Application;
import android.content.Intent;
import android.os.SystemClock;
import android.support.multidex.MultiDexApplication;
import android.util.Log;
import android.view.ViewConfiguration;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.pandora.android.ads.f;
import com.pandora.android.api.bluetooth.BluetoothService;
import com.pandora.android.countdown.e;
import com.pandora.android.data.d;
import com.pandora.android.data.n;
import com.pandora.android.provider.a;
import com.pandora.android.provider.b;
import com.pandora.android.util.TabsClickedStatsCollector;
import com.pandora.android.util.j;
import com.pandora.android.util.s;
import com.pandora.radio.data.r;
import com.pandora.radio.data.z;
import com.pandora.radio.util.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Hashtable;
import p.cn.c;
import p.l.g;

public class PandoraApp extends MultiDexApplication
{

    protected b a;
    protected p.cw.c b;
    private com.pandora.radio.util.a c;
    private p.bw.b d;
    private e e;

    public PandoraApp()
    {
        d = null;
        e = null;
    }

    private void d()
    {
        if (!s.u())
        {
            e = new e(b.a);
            d = new p.bw.b(a);
        }
        com.pandora.android.iap.d.d.a();
    }

    private void e()
    {
        Log.i("PANDORA", "PANDORA ------------------------------------------------------------------------------------------------------------------------------");
        Log.i("PANDORA", s.g(", "));
        Log.i("PANDORA", "PANDORA ------------------------------------------------------------------------------------------------------------------------------");
    }

    private ArrayList f()
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(com.pandora.android.provider.a.b());
        arraylist.add(p.cn.c.b());
        return arraylist;
    }

    private void g()
    {
        if (android.os.Build.VERSION.SDK_INT >= 19 && !s.p())
        {
            WebView.setWebContentsDebuggingEnabled(true);
            p.df.a.a("PANDORA", "WebView Content Debugging enabled!");
        }
    }

    private void h()
    {
        ViewConfiguration viewconfiguration;
        Field field;
        try
        {
            viewconfiguration = ViewConfiguration.get(this);
            field = android/view/ViewConfiguration.getDeclaredField("sHasPermanentMenuKey");
        }
        catch (Exception exception)
        {
            p.df.a.c("PandoraApp", "doPermanentMenuHack failed");
            return;
        }
        if (field == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        field.setAccessible(true);
        field.setBoolean(viewconfiguration, false);
    }

    private void i()
    {
        if (!b.a.u())
        {
            return;
        } else
        {
            startService(new Intent(this, com/pandora/android/api/bluetooth/BluetoothService));
            return;
        }
    }

    protected com.pandora.android.eureka.a a(p.cw.c c1)
    {
        return new com.pandora.android.eureka.a(c1);
    }

    protected com.pandora.radio.util.a a()
    {
        return new f(this);
    }

    protected p.cw.c a(ArrayList arraylist, com.pandora.android.iap.e e1, com.pandora.radio.util.a a1)
        throws p.cw.e.b
    {
        r r1 = new r("android", new String(n.a), n.c, n.b);
        return new p.cw.c(a.h(), a.i(), a.j(), s.u(), s.m(), "PANDORA", false, false, d.g, d.a, d.b, d.c, d.d, d.e, d.f, e1, a1, arraylist, p.ct.a.a(), a, r1);
    }

    protected void a(Application application)
    {
        boolean flag = (new com.pandora.android.data.e(application)).b();
        byte byte0;
        if (s.p())
        {
            byte0 = 4;
        } else
        {
            byte0 = 2;
        }
        p.df.a.a(flag, byte0);
    }

    public com.pandora.radio.util.a b()
    {
        return c;
    }

    protected void c()
    {
        com.crashlytics.android.d.a(this);
    }

    public void onCreate()
    {
        a = new b(this);
        c();
        a(this);
        j.a(p.l.g.a(this));
        CookieSyncManager.createInstance(this);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieSyncManager.getInstance().startSync();
        Object obj;
        Hashtable hashtable;
        try
        {
            obj = f();
            com.pandora.android.iap.e e1 = new com.pandora.android.iap.e();
            c = a();
            b = a(((ArrayList) (obj)), e1, c);
            b.o().b(new z(com.pandora.radio.data.z.a.a, SystemClock.elapsedRealtime()));
            obj = new com.pandora.android.fordsync.a(b);
            b.a(((p.cx.k) (obj)));
            a.a(b);
            obj = a(b);
            a.a(((com.pandora.android.eureka.a) (obj)));
            obj = ((com.pandora.android.eureka.a) (obj)).k();
        }
        catch (p.cw.e.b b1)
        {
            p.df.a.b("PandoraApp", "Error starting radio ... bailing", b1);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        b.b(((p.dg.a) (obj)));
        com.pandora.android.widget.d.a();
        p.cp.d.k();
        TabsClickedStatsCollector.a();
        p.df.a.c("PandoraApp", "Initializing PandoraLink.");
        if (!b.a.y())
        {
            break MISSING_BLOCK_LABEL_347;
        }
        obj = p.dm.e.b;
_L1:
        p.cx.c.a(b, 3, ((p.dm.e) (obj)));
        p.cx.c.a().a(p.dm.g.a(0));
        p.cx.c.a().d(a.w());
        i();
        b.a(p.cx.c.a());
        if (d.j && s.q())
        {
            p.df.a.a("PandoraApp", "Starting SocketServer");
            p.cs.b.a();
        }
        b.b(com.pandora.android.fordsync.a.a());
        hashtable = b.l().g();
        if (s.m())
        {
            obj = "true";
        } else
        {
            obj = "false";
        }
        hashtable.put("isFromAmazon", obj);
        b.b(com.pandora.android.gcm.a.a());
        b.b(com.pandora.android.push.a.a());
        d();
        h();
        e();
        g();
        return;
        obj = p.dm.e.a;
          goto _L1
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        p.df.a.c("PandoraApp", "PA onLowMemory() ");
        s.k("PA");
    }
}

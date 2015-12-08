// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.tremorvideo.sdk.android.a.k;
import java.io.File;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            aw, ar, as, at, 
//            au, b, az, cg, 
//            ct, ea, a

public class aq
    implements a.a, aw
{

    public static az a;
    public static a.a b;
    boolean c;
    int d;
    BroadcastReceiver e;
    BroadcastReceiver f;
    BroadcastReceiver g;
    private b h;
    private Activity i;
    private WebView j;
    private a.a k;

    public aq()
    {
        c = true;
        d = -1;
        e = new ar(this);
        f = new as(this);
        g = new at(this);
    }

    static b a(aq aq1)
    {
        return aq1.h;
    }

    static Activity b(aq aq1)
    {
        return aq1.i;
    }

    private Double l()
    {
        return Double.valueOf((new Double(((WindowManager)i.getSystemService("window")).getDefaultDisplay().getWidth())).doubleValue() / (new Double(440D)).doubleValue());
    }

    public int a(ea ea)
    {
        return k.a(ea, -1);
    }

    public int a(ea ea, int i1)
    {
        return k.a(ea, i1);
    }

    public az a()
    {
        return a;
    }

    public void a(float f1, float f2)
    {
    }

    public void a(int i1)
    {
        k.a(i1);
    }

    public void a(int i1, int j1, Intent intent)
    {
    }

    public void a(Configuration configuration)
    {
    }

    public void a(Bundle bundle, Activity activity)
    {
        Thread.setDefaultUncaughtExceptionHandler(new au(this));
        i = activity;
        h = new b(this, i, a);
        i.requestWindowFeature(1);
        i.getWindow().setFlags(1024, 1024);
        j = new k(i, this);
        bundle = new File((new StringBuilder()).append(a.y().h().getAbsolutePath()).append("/index.html").toString());
        activity = l();
        j.setPadding(0, 0, 0, 0);
        if (activity.doubleValue() >= 1.0D)
        {
            float f1 = i.getResources().getDisplayMetrics().density;
            activity = new android.widget.LinearLayout.LayoutParams((int)((float)440 * f1), (int)((float)320 * f1));
            activity.gravity = 17;
            LinearLayout linearlayout = new LinearLayout(i);
            linearlayout.setGravity(17);
            j.setInitialScale((int)(f1 * 100F));
            j.loadUrl((new StringBuilder()).append("file://").append(bundle.getAbsolutePath()).toString());
            linearlayout.addView(j, activity);
            i.setContentView(linearlayout);
        } else
        {
            float f2 = ct.I();
            j.setInitialScale((int)(f2 * 100F));
            j.loadUrl((new StringBuilder()).append("file://").append(bundle.getAbsolutePath()).toString());
            i.setContentView(j);
        }
        k = b;
        i.registerReceiver(e, new IntentFilter("android.intent.action.SCREEN_OFF"));
        i.registerReceiver(f, new IntentFilter("android.intent.action.SCREEN_ON"));
        i.registerReceiver(g, new IntentFilter("android.intent.action.USER_PRESENT"));
    }

    public void a(a a1)
    {
        i.setResult(100, new Intent());
        i.finish();
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        return false;
    }

    public Context b()
    {
        return i;
    }

    public void b(int i1)
    {
        d = i1;
    }

    public int c()
    {
        return Resources.getSystem().getConfiguration().orientation != 2 ? 1 : 0;
    }

    public int d()
    {
        return d;
    }

    public boolean e()
    {
        return false;
    }

    public void f()
    {
        h.c();
    }

    public void g()
    {
        h.d();
    }

    public void h()
    {
        h.e();
    }

    public void i()
    {
    }

    public void j()
    {
        ct.d("BuyItNowWebView - onDestroy");
        if (h != null)
        {
            h.n();
            h = null;
        }
        i.unregisterReceiver(e);
        i.unregisterReceiver(f);
        i.unregisterReceiver(g);
        System.gc();
    }

    public b k()
    {
        return h;
    }
}

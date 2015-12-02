// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            r, s, o, t, 
//            p, q

public class n
{

    private static final String c = com/mobvista/sdk/m/core/loader/n.getSimpleName();
    boolean a;
    boolean b;
    private int d;
    private int e;
    private Handler f;
    private t g;
    private String h;
    private String i;
    private WebView j;
    private boolean k;
    private final Runnable l = new r(this);
    private final Runnable m = new s(this);

    public n()
    {
        d = 15000;
        e = 3000;
        f = new Handler(Looper.getMainLooper());
    }

    static String a()
    {
        return c;
    }

    static String a(n n1)
    {
        return n1.h;
    }

    static String a(n n1, String s1)
    {
        n1.h = s1;
        return s1;
    }

    private void a(Context context)
    {
        if (Thread.currentThread() == Looper.getMainLooper().getThread())
        {
            a(context, h);
            return;
        } else
        {
            f.post(new o(this, context));
            return;
        }
    }

    private void a(Context context, String s1)
    {
        b(context);
        if (!TextUtils.isEmpty(i))
        {
            j.getSettings().setDefaultTextEncodingName("utf-8");
            e = 1000;
            d = 1000;
            Log.i(c, i);
            j.loadDataWithBaseURL(s1, i, "*/*", "utf-8", s1);
            return;
        } else
        {
            j.loadUrl(s1);
            return;
        }
    }

    static void a(n n1, Context context, String s1)
    {
        n1.a(context, s1);
    }

    static boolean a(n n1, boolean flag)
    {
        n1.k = true;
        return true;
    }

    private void b()
    {
        synchronized (c)
        {
            e();
            j.stopLoading();
            j.destroy();
            if (g != null)
            {
                g.c(h);
            }
        }
    }

    private void b(Context context)
    {
        j = new WebView(context);
        j.getSettings().setJavaScriptEnabled(true);
        j.getSettings().setCacheMode(2);
        j.getSettings().setLoadsImagesAutomatically(false);
        j.setWebViewClient(new p(this));
        j.setWebChromeClient(new q(this));
    }

    static boolean b(n n1)
    {
        return n1.k;
    }

    private void c()
    {
        g();
        if (a)
        {
            d = 15000;
        }
        f();
    }

    static void c(n n1)
    {
        n1.b();
    }

    static t d(n n1)
    {
        return n1.g;
    }

    private void d()
    {
        i();
        if (a)
        {
            e = 3000;
        }
        h();
    }

    private void e()
    {
        i();
        g();
    }

    static void e(n n1)
    {
        n1.c();
    }

    private void f()
    {
        f.postDelayed(m, d);
    }

    static void f(n n1)
    {
        n1.i();
    }

    private void g()
    {
        f.removeCallbacks(m);
    }

    static void g(n n1)
    {
        n1.g();
    }

    static WebView h(n n1)
    {
        return n1.j;
    }

    private void h()
    {
        f.postDelayed(l, e);
    }

    private void i()
    {
        f.removeCallbacks(l);
    }

    static void i(n n1)
    {
        n1.e();
    }

    static void j(n n1)
    {
        n1.d();
    }

    static int k(n n1)
    {
        return n1.e;
    }

    static int l(n n1)
    {
        return n1.d;
    }

    public final void a(Context context, String s1, t t1)
    {
        if (t1 == null)
        {
            throw new NullPointerException("OverrideUrlLoadingListener can not be null");
        } else
        {
            h = s1;
            g = t1;
            a(context);
            return;
        }
    }

    public final void a(Context context, String s1, String s2, t t1)
    {
        if (t1 == null)
        {
            throw new NullPointerException("OverrideUrlLoadingListener can not be null");
        } else
        {
            i = s2;
            h = s1;
            g = t1;
            a(context);
            return;
        }
    }

}

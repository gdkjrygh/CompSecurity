// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.d;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.URLUtil;
import java.util.ArrayList;

// Referenced classes of package com.tremorvideo.sdk.android.d:
//            b, p, q, v, 
//            t, u, x

class o extends b
{

    protected float b;
    protected int c;
    protected int d;
    private v.m e;
    private final v.a f;
    private final v.e g;
    private boolean h;
    private Runnable i;
    private Handler j;
    private final int k;
    private BroadcastReceiver l;
    private boolean m;

    public o(v v1, v.a a1, v.e e1)
    {
        super(v1);
        e = v.m.d;
        i = new p(this);
        j = new Handler();
        l = new q(this);
        c = -1;
        d = -1;
        f = a1;
        g = e1;
        v1 = a().getContext();
        int i1;
        if (v1 instanceof Activity)
        {
            i1 = ((Activity)v1).getRequestedOrientation();
        } else
        {
            i1 = -1;
        }
        k = i1;
        f();
    }

    private void a(int i1)
    {
        g();
        a().a(t.a(c, d));
    }

    static void a(o o1, int i1)
    {
        o1.a(i1);
    }

    static boolean a(o o1)
    {
        return o1.h;
    }

    static boolean a(o o1, boolean flag)
    {
        o1.h = flag;
        return flag;
    }

    static Handler b(o o1)
    {
        return o1.j;
    }

    private void b(boolean flag)
    {
    }

    static int c(o o1)
    {
        return o1.i();
    }

    private void f()
    {
        e = v.m.a;
        g();
        h();
        a().getContext().registerReceiver(l, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
    }

    private void g()
    {
        int j1 = 0;
        Object obj = a().getContext();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)((Context) (obj)).getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        b = displaymetrics.density;
        int i1;
        int k1;
        int l1;
        if (obj instanceof Activity)
        {
            obj = ((Activity)obj).getWindow();
            Rect rect = new Rect();
            ((Window) (obj)).getDecorView().getWindowVisibleDisplayFrame(rect);
            j1 = rect.top;
            i1 = ((Window) (obj)).findViewById(0x1020002).getTop() - j1;
        } else
        {
            i1 = 0;
        }
        k1 = displaymetrics.widthPixels;
        l1 = displaymetrics.heightPixels;
        c = (int)((double)k1 * (160D / (double)displaymetrics.densityDpi));
        d = (int)((double)(l1 - j1 - i1) * (160D / (double)displaymetrics.densityDpi));
    }

    private void h()
    {
        j.removeCallbacks(i);
        j.post(i);
    }

    private int i()
    {
        return ((WindowManager)a().getContext().getSystemService("window")).getDefaultDisplay().getOrientation();
    }

    protected void a(String s, int i1, int j1, boolean flag, boolean flag1)
    {
        if (f != v.a.b)
        {
            if (s != null && !URLUtil.isValidUrl(s))
            {
                a().a("expand", "URL passed to expand() was invalid.");
                return;
            }
            a(flag);
            b(flag1);
            e = v.m.c;
            a().a(u.a(e));
            if (a().j() != null)
            {
                a().j().a(a());
                return;
            }
        }
    }

    protected void a(boolean flag)
    {
        m = flag;
        v v1 = a();
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (v1.m() != null)
        {
            v1.m().a(v1, flag);
        }
    }

    public void b()
    {
        j.removeCallbacks(i);
        a().getContext().unregisterReceiver(l);
_L1:
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        if (!illegalargumentexception.getMessage().contains("Receiver not registered"))
        {
            throw illegalargumentexception;
        }
          goto _L1
    }

    protected void c()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(t.a(c, d));
        arraylist.add(x.a(h));
        a().a(arraylist);
        e = v.m.b;
        a().a(u.a(e));
    }

    protected void d()
    {
        a().setVisibility(4);
        e = v.m.d;
        if (a().k() != null)
        {
            a().k().a(a(), e);
        }
    }

    protected boolean e()
    {
        return true;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bk, ex, bm, ct, 
//            cj, by, ea, az, 
//            dw, a

public class AdViewManager
{
    public static interface Listener
    {

        public abstract void onAdComplete(AdViewManager adviewmanager);
    }

    class a
        implements a.a
    {

        final AdViewManager a;
        private Context b;

        public int a(ea ea1)
        {
            return a(ea1, -1);
        }

        public int a(ea ea1, int i)
        {
            int j = -1;
            if (ea1 != null)
            {
                ct.d((new StringBuilder()).append("Starting Event: ").append(ct.B()).append("ms ").append(ea1.a().toString()).append(" ").append(ea1.i()).append(" ").append(ea1.c()).toString());
                i = AdViewManager.c(a).a(ea1, i);
                j = i;
                if (ea1.e())
                {
                    j = i;
                    if (ea1.h())
                    {
                        AdViewManager.d(a);
                        j = i;
                    }
                }
            }
            return j;
        }

        public az a()
        {
            return a.c;
        }

        public void a(int i)
        {
            if (i != -1)
            {
                AdViewManager.c(a).a(i);
                ex.a a1 = AdViewManager.c(a).e();
                ea ea1 = a1.c;
                ct.d((new StringBuilder()).append("Ending Event: ").append(a1.e).append("ms ").append(ea1.a().toString()).append(" ").append(ea1.i()).append(" ").append(ea1.c()).toString());
                if (ea1.e() && !ea1.h())
                {
                    AdViewManager.d(a);
                }
            }
        }

        public void a(com.tremorvideo.sdk.android.videoad.a a1)
        {
            AdViewManager.a(a);
            ct.d(" ");
            ct.d("<<< Ad End");
            ct.d(" ");
            ct.y().f();
            AdViewManager.b(a);
        }

        public Context b()
        {
            return b;
        }

        public void b(int i)
        {
        }

        public int c()
        {
            return 0;
        }

        public int d()
        {
            return -1;
        }

        public a(Context context, ex ex1)
        {
            a = AdViewManager.this;
            super();
            b = context;
            AdViewManager.a(AdViewManager.this, ex1);
        }
    }


    public static final int ACTIVITY_REQUEST_CODE = 11;
    ViewGroup a;
    bm b;
    bk c;
    Activity d;
    a.a e;
    Listener f;
    private ex g;

    public AdViewManager(Activity activity, ViewGroup viewgroup, az az)
    {
        c = (bk)az;
        g = new ex();
        d = activity;
        a = viewgroup;
        e = new a(activity, g);
        b = new bm(activity, e, c, viewgroup.getWidth());
        b.b();
        viewgroup.addView(b);
    }

    static ex a(AdViewManager adviewmanager, ex ex1)
    {
        adviewmanager.g = ex1;
        return ex1;
    }

    private void a()
    {
        if (!c.x())
        {
            return;
        }
        try
        {
            ct.d("Sending Event History");
            cj.a(d, c, g, b.g());
            return;
        }
        catch (Exception exception)
        {
            ct.a("Error Sending Event History", exception);
        }
    }

    static void a(AdViewManager adviewmanager)
    {
        adviewmanager.a();
    }

    private void b()
    {
        a.removeView(b);
        b = null;
        e = null;
        if (f != null)
        {
            d.runOnUiThread(new by(this));
        }
    }

    static void b(AdViewManager adviewmanager)
    {
        adviewmanager.b();
    }

    static ex c(AdViewManager adviewmanager)
    {
        return adviewmanager.g;
    }

    private void c()
    {
        if (!c.x())
        {
            return;
        }
        try
        {
            ex.a a1 = g.e();
            ct.d((new StringBuilder()).append("Sending Billable Event: ").append(a1.c.a().toString()).append(" ").append(a1.c.c()).toString());
            cj.a(d, c, a1);
            return;
        }
        catch (Exception exception)
        {
            ct.a("Error Sending Billable Event", exception);
        }
    }

    static void d(AdViewManager adviewmanager)
    {
        adviewmanager.c();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 11)
        {
            b.a(i);
        }
    }

    public void onResume()
    {
        b.d();
    }

    public void onScreenOff()
    {
        b.e();
    }

    public void onScreenOn()
    {
        b.f();
    }

    public void onStop()
    {
        b.c();
    }

    public void setListener(Listener listener)
    {
        f = listener;
    }
}

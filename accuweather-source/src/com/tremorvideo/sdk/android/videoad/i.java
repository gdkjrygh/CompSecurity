// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Intent;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            a, ct, az, ey, 
//            ea, cf, bz, j, 
//            gd, k, Playvideo

public class i extends a
{

    private ey c;
    private boolean d;
    private boolean e;
    private az f;

    public i(a.a a1, Activity activity, az az1)
    {
        super(a1, activity);
        f = az1;
        if (ct.b(a))
        {
            a.setRequestedOrientation(1);
        }
        c = az1.s();
        d = false;
        e = false;
        b.a(c.a(ea.b.k));
        a1 = az1.s();
        activity = a1.a(ea.b.l);
        a1 = a1.a(ea.b.n);
        activity = activity.i();
        az1 = new ArrayList();
        az1.add(new cf(activity, ea.b.l.b()));
        a1 = new bz(a, new j(this, activity), az1, f.r(), true, a1.i(), a());
        az1 = gd.a(c.d());
        activity = new ImageView(a);
        activity.setImageBitmap(az1);
        activity.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        activity.setFocusable(false);
        az1 = new FrameLayout(a);
        az1.addView(activity, new android.widget.FrameLayout.LayoutParams(-1, -1));
        activity = new android.widget.FrameLayout.LayoutParams(-2, -2);
        activity.gravity = 80;
        az1.addView(a1.d(), activity);
        a.setContentView(az1);
        if (c.a() > 0)
        {
            ct.d((new StringBuilder()).append("Skip Time MS: ").append(c.a()).toString());
            az1.postDelayed(new k(this), c.a());
        }
    }

    private int a()
    {
        return ((WindowManager)a.getSystemService("window")).getDefaultDisplay().getWidth();
    }

    static void a(i i1)
    {
        i1.o();
    }

    static void b(i i1)
    {
        i1.n();
    }

    static boolean c(i i1)
    {
        return i1.e;
    }

    static boolean d(i i1)
    {
        return i1.d;
    }

    private void n()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e)
        {
            e = true;
            b.a(c.a(ea.b.n));
            b.a(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void o()
    {
        this;
        JVM INSTR monitorenter ;
        if (!d && !e)
        {
            b.a(c.a(ea.b.l));
            d = true;
            Intent intent = new Intent(a, com/tremorvideo/sdk/android/videoad/Playvideo);
            intent.putExtra("tremorVideoType", "webview");
            intent.putExtra("tremorVideoURL", c.b());
            a.startActivityForResult(intent, 32);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean a(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            n();
            return true;
        } else
        {
            return super.a(i1, keyevent);
        }
    }

    public void c()
    {
        if (d)
        {
            b.a(c.a(ea.b.m));
            b.a(this);
        }
    }

    public a.b l()
    {
        return a.b.a;
    }
}

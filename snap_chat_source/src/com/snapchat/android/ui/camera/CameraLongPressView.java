// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.camera;

import Bt;
import Mf;
import Nl;
import Oj;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.squareup.otto.Bus;
import fT;
import gd;
import java.math.BigDecimal;

public class CameraLongPressView extends View
{

    public long a;
    public boolean b;
    public boolean c;
    public Runnable d;
    private final Paint e = new Paint();
    private float f;
    private float g;
    private long h;
    private long i;
    private long j;
    private int k;
    private boolean l;
    private boolean m;
    private boolean n;
    private float o;
    private float p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private final AccelerateInterpolator w;
    private final AccelerateDecelerateInterpolator x;
    private final DecelerateInterpolator y;
    private com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface z;

    public CameraLongPressView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        c = false;
        l = false;
        m = false;
        n = true;
        d = new Runnable() {

            private CameraLongPressView a;

            public final void run()
            {
                a.invalidate();
            }

            
            {
                a = CameraLongPressView.this;
                super();
            }
        };
        e.setAntiAlias(true);
        e.setStyle(android.graphics.Paint.Style.FILL);
        k = (int)context.getResources().getDimension(0x7f0a00f9);
        w = new AccelerateInterpolator(context, attributeset);
        x = new AccelerateDecelerateInterpolator(context, attributeset);
        y = new DecelerateInterpolator(context, attributeset);
    }

    private void a(Canvas canvas, int i1, int j1, float f1, float f2)
    {
        e.setColor(-1);
        e.setAlpha(j1);
        canvas.drawCircle(f, g, f2, e);
        e.setColor(-1);
        e.setAlpha(i1);
        canvas.drawCircle(f, g, f1, e);
    }

    public final void a()
    {
        if (l || c || !b)
        {
            return;
        } else
        {
            a = SystemClock.elapsedRealtime();
            removeCallbacks(d);
            post(d);
            b = true;
            l = true;
            return;
        }
    }

    public final void a(int i1, int j1)
    {
        n = false;
        a = SystemClock.elapsedRealtime();
        h = SystemClock.elapsedRealtime();
        removeCallbacks(d);
        f = i1;
        g = j1;
        s = Math.round(((float)i1 * 100F) / (float)getWidth());
        t = Math.round(((float)j1 * 100F) / (float)getHeight());
        u = Math.round(((float)i1 * 100F) / (float)getWidth());
        v = Math.round(((float)j1 * 100F) / (float)getHeight());
        b = false;
        c = false;
        l = false;
        post(d);
        b = true;
    }

    public void cancelLongPress()
    {
        if (!b)
        {
            return;
        } else
        {
            Long long1 = Long.valueOf(SystemClock.elapsedRealtime() - h);
            EasyMetric easymetric = (new EasyMetric("CAMERA_PAGE_ACTION")).a("time_span", long1).a("type", gd.CAMERA_BACK.toString()).a("action", fT.TAP_AND_HOLD.toString());
            Bt.a();
            easymetric.a("with_geolocation", Boolean.valueOf(Bt.bB())).a("location", String.format("%d,%d,%d,%d", new Object[] {
                Integer.valueOf(s), Integer.valueOf(t), Integer.valueOf(u), Integer.valueOf(v)
            })).b(false);
            double d1 = (new BigDecimal((double)long1.longValue() / 1000D)).setScale(1, 4).doubleValue();
            z.a(d1, s, t, u, v);
            removeCallbacks(d);
            setVisibility(4);
            b = false;
            c = false;
            l = false;
            return;
        }
    }

    public void onDraw(Canvas canvas)
    {
        long l1 = SystemClock.elapsedRealtime() - a;
        if (b)
        {
            invalidate();
        }
        if (c)
        {
            if ((float)l1 > 501F)
            {
                cancelLongPress();
                return;
            }
            if ((float)l1 < 334F)
            {
                int i1 = Math.round(102F * (1.0F - y.getInterpolation((float)l1 / 334F)));
                float f1 = p;
                float f6 = w.getInterpolation((float)l1 / 334F);
                a(canvas, r, i1, f1 * (f6 * 13F + 1.0F), o);
                return;
            } else
            {
                a(canvas, Math.round((1.0F - y.getInterpolation(((float)l1 - 334F) / 167F)) * 102F), 0, p * 14F, 0.0F);
                return;
            }
        }
        if (l)
        {
            if ((float)l1 > 167F)
            {
                cancelLongPress();
                return;
            } else
            {
                float f2 = o;
                float f7 = y.getInterpolation((float)l1 / 167F);
                float f8 = p;
                float f9 = y.getInterpolation((float)l1 / 167F);
                a(canvas, r, q, f8 * (1.0F - f9), f2 * (1.0F - f7));
                return;
            }
        }
        if ((float)l1 < 167F)
        {
            r = Math.round(((float)l1 * 0.4F * 255F) / 167F);
            q = 0;
        } else
        {
            r = Math.round(102F);
            if ((float)l1 < 668F)
            {
                q = Math.round((((float)l1 - 167F) * 255F * 0.4F) / 501F);
            } else
            {
                q = Math.round(102F);
            }
        }
        if ((float)l1 < 501F)
        {
            p = (float)k * 2.5F * w.getInterpolation((float)l1 / 501F);
        } else
        if ((l1 / 500L) % 2L != 0L)
        {
            p = (float)k * (2.0F + x.getInterpolation((float)(500L - l1 % 500L) / 500F) * 0.5F);
        } else
        {
            p = (float)k * (2.0F + x.getInterpolation((float)(l1 % 500L) / 500F) * 0.5F);
        }
        l1 = (long)((float)l1 - 167F);
        if (l1 < 0L)
        {
            o = 0.0F;
        } else
        if (l1 < 500L)
        {
            float f3 = k;
            o = w.getInterpolation((float)l1 / 500F) * (f3 * 1.75F);
        } else
        if ((l1 / 500L) % 2L != 0L)
        {
            float f4 = k;
            o = (x.getInterpolation((float)(500L - l1 % 500L) / 500F) * 0.5F + 1.25F) * f4;
        } else
        {
            float f5 = k;
            o = (x.getInterpolation((float)(l1 % 500L) / 500F) * 0.5F + 1.25F) * f5;
        }
        a(canvas, r, q, p, o);
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        f = i1 / 2;
        g = j1 / 2;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 68
    //                   1 105
    //                   2 146;
           goto _L1 _L2 _L3 _L4
_L1:
        if (getVisibility() == 0)
        {
            Mf.a().a(new Nl());
        }
        a();
        getParent().requestDisallowInterceptTouchEvent(false);
_L6:
        return false;
_L2:
        if (SystemClock.elapsedRealtime() - i < 300L)
        {
            m = true;
        } else
        {
            m = false;
        }
        i = SystemClock.elapsedRealtime();
        return false;
_L3:
        n = true;
        if (getVisibility() == 0)
        {
            Mf.a().a(new Nl());
        }
        a();
        getParent().requestDisallowInterceptTouchEvent(false);
        return false;
_L4:
        int i1;
        int j1;
        long l1;
        long l2;
        if (getVisibility() != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = SystemClock.elapsedRealtime();
        l2 = j;
        float f1 = motionevent.getRawY();
        float f2 = motionevent.getRawX();
        f = f2;
        g = f1;
        i1 = (int)f2;
        j1 = (int)f1;
        u = Math.round(((float)i1 * 100F) / (float)getWidth());
        v = Math.round(((float)j1 * 100F) / (float)getHeight());
        getParent().requestDisallowInterceptTouchEvent(true);
        if (l1 - l2 <= 1500L) goto _L6; else goto _L5
_L5:
        if (z != null)
        {
            z.a(i1, j1, false);
        }
        j = SystemClock.elapsedRealtime();
        return false;
        if (SystemClock.elapsedRealtime() - i <= 500L || m || !n) goto _L6; else goto _L7
_L7:
        setVisibility(0);
        a((int)motionevent.getRawX(), (int)motionevent.getRawY());
        Mf.a().a(new Oj((int)motionevent.getRawX(), (int)motionevent.getRawY()));
        getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }

    public void setDecorInterface(com.snapchat.android.camera.cameradecor.CameraDecor.CameraDecorInterface cameradecorinterface)
    {
        z = cameradecorinterface;
    }
}

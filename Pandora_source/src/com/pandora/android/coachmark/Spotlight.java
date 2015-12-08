// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import p.df.a;

// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkLayout, d, b

public class Spotlight extends View
{

    private Activity a;
    private int b[];
    private Pair c;
    private Rect d;
    private Paint e;
    private float f;
    private float g;
    private Point h;
    private float i;

    public Spotlight(Activity activity, Pair pair)
    {
        super(activity);
        f = 1.0F;
        a = activity;
        c = pair;
        b();
    }

    public transient Spotlight(Activity activity, int ai[])
    {
        super(activity);
        f = 1.0F;
        a = activity;
        b = ai;
        b();
    }

    private void a(View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            d = new Rect();
            view.getGlobalVisibleRect(d);
            return;
        }
    }

    private void b()
    {
        f = getResources().getDisplayMetrics().density;
        e = new Paint(1);
        e.setColor(0);
        e.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        com.pandora.android.coachmark.CoachmarkLayout.a(this, true);
        setDrawingCacheEnabled(false);
    }

    private void c()
    {
        int j;
        int k;
        if (b != null)
        {
            d();
        } else
        if (c != null)
        {
            e();
        } else
        {
            d = new Rect();
        }
        if (d.isEmpty()) goto _L2; else goto _L1
_L1:
        j = d.width();
        k = d.height();
        if (j <= k) goto _L4; else goto _L3
_L3:
        d.inset(0, -Math.round((float)(j - k) / 2.0F));
_L6:
        j = Math.round(10F * f);
        d.inset(-j, -j);
        j = Math.round(58F * f);
        if (d.width() < j)
        {
            j = (j - d.width()) / 2;
            d.inset(-j, -j);
        }
        i = (float)d.width() / 2.0F;
        g = 0.0F;
        j = Math.round(i);
        h = new Point(j, j);
_L2:
        return;
_L4:
        if (k > j)
        {
            d.inset(-Math.round((float)(k - j) / 2.0F), 0);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void d()
    {
        d = new Rect();
        for (int j = 0; j < b.length; j++)
        {
            Rect rect = new Rect();
            View view = a.findViewById(b[j]);
            if (view != null && view.getGlobalVisibleRect(rect))
            {
                d.union(rect);
            }
        }

    }

    private void e()
    {
        CoachmarkLayout.b b1 = (CoachmarkLayout.b)c.first;
        int j = ((Integer)c.second).intValue();
        d d1 = com.pandora.android.coachmark.d.a(a);
        b b2 = new b(d1.b());
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[CoachmarkLayout.b.values().length];
                try
                {
                    a[com.pandora.android.coachmark.CoachmarkLayout.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[CoachmarkLayout.b.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[CoachmarkLayout.b.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[CoachmarkLayout.b.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[CoachmarkLayout.b.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.pandora.android.coachmark._cls1.a[b1.ordinal()])
        {
        default:
            p.df.a.e("Spotlight", "Unknown item type");
            return;

        case 1: // '\001'
            a(d1.a());
            return;

        case 2: // '\002'
            a(b2.a());
            return;

        case 3: // '\003'
            a(b2.b());
            return;

        case 4: // '\004'
            a(b2.a(j));
            return;

        case 5: // '\005'
            break;
        }
        if (b2.c() != null)
        {
            a(b2.c());
            return;
        } else
        {
            f();
            return;
        }
    }

    private void f()
    {
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        int k = displaymetrics.widthPixels;
        int j = displaymetrics.heightPixels;
        k = Math.round((float)k / 2.0F);
        d = new Rect(k, j, k, j);
    }

    Animator a(long l)
    {
        return ObjectAnimator.ofFloat(this, "radius", new float[] {
            0.0F, i
        }).setDuration(l);
    }

    public boolean a()
    {
        return d == null || d.isEmpty();
    }

    Animator b(long l)
    {
        return ObjectAnimator.ofFloat(this, "radius", new float[] {
            g, 0.0F
        }).setDuration(l);
    }

    public Rect getGlobalBounds()
    {
        return d;
    }

    public float getRadius()
    {
        return g;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (h != null)
        {
            canvas.drawCircle(h.x, h.y, g, e);
        }
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
        c();
        setMeasuredDimension(d.width(), d.height());
    }

    public void setRadius(float f1)
    {
        g = f1;
        invalidate();
    }
}

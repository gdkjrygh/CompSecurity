// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.util.concurrent.TimeUnit;

public final class hcb
{

    private static final float a;
    private Runnable b;
    private final RecyclerView c;
    private final PointF d = new PointF();
    private final hcd e;
    private final float f;
    private final Rect g = new Rect();
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private long m;

    public hcb(RecyclerView recyclerview, hcd hcd)
    {
        b = new hcc(this);
        c = recyclerview;
        e = hcd;
        f = TypedValue.applyDimension(1, 600F, recyclerview.getResources().getDisplayMetrics());
        a(b.vh);
    }

    static long a(hcb hcb1, long l1)
    {
        hcb1.m = l1;
        return l1;
    }

    static boolean a(hcb hcb1)
    {
        return hcb1.j;
    }

    static int b(hcb hcb1)
    {
        return hcb1.i;
    }

    static long c(hcb hcb1)
    {
        return hcb1.m;
    }

    static float d()
    {
        return a;
    }

    static RecyclerView d(hcb hcb1)
    {
        return hcb1.c;
    }

    static long e(hcb hcb1)
    {
        return hcb1.l;
    }

    static hcd f(hcb hcb1)
    {
        return hcb1.e;
    }

    static PointF g(hcb hcb1)
    {
        return hcb1.d;
    }

    public final void a()
    {
        j = true;
        View view = ((iwq)olm.a(c.getContext(), iwq)).a();
        int i1;
        if (view != null)
        {
            i1 = view.getBottom();
        } else
        {
            i1 = 0;
        }
        g.set(0, i1, c.getWidth(), c.getHeight() - c.getPaddingBottom());
    }

    public final void a(int i1)
    {
        h = c.getContext().getResources().getDimensionPixelSize(i1);
    }

    public final void a(MotionEvent motionevent)
    {
        if (motionevent.getActionMasked() == 2)
        {
            d.set(motionevent.getX(), motionevent.getY());
            l = AnimationUtils.currentAnimationTimeMillis();
        }
        if (j)
        {
            float f1 = d.y;
            if (f1 <= (float)(g.top + h))
            {
                i = Math.round(Math.min(((float)h - (f1 - (float)g.top)) / (float)h, 1.0F) * -f);
            } else
            if (f1 >= (float)(g.bottom - h))
            {
                i = Math.round(Math.min((f1 - (float)(g.bottom - h)) / (float)h, 1.0F) * f);
            } else
            {
                i = 0;
            }
            if (i != 0 && !k)
            {
                k = true;
                m = AnimationUtils.currentAnimationTimeMillis();
                c.post(b);
            } else
            if (i == 0)
            {
                c();
                return;
            }
        }
    }

    public final void b()
    {
        j = false;
        c();
    }

    public final void c()
    {
        k = false;
        c.removeCallbacks(b);
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(1L);
    }
}

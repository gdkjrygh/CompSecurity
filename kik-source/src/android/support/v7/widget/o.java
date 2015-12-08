// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class o extends RecyclerView.p
{

    private final float a;
    protected final LinearInterpolator b = new LinearInterpolator();
    protected final DecelerateInterpolator c = new DecelerateInterpolator();
    protected PointF d;
    protected int e;
    protected int f;

    public o(Context context)
    {
        e = 0;
        f = 0;
        a = 25F / (float)context.getResources().getDisplayMetrics().densityDpi;
    }

    private static int a(int i, int j)
    {
        int k = i - j;
        j = k;
        if (i * k <= 0)
        {
            j = 0;
        }
        return j;
    }

    private static int a(int i, int j, int k, int l, int i1)
    {
        i1;
        JVM INSTR tableswitch -1 1: default 28
    //                   -1 38
    //                   0 48
    //                   1 44;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
_L2:
        i = k - i;
_L6:
        return i;
_L4:
        return l - j;
_L3:
        k -= i;
        i = k;
        if (k <= 0)
        {
            j = l - j;
            i = j;
            if (j >= 0)
            {
                return 0;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int c(int i)
    {
        return (int)Math.ceil((float)Math.abs(i) * a);
    }

    public abstract PointF a(int i);

    protected final void a()
    {
        f = 0;
        e = 0;
        d = null;
    }

    protected final void a(int i, int j, RecyclerView.p.a a1)
    {
        if (g() == 0)
        {
            c();
        } else
        {
            e = a(e, i);
            f = a(f, j);
            if (e == 0 && f == 0)
            {
                PointF pointf = a(f());
                if (pointf == null || pointf.x == 0.0F && pointf.y == 0.0F)
                {
                    Log.e("LinearSmoothScroller", "To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll");
                    a1.a(f());
                    c();
                    return;
                } else
                {
                    double d1 = Math.sqrt(pointf.x * pointf.x + pointf.y * pointf.y);
                    pointf.x = (float)((double)pointf.x / d1);
                    pointf.y = (float)((double)pointf.y / d1);
                    d = pointf;
                    e = (int)(pointf.x * 10000F);
                    f = (int)(pointf.y * 10000F);
                    i = c(10000);
                    a1.a((int)((float)e * 1.2F), (int)((float)f * 1.2F), (int)((float)i * 1.2F), b);
                    return;
                }
            }
        }
    }

    protected final void a(View view, RecyclerView.p.a a1)
    {
        boolean flag = true;
        int l = 0;
        RecyclerView.i i;
        int j;
        int k;
        if (d == null || d.x == 0.0F)
        {
            j = 0;
        } else
        if (d.x > 0.0F)
        {
            j = 1;
        } else
        {
            j = -1;
        }
        i = b();
        if (!i.f())
        {
            k = 0;
        } else
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            k = RecyclerView.i.h(view);
            int k1 = layoutparams.leftMargin;
            int i2 = RecyclerView.i.j(view);
            k = a(k - k1, layoutparams.rightMargin + i2, i.s(), i.q() - i.u(), j);
        }
        if (d == null || d.y == 0.0F)
        {
            j = 0;
        } else
        {
            j = ((flag) ? 1 : 0);
            if (d.y <= 0.0F)
            {
                j = -1;
            }
        }
        i = b();
        if (!i.g())
        {
            j = l;
        } else
        {
            RecyclerView.LayoutParams layoutparams1 = (RecyclerView.LayoutParams)view.getLayoutParams();
            int i1 = RecyclerView.i.i(view);
            int j1 = layoutparams1.topMargin;
            int l1 = RecyclerView.i.k(view);
            j = a(i1 - j1, layoutparams1.bottomMargin + l1, i.t(), i.r() - i.v(), j);
        }
        l = (int)Math.ceil((double)c((int)Math.sqrt(k * k + j * j)) / 0.33560000000000001D);
        if (l > 0)
        {
            a1.a(-k, -j, l, c);
        }
    }
}

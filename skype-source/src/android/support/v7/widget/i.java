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

public abstract class i extends RecyclerView.r
{

    private final float a;
    protected final LinearInterpolator b = new LinearInterpolator();
    protected final DecelerateInterpolator c = new DecelerateInterpolator();
    protected PointF d;
    protected int e;
    protected int f;

    public i(Context context)
    {
        e = 0;
        f = 0;
        a = 25F / (float)context.getResources().getDisplayMetrics().densityDpi;
    }

    private static int a(int j, int k)
    {
        int l = j - k;
        k = l;
        if (j * l <= 0)
        {
            k = 0;
        }
        return k;
    }

    private static int a(int j, int k, int l, int i1, int j1)
    {
        j1;
        JVM INSTR tableswitch -1 1: default 28
    //                   -1 38
    //                   0 48
    //                   1 44;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
_L2:
        j = l - j;
_L6:
        return j;
_L4:
        return i1 - k;
_L3:
        l -= j;
        j = l;
        if (l <= 0)
        {
            j = i1 - k;
            if (j < 0)
            {
                return j;
            } else
            {
                return 0;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private int c(int j)
    {
        return (int)Math.ceil((float)Math.abs(j) * a);
    }

    public abstract PointF a(int j);

    protected final void a()
    {
        f = 0;
        e = 0;
        d = null;
    }

    protected final void a(int j, int k, RecyclerView.r.a a1)
    {
        if (g() == 0)
        {
            c();
        } else
        {
            e = a(e, j);
            f = a(f, k);
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
                    j = c(10000);
                    a1.a((int)((float)e * 1.2F), (int)((float)f * 1.2F), (int)((float)j * 1.2F), b);
                    return;
                }
            }
        }
    }

    protected final void a(View view, RecyclerView.r.a a1)
    {
        RecyclerView.i j;
        int k;
        int l;
        int i1;
        if (d == null || d.x == 0.0F)
        {
            k = 0;
        } else
        if (d.x > 0.0F)
        {
            k = 1;
        } else
        {
            k = -1;
        }
        j = b();
        if (!j.canScrollHorizontally())
        {
            l = 0;
        } else
        {
            RecyclerView.j j1 = (RecyclerView.j)view.getLayoutParams();
            l = j.getDecoratedLeft(view);
            int k1 = j1.leftMargin;
            int i2 = j.getDecoratedRight(view);
            l = a(l - k1, j1.rightMargin + i2, j.getPaddingLeft(), j.getWidth() - j.getPaddingRight(), k);
        }
        if (d == null || d.y == 0.0F)
        {
            k = 0;
        } else
        if (d.y > 0.0F)
        {
            k = 1;
        } else
        {
            k = -1;
        }
        j = b();
        if (!j.canScrollVertically())
        {
            k = 0;
        } else
        {
            RecyclerView.j j2 = (RecyclerView.j)view.getLayoutParams();
            int l1 = j.getDecoratedTop(view);
            int k2 = j2.topMargin;
            int l2 = j.getDecoratedBottom(view);
            k = a(l1 - k2, j2.bottomMargin + l2, j.getPaddingTop(), j.getHeight() - j.getPaddingBottom(), k);
        }
        i1 = (int)Math.ceil((double)c((int)Math.sqrt(l * l + k * k)) / 0.33560000000000001D);
        if (i1 > 0)
        {
            a1.a(-l, -k, i1, c);
        }
    }
}

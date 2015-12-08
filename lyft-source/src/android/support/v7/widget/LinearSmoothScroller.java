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

public abstract class LinearSmoothScroller extends RecyclerView.SmoothScroller
{

    private final float a;
    protected final LinearInterpolator b = new LinearInterpolator();
    protected final DecelerateInterpolator c = new DecelerateInterpolator();
    protected PointF d;
    protected int e;
    protected int f;

    public LinearSmoothScroller(Context context)
    {
        e = 0;
        f = 0;
        a = a(context.getResources().getDisplayMetrics());
    }

    private int a(int i, int j)
    {
        int k = i - j;
        j = k;
        if (i * k <= 0)
        {
            j = 0;
        }
        return j;
    }

    protected float a(DisplayMetrics displaymetrics)
    {
        return 25F / (float)displaymetrics.densityDpi;
    }

    public int a(int i, int j, int k, int l, int i1)
    {
        i1;
        JVM INSTR tableswitch -1 1: default 28
    //                   -1 38
    //                   0 49
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

    public int a(View view, int i)
    {
        RecyclerView.LayoutManager layoutmanager = e();
        if (!layoutmanager.d())
        {
            return 0;
        } else
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            return a(layoutmanager.h(view) - layoutparams.topMargin, layoutmanager.j(view) + layoutparams.bottomMargin, layoutmanager.u(), layoutmanager.s() - layoutmanager.w(), i);
        }
    }

    public abstract PointF a(int i);

    protected void a()
    {
    }

    protected void a(int i, int j, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
    {
        if (j() == 0)
        {
            f();
        } else
        {
            e = a(e, i);
            f = a(f, j);
            if (e == 0 && f == 0)
            {
                a(action);
                return;
            }
        }
    }

    protected void a(RecyclerView.SmoothScroller.Action action)
    {
        PointF pointf = a(i());
        if (pointf == null || pointf.x == 0.0F && pointf.y == 0.0F)
        {
            Log.e("LinearSmoothScroller", "To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll");
            action.a(i());
            f();
            return;
        } else
        {
            a(pointf);
            d = pointf;
            e = (int)(pointf.x * 10000F);
            f = (int)(pointf.y * 10000F);
            int i = c(10000);
            action.a((int)((float)e * 1.2F), (int)((float)f * 1.2F), (int)((float)i * 1.2F), b);
            return;
        }
    }

    protected void a(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action)
    {
        int i = b(view, c());
        int j = a(view, d());
        int k = b((int)Math.sqrt(i * i + j * j));
        if (k > 0)
        {
            action.a(-i, -j, k, c);
        }
    }

    protected int b(int i)
    {
        return (int)Math.ceil((double)c(i) / 0.33560000000000001D);
    }

    public int b(View view, int i)
    {
        RecyclerView.LayoutManager layoutmanager = e();
        if (!layoutmanager.c())
        {
            return 0;
        } else
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            return a(layoutmanager.g(view) - layoutparams.leftMargin, layoutmanager.i(view) + layoutparams.rightMargin, layoutmanager.t(), layoutmanager.r() - layoutmanager.v(), i);
        }
    }

    protected void b()
    {
        f = 0;
        e = 0;
        d = null;
    }

    protected int c()
    {
        if (d == null || d.x == 0.0F)
        {
            return 0;
        }
        return d.x <= 0.0F ? -1 : 1;
    }

    protected int c(int i)
    {
        return (int)Math.ceil((float)Math.abs(i) * a);
    }

    protected int d()
    {
        if (d == null || d.y == 0.0F)
        {
            return 0;
        }
        return d.y <= 0.0F ? -1 : 1;
    }
}

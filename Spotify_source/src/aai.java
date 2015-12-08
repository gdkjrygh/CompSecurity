// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class aai extends abk
{

    private LinearInterpolator g;
    private DecelerateInterpolator h;
    private PointF i;
    private final float j;
    private int k;
    private int l;

    public aai(Context context)
    {
        g = new LinearInterpolator();
        h = new DecelerateInterpolator();
        k = 0;
        l = 0;
        j = a(context.getResources().getDisplayMetrics());
    }

    private static int a(int i1, int j1)
    {
        int k1 = i1 - j1;
        j1 = k1;
        if (i1 * k1 <= 0)
        {
            j1 = 0;
        }
        return j1;
    }

    private int c(int i1)
    {
        return (int)Math.ceil((float)Math.abs(i1) * j);
    }

    public float a(DisplayMetrics displaymetrics)
    {
        return 25F / (float)displaymetrics.densityDpi;
    }

    public int a(int i1, int j1, int k1, int l1, int i2)
    {
        i2;
        JVM INSTR tableswitch -1 1: default 28
    //                   -1 38
    //                   0 49
    //                   1 44;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
_L2:
        i1 = k1 - i1;
_L6:
        return i1;
_L4:
        return l1 - j1;
_L3:
        k1 -= i1;
        i1 = k1;
        if (k1 <= 0)
        {
            j1 = l1 - j1;
            i1 = j1;
            if (j1 >= 0)
            {
                return 0;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public abstract PointF a(int i1);

    protected final void a()
    {
        l = 0;
        k = 0;
        i = null;
    }

    protected final void a(int i1, int j1, abl abl1)
    {
        if (RecyclerView.f(super.b).p() == 0)
        {
            b();
        } else
        {
            k = a(k, i1);
            l = a(l, j1);
            if (k == 0 && l == 0)
            {
                PointF pointf = a(super.a);
                if (pointf == null || pointf.x == 0.0F && pointf.y == 0.0F)
                {
                    Log.e("LinearSmoothScroller", "To support smooth scrolling, you should override \nLayoutManager#computeScrollVectorForPosition.\nFalling back to instant scroll");
                    abl1.a = super.a;
                    b();
                    return;
                } else
                {
                    double d = Math.sqrt(pointf.x * pointf.x + pointf.y * pointf.y);
                    pointf.x = (float)((double)pointf.x / d);
                    pointf.y = (float)((double)pointf.y / d);
                    i = pointf;
                    k = (int)(pointf.x * 10000F);
                    l = (int)(pointf.y * 10000F);
                    i1 = c(10000);
                    abl1.a((int)((float)k * 1.2F), (int)((float)l * 1.2F), (int)((float)i1 * 1.2F), g);
                    return;
                }
            }
        }
    }

    protected final void a(View view, abl abl1)
    {
        int k1 = 0;
        abd abd1;
        int i1;
        int j1;
        if (i == null || i.x == 0.0F)
        {
            i1 = 0;
        } else
        if (i.x > 0.0F)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        abd1 = super.c;
        if (!abd1.f())
        {
            j1 = 0;
        } else
        {
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            j1 = a(abd.g(view) - layoutparams.leftMargin, abd.i(view) + layoutparams.rightMargin, abd1.s(), abd1.q() - abd1.u(), i1);
        }
        if (i == null || i.y == 0.0F)
        {
            i1 = 0;
        } else
        if (i.y > 0.0F)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        abd1 = super.c;
        if (!abd1.g())
        {
            i1 = k1;
        } else
        {
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams1 = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            i1 = a(abd.h(view) - layoutparams1.topMargin, abd.j(view) + layoutparams1.bottomMargin, abd1.t(), abd1.r() - abd1.v(), i1);
        }
        k1 = (int)Math.ceil((double)c((int)Math.sqrt(j1 * j1 + i1 * i1)) / 0.33560000000000001D);
        if (k1 > 0)
        {
            abl1.a(-j1, -i1, k1, h);
        }
    }
}

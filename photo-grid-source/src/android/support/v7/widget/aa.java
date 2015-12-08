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

// Referenced classes of package android.support.v7.widget:
//            bd, be, au

public abstract class aa extends bd
{

    private final float a;
    protected final LinearInterpolator b = new LinearInterpolator();
    protected final DecelerateInterpolator c = new DecelerateInterpolator();
    protected PointF d;
    protected int e;
    protected int f;

    public aa(Context context)
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

    private int d(int i)
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

    protected final void a(int i, int j, be be1)
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
                    i = f();
                    c();
                    c(i);
                    return;
                } else
                {
                    double d1 = Math.sqrt(pointf.x * pointf.x + pointf.y * pointf.y);
                    pointf.x = (float)((double)pointf.x / d1);
                    pointf.y = (float)((double)pointf.y / d1);
                    d = pointf;
                    e = (int)(pointf.x * 10000F);
                    f = (int)(pointf.y * 10000F);
                    i = d(10000);
                    be1.a((int)((float)e * 1.2F), (int)((float)f * 1.2F), (int)((float)i * 1.2F), b);
                    return;
                }
            }
        }
    }

    protected final void a(View view, be be1)
    {
        boolean flag = true;
        int k = 0;
        au au1;
        int i;
        int j;
        if (d == null || d.x == 0.0F)
        {
            i = 0;
        } else
        if (d.x > 0.0F)
        {
            i = 1;
        } else
        {
            i = -1;
        }
        au1 = b();
        if (!au1.g())
        {
            j = 0;
        } else
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            j = au.h(view);
            int j1 = layoutparams.leftMargin;
            int l1 = au.j(view);
            j = a(j - j1, layoutparams.rightMargin + l1, au1.u(), au1.s() - au1.w(), i);
        }
        if (d == null || d.y == 0.0F)
        {
            i = 0;
        } else
        {
            i = ((flag) ? 1 : 0);
            if (d.y <= 0.0F)
            {
                i = -1;
            }
        }
        au1 = b();
        if (!au1.h())
        {
            i = k;
        } else
        {
            RecyclerView.LayoutParams layoutparams1 = (RecyclerView.LayoutParams)view.getLayoutParams();
            int l = au.i(view);
            int i1 = layoutparams1.topMargin;
            int k1 = au.k(view);
            i = a(l - i1, layoutparams1.bottomMargin + k1, au1.v(), au1.t() - au1.x(), i);
        }
        k = (int)Math.ceil((double)d((int)Math.sqrt(j * j + i * i)) / 0.33560000000000001D);
        if (k > 0)
        {
            be1.a(-j, -i, k, c);
        }
    }
}

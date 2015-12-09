// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompat

static class 
    implements 
{

    public final void abortAnimation(Object obj)
    {
        ((OverScroller)obj).abortAnimation();
    }

    public final boolean computeScrollOffset(Object obj)
    {
        return ((OverScroller)obj).computeScrollOffset();
    }

    public final Object createScroller(Context context, Interpolator interpolator)
    {
        if (interpolator != null)
        {
            return new OverScroller(context, interpolator);
        } else
        {
            return new OverScroller(context);
        }
    }

    public final void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        ((OverScroller)obj).fling(0, 0, k, l, i1, j1, 0x80000000, 0x7fffffff);
    }

    public final void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2)
    {
        ((OverScroller)obj).fling(i, j, 0, l, 0, 0, 0, l1, 0, j2);
    }

    public float getCurrVelocity(Object obj)
    {
        return 0.0F;
    }

    public final int getCurrX(Object obj)
    {
        return ((OverScroller)obj).getCurrX();
    }

    public final int getCurrY(Object obj)
    {
        return ((OverScroller)obj).getCurrY();
    }

    public final int getFinalX(Object obj)
    {
        return ((OverScroller)obj).getFinalX();
    }

    public final int getFinalY(Object obj)
    {
        return ((OverScroller)obj).getFinalY();
    }

    public final boolean isFinished(Object obj)
    {
        return ((OverScroller)obj).isFinished();
    }

    public final void startScroll(Object obj, int i, int j, int k, int l)
    {
        ((OverScroller)obj).startScroll(i, j, 0, l);
    }

    public final void startScroll(Object obj, int i, int j, int k, int l, int i1)
    {
        ((OverScroller)obj).startScroll(i, j, k, l, i1);
    }

    ()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompat

static class 
    implements 
{

    public void abortAnimation(Object obj)
    {
        ((Scroller)obj).abortAnimation();
    }

    public boolean computeScrollOffset(Object obj)
    {
        return ((Scroller)obj).computeScrollOffset();
    }

    public Object createScroller(Context context, Interpolator interpolator)
    {
        if (interpolator != null)
        {
            return new Scroller(context, interpolator);
        } else
        {
            return new Scroller(context);
        }
    }

    public void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        ((Scroller)obj).fling(i, j, k, l, i1, j1, k1, l1);
    }

    public void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2)
    {
        ((Scroller)obj).fling(i, j, k, l, i1, j1, k1, l1);
    }

    public float getCurrVelocity(Object obj)
    {
        return 0.0F;
    }

    public int getCurrX(Object obj)
    {
        return ((Scroller)obj).getCurrX();
    }

    public int getCurrY(Object obj)
    {
        return ((Scroller)obj).getCurrY();
    }

    public int getFinalX(Object obj)
    {
        return ((Scroller)obj).getFinalX();
    }

    public int getFinalY(Object obj)
    {
        return ((Scroller)obj).getFinalY();
    }

    public boolean isFinished(Object obj)
    {
        return ((Scroller)obj).isFinished();
    }

    public boolean isOverScrolled(Object obj)
    {
        return false;
    }

    public void notifyHorizontalEdgeReached(Object obj, int i, int j, int k)
    {
    }

    public void notifyVerticalEdgeReached(Object obj, int i, int j, int k)
    {
    }

    public void startScroll(Object obj, int i, int j, int k, int l)
    {
        ((Scroller)obj).startScroll(i, j, k, l);
    }

    public void startScroll(Object obj, int i, int j, int k, int l, int i1)
    {
        ((Scroller)obj).startScroll(i, j, k, l, i1);
    }

    ()
    {
    }
}

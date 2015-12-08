// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompat, ScrollerCompatGingerbread

static class 
    implements 
{

    public void abortAnimation(Object obj)
    {
        ScrollerCompatGingerbread.abortAnimation(obj);
    }

    public boolean computeScrollOffset(Object obj)
    {
        return ScrollerCompatGingerbread.computeScrollOffset(obj);
    }

    public Object createScroller(Context context, Interpolator interpolator)
    {
        return ScrollerCompatGingerbread.createScroller(context, interpolator);
    }

    public void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        ScrollerCompatGingerbread.fling(obj, i, j, k, l, i1, j1, k1, l1);
    }

    public void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1, int i2, int j2)
    {
        ScrollerCompatGingerbread.fling(obj, i, j, k, l, i1, j1, k1, l1, i2, j2);
    }

    public float getCurrVelocity(Object obj)
    {
        return 0.0F;
    }

    public int getCurrX(Object obj)
    {
        return ScrollerCompatGingerbread.getCurrX(obj);
    }

    public int getCurrY(Object obj)
    {
        return ScrollerCompatGingerbread.getCurrY(obj);
    }

    public int getFinalX(Object obj)
    {
        return ScrollerCompatGingerbread.getFinalX(obj);
    }

    public int getFinalY(Object obj)
    {
        return ScrollerCompatGingerbread.getFinalY(obj);
    }

    public boolean isFinished(Object obj)
    {
        return ScrollerCompatGingerbread.isFinished(obj);
    }

    public boolean isOverScrolled(Object obj)
    {
        return ScrollerCompatGingerbread.isOverScrolled(obj);
    }

    public void notifyHorizontalEdgeReached(Object obj, int i, int j, int k)
    {
        ScrollerCompatGingerbread.notifyHorizontalEdgeReached(obj, i, j, k);
    }

    public void notifyVerticalEdgeReached(Object obj, int i, int j, int k)
    {
        ScrollerCompatGingerbread.notifyVerticalEdgeReached(obj, i, j, k);
    }

    public void startScroll(Object obj, int i, int j, int k, int l)
    {
        ScrollerCompatGingerbread.startScroll(obj, i, j, k, l);
    }

    public void startScroll(Object obj, int i, int j, int k, int l, int i1)
    {
        ScrollerCompatGingerbread.startScroll(obj, i, j, k, l, i1);
    }

    ()
    {
    }
}

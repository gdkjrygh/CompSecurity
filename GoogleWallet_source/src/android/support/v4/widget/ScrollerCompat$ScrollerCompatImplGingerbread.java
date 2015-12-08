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

    public final void abortAnimation(Object obj)
    {
        ScrollerCompatGingerbread.abortAnimation(obj);
    }

    public final boolean computeScrollOffset(Object obj)
    {
        return ScrollerCompatGingerbread.computeScrollOffset(obj);
    }

    public final Object createScroller(Context context, Interpolator interpolator)
    {
        return ScrollerCompatGingerbread.createScroller(context, interpolator);
    }

    public final void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        ScrollerCompatGingerbread.fling(obj, i, j, k, l, i1, j1, k1, l1);
    }

    public final int getCurrX(Object obj)
    {
        return ScrollerCompatGingerbread.getCurrX(obj);
    }

    public final int getCurrY(Object obj)
    {
        return ScrollerCompatGingerbread.getCurrY(obj);
    }

    public final int getFinalX(Object obj)
    {
        return ScrollerCompatGingerbread.getFinalX(obj);
    }

    public final int getFinalY(Object obj)
    {
        return ScrollerCompatGingerbread.getFinalY(obj);
    }

    public final void startScroll(Object obj, int i, int j, int k, int l, int i1)
    {
        ScrollerCompatGingerbread.startScroll(obj, i, j, k, l, i1);
    }

    ()
    {
    }
}

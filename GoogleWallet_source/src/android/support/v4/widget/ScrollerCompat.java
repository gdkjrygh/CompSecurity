// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompatGingerbread

public final class ScrollerCompat
{
    static interface ScrollerCompatImpl
    {

        public abstract void abortAnimation(Object obj);

        public abstract boolean computeScrollOffset(Object obj);

        public abstract Object createScroller(Context context, Interpolator interpolator);

        public abstract void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1);

        public abstract int getCurrX(Object obj);

        public abstract int getCurrY(Object obj);

        public abstract int getFinalX(Object obj);

        public abstract int getFinalY(Object obj);

        public abstract void startScroll(Object obj, int i, int j, int k, int l, int i1);
    }

    static final class ScrollerCompatImplBase
        implements ScrollerCompatImpl
    {

        public final void abortAnimation(Object obj)
        {
            ((Scroller)obj).abortAnimation();
        }

        public final boolean computeScrollOffset(Object obj)
        {
            return ((Scroller)obj).computeScrollOffset();
        }

        public final Object createScroller(Context context, Interpolator interpolator)
        {
            if (interpolator != null)
            {
                return new Scroller(context, interpolator);
            } else
            {
                return new Scroller(context);
            }
        }

        public final void fling(Object obj, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            ((Scroller)obj).fling(i, j, k, l, i1, j1, k1, l1);
        }

        public final int getCurrX(Object obj)
        {
            return ((Scroller)obj).getCurrX();
        }

        public final int getCurrY(Object obj)
        {
            return ((Scroller)obj).getCurrY();
        }

        public final int getFinalX(Object obj)
        {
            return ((Scroller)obj).getFinalX();
        }

        public final int getFinalY(Object obj)
        {
            return ((Scroller)obj).getFinalY();
        }

        public final void startScroll(Object obj, int i, int j, int k, int l, int i1)
        {
            ((Scroller)obj).startScroll(i, j, k, l, i1);
        }

        ScrollerCompatImplBase()
        {
        }
    }

    static class ScrollerCompatImplGingerbread
        implements ScrollerCompatImpl
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

        ScrollerCompatImplGingerbread()
        {
        }
    }

    static final class ScrollerCompatImplIcs extends ScrollerCompatImplGingerbread
    {

        ScrollerCompatImplIcs()
        {
        }
    }


    ScrollerCompatImpl mImpl;
    Object mScroller;

    private ScrollerCompat(int i, Context context, Interpolator interpolator)
    {
        if (i >= 14)
        {
            mImpl = new ScrollerCompatImplIcs();
        } else
        if (i >= 9)
        {
            mImpl = new ScrollerCompatImplGingerbread();
        } else
        {
            mImpl = new ScrollerCompatImplBase();
        }
        mScroller = mImpl.createScroller(context, interpolator);
    }

    private ScrollerCompat(Context context, Interpolator interpolator)
    {
        this(android.os.Build.VERSION.SDK_INT, context, interpolator);
    }

    public static ScrollerCompat create(Context context)
    {
        return create(context, null);
    }

    public static ScrollerCompat create(Context context, Interpolator interpolator)
    {
        return new ScrollerCompat(context, interpolator);
    }

    public final void abortAnimation()
    {
        mImpl.abortAnimation(mScroller);
    }

    public final boolean computeScrollOffset()
    {
        return mImpl.computeScrollOffset(mScroller);
    }

    public final void fling(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        mImpl.fling(mScroller, i, j, k, l, i1, j1, k1, l1);
    }

    public final int getCurrX()
    {
        return mImpl.getCurrX(mScroller);
    }

    public final int getCurrY()
    {
        return mImpl.getCurrY(mScroller);
    }

    public final int getFinalX()
    {
        return mImpl.getFinalX(mScroller);
    }

    public final int getFinalY()
    {
        return mImpl.getFinalY(mScroller);
    }

    public final void startScroll(int i, int j, int k, int l, int i1)
    {
        mImpl.startScroll(mScroller, i, j, k, l, i1);
    }
}

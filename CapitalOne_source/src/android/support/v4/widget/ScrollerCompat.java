// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.widget.Scroller;

// Referenced classes of package android.support.v4.widget:
//            ScrollerCompatIcs

class ScrollerCompat
{
    static class ScrollerCompatImplIcs extends ScrollerCompat
    {

        public float getCurrVelocity()
        {
            return ScrollerCompatIcs.getCurrVelocity(mScroller);
        }

        public ScrollerCompatImplIcs(Context context)
        {
            super(context);
        }
    }


    Scroller mScroller;

    ScrollerCompat(Context context)
    {
        mScroller = new Scroller(context);
    }

    public static ScrollerCompat from(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return new ScrollerCompatImplIcs(context);
        } else
        {
            return new ScrollerCompat(context);
        }
    }

    public void abortAnimation()
    {
        mScroller.abortAnimation();
    }

    public boolean computeScrollOffset()
    {
        return mScroller.computeScrollOffset();
    }

    public void fling(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        mScroller.fling(i, j, k, l, i1, j1, k1, l1);
    }

    public float getCurrVelocity()
    {
        return 0.0F;
    }

    public int getCurrX()
    {
        return mScroller.getCurrX();
    }

    public int getCurrY()
    {
        return mScroller.getCurrY();
    }

    public int getDuration()
    {
        return mScroller.getDuration();
    }

    public boolean isFinished()
    {
        return mScroller.isFinished();
    }

    public void startScroll(int i, int j, int k, int l)
    {
        mScroller.startScroll(i, j, k, l);
    }

    public void startScroll(int i, int j, int k, int l, int i1)
    {
        mScroller.startScroll(i, j, k, l, i1);
    }
}

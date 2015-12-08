// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class ContentLoadingOverlay extends FrameLayout
{

    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private boolean mPostedHide;
    private boolean mPostedShow;
    private long mStartTime;

    public ContentLoadingOverlay(Context context)
    {
        this(context, null);
    }

    public ContentLoadingOverlay(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ContentLoadingOverlay(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mStartTime = -1L;
        mPostedHide = false;
        mPostedShow = false;
        mDismissed = false;
        mDelayedHide = new Runnable() {

            final ContentLoadingOverlay this$0;

            public void run()
            {
                mPostedHide = false;
                mStartTime = -1L;
                setVisibility(8);
            }

            
            {
                this$0 = ContentLoadingOverlay.this;
                super();
            }
        };
        mDelayedShow = new Runnable() {

            final ContentLoadingOverlay this$0;

            public void run()
            {
                mPostedShow = false;
                if (!mDismissed)
                {
                    mStartTime = System.currentTimeMillis();
                    setVisibility(0);
                }
            }

            
            {
                this$0 = ContentLoadingOverlay.this;
                super();
            }
        };
    }

    private void removeCallbacks()
    {
        removeCallbacks(mDelayedHide);
        removeCallbacks(mDelayedShow);
    }

    public void hide()
    {
        mDismissed = true;
        removeCallbacks(mDelayedShow);
        long l = System.currentTimeMillis() - mStartTime;
        if (l >= 500L || mStartTime == -1L)
        {
            setVisibility(8);
        } else
        if (!mPostedHide)
        {
            postDelayed(mDelayedHide, 500L - l);
            mPostedHide = true;
            return;
        }
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public void show()
    {
        mStartTime = -1L;
        mDismissed = false;
        removeCallbacks(mDelayedHide);
        if (!mPostedShow)
        {
            postDelayed(mDelayedShow, 500L);
            mPostedShow = true;
        }
    }


/*
    static boolean access$002(ContentLoadingOverlay contentloadingoverlay, boolean flag)
    {
        contentloadingoverlay.mPostedHide = flag;
        return flag;
    }

*/


/*
    static long access$102(ContentLoadingOverlay contentloadingoverlay, long l)
    {
        contentloadingoverlay.mStartTime = l;
        return l;
    }

*/


/*
    static boolean access$202(ContentLoadingOverlay contentloadingoverlay, boolean flag)
    {
        contentloadingoverlay.mPostedShow = flag;
        return flag;
    }

*/

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nirhart.parallaxscroll.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.nirhart.parallaxscroll.views:
//            ParallaxedView

public class ParallaxScrollView extends ScrollView
{
    public static interface OnScrollListener
    {

        public abstract void onScrollReachedEnd(boolean flag);
    }

    protected class ScrollViewParallaxedItem extends ParallaxedView
    {

        final ParallaxScrollView this$0;

        protected void translatePreICS(View view, float f)
        {
            view.offsetTopAndBottom((int)f - lastOffset);
            lastOffset = (int)f;
        }

        public ScrollViewParallaxedItem(View view)
        {
            this$0 = ParallaxScrollView.this;
            super(view);
        }
    }


    private static final float DEFAULT_ALPHA_FACTOR = -1F;
    private static final float DEFAULT_INNER_PARALLAX_FACTOR = 1.9F;
    private static final float DEFAULT_PARALLAX_FACTOR = 1.9F;
    private static final int DEFAULT_PARALLAX_VIEWS = 1;
    private final String TAG;
    private boolean allowSwiping;
    private float alphaFactor;
    private float innerParallaxFactor;
    private OnScrollListener mOnScrollListener;
    private int numOfParallaxViews;
    private float parallaxFactor;
    private ArrayList parallaxedViews;
    private boolean reachedEnd;

    public ParallaxScrollView(Context context)
    {
        super(context);
        TAG = getClass().getSimpleName();
        numOfParallaxViews = 1;
        innerParallaxFactor = 1.9F;
        parallaxFactor = 1.9F;
        alphaFactor = -1F;
        reachedEnd = false;
        parallaxedViews = new ArrayList();
        allowSwiping = true;
    }

    public ParallaxScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        TAG = getClass().getSimpleName();
        numOfParallaxViews = 1;
        innerParallaxFactor = 1.9F;
        parallaxFactor = 1.9F;
        alphaFactor = -1F;
        reachedEnd = false;
        parallaxedViews = new ArrayList();
        allowSwiping = true;
        init(context, attributeset);
    }

    public ParallaxScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TAG = getClass().getSimpleName();
        numOfParallaxViews = 1;
        innerParallaxFactor = 1.9F;
        parallaxFactor = 1.9F;
        alphaFactor = -1F;
        reachedEnd = false;
        parallaxedViews = new ArrayList();
        allowSwiping = true;
        init(context, attributeset);
    }

    private void makeViewsParallax()
    {
        if (getChildCount() > 0 && (getChildAt(0) instanceof ViewGroup))
        {
            ViewGroup viewgroup = (ViewGroup)getChildAt(0);
            int j = Math.min(numOfParallaxViews, viewgroup.getChildCount());
            for (int i = 0; i < j; i++)
            {
                ScrollViewParallaxedItem scrollviewparallaxeditem = new ScrollViewParallaxedItem(viewgroup.getChildAt(i));
                parallaxedViews.add(scrollviewparallaxeditem);
            }

        }
    }

    public void allowSwiping(boolean flag)
    {
        allowSwiping = flag;
    }

    protected void init(Context context, AttributeSet attributeset)
    {
        context = context.obtainStyledAttributes(attributeset, com.aetn.history.android.historyhere.R.styleable.ParallaxScroll);
        parallaxFactor = context.getFloat(0, 1.9F);
        alphaFactor = context.getFloat(1, -1F);
        innerParallaxFactor = context.getFloat(2, 1.9F);
        numOfParallaxViews = context.getInt(3, 1);
        context.recycle();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        makeViewsParallax();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        Utils.logger("swiper", (new StringBuilder()).append("onInterceptTouchEvent:allowSwiping:").append(allowSwiping).toString());
        if (allowSwiping)
        {
            return super.onInterceptTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        float f1 = parallaxFactor;
        float f = alphaFactor;
        Object obj = parallaxedViews.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ParallaxedView parallaxedview = (ParallaxedView)((Iterator) (obj)).next();
            parallaxedview.setOffset((float)j / f1);
            float f2 = f1 * innerParallaxFactor;
            f1 = f;
            if (f != -1F)
            {
                if (j <= 0)
                {
                    f1 = 1.0F;
                } else
                {
                    f1 = 100F / ((float)j * f);
                }
                parallaxedview.setAlpha(f1);
                f1 = f / alphaFactor;
            }
            parallaxedview.animateNow();
            f = f1;
            f1 = f2;
        }
        obj = getChildAt(getChildCount() - 1);
        i = ((View) (obj)).getBottom() - (getHeight() + getScrollY() + ((View) (obj)).getTop());
        if (!reachedEnd)
        {
            if (i == 0)
            {
                Log.d(TAG, "MyScrollView: Bottom has been reached");
                if (mOnScrollListener != null)
                {
                    mOnScrollListener.onScrollReachedEnd(true);
                    reachedEnd = true;
                }
            }
        } else
        if (i > 0)
        {
            Log.d(TAG, "MyScrollView: no longer at bottom");
            if (mOnScrollListener != null)
            {
                mOnScrollListener.onScrollReachedEnd(false);
                reachedEnd = false;
                return;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Utils.logger("swiper", (new StringBuilder()).append("onTouchEvent:allowSwiping:").append(allowSwiping).toString());
        if (allowSwiping)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return false;
        }
    }

    public void setOnScrollListener(OnScrollListener onscrolllistener)
    {
        mOnScrollListener = onscrolllistener;
    }
}

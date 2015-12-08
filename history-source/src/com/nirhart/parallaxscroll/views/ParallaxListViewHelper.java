// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nirhart.parallaxscroll.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.AbsListView;
import android.widget.ListView;

// Referenced classes of package com.nirhart.parallaxscroll.views:
//            ParallaxedView

public class ParallaxListViewHelper
    implements android.widget.AbsListView.OnScrollListener
{
    protected class ListViewParallaxedItem extends ParallaxedView
    {

        final ParallaxListViewHelper this$0;

        protected void translatePreICS(View view, float f)
        {
            addAnimation(new TranslateAnimation(0.0F, 0.0F, f, f));
        }

        public ListViewParallaxedItem(View view)
        {
            this$0 = ParallaxListViewHelper.this;
            super(view);
        }
    }


    private static final float DEFAULT_ALPHA_FACTOR = -1F;
    private static final boolean DEFAULT_IS_CIRCULAR = false;
    private static final float DEFAULT_PARALLAX_FACTOR = 1.9F;
    private float alphaFactor;
    private boolean isCircular;
    private ListView listView;
    private android.widget.AbsListView.OnScrollListener listener;
    private float parallaxFactor;
    private ParallaxedView parallaxedView;

    protected ParallaxListViewHelper(Context context, AttributeSet attributeset, ListView listview)
    {
        parallaxFactor = 1.9F;
        alphaFactor = -1F;
        listener = null;
        init(context, attributeset, listview);
    }

    private void circularParallax()
    {
        if (listView.getChildCount() > 0)
        {
            int i = -listView.getChildAt(0).getTop();
            if (i >= 0)
            {
                fillParallaxedViews();
                setFilters(i);
            }
        }
    }

    private void fillParallaxedViews()
    {
label0:
        {
            if (parallaxedView == null || !parallaxedView.is(listView.getChildAt(0)))
            {
                if (parallaxedView == null)
                {
                    break label0;
                }
                resetFilters();
                parallaxedView.setView(listView.getChildAt(0));
            }
            return;
        }
        parallaxedView = new ListViewParallaxedItem(listView.getChildAt(0));
    }

    private void headerParallax()
    {
        if (parallaxedView != null && listView.getChildCount() > 0)
        {
            int i = -listView.getChildAt(0).getTop();
            if (i >= 0)
            {
                setFilters(i);
            }
        }
    }

    private void resetFilters()
    {
        parallaxedView.setOffset(0.0F);
        if (alphaFactor != -1F)
        {
            parallaxedView.setAlpha(1.0F);
        }
        parallaxedView.animateNow();
    }

    private void setFilters(int i)
    {
        parallaxedView.setOffset((float)i / parallaxFactor);
        if (alphaFactor != -1F)
        {
            float f;
            if (i <= 0)
            {
                f = 1.0F;
            } else
            {
                f = 100F / ((float)i * alphaFactor);
            }
            parallaxedView.setAlpha(f);
        }
        parallaxedView.animateNow();
    }

    protected void addParallaxedHeaderView(View view)
    {
        addParallaxedView(view);
    }

    protected void addParallaxedHeaderView(View view, Object obj, boolean flag)
    {
        addParallaxedView(view);
    }

    protected void addParallaxedView(View view)
    {
        parallaxedView = new ListViewParallaxedItem(view);
    }

    protected void init(Context context, AttributeSet attributeset, ListView listview)
    {
        listView = listview;
        context = context.obtainStyledAttributes(attributeset, com.aetn.history.android.historyhere.R.styleable.ParallaxScroll);
        parallaxFactor = context.getFloat(0, 1.9F);
        alphaFactor = context.getFloat(1, -1F);
        isCircular = context.getBoolean(4, false);
        context.recycle();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        parallaxScroll();
        if (listener != null)
        {
            listener.onScroll(abslistview, i, j, k);
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (listener != null)
        {
            listener.onScrollStateChanged(abslistview, i);
        }
    }

    protected void parallaxScroll()
    {
        if (isCircular)
        {
            circularParallax();
            return;
        } else
        {
            headerParallax();
            return;
        }
    }

    protected void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        listener = onscrolllistener;
    }
}

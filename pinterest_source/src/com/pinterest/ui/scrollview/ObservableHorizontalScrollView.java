// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class ObservableHorizontalScrollView extends HorizontalScrollView
{

    protected ScrollViewListener _scrollviewListener;
    public int scrollOldX;
    public int scrollOldY;
    public int scrollX;
    public int scrollY;

    public ObservableHorizontalScrollView(Context context)
    {
        this(context, null);
    }

    public ObservableHorizontalScrollView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ObservableHorizontalScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _scrollviewListener = null;
        scrollX = 0;
        scrollY = 0;
        scrollOldX = 0;
        scrollOldY = 0;
        setOverScrollMode(2);
    }

    public int getScrolledX()
    {
        return scrollX;
    }

    public int getScrolledY()
    {
        return scrollY;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (_scrollviewListener != null)
        {
            _scrollviewListener.onLayout();
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (_scrollviewListener != null)
        {
            _scrollviewListener.onMeasure();
        }
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        scrollX = i;
        scrollY = j;
        scrollOldX = k;
        scrollOldY = l;
        if (_scrollviewListener != null)
        {
            _scrollviewListener.onScrollChanged(this, i, j, k, l);
        }
        super.onScrollChanged(i, j, k, l);
    }

    public void setScrollviewListener(ScrollViewListener scrollviewlistener)
    {
        _scrollviewListener = scrollviewlistener;
    }

    private class ScrollViewListener
    {

        public void onLayout()
        {
        }

        public void onMeasure()
        {
        }

        public abstract void onScrollChanged(ObservableHorizontalScrollView observablehorizontalscrollview, int i, int j, int k, int l);

        public ScrollViewListener()
        {
        }
    }

}

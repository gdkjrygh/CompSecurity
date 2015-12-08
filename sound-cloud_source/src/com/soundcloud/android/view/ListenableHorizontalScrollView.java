// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class ListenableHorizontalScrollView extends HorizontalScrollView
{
    public static interface OnScrollListener
    {

        public abstract void onScroll(int i, int j);
    }


    private int areaWidth;
    private OnScrollListener listener;

    public ListenableHorizontalScrollView(Context context)
    {
        super(context);
        areaWidth = -1;
    }

    public ListenableHorizontalScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        areaWidth = -1;
    }

    public ListenableHorizontalScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        areaWidth = -1;
    }

    public void fling(int i)
    {
        if (areaWidth != -1)
        {
            i = (int)((float)i / ((float)areaWidth / (float)getWidth()));
        }
        super.fling(i);
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (listener != null)
        {
            listener.onScroll(i, k);
        }
    }

    public void setAreaWidth(int i)
    {
        areaWidth = i;
    }

    public void setOnScrollListener(OnScrollListener onscrolllistener)
    {
        listener = onscrolllistener;
    }
}

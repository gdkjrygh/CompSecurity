// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class ListenableHorizontalScrollView extends HorizontalScrollView
{
    public static interface OnScrollChangedListener
    {

        public abstract void onScrollChanged(int i, int j, int k, int l);
    }


    private OnScrollChangedListener onScrollChangedListener;

    public ListenableHorizontalScrollView(Context context)
    {
        super(context);
    }

    public ListenableHorizontalScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ListenableHorizontalScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (onScrollChangedListener != null)
        {
            onScrollChangedListener.onScrollChanged(i, j, k, l);
        }
    }

    public void setOnScrollChangedListener(OnScrollChangedListener onscrollchangedlistener)
    {
        onScrollChangedListener = onscrollchangedlistener;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ListenableScrollView extends ScrollView
{
    public static interface OnScrollListener
    {

        public abstract void onScroll(int i, int j);
    }


    private OnScrollListener listener;

    public ListenableScrollView(Context context)
    {
        super(context);
    }

    public ListenableScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ListenableScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (listener != null)
        {
            listener.onScroll(j, l);
        }
    }

    public void setOnScrollListener(OnScrollListener onscrolllistener)
    {
        listener = onscrolllistener;
    }
}

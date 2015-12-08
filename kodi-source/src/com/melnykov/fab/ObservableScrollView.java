// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.melnykov.fab;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ObservableScrollView extends ScrollView
{
    public static interface OnScrollChangedListener
    {

        public abstract void onScrollChanged(ScrollView scrollview, int i, int j, int k, int l);
    }


    private OnScrollChangedListener mOnScrollChangedListener;

    public ObservableScrollView(Context context)
    {
        super(context);
    }

    public ObservableScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ObservableScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (mOnScrollChangedListener != null)
        {
            mOnScrollChangedListener.onScrollChanged(this, i, j, k, l);
        }
    }

    public void setOnScrollChangedListener(OnScrollChangedListener onscrollchangedlistener)
    {
        mOnScrollChangedListener = onscrollchangedlistener;
    }
}

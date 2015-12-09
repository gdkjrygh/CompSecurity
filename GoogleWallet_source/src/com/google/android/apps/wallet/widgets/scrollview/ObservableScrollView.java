// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ObservableScrollView extends ScrollView
{
    public static interface ScrollListener
    {

        public abstract void onScrollChanged(int i, int j);
    }


    private ScrollListener scrollListener;

    public ObservableScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (scrollListener != null)
        {
            scrollListener.onScrollChanged(j, l);
        }
    }

    public void setScrollListener(ScrollListener scrolllistener)
    {
        scrollListener = scrolllistener;
    }
}

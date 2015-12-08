// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.melnykov.fab;

import android.widget.ScrollView;

// Referenced classes of package com.melnykov.fab:
//            ScrollViewScrollDetector, FloatingActionButton, ScrollDirectionListener

private class <init> extends ScrollViewScrollDetector
{

    private mOnScrollChangedListener mOnScrollChangedListener;
    private ScrollDirectionListener mScrollDirectionListener;
    final FloatingActionButton this$0;

    private void setScrollDirectionListener(ScrollDirectionListener scrolldirectionlistener)
    {
        mScrollDirectionListener = scrolldirectionlistener;
    }

    public void onScrollChanged(ScrollView scrollview, int i, int j, int k, int l)
    {
        if (mOnScrollChangedListener != null)
        {
            mOnScrollChangedListener.ollChanged(scrollview, i, j, k, l);
        }
        super.onScrollChanged(scrollview, i, j, k, l);
    }

    public void onScrollDown()
    {
        show();
        if (mScrollDirectionListener != null)
        {
            mScrollDirectionListener.onScrollDown();
        }
    }

    public void onScrollUp()
    {
        hide();
        if (mScrollDirectionListener != null)
        {
            mScrollDirectionListener.onScrollUp();
        }
    }

    public void setOnScrollChangedListener(mScrollDirectionListener mscrolldirectionlistener)
    {
        mOnScrollChangedListener = mscrolldirectionlistener;
    }


    private ()
    {
        this$0 = FloatingActionButton.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

// Referenced classes of package com.tinder.views:
//            CustomViewPager

private class mDuration extends Scroller
{

    private int mDuration;
    final CustomViewPager this$0;

    public void setScrollDuration(int i)
    {
        mDuration = i;
    }

    public void startScroll(int i, int j, int k, int l)
    {
        super.startScroll(i, j, k, l, mDuration);
    }

    public void startScroll(int i, int j, int k, int l, int i1)
    {
        super.startScroll(i, j, k, l, mDuration);
    }

    public _cls9(Context context)
    {
        this$0 = CustomViewPager.this;
        super(context);
        mDuration = 350;
    }

    public mDuration(Context context, Interpolator interpolator)
    {
        this$0 = CustomViewPager.this;
        super(context, interpolator);
        mDuration = 350;
    }

    public mDuration(Context context, Interpolator interpolator, boolean flag)
    {
        this$0 = CustomViewPager.this;
        super(context, interpolator, flag);
        mDuration = 350;
    }
}

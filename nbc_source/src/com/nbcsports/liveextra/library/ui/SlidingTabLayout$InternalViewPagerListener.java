// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.ui;

import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.library.ui:
//            SlidingTabLayout, SlidingTabStrip

private class <init>
    implements android.support.v4.view.erListener
{

    private int mScrollState;
    final SlidingTabLayout this$0;

    public void onPageScrollStateChanged(int i)
    {
        mScrollState = i;
        if (SlidingTabLayout.access$400(SlidingTabLayout.this) != null)
        {
            SlidingTabLayout.access$400(SlidingTabLayout.this).StateChanged(i);
        }
    }

    public void onPageScrolled(int i, float f, int j)
    {
        int k = SlidingTabLayout.access$200(SlidingTabLayout.this).getChildCount();
        if (k != 0 && i >= 0 && i < k)
        {
            SlidingTabLayout.access$200(SlidingTabLayout.this).onViewPagerPageChanged(i, f);
            View view = SlidingTabLayout.access$200(SlidingTabLayout.this).getChildAt(i);
            int l;
            if (view != null)
            {
                l = (int)((float)view.getWidth() * f);
            } else
            {
                l = 0;
            }
            SlidingTabLayout.access$300(SlidingTabLayout.this, i, l);
            if (SlidingTabLayout.access$400(SlidingTabLayout.this) != null)
            {
                SlidingTabLayout.access$400(SlidingTabLayout.this).ed(i, f, j);
                return;
            }
        }
    }

    public void onPageSelected(int i)
    {
        if (mScrollState == 0)
        {
            SlidingTabLayout.access$200(SlidingTabLayout.this).onViewPagerPageChanged(i, 0.0F);
            SlidingTabLayout.access$300(SlidingTabLayout.this, i, 0);
        }
        int j = 0;
        while (j < SlidingTabLayout.access$200(SlidingTabLayout.this).getChildCount()) 
        {
            View view = SlidingTabLayout.access$200(SlidingTabLayout.this).getChildAt(j);
            boolean flag;
            if (i == j)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setSelected(flag);
            j++;
        }
        if (SlidingTabLayout.access$400(SlidingTabLayout.this) != null)
        {
            SlidingTabLayout.access$400(SlidingTabLayout.this).ed(i);
        }
    }

    private ()
    {
        this$0 = SlidingTabLayout.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

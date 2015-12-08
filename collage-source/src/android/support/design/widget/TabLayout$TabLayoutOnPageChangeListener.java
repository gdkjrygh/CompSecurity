// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//            TabLayout

public static class mTabLayoutRef
    implements android.support.v4.view.tener
{

    private int mPreviousScrollState;
    private int mScrollState;
    private final WeakReference mTabLayoutRef;

    public void onPageScrollStateChanged(int i)
    {
        mPreviousScrollState = mScrollState;
        mScrollState = i;
    }

    public void onPageScrolled(int i, float f, int j)
    {
        boolean flag1 = true;
        TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
        if (tablayout != null)
        {
            boolean flag = flag1;
            if (mScrollState != 1)
            {
                if (mScrollState == 2 && mPreviousScrollState == 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            tablayout.setScrollPosition(i, f, flag);
        }
    }

    public void onPageSelected(int i)
    {
        TabLayout tablayout = (TabLayout)mTabLayoutRef.get();
        if (tablayout != null && tablayout.getSelectedTabPosition() != i)
        {
            mPreviousScrollState mpreviousscrollstate = tablayout.getTabAt(i);
            boolean flag;
            if (mScrollState == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            tablayout.selectTab(mpreviousscrollstate, flag);
        }
    }

    public (TabLayout tablayout)
    {
        mTabLayoutRef = new WeakReference(tablayout);
    }
}

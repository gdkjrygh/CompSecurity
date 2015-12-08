// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package me.lyft.android.ui.driver:
//            ViewPagerTabLayout

class this._cls0
    implements android.support.v4.view.eListener
{

    final ViewPagerTabLayout this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
        selectedTabIndicator.setX(selectedTabIndicator.getWidth() * i + j / ViewPagerTabLayout.access$100(ViewPagerTabLayout.this).getAdapter().getCount());
    }

    public void onPageSelected(int i)
    {
        selectTab(i);
    }

    istener()
    {
        this$0 = ViewPagerTabLayout.this;
        super();
    }
}

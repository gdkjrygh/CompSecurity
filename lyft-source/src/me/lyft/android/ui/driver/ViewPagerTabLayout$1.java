// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package me.lyft.android.ui.driver:
//            ViewPagerTabLayout

class val.childPosition
    implements android.view.rTabLayout._cls1
{

    final ViewPagerTabLayout this$0;
    final int val$childPosition;

    public void onClick(View view)
    {
        ViewPagerTabLayout.access$000(ViewPagerTabLayout.this);
        view.setSelected(true);
        ViewPagerTabLayout.access$100(ViewPagerTabLayout.this).setCurrentItem(val$childPosition);
        android.view.s s = selectedTabIndicator.getLayoutParams();
        s.width = view.getWidth();
        selectedTabIndicator.setLayoutParams(s);
        selectedTabIndicator.setX(view.getX());
    }

    ()
    {
        this$0 = final_viewpagertablayout;
        val$childPosition = I.this;
        super();
    }
}

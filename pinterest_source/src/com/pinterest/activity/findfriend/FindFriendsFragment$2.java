// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.ui.tab.TabBar;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsFragment

class this._cls0
    implements android.support.v4.view.geChangeListener
{

    final FindFriendsFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
        _tabBar.setPagerScroll(i, f);
    }

    public void onPageSelected(int i)
    {
        _tabBar.setCurrentIndex(i);
        Pinalytics.a(FindFriendsFragment.this);
    }

    stener()
    {
        this$0 = FindFriendsFragment.this;
        super();
    }
}

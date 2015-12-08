// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.util.Pair;
import android.support.v4.view.ModifiedViewPager;
import android.widget.LinearLayout;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Constants;
import com.pinterest.ui.actions.Scrollable;
import com.pinterest.ui.tab.TabBar;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.user:
//            UserFragment

class this._cls0
    implements android.support.v4.view.er.OnPageChangeListener
{

    final UserFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
        if (j > 0)
        {
            UserFragment userfragment = UserFragment.this;
            if (i < UserFragment.access$100(UserFragment.this).getCurrentItem())
            {
                j = i;
            } else
            {
                j = i + 1;
            }
            UserFragment.access$200(userfragment, j);
        }
        _tabBar.setPagerScroll(i, f);
        if (_userHeader.getTranslationY() < (float)(-Constants.ITEM_HEIGHT))
        {
            _userHeader.setTranslationY(-Constants.ITEM_HEIGHT);
        }
    }

    public void onPageSelected(int i)
    {
        _tabBar.setCurrentIndex(i);
        Pinalytics.a(UserFragment.this);
        UserFragment.access$200(UserFragment.this, i);
        Pair pair;
        if (UserFragment.access$300(UserFragment.this) != null && UserFragment.access$400(UserFragment.this).getFragments() != null)
        {
            if ((float)((Integer)(pair = ((Scrollable)UserFragment.access$500(UserFragment.this).getFragments().get(i)).getScrollPosition()).second).intValue() < -_userHeader.getTranslationY())
            {
                _userHeader.setTranslationY(-((Integer)pair.second).intValue());
                return;
            }
        }
    }

    gerAdapter()
    {
        this$0 = UserFragment.this;
        super();
    }
}

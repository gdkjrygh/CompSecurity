// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend;

import android.support.v4.view.ModifiedViewPager;
import com.pinterest.activity.task.fragment.BaseFragment;

// Referenced classes of package com.pinterest.activity.findfriend:
//            FindFriendsFragment

class this._cls0
    implements com.pinterest.ui.tab.dsFragment._cls3
{

    final FindFriendsFragment this$0;

    public void onTabReselected(int i)
    {
        scrollActiveFragmentToTop();
        BaseFragment basefragment = getActiveFragment();
        if (basefragment != null)
        {
            basefragment.refresh();
        }
    }

    public void onTabSelected(int i)
    {
        FindFriendsFragment.access$200(FindFriendsFragment.this).setCurrentItem(i, true);
    }

    ()
    {
        this$0 = FindFriendsFragment.this;
        super();
    }
}

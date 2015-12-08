// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user;

import android.support.v4.view.ModifiedViewPager;

// Referenced classes of package com.pinterest.activity.user:
//            UserFragment

class this._cls0
    implements com.pinterest.ui.tab.
{

    final UserFragment this$0;

    public void onTabReselected(int i)
    {
    }

    public void onTabSelected(int i)
    {
        UserFragment.access$800(UserFragment.this).setCurrentItem(i, true);
    }

    ()
    {
        this$0 = UserFragment.this;
        super();
    }
}

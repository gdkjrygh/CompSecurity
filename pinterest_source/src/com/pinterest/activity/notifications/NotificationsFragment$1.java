// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.support.v4.view.ModifiedViewPager;

// Referenced classes of package com.pinterest.activity.notifications:
//            NotificationsFragment

class this._cls0
    implements com.pinterest.ui.tab.tionsFragment._cls1
{

    final NotificationsFragment this$0;

    public void onTabReselected(int i)
    {
    }

    public void onTabSelected(int i)
    {
        NotificationsFragment.access$000(NotificationsFragment.this).setCurrentItem(i, true);
    }

    ()
    {
        this$0 = NotificationsFragment.this;
        super();
    }
}

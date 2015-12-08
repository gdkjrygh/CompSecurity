// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import com.pinterest.analytics.Pinalytics;
import com.pinterest.ui.tab.TabBar;

// Referenced classes of package com.pinterest.activity.notifications:
//            NotificationsFragment

class this._cls0
    implements android.support.v4.view.ChangeListener
{

    final NotificationsFragment this$0;

    public void onPageScrollStateChanged(int i)
    {
    }

    public void onPageScrolled(int i, float f, int j)
    {
        NotificationsFragment.access$100(NotificationsFragment.this).setPagerScroll(i, f);
    }

    public void onPageSelected(int i)
    {
        NotificationsFragment.access$100(NotificationsFragment.this).setCurrentIndex(i);
        Pinalytics.a(NotificationsFragment.this);
    }

    r()
    {
        this$0 = NotificationsFragment.this;
        super();
    }
}

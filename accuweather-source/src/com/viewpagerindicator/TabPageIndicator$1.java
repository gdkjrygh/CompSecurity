// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.support.v4.view.ViewPager;
import android.view.View;

// Referenced classes of package com.viewpagerindicator:
//            TabPageIndicator

class this._cls0
    implements android.view.r
{

    final TabPageIndicator this$0;

    public void onClick(View view)
    {
        view = (bView)view;
        int i = TabPageIndicator.access$000(TabPageIndicator.this).getCurrentItem();
        int j = view.getIndex();
        TabPageIndicator.access$000(TabPageIndicator.this).setCurrentItem(j);
        if (i == j && TabPageIndicator.access$100(TabPageIndicator.this) != null)
        {
            TabPageIndicator.access$100(TabPageIndicator.this).onTabReselected(j);
        }
    }

    TabReselectedListener()
    {
        this$0 = TabPageIndicator.this;
        super();
    }
}

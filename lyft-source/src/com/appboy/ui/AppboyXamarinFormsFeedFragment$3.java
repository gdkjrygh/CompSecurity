// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.AbsListView;
import com.appboy.ui.adapters.AppboyListAdapter;

// Referenced classes of package com.appboy.ui:
//            AppboyXamarinFormsFeedFragment

class this._cls0
    implements android.widget.his._cls0
{

    final AppboyXamarinFormsFeedFragment this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        abslistview = AppboyXamarinFormsFeedFragment.access$300(AppboyXamarinFormsFeedFragment.this);
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        abslistview.setEnabled(flag);
        if (j == 0)
        {
            return;
        }
        k = i - 1;
        if (k > AppboyXamarinFormsFeedFragment.access$400(AppboyXamarinFormsFeedFragment.this))
        {
            AppboyXamarinFormsFeedFragment.access$500(AppboyXamarinFormsFeedFragment.this).batchSetCardsToRead(AppboyXamarinFormsFeedFragment.access$400(AppboyXamarinFormsFeedFragment.this), k);
        }
        AppboyXamarinFormsFeedFragment.access$402(AppboyXamarinFormsFeedFragment.this, k);
        AppboyXamarinFormsFeedFragment.access$602(AppboyXamarinFormsFeedFragment.this, i + j);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    ()
    {
        this$0 = AppboyXamarinFormsFeedFragment.this;
        super();
    }
}

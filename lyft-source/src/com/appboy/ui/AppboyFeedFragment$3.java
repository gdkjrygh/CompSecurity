// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.AbsListView;
import com.appboy.ui.adapters.AppboyListAdapter;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

class this._cls0
    implements android.widget.istener
{

    final AppboyFeedFragment this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        abslistview = AppboyFeedFragment.access$300(AppboyFeedFragment.this);
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
        if (k > AppboyFeedFragment.access$400(AppboyFeedFragment.this))
        {
            AppboyFeedFragment.access$500(AppboyFeedFragment.this).batchSetCardsToRead(AppboyFeedFragment.access$400(AppboyFeedFragment.this), k);
        }
        AppboyFeedFragment.access$402(AppboyFeedFragment.this, k);
        AppboyFeedFragment.access$602(AppboyFeedFragment.this, i + j);
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    apter()
    {
        this$0 = AppboyFeedFragment.this;
        super();
    }
}

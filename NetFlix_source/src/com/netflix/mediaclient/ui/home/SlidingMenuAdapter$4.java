// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            SlidingMenuAdapter, HomeActivity

class this._cls0
    implements android.widget.ckListener
{

    final SlidingMenuAdapter this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = SlidingMenuAdapter.access$100(SlidingMenuAdapter.this).getHeaderViewsCount();
        HomeActivity.showGenreList(activity, SlidingMenuAdapter.access$200(SlidingMenuAdapter.this).getItem(i - j));
        SlidingMenuAdapter.access$000(SlidingMenuAdapter.this).closeDrawers();
    }

    nresListAdapter()
    {
        this$0 = SlidingMenuAdapter.this;
        super();
    }
}

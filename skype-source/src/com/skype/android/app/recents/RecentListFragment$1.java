// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.skype.android.ads.AdPlacement;
import com.skype.android.ads.AdPlacer;

// Referenced classes of package com.skype.android.app.recents:
//            RecentListFragment

final class val.banner extends android.support.v7.widget.t._cls1
{

    final RecentListFragment this$0;
    final View val$banner;

    public final void onScrollStateChanged(RecyclerView recyclerview, int i)
    {
        boolean flag1 = true;
        i = ((LinearLayoutManager)recyclerview.getLayoutManager()).findFirstVisibleItemPosition();
        boolean flag = flag1;
        if (i != 0)
        {
            if (i == 1 && val$banner.getHeight() == 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        adPlacer.b(AdPlacement.a, flag);
    }

    ()
    {
        this$0 = final_recentlistfragment;
        val$banner = View.this;
        super();
    }
}

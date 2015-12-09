// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments.rewards;

import android.view.View;
import android.widget.AdapterView;
import com.jcp.adapters.RewardsItemAdapter;
import com.jcp.model.rewards.Certificate;
import java.util.List;

// Referenced classes of package com.jcp.fragments.rewards:
//            RewardsDashboardFragment

class aa
    implements android.widget.AdapterView.OnItemClickListener
{

    final RewardsDashboardFragment a;

    aa(RewardsDashboardFragment rewardsdashboardfragment)
    {
        a = rewardsdashboardfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        int j = 0;
        while (j < RewardsDashboardFragment.a(a).size()) 
        {
            if (j != i)
            {
                ((Certificate)RewardsDashboardFragment.a(a).get(j)).setOpen(false);
            } else
            {
                adapterview = (Certificate)RewardsDashboardFragment.a(a).get(j);
                boolean flag;
                if (!adapterview.isOpen())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                adapterview.setOpen(flag);
            }
            j++;
        }
        a.a(a.listView);
        RewardsDashboardFragment.b(a).notifyDataSetChanged();
    }
}

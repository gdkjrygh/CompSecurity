// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.view.View;
import com.dominos.views.LoyaltyFAQRowView;
import java.util.ArrayList;

// Referenced classes of package com.dominos.adapters:
//            LoyaltyFAQListAdapter

class val.itemView
    implements android.view.apter._cls1
{

    final LoyaltyFAQListAdapter this$0;
    final LoyaltyFAQRowView val$itemView;
    final int val$position;

    public void onClick(View view)
    {
        if (LoyaltyFAQListAdapter.access$100(LoyaltyFAQListAdapter.this).contains(Integer.valueOf(val$position)))
        {
            LoyaltyFAQListAdapter.access$100(LoyaltyFAQListAdapter.this).remove(Integer.valueOf(val$position));
            val$itemView.unSelectRow();
            return;
        } else
        {
            LoyaltyFAQListAdapter.access$100(LoyaltyFAQListAdapter.this).add(Integer.valueOf(val$position));
            val$itemView.selectRow();
            return;
        }
    }

    ()
    {
        this$0 = final_loyaltyfaqlistadapter;
        val$position = i;
        val$itemView = LoyaltyFAQRowView.this;
        super();
    }
}

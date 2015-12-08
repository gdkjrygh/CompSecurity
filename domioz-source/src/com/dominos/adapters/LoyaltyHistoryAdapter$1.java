// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import android.view.View;
import com.dominos.views.LoyaltyHistoryRowView;
import java.util.ArrayList;

// Referenced classes of package com.dominos.adapters:
//            LoyaltyHistoryAdapter

class val.itemView
    implements android.view.apter._cls1
{

    final LoyaltyHistoryAdapter this$0;
    final LoyaltyHistoryRowView val$itemView;
    final int val$position;

    public void onClick(View view)
    {
        if (LoyaltyHistoryAdapter.access$100(LoyaltyHistoryAdapter.this).contains(Integer.valueOf(val$position)))
        {
            LoyaltyHistoryAdapter.access$100(LoyaltyHistoryAdapter.this).remove(Integer.valueOf(val$position));
            val$itemView.deselectRow();
            return;
        } else
        {
            LoyaltyHistoryAdapter.access$100(LoyaltyHistoryAdapter.this).add(Integer.valueOf(val$position));
            val$itemView.selectRow();
            return;
        }
    }

    ()
    {
        this$0 = final_loyaltyhistoryadapter;
        val$position = i;
        val$itemView = LoyaltyHistoryRowView.this;
        super();
    }
}

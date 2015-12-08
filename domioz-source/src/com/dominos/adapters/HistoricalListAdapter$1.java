// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.adapters;

import com.dominos.android.sdk.core.models.LabsOrder;

// Referenced classes of package com.dominos.adapters:
//            HistoricalListAdapter

class alItemCallback extends com.dominos.views.ricalItemCallback
{

    final HistoricalListAdapter this$0;
    final int val$position;

    public void onReorderButtonClicked(LabsOrder labsorder)
    {
        if (HistoricalListAdapter.access$100(HistoricalListAdapter.this) != null)
        {
            HistoricalListAdapter.access$100(HistoricalListAdapter.this).onReorderButtonClicked(labsorder, val$position);
        }
    }

    ()
    {
        this$0 = final_historicallistadapter;
        val$position = I.this;
        super();
    }
}

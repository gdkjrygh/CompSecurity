// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;

// Referenced classes of package com.dominos.activities:
//            HistoricalListActivity_

class val.position
    implements Runnable
{

    final HistoricalListActivity_ this$0;
    final LabsOrder val$order;
    final int val$position;

    public void run()
    {
        HistoricalListActivity_.access$501(HistoricalListActivity_.this, val$order, val$position);
    }

    ()
    {
        this$0 = final_historicallistactivity_;
        val$order = labsorder;
        val$position = I.this;
        super();
    }
}

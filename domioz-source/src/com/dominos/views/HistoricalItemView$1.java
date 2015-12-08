// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.view.View;
import com.dominos.android.sdk.core.models.LabsOrder;

// Referenced classes of package com.dominos.views:
//            HistoricalItemView

class sOrder
    implements android.view.ew._cls1
{

    final HistoricalItemView this$0;
    final storicalItemCallback val$callback;
    final LabsOrder val$historicalOrder;

    public void onClick(View view)
    {
        val$callback.onReorderButtonClicked(val$historicalOrder);
    }

    sOrder()
    {
        this$0 = final_historicalitemview;
        val$callback = storicalitemcallback;
        val$historicalOrder = LabsOrder.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.models.LabsOrder;
import java.util.ArrayList;

// Referenced classes of package com.dominos.activities:
//            HistoricalListActivity

class <init>
{

    final HistoricalListActivity this$0;

    public void cancelRecentOrder(com.dominos.bus.events.<init> <init>1)
    {
        onBackPressed();
    }

    public void reorderEasyOrder(com.dominos.bus.events.<init> <init>1)
    {
        if (<init>1.nse())
        {
            if (HistoricalListActivity.access$300(HistoricalListActivity.this) != null && !HistoricalListActivity.access$300(HistoricalListActivity.this).isEmpty())
            {
                onReorderButtonClicked((LabsOrder)HistoricalListActivity.access$300(HistoricalListActivity.this).get(0), 0);
            }
            return;
        } else
        {
            onBackPressed();
            return;
        }
    }

    public void selectRecentOrder(com.dominos.bus.events.this._cls0 _pcls0)
    {
        int i = _pcls0.dex();
        if (HistoricalListActivity.access$300(HistoricalListActivity.this) != null && !HistoricalListActivity.access$300(HistoricalListActivity.this).isEmpty() && i >= 0 && i < HistoricalListActivity.access$300(HistoricalListActivity.this).size())
        {
            onReorderButtonClicked((LabsOrder)HistoricalListActivity.access$300(HistoricalListActivity.this).get(i), i);
        }
    }

    private ()
    {
        this$0 = HistoricalListActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}

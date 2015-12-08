// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.adapter;

import android.database.DataSetObserver;

// Referenced classes of package com.pinterest.activity.sendapin.adapter:
//            SendPinAdapter

class this._cls0 extends DataSetObserver
{

    final SendPinAdapter this$0;

    public void onChanged()
    {
        SendPinAdapter.access$000(SendPinAdapter.this);
    }

    public void onInvalidated()
    {
        notifyDataSetInvalidated();
    }

    ()
    {
        this$0 = SendPinAdapter.this;
        super();
    }
}

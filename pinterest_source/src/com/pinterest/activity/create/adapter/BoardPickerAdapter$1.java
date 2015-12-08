// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.adapter;

import android.database.DataSetObserver;

// Referenced classes of package com.pinterest.activity.create.adapter:
//            BoardPickerAdapter

class this._cls0 extends DataSetObserver
{

    final BoardPickerAdapter this$0;

    public void onChanged()
    {
        notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = BoardPickerAdapter.this;
        super();
    }
}

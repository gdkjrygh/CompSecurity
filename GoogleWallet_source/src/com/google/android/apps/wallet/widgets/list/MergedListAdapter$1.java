// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.list;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.apps.wallet.widgets.list:
//            MergedListAdapter

final class this._cls0 extends DataSetObserver
{

    final MergedListAdapter this$0;

    public final void onChanged()
    {
        notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = MergedListAdapter.this;
        super();
    }
}

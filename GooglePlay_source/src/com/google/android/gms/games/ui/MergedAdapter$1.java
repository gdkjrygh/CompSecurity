// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.database.DataSetObserver;

// Referenced classes of package com.google.android.gms.games.ui:
//            MergedAdapter

final class this._cls0 extends DataSetObserver
{

    final MergedAdapter this$0;

    public final void onChanged()
    {
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = MergedAdapter.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.database.DataSetObserver;
import android.widget.Adapter;

// Referenced classes of package com.mopub.nativeads:
//            MoPubAdAdapter, MoPubStreamAdPlacer

final class l extends DataSetObserver
{

    final MoPubAdAdapter a;

    l(MoPubAdAdapter mopubadadapter)
    {
        a = mopubadadapter;
        super();
    }

    public final void onChanged()
    {
        MoPubAdAdapter.b(a).setItemCount(MoPubAdAdapter.a(a).getCount());
        a.notifyDataSetChanged();
    }

    public final void onInvalidated()
    {
        a.notifyDataSetInvalidated();
    }
}

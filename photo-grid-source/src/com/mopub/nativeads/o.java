// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.mopub.nativeads:
//            MoPubAdAdapter, MoPubStreamAdPlacer

final class o
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final android.widget.AdapterView.OnItemLongClickListener a;
    final MoPubAdAdapter b;

    o(MoPubAdAdapter mopubadadapter, android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        b = mopubadadapter;
        a = onitemlongclicklistener;
        super();
    }

    public final boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        return b.isAd(i) || a.onItemLongClick(adapterview, view, MoPubAdAdapter.b(b).getOriginalPosition(i), l);
    }
}

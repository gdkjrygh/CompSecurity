// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.mopub.nativeads:
//            MoPubAdAdapter, MoPubStreamAdPlacer

final class n
    implements android.widget.AdapterView.OnItemClickListener
{

    final android.widget.AdapterView.OnItemClickListener a;
    final MoPubAdAdapter b;

    n(MoPubAdAdapter mopubadadapter, android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        b = mopubadadapter;
        a = onitemclicklistener;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!MoPubAdAdapter.b(b).isAd(i))
        {
            a.onItemClick(adapterview, view, MoPubAdAdapter.b(b).getOriginalPosition(i), l);
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.mopub.nativeads:
//            MoPubAdAdapter, MoPubStreamAdPlacer

final class p
    implements android.widget.AdapterView.OnItemSelectedListener
{

    final android.widget.AdapterView.OnItemSelectedListener a;
    final MoPubAdAdapter b;

    p(MoPubAdAdapter mopubadadapter, android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        b = mopubadadapter;
        a = onitemselectedlistener;
        super();
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (!b.isAd(i))
        {
            a.onItemSelected(adapterview, view, MoPubAdAdapter.b(b).getOriginalPosition(i), l);
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
        a.onNothingSelected(adapterview);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import java.util.List;

// Referenced classes of package com.mopub.nativeads:
//            bf, MoPubAdAdapter

final class k
    implements bf
{

    final MoPubAdAdapter a;

    k(MoPubAdAdapter mopubadadapter)
    {
        a = mopubadadapter;
        super();
    }

    public final void onVisibilityChanged(List list, List list1)
    {
        MoPubAdAdapter.a(a, list);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.tinkerbell;

import android.view.View;

// Referenced classes of package com.spotify.mobile.android.spotlets.tinkerbell:
//            BannerView

final class a
    implements android.view.istener
{

    private BannerView a;

    public final void onClick(View view)
    {
        BannerView.b(a);
    }

    A(BannerView bannerview)
    {
        a = bannerview;
        super();
    }
}

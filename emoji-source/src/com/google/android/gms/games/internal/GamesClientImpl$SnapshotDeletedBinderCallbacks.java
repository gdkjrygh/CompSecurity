// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

final class yR extends AbstractGamesCallbacks
{

    final GamesClientImpl NE;
    private final com.google.android.gms.common.api.nit> yR;

    public void g(int i, String s)
    {
        yR.yR(new (i, s));
    }

    public (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        NE = gamesclientimpl;
        super();
        yR = (com.google.android.gms.common.api.cks.yR)hm.b(cks, "Holder must not be null");
    }
}

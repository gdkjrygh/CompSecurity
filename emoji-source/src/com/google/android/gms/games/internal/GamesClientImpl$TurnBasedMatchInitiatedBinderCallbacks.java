// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class OO extends AbstractGamesCallbacks
{

    final GamesClientImpl NE;
    private final com.google.android.gms.common.api.cks.OO OO;

    public void q(DataHolder dataholder)
    {
        OO.OO(new OO(dataholder));
    }

    public (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        NE = gamesclientimpl;
        super();
        OO = (com.google.android.gms.common.api.cks.OO)hm.b(cks, "Holder must not be null");
    }
}

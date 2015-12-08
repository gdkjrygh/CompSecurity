// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class XG extends AbstractGamesCallbacks
{

    final GamesClientImpl WC;
    private final com.google.android.gms.common.api.nit> XG;

    public void F(DataHolder dataholder)
    {
        XG.XG(new (dataholder));
    }

    public (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        WC = gamesclientimpl;
        super();
        XG = (com.google.android.gms.common.api.cks.XG)o.b(cks, "Holder must not be null");
    }
}

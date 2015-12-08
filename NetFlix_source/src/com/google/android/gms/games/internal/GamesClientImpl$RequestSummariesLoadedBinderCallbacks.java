// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

final class Jq extends AbstractGamesCallbacks
{

    final GamesClientImpl IJ;
    private final com.google.android.gms.common.api.cks.Jq Jq;

    public void F(DataHolder dataholder)
    {
        IJ.a(new IJ(IJ, Jq, dataholder));
    }

    public a(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        IJ = gamesclientimpl;
        super();
        Jq = (com.google.android.gms.common.api.cks.Jq)fq.b(cks, "Holder must not be null");
    }
}

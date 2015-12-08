// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.hn;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class Oq extends AbstractGamesCallbacks
{

    final GamesClientImpl NB;
    private final com.google.android.gms.common.api.cks.Oq Op;
    private final String Oq;

    public void K(DataHolder dataholder)
    {
        Op.Op(new Op(dataholder, Oq));
    }

    public (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks, String s)
    {
        NB = gamesclientimpl;
        super();
        Op = (com.google.android.gms.common.api.cks.Op)hn.b(cks, "Holder must not be null");
        Oq = (String)hn.b(s, "MilestoneId must not be null");
    }
}

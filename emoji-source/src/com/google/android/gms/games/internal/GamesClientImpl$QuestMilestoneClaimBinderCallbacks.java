// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class Ot extends AbstractGamesCallbacks
{

    final GamesClientImpl NE;
    private final com.google.android.gms.common.api.cks.Ot Os;
    private final String Ot;

    public void K(DataHolder dataholder)
    {
        Os.Os(new Os(dataholder, Ot));
    }

    public (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks, String s)
    {
        NE = gamesclientimpl;
        super();
        Os = (com.google.android.gms.common.api.cks.Os)hm.b(cks, "Holder must not be null");
        Ot = (String)hm.b(s, "MilestoneId must not be null");
    }
}

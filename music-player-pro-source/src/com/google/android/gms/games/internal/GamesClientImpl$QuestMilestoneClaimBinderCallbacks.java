// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class Zn extends AbstractGamesCallbacks
{

    private final com.google.android.gms.common.api.cks.Zn Zm;
    private final String Zn;

    public void K(DataHolder dataholder)
    {
        Zm.Zm(new Zm(dataholder, Zn));
    }

    public (com.google.android.gms.common.api.cks cks, String s)
    {
        Zm = (com.google.android.gms.common.api.cks.Zm)jx.b(cks, "Holder must not be null");
        Zn = (String)jx.b(s, "MilestoneId must not be null");
    }
}

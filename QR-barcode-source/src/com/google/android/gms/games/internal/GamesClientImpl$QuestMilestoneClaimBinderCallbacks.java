// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class Xu extends AbstractGamesCallbacks
{

    final GamesClientImpl WC;
    private final com.google.android.gms.common.api.cks.Xu Xt;
    private final String Xu;

    public void K(DataHolder dataholder)
    {
        Xt.Xt(new Xt(dataholder, Xu));
    }

    public (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks, String s)
    {
        WC = gamesclientimpl;
        super();
        Xt = (com.google.android.gms.common.api.cks.Xt)o.b(cks, "Holder must not be null");
        Xu = (String)o.b(s, "MilestoneId must not be null");
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private final class XE extends AbstractGamesCallbacks
{

    final GamesClientImpl WC;
    private final com.google.android.gms.common.api.it> XE;

    public void H(DataHolder dataholder)
    {
        XE.XE(new XE(dataholder));
    }

    public a(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.cks cks)
    {
        WC = gamesclientimpl;
        super();
        XE = (com.google.android.gms.common.api.cks.XE)o.b(cks, "Holder must not be null");
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

final class wH extends AbstractGamesCallbacks
{

    final GamesClientImpl IJ;
    private final com.google.android.gms.common.api.ack.wH wH;

    public void C(DataHolder dataholder)
    {
        IJ.a(new (IJ, wH, dataholder));
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack)
    {
        IJ = gamesclientimpl;
        super();
        wH = (com.google.android.gms.common.api.ack.wH)fq.b(ack, "Holder must not be null");
    }
}

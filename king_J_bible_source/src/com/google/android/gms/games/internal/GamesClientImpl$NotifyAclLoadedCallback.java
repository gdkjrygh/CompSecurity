// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class  extends 
    implements com.google.android.gms.games.internal.game.t>
{

    final GamesClientImpl IJ;

    protected void a(com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        ack.ack(this);
    }

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.ack.a)obj, dataholder);
    }

    (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack, dataholder);
    }
}

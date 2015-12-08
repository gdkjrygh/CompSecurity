// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;

// Referenced classes of package com.google.android.gms.games.client:
//            PlayGamesClientImpl

private static final class mBuffer extends t
    implements com.google.android.gms.games.client.games.r
{

    private final GameFirstPartyBuffer mBuffer;

    public final GameFirstPartyBuffer getGames()
    {
        return mBuffer;
    }

    t(DataHolder dataholder)
    {
        super(dataholder);
        mBuffer = new GameFirstPartyBuffer(dataholder);
    }
}

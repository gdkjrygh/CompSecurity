// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.PlayerBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class WZ extends a
    implements com.google.android.gms.games.sultImpl
{

    private final PlayerBuffer WZ;

    public PlayerBuffer getPlayers()
    {
        return WZ;
    }

    Q(DataHolder dataholder)
    {
        super(dataholder);
        WZ = new PlayerBuffer(dataholder);
    }
}

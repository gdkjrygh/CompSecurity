// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.b;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class YP extends b
    implements com.google.android.gms.games.sultImpl
{

    private final GameBuffer YP;

    public GameBuffer getGames()
    {
        return YP;
    }

    (DataHolder dataholder)
    {
        super(dataholder);
        YP = new GameBuffer(dataholder);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class >
    implements com.google.android.gms.games.multiplayer.turnbased.
{

    private final Status Eb;
    private final LoadMatchesResponse YR;

    public LoadMatchesResponse getMatches()
    {
        return YR;
    }

    public Status getStatus()
    {
        return Eb;
    }

    public void release()
    {
        YR.release();
    }

    MatchesResult(Status status, Bundle bundle)
    {
        Eb = status;
        YR = new LoadMatchesResponse(bundle);
    }
}

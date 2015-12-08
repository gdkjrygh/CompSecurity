// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class Yy
    implements com.google.android.gms.games.multiplayer.turnbased.
{

    private final Status Eb;
    private final String Yy;

    public String getMatchId()
    {
        return Yy;
    }

    public Status getStatus()
    {
        return Eb;
    }

    elMatchResult(Status status, String s)
    {
        Eb = status;
        Yy = s;
    }
}

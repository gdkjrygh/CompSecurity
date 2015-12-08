// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class NE
    implements com.google.android.gms.games.multiplayer.turnbased.
{

    private final String NE;
    private final Status yw;

    public String getMatchId()
    {
        return NE;
    }

    public Status getStatus()
    {
        return yw;
    }

    elMatchResult(Status status, String s)
    {
        yw = status;
        NE = s;
    }
}

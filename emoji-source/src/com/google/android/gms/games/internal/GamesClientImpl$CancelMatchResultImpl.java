// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class NH
    implements com.google.android.gms.games.multiplayer.turnbased.
{

    private final String NH;
    private final Status yz;

    public String getMatchId()
    {
        return NH;
    }

    public Status getStatus()
    {
        return yz;
    }

    elMatchResult(Status status, String s)
    {
        yz = status;
        NH = s;
    }
}

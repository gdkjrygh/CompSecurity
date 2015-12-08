// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

class wz
    implements com.google.android.gms.games.leaderboard.lt
{

    final wz Kx;
    final Status wz;

    public LeaderboardBuffer getLeaderboards()
    {
        return new LeaderboardBuffer(DataHolder.empty(14));
    }

    public Status getStatus()
    {
        return wz;
    }

    public void release()
    {
    }

    t(t t, Status status)
    {
        Kx = t;
        wz = status;
        super();
    }
}

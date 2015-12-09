// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            LeaderboardsImpl

final class val.status
    implements com.google.android.gms.games.leaderboard.lt
{

    final val.status this$0;
    final Status val$status;

    public final LeaderboardBuffer getLeaderboards()
    {
        return new LeaderboardBuffer(DataHolder.empty(14));
    }

    public final Status getStatus()
    {
        return val$status;
    }

    public final void release()
    {
    }

    t()
    {
        this$0 = final_t;
        val$status = Status.this;
        super();
    }
}

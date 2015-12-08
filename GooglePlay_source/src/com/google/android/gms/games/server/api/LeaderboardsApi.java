// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.api;

import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.BaseApi;
import com.google.android.gms.common.server.BaseApiaryServer;
import java.util.Formatter;

// Referenced classes of package com.google.android.gms.games.server.api:
//            Leaderboard

public final class LeaderboardsApi extends BaseApi
{

    public final BaseApiaryServer mServer;

    public LeaderboardsApi(BaseApiaryServer baseapiaryserver)
    {
        mServer = baseapiaryserver;
    }

    public final Leaderboard getBlocking(ClientContext clientcontext, String s, String s1)
        throws GoogleAuthException, VolleyError
    {
        StringBuilder stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("leaderboards/%1$s", new Object[] {
            enc(s)
        });
        if (s1 != null)
        {
            append(stringbuilder, "language", enc(s1));
        }
        s = stringbuilder.toString();
        return (Leaderboard)mServer.getResponseBlocking(clientcontext, 0, s, null, com/google/android/gms/games/server/api/Leaderboard);
    }
}

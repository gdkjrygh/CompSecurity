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
//            LeaderboardListFirstPartyResponse

public final class LeaderboardsApiInternal extends BaseApi
{

    private final BaseApiaryServer mServer;

    public LeaderboardsApiInternal(BaseApiaryServer baseapiaryserver)
    {
        mServer = baseapiaryserver;
    }

    public final LeaderboardListFirstPartyResponse listBlocking$3fe7d460(ClientContext clientcontext, String s, String s1, String s2, Boolean boolean1)
        throws GoogleAuthException, VolleyError
    {
        StringBuilder stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("applications/%1$s/leaderboards", new Object[] {
            enc(s)
        });
        if (s1 != null)
        {
            append(stringbuilder, "language", enc(s1));
        }
        if (s2 != null)
        {
            append(stringbuilder, "pageToken", enc(s2));
        }
        if (boolean1 != null)
        {
            append(stringbuilder, "plusRequired", String.valueOf(boolean1));
        }
        s = stringbuilder.toString();
        return (LeaderboardListFirstPartyResponse)mServer.getResponseBlocking(clientcontext, 0, s, null, com/google/android/gms/games/server/api/LeaderboardListFirstPartyResponse);
    }
}

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
//            PlayerAchievementGetMultipleResponse, ApplicationFetchList

public final class AchievementsApiInternal extends BaseApi
{

    private final BaseApiaryServer mServer;

    public AchievementsApiInternal(BaseApiaryServer baseapiaryserver)
    {
        mServer = baseapiaryserver;
    }

    public final PlayerAchievementGetMultipleResponse getMultipleBlocking$446ccc86(ClientContext clientcontext, String s, String s1, String s2, String s3, ApplicationFetchList applicationfetchlist)
        throws GoogleAuthException, VolleyError
    {
        StringBuilder stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("players/%1$s/achievements", new Object[] {
            enc(s)
        });
        append(stringbuilder, "state", enc(s1));
        if (s2 != null)
        {
            append(stringbuilder, "language", enc(s2));
        }
        if (s3 != null)
        {
            append(stringbuilder, "pageToken", enc(s3));
        }
        s = stringbuilder.toString();
        return (PlayerAchievementGetMultipleResponse)mServer.getResponseBlocking(clientcontext, 1, s, applicationfetchlist, com/google/android/gms/games/server/api/PlayerAchievementGetMultipleResponse);
    }
}

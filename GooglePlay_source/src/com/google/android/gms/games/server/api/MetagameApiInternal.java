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
//            ExperienceListResponse

public final class MetagameApiInternal extends BaseApi
{

    public final BaseApiaryServer mServer;

    public MetagameApiInternal(BaseApiaryServer baseapiaryserver)
    {
        mServer = baseapiaryserver;
    }

    public final ExperienceListResponse listExperiencesByPlayerBlocking(ClientContext clientcontext, String s, String s1, String s2, Integer integer, String s3)
        throws GoogleAuthException, VolleyError
    {
        StringBuilder stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("players/%1$s/experiences/%2$s", new Object[] {
            enc(s), enc(s1)
        });
        if (s2 != null)
        {
            append(stringbuilder, "language", enc(s2));
        }
        if (integer != null)
        {
            append(stringbuilder, "maxResults", String.valueOf(integer));
        }
        if (s3 != null)
        {
            append(stringbuilder, "pageToken", enc(s3));
        }
        s = stringbuilder.toString();
        return (ExperienceListResponse)mServer.getResponseBlocking(clientcontext, 0, s, null, com/google/android/gms/games/server/api/ExperienceListResponse);
    }
}

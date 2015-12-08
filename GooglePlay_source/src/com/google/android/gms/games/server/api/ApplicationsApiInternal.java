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
//            ApplicationGetMultipleFirstPartyResponse, ApplicationFetchList

public final class ApplicationsApiInternal extends BaseApi
{

    public final BaseApiaryServer mServer;

    public ApplicationsApiInternal(BaseApiaryServer baseapiaryserver)
    {
        mServer = baseapiaryserver;
    }

    public static String urlForListByPlayer(String s, String s1, String s2, String s3, Boolean boolean1, String s4, Integer integer, String s5, 
            String s6, Boolean boolean2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("players/%1$s/applications/%2$s", new Object[] {
            enc(s), enc(s1)
        });
        if (s2 != null)
        {
            append(stringbuilder, "clientRevision", enc(s2));
        }
        if (s3 != null)
        {
            append(stringbuilder, "deviceType", enc(s3));
        }
        if (boolean1 != null)
        {
            append(stringbuilder, "filterPlayable", String.valueOf(boolean1));
        }
        if (s4 != null)
        {
            append(stringbuilder, "language", enc(s4));
        }
        if (integer != null)
        {
            append(stringbuilder, "maxResults", String.valueOf(integer));
        }
        if (s5 != null)
        {
            append(stringbuilder, "pageToken", enc(s5));
        }
        append(stringbuilder, "platformType", enc(s6));
        if (boolean2 != null)
        {
            append(stringbuilder, "plusRequired", String.valueOf(boolean2));
        }
        return stringbuilder.toString();
    }

    public final ApplicationGetMultipleFirstPartyResponse getMultipleBlocking$50e8dc84(ClientContext clientcontext, String s, String s1, Boolean boolean1, String s2, String s3, String s4, 
            Boolean boolean2, ApplicationFetchList applicationfetchlist)
        throws GoogleAuthException, VolleyError
    {
        StringBuilder stringbuilder = new StringBuilder("applications");
        if (s != null)
        {
            append(stringbuilder, "clientRevision", enc(s));
        }
        if (s1 != null)
        {
            append(stringbuilder, "deviceType", enc(s1));
        }
        if (boolean1 != null)
        {
            append(stringbuilder, "includeMarketData", String.valueOf(boolean1));
        }
        if (s2 != null)
        {
            append(stringbuilder, "language", enc(s2));
        }
        if (s3 != null)
        {
            append(stringbuilder, "pageToken", enc(s3));
        }
        append(stringbuilder, "platformType", enc(s4));
        if (boolean2 != null)
        {
            append(stringbuilder, "plusRequired", String.valueOf(boolean2));
        }
        s = stringbuilder.toString();
        return (ApplicationGetMultipleFirstPartyResponse)mServer.getResponseBlocking(clientcontext, 1, s, applicationfetchlist, com/google/android/gms/games/server/api/ApplicationGetMultipleFirstPartyResponse);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.follow;

import android.net.Uri;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import ctz;
import cuf;
import hew;
import hfw;

public final class RxFollowersCountResolver
{

    private RxResolver a;

    public RxFollowersCountResolver(RxResolver rxresolver)
    {
        a = rxresolver;
    }

    public final hew a(String s)
    {
        s = new Request("GET", "hm://socialgraph/v2/counts?format=json", null, String.format("{\"target_uris\": [\"%s\"]}", new Object[] {
            Uri.decode((String)ctz.a(s))
        }).getBytes());
        return a.resolve(s).a(JacksonResponseParser.forClass([Lcom/spotify/mobile/android/spotlets/follow/RxFollowersCountResolver$Count;)).c(new hfw() {

            public final Object call(Object obj)
            {
                obj = (Count[])obj;
                if (obj.length == 0)
                {
                    throw cuf.a(new Exception("No count data, expected one."));
                } else
                {
                    return obj[0];
                }
            }

        });
    }
}

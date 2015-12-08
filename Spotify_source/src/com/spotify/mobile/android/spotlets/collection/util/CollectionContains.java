// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.util;

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParserException;
import com.spotify.mobile.android.util.SpotifyLink;
import cuf;
import eol;
import java.util.HashMap;

public final class CollectionContains
{

    private final Resolver a;
    private Handler b;

    public CollectionContains(Resolver resolver)
    {
        b = new Handler();
        a = resolver;
    }

    public final void a(String s, eol eol1)
    {
        Object obj = (new SpotifyLink(s)).c;
        if (obj != com.spotify.mobile.android.util.SpotifyLink.LinkType.aT && obj != com.spotify.mobile.android.util.SpotifyLink.LinkType.aJ && obj != com.spotify.mobile.android.util.SpotifyLink.LinkType.P && obj != com.spotify.mobile.android.util.SpotifyLink.LinkType.c && obj != com.spotify.mobile.android.util.SpotifyLink.LinkType.v)
        {
            eol1.a(s);
            return;
        }
        if (s.startsWith("spotify:local:"))
        {
            eol1.a(s);
            return;
        }
        obj = new ContainsRequest();
        obj.items = (new String[] {
            s
        });
        obj.source = null;
        try
        {
            obj = new Request("POST", "sp://core-collection/v1/contains", new HashMap(), JacksonSerializer.toBytes(((JacksonModel) (obj))));
            a.resolve(((Request) (obj)), new JsonCallbackReceiver(b, com/spotify/mobile/android/spotlets/collection/util/CollectionContains$ContainsResponse, eol1, s) {

                private eol a;
                private String b;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                }

                protected final void onResolved(Response response, Object obj1)
                {
                    response = (ContainsResponse)obj1;
                    a.a(b, response.isInCollection());
                }

            
            {
                a = eol1;
                b = s;
                super(handler, class1);
            }

                private class ContainsResponse
                    implements JacksonModel
                {

                    private boolean mFound[];

                    public boolean isInCollection()
                    {
                        boolean flag1 = false;
                        boolean flag = flag1;
                        if (mFound != null)
                        {
                            flag = flag1;
                            if (mFound[0])
                            {
                                flag = true;
                            }
                        }
                        return flag;
                    }

                    ContainsResponse()
                    {
                    }
                }

            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw cuf.a(s);
        }
    }

    private class ContainsRequest
        implements JacksonModel
    {

        public String items[];
        public String source;

        ContainsRequest()
        {
        }
    }

}

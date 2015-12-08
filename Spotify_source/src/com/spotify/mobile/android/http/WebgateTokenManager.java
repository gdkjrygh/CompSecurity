// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.http;

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.ResolverException;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.parser.JsonParser;
import com.spotify.mobile.android.util.logging.Logger;
import dmx;
import gcf;
import ggb;
import gin;
import gio;
import gip;
import giq;
import gng;
import gni;

// Referenced classes of package com.spotify.mobile.android.http:
//            TokenResponse

public class WebgateTokenManager
    implements dmx
{

    public static final gip b = gip.a("webgate-access-token");
    public static final gip c = gip.a("webgate-access-token-expires");
    public final giq a;
    public Context d;
    private final gng e;

    public WebgateTokenManager(Context context, gni gni1, giq giq1)
    {
        d = context;
        ggb.a();
        e = gni1.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        a = giq1;
    }

    public final String a()
    {
        Object obj;
        com.spotify.cosmos.android.DeferredResolver deferredresolver;
        Object obj2;
        obj = e.a();
        deferredresolver = Cosmos.getResolver(d);
        deferredresolver.connect();
        obj2 = new Request("GET", "hm://keymaster/token/authenticated?client_id=9a8d2f0ce77a4e248bb71fefcb557637&scope=playlist-read");
        obj2 = deferredresolver.resolve(((Request) (obj2)));
        obj = (TokenResponse)(new JsonParser(com/spotify/mobile/android/http/TokenResponse, ((com.fasterxml.jackson.databind.ObjectMapper) (obj)))).parseResponse(((com.spotify.cosmos.router.Response) (obj2)));
        long l = ((TokenResponse) (obj)).expiresIn;
        long l1 = gcf.b();
        obj2 = ((TokenResponse) (obj)).accessToken;
        a.a(d).b().a(b, ((String) (obj2))).a(c, l * 1000L + l1).a();
        obj = ((TokenResponse) (obj)).accessToken;
        deferredresolver.destroy();
        return ((String) (obj));
        Object obj1;
        obj1;
_L2:
        Logger.c("Could not renew token", new Object[0]);
        throw new WebgateTokenException(((Throwable) (obj1)));
        obj1;
        deferredresolver.destroy();
        throw obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }


    private class WebgateTokenException extends Exception
    {

        private static final long serialVersionUID = 0x8a31b56911L;

        public WebgateTokenException(Throwable throwable)
        {
            super(throwable);
        }
    }

}

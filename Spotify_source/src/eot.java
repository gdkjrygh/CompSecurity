// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.parser.ResponseParser;

public final class eot extends eov
{

    private eot(Resolver resolver, Handler handler)
    {
        super([B, resolver, handler);
    }

    public static eot a(Resolver resolver, Handler handler)
    {
        return new eot(resolver, handler);
    }

    protected final ResponseParser a(Class class1)
    {
        return new ResponseParser() {

            public final Object parseResponse(Response response)
            {
                HttpCallbackReceiver.defaultVerifyResponse(response);
                return response.getBody();
            }

        };
    }
}

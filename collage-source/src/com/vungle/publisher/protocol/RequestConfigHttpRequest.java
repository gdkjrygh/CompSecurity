// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import android.os.Bundle;
import com.vungle.publisher.ch;
import com.vungle.publisher.net.http.HttpRequest;
import com.vungle.publisher.protocol.message.RequestConfig;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.protocol:
//            ProtocolHttpRequest

public class RequestConfigHttpRequest extends ProtocolHttpRequest
{
    public static class Factory extends ProtocolHttpRequest.a
    {

        RequestConfigHttpRequest g;
        RequestConfig h;

        public final ProtocolHttpRequest a()
        {
            return d();
        }

        protected final volatile HttpRequest b()
        {
            return g;
        }

        public final HttpRequest c()
        {
            return d();
        }

        public final RequestConfigHttpRequest d()
            throws ch
        {
            RequestConfigHttpRequest requestconfighttprequest;
            try
            {
                if (g.e)
                {
                    return g;
                }
                requestconfighttprequest = (RequestConfigHttpRequest)super.a();
                requestconfighttprequest.b = (new StringBuilder()).append(d).append("config").toString();
                ((HttpRequest) (requestconfighttprequest)).c.putString("Content-Type", "application/json");
                requestconfighttprequest.d = h.c();
            }
            catch (JSONException jsonexception)
            {
                throw new ch(jsonexception);
            }
            return requestconfighttprequest;
        }

        public Factory()
        {
        }
    }


    boolean e;

    RequestConfigHttpRequest()
    {
    }

    protected final com.vungle.publisher.net.http.HttpRequest.b a()
    {
        return com.vungle.publisher.net.http.HttpRequest.b.c;
    }

    protected final com.vungle.publisher.net.http.HttpRequest.a b()
    {
        return com.vungle.publisher.net.http.HttpRequest.a.a;
    }
}

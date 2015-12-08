// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import android.os.Bundle;
import com.vungle.publisher.c;
import com.vungle.publisher.ch;
import com.vungle.publisher.net.http.HttpRequest;
import com.vungle.publisher.protocol.message.RequestStreamingAd;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.protocol:
//            RequestStreamingAdHttpRequest

public static class I extends I
{

    com.vungle.publisher.protocol.message._A1__03_ g;

    public final RequestStreamingAdHttpRequest a(String s, c c)
        throws ch
    {
        RequestStreamingAdHttpRequest requeststreamingadhttprequest;
        try
        {
            requeststreamingadhttprequest = (RequestStreamingAdHttpRequest)super.I();
            requeststreamingadhttprequest.b = (new StringBuilder()).append(d).append("requestStreamingAd").toString();
            ((HttpRequest) (requeststreamingadhttprequest)).c.putString("Content-Type", "application/json");
            requeststreamingadhttprequest.d = g.I(s, c).c();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ch(s);
        }
        return requeststreamingadhttprequest;
    }

    protected final HttpRequest b()
    {
        return new RequestStreamingAdHttpRequest();
    }

    public I()
    {
    }
}

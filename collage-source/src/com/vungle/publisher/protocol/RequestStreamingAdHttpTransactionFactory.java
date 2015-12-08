// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.c;
import com.vungle.publisher.net.http.HttpTransaction;
import org.json.JSONException;

// Referenced classes of package com.vungle.publisher.protocol:
//            RequestStreamingAdHttpResponseHandler

public class RequestStreamingAdHttpTransactionFactory extends com.vungle.publisher.net.http.HttpTransaction.Factory
{

    RequestStreamingAdHttpRequest.Factory a;
    RequestStreamingAdHttpResponseHandler b;

    public RequestStreamingAdHttpTransactionFactory()
    {
    }

    public final HttpTransaction a(String s, c c)
        throws JSONException
    {
        return super.a(a.a(s, c), b);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.util.List;

// Referenced classes of package com.squareup.okhttp:
//            Call, OkHttpClient, Interceptor, Request, 
//            Connection, Response

class forWebSocket
    implements forWebSocket
{

    private final boolean forWebSocket;
    private final int index;
    private final Request request;
    final Call this$0;

    public Connection connection()
    {
        return null;
    }

    public Response proceed(Request request1)
    {
        if (index < Call.access$300(Call.this).interceptors().size())
        {
            request1 = new <init>(index + 1, request1, forWebSocket);
            return ((Interceptor)Call.access$300(Call.this).interceptors().get(index)).intercept(request1);
        } else
        {
            return getResponse(request1, forWebSocket);
        }
    }

    public Request request()
    {
        return request;
    }

    (int i, Request request1, boolean flag)
    {
        this$0 = Call.this;
        super();
        index = i;
        request = request1;
        forWebSocket = flag;
    }
}

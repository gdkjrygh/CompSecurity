// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;


// Referenced classes of package com.mopub.volley:
//            Request, RequestQueue

final class e
    implements RequestQueue.RequestFilter
{

    final Object a;
    final RequestQueue b;

    e(RequestQueue requestqueue, Object obj)
    {
        b = requestqueue;
        a = obj;
        super();
    }

    public final boolean apply(Request request)
    {
        return request.getTag() == a;
    }
}

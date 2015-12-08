// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol.message;

import com.vungle.publisher.c;

// Referenced classes of package com.vungle.publisher.protocol.message:
//            RequestStreamingAd

public static class  extends 
{

    protected  e;

    public final RequestStreamingAd a(String s, c c1)
    {
        RequestStreamingAd requeststreamingad = (RequestStreamingAd)super.();
        requeststreamingad.g = (c1.getExtras());
        requeststreamingad.h = s;
        requeststreamingad.i = c1.getPlacement();
        return requeststreamingad;
    }

    protected final Object a()
    {
        return new RequestStreamingAd();
    }

    protected final volatile Object[] a(int i)
    {
        return new RequestStreamingAd[i];
    }

    ()
    {
    }
}

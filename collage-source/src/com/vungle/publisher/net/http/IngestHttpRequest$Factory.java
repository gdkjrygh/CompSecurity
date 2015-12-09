// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net.http;


// Referenced classes of package com.vungle.publisher.net.http:
//            IngestHttpRequest, HttpRequest

public static abstract class  extends 
{

    String c;

    protected abstract String a();

    protected final HttpRequest c()
    {
        return d();
    }

    protected final IngestHttpRequest d()
    {
        IngestHttpRequest ingesthttprequest = (IngestHttpRequest)super.d();
        ingesthttprequest.a("Content-Encoding", "gzip");
        ingesthttprequest.a("Content-Type", "application/json");
        ingesthttprequest.b = (new StringBuilder()).append(c).append(a()).toString();
        return ingesthttprequest;
    }

    protected ()
    {
    }
}

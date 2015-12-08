// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.net.http.HttpRequest;

// Referenced classes of package com.vungle.publisher.protocol:
//            ReportLocalAdHttpRequest, ReportAdHttpRequest

static class  extends 
{

    com.vungle.publisher.protocol.message. g;

    protected final HttpRequest b()
    {
        return new ReportLocalAdHttpRequest();
    }

    protected final volatile com.vungle.publisher.protocol.message. d()
    {
        return g;
    }

    protected final ReportAdHttpRequest e()
    {
        return new ReportLocalAdHttpRequest();
    }

    ()
    {
    }
}

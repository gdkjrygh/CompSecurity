// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;


// Referenced classes of package com.google.api.client.http:
//            HttpBackOffUnsuccessfulResponseHandler, HttpResponse

static final class Y
    implements Y
{

    public boolean isRequired(HttpResponse httpresponse)
    {
        return httpresponse.getStatusCode() / 100 == 5;
    }

    Y()
    {
    }
}

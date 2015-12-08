// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import java.io.IOException;

// Referenced classes of package com.google.api.client.http:
//            HttpRequest, HttpResponse

public interface HttpUnsuccessfulResponseHandler
{

    public abstract boolean handleResponse(HttpRequest httprequest, HttpResponse httpresponse, boolean flag)
        throws IOException;
}

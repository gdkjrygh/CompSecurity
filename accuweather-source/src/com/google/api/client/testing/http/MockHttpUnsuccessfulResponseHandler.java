// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.http;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import java.io.IOException;

public class MockHttpUnsuccessfulResponseHandler
    implements HttpUnsuccessfulResponseHandler
{

    private boolean isCalled;
    private boolean successfullyHandleResponse;

    public MockHttpUnsuccessfulResponseHandler(boolean flag)
    {
        successfullyHandleResponse = flag;
    }

    public boolean handleResponse(HttpRequest httprequest, HttpResponse httpresponse, boolean flag)
        throws IOException
    {
        isCalled = true;
        return successfullyHandleResponse;
    }

    public boolean isCalled()
    {
        return isCalled;
    }
}

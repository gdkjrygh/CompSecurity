// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing.json;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import java.io.IOException;

public final class GoogleJsonResponseExceptionFactoryTesting
{

    public GoogleJsonResponseExceptionFactoryTesting()
    {
    }

    public static GoogleJsonResponseException newMock(JsonFactory jsonfactory, int i, String s)
        throws IOException
    {
        s = (new MockLowLevelHttpResponse()).setStatusCode(i).setReasonPhrase(s);
        s = (new com.google.api.client.testing.http.MockHttpTransport.Builder()).setLowLevelHttpResponse(s).build().createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
        s.setThrowExceptionOnExecuteError(false);
        return GoogleJsonResponseException.from(jsonfactory, s.execute());
    }
}

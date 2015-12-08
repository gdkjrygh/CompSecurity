// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.http;

import com.google.api.client.util.Preconditions;
import java.util.Set;

// Referenced classes of package com.google.api.client.testing.http:
//            MockHttpTransport, MockLowLevelHttpRequest, MockLowLevelHttpResponse

public static class 
{

    MockLowLevelHttpRequest lowLevelHttpRequest;
    MockLowLevelHttpResponse lowLevelHttpResponse;
    Set supportedMethods;

    public MockHttpTransport build()
    {
        return new MockHttpTransport(this);
    }

    public final MockLowLevelHttpRequest getLowLevelHttpRequest()
    {
        return lowLevelHttpRequest;
    }

    MockLowLevelHttpResponse getLowLevelHttpResponse()
    {
        return lowLevelHttpResponse;
    }

    public final Set getSupportedMethods()
    {
        return supportedMethods;
    }

    public final supportedMethods setLowLevelHttpRequest(MockLowLevelHttpRequest mocklowlevelhttprequest)
    {
        boolean flag;
        if (lowLevelHttpResponse == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannnot set a low level HTTP request when a low level HTTP response has been set.");
        lowLevelHttpRequest = mocklowlevelhttprequest;
        return this;
    }

    public final lowLevelHttpRequest setLowLevelHttpResponse(MockLowLevelHttpResponse mocklowlevelhttpresponse)
    {
        boolean flag;
        if (lowLevelHttpRequest == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot set a low level HTTP response when a low level HTTP request has been set.");
        lowLevelHttpResponse = mocklowlevelhttpresponse;
        return this;
    }

    public final lowLevelHttpResponse setSupportedMethods(Set set)
    {
        supportedMethods = set;
        return this;
    }

    public ()
    {
    }
}

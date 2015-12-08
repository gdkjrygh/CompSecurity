// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.http;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.google.api.client.testing.http:
//            MockLowLevelHttpRequest, MockLowLevelHttpResponse

public class MockHttpTransport extends HttpTransport
{
    public static class Builder
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

        public final Builder setLowLevelHttpRequest(MockLowLevelHttpRequest mocklowlevelhttprequest)
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

        public final Builder setLowLevelHttpResponse(MockLowLevelHttpResponse mocklowlevelhttpresponse)
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

        public final Builder setSupportedMethods(Set set)
        {
            supportedMethods = set;
            return this;
        }

        public Builder()
        {
        }
    }


    private MockLowLevelHttpRequest lowLevelHttpRequest;
    private MockLowLevelHttpResponse lowLevelHttpResponse;
    private Set supportedMethods;

    public MockHttpTransport()
    {
    }

    protected MockHttpTransport(Builder builder1)
    {
        supportedMethods = builder1.supportedMethods;
        lowLevelHttpRequest = builder1.lowLevelHttpRequest;
        lowLevelHttpResponse = builder1.lowLevelHttpResponse;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public LowLevelHttpRequest buildRequest(String s, String s1)
        throws IOException
    {
        Preconditions.checkArgument(supportsMethod(s), "HTTP method %s not supported", new Object[] {
            s
        });
        if (lowLevelHttpRequest != null)
        {
            s = lowLevelHttpRequest;
        } else
        {
            s1 = new MockLowLevelHttpRequest(s1);
            s = s1;
            if (lowLevelHttpResponse != null)
            {
                s1.setResponse(lowLevelHttpResponse);
                return s1;
            }
        }
        return s;
    }

    public final MockLowLevelHttpRequest getLowLevelHttpRequest()
    {
        return lowLevelHttpRequest;
    }

    public final Set getSupportedMethods()
    {
        if (supportedMethods == null)
        {
            return null;
        } else
        {
            return Collections.unmodifiableSet(supportedMethods);
        }
    }

    public boolean supportsMethod(String s)
        throws IOException
    {
        return supportedMethods == null || supportedMethods.contains(s);
    }
}

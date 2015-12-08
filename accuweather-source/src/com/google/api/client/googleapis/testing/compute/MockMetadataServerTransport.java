// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing.compute;

import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import java.io.IOException;

public class MockMetadataServerTransport extends MockHttpTransport
{

    static final JsonFactory JSON_FACTORY = new JacksonFactory();
    private static final String METADATA_SERVER_URL = "http://metadata.google.internal";
    private static final String METADATA_TOKEN_SERVER_URL = "http://metadata/computeMetadata/v1/instance/service-accounts/default/token";
    String accessToken;
    Integer tokenRequestStatusCode;

    public MockMetadataServerTransport(String s)
    {
        accessToken = s;
    }

    public LowLevelHttpRequest buildRequest(String s, String s1)
        throws IOException
    {
        if (s1.equals("http://metadata/computeMetadata/v1/instance/service-accounts/default/token"))
        {
            return new MockLowLevelHttpRequest(s1) {

                final MockMetadataServerTransport this$0;

                public LowLevelHttpResponse execute()
                    throws IOException
                {
                    if (tokenRequestStatusCode != null)
                    {
                        return (new MockLowLevelHttpResponse()).setStatusCode(tokenRequestStatusCode.intValue()).setContent("Token Fetch Error");
                    }
                    if (!"true".equals(getFirstHeaderValue("X-Google-Metadata-Request")))
                    {
                        throw new IOException("Metadata request header not found.");
                    } else
                    {
                        Object obj = new GenericJson();
                        ((GenericJson) (obj)).setFactory(MockMetadataServerTransport.JSON_FACTORY);
                        ((GenericJson) (obj)).put("access_token", accessToken);
                        ((GenericJson) (obj)).put("expires_in", Integer.valueOf(0x36ee80));
                        ((GenericJson) (obj)).put("token_type", "Bearer");
                        obj = ((GenericJson) (obj)).toPrettyString();
                        return (new MockLowLevelHttpResponse()).setContentType("application/json; charset=UTF-8").setContent(((String) (obj)));
                    }
                }

            
            {
                this$0 = MockMetadataServerTransport.this;
                super(s);
            }
            };
        }
        if (s1.equals("http://metadata.google.internal"))
        {
            return new MockLowLevelHttpRequest(s1) {

                final MockMetadataServerTransport this$0;

                public LowLevelHttpResponse execute()
                {
                    MockLowLevelHttpResponse mocklowlevelhttpresponse = new MockLowLevelHttpResponse();
                    mocklowlevelhttpresponse.addHeader("Metadata-Flavor", "Google");
                    return mocklowlevelhttpresponse;
                }

            
            {
                this$0 = MockMetadataServerTransport.this;
                super(s);
            }
            };
        } else
        {
            return super.buildRequest(s, s1);
        }
    }

    public void setTokenRequestStatusCode(Integer integer)
    {
        tokenRequestStatusCode = integer;
    }

}

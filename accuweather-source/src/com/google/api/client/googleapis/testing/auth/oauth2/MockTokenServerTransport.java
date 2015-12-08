// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing.auth.oauth2;

import com.google.api.client.googleapis.testing.TestUtils;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MockTokenServerTransport extends MockHttpTransport
{

    static final String EXPECTED_GRANT_TYPE = "urn:ietf:params:oauth:grant-type:jwt-bearer";
    static final JsonFactory JSON_FACTORY = new JacksonFactory();
    Map clients;
    Map refreshTokens;
    Map serviceAccounts;

    public MockTokenServerTransport()
    {
        serviceAccounts = new HashMap();
        clients = new HashMap();
        refreshTokens = new HashMap();
    }

    public void addClient(String s, String s1)
    {
        clients.put(s, s1);
    }

    public void addRefreshToken(String s, String s1)
    {
        refreshTokens.put(s, s1);
    }

    public void addServiceAccount(String s, String s1)
    {
        serviceAccounts.put(s, s1);
    }

    public LowLevelHttpRequest buildRequest(String s, String s1)
        throws IOException
    {
        if (s1.equals("https://accounts.google.com/o/oauth2/token"))
        {
            return new MockLowLevelHttpRequest(s1) {

                final MockTokenServerTransport this$0;

                public LowLevelHttpResponse execute()
                    throws IOException
                {
                    Object obj = TestUtils.parseQuery(getContentAsString());
                    String s3 = (String)((Map) (obj)).get("client_id");
                    GenericJson genericjson;
                    if (s3 != null)
                    {
                        if (!clients.containsKey(s3))
                        {
                            throw new IOException("Client ID not found.");
                        }
                        String s2 = (String)((Map) (obj)).get("client_secret");
                        s3 = (String)clients.get(s3);
                        if (s2 == null || !s2.equals(s3))
                        {
                            throw new IOException("Client secret not found.");
                        }
                        obj = (String)((Map) (obj)).get("refresh_token");
                        if (!refreshTokens.containsKey(obj))
                        {
                            throw new IOException("Refresh Token not found.");
                        }
                        obj = (String)refreshTokens.get(obj);
                    } else
                    if (((Map) (obj)).containsKey("grant_type"))
                    {
                        if (!"urn:ietf:params:oauth:grant-type:jwt-bearer".equals((String)((Map) (obj)).get("grant_type")))
                        {
                            throw new IOException("Unexpected Grant Type.");
                        }
                        obj = (String)((Map) (obj)).get("assertion");
                        Object obj1 = JsonWebSignature.parse(MockTokenServerTransport.JSON_FACTORY, ((String) (obj)));
                        obj = ((JsonWebSignature) (obj1)).getPayload().getIssuer();
                        if (!serviceAccounts.containsKey(obj))
                        {
                            throw new IOException("Service Account Email not found as issuer.");
                        }
                        obj = (String)serviceAccounts.get(obj);
                        obj1 = (String)((JsonWebSignature) (obj1)).getPayload().get("scope");
                        if (obj1 == null || ((String) (obj1)).length() == 0)
                        {
                            throw new IOException("Scopes not found.");
                        }
                    } else
                    {
                        throw new IOException("Uknown token type.");
                    }
                    genericjson = new GenericJson();
                    genericjson.setFactory(MockTokenServerTransport.JSON_FACTORY);
                    genericjson.put("access_token", obj);
                    genericjson.put("expires_in", Integer.valueOf(0x36ee80));
                    genericjson.put("token_type", "Bearer");
                    obj = genericjson.toPrettyString();
                    return (new MockLowLevelHttpResponse()).setContentType("application/json; charset=UTF-8").setContent(((String) (obj)));
                }

            
            {
                this$0 = MockTokenServerTransport.this;
                super(s);
            }
            };
        } else
        {
            return super.buildRequest(s, s1);
        }
    }

}

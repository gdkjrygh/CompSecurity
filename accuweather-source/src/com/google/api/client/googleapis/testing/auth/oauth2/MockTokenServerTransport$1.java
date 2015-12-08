// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing.auth.oauth2;

import com.google.api.client.googleapis.testing.TestUtils;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.google.api.client.googleapis.testing.auth.oauth2:
//            MockTokenServerTransport

class this._cls0 extends MockLowLevelHttpRequest
{

    final MockTokenServerTransport this$0;

    public LowLevelHttpResponse execute()
        throws IOException
    {
        Object obj = TestUtils.parseQuery(getContentAsString());
        String s1 = (String)((Map) (obj)).get("client_id");
        GenericJson genericjson;
        if (s1 != null)
        {
            if (!clients.containsKey(s1))
            {
                throw new IOException("Client ID not found.");
            }
            String s = (String)((Map) (obj)).get("client_secret");
            s1 = (String)clients.get(s1);
            if (s == null || !s.equals(s1))
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
            obj = ((JsonWebSignature) (obj1)).getPayload().uer();
            if (!serviceAccounts.containsKey(obj))
            {
                throw new IOException("Service Account Email not found as issuer.");
            }
            obj = (String)serviceAccounts.get(obj);
            obj1 = (String)((JsonWebSignature) (obj1)).getPayload().("scope");
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

    (String s)
    {
        this$0 = MockTokenServerTransport.this;
        super(s);
    }
}

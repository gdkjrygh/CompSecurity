// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing.compute;

import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import java.io.IOException;

// Referenced classes of package com.google.api.client.googleapis.testing.compute:
//            MockMetadataServerTransport

class this._cls0 extends MockLowLevelHttpRequest
{

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

    (String s)
    {
        this$0 = MockMetadataServerTransport.this;
        super(s);
    }
}

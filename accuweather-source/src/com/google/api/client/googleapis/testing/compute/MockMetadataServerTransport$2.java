// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.testing.compute;

import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;

// Referenced classes of package com.google.api.client.googleapis.testing.compute:
//            MockMetadataServerTransport

class this._cls0 extends MockLowLevelHttpRequest
{

    final MockMetadataServerTransport this$0;

    public LowLevelHttpResponse execute()
    {
        MockLowLevelHttpResponse mocklowlevelhttpresponse = new MockLowLevelHttpResponse();
        mocklowlevelhttpresponse.addHeader("Metadata-Flavor", "Google");
        return mocklowlevelhttpresponse;
    }

    (String s)
    {
        this$0 = MockMetadataServerTransport.this;
        super(s);
    }
}

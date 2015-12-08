// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;


// Referenced classes of package com.skype.android.app.search:
//            AgentProvisioningServiceClient

private final class response
{

    private String response;
    private boolean success;
    final AgentProvisioningServiceClient this$0;

    public final String getResponse()
    {
        return response;
    }

    public final boolean isSuccess()
    {
        return success;
    }

    public (boolean flag, String s)
    {
        this$0 = AgentProvisioningServiceClient.this;
        super();
        success = flag;
        response = s;
    }
}

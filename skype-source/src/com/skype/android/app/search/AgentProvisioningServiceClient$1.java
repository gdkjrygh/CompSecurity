// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.text.TextUtils;
import com.skype.android.app.token.SkypeTokenCallback;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncService;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.search:
//            AgentProvisioningServiceClient, AgentProvisioningServiceResponse

final class val.callback
    implements SkypeTokenCallback
{

    final AgentProvisioningServiceClient this$0;
    final AsyncCallback val$callback;

    public final void onSkypeTokenRetrieved(final String token)
    {
        token = new Callable() {

            final AgentProvisioningServiceClient._cls1 this$1;
            final String val$token;

            public final AgentProvisioningServiceResponse call()
                throws Exception
            {
                if (!TextUtils.isEmpty(token))
                {
                    AgentProvisioningServiceClient.a a = AgentProvisioningServiceClient.access$000(this$0, AgentProvisioningServiceClient.b.GET, getAPSServiceUriGET(), token);
                    if (a.isSuccess())
                    {
                        return AgentProvisioningServiceResponse.parse(a.getResponse());
                    }
                }
                return new AgentProvisioningServiceResponse();
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$1 = AgentProvisioningServiceClient._cls1.this;
                token = s;
                super();
            }
        };
        AgentProvisioningServiceClient.access$100(AgentProvisioningServiceClient.this).a(token, val$callback);
    }

    _cls1.val.token()
    {
        this$0 = final_agentprovisioningserviceclient;
        val$callback = AsyncCallback.this;
        super();
    }
}

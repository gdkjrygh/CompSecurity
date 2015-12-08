// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import com.skype.android.app.token.SkypeTokenCallback;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncService;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.search:
//            AgentProvisioningServiceClient

final class val.callback
    implements SkypeTokenCallback
{

    final AgentProvisioningServiceClient this$0;
    final AsyncCallback val$callback;
    final val.callback val$method;
    final String val$serviceUri;

    public final void onSkypeTokenRetrieved(final String token)
    {
        token = new Callable() {

            final AgentProvisioningServiceClient._cls2 this$1;
            final String val$token;

            public final Boolean call()
                throws Exception
            {
                return Boolean.valueOf(AgentProvisioningServiceClient.access$000(this$0, method, serviceUri, token).isSuccess());
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$1 = AgentProvisioningServiceClient._cls2.this;
                token = s;
                super();
            }
        };
        AgentProvisioningServiceClient.access$100(AgentProvisioningServiceClient.this).a(token, val$callback);
    }

    _cls1.val.token()
    {
        this$0 = final_agentprovisioningserviceclient;
        val$method = token;
        val$serviceUri = s;
        val$callback = AsyncCallback.this;
        super();
    }
}

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

final class val.token
    implements Callable
{

    final call this$1;
    final String val$token;

    public final Boolean call()
        throws Exception
    {
        return Boolean.valueOf(AgentProvisioningServiceClient.access$000(_fld0, method, serviceUri, val$token).Success());
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    l.callback()
    {
        this$1 = final_callback;
        val$token = String.this;
        super();
    }

    // Unreferenced inner class com/skype/android/app/search/AgentProvisioningServiceClient$2

/* anonymous class */
    final class AgentProvisioningServiceClient._cls2
        implements SkypeTokenCallback
    {

        final AgentProvisioningServiceClient this$0;
        final AsyncCallback val$callback;
        final AgentProvisioningServiceClient.b val$method;
        final String val$serviceUri;

        public final void onSkypeTokenRetrieved(String s)
        {
            s = s. new AgentProvisioningServiceClient._cls2._cls1();
            AgentProvisioningServiceClient.access$100(AgentProvisioningServiceClient.this).a(s, callback);
        }

            
            {
                this$0 = final_agentprovisioningserviceclient;
                method = b;
                serviceUri = s;
                callback = AsyncCallback.this;
                super();
            }
    }

}

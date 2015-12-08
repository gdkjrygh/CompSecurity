// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.wobs.provider.WobsClient;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager, WobDatastore

final class val.wobInstance
    implements Callable
{

    final WobsManager this$0;
    final com.google.wallet.proto.cts.WobInstance val$wobInstance;

    private com.google.wallet.proto.api..DeleteWobResponse call()
        throws Exception
    {
        com.google.wallet.proto.api..DeleteWobResponse deletewobresponse = WobsManager.access$900(WobsManager.this).deleteWob(val$wobInstance);
        if (deletewobresponse.callError == null)
        {
            if (deletewobresponse.instance == null)
            {
                throw new RpcException("Crossbar returned both deleteWobResponse.callError == null and deleteWobResponse.instance == null");
            }
            WobsManager.access$200(WobsManager.this).removeWobs(val$wobInstance.categoryId.intValue(), new String[] {
                val$wobInstance.id
            });
        }
        return deletewobresponse;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    se()
    {
        this$0 = final_wobsmanager;
        val$wobInstance = com.google.wallet.proto.cts.WobInstance.this;
        super();
    }
}

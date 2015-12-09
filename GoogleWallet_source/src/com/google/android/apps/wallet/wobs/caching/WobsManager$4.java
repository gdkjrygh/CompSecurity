// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.wobs.provider.WobUpdateEvent;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager, WobDatastore, WobsCacheClient

final class val.wobInstanceId
    implements Callable
{

    final WobsManager this$0;
    final String val$wobInstanceId;

    private Void call()
    {
        Object obj = WobsManager.access$200(WobsManager.this).readWob(val$wobInstanceId);
        if (obj != null)
        {
            WLog.i(WobsManager.access$500(), "Read WOB from db");
            WobsManager.access$300(WobsManager.this).post(val$wobInstanceId, new WobUpdateEvent(((com.google.wallet.proto.cts.WobInstance) (obj))));
            return null;
        }
        WLog.i(WobsManager.access$500(), "WOB is not in db - fetching");
        try
        {
            obj = WobsManager.access$600(WobsManager.this).fetchWob(val$wobInstanceId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            WobsManager.access$300(WobsManager.this).post(val$wobInstanceId, WobUpdateEvent.errorEvent());
            return null;
        }
        if (((com.google.wallet.proto.api..FetchWobsResponse) (obj)).callError != null)
        {
            WLog.efmt(WobsManager.access$500(), "WOB fetching error %d", new Object[] {
                ((com.google.wallet.proto.api..FetchWobsResponse) (obj)).callError.errorCode
            });
            obj = WobUpdateEvent.errorEvent();
        } else
        if (((com.google.wallet.proto.api..FetchWobsResponse) (obj)).wob != null && ((com.google.wallet.proto.api..FetchWobsResponse) (obj)).wob.length == 1)
        {
            obj = new WobUpdateEvent(((com.google.wallet.proto.api..FetchWobsResponse) (obj)).wob[0]);
        } else
        {
            WLog.e(WobsManager.access$500(), "Could not find WobInstance in FetchWobsResponse");
            obj = WobUpdateEvent.errorEvent();
        }
        WobsManager.access$300(WobsManager.this).post(val$wobInstanceId, obj);
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    se()
    {
        this$0 = final_wobsmanager;
        val$wobInstanceId = String.this;
        super();
    }
}

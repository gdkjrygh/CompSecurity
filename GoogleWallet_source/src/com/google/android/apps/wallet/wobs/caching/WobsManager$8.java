// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.wobs.provider.WobDeletionEvent;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager

final class val.wobInstance
    implements AsyncCallback
{

    final WobsManager this$0;
    final com.google.wallet.proto.cts.WobInstance val$wobInstance;

    private void onSuccess(com.google.wallet.proto.api..DeleteWobResponse deletewobresponse)
    {
        if (deletewobresponse.callError != null)
        {
            WobsManager.access$300(WobsManager.this).post(val$wobInstance.id, new WobDeletionEvent(val$wobInstance, deletewobresponse.callError));
            return;
        } else
        {
            deletewobresponse.instance.categoryId = val$wobInstance.categoryId;
            WobsManager.access$300(WobsManager.this).post(deletewobresponse.instance.id, new WobDeletionEvent(deletewobresponse.instance));
            return;
        }
    }

    public final void onFailure(Exception exception)
    {
        WobsManager.access$300(WobsManager.this).post(val$wobInstance.id, new WobDeletionEvent(val$wobInstance, new com.google.wallet.proto.r.CallError()));
    }

    public final volatile void onSuccess(Object obj)
    {
        onSuccess((com.google.wallet.proto.api..DeleteWobResponse)obj);
    }

    se()
    {
        this$0 = final_wobsmanager;
        val$wobInstance = com.google.wallet.proto.cts.WobInstance.this;
        super();
    }
}

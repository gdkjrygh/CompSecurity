// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.globalresources;

import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;

// Referenced classes of package com.google.android.apps.wallet.globalresources:
//            GlobalResourcesSyncManager

final class this._cls0
    implements Runnable
{

    final GlobalResourcesSyncManager this$0;

    public final void run()
    {
        WLog.d(GlobalResourcesSyncManager.access$000(), "Got GET_GLOBAL_RESOURCES notification. Syncing global resources.");
        try
        {
            syncGlobalResourcesNow();
            return;
        }
        catch (RpcException rpcexception)
        {
            WLog.e(GlobalResourcesSyncManager.access$000(), "Refreshing global resources failed", rpcexception);
        }
    }

    Q()
    {
        this$0 = GlobalResourcesSyncManager.this;
        super();
    }
}

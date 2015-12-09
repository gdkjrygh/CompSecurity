// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import com.google.android.apps.wallet.globalresources.GlobalResourcesSyncManager;
import dagger.Lazy;

// Referenced classes of package com.google.android.apps.wallet.init:
//            CombinedSyncTask

final class this._cls0
    implements Runnable
{

    final CombinedSyncTask this$0;

    public final void run()
    {
        ((GlobalResourcesSyncManager)CombinedSyncTask.access$000(CombinedSyncTask.this).get()).enablePeriodicSync();
    }

    sourcesSyncManager()
    {
        this$0 = CombinedSyncTask.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init;

import com.google.android.apps.wallet.wobs.api.WobsColdStartSyncer;
import dagger.Lazy;

// Referenced classes of package com.google.android.apps.wallet.init:
//            CombinedSyncTask

final class this._cls0
    implements Runnable
{

    final CombinedSyncTask this$0;

    public final void run()
    {
        ((WobsColdStartSyncer)CombinedSyncTask.access$100(CombinedSyncTask.this).get()).sync();
    }

    ncer()
    {
        this$0 = CombinedSyncTask.this;
        super();
    }
}

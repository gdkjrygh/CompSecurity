// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.net.Uri;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncResult, SyncInitiator, SyncStateManager

class val.uri
    implements b
{

    final SyncInitiator this$0;
    final Uri val$uri;

    public void call(SyncResult syncresult)
    {
        if (syncresult.wasChanged())
        {
            SyncInitiator.access$700(SyncInitiator.this).resetSyncMisses(val$uri);
        }
    }

    public volatile void call(Object obj)
    {
        call((SyncResult)obj);
    }

    ()
    {
        this$0 = final_syncinitiator;
        val$uri = Uri.this;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.net.Uri;
import rx.b.b;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncInitiator, SyncStateManager

class val.uris
    implements b
{

    final SyncInitiator this$0;
    final Uri val$uris[];

    public void call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            boolean1 = val$uris;
            int j = boolean1.length;
            for (int i = 0; i < j; i++)
            {
                Uri uri = boolean1[i];
                SyncInitiator.access$700(SyncInitiator.this).resetSyncMisses(uri);
            }

        }
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = final_syncinitiator;
        val$uris = _5B_Landroid.net.Uri_3B_.this;
        super();
    }
}

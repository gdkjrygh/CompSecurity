// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.Intent;
import android.os.Looper;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncAdapterService

class this._cls1
    implements Runnable
{

    final this._cls1 this$1;

    public void run()
    {
        String s = SyncAdapterService.TAG;
        sendBroadcast(new Intent(SyncAdapterService.SYNC_FINISHED));
        cess._mth000(this._cls1.this).quit();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}

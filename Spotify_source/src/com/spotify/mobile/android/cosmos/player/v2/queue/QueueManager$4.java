// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.logging.Logger;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.queue:
//            QueueManager

class this._cls0
    implements dateObserver
{

    final QueueManager this$0;

    public void onError(Throwable throwable)
    {
        Logger.b(throwable, "Failed to update queue.", new Object[0]);
    }

    public void onSuccess(Response response)
    {
        QueueManager.access$300(QueueManager.this, response.getStatus());
    }

    dateObserver()
    {
        this$0 = QueueManager.this;
        super();
    }
}

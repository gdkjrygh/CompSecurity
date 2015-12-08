// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.mobile.android.util.logging.Logger;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.queue:
//            QueueManager, ExplicitQueue

class val.indexToRemove
    implements tObserver
{

    final QueueManager this$0;
    final int val$indexToRemove;

    public void onError(Throwable throwable)
    {
        Logger.b(throwable, "Failed to remove track from queue.", new Object[0]);
    }

    public void onQueueReceived(ExplicitQueue explicitqueue, String s)
    {
        QueueManager.access$200(QueueManager.this, explicitqueue, s, val$indexToRemove);
    }

    tObserver()
    {
        this$0 = final_queuemanager;
        val$indexToRemove = I.this;
        super();
    }
}

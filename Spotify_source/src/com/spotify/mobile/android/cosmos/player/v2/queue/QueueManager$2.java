// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.queue:
//            QueueManager, ExplicitQueue

class dateObserver
    implements tObserver
{

    final QueueManager this$0;
    final PlayerTrack val$playerTrack;
    final dateObserver val$updateObserver;

    public void onError(Throwable throwable)
    {
        if (val$updateObserver != null)
        {
            val$updateObserver.onError(throwable);
        }
    }

    public void onQueueReceived(ExplicitQueue explicitqueue, String s)
    {
        explicitqueue.addItem(val$playerTrack);
        QueueManager.access$100(QueueManager.this, explicitqueue, s, val$updateObserver);
    }

    dateObserver()
    {
        this$0 = final_queuemanager;
        val$playerTrack = playertrack;
        val$updateObserver = dateObserver.this;
        super();
    }
}

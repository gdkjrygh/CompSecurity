// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.queue;

import android.os.Handler;
import com.spotify.cosmos.router.Response;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.queue:
//            QueueManager

class val.updateObserver extends com.spotify.cosmos.android.ckReceiver
{

    final QueueManager this$0;
    final dateObserver val$updateObserver;

    protected void onError(Throwable throwable)
    {
        if (val$updateObserver != null)
        {
            val$updateObserver.onError(throwable);
        }
    }

    protected void onResolved(Response response)
    {
        if (val$updateObserver != null)
        {
            val$updateObserver.onSuccess(response);
        }
    }

    dateObserver(dateObserver dateobserver)
    {
        this$0 = final_queuemanager;
        val$updateObserver = dateobserver;
        super(Handler.this);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Handler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            ResolverPlayer, PlayerQueue

class  extends JsonCallbackReceiver
{

    final ResolverPlayer this$0;
    final llback val$callback;

    protected void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ceiver.ErrorCause errorcause)
    {
        val$callback.onGetQueueFailed();
    }

    protected void onResolved(Response response, PlayerQueue playerqueue)
    {
        if (response.getStatus() == 200)
        {
            val$callback.onGetQueueSuccess(playerqueue);
            return;
        } else
        {
            val$callback.onGetQueueFailed();
            return;
        }
    }

    protected volatile void onResolved(Response response, Object obj)
    {
        onResolved(response, (PlayerQueue)obj);
    }

    llback(Class class1, ObjectMapper objectmapper, llback llback)
    {
        this$0 = final_resolverplayer;
        val$callback = llback;
        super(Handler.this, class1, objectmapper);
    }
}

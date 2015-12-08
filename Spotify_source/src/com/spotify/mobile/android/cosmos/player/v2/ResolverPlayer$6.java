// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Handler;
import com.spotify.cosmos.router.Response;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            ResolverPlayer

class val.callback extends com.spotify.cosmos.android.Receiver
{

    final ResolverPlayer this$0;
    final lback val$callback;

    protected void onError(Throwable throwable)
    {
        val$callback.onRestoreFailed();
    }

    protected void onResolved(Response response)
    {
        if (val$callback == null)
        {
            return;
        }
        if (response.getStatus() == 200)
        {
            val$callback.onRestoreSuccess();
            return;
        } else
        {
            val$callback.onRestoreFailed();
            return;
        }
    }

    lback(lback lback)
    {
        this$0 = final_resolverplayer;
        val$callback = lback;
        super(Handler.this);
    }
}

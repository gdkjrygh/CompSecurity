// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Handler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayerSessionParameters;
import com.spotify.mobile.android.util.logging.Logger;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            ResolverPlayer, PlayerSession

class  extends JsonCallbackReceiver
{

    final ResolverPlayer this$0;
    final yCallback val$callback;
    final PlayerSession val$playerSession;

    protected void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ceiver.ErrorCause errorcause)
    {
        Logger.b(throwable, (new StringBuilder("Failed to prepare play: ")).append(errorcause).toString(), new Object[0]);
        val$callback.onPreparePlayFailed();
    }

    protected void onResolved(Response response, PlayerSessionParameters playersessionparameters)
    {
        val$playerSession.setSessionUri(playersessionparameters.sessionUri);
        val$callback.onPreparePlaySuccess(val$playerSession);
    }

    protected volatile void onResolved(Response response, Object obj)
    {
        onResolved(response, (PlayerSessionParameters)obj);
    }

    yCallback(ObjectMapper objectmapper, PlayerSession playersession, yCallback ycallback)
    {
        this$0 = final_resolverplayer;
        val$playerSession = playersession;
        val$callback = ycallback;
        super(final_handler, Class.this, objectmapper);
    }
}

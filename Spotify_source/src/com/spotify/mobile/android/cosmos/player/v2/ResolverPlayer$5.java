// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Handler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.player.v2.internal.SnapshotParameters;
import com.spotify.mobile.android.util.Assertion;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            ResolverPlayer

class  extends JsonCallbackReceiver
{

    final ResolverPlayer this$0;
    final ck val$callback;

    protected void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ceiver.ErrorCause errorcause)
    {
        val$callback.onSaveFailed();
    }

    protected void onResolved(Response response, SnapshotParameters snapshotparameters)
    {
        if (response.getStatus() == 200)
        {
            response = snapshotparameters.snapshot;
            if (response != null)
            {
                val$callback.onSnapshotReceived(response);
                return;
            } else
            {
                Assertion.b("Null snapshot received");
                return;
            }
        } else
        {
            val$callback.onSaveFailed();
            return;
        }
    }

    protected volatile void onResolved(Response response, Object obj)
    {
        onResolved(response, (SnapshotParameters)obj);
    }

    ck(Class class1, ObjectMapper objectmapper, ck ck)
    {
        this$0 = final_resolverplayer;
        val$callback = ck;
        super(Handler.this, class1, objectmapper);
    }
}

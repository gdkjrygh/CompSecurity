// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Handler;
import com.google.common.collect.Lists;
import com.spotify.cosmos.router.Response;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            ResolverPlayer

class val.callback extends com.spotify.cosmos.android.Receiver
{

    final ResolverPlayer this$0;
    final ck val$callback;

    protected void onError(Throwable throwable)
    {
        if (val$callback == null)
        {
            return;
        } else
        {
            val$callback.onPlayForbidden(Lists.a(new String[] {
                "android.internal-error"
            }));
            return;
        }
    }

    protected void onResolved(Response response)
    {
        if (val$callback == null)
        {
            return;
        }
        if (response.getStatus() == 200)
        {
            val$callback.onPlaySuccess();
            return;
        }
        if (response.getStatus() == 403)
        {
            response = (String)response.getHeaders().get("forbidden-reasons");
            val$callback.onPlayForbidden(Arrays.asList(response.split(",")));
            return;
        } else
        {
            val$callback.onPlayForbidden(Lists.a(new String[] {
                (new StringBuilder("android.unknown-error-")).append(response.getStatus()).toString()
            }));
            return;
        }
    }

    ck(ck ck)
    {
        this$0 = final_resolverplayer;
        val$callback = ck;
        super(Handler.this);
    }
}

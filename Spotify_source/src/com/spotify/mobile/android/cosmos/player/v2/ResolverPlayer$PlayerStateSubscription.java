// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            ResolverPlayer, PlayerState

final class mRequest extends JsonCallbackReceiver
{

    private final mSubscription mObserver;
    private final Request mRequest;
    private Subscription mSubscription;
    final ResolverPlayer this$0;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.scription scription)
    {
        Logger.b(throwable, (new StringBuilder("Failed to resolve state: ")).append(scription).toString(), new Object[0]);
    }

    protected final void onResolved(Response response, PlayerState playerstate)
    {
label0:
        {
            synchronized (ResolverPlayer.access$200(ResolverPlayer.this))
            {
                if (ResolverPlayer.access$300(ResolverPlayer.this).containsKey(mObserver))
                {
                    break label0;
                }
            }
            return;
        }
        ResolverPlayer.access$402(ResolverPlayer.this, playerstate);
        mObserver.eReceived(playerstate);
        response;
        JVM INSTR monitorexit ;
        return;
        playerstate;
        response;
        JVM INSTR monitorexit ;
        throw playerstate;
    }

    protected final volatile void onResolved(Response response, Object obj)
    {
        onResolved(response, (PlayerState)obj);
    }

    final void subscribe()
    {
        this;
        JVM INSTR monitorenter ;
        if (mSubscription == null || !mSubscription.isActive())
        {
            mSubscription = ResolverPlayer.access$500(ResolverPlayer.this).subscribe(mRequest, this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void unsubscribe()
    {
        this;
        JVM INSTR monitorenter ;
        Subscription subscription = mSubscription;
        if (subscription != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mSubscription.unsubscribe();
        mSubscription = null;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    ( , int i, int j)
    {
        this$0 = ResolverPlayer.this;
        super(ResolverPlayer.access$000(ResolverPlayer.this), com/spotify/mobile/android/cosmos/player/v2/PlayerState, ResolverPlayer.access$100());
        mObserver = ;
        mRequest = new Request("SUB", String.format("sp://player/v2/main?reverse_cap=%d&future_cap=%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
    }
}

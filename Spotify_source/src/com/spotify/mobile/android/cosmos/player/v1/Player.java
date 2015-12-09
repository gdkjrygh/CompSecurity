// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v1;

import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.ParserException;
import java.util.HashMap;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v1:
//            PlayerStateBuilder, PlayerState

public class Player
{

    public static final String PLAYER_URI = "sp://player/v1/main";
    private final Resolver mResolver;

    public Player(Resolver resolver)
    {
        mResolver = resolver;
    }

    public Boolean pause()
    {
        return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.PAUSE).build(), null);
    }

    public Boolean pause(com.spotify.cosmos.android.Resolver.CallbackReceiver callbackreceiver)
    {
        return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.PAUSE).build(), callbackreceiver);
    }

    public Boolean play(PlayerState playerstate)
    {
        return sendRequestWithState(playerstate, null);
    }

    public Boolean play(PlayerState playerstate, com.spotify.cosmos.android.Resolver.CallbackReceiver callbackreceiver)
    {
        return sendRequestWithState(playerstate, callbackreceiver);
    }

    public Boolean resume()
    {
        return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.RESUME).build(), null);
    }

    public Boolean resume(com.spotify.cosmos.android.Resolver.CallbackReceiver callbackreceiver)
    {
        return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.RESUME).build(), callbackreceiver);
    }

    public Boolean sendRequestWithState(PlayerState playerstate, com.spotify.cosmos.android.Resolver.CallbackReceiver callbackreceiver)
    {
        if (playerstate == null)
        {
            throw new IllegalArgumentException("Cannot play with null player state");
        }
        boolean flag;
        try
        {
            playerstate = new Request("POST", "sp://player/v1/main", new HashMap(), JacksonSerializer.toBytes(playerstate));
            flag = mResolver.resolve(playerstate, callbackreceiver);
        }
        // Misplaced declaration of an exception variable
        catch (PlayerState playerstate)
        {
            if (callbackreceiver != null)
            {
                callbackreceiver.sendOnError(playerstate);
            }
            return Boolean.valueOf(false);
        }
        return Boolean.valueOf(flag);
    }

    public Boolean skipToNextTrack()
    {
        return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.SKIP_NEXT).build(), null);
    }

    public Boolean skipToNextTrack(com.spotify.cosmos.android.Resolver.CallbackReceiver callbackreceiver)
    {
        return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.SKIP_NEXT).build(), callbackreceiver);
    }

    public Boolean skipToPreviousTrack()
    {
        return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.SKIP_PREV).build(), null);
    }

    public Boolean skipToPreviousTrack(com.spotify.cosmos.android.Resolver.CallbackReceiver callbackreceiver)
    {
        return sendRequestWithState(PlayerStateBuilder.create(PlayerState.Action.SKIP_PREV).build(), callbackreceiver);
    }

    public Subscription subscribe(com.spotify.cosmos.android.Resolver.CallbackReceiver callbackreceiver)
    {
        Request request = new Request("SUB", "sp://player/v1/main");
        return mResolver.subscribe(request, callbackreceiver);
    }
}

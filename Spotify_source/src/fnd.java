// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

public final class fnd
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver
{

    private Optional a;
    private final fnc b;

    fnd(fnc fnc1)
    {
        a = Optional.e();
        b = (fnc)ctz.a(fnc1);
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
label0:
        {
            ctz.a(playerstate);
            boolean flag;
            if (!playerstate.isPaused() && playerstate.isPlaying())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            playerstate = Optional.b(Boolean.valueOf(flag));
            if (!a.equals(playerstate))
            {
                a = playerstate;
                if (!((Boolean)playerstate.c()).booleanValue())
                {
                    break label0;
                }
                b.b();
            }
            return;
        }
        b.M_();
    }
}

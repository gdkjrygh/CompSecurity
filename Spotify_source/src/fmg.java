// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

public final class fmg
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver
{

    private Optional a;
    private final fmf b;

    public fmg(fmf fmf1)
    {
        a = Optional.e();
        b = (fmf)ctz.a(fmf1);
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
label0:
        {
            ctz.a(playerstate);
            playerstate = Optional.b(Boolean.valueOf(Boolean.parseBoolean(ezr.a(playerstate, "is_advertisement"))));
            if (!a.equals(playerstate))
            {
                a = playerstate;
                if (!((Boolean)playerstate.c()).booleanValue())
                {
                    break label0;
                }
                b.K_();
            }
            return;
        }
        b.b();
    }
}

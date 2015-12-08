// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

public final class fmr
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver
{

    private final fmq a;
    private Optional b;

    public fmr(fmq fmq1)
    {
        b = Optional.e();
        a = fmq1;
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        if (!TextUtils.isEmpty(playerstate.entityUri()))
        {
            if (!b.equals(playerstate = Optional.b(playerstate.entityUri())))
            {
                b = playerstate;
                a.L_();
                return;
            }
        }
    }
}

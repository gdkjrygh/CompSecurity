// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.paste.widget.carousel.CarouselLayoutManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.session.SessionState;
import java.util.Set;

public class fbh
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, eda
{

    final Player a;
    fae b;
    final eqi c;
    private fbg d;
    private PlayerTrack e;

    public fbh(fbg fbg1, fae fae, Player player, eqi eqi)
    {
        d = fbg1;
        a = player;
        b = fae;
        c = eqi;
    }

    public final void a(SessionState sessionstate)
    {
    }

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        boolean flag2 = true;
        PlayerTrack aplayertrack[] = playerstate.reverse();
        PlayerTrack playertrack = playerstate.track();
        PlayerTrack aplayertrack1[] = playerstate.future();
        fbg fbg2 = d;
        PlayerTrack playertrack1 = playerstate.track();
        fbg2.e.a(aplayertrack, playertrack1, aplayertrack1);
        fbg fbg1;
        boolean flag;
        boolean flag1;
        if (!playerstate.restrictions().disallowPeekingPrevReasons().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!playerstate.restrictions().disallowPeekingNextReasons().isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        fbg1 = d;
        fbg1.b.a(flag);
        fbg1.c = flag;
        fbg1 = d;
        fbg1.b.b(flag1);
        fbg1.d = flag1;
        fbg1 = d;
        if (!playerstate.restrictions().disallowSkippingPrevReasons().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fbg1.a.a(flag);
        fbg1 = d;
        if (!playerstate.restrictions().disallowSkippingNextReasons().isEmpty())
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        fbg1.a.b(flag);
        if (!cty.a(playertrack, e))
        {
            e = playertrack;
        }
    }
}

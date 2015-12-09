// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class eqe
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver
{

    private static final long a;
    private final Player b;
    private final eqf c;
    private final eqi d;

    private eqe(Player player, eqf eqf1, eqi eqi1)
    {
        b = player;
        c = eqf1;
        d = eqi1;
    }

    public static eqe a(Player player, eqf eqf1, eqi eqi1)
    {
        return new eqe(player, eqf1, eqi1);
    }

    private void a(PlayerState playerstate)
    {
        if (playerstate.options().repeatingTrack() && playerstate.restrictions().disallowTogglingRepeatTrackReasons().isEmpty())
        {
            b.setRepeatingTrack(false);
            b.setRepeatingContext(true);
        }
    }

    public final void a()
    {
        PlayerState playerstate = b.getLastPlayerState();
        if (playerstate != null)
        {
            Set set = playerstate.restrictions().disallowSkippingNextReasons();
            if (!set.isEmpty() && set.contains("mft_disallow") && d != null)
            {
                d.b();
                return;
            }
            if (set.isEmpty() || !set.contains("ad_disallow"))
            {
                b.skipToNextTrack();
                a(playerstate);
                return;
            }
        }
    }

    public final void a(long l)
    {
        for (PlayerState playerstate = b.getLastPlayerState(); playerstate == null || !playerstate.restrictions().disallowSeekingReasons().isEmpty();)
        {
            return;
        }

        b.seekTo(l);
    }

    public final void a(boolean flag)
    {
        PlayerState playerstate;
        boolean flag2;
        flag2 = true;
        playerstate = b.getLastPlayerState();
        if (playerstate != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag1;
        PlayerRestrictions playerrestrictions = playerstate.restrictions();
        long l;
        if (!playerrestrictions.disallowSkippingPrevReasons().isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (playerrestrictions.disallowSeekingReasons().isEmpty())
        {
            flag2 = false;
        }
        l = playerstate.currentPlaybackPosition();
        if (flag || !flag1 && l <= a)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (flag2) goto _L1; else goto _L3
_L3:
        b.seekTo(0L);
        return;
        if (flag1) goto _L1; else goto _L4
_L4:
        b.skipToPreviousTrack();
        a(playerstate);
        return;
    }

    public final void b()
    {
        PlayerState playerstate;
        playerstate = b.getLastPlayerState();
        break MISSING_BLOCK_LABEL_10;
label0:
        while (!playerstate.restrictions().disallowPausingReasons().isEmpty()) 
        {
            do
            {
                do
                {
                    return;
                } while (playerstate == null || !playerstate.isPlaying());
                if (!playerstate.isPaused())
                {
                    continue label0;
                }
            } while (!playerstate.restrictions().disallowResumingReasons().isEmpty());
            b.resume();
            return;
        }
        b.pause();
        return;
    }

    public final void b(long l)
    {
        PlayerState playerstate = b.getLastPlayerState();
        a(Math.max(0L, Math.min(playerstate.currentPlaybackPosition() + l, playerstate.duration())));
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        if (c == null || playerstate == null)
        {
            return;
        }
        ctz.a(c);
        c.a_(playerstate.isPaused());
        PlayerRestrictions playerrestrictions = playerstate.restrictions();
        long l;
        long l1;
        boolean flag;
        boolean flag1;
        if (playerstate.isPaused())
        {
            c.b_(playerrestrictions.disallowResumingReasons().isEmpty());
        } else
        {
            c.b_(playerrestrictions.disallowPausingReasons().isEmpty());
        }
        ctz.a(c);
        playerrestrictions = playerstate.restrictions();
        flag = playerrestrictions.disallowSkippingPrevReasons().isEmpty();
        flag1 = playerrestrictions.disallowSeekingReasons().isEmpty();
        c.c(flag | flag1);
        c.d(playerrestrictions.disallowSkippingNextReasons().isEmpty());
        ctz.a(c);
        playerrestrictions = playerstate.restrictions();
        c.e(playerrestrictions.disallowSeekingReasons().isEmpty());
        l1 = playerstate.currentPlaybackPosition();
        l = playerstate.duration();
        if (playerstate.playbackSpeed() == 0.0F)
        {
            l = l1;
        }
        c.a(playerstate.duration());
        c.a(l1, l, playerstate.playbackSpeed());
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(3L);
    }
}

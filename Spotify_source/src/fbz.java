// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.player.RepeatState;
import java.util.Set;

public final class fbz extends fbc
{

    private Player c;
    private fca d;
    private eqi e;

    public fbz(eqe eqe, fbb fbb1, Player player, fca fca1, eqi eqi1)
    {
        super(eqe, fbb1);
        c = (Player)ctz.a(player);
        d = (fca)ctz.a(fca1);
        e = (eqi)ctz.a(eqi1);
    }

    private static RepeatState a(PlayerOptions playeroptions)
    {
        if (playeroptions.repeatingTrack())
        {
            return RepeatState.c;
        }
        if (playeroptions.repeatingContext())
        {
            return RepeatState.b;
        } else
        {
            return RepeatState.a;
        }
    }

    protected final void a(PlayerState playerstate)
    {
        d.g(playerstate.options().shufflingContext());
        playerstate = playerstate.options();
        d.a(a(((PlayerOptions) (playerstate))));
    }

    protected final void b()
    {
        c = null;
        d = null;
        e = null;
    }

    public final void c()
    {
        a.e();
        Player player = (Player)ctz.a(c);
        PlayerState playerstate = player.getLastPlayerState();
        if (!playerstate.restrictions().disallowTogglingShuffleReasons().isEmpty())
        {
            e.B_();
            return;
        }
        boolean flag;
        if (!playerstate.options().shufflingContext())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        player.setShufflingContext(flag);
    }

    public final void d()
    {
        Player player;
        PlayerState playerstate;
        RepeatState repeatstate1;
        a.d();
        player = (Player)ctz.a(c);
        playerstate = player.getLastPlayerState();
        repeatstate1 = a(playerstate.options());
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[RepeatState.values().length];
                try
                {
                    a[RepeatState.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[RepeatState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[RepeatState.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[repeatstate1.ordinal()];
        JVM INSTR tableswitch 1 2: default 68
    //                   1 129
    //                   2 136;
           goto _L1 _L2 _L3
_L1:
        RepeatState repeatstate = RepeatState.a;
_L5:
        if (repeatstate1 != repeatstate)
        {
            if (playerstate.restrictions().disallowTogglingRepeatContextReasons().isEmpty())
            {
                player.setRepeatingContext(repeatstate.mRepeatContext);
            }
            if (playerstate.restrictions().disallowTogglingRepeatTrackReasons().isEmpty())
            {
                player.setRepeatingTrack(repeatstate.mRepeatTrack);
            }
        }
        return;
_L2:
        repeatstate = RepeatState.b;
        continue; /* Loop/switch isn't completed */
_L3:
        repeatstate = RepeatState.c;
        if (true) goto _L5; else goto _L4
_L4:
    }
}

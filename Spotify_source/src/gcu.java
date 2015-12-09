// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.cosmos.android.util.Objects;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;

public abstract class gcu
{

    PlayerState a;
    private final int b;
    private final int c;
    private boolean d;
    private Player e;
    private final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver f;

    public gcu(Player player)
    {
        this(player, 0, 0);
    }

    public gcu(Player player, int i, int j)
    {
        f = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private gcu a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                if (a.a == null || a.a(a.a, playerstate))
                {
                    a.a(playerstate);
                    a.a = playerstate;
                }
            }

            
            {
                a = gcu.this;
                super();
            }
        };
        e = (Player)ctz.a(player);
        b = i;
        c = j;
    }

    public static boolean b(PlayerState playerstate, PlayerState playerstate1)
    {
        return !Objects.equals(playerstate.entityUri(), playerstate1.entityUri());
    }

    public static boolean c(PlayerState playerstate, PlayerState playerstate1)
    {
        return playerstate.isPaused() != playerstate1.isPaused();
    }

    public void a()
    {
        if (d)
        {
            return;
        } else
        {
            d = true;
            e.registerPlayerStateObserver(f, b, c);
            return;
        }
    }

    public abstract void a(PlayerState playerstate);

    public abstract boolean a(PlayerState playerstate, PlayerState playerstate1);

    public void b()
    {
        if (!d)
        {
            return;
        } else
        {
            d = false;
            e.unregisterPlayerStateObserver(f);
            return;
        }
    }
}

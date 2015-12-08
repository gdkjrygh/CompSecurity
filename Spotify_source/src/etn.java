// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.EnumSet;
import java.util.Set;

public final class etn
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver
{

    public final etd a;
    final Flags b;
    final etk c;
    etr d;
    Player e;
    public boolean f;
    public boolean g;
    boolean h;
    eqe i;
    PlayerState j;
    boolean k;
    boolean l;
    private final ezk m;
    private ConnectButtonPresenter n;
    private final ett o;
    private boolean p;
    private ete q;
    private etu r;

    public etn(Flags flags, etr etr1, Player player, etd etd1, etp etp, eqi eqi, ezk ezk1, 
            ConnectButtonPresenter connectbuttonpresenter, etk etk1, ett ett1)
    {
        g = true;
        q = new ete() {

            private etn a;

            public final void a()
            {
                if (etn.a(a) == null)
                {
                    return;
                }
                if (etn.b(a).a())
                {
                    etn.c(a).a(etn.a(a));
                    return;
                } else
                {
                    etn.a(a, true);
                    return;
                }
            }

            public final void a(com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate, ConnectDevice connectdevice, ConnectDevice connectdevice1, EnumSet enumset)
            {
                if (etn.d(a) == null)
                {
                    return;
                }
                ett ett2 = etn.b(a);
                boolean flag1 = etn.a(connectstate);
                boolean flag;
                if (etn.a(a) != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ett2.a(flag1, flag);
                etn.e(a).a(connectstate, connectdevice, connectdevice1, enumset);
                a.a(etn.f(a));
                a.a();
            }

            
            {
                a = etn.this;
                super();
            }
        };
        r = new etu() {

            private etn a;

            public final void a()
            {
                if (etn.g(a))
                {
                    etn.a(a, false);
                    etn.c(a).a(etn.a(a));
                }
            }

            
            {
                a = etn.this;
                super();
            }
        };
        c = (etk)ctz.a(etk1);
        b = (Flags)ctz.a(flags);
        d = (etr)ctz.a(etr1);
        e = (Player)ctz.a(player);
        m = (ezk)ctz.a(ezk1);
        ctz.a(eqi);
        i = (eqe)ctz.a(eqe.a(e, null, eqi));
        a = (etd)ctz.a(etd1);
        etd1.d = q;
        ctz.a(etp);
        n = connectbuttonpresenter;
        o = ett1;
        o.a(r);
    }

    static PlayerState a(etn etn1)
    {
        return etn1.j;
    }

    static boolean a(com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate)
    {
        return connectstate == com.spotify.mobile.android.connect.ConnectManager.ConnectState.c || connectstate == com.spotify.mobile.android.connect.ConnectManager.ConnectState.d || connectstate == com.spotify.mobile.android.connect.ConnectManager.ConnectState.e;
    }

    static boolean a(etn etn1, boolean flag)
    {
        etn1.p = flag;
        return flag;
    }

    static ett b(etn etn1)
    {
        return etn1.o;
    }

    static ezk c(etn etn1)
    {
        return etn1.m;
    }

    static Player d(etn etn1)
    {
        return etn1.e;
    }

    static ConnectButtonPresenter e(etn etn1)
    {
        return etn1.n;
    }

    static PlayerTrack f(etn etn1)
    {
        if (etn1.c() != null)
        {
            return etn1.c().track();
        } else
        {
            return null;
        }
    }

    static boolean g(etn etn1)
    {
        return etn1.p;
    }

    final void a()
    {
        if (j != null)
        {
            PlayerTrack playertrack = j.track();
            if (!o.b() && o.c())
            {
                d.I();
                return;
            }
            if (playertrack != null && PlayerTrackUtil.isVideo(playertrack) && k && !l)
            {
                d.G();
                return;
            }
            if (playertrack != null)
            {
                d.H();
                return;
            }
        }
    }

    final void a(PlayerTrack playertrack)
    {
        etr etr1 = d;
        boolean flag = n.a();
        if (PlayerTrackUtil.isSuggestedTrack(playertrack))
        {
            playertrack = (new etg()).a(com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item.c, new eth((byte)0)).a;
        } else
        if (flag)
        {
            playertrack = (new etg()).a(com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule.Item.a, new eth((byte)0)).a;
        } else
        {
            playertrack = new MiniPlayerDisplayRule();
        }
        etr1.a(playertrack);
    }

    public final void b()
    {
        c.c();
        i.a();
        d.J();
    }

    final PlayerState c()
    {
        return e.getLastPlayerState();
    }

    final void d()
    {
        e.unregisterPlayerStateObserver(this);
    }

    public final void e()
    {
        if (o.a())
        {
            d.F();
            f = true;
            d.J();
        }
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        j = playerstate;
        n.a(playerstate.restrictions().disallowTransferringPlaybackReasons().isEmpty());
        if (fag.b(playerstate))
        {
            o.d();
            return;
        }
        d.a(playerstate);
        o.e();
        PlayerTrack playertrack = playerstate.track();
        if (PlayerTrackUtil.isSuggestedTrack(playertrack))
        {
            PlayerTrackUtil.isAd(playertrack);
        }
        a(playerstate.track());
        if (!fag.a(playerstate))
        {
            m.a(playerstate);
        }
        a();
    }
}

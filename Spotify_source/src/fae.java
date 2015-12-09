// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter;
import com.spotify.mobile.android.spotlets.player.notifications.PlayerNotificationType;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class fae
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, eda
{

    final eef a;
    final ezk b;
    public fai c;
    public Player d;
    eqe e;
    ConnectButtonPresenter f;
    public ezh g;
    fbo h;
    fbo i;
    fbo j;
    fbo k;
    public faz l;
    Flags m;
    boolean n;
    public boolean o;
    eeg p;
    private fbm q;
    private fcs r;
    private fbk s;
    private boolean t;
    private boolean u;
    private PlayerTrack v;
    private SessionState w;

    public fae(fai fai1, eqe eqe1, ConnectButtonPresenter connectbuttonpresenter, Player player, fbm fbm1, ezh ezh1, fcs fcs1, 
            eef eef1, ezk ezk1, faz faz1, Flags flags)
    {
        p = new eeg() {

            private fae a;

            public final void a(boolean flag)
            {
                fae.a(a, flag);
            }

            
            {
                a = fae.this;
                super();
            }
        };
        c = fai1;
        e = eqe1;
        f = connectbuttonpresenter;
        d = player;
        q = fbm1;
        g = ezh1;
        r = fcs1;
        a = eef1;
        b = ezk1;
        l = (faz)ctz.a(faz1);
        m = flags;
        a.a(p);
    }

    static boolean a(fae fae1, boolean flag)
    {
        fae1.o = flag;
        return flag;
    }

    final void a()
    {
        d.unregisterPlayerStateObserver(this);
    }

    public final void a(PlayerState playerstate)
    {
        if (playerstate.options().repeatingTrack() && playerstate.restrictions().disallowTogglingRepeatTrackReasons().isEmpty())
        {
            d.setRepeatingTrack(false);
            d.setRepeatingContext(true);
        }
    }

    public final void a(SessionState sessionstate)
    {
        w = sessionstate;
        if (j != null)
        {
            j.b().a(sessionstate);
        }
        if (h != null)
        {
            h.b().a(sessionstate);
        }
        if (i != null)
        {
            i.b().a(sessionstate);
        }
        if (k != null)
        {
            k.b().a(sessionstate);
        }
    }

    public final void a(Boolean boolean1)
    {
        for (PlayerState playerstate = d.getLastPlayerState(); playerstate == null || playerstate.track() == null || fdo.a(m);)
        {
            return;
        }

        j.f(boolean1.booleanValue());
        i.f(boolean1.booleanValue());
        h.f(boolean1.booleanValue());
        k.f(boolean1.booleanValue());
    }

    public final void a(String s1)
    {
        if (fdo.a(m))
        {
            ctz.a(c);
            c.b(s1);
        } else
        {
            a(Boolean.valueOf(true));
            ezh ezh1 = g;
            Context context = (Context)ezh1.a.get();
            if (context != null)
            {
                CollectionService.a(context, s1, ezh1.b.toString(), ezh1.c, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.c);
                fop.a(context, ezh1.b, ClientEventFactory.a("player", com.spotify.mobile.android.util.ClientEvent.SubEvent.O, null, null));
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        ctz.a(c);
        c.g(flag);
    }

    public final void b()
    {
        if (!o)
        {
            ctz.a(c);
            c.H();
        }
    }

    final PlayerState c()
    {
        return d.getLastPlayerState();
    }

    public final void onPlayerStateReceived(PlayerState playerstate)
    {
        if (!n) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        obj1 = (fai)ctz.a(c);
        if (fag.b(playerstate))
        {
            ((fai) (obj1)).H();
        }
        if (playerstate.track() == null && playerstate.isPlaying()) goto _L1; else goto _L3
_L3:
        Object obj;
label0:
        {
            obj = playerstate.track();
            Object obj3;
            boolean flag;
            boolean flag1;
            if (!cty.a(obj, v))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                r.a(PlayerNotificationType.c);
                v = ((PlayerTrack) (obj));
            }
            obj = q;
            obj3 = playerstate.track();
            if (obj3 == null)
            {
                break label0;
            }
            if (PlayerTrackUtil.isAd(((PlayerTrack) (obj3))))
            {
                if (PlayerTrackUtil.isVideo(((PlayerTrack) (obj3))))
                {
                    if (((fbm) (obj)).d == null)
                    {
                        fbl fbl1 = ((fbm) (obj)).a;
                        obj.d = new fbk(new fbg(this, fbl1.c, fbl1.a, fbl1.i), new fbu(fbl1.a, fbl1.l, fbl1.i, fbl1.e), new fbx(), new fbi(this, fbl1.a, fbl1.g, fbl1.h, fbl1.j, fbl1.m));
                    }
                    obj = ((fbm) (obj)).d;
                } else
                {
                    if (((fbm) (obj)).c == null)
                    {
                        fbl fbl2 = ((fbm) (obj)).a;
                        obj.c = new fbk(new fbr(fbl2.e), new fbu(fbl2.a, fbl2.l, fbl2.i, fbl2.e), new fbw(this, fbl2.e, fbl2.b, fbl2.k), new fbi(this, fbl2.a, fbl2.g, fbl2.h, fbl2.j, fbl2.m));
                    }
                    obj = ((fbm) (obj)).c;
                }
            } else
            {
                Object obj2 = (new SpotifyLink(((PlayerTrack) (obj3)).uri())).c;
                obj3 = ((PlayerTrack) (obj3)).metadata();
                if ("video".equals((String)((Map) (obj3)).get("media.type")))
                {
                    if (obj2 == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
                    {
                        if (((fbm) (obj)).h == null)
                        {
                            obj2 = ((fbm) (obj)).a;
                            obj.h = new fbk(new fbg(this, ((fbl) (obj2)).c, ((fbl) (obj2)).a, ((fbl) (obj2)).i), new fcp(((fbl) (obj2)).a, ((fbl) (obj2)).l, ((fbl) (obj2)).i), new fbe(this, ((fbl) (obj2)).a, ((fbl) (obj2)).b, ((fbl) (obj2)).n, ((fbl) (obj2)).k), new fbi(this, ((fbl) (obj2)).a, ((fbl) (obj2)).g, ((fbl) (obj2)).h, ((fbl) (obj2)).j, ((fbl) (obj2)).m));
                        }
                        obj = ((fbm) (obj)).h;
                    } else
                    {
                        if (((fbm) (obj)).f == null)
                        {
                            obj2 = ((fbm) (obj)).a;
                            obj.f = new fbk(new fbg(this, ((fbl) (obj2)).c, ((fbl) (obj2)).a, ((fbl) (obj2)).i), new fby(((fbl) (obj2)).a, ((fbl) (obj2)).l, ((fbl) (obj2)).i), new fbe(this, ((fbl) (obj2)).a, ((fbl) (obj2)).b, ((fbl) (obj2)).n, ((fbl) (obj2)).k), new fbi(this, ((fbl) (obj2)).a, ((fbl) (obj2)).g, ((fbl) (obj2)).h, ((fbl) (obj2)).j, ((fbl) (obj2)).m));
                        }
                        obj = ((fbm) (obj)).f;
                    }
                } else
                if (obj2 == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
                {
                    if (((fbm) (obj)).g == null)
                    {
                        fbl fbl3 = ((fbm) (obj)).a;
                        obj.g = new fbk(new fbg(this, fbl3.c, fbl3.a, fbl3.i), new fcp(fbl3.a, fbl3.l, fbl3.i), new fbe(this, fbl3.a, fbl3.b, fbl3.n, fbl3.k), new fbi(this, fbl3.a, fbl3.g, fbl3.h, fbl3.j, fbl3.m));
                    }
                    obj = ((fbm) (obj)).g;
                } else
                {
                    String s1 = (String)((Map) (obj3)).get("entity_uri");
                    if (s1 == null || !s1.startsWith("spotify:internal:running"))
                    {
                        break label0;
                    }
                    if (((fbm) (obj)).i == null)
                    {
                        fbl fbl4 = ((fbm) (obj)).a;
                        obj.i = new fbk(new fbg(this, fbl4.c, fbl4.a, fbl4.i), new fch(fbl4.a, fbl4.l, fbl4.i), new fcm(this, fbl4.a, fbl4.b, fbl4.n, fbl4.k), new fcn(this, fbl4.a, fbl4.g, fbl4.h, fbl4.j, fbl4.m));
                    }
                    obj = ((fbm) (obj)).i;
                }
            }
        }
_L4:
        if (obj == s)
        {
            j.G_().onPlayerStateReceived(playerstate);
            h.G_().onPlayerStateReceived(playerstate);
            i.G_().onPlayerStateReceived(playerstate);
            k.G_().onPlayerStateReceived(playerstate);
        } else
        {
            r.a();
            if (s != null)
            {
                ((fai) (obj1)).f(h);
                ((fai) (obj1)).e(j);
                ((fai) (obj1)).g(i);
                ((fai) (obj1)).h(k);
            }
            s = ((fbk) (obj));
            h = ((fbk) (obj)).a;
            j = ((fbk) (obj)).b;
            i = ((fbk) (obj)).c;
            k = ((fbk) (obj)).d;
            ((fai) (obj1)).b(h);
            ((fai) (obj1)).a(j);
            ((fai) (obj1)).c(i);
            ((fai) (obj1)).d(k);
            h.G_().onPlayerStateReceived(playerstate);
            j.G_().onPlayerStateReceived(playerstate);
            i.G_().onPlayerStateReceived(playerstate);
            k.G_().onPlayerStateReceived(playerstate);
            if (w != null)
            {
                h.b().a(w);
                j.b().a(w);
                i.b().a(w);
                k.b().a(w);
            }
            h.a(m);
            j.a(m);
            i.a(m);
            k.a(m);
        }
        ((fai) (obj1)).a(playerstate.track());
        if (playerstate.track() != null && flag)
        {
            obj = playerstate.track();
            obj1 = (String)((PlayerTrack) (obj)).metadata().get("media.type");
            ctz.a(c);
            flag1 = "video".equals(obj1);
            fbl fbl5;
            if (flag1)
            {
                c.f(u);
            } else
            {
                c.c(((PlayerTrack) (obj)));
            }
            u = flag1;
        }
        e.onPlayerStateReceived(playerstate);
        f.a(playerstate.restrictions().disallowTransferringPlaybackReasons().isEmpty());
        if (t != fag.a(playerstate))
        {
            boolean flag2;
            if (!t)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            t = flag2;
            if (t)
            {
                r.a(Collections.singletonList(PlayerNotificationType.c));
            } else
            {
                r.a(PlayerNotificationType.c);
            }
        }
        b.a(playerstate);
        return;
        if (gpl.f(playerstate.entityUri()) || gpl.e(playerstate.entityUri()))
        {
            if (((fbm) (obj)).e == null)
            {
                fbl5 = ((fbm) (obj)).a;
                obj.e = new fbk(new fcb(this, fbl5.a, fbl5.c, fbl5.i), new fcd(fbl5.a, fbl5.l, fbl5.i, fbl5.d, fbl5.f), new fbe(this, fbl5.a, fbl5.b, fbl5.n, fbl5.k), new fbi(this, fbl5.a, fbl5.g, fbl5.h, fbl5.j, fbl5.m));
            }
            obj = ((fbm) (obj)).e;
        } else
        {
            if (((fbm) (obj)).b == null)
            {
                fbl5 = ((fbm) (obj)).a;
                obj.b = new fbk(new fbg(this, fbl5.c, fbl5.a, fbl5.i), new fby(fbl5.a, fbl5.l, fbl5.i), new fbe(this, fbl5.a, fbl5.b, fbl5.n, fbl5.k), new fbi(this, fbl5.a, fbl5.g, fbl5.h, fbl5.j, fbl5.m));
            }
            obj = ((fbm) (obj)).b;
        }
          goto _L4
    }
}

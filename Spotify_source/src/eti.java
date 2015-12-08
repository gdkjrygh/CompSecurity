// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import com.spotify.android.paste.widget.carousel.CarouselLayoutManager;
import com.spotify.android.paste.widget.carousel.CarouselView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.connect.flags.ContextlessMiniPlayerVisibilityFlag;
import com.spotify.mobile.android.spotlets.connect.view.ConnectView;
import com.spotify.mobile.android.spotlets.miniplayer.MiniPlayerDisplayRule;
import com.spotify.mobile.android.spotlets.miniplayer.view.MiniPlayerView;
import com.spotify.mobile.android.ui.activity.DeviceActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.mobile.android.video.VideoSurfacePriority;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class eti extends Fragment
    implements eqi, etr
{

    private MiniPlayerView Y;
    private fop Z;
    public gbl a;
    private fjm aa;
    private etj ab;
    private Flags ac;
    private Resolver ad;
    private dwh ae;
    private etc af;
    private final etl ag = new etl();
    private CarouselView ah;
    private eqb ai;
    public etn b;

    public eti()
    {
        dmz.a(fos);
        Z = (fop)dmz.a(fop);
        aa = (fjm)dmz.a(fjm);
    }

    public static eti a(Flags flags)
    {
        ctz.a(flags);
        eti eti1 = new eti();
        fyw.a(eti1, flags);
        return eti1;
    }

    static etn a(eti eti1)
    {
        return eti1.b;
    }

    static fop b(eti eti1)
    {
        return eti1.Z;
    }

    static etl c(eti eti1)
    {
        return eti1.ag;
    }

    public final void A()
    {
        ab.removeMessages(0);
        b.d();
        super.A();
    }

    public final void B()
    {
        etn etn1 = b;
        etn1.d = null;
        etn1.d();
        etn1.e = null;
        ae.b();
        ae = null;
        ad.destroy();
        super.B();
    }

    public final void B_()
    {
    }

    public final void F()
    {
        Y.a(true);
        u u1 = k();
        Object obj = b;
        if (((etn) (obj)).j != null)
        {
            obj = ((etn) (obj)).j.entityUri();
        } else
        {
            obj = null;
        }
        fos.a(u1, ((String) (obj)));
    }

    public final void G()
    {
        MiniPlayerView miniplayerview = Y;
        miniplayerview.f.setVisibility(0);
        miniplayerview.e.setVisibility(8);
        miniplayerview.h.setVisibility(8);
        miniplayerview.d.setVisibility(0);
    }

    public final void H()
    {
        MiniPlayerView miniplayerview = Y;
        miniplayerview.f.setVisibility(8);
        miniplayerview.e.setVisibility(0);
        miniplayerview.h.setVisibility(8);
        miniplayerview.d.setVisibility(0);
    }

    public final void I()
    {
        MiniPlayerView miniplayerview = Y;
        miniplayerview.f.setVisibility(8);
        miniplayerview.e.setVisibility(8);
        miniplayerview.h.setVisibility(0);
        miniplayerview.d.setVisibility(8);
    }

    public final void J()
    {
        if (k() instanceof eey)
        {
            ((eey)k()).a("interacted_with_mini_player");
        }
    }

    public final void K()
    {
        a.a(true);
    }

    public final void L()
    {
        a.a(false);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Y = (MiniPlayerView)layoutinflater.inflate(0x7f030119, viewgroup, false);
        u u1 = k();
        ah = Y.a;
        af = new etc(k(), new android.view.View.OnClickListener() {

            private eti a;

            public final void onClick(View view)
            {
                eti.a(a).e();
            }

            
            {
                a = eti.this;
                super();
            }
        }, ag);
        ah.a(af);
        ai = new eqb(ac, ah, new eqc() {

            private eti a;

            public final void a()
            {
                eti.a(a).b();
            }

            public final void b()
            {
                etn etn1 = eti.a(a);
                etn1.c.d();
                etn1.i.a(true);
                etn1.d.J();
            }

            
            {
                a = eti.this;
                super();
            }
        });
        Y.i = new eue(u1) {

            private u a;
            private eti b;

            public final void a()
            {
                etn etn1 = eti.a(b);
                etn1.k = true;
                etn1.a();
            }

            public final void a(boolean flag1)
            {
                eti.a(b).l = flag1;
            }

            public final void b()
            {
                etn etn1 = eti.a(b);
                etn1.k = false;
                etn1.a();
            }

            public final void c()
            {
                eti.b(b);
                fop.a(a, ViewUri.L, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ab));
                etn etn1 = eti.a(b);
                etn1.c.b();
                etn1.i.b();
                etn1.d.J();
            }

            public final void d()
            {
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ac);
                Object obj = eti.a(b).c();
                boolean flag1;
                if (obj != null && PlayerTrackUtil.isSuggestedTrack(((PlayerState) (obj)).track()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    obj = "true";
                } else
                {
                    obj = "false";
                }
                clientevent.a("suggested_track", ((String) (obj)));
                eti.b(b);
                fop.a(a, ViewUri.L, clientevent);
                eti.a(b).b();
            }

            public final void e()
            {
                eti.a(b).e();
            }

            public final void f()
            {
                eti.a(b).e();
            }

            public final void g()
            {
                etn etn1 = eti.a(b);
                etn1.d.a();
                etn1.d.J();
            }

            
            {
                b = eti.this;
                a = u1;
                super();
            }
        };
        etd etd1 = new etd(ae);
        ezk ezk1 = new ezk(u1, ae, ac, aa, Y);
        etb etb1 = new etb(u1, (fop)dmz.a(fop));
        new eto();
        Flags flags = ac;
        viewgroup = ad;
        layoutinflater = new eri(new ezj[] {
            ag, new ero(Y.h, 1)
        });
        Player player = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(viewgroup, ViewUri.L.toString(), FeatureIdentifier.aA, FeatureIdentifier.aA);
        boolean flag;
        if (((Boolean)flags.a(fys.aC)).booleanValue())
        {
            layoutinflater = new erk(layoutinflater);
        } else
        {
            layoutinflater = new ezi(layoutinflater);
        }
        if ((ContextlessMiniPlayerVisibilityFlag)flags.a(fys.aE) == ContextlessMiniPlayerVisibilityFlag.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            viewgroup = new etw(this, etb1);
        } else
        {
            viewgroup = new etv(this, etb1);
        }
        new faq(u1);
        b = new etn(flags, this, player, etd1, new etp(), this, ezk1, layoutinflater, etb1, viewgroup);
        layoutinflater = b;
        if (bundle != null)
        {
            viewgroup = ((etn) (layoutinflater)).a;
            if (bundle != null)
            {
                viewgroup.c = bundle.getBoolean("key_device_discovery_requested");
            }
            layoutinflater.g = bundle.getBoolean("key_was_in_background");
            layoutinflater.h = bundle.getBoolean("key_connect_available_shown");
            layoutinflater.j = (PlayerState)bundle.getParcelable("key_last_state");
            if (((etn) (layoutinflater)).j != null)
            {
                layoutinflater.onPlayerStateReceived(((etn) (layoutinflater)).j);
            }
        }
        return Y;
    }

    public final void a()
    {
        a(DeviceActivity.a(k(), com.spotify.mobile.android.util.ClientEvent.SubEvent.am));
    }

    public final void a(long l)
    {
    }

    public final void a(long l, long l1, float f)
    {
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
        }
        ad = Cosmos.getResolver(k());
        ac = fyw.a(this);
        ae = new dwh(k().getApplicationContext());
        ab = new etj(this);
    }

    public final void a(PlayerState playerstate)
    {
        MiniPlayerView miniplayerview = Y;
        boolean flag = playerstate.restrictions().disallowSkippingNextReasons().isEmpty();
        boolean flag1 = MiniPlayerView.a(playerstate);
        boolean flag2 = playerstate.restrictions().disallowSkippingPrevReasons().contains("mft_disallow");
        boolean flag3 = playerstate.restrictions().disallowSkippingNextReasons().contains("mft_disallow");
        Object obj = (CarouselLayoutManager)miniplayerview.a.d();
        ((CarouselLayoutManager) (obj)).a(flag2);
        ((CarouselLayoutManager) (obj)).b(flag3);
        obj = miniplayerview.l;
        long l1 = playerstate.currentPlaybackPosition();
        long l = playerstate.duration();
        if (playerstate.playbackSpeed() == 0.0F)
        {
            l = l1;
        }
        ((eqh) (obj)).a.setMax((int)playerstate.duration());
        ((eqh) (obj)).a(l1, l, playerstate.playbackSpeed());
        byte byte0;
        if (playerstate.isPaused())
        {
            miniplayerview.b.setImageDrawable(fyd.a(miniplayerview.getContext(), 16, 1));
            miniplayerview.b.setContentDescription(miniplayerview.getContext().getString(0x7f0803ec));
        } else
        {
            miniplayerview.b.setImageDrawable(fyd.b(miniplayerview.getContext(), 16, 1));
            miniplayerview.b.setContentDescription(miniplayerview.getContext().getString(0x7f0803eb));
        }
        miniplayerview.setEnabled(true);
        obj = miniplayerview.b;
        if (flag1)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((ImageButton) (obj)).setVisibility(byte0);
        if (ggi.c(miniplayerview.getContext()))
        {
            Object obj1 = miniplayerview.c;
            if (flag1)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            ((ImageButton) (obj1)).setVisibility(byte0);
            miniplayerview.c.setEnabled(flag);
            if (flag3)
            {
                miniplayerview.c.setEnabled(true);
                obj1 = fyd.d(miniplayerview.getContext());
            } else
            {
                obj1 = fyd.c(miniplayerview.getContext());
            }
            miniplayerview.c.setImageDrawable(((android.graphics.drawable.Drawable) (obj1)));
        }
        obj1 = dto.a(ezr.a(playerstate.track(), "image_url"));
        miniplayerview.k.a(((android.net.Uri) (obj1)));
        flag = fag.a(playerstate);
        flag1 = PlayerTrackUtil.hasIncompleteMetadata(playerstate.track());
        if (flag || flag1)
        {
            playerstate = af;
            playerstate.a(null, ((etc) (playerstate)).d, null);
            ah.a(0);
            return;
        } else
        {
            ai.a(playerstate.reverse(), playerstate.track(), playerstate.future());
            return;
        }
    }

    public final void a(MiniPlayerDisplayRule miniplayerdisplayrule)
    {
        etl etl1 = ag;
        ctz.a(miniplayerdisplayrule);
        for (Iterator iterator = etl1.b.iterator(); iterator.hasNext(); ((etm)iterator.next()).a(miniplayerdisplayrule)) { }
        etl1.a = miniplayerdisplayrule;
        boolean flag;
        if (miniplayerdisplayrule.a.size() > 1 || miniplayerdisplayrule.a.size() == 1 && ((eth)((ho)miniplayerdisplayrule.a.get(0)).b).a != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            ab.removeMessages(0);
            ab.sendEmptyMessageDelayed(0, 5000L);
        }
    }

    public final void a_(boolean flag)
    {
    }

    public final void b()
    {
    }

    public final void b_(boolean flag)
    {
    }

    public final void c()
    {
        super.c();
        ad.connect();
        Y.a(false);
        Object obj = b;
        if (((Boolean)((etn) (obj)).b.a(fys.k)).booleanValue())
        {
            obj.h = false;
            obj = ((etn) (obj)).a;
            ((etd) (obj)).b.a(((dwk) (obj)));
            ((etd) (obj)).b.a();
        }
        obj = Y;
        ((MiniPlayerView) (obj)).f.a(VideoSurfacePriority.a);
        ((MiniPlayerView) (obj)).f.d = ((MiniPlayerView) (obj)).j;
        ((MiniPlayerView) (obj)).g.a(((MiniPlayerView) (obj)).f);
    }

    public final void c(boolean flag)
    {
    }

    public final void d()
    {
        super.d();
        Object obj = b.a;
        ((etd) (obj)).b.b(((dwk) (obj)));
        ((etd) (obj)).a.clear();
        if (((etd) (obj)).b.c())
        {
            ((ConnectManager)((etd) (obj)).b.f()).b(((etd) (obj)).e);
            ((etd) (obj)).b.b();
        }
        obj = Y;
        ((MiniPlayerView) (obj)).g.b(((MiniPlayerView) (obj)).f);
        ((MiniPlayerView) (obj)).f.d = null;
        Y.l.a();
        ad.disconnect();
    }

    public final void d(boolean flag)
    {
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        etn etn1 = b;
        bundle.putBoolean("key_device_discovery_requested", etn1.a.c);
        bundle.putBoolean("key_was_in_background", etn1.g);
        bundle.putBoolean("key_connect_available_shown", etn1.h);
        bundle.putParcelable("key_last_state", etn1.j);
    }

    public final void e(boolean flag)
    {
    }

    public final void z()
    {
        super.z();
        etn etn1 = b;
        etn1.e.registerPlayerStateObserver(etn1, 2, 2);
        if (etn1.g)
        {
            etn1.a.a();
        }
    }
}

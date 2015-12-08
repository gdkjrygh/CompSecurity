// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.spotlets.connect.Tech;
import com.spotify.mobile.android.spotlets.connect.view.ConnectButtonPresenter;
import com.spotify.mobile.android.spotlets.connect.view.ConnectView;
import com.spotify.mobile.android.spotlets.player.NewPlayQueueActivity;
import com.spotify.mobile.android.spotlets.player.NewPlayerViews;
import com.spotify.mobile.android.spotlets.playlist.activity.AddToPlaylistActivity;
import com.spotify.mobile.android.spotlets.videoplayer.FullScreenSwitchHelper;
import com.spotify.mobile.android.ui.activity.DeviceActivity;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.CancellableSeekBar;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class ezw extends Fragment
    implements eqf, eqi, fai, fot
{

    private static final long a;
    private Resolver Y;
    private fae Z;
    private NewPlayerViews aa;
    private edb ab;
    private String ac;
    private Flags ad;
    private ViewGroup ae;
    private ViewGroup af;
    private ViewGroup ag;
    private ViewGroup ah;
    private View ai;
    private fal aj;
    private fcs ak;
    private FullScreenSwitchHelper al;
    private fjm am;
    private dwh an;
    private dwk ao;
    private dkz ap;
    private ezk aq;
    private ezy b;

    public ezw()
    {
        am = (fjm)dmz.a(fjm);
        ao = new dwk() {

            private ezw a;

            public final void a(Object obj)
            {
                ((ConnectManager)ezw.b(a).f()).a(ezw.a(a));
                ((ConnectManager)ezw.b(a).f()).g();
            }

            public final void b()
            {
            }

            
            {
                a = ezw.this;
                super();
            }
        };
        ap = new dkz() {

            private ezw a;

            public final void a()
            {
                fae fae1 = ezw.c(a);
                com.spotify.mobile.android.cosmos.player.v2.PlayerState playerstate = fae1.c();
                if (playerstate != null)
                {
                    fae1.b.a(playerstate);
                }
            }

            public final void a(List list, com.spotify.mobile.android.connect.ConnectManager.ConnectState connectstate)
            {
                fae fae1 = ezw.c(a);
                com.spotify.mobile.android.service.ConnectDevice connectdevice = ((ConnectManager)ezw.b(a).f()).d();
                com.spotify.mobile.android.service.ConnectDevice connectdevice1 = ((ConnectManager)ezw.b(a).f()).e();
                list = Tech.a(list);
                fae1.f.a(connectstate, connectdevice, connectdevice1, list);
            }

            
            {
                a = ezw.this;
                super();
            }
        };
    }

    public static Fragment a(Flags flags, String s)
    {
        ctz.a(flags);
        Bundle bundle = new Bundle();
        bundle.putString("from_entity_uri", s);
        s = new ezw();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static dkz a(ezw ezw1)
    {
        return ezw1.ap;
    }

    static dwh b(ezw ezw1)
    {
        return ezw1.an;
    }

    static fae c(ezw ezw1)
    {
        return ezw1.Z;
    }

    static View d(ezw ezw1)
    {
        return ezw1.ai;
    }

    static fjm e(ezw ezw1)
    {
        return ezw1.am;
    }

    static Flags f(ezw ezw1)
    {
        return ezw1.ad;
    }

    public final void A()
    {
        ab.b(Z);
        super.A();
        fal fal1 = aj;
        Context context = (Context)fal1.a.get();
        if (context != null)
        {
            context.unregisterReceiver(fal1.c);
        }
        Z.b.a = false;
    }

    public final void B()
    {
        fae fae1 = Z;
        ctz.a(fae1.c);
        fae1.n = true;
        fae1.a.b(fae1.p);
        fae1.e = null;
        fae1.f = null;
        fae1.c.e(fae1.j);
        fae1.c.f(fae1.h);
        fae1.c.g(fae1.i);
        fae1.c.h(fae1.k);
        fae1.a();
        fae1.c = null;
        fae1.d = null;
        Y.destroy();
        ak.a();
        super.B();
    }

    public final void B_()
    {
        u u1 = k();
        if (u1 != null)
        {
            dmz.a(frb);
            frb.a(ad, Reason.c, null, null).a(u1);
        }
    }

    public final boolean C_()
    {
        Z.b();
        return true;
    }

    public final void F()
    {
        ai.postDelayed(new Runnable() {

            final ezw a;

            public final void run()
            {
                if (ezw.d(a).getVisibility() == 0)
                {
                    fjq fjq1 = new fjq();
                    fjq1.a = new android.view.View.OnClickListener(this) {

                        private _cls5 a;

                        public final void onClick(View view)
                        {
                            ezw.c(a.a).b.a = false;
                        }

            
            {
                a = _pcls5;
                super();
            }
                    };
                    fjq1.a(new fjt(this) {

                        private _cls5 a;

                        public final void a()
                        {
                            ezw.c(a.a).b.a = false;
                        }

            
            {
                a = _pcls5;
                super();
            }
                    });
                    ezw.e(a);
                    fjn fjn1 = fjm.a(a.k());
                    fjn1.a = com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type.e;
                    fjn1.d = fjq1;
                    fjn1.a(ezw.d(a));
                }
            }

            
            {
                a = ezw.this;
                super();
            }
        }, a);
    }

    public final void G()
    {
        u u1 = k();
        Intent intent = new Intent(u1, com/spotify/mobile/android/spotlets/player/NewPlayQueueActivity);
        fyw.a(intent, ad);
        gnl.a(intent, FeatureIdentifier.I);
        u1.startActivity(intent);
    }

    public final void H()
    {
        k().finish();
    }

    public final void I()
    {
        a(DeviceActivity.a(k(), com.spotify.mobile.android.util.ClientEvent.SubEvent.an));
    }

    public final void J()
    {
        flo flo1 = flo.a(k()).b();
        flo1.a = true;
        flo1.a(FeatureIdentifier.I);
    }

    public final void K()
    {
        flo flo1 = flo.a(k()).b();
        flo1.b = false;
        flo1.a(FeatureIdentifier.I);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ad = fyw.a(this);
        layoutinflater = (NewPlayerViews)layoutinflater.inflate(0x7f030113, viewgroup, false);
        if (gfv.b(k()))
        {
            layoutinflater.getRootView().setPadding(0, gfv.c(k()), 0, 0);
        }
        ae = (ViewGroup)layoutinflater.findViewById(0x7f110494);
        af = (ViewGroup)layoutinflater.findViewById(0x7f110492);
        ag = (ViewGroup)layoutinflater.findViewById(0x7f110493);
        ah = (ViewGroup)layoutinflater.findViewById(0x7f110491);
        ai = layoutinflater.findViewById(0x7f110328);
        viewgroup = new android.view.View.OnClickListener() {

            private ezw a;

            public final void onClick(View view)
            {
                view = ezw.c(a);
                ctz.a(((fae) (view)).c);
                ((fae) (view)).c.I();
            }

            
            {
                a = ezw.this;
                super();
            }
        };
        ((NewPlayerViews) (layoutinflater)).b.setOnClickListener(viewgroup);
        viewgroup = new gak() {

            private ezw a;

            public final void a(SeekBar seekbar)
            {
            }

            public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
            {
            }

            public final void onStartTrackingTouch(SeekBar seekbar)
            {
            }

            public final void onStopTrackingTouch(SeekBar seekbar)
            {
                int i = seekbar.getProgress();
                seekbar = ezw.c(a);
                long l = i;
                ((fae) (seekbar)).e.a(l);
            }

            
            {
                a = ezw.this;
                super();
            }
        };
        ctz.a(((NewPlayerViews) (layoutinflater)).a);
        ((NewPlayerViews) (layoutinflater)).d.a = viewgroup;
        aa = layoutinflater;
        ak = new fcs(k(), layoutinflater);
        aq = new ezk(k(), an, ad, am, ai);
        return layoutinflater;
    }

    public final void a(long l)
    {
        NewPlayerViews newplayerviews = aa;
        long l1 = Math.min(0x7fffffffL, l);
        newplayerviews.a.setMax((int)l1);
        newplayerviews.a.refreshDrawableState();
        CharSequence charsequence = NewPlayerViews.a((int)(l / 1000L));
        newplayerviews.c.setText(charsequence);
    }

    public final void a(long l, long l1, float f1)
    {
        aa.a(l, l1, f1);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        u u1 = k();
        an = new dwh(u1);
        ab = edb.a(u1);
        ac = g().getString("from_entity_uri");
        Y = Cosmos.getResolver(u1);
        b = new ezy(k(), (fop)dmz.a(fop));
        al = FullScreenSwitchHelper.a(bundle);
        al.a(u1, FeatureIdentifier.I);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        dmz.a(faf);
        view = k();
        bundle = new ezh(view, Y, ViewUri.M, ad);
        Object obj = new ezn(view, Y);
        fcg fcg1 = new fcg(view);
        fbp fbp1 = new fbp();
        aj = new fal(view);
        Z = faf.a(Y, this, bundle, ((ezn) (obj)), fcg1, fbp1, ak, ad, aj, this, new erp(aa.b), this, aq, b);
        bundle = Z;
        obj = ad;
        bundle.m = (Flags)ctz.a(obj);
        if (((fae) (bundle)).h != null)
        {
            ((fae) (bundle)).h.a(((Flags) (obj)));
        }
        if (((fae) (bundle)).j != null)
        {
            ((fae) (bundle)).j.a(((Flags) (obj)));
        }
        if (((fae) (bundle)).i != null)
        {
            ((fae) (bundle)).i.a(((Flags) (obj)));
        }
        if (((fae) (bundle)).k != null)
        {
            ((fae) (bundle)).k.a(((Flags) (obj)));
        }
        new ezx();
        boolean flag = view.getIntent().getBooleanExtra("onboarding_flow_enabled", false);
        aq.a = flag;
    }

    public final void a(PlayerTrack playertrack)
    {
        al.a = PlayerTrackUtil.isVideo(playertrack);
        NewPlayerViews newplayerviews = aa;
        if (playertrack != null)
        {
            newplayerviews.setVisibility(0);
            return;
        } else
        {
            newplayerviews.setVisibility(8);
            return;
        }
    }

    public final void a(fbo fbo1)
    {
        fbo1.a(b(((Bundle) (null))), ae);
    }

    public final void a(String s)
    {
        if (TextUtils.equals(s, ac))
        {
            k().finish();
            return;
        } else
        {
            s = gms.a(k(), s).a;
            s.putExtra("force_navigation_key", true);
            a(((Intent) (s)));
            k().finish();
            return;
        }
    }

    public final void a_(boolean flag)
    {
    }

    public final void b()
    {
        u u1 = k();
        if (u1 != null)
        {
            dmz.a(frb);
            frb.a(ad, Reason.d, null, null).a(u1);
        }
    }

    public final void b(PlayerTrack playertrack)
    {
        u u1 = k();
        fud.a(u1, new fuj(u1) {

            final ezw a;
            private u b;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (PlayerTrack)obj;
                Object obj1 = (new SpotifyLink(((PlayerTrack) (obj)).uri())).c;
                String s = (String)((PlayerTrack) (obj)).metadata().get("title");
                fxe fxe = new fxe(this) {

                    private _cls6 b;

                    public final void a(com.spotify.mobile.android.util.ClientEvent.Event event)
                    {
                        if (event == com.spotify.mobile.android.util.ClientEvent.Event.K)
                        {
                            ezw.c(b.a).a(Boolean.valueOf(true));
                        } else
                        {
                            if (event == com.spotify.mobile.android.util.ClientEvent.Event.M)
                            {
                                ezw.c(b.a).a(Boolean.valueOf(false));
                                return;
                            }
                            if (event == com.spotify.mobile.android.util.ClientEvent.Event.L)
                            {
                                ezw.c(b.a).a(null);
                                return;
                            }
                        }
                    }

            
            {
                b = _pcls6;
                super();
            }
                };
                if (obj1 == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
                {
                    fve.a(b).e(((PlayerTrack) (obj)).uri(), s).a("video".equals(((PlayerTrack) (obj)).metadata().get("media.type"))).a(ViewUri.K).b(true).d(fiy.a(ezw.f(a))).e(fiy.d(ezw.f(a))).f(false).a(ezw.f(a)).a(fxe).a(spotifycontextmenu);
                    return;
                }
                obj1 = fve.a(b).a(((PlayerTrack) (obj)).uri(), s).a(ViewUri.K);
                boolean flag;
                if (!TextUtils.isEmpty((CharSequence)((PlayerTrack) (obj)).metadata().get("album_uri")))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = ((fww) (obj1)).a(flag);
                if (!TextUtils.isEmpty((CharSequence)((PlayerTrack) (obj)).metadata().get("artist_uri")))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((fwx) (obj1)).a(flag).a(true).a(false, null).a(ezw.f(a)).a(fxe).a(spotifycontextmenu);
            }

            
            {
                a = ezw.this;
                b = u1;
                super();
            }
        }, playertrack);
    }

    public final void b(fbo fbo1)
    {
        fbo1.a(b(((Bundle) (null))), af);
    }

    public final void b(String s)
    {
        a(AddToPlaylistActivity.a(k(), s, null, ad, ViewUri.M, com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction.b));
    }

    public final void b_(boolean flag)
    {
    }

    public final void c()
    {
        super.c();
        Y.connect();
        an.a(ao);
        an.a();
        fae fae1 = Z;
        fae1.d.registerPlayerStateObserver(fae1, 2, 2);
        fae1.d.fetchState(fae1);
    }

    public final void c(PlayerTrack playertrack)
    {
        NewPlayerViews newplayerviews = aa;
        playertrack = dto.a((String)playertrack.metadata().get("image_url"));
        newplayerviews.f.a(playertrack);
    }

    public final void c(fbo fbo1)
    {
        fbo1.a(b(((Bundle) (null))), ag);
    }

    public final void c(boolean flag)
    {
    }

    public final void d()
    {
        super.d();
        an.b(ao);
        if (an.c())
        {
            ((ConnectManager)an.f()).b(ap);
            an.b();
        }
        Z.a();
        Y.disconnect();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ab = edb.a(k());
    }

    public final void d(fbo fbo1)
    {
        fbo1.a(b(((Bundle) (null))), ah);
    }

    public final void d(boolean flag)
    {
    }

    public final void e()
    {
        if (aa != null)
        {
            aa.e.a();
        }
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        com.spotify.mobile.android.cosmos.player.v2.PlayerState playerstate = Z.c();
        al.a(bundle, k(), playerstate);
    }

    public final void e(fbo fbo1)
    {
        if (fbo1 == null)
        {
            return;
        } else
        {
            fbo1.a(ae);
            return;
        }
    }

    public final void e(boolean flag)
    {
        NewPlayerViews newplayerviews = aa;
        ctz.a(newplayerviews.a);
        newplayerviews.a.setEnabled(flag);
    }

    public final void f(fbo fbo1)
    {
        if (fbo1 == null)
        {
            return;
        } else
        {
            fbo1.a(af);
            return;
        }
    }

    public final void f(boolean flag)
    {
        Object obj = aa.f;
        dfs dfs1 = ((fad) (obj)).b;
        obj = ((fad) (obj)).a;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dfs1.a(((android.graphics.drawable.Drawable) (obj)), flag);
    }

    public final void g(fbo fbo1)
    {
        if (fbo1 == null)
        {
            return;
        } else
        {
            fbo1.a(ag);
            return;
        }
    }

    public final void g(boolean flag)
    {
        NewPlayerViews newplayerviews = aa;
        View view = newplayerviews.findViewById(0x7f1103fb);
        if (view != null)
        {
            if (!flag)
            {
                view.setVisibility(8);
            } else
            if (newplayerviews.getVisibility() == 0)
            {
                view.setVisibility(0);
                return;
            }
        }
    }

    public final void h(fbo fbo1)
    {
        if (fbo1 == null)
        {
            return;
        } else
        {
            fbo1.a(ah);
            return;
        }
    }

    public final void z()
    {
        super.z();
        ab.a(Z);
        Object obj = aj;
        Context context = (Context)((fal) (obj)).a.get();
        if (context != null)
        {
            dmz.a(far);
            faq faq1 = far.a(context);
            if (((fal) (obj)).b != null)
            {
                if (faq1.b())
                {
                    ((fal) (obj)).b.a(faq1);
                } else
                {
                    ((fal) (obj)).a();
                }
            }
            obj.c = new fam(((fal) (obj)));
            context.registerReceiver(((fal) (obj)).c, new IntentFilter("sleep_timer_cancelled"));
        }
        obj = Z;
        if (((fae) (obj)).h != null)
        {
            ((fae) (obj)).h.g();
        }
        if (((fae) (obj)).b.a)
        {
            ctz.a(((fae) (obj)).c);
            ((fae) (obj)).c.F();
        }
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(1L);
    }
}

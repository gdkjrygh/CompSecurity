// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.findfriends.FindFriendsActivity;
import com.spotify.mobile.android.spotlets.socialchart.model.AlbumModel;
import com.spotify.mobile.android.spotlets.socialchart.model.ArtistModel;
import com.spotify.mobile.android.spotlets.socialchart.model.SocialChartResponseModel;
import com.spotify.mobile.android.spotlets.socialchart.model.TrackModel;
import com.spotify.mobile.android.spotlets.socialchart.model.UserModel;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;
import java.util.Map;

public final class fjd extends al
    implements NavigationItem, fxy, gck
{

    private static TrackModel Y[] = new TrackModel[0];
    private Handler Z;
    private Resolver aa;
    private gbv ab;
    private fjh ac;
    private Player ad;
    private dja ae;
    private View af;
    private LoadingView ag;
    private ggl ah;
    private EmptyView ai;
    private fjg aj;
    private ContentViewManager ak;
    private Parcelable al;
    private fjj am;
    private boolean an;
    private boolean ao;
    private boolean ap;
    private Flags aq;
    private gjf ar;
    private MenuItem as;
    private final fuj at = new fuj() {

        private fjd a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (TrackModel)obj;
            Object obj1 = fve.a(a.k()).a(((TrackModel) (obj)).getTrackUri(), ((TrackModel) (obj)).getTrackName()).a(ViewUri.o).a(true).a(true).a(true).a(false, null).a(fjd.a(a));
            obj1.j = Optional.b(((TrackModel) (obj)).getInfluencers());
            obj1 = new fxb(((fwv) (obj1)), (byte)0);
            int j = ((TrackModel) (obj)).getRank();
            ((fxb) (obj1)).a.k = j - 1;
            ((fxb) (obj1)).a.a(spotifycontextmenu);
        }

            
            {
                a = fjd.this;
                super();
            }
    };
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver au;
    private final ekv av = new ekv();
    protected SocialChartResponseModel b;

    public fjd()
    {
        ao = true;
        au = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private fjd a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                playerstate = playerstate.track();
                if (playerstate != null)
                {
                    playerstate = playerstate.uri();
                } else
                {
                    playerstate = "";
                }
                fjd.b(a).a(playerstate);
            }

            
            {
                a = fjd.this;
                super();
            }
        };
    }

    private void K()
    {
        af.setOnClickListener(new android.view.View.OnClickListener() {

            private fjd a;

            public final void onClick(View view)
            {
                fjd.d(a);
                view = fjd.e(a);
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.U);
                fop.a(((fjj) (view)).a, ViewUri.o, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
            }

            
            {
                a = fjd.this;
                super();
            }
        });
    }

    static Flags a(fjd fjd1)
    {
        return fjd1.aq;
    }

    public static fjd a(Flags flags)
    {
        fjd fjd1 = new fjd();
        fyw.a(fjd1, flags);
        return fjd1;
    }

    private void a(SocialChartResponseModel socialchartresponsemodel)
    {
        ctz.a(socialchartresponsemodel);
        ag.b();
        ak.a(false);
        Object obj = socialchartresponsemodel.getUserModel().getTrackModels();
        ac.clear();
        if (obj.length == 0)
        {
            socialchartresponsemodel = am;
            obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.cb);
            fop.a(((fjj) (socialchartresponsemodel)).a, ViewUri.o, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ((ClientEvent) (obj)));
            ak.d(true);
            return;
        }
        Object obj1;
        int j;
        int k;
        if (ggi.b(k()) && af != null)
        {
            af.setVisibility(0);
        } else
        {
            ae.c(af);
        }
        obj1 = k().getString(0x7f08051b);
        ((djr)ae.a()).a(((CharSequence) (obj1)));
        ((djr)ae.a()).b(l().getString(0x7f08051a));
        ((djr)ae.a()).a().setGravity(17);
        ae.e().a(true);
        dmz.a(gjj);
        obj1 = gjj.a(k());
        ((gji) (obj1)).a(ae.c(), "https://i.scdn.co/image/11643b781401fb007ecf46ae98e83a0013a1697f", dff.e(((gji) (obj1)).a), null);
        ((gji) (obj1)).a(ae.d(), "https://i.scdn.co/image/11643b781401fb007ecf46ae98e83a0013a1697f");
        if (aj == null)
        {
            aj = new fjg(k(), socialchartresponsemodel.getUserModel());
            ae.b(aj.a);
        }
        ac.addAll(((Object []) (obj)));
        if (ap)
        {
            ae.e().a().setAdapter(ac);
            ae.e().a().setFooterDividersEnabled(false);
            ae.e().a().setHeaderDividersEnabled(false);
        } else
        {
            ftg ftg1 = new ftg(k());
            ftg1.a(ac, 0x7f08046d, 0);
            ae.e().a().setAdapter(ftg1);
        }
        k = obj.length;
        j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    TrackModel trackmodel = obj[j];
                    String s = av.a;
                    if (!s.equals(trackmodel.getTrackUri()))
                    {
                        break label0;
                    }
                    ac.a(s);
                }
                if (b != null && b.equals(socialchartresponsemodel) && al != null)
                {
                    z_().onRestoreInstanceState(al);
                }
                socialchartresponsemodel = am;
                j = obj.length;
                obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.ca);
                ((ClientEvent) (obj)).a("chart-size", String.valueOf(j));
                fop.a(((fjj) (socialchartresponsemodel)).a, ViewUri.o, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ((ClientEvent) (obj)));
                ak.b(null);
                return;
            }
            j++;
        } while (true);
    }

    static void a(fjd fjd1, SocialChartResponseModel socialchartresponsemodel)
    {
        fjd1.a(socialchartresponsemodel);
    }

    private void a(boolean flag, int j)
    {
        int l = b.getUserModel().getTracksUriList().size();
        PlayerTrack aplayertrack[] = new PlayerTrack[l];
        int k = 0;
        while (k < l) 
        {
            String s1 = (String)b.getUserModel().getTracksUriList().get(k);
            Object obj1 = b.getUserModel().getTrackModels()[k];
            String s;
            if (((TrackModel) (obj1)).getAlbum() != null)
            {
                s = ((TrackModel) (obj1)).getAlbum().getUri();
            } else
            {
                s = "";
            }
            if (((TrackModel) (obj1)).getArtists().length > 0 && ((TrackModel) (obj1)).getArtists()[0] != null)
            {
                obj1 = ((TrackModel) (obj1)).getArtists()[0].getUri();
            } else
            {
                obj1 = "";
            }
            aplayertrack[k] = PlayerTrack.create(s1, s, ((String) (obj1)));
            k++;
        }
        Object obj = Maps.b();
        ((Map) (obj)).put("context_description", k().getString(0x7f08051b));
        ((Map) (obj)).put("image_url", "https://i.scdn.co/image/11643b781401fb007ecf46ae98e83a0013a1697f");
        PlayerContext playercontext = PlayerContext.create("spotify:internal:social-chart", aplayertrack, ((Map) (obj)));
        obj = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).playerOptionsOverride(flag, false, false);
        if (flag)
        {
            obj = ((com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder) (obj)).build();
        } else
        {
            obj = ((com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder) (obj)).skipToIndex(0, j).build();
        }
        ad.play(playercontext, ((com.spotify.mobile.android.cosmos.player.v2.PlayOptions) (obj)));
    }

    static fjh b(fjd fjd1)
    {
        return fjd1.ac;
    }

    static boolean c(fjd fjd1)
    {
        fjd1.ao = false;
        return false;
    }

    static void d(fjd fjd1)
    {
        fjd1.a(true, 0);
    }

    static fjj e(fjd fjd1)
    {
        return fjd1.am;
    }

    static LoadingView f(fjd fjd1)
    {
        return fjd1.ag;
    }

    static gjf g(fjd fjd1)
    {
        return fjd1.ar;
    }

    static boolean h(fjd fjd1)
    {
        return fjd1.an;
    }

    static ContentViewManager i(fjd fjd1)
    {
        return fjd1.ak;
    }

    public final void A()
    {
        super.A();
        ah.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.f;
    }

    public final void B()
    {
        super.B();
        aa.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return k().getString(0x7f08051b);
    }

    protected final void J()
    {
        if (k() == null)
        {
            return;
        } else
        {
            k().startActivity(FindFriendsActivity.a(k(), aq));
            k().overridePendingTransition(0x7f040017, 0x7f040016);
            return;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aq = fyw.a(this);
        ap = gex.a(aq);
        ac = new fjh(k(), Y, ap, at, am);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ac.a(bundle.getString("track"));
        }
        viewgroup = new FrameLayout(k());
        viewgroup.setBackgroundColor(dgo.b(k(), 0x1010054));
        viewgroup.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        if (ggi.b(k()))
        {
            ae = dja.b(k()).b().b().a(this);
        } else
        {
            af = gad.a(k(), null);
            K();
            ae = dja.a(k()).b().b().a(true).a(this);
        }
        ae.e().a().setFastScrollEnabled(true);
        bundle = ae.b();
        bundle.setVisibility(4);
        viewgroup.addView(bundle);
        ag = LoadingView.a(layoutinflater, k(), bundle);
        viewgroup.addView(ag);
        ai = new EmptyView(k());
        viewgroup.addView(ai);
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08051b);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        am = new fjj(k());
        a(true);
        Z = new Handler(k().getMainLooper());
        aa = Cosmos.getResolver(k());
        ab = new gbv();
        ah = ggn.a(k(), ViewUri.o);
        ar = gjf.a(k(), ViewUri.o.toString());
        ar.c(bundle);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        if (!ggi.b(k())) goto _L2; else goto _L1
_L1:
        menuinflater = ViewUri.o;
        af = fzr.a(k(), menu, menuinflater, FeatureIdentifier.D, gnl.a(this), null);
        if (b != null) goto _L4; else goto _L3
_L3:
        af.setVisibility(8);
_L6:
        K();
_L2:
        menuinflater = new dfz(k(), SpotifyIcon.aT);
        menuinflater.a(dft.b(24F, k().getResources()));
        as = menu.add(0, 0x7f110007, 0, k().getString(0x7f0802e1)).setIcon(menuinflater).setOnMenuItemClickListener(new android.view.MenuItem.OnMenuItemClickListener() {

            private fjd a;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                a.J();
                fjd.c(a);
                return true;
            }

            
            {
                a = fjd.this;
                super();
            }
        });
        ji.a(as, 1);
        as.setVisible(an);
        return;
_L4:
        if (b.isEmpty())
        {
            af.setVisibility(8);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(View view, Bundle bundle)
    {
        view = (new gaa(k(), ai, ae.e().a())).b(SpotifyIcon.aC, 0x7f080518, 0x7f080516).b(0x7f080515, 0x7f080514).a(0x7f0802ad, 0x7f080519);
        view.a = new gab() {

            final fjd a;

            public final void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
            {
                if (contentstate == com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.d)
                {
                    contentstate = dgp.b(a.k(), null);
                    contentstate.setId(0x7f110022);
                    contentstate.setText(0x7f080517);
                    contentstate.setSingleLine(true);
                    contentstate.setOnClickListener(new android.view.View.OnClickListener(this) {

                        private _cls5 a;

                        public final void onClick(View view)
                        {
                            fjd.c(a.a);
                            a.a.J();
                        }

            
            {
                a = _pcls5;
                super();
            }
                    });
                    emptyview.a(contentstate);
                    return;
                } else
                {
                    emptyview.a(null);
                    return;
                }
            }

            
            {
                a = fjd.this;
                super();
            }
        };
        ak = view.a();
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            al = bundle.getParcelable("com.spotify.social_chart.state.list");
            b = (SocialChartResponseModel)bundle.getParcelable("com.spotify.social_chart.state.model");
        }
        z_().setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {

            private fjd a;

            public final boolean onItemLongClick(AdapterView adapterview, View view1, int j, long l)
            {
                adapterview = (fxh)view1.getTag(0x7f110041);
                if (adapterview != null)
                {
                    adapterview.a(a.k());
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = fjd.this;
                super();
            }
        });
    }

    public final void a(ListView listview, View view, int j, long l)
    {
        ctz.a(af);
        if (gex.a(aq))
        {
            listview = b.getUserModel().getTrackModels();
            if (!listview[(int)l].isUnavailable())
            {
                a(false, (int)l);
                listview = listview[(int)l];
                view = am;
                j = (int)l;
                view.a(new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ah), listview, j);
            }
            return;
        } else
        {
            ShufflePlayHeaderView.a(ab, af);
            return;
        }
    }

    public final void c()
    {
        super.c();
        aa.connect();
        ad = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(aa, ViewUri.o.toString(), FeatureIdentifier.D, gnl.a(this));
        ad.registerPlayerStateObserver(au);
        ad.registerPlayerStateObserver(av);
        ar.a();
    }

    public final void d()
    {
        super.d();
        ad.unregisterPlayerStateObserver(au);
        ad.unregisterPlayerStateObserver(av);
        aa.disconnect();
        ar.c();
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        u().a(0x7f1100a8, null, new gcj(k(), this));
    }

    public final void d(boolean flag)
    {
        an = flag;
        if (as != null)
        {
            as.setVisible(an);
        }
        if (b != null)
        {
            a(b);
            return;
        } else
        {
            ag.c();
            ag.a();
            aa.resolve(RequestBuilder.get("hm://social-charts-view/v2/user/").build(), new JsonCallbackReceiver(Z, com/spotify/mobile/android/spotlets/socialchart/model/SocialChartResponseModel) {

                private fjd a;

                protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                {
                    if (!a.o())
                    {
                        return;
                    }
                    fjd.f(a).b();
                    ((fpe)a.k()).a(a, a.a(a.k(), fjd.a(a)));
                    if (fjd.h(a))
                    {
                        fjd.i(a).c(true);
                        return;
                    } else
                    {
                        fjd.i(a).a(true);
                        return;
                    }
                }

                protected final void onResolved(Response response, Object obj)
                {
                    response = (SocialChartResponseModel)obj;
                    if (a.o())
                    {
                        fjd.f(a).b();
                        fjd.a(a, response);
                        a.b = response;
                        fjd.g(a).b();
                    }
                }

            
            {
                a = fjd.this;
                super(handler, class1);
            }
            });
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (ao)
        {
            bundle.putString("track", ac.a);
            bundle.putParcelable("com.spotify.social_chart.state.model", b);
            bundle.putParcelable("com.spotify.social_chart.state.list", z_().onSaveInstanceState());
        }
        ar.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.D;
    }

    public final void z()
    {
        super.z();
        ah.a();
    }

}

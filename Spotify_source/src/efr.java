// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.album.model.Album;
import com.spotify.mobile.android.spotlets.album.model.AlbumArtist;
import com.spotify.mobile.android.spotlets.album.model.AlbumImage;
import com.spotify.mobile.android.spotlets.album.model.AlbumRelated;
import com.spotify.mobile.android.spotlets.album.model.AlbumRelease;
import com.spotify.mobile.android.spotlets.album.model.AlbumTrack;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.ContentFrameLayout;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class efr extends Fragment
    implements android.widget.AdapterView.OnItemClickListener, dod, eda, fxy
{

    private String Y;
    private String Z;
    private gjf a;
    private String aa;
    private boolean ab;
    private ContentFrameLayout ac;
    private ContentViewManager ad;
    private efu ae;
    private dja af;
    private ListView ag;
    private View ah;
    private String ai;
    private ftg aj;
    private efs ak;
    private eft al;
    private TextView am;
    private Flags an;
    private Album ao;
    private PlayerTrack ap[];
    private Player aq;
    private fop ar;
    private Resolver as;
    private Verified at;
    private gji au;
    private final JsonCallbackReceiver av = new JsonCallbackReceiver(new Handler(), com/spotify/mobile/android/spotlets/album/model/Album) {

        private efr a;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.b(throwable, "Exception when fetching Hermes content: %s", new Object[] {
                errorcause.name()
            });
            efr.b(a).c(true);
        }

        protected final void onResolved(Response response, Object obj)
        {
            int i1 = 0;
            response = (Album)obj;
            if (!efr.a(a).d())
            {
                efr.a(a).b();
            }
            efr.a(a, response);
            ((fpe)a.k()).P_();
            efr.b(a).b(null);
            if (efr.c(a) != null)
            {
                for (; i1 < response.getAlbumTracks().size(); i1++)
                {
                    if (TextUtils.equals(((AlbumTrack)response.getAlbumTracks().get(i1)).uri, efr.c(a)))
                    {
                        int j1 = efr.a(a, i1);
                        efr.d(a).setSelection(j1);
                        if (efr.e(a) && gex.a(efr.f(a)))
                        {
                            ggp.a(efr.d(a), j1);
                        }
                    }
                }

            } else
            if (efr.e(a))
            {
                if (gex.a(efr.f(a)))
                {
                    ggp.a(efr.d(a), efr.a(a, 0));
                } else
                {
                    efr.h(a).onClick(efr.g(a));
                }
                efr.i(a);
            }
        }

            
            {
                a = efr.this;
                super(handler, class1);
            }
    };
    private final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver aw = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

        private efr a;

        public final void onPlayerStateReceived(PlayerState playerstate)
        {
            if (playerstate.track() != null && TextUtils.equals(a.H(), playerstate.entityUri()))
            {
                if (!TextUtils.equals(efr.j(a).a, playerstate.track().uri()))
                {
                    efr.j(a).a(playerstate.track().uri());
                }
                return;
            } else
            {
                efr.j(a).a(null);
                return;
            }
        }

            
            {
                a = efr.this;
                super();
            }
    };
    private final android.view.View.OnClickListener ax = new android.view.View.OnClickListener() {

        private efr a;

        public final void onClick(View view)
        {
            efr.l(a);
            fop.a(a.k(), efr.k(a), ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.X, null, null));
            view = PlayerContext.create(a.H(), efr.m(a));
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).playerOptionsOverride(true, false, false).build();
            efr.n(a).play(view, playoptions);
        }

            
            {
                a = efr.this;
                super();
            }
    };
    private final android.view.View.OnClickListener ay = new android.view.View.OnClickListener() {

        private efr a;

        public final void onClick(View view)
        {
            if (efr.o(a) != null)
            {
                view = gms.a(a.k(), efr.o(a).getFirstArtistUri()).a(efr.o(a).getFirstArtistName()).a;
                a.a(view);
            }
        }

            
            {
                a = efr.this;
                super();
            }
    };
    private ggl b;

    public efr()
    {
    }

    private ToggleButton J()
    {
        ToggleButton togglebutton = (ToggleButton)LayoutInflater.from(k()).inflate(0x7f0300c8, null);
        togglebutton.setVisibility(0);
        return togglebutton;
    }

    static int a(efr efr1, int i1)
    {
        int j1 = 1;
        int k1 = efr1.aj.e(1);
        if (!efr1.aj.a(1))
        {
            j1 = 0;
        }
        return j1 + (k1 + i1) + efr1.ag.getHeaderViewsCount();
    }

    public static efr a(String s, String s1, String s2, boolean flag, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("album_uri", s);
        bundle.putString("title", s1);
        bundle.putString("lookup_track_uri", s2);
        bundle.putBoolean("autoplay", flag);
        s = new efr();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static gjf a(efr efr1)
    {
        return efr1.a;
    }

    static void a(efr efr1, Album album)
    {
        efr1.ao = album;
        Object obj = album.getAlbumTracks();
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            AlbumTrack albumtrack = (AlbumTrack)((Iterator) (obj)).next();
            if (albumtrack.artists.size() > 0)
            {
                arraylist.add(PlayerTrack.create(albumtrack.uri, albumtrack.uri, ((AlbumArtist)albumtrack.artists.get(0)).uri));
            }
        } while (true);
        efr1.ap = (PlayerTrack[])arraylist.toArray(new PlayerTrack[arraylist.size()]);
        if (!TextUtils.equals(efr1.Z, album.name))
        {
            efr1.Z = album.name;
            String s = efr1.a(((Context) (efr1.k())), efr1.an);
            ((djr)efr1.af.a()).a(s);
        }
        efr1.ae.a(album);
        ((djr)efr1.af.a()).b(efr1.k().getString(0x7f08006a, new Object[] {
            album.getFirstArtistName()
        }).toUpperCase(Locale.US));
        efr1.au.e(efr1.af.c(), album.cover.uri);
        efr1.au.a(efr1.af.d(), album.cover.uri);
        CoverImageActivity.a(efr1.k(), efr1.af.c(), Uri.parse(album.cover.uri));
        efr1.ak.b();
        efr1.al.b();
        efr1.aj.a(2, efr1.a(0x7f08006e, new Object[] {
            album.getFirstArtistName()
        }));
        if (album.related != null)
        {
            efr1.ak.a(album.related.releases);
        }
        efr1.al.a(album.getAlbumTracks());
        efr1.am.setText(ctw.a('\n').a(album.copyrights));
    }

    static ContentViewManager b(efr efr1)
    {
        return efr1.ad;
    }

    public static boolean b(Intent intent)
    {
        return intent.hasExtra("album_uri");
    }

    static String c(efr efr1)
    {
        return efr1.aa;
    }

    static ListView d(efr efr1)
    {
        return efr1.ag;
    }

    static boolean e(efr efr1)
    {
        return efr1.ab;
    }

    static Flags f(efr efr1)
    {
        return efr1.an;
    }

    static View g(efr efr1)
    {
        return efr1.ah;
    }

    static android.view.View.OnClickListener h(efr efr1)
    {
        return efr1.ax;
    }

    static boolean i(efr efr1)
    {
        efr1.ab = false;
        return false;
    }

    static eft j(efr efr1)
    {
        return efr1.al;
    }

    static Verified k(efr efr1)
    {
        return efr1.at;
    }

    static fop l(efr efr1)
    {
        return efr1.ar;
    }

    static PlayerTrack[] m(efr efr1)
    {
        return efr1.ap;
    }

    static Player n(efr efr1)
    {
        return efr1.aq;
    }

    static Album o(efr efr1)
    {
        return efr1.ao;
    }

    public final void A()
    {
        b.b();
        edb.a(k()).b(this);
        super.A();
    }

    public final void B()
    {
        super.B();
        aq.unregisterPlayerStateObserver(aw);
        as.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String H()
    {
        if (at != null)
        {
            return at.toString();
        } else
        {
            return null;
        }
    }

    public final String I()
    {
        return at.toString();
    }

    public final Uri a()
    {
        return Uri.parse(Y);
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        an = fyw.a(this);
        b = ggn.a(k(), at);
        a = gjf.a(k(), at.toString());
        a.c(bundle);
        a.a();
        ac = new ContentFrameLayout(k());
        layoutinflater = ac;
        viewgroup = k();
        ae = new efu(k());
        ae.a(ay);
        if (ggi.b(k()))
        {
            af = dja.b(k()).b().b(J(), 0).a(ae).a(this);
        } else
        {
            ah = gad.a(viewgroup, null);
            ah.setOnClickListener(ax);
            af = dja.a(k()).b().b(J(), 0).a(true).b(ah).a(ae).a(this);
        }
        ag = af.e().a();
        ag.setFastScrollEnabled(true);
        ag.setOnItemClickListener(this);
        ak = new efs(viewgroup, at, an);
        al = new eft(viewgroup, at, an);
        am = (TextView)LayoutInflater.from(viewgroup).inflate(0x7f03004f, ag, false);
        aj = new ftg(viewgroup);
        if (!gex.a(an))
        {
            aj.a(al, 0x7f08046d, 1);
        } else
        {
            aj.a(al, null, 1);
        }
        aj.a(ak, null, 2);
        aj.a(new ftm(am, false), null, 3);
        ag.setAdapter(aj);
        layoutinflater.a(af.b());
        return ac;
    }

    public final String a(Context context, Flags flags)
    {
        if (Z == null)
        {
            return context.getString(0x7f08006d);
        } else
        {
            return Z;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        Y = g().getString("album_uri");
        Z = g().getString("title");
        ab = g().getBoolean("autoplay", false);
        aa = g().getString("lookup_track_uri");
        at = ViewUri.am.a(Y);
        as = Cosmos.getResolver(k());
        as.connect();
        aq = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(as, H(), FeatureIdentifier.R, gnl.a(this));
        aq.registerPlayerStateObserver(aw);
        ar = (fop)dmz.a(fop);
        ai = String.format("hm://album/v1/album-app/album/%s/android", new Object[] {
            Y
        });
        a(true);
        dmz.a(gjj);
        au = gjj.a(k());
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        boolean flag;
        if (al != null && al.getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ggi.b(k()) && flag)
        {
            ah = fzr.a(k(), menu, ax);
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        ad = (new gaa(k(), ac.a, ac.c)).a(0x7f0802ad, 0x7f08006b).a();
    }

    public final void a(SessionState sessionstate)
    {
        if (sessionstate.j && ao == null)
        {
            ad.a(ac.b);
            as.get(ai, av);
            return;
        }
        ContentViewManager contentviewmanager = ad;
        boolean flag;
        if (!sessionstate.j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        contentviewmanager.a(flag);
    }

    public final void e()
    {
        if (a.e())
        {
            a.c();
        }
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        a.a(bundle);
    }

    public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = k();
        int j1 = ag.getHeaderViewsCount();
        switch (aj.b(i1 - j1))
        {
        default:
            Assertion.b(false, (new StringBuilder("The section for the position (")).append(i1).append(") item click event is not handled.").toString());
            return;

        case 1: // '\001'
            adapterview = (AlbumTrack)view.getTag();
            if (gex.a(an))
            {
                fop.a(k(), at, ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.ah, ((AlbumTrack) (adapterview)).uri, Long.valueOf(l1)));
                adapterview = PlayerContext.create(H(), ap);
                view = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).skipToIndex(0, i1 - ag.getHeaderViewsCount()).build();
                aq.play(adapterview, view);
                return;
            } else
            {
                fop.a(k(), at, ClientEventFactory.a("album", com.spotify.mobile.android.util.ClientEvent.SubEvent.ai, ((AlbumTrack) (adapterview)).uri, Long.valueOf(l1)));
                ShufflePlayHeaderView.a(new gbv(), ah);
                return;
            }

        case 2: // '\002'
            view = (AlbumRelease)view.getTag();
            a(gms.a(adapterview, ((AlbumRelease) (view)).uri).a(((AlbumRelease) (view)).name).a);
            return;
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.R;
    }

    public final void z()
    {
        b.a();
        edb.a(k()).a(this);
        super.z();
    }
}

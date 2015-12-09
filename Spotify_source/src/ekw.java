// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.CollectionFavorites;
import com.spotify.mobile.android.spotlets.browse.model.Genre;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ekw extends Fragment
    implements android.widget.AbsListView.OnScrollListener, elb, fxy, fyx, gck
{

    static final String a[] = {
        "subscriber_count", "name"
    };
    private View Y;
    private View Z;
    private ViewGroup aa;
    private LoadingView ab;
    private String ac;
    private String ad;
    private boolean ae;
    private String af;
    private ggl ag;
    private boolean ah;
    private boolean ai;
    private elf aj;
    private elh ak;
    private gjf al;
    private ListView am;
    private Flags an;
    private DeferredResolver ao;
    private Player ap;
    private ekv aq;
    private dja ar;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver as;
    private Verified at;
    private an au;
    private ela b;

    public ekw()
    {
        aq = new ekv();
        as = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private ekw a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                Object obj = playerstate.track();
                if (obj != null)
                {
                    obj = ((PlayerTrack) (obj)).uri();
                } else
                {
                    obj = "";
                }
                ekw.a(a).a(playerstate.entityUri(), ((String) (obj)));
            }

            
            {
                a = ekw.this;
                super();
            }
        };
        au = new an() {

            private ekw a;

            public final da a(Bundle bundle)
            {
                return new cu(a.k(), dtt.a(ekw.b(a)), ekw.a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst() && ((Cursor) (obj)).getString(1) == null)
                {
                    Assertion.a("Playlist name is null while getting playlist", ekw.b(a));
                }
            }

            
            {
                a = ekw.this;
                super();
            }
        };
    }

    private void H()
    {
        this;
        JVM INSTR monitorenter ;
        int i = b.a();
        if (i <= 0 || i >= 12)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (!ah)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        ah = true;
        this;
        JVM INSTR monitorexit ;
        if (ad.equals("collection-favorites"))
        {
            if (b.a() != 0)
            {
                Z.setVisibility(0);
            }
            elh elh1 = ak;
            ctz.a(elh1.b);
            com.spotify.cosmos.router.Request request = RequestBuilder.get("hm://apollo-genesis/v1/favorites").build();
            elh1.b.resolve(request, new elh._cls1(elh1, elh1.c, com/spotify/mobile/android/spotlets/browse/model/CollectionFavorites));
            return;
        }
        if (ae || b.a() == 0)
        {
            if (b.a() != 0)
            {
                Z.setVisibility(0);
            }
            aj.a(b.a() / 12, 12);
        }
        return;
    }

    public static ekw a(String s, String s1, Intent intent, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("datastring", intent.getDataString());
        bundle.putString("title", s);
        bundle.putString("genre", intent.getStringExtra("genre"));
        bundle.putBoolean("eternalScroll", intent.getBooleanExtra("eternalScroll", true));
        bundle.putString("country", s1);
        s = new ekw();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static ela a(ekw ekw1)
    {
        return ekw1.b;
    }

    public static String a(String s)
    {
        return (new StringBuilder("spotify:app:browse:")).append(s).toString();
    }

    static String b(ekw ekw1)
    {
        return ekw1.af;
    }

    public final void A()
    {
        super.A();
        ap.unregisterPlayerStateObserver(aq);
        ap.unregisterPlayerStateObserver(as);
        ao.disconnect();
        ag.b();
    }

    public final void B()
    {
        super.B();
        ao.destroy();
        if (ak != null)
        {
            elh elh1 = ak;
            ctz.a(elh1.b);
            elh1.b.destroy();
        }
        if (aj != null)
        {
            aj.b();
        }
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "browse_playlists";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        an = fyw.a(this);
        aa = (ViewGroup)layoutinflater.inflate(0x7f030079, viewgroup, false);
        ab = LoadingView.a(LayoutInflater.from(k()));
        aa.addView(ab);
        ab.a();
        layoutinflater = elw.b(ad, l()).a();
        if (ggi.b(k()))
        {
            ar = dja.b(k()).a().a().a(this);
        } else
        {
            ar = dja.a(k()).a().a().a(this);
        }
        ((djq)ar.a()).a(layoutinflater);
        ar.b().setVisibility(8);
        am = ar.e().a();
        layoutinflater = new android.widget.FrameLayout.LayoutParams(-1, -1);
        aa.addView(ar.b(), 0, layoutinflater);
        return aa;
    }

    public final Flags a()
    {
        return an;
    }

    public final String a(Context context, Flags flags)
    {
        if (ac != null)
        {
            return ac;
        } else
        {
            return "Playlist Browse";
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        u u1 = k();
        an = fyw.a(this);
        ac = g().getString("title");
        ad = g().getString("genre");
        if (elw.a(ad, l()) == null)
        {
            Object obj = g().getString("datastring");
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = new SpotifyLink(((String) (obj)));
                if (((SpotifyLink) (obj)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.q)
                {
                    ad = ((SpotifyLink) (obj)).a.getLastPathSegment();
                }
            }
            if (elw.a(ad, l()) == null)
            {
                ad = "mood";
            }
        }
        ae = g().getBoolean("eternalScroll");
        al = gjf.a(u1, a(ad));
        al.c(bundle);
        al.a();
        at = ViewUri.t.a(a(ad));
        ag = ggn.a(u1, at);
        ao = Cosmos.getResolver(k());
        b = new ela(u1.getResources().getInteger(0x7f0e0005), aq, this, FeatureIdentifier.e, gnl.a(this));
        String s = ad;
        Genre genre = elw.a(ad, l());
        bundle = s;
        if (genre != null)
        {
            bundle = s;
            if (!genre.b())
            {
                bundle = elw.a(ad, l()).b;
            }
            af = genre.f;
        }
        s = g().getString("country");
        if (ad.equals("collection-favorites"))
        {
            ak = new elh(this);
            bundle = ak;
            bundle.b = Cosmos.getResolver(u1);
            bundle.c = new Handler(u1.getMainLooper());
        } else
        {
            aj = new elf(u1, this, s, ad, bundle, this);
        }
        a(false);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        Z = LayoutInflater.from(k()).inflate(0x7f030071, null);
        am = (ListView)view.findViewById(0x102000a);
        am.setOnScrollListener(this);
        Y = els.a(aa);
        am.addFooterView(Z);
        Object obj = elw.a(ad, l());
        view = ((View) (obj));
        if (!((Genre) (obj)).b())
        {
            view = elw.a(elw.a(ad, l()).b, l());
        }
        view = ((Genre) (view)).e;
        obj = ((gft)dmz.a(gft)).a();
        if (!TextUtils.isEmpty(view))
        {
            ((Picasso) (obj)).a(Uri.parse(view)).a(ar.d(), null);
        }
        view = new View(k());
        view.setLayoutParams(new android.widget.AbsListView.LayoutParams(0, l().getDimensionPixelSize(0x7f0c008c)));
        am.addHeaderView(view);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            view = bundle.getParcelableArrayList("playlists");
            a(((List) (view)), null, view.size(), false, RequestType.c);
            view = bundle.getParcelable("list");
            if (view != null)
            {
                am.onRestoreInstanceState(view);
            }
        } else
        {
            H();
        }
        ((fpe)k()).a(this, "");
        u().a(0x7f110066, null, new gcj(k(), this));
        am.setAdapter(b);
    }

    public final void a(List list, Map map, int i, boolean flag, RequestType requesttype)
    {
        ah = false;
        ar.b().setVisibility(0);
        ab.b();
        if (o())
        {
            Z.setVisibility(8);
            ai = flag;
            if (!al.d())
            {
                al.b();
            }
            if (list != null)
            {
                map = b;
                if (ad.equals("toplists") && i == 0)
                {
                    list.add(0, new Playlist("toplists", b(0x7f08051c), b(0x7f08051a), "spotify:internal:social-chart", "https://i.scdn.co/image/11643b781401fb007ecf46ae98e83a0013a1697f", -1));
                }
                ((ela) (map)).a.addAll(list);
                map.a(((ela) (map)).b.a(), ((ela) (map)).b.b());
                list = elw.a(ad, l());
                if (list != null && !TextUtils.isEmpty(((Genre) (list)).e))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (i != 0)
                {
                    if (b.getCount() > 0 && TextUtils.isEmpty(af))
                    {
                        list = b;
                        if (list.getCount() > 0)
                        {
                            list = ((Playable) (list.a(0))).c;
                        } else
                        {
                            list = "";
                        }
                        af = list;
                    }
                    u().a(0x7f110090, null, au);
                }
                b.notifyDataSetChanged();
                return;
            }
        }
    }

    public final void d()
    {
        super.d();
        al.c();
        ((elg) (aj)).a.a();
    }

    public final void d(boolean flag)
    {
        if (flag)
        {
            Y.setVisibility(8);
            am.setVisibility(0);
            H();
            return;
        } else
        {
            Y.setVisibility(0);
            am.setVisibility(8);
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < b.a(); i++)
        {
            arraylist.add(b.a(i));
        }

        bundle.putParcelableArrayList("playlists", arraylist);
        bundle.putParcelable("list", am.onSaveInstanceState());
        al.a(bundle);
    }

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        if (i + j >= (k - 6) + 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && !ai)
        {
            H();
        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.e;
    }

    public final void z()
    {
        super.z();
        FeatureIdentifier featureidentifier = gnl.a(g());
        ap = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(ao, at.toString(), FeatureIdentifier.e, featureidentifier);
        ap.registerPlayerStateObserver(aq);
        ap.registerPlayerStateObserver(as);
        ag.a();
    }

}

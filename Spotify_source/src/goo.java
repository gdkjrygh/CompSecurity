// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.common.AbstractContentFragment;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationTracksModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.model.RelatedArtistModel;
import com.squareup.picasso.Picasso;

public abstract class goo extends AbstractContentFragment
{

    dja Y;
    Button Z;
    String a;
    private String aa;
    private Verified ag;
    private gpm ah;
    private View ai;
    private String aj;
    private HeaderView ak;
    private TextView al;
    private ftg am;
    private gbv an;
    private Flags ao;
    private gon ap;
    private fop aq;
    private fos ar;
    private final android.widget.AdapterView.OnItemClickListener as = new android.widget.AdapterView.OnItemClickListener() {

        private goo a;

        public final void onItemClick(AdapterView adapterview, View view, int k, long l)
        {
            k -= goo.a(a).e().a().getHeaderViewsCount();
            if (k < 0)
            {
                return;
            }
            int i1 = goo.b(a).b(k);
            switch (i1)
            {
            default:
                return;

            case 1: // '\001'
                i1 = goo.b(a).a(k, i1);
                break;
            }
            if (gex.a(goo.c(a)))
            {
                Assertion.a(goo.d(a));
                view = goo.d(a);
                adapterview = new PlayerTrack[((gon) (view)).c.getCount()];
                for (k = 0; k < ((gon) (view)).c.getCount(); k++)
                {
                    adapterview[k] = (PlayerTrack)((gon) (view)).c.getItem(k);
                }

                view = (RadioStationModel)goo.e(a);
                view = new RadioStationModel(view, new RadioStationTracksModel(adapterview, gpl.a(((RadioStationModel) (view)).nextPageUrl, adapterview)));
                goo.a(a, view);
                goo.g(a);
                fop.a(a.k(), goo.f(a), ClientEventFactory.a("station", com.spotify.mobile.android.util.ClientEvent.SubEvent.ah, adapterview[i1].uri(), Long.valueOf(l)));
                goo.h(a);
                fos.a(a.k(), view, goo.f(a), com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, i1);
                return;
            } else
            {
                ShufflePlayHeaderView.a(goo.i(a), goo.j(a).a(false));
                return;
            }
        }

            
            {
                a = goo.this;
                super();
            }
    };
    gou b;

    public goo()
    {
    }

    static dja a(goo goo1)
    {
        return goo1.Y;
    }

    public static goo a(String s, String s1, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("StationFragment.station_uri", s);
        bundle.putString("StationFragment.station_title", s1);
        bundle.putLong("StationFragment.station_random", System.currentTimeMillis());
        if (ViewUri.W.b(s) || ViewUri.X.b(s))
        {
            s = new gop();
        } else
        {
            s = new gos();
        }
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static void a(goo goo1, Parcelable parcelable)
    {
        goo1.ae = parcelable;
    }

    private void a(PlayerTrack aplayertrack[])
    {
        if (aplayertrack == null || aplayertrack.length == 0)
        {
            am.a(new int[] {
                1
            });
            return;
        } else
        {
            Assertion.a(ap);
            ap.c.clear();
            ap.a(aplayertrack);
            return;
        }
    }

    static ftg b(goo goo1)
    {
        return goo1.am;
    }

    static Flags c(goo goo1)
    {
        return goo1.ao;
    }

    static gon d(goo goo1)
    {
        return goo1.ap;
    }

    static Parcelable e(goo goo1)
    {
        return ((AbstractContentFragment) (goo1)).ae;
    }

    static Verified f(goo goo1)
    {
        return goo1.ag;
    }

    static fop g(goo goo1)
    {
        return goo1.aq;
    }

    static fos h(goo goo1)
    {
        return goo1.ar;
    }

    static gbv i(goo goo1)
    {
        return goo1.an;
    }

    static gpm j(goo goo1)
    {
        return goo1.ah;
    }

    protected abstract int H();

    protected abstract Button J();

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ah = new gpm(k(), ag, viewgroup, ggi.b(k()), FeatureIdentifier.aD, gnl.a(this));
        return super.a(layoutinflater, viewgroup, bundle);
    }

    protected RadioStationModel a(RadioStationModel radiostationmodel)
    {
        return new RadioStationModel(radiostationmodel.uri, radiostationmodel.title, radiostationmodel.titleUri, radiostationmodel.imageUri, radiostationmodel.subtitle, radiostationmodel.subtitleUri, radiostationmodel.seeds, radiostationmodel.relatedArtists, radiostationmodel.tracks, radiostationmodel.nextPageUrl, radiostationmodel.explicitSave);
    }

    public final String a(Context context, Flags flags)
    {
        if (TextUtils.isEmpty(aj))
        {
            return context.getString(0x7f080442);
        } else
        {
            return aj;
        }
    }

    public final void a(Bundle bundle)
    {
        a(g().getString("StationFragment.station_uri"), g().getString("StationFragment.station_title"));
        super.a(bundle);
        ao = fyw.a(this);
        a(true);
        aq = (fop)dmz.a(fop);
        ar = (fos)dmz.a(fos);
        an = new gbv();
    }

    protected volatile void a(Parcelable parcelable, View view)
    {
        a((RadioStationModel)parcelable, view);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        if (ggi.b(k()))
        {
            menuinflater = ah;
            if (((gqi) (menuinflater)).d)
            {
                menuinflater.c = menu;
            }
            ah.a(true);
        }
    }

    public void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        view = new gpi() {

            private goo a;

            public final void a(RadioStationsModel radiostationsmodel)
            {
                a.a(radiostationsmodel);
            }

            public final void a(gpg gpg)
            {
            }

            public final void p()
            {
            }

            
            {
                a = goo.this;
                super();
            }
        };
        b = new gou(k().getApplicationContext(), view);
    }

    protected void a(RadioStationModel radiostationmodel, View view)
    {
        Object obj;
        if (ap != null)
        {
            ap.d.destroy();
        }
        view = new gon(k(), aa, ag, ao, g().getLong("StationFragment.station_random"), gnl.a(this));
        ap = view;
        view.a();
        am = new ftg(k());
        al = (TextView)LayoutInflater.from(k()).inflate(0x7f030131, Y.e().a(), false);
        obj = new ftm(al, true);
        am.a(((android.widget.ListAdapter) (obj)), H(), 0);
        final class _cls5
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.util.SpotifyLink.LinkType.values().length];
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.aT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.an.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.util.SpotifyLink.LinkType.X.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        SpotifyLink spotifylink;
        int k;
        int j1;
        if (gex.a(ao))
        {
            k = 0x7f08052a;
        } else
        {
            k = 0x7f08052b;
        }
        am.a(((gon) (view)).c, k, 1);
        Y.e().a().setAdapter(am);
        obj = ((gft)dmz.a(gft)).a();
        ((Picasso) (obj)).a(dto.a(radiostationmodel.imageUri)).a(new dgf(30, 255)).a(Y.d(), null);
        spotifylink = new SpotifyLink(aa);
        view = spotifylink.c;
        _cls5.a[view.ordinal()];
        JVM INSTR tableswitch 1 4: default 288
    //                   1 611
    //                   2 622
    //                   3 633
    //                   4 644;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_644;
_L1:
        view = dff.a(k());
_L6:
        if (spotifylink.c == com.spotify.mobile.android.util.SpotifyLink.LinkType.g)
        {
            ((Picasso) (obj)).a(dto.a(radiostationmodel.imageUri)).a(view).b(view).a(gft.a(Y.c()));
            Y.c().setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        } else
        {
            ((Picasso) (obj)).a(dto.a(radiostationmodel.imageUri)).a(view).b(view).a(Y.c(), null);
        }
        ((djr)Y.a()).a(radiostationmodel.title);
        if (ggi.b(k()))
        {
            k = dft.a(168F, l());
            j1 = dft.a(168F, l());
            ak.a(k, j1);
            ak.c().setBackgroundResource(0x7f020276);
            view = ak.e();
            obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
            obj.topMargin = dft.b(-26F, l());
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            k = dft.a(88F, l());
            ak.a(k);
        } else
        {
            int l = dft.a(300F, l());
            int k1 = dft.a(210F, l());
            ak.a(l, k1);
            ak.c().setBackgroundResource(0x7f020275);
            l = dft.a(-26F, l());
            view = (android.widget.LinearLayout.LayoutParams)ak.d().getLayoutParams();
            view.setMargins(0, l, 0, 0);
            ak.d().setLayoutParams(view);
            ak.d().setPadding(0, 0, 0, 0);
            l = dft.a(140F, l());
            ak.a(l);
        }
        view = radiostationmodel.relatedArtists;
        if (view == null || view.length == 0)
        {
            am.a(new int[] {
                0
            });
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            int l1 = view.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                stringbuilder.append(((RelatedArtistModel) (view[i1])).artistName);
                stringbuilder.append(", ");
            }

            view = l().getString(0x7f080528, new Object[] {
                stringbuilder
            });
            al.setText(view);
        }
        ((fpe)k()).a(this, radiostationmodel.title);
        g().putString("StationFragment.station_title", radiostationmodel.title);
        radiostationmodel = a(radiostationmodel);
        super.ae = radiostationmodel;
        a(radiostationmodel.tracks);
        view = ah;
        view.a = radiostationmodel;
        if (radiostationmodel.seeds != null && radiostationmodel.seeds.length > 0)
        {
            radiostationmodel = gpl.b(radiostationmodel.seeds[0]);
        } else
        {
            radiostationmodel = null;
        }
        view.b = radiostationmodel;
        return;
_L2:
        view = dff.b(k());
          goto _L6
_L3:
        view = dff.d(k());
          goto _L6
_L4:
        view = dff.e(k());
          goto _L6
        view = dff.c(k(), SpotifyIcon.g);
          goto _L6
    }

    protected abstract void a(RadioStationsModel radiostationsmodel);

    protected final void a(gaa gaa1)
    {
        gaa1.a(0x7f0802ad, 0x7f0802ac).b(SpotifyIcon.K, 0x7f080441, 0x7f080440).b(0x7f080441, 0x7f080440);
    }

    protected void a(gnn gnn)
    {
        gnn = new gov(gnn) {

            private gnn a;

            public final void a()
            {
                a.a();
            }

            public final void a(RadioStationModel radiostationmodel)
            {
                a.a(radiostationmodel);
            }

            
            {
                a = gnn1;
                super();
            }
        };
        if (b.c())
        {
            b.a(ag, gnn);
            return;
        } else
        {
            b.a(new dwk(gnn) {

                private gov a;
                private goo b;

                public final void a(Object obj)
                {
                    b.b.a(goo.f(b), a);
                    b.b.b(this);
                }

                public final void b()
                {
                    b.b.b(this);
                }

            
            {
                b = goo.this;
                a = gov;
                super();
            }
            });
            return;
        }
    }

    protected final void a(String s, String s1)
    {
        a = s;
        aj = s1;
        ag = ViewUri.V.a(a);
        aa = gpl.d(a);
    }

    protected final boolean b(Parcelable parcelable)
    {
        parcelable = (RadioStationModel)parcelable;
        return parcelable == null || TextUtils.isEmpty(((RadioStationModel) (parcelable)).title) && TextUtils.isEmpty(((RadioStationModel) (parcelable)).titleUri);
    }

    public final void c()
    {
        super.c();
        gpm gpm1 = ah;
        ((gqj) (gpm1)).i.connect();
        ((gqj) (gpm1)).m.a();
        if (ap != null)
        {
            ap.a();
        }
        ((fpe)k()).a(this, aj);
        b.a();
    }

    protected final View d(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ak = new HeaderView(k());
        Z = J();
        if (ggi.b(k()))
        {
            Y = dja.b(k()).b().b(Z, 1).a(ak).a(this);
        } else
        {
            ai = ah.a(false);
            Y = dja.a(k()).b().b(Z, 1).b(ai).a(ak).a(true).a(this);
        }
        Y.a(null);
        Y.e().a().setOnItemClickListener(as);
        Y.e().a().setOnItemLongClickListener(new fuf(k()));
        return Y.b();
    }

    public final void d()
    {
        super.d();
        gpm gpm1 = ah;
        ((gqj) (gpm1)).m.b();
        ((gqj) (gpm1)).i.disconnect();
        if (ap != null)
        {
            gon gon1 = ap;
            gon1.f.b();
            gon1.d.disconnect();
        }
        b.b();
    }

    public final void e()
    {
        ((gqj) (ah)).i.destroy();
        if (ap != null)
        {
            ap.d.destroy();
        }
        super.e();
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.U;
    }

    public final Verified v_()
    {
        return ag;
    }
}

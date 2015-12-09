// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.HideableHeadersListView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;

public final class enj extends al
    implements foo, fxy
{

    private static final gip Y = gip.b("playlists_sort_order");
    private static final List Z;
    private static final gfp aa;
    public static final String b;
    private String ab;
    private gfp ac;
    private ListView ad;
    private View ae;
    private View af;
    private EmptyView ag;
    private LoadingView ah;
    private Parcelable ai;
    private ggl aj;
    private Verified ak;
    private gin al;
    private ftg am;
    private os an;
    private FilterHeaderView ao;
    private eop ap;
    private fom aq;
    private gdd ar;
    private gjf as;
    private fuj at;
    private boolean au;
    private Flags av;
    private eoq aw;
    private android.view.View.OnClickListener ax;
    private gas ay;
    private an az;

    public enj()
    {
        dmz.a(fop);
        at = new fuj() {

            private enj a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (dny)obj;
                fve.a(a.k()).a(((doc) (obj))).a(enj.b(a)).a(true).a(true).a(enj.a(a)).a(spotifycontextmenu);
            }

            
            {
                a = enj.this;
                super();
            }
        };
        aw = new eoq() {

            private enj a;

            public final void a()
            {
                enj.h(a);
            }

            
            {
                a = enj.this;
                super();
            }
        };
        ax = new android.view.View.OnClickListener() {

            private enj a;

            public final void onClick(View view)
            {
                enj.i(a).a(a.k());
            }

            
            {
                a = enj.this;
                super();
            }
        };
        ay = new gas() {

            private enj a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                enj.a(a, gfp1);
                enj.k(a).b().a(enj.H(), enj.j(a).a()).b();
                enj.h(a);
            }

            public final void a(String s)
            {
                enj.a(a, s);
                enj.h(a);
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = enj.this;
                super();
            }
        };
        az = new an() {

            private enj a;

            public final da a(Bundle bundle)
            {
                bundle = com.spotify.mobile.android.provider.Metadata.PlaylistFilter.a;
                if (enj.i(a).b())
                {
                    bundle = com.spotify.mobile.android.provider.Metadata.PlaylistFilter.b;
                }
                bundle = dtu.a(bundle, enj.o(a));
                return new cu(a.k(), bundle, dny.a, null, enj.j(a).a());
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (duc.a(((Cursor) (obj))))
                {
                    enj.g(a).b(((Cursor) (obj)));
                    int i1 = ((Cursor) (obj)).getCount();
                    enj.l(a).b();
                    enj.a(a, i1);
                    enj.m(a).a(Integer.valueOf(0), ((Cursor) (obj)));
                    if (enj.n(a).e())
                    {
                        enj.n(a).b();
                    }
                }
            }

            
            {
                a = enj.this;
                super();
            }
        };
    }

    static gip H()
    {
        return Y;
    }

    private void J()
    {
        ((fpe)k()).a(this, k().getString(0x7f080401));
        ((fpe)k()).P_();
    }

    static Flags a(enj enj1)
    {
        return enj1.av;
    }

    public static enj a(Flags flags, boolean flag)
    {
        enj enj1 = new enj();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_download", flag);
        enj1.f(bundle);
        fyw.a(enj1, flags);
        return enj1;
    }

    static gfp a(enj enj1, gfp gfp1)
    {
        enj1.ac = gfp1;
        return gfp1;
    }

    public static gfp a(gin gin)
    {
        return gfp.a(gin, Y, aa, Z);
    }

    static String a(enj enj1, String s)
    {
        enj1.ab = s;
        return s;
    }

    static void a(enj enj1, int i1)
    {
        boolean flag;
        if (enj1.ao.b() || enj1.ap.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 == 0 && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (enj1.ap.b() && (enj1.ad instanceof HideableHeadersListView))
        {
            ((HideableHeadersListView)enj1.ad).a();
        }
        if (i1 == 0 && !flag)
        {
            enj1.af.setVisibility(8);
            enj1.ae.setVisibility(0);
            enj1.aq.a(false);
            enj1.am.a(new int[] {
                1
            });
        } else
        if (flag && enj1.ao.b())
        {
            enj1.af.setVisibility(8);
            enj1.ae.setVisibility(8);
            enj1.aq.a(false);
            enj1.am.b(new int[] {
                1
            });
            enj1.ag.a(enj1.a(0x7f0803de, new Object[] {
                enj1.ab
            }));
        } else
        if (flag && enj1.ap.b())
        {
            enj1.af.setVisibility(0);
            enj1.ae.setVisibility(8);
            enj1.aq.a(false);
            enj1.am.a(new int[] {
                1
            });
        } else
        {
            enj1.af.setVisibility(8);
            enj1.ae.setVisibility(8);
            enj1.aq.a(true);
            enj1.am.a(new int[] {
                1
            });
            enj1.am.d(0);
        }
        if (i1 != 0 && enj1.ap.b())
        {
            enj1.am.b(new int[] {
                2
            });
            return;
        } else
        {
            enj1.am.a(new int[] {
                2
            });
            return;
        }
    }

    static Verified b(enj enj1)
    {
        return enj1.ak;
    }

    static Parcelable c(enj enj1)
    {
        return enj1.ai;
    }

    static ListView d(enj enj1)
    {
        return enj1.ad;
    }

    static Parcelable e(enj enj1)
    {
        enj1.ai = null;
        return null;
    }

    static fom f(enj enj1)
    {
        return enj1.aq;
    }

    static os g(enj enj1)
    {
        return enj1.an;
    }

    static void h(enj enj1)
    {
        if (enj1.o())
        {
            enj1.u().b(0x7f110074, null, enj1.az);
        }
    }

    static eop i(enj enj1)
    {
        return enj1.ap;
    }

    static gfp j(enj enj1)
    {
        return enj1.ac;
    }

    static gin k(enj enj1)
    {
        return enj1.al;
    }

    static LoadingView l(enj enj1)
    {
        return enj1.ah;
    }

    static gdd m(enj enj1)
    {
        return enj1.ar;
    }

    static gjf n(enj enj1)
    {
        return enj1.as;
    }

    static String o(enj enj1)
    {
        return enj1.ab;
    }

    public final void A()
    {
        super.A();
        ao.a();
        aj.b();
    }

    public final void B()
    {
        super.B();
        ap.a();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "collection:playlists";
    }

    public final Fragment a(String s, String s1)
    {
        s = new SpotifyLink(s);
        new foe();
        return foe.a(s, s1, av, FeatureIdentifier.n).F();
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        av = fyw.a(this);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        an = new ftf(k(), at);
        ag = eoo.a(k(), "");
        Object obj = layoutinflater.inflate(0x7f030050, null);
        ((View) (obj)).findViewById(0x7f11025e).setOnClickListener(ax);
        am = new ftg(k());
        am.a(an, null, 0);
        am.a(new ftm(ag, false), null, 1);
        am.a(new ftm(((View) (obj)), false), null, 2);
        am.d(0);
        am.a(new int[] {
            1, 2
        });
        ad = (ListView)viewgroup.findViewById(0x102000a);
        obj = (ViewGroup)ad.getParent();
        ad.setTag("playlists");
        ah = LoadingView.a(LayoutInflater.from(k()), k(), ad);
        ((ViewGroup) (obj)).addView(ah);
        ad.setVisibility(4);
        ae = eoo.a(k());
        ae.setVisibility(8);
        ((ViewGroup) (obj)).addView(ae);
        af = eoo.a(k(), ax);
        af.setVisibility(8);
        ((ViewGroup) (obj)).addView(af);
        ao = FilterHeaderView.a(layoutinflater, ab, Z, ac, ap.e, ay, ad);
        ao.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        ao.a(ak, "playlists");
        ao.a(0x7f0802f3);
        ad.setAdapter(am);
        ad.setFastScrollEnabled(true);
        ad.setOnItemLongClickListener(new fuf(k()));
        a(((android.widget.ListAdapter) (am)));
        aq = new fom(this, this, viewgroup);
        aq.a(bundle);
        as.a();
        ah.a();
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080401);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (g() != null)
        {
            au = g().getBoolean("can_download", false);
        }
        a(true);
        av = fyw.a(this);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ab = bundle.getString("filter");
            if (bundle.containsKey("list"))
            {
                ai = bundle.getParcelable("list");
            }
        }
        al = ((giq)dmz.a(giq)).b(k());
        ac = gfp.a(al, Y, aa, Z);
        if (ab == null)
        {
            ab = "";
        }
        if (ac == null)
        {
            ac = aa;
        }
        ak = ViewUri.bl;
        as = gjf.a(k(), ak.toString());
        as.c(bundle);
        aj = ggn.a(k(), ak);
        ar = new gdd(1, new gde() {

            private enj a;

            public final void a()
            {
                if (enj.c(a) != null)
                {
                    enj.d(a).onRestoreInstanceState(enj.c(a));
                    enj.e(a);
                }
                if (enj.f(a).b())
                {
                    Cursor cursor = enj.g(a).a();
                    if (cursor != null)
                    {
                        int i1 = cursor.getPosition();
                        if (cursor.moveToFirst())
                        {
                            enj.f(a).a(cursor.getString(3), cursor.getString(1), true);
                            cursor.moveToPosition(i1);
                        }
                    }
                }
            }

            
            {
                a = enj.this;
                super();
            }
        });
        ap = new eop(k(), ak, "playlists", au, al, eop.d);
        ap.f = aw;
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        aq.a(menu);
        fzr.a(k(), menu, ak, av);
    }

    public final void a(ListView listview, View view, int i1, long l1)
    {
        listview = ((ListView) (view.getTag()));
        if (!(listview instanceof doc))
        {
            return;
        }
        i1 = am.b(i1 - 1);
        switch (i1)
        {
        default:
            Assertion.a((new StringBuilder("Section id unknown: ")).append(i1).toString());
            return;

        case 0: // '\0'
            listview = (doc)listview;
            break;
        }
        if (listview.t() && !TextUtils.isEmpty(listview.a()))
        {
            fop.a(k(), ak, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ClientEventFactory.a("playlists", com.spotify.mobile.android.util.ClientEvent.SubEvent.au, listview.a(), Long.valueOf(l1)));
            if (aq.a())
            {
                aq.a(listview.a(), listview.b(), false);
                return;
            } else
            {
                a(gms.a(k(), listview.a()).a(listview.b()).a);
                return;
            }
        } else
        {
            dmz.a(ggc);
            ggc.a(k(), 0x7f08057b);
            return;
        }
    }

    public final void a(String s)
    {
        ((ftf)an).a(s);
        J();
    }

    public final void c()
    {
        super.c();
        u().a(0x7f110074, null, az);
    }

    public final void d()
    {
        super.d();
        u().a(0x7f110074);
    }

    public final void e()
    {
        FilterHeaderView.a(ao);
        if (ad instanceof HideableHeadersListView)
        {
            ((HideableHeadersListView)ad).a(ao);
        } else
        {
            ad.removeHeaderView(ao);
        }
        if (as.e())
        {
            as.c();
        }
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("filter", ab);
        if (ad != null)
        {
            bundle.putParcelable("list", ad.onSaveInstanceState());
        }
        aq.b(bundle);
        as.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.n;
    }

    public final void z()
    {
        super.z();
        aj.a();
        J();
    }

    static 
    {
        b = ViewUri.bl.toString();
        aa = new gfp("", 0x7f08051f, false);
        ArrayList arraylist = new ArrayList();
        Z = arraylist;
        arraylist.add(aa);
        Z.add(new gfp("name", 0x7f080521));
        Z.add(new gfp("most_played_rank", 0x7f080523, false));
    }
}

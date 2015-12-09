// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.adapter.AlbumsAdapter;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.HideableHeadersListView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;

public final class eng extends Fragment
    implements foo, fxy
{

    private static final gip Y = gip.b("albums_sort_order");
    private static final gip Z = gip.b("albums_hide_incomplete_albums");
    public static final String a;
    private static final com.spotify.mobile.android.ui.adapter.AlbumsAdapter.Options aw = new com.spotify.mobile.android.ui.adapter.AlbumsAdapter.Options() {

        public final com.spotify.mobile.android.ui.adapter.AlbumsAdapter.Options.ArtistViewType a()
        {
            return com.spotify.mobile.android.ui.adapter.AlbumsAdapter.Options.ArtistViewType.b;
        }

        public final boolean b()
        {
            return true;
        }

    };
    private android.view.View.OnClickListener aA;
    private gas aB;
    private gdl aC;
    private android.widget.AdapterView.OnItemClickListener aD;
    private String aa;
    private gfp ab;
    private ListView ac;
    private View ad;
    private View ae;
    private EmptyView af;
    private Parcelable ag;
    private eop ah;
    private gdk ai;
    private ggl aj;
    private Verified ak;
    private gin al;
    private AlbumsAdapter am;
    private ftg an;
    private LoadingView ao;
    private ftb ap;
    private eno aq;
    private boolean ar;
    private fom as;
    private fop at;
    private gjf au;
    private final fuj av = new fuj() {

        private eng a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (dnv)obj;
            fve.a(a.k()).b(((dnv) (obj)).a(), ((dnv) (obj)).h()).a(eng.b(a)).a(true).a().b(true).a(eng.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = eng.this;
                super();
            }
    };
    private Flags ax;
    private enp ay;
    private eoq az;
    protected FilterHeaderView b;

    public eng()
    {
        at = (fop)dmz.a(fop);
        ay = new enp() {

            private eng a;

            public final void a(Cursor cursor)
            {
                boolean flag1 = true;
                eng.c(a).b(cursor);
                if (cursor != null)
                {
                    if (cursor.moveToFirst())
                    {
                        eng.a(a, cursor.getString(3), cursor.getString(1));
                    }
                    boolean flag;
                    if (a.b.b() || eng.d(a).b() || eng.e(a).a)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (duc.a(cursor))
                    {
                        eng eng1 = a;
                        int i1 = cursor.getCount();
                        if (cursor.getCount() != 0 || !flag)
                        {
                            flag1 = false;
                        }
                        eng.a(eng1, i1, flag1);
                    }
                    if (cursor.getCount() > 0)
                    {
                        eng.f(a);
                    }
                    if (eng.g(a).e())
                    {
                        eng.g(a).b();
                        return;
                    }
                }
            }

            
            {
                a = eng.this;
                super();
            }
        };
        az = new eoq() {

            private eng a;

            public final void a()
            {
                eng.h(a);
            }

            
            {
                a = eng.this;
                super();
            }
        };
        aA = new android.view.View.OnClickListener() {

            private eng a;

            public final void onClick(View view)
            {
                if (eng.e(a).a)
                {
                    eng.e(a).a(a.k());
                }
                eng.d(a).a(a.k());
            }

            
            {
                a = eng.this;
                super();
            }
        };
        aB = new gas() {

            private eng a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                eng.a(a, gfp1);
                eng.k(a).b().a(eng.a(), eng.j(a).a()).b();
                eng.i(a).c = gfp1;
                ftb ftb1 = eng.l(a);
                boolean flag;
                if ("time_added".equals(gfp1.a) || "most_played_rank".equals(gfp1.a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ftb1.a = flag;
                eng.h(a);
            }

            public final void a(String s)
            {
                eng.a(a, s);
                eng.i(a).b = s;
                eng.h(a);
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = eng.this;
                super();
            }
        };
        aC = new gdl() {

            private eng a;

            public final void a(Context context, gdk gdk1)
            {
                eng.k(a).b().a(eng.H(), gdk1.a).b();
                if (gdk1.a)
                {
                    gdk1 = com.spotify.mobile.android.util.ClientEvent.SubEvent.bM;
                } else
                {
                    gdk1 = com.spotify.mobile.android.util.ClientEvent.SubEvent.bN;
                }
                dmz.a(fop);
                fop.a(context, eng.b(a), ClientEventFactory.a("albums", gdk1, null, null));
                eng.h(a);
            }

            
            {
                a = eng.this;
                super();
            }
        };
        aD = new android.widget.AdapterView.OnItemClickListener() {

            private eng a;

            public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
label0:
                {
label1:
                    {
                        adapterview = ((AdapterView) (view.getTag()));
                        if (adapterview instanceof dnv)
                        {
                            adapterview = (dnv)adapterview;
                            if (adapterview.c().length() <= 0)
                            {
                                break label0;
                            }
                            eng.m(a);
                            fop.a(a.k(), eng.b(a), ClientEventFactory.a("albums", com.spotify.mobile.android.util.ClientEvent.SubEvent.as, adapterview.c(), Long.valueOf(l1)));
                            if (!eng.n(a).a())
                            {
                                break label1;
                            }
                            eng.n(a).a(adapterview.c(), adapterview.h(), false);
                        }
                        return;
                    }
                    a.k().startActivity(gms.a(a.k(), adapterview.c()).a(adapterview.h()).a);
                    return;
                }
                dmz.a(ggc);
                ggc.a(a.k(), 0x7f080575);
            }

            
            {
                a = eng.this;
                super();
            }
        };
    }

    static gip H()
    {
        return Z;
    }

    private void J()
    {
        ((fpe)k()).a(this, k().getString(0x7f08018c));
        ((fpe)k()).P_();
    }

    static Flags a(eng eng1)
    {
        return eng1.ax;
    }

    public static eng a(Flags flags, boolean flag)
    {
        eng eng1 = new eng();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_sync", flag);
        eng1.f(bundle);
        fyw.a(eng1, flags);
        return eng1;
    }

    static gfp a(eng eng1, gfp gfp1)
    {
        eng1.ab = gfp1;
        return gfp1;
    }

    static gip a()
    {
        return Y;
    }

    static String a(eng eng1, String s)
    {
        eng1.aa = s;
        return s;
    }

    static void a(eng eng1, int i1, boolean flag)
    {
        eng1.an.d(0);
        eng1.ao.b();
        if ((eng1.ah.b() || eng1.ai.a) && (eng1.ac instanceof HideableHeadersListView))
        {
            ((HideableHeadersListView)eng1.ac).a();
        }
        if (i1 == 0 && !flag)
        {
            eng1.ad.setVisibility(8);
            eng1.ae.setVisibility(0);
            eng1.as.a(false);
            eng1.an.a(new int[] {
                1
            });
        } else
        if (flag && eng1.b.b())
        {
            eng1.ad.setVisibility(8);
            eng1.ae.setVisibility(8);
            eng1.as.a(false);
            eng1.an.b(new int[] {
                1
            });
            eng1.af.a(eng1.a(0x7f0803de, new Object[] {
                eng1.aa
            }));
        } else
        if (flag)
        {
            eng1.ad.setVisibility(0);
            eng1.ae.setVisibility(8);
            eng1.as.a(false);
            eng1.an.a(new int[] {
                1
            });
        } else
        {
            eng1.ad.setVisibility(8);
            eng1.ae.setVisibility(8);
            eng1.as.a(true);
            eng1.an.a(new int[] {
                1
            });
            eng1.an.d(0);
        }
        if (i1 != 0 && (eng1.ah.b() || eng1.ai.a))
        {
            eng1.an.b(new int[] {
                2
            });
            return;
        } else
        {
            eng1.an.a(new int[] {
                2
            });
            return;
        }
    }

    static void a(eng eng1, String s, String s1)
    {
        if (eng1.as.b())
        {
            eng1.as.a(s, s1, true);
        }
    }

    static Verified b(eng eng1)
    {
        return eng1.ak;
    }

    static AlbumsAdapter c(eng eng1)
    {
        return eng1.am;
    }

    static eop d(eng eng1)
    {
        return eng1.ah;
    }

    static gdk e(eng eng1)
    {
        return eng1.ai;
    }

    static void f(eng eng1)
    {
        if (eng1.ag != null)
        {
            eng1.ac.onRestoreInstanceState(eng1.ag);
            eng1.ag = null;
        }
    }

    static gjf g(eng eng1)
    {
        return eng1.au;
    }

    static void h(eng eng1)
    {
        if (eng1.o())
        {
            eng1.aq.a(eng1.ah.b(), eng1.ai.a);
            eng1 = eng1.aq;
            ((eno) (eng1)).a.b(0x7f11006e, null, ((eno) (eng1)).d);
        }
    }

    static eno i(eng eng1)
    {
        return eng1.aq;
    }

    static gfp j(eng eng1)
    {
        return eng1.ab;
    }

    static gin k(eng eng1)
    {
        return eng1.al;
    }

    static ftb l(eng eng1)
    {
        return eng1.ap;
    }

    static fop m(eng eng1)
    {
        return eng1.at;
    }

    static fom n(eng eng1)
    {
        return eng1.as;
    }

    public final void A()
    {
        super.A();
        b.a();
        aj.b();
    }

    public final void B()
    {
        super.B();
        ah.a();
        eno.f();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "collection:albums";
    }

    public final Fragment a(String s, String s1)
    {
        s = new SpotifyLink(s);
        new foe();
        s = foe.a(s, s1, ax, FeatureIdentifier.k).F();
        s.g().putBoolean("is_sub_fragment", true);
        return s;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ax = fyw.a(this);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        ac = (ListView)viewgroup.findViewById(0x102000a);
        ViewGroup viewgroup1 = (ViewGroup)ac.getParent();
        ae = eoo.b(k(), ((Boolean)ax.a(fys.N)).booleanValue());
        ae.setVisibility(8);
        viewgroup1.addView(ae);
        ad = eoo.a(k(), aA);
        ad.setVisibility(8);
        viewgroup1.addView(ad);
        af = eoo.a(k(), "");
        View view = layoutinflater.inflate(0x7f030050, null);
        view.findViewById(0x7f11025e).setOnClickListener(aA);
        an = new ftg(k());
        am = new AlbumsAdapter(k(), aw, av);
        ap = new ftb(k(), am, 20);
        ftb ftb1 = ap;
        boolean flag;
        if ("time_added".equals(ab.a) || "most_played_rank".equals(ab.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ftb1.a = flag;
        an.a(ap, null, 0);
        an.a(new ftm(af, false), null, 1);
        an.a(new ftm(view, false), null, 2);
        an.d(0);
        an.a(new int[] {
            1, 2
        });
        b = FilterHeaderView.a(layoutinflater, aa, eno.d(), ab, ah.e, aB, ac);
        b.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        b.a(ak, "albums");
        b.a(0x7f0802ef);
        ao = LoadingView.a(LayoutInflater.from(k()), k(), ac);
        viewgroup1.addView(ao);
        ac.setVisibility(4);
        ac.setAdapter(an);
        ac.setFastScrollEnabled(true);
        ac.setOnItemClickListener(aD);
        ac.setOnItemLongClickListener(new android.widget.AdapterView.OnItemLongClickListener() {

            private eng a;

            public final boolean onItemLongClick(AdapterView adapterview, View view1, int i1, long l1)
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
                a = eng.this;
                super();
            }
        });
        as = new fom(this, this, viewgroup);
        as.a(bundle);
        au.a();
        ao.a();
        aq.a();
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08018c);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (g() != null)
        {
            ar = g().getBoolean("can_sync", false);
        }
        a(true);
        ax = fyw.a(this);
        aq = new eno(k(), u(), ay);
        aa = "";
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            aa = bundle.getString("filter");
            if (bundle.containsKey("list"))
            {
                ag = bundle.getParcelable("list");
            }
        }
        al = ((giq)dmz.a(giq)).b(k());
        ab = gfp.a(al, Y, eno.e(), eno.d());
        if (aa == null)
        {
            aa = "";
        }
        if (ab == null)
        {
            ab = eno.e();
        }
        ak = ViewUri.bo;
        aj = ggn.a(k(), ak);
        au = gjf.a(k(), ak.toString());
        au.c(bundle);
        ah = new eop(k(), ak, "albums", ar, al, eop.a);
        ai = new gdk(aC, 0x7f0802c9);
        ai.a = al.a(Z, false);
        if (eom.a(ax))
        {
            ah.a(ai);
        }
        ah.f = az;
        aq.b = aa;
        aq.c = ab;
        aq.a(ah.b(), ai.a);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        as.a(menu);
    }

    public final void a(String s)
    {
        AlbumsAdapter albumsadapter = am;
        albumsadapter.c = s;
        albumsadapter.notifyDataSetChanged();
        J();
    }

    public final void c()
    {
        super.c();
        aq.a();
    }

    public final void d()
    {
        super.d();
        eno.c();
    }

    public final void e()
    {
        FilterHeaderView.a(b);
        if (ac instanceof HideableHeadersListView)
        {
            ((HideableHeadersListView)ac).a(b);
        } else
        {
            ac.removeHeaderView(b);
        }
        if (au.e())
        {
            au.c();
        }
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("filter", aa);
        as.b(bundle);
        if (ac != null)
        {
            bundle.putParcelable("list", ac.onSaveInstanceState());
        }
        eno.b();
        au.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.k;
    }

    public final void z()
    {
        super.z();
        aj.a();
        J();
    }

    static 
    {
        a = ViewUri.bo.toString();
    }
}

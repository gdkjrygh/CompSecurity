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
import android.view.ViewParent;
import android.widget.ListView;
import com.google.common.base.Optional;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.HideableHeadersListView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.ui.view.StickyHeaderView;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;

public final class enk extends al
    implements fxy
{

    private static final gip Y = gip.b("tracks_sort_order");
    private static final List Z;
    private static final ftt aC = new ftt() {

        public final boolean a()
        {
            return true;
        }

        public final boolean b()
        {
            return false;
        }

    };
    private static final gfp aa;
    public static final String b;
    private gjf aA;
    private final fuj aB = new fuj() {

        private enk a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (dnz)obj;
            fve.a(a.k()).a(((dnz) (obj)).e, ((dnz) (obj)).b).a(enk.b(a)).a(true).a(true).a(true).a(false, null).a(enk.a(a)).a(spotifycontextmenu);
        }

            
            {
                a = enk.this;
                super();
            }
    };
    private boolean aD;
    private Flags aE;
    private FeatureIdentifier aF;
    private Optional aG;
    private boolean aH;
    private ewh aI;
    private eoq aJ;
    private android.view.View.OnClickListener aK;
    private gap aL;
    private ggf aM;
    private gas aN;
    private android.view.View.OnClickListener aO;
    private an aP;
    private an aQ;
    private String ab;
    private gfp ac;
    private ListView ad;
    private View ae;
    private View af;
    private EmptyView ag;
    private Parcelable ah;
    private int ai;
    private gge aj;
    private ggl ak;
    private Verified al;
    private gin am;
    private int an;
    private eop ao;
    private gbv ap;
    private os aq;
    private ftg ar;
    private FilterHeaderView as;
    private View at;
    private DownloadHeaderView au;
    private LoadingView av;
    private int aw;
    private int ax;
    private fop ay;
    private fos az;

    public enk()
    {
        an = 1;
        ay = (fop)dmz.a(fop);
        az = (fos)dmz.a(fos);
        aJ = new eoq() {

            private enk a;

            public final void a()
            {
                enk.c(a);
            }

            
            {
                a = enk.this;
                super();
            }
        };
        aK = new android.view.View.OnClickListener() {

            private enk a;

            public final void onClick(View view)
            {
                enk.f(a).a(a.k());
            }

            
            {
                a = enk.this;
                super();
            }
        };
        aL = new gap() {

            private enk a;

            public final void a(boolean flag)
            {
                if (enk.g(a).b())
                {
                    ((ewa)enk.g(a).c()).a();
                }
                dmz.a(for);
                for.a(a.k(), dti.a, flag);
                if (enk.h(a) != null)
                {
                    enk.h(a).b();
                }
            }

            
            {
                a = enk.this;
                super();
            }
        };
        aM = new ggf() {

            private enk a;

            public final void a()
            {
                enk.a(a, -1);
            }

            public final void a(int i1)
            {
                if (enk.d(a) != null)
                {
                    i1 /= enk.i(a);
                    if (i1 > 0)
                    {
                        enk.a(a, i1 + enk.d(a).getHeaderViewsCount());
                        enk.d(a).setSelectionFromTop(enk.j(a), enk.k(a));
                    }
                }
            }

            
            {
                a = enk.this;
                super();
            }
        };
        aN = new gas() {

            private enk a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                enk.a(a, gfp1);
                enk.m(a).b().a(enk.H(), enk.l(a).a()).b();
                enk.c(a);
            }

            public final void a(String s1)
            {
                enk.a(a, s1);
                enk.c(a);
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = enk.this;
                super();
            }
        };
        aO = new android.view.View.OnClickListener() {

            private enk a;

            public final void onClick(View view)
            {
                enk.n(a);
                fop.a(a.k(), enk.b(a), ClientEventFactory.a("tracks", com.spotify.mobile.android.util.ClientEvent.SubEvent.X, null, null));
                view = dti.a(enk.o(a), enk.f(a).b());
                enk.q(a);
                u u1 = a.k();
                Verified verified = enk.b(a);
                com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
                FeatureIdentifier featureidentifier = FeatureIdentifier.s;
                FeatureIdentifier featureidentifier1 = enk.p(a);
                enk.a(a);
                fos.a(u1, verified, subview, featureidentifier, featureidentifier1, view);
            }

            
            {
                a = enk.this;
                super();
            }
        };
        aP = new an() {

            private enk a;

            public final da a(Bundle bundle)
            {
                bundle = dti.a(enk.o(a), enk.f(a).b());
                return new cu(a.k(), bundle, dnz.a, null, enk.l(a).a());
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                enk.r(a).b(((Cursor) (obj)));
                if (duc.a(((Cursor) (obj))))
                {
                    enk.w(a).d(0);
                    enk.x(a).b();
                    if (((Cursor) (obj)).getCount() == 0 && enk.y(a).b())
                    {
                        enk.z(a).a(a.a(0x7f0803de, new Object[] {
                            enk.o(a)
                        }));
                        enk.w(a).b(new int[] {
                            1
                        });
                    } else
                    {
                        enk.w(a).a(new int[] {
                            1
                        });
                    }
                    if (((Cursor) (obj)).getCount() != 0 && enk.f(a).b())
                    {
                        enk.w(a).b(new int[] {
                            2
                        });
                    } else
                    {
                        enk.w(a).a(new int[] {
                            2
                        });
                    }
                    ((fpe)a.k()).P_();
                }
                if (enk.f(a).b() && (enk.d(a) instanceof HideableHeadersListView))
                {
                    ((HideableHeadersListView)enk.d(a)).a();
                }
                enk.s(a);
                if (((Cursor) (obj)).getCount() <= 0) goto _L2; else goto _L1
_L1:
                if (enk.t(a) == null) goto _L4; else goto _L3
_L3:
                enk.d(a).onRestoreInstanceState(enk.t(a));
                enk.u(a);
_L6:
                enk.a(a, -1);
_L2:
                if (enk.v(a).e())
                {
                    enk.v(a).b();
                }
                return;
_L4:
                if (enk.j(a) > enk.d(a).getHeaderViewsCount())
                {
                    enk.d(a).setSelectionFromTop(enk.j(a), enk.k(a));
                }
                if (true) goto _L6; else goto _L5
_L5:
            }

            
            {
                a = enk.this;
                super();
            }
        };
        aQ = new an() {

            private final String a[] = {
                "offline_state", "sync_progress"
            };
            private enk b;

            public final da a(Bundle bundle)
            {
                bundle = dti.a;
                return new cu(b.k(), bundle, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    enk.b(b, ((Cursor) (obj)).getInt(0));
                    enk.c(b, ((Cursor) (obj)).getInt(1));
                    enk.A(b);
                    enk.e(b).a(enk.B(b), enk.C(b));
                    if (enk.h(b) != null && !com.spotify.mobile.android.provider.Metadata.OfflineSync.a(enk.B(b)))
                    {
                        enk.h(b).b();
                    }
                }
            }

            
            {
                b = enk.this;
                super();
            }
        };
    }

    static void A(enk enk1)
    {
        enk1.J();
    }

    static int B(enk enk1)
    {
        return enk1.aw;
    }

    static int C(enk enk1)
    {
        return enk1.ax;
    }

    static gip H()
    {
        return Y;
    }

    private void J()
    {
        ((fpe)k()).a(this, k().getString(0x7f0801af));
        ((fpe)k()).P_();
    }

    static int a(enk enk1, int i1)
    {
        enk1.ai = i1;
        return i1;
    }

    static Flags a(enk enk1)
    {
        return enk1.aE;
    }

    public static enk a(Flags flags, boolean flag)
    {
        enk enk1 = new enk();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_download", flag);
        enk1.f(bundle);
        fyw.a(enk1, flags);
        return enk1;
    }

    static gfp a(enk enk1, gfp gfp1)
    {
        enk1.ac = gfp1;
        return gfp1;
    }

    static String a(enk enk1, String s1)
    {
        enk1.ab = s1;
        return s1;
    }

    static int b(enk enk1, int i1)
    {
        enk1.aw = i1;
        return i1;
    }

    static Verified b(enk enk1)
    {
        return enk1.al;
    }

    static int c(enk enk1, int i1)
    {
        enk1.ax = i1;
        return i1;
    }

    static void c(enk enk1)
    {
        if (enk1.o())
        {
            enk1.u().b(0x7f110075, null, enk1.aP);
        }
    }

    static ListView d(enk enk1)
    {
        return enk1.ad;
    }

    static DownloadHeaderView e(enk enk1)
    {
        return enk1.au;
    }

    static eop f(enk enk1)
    {
        return enk1.ao;
    }

    static Optional g(enk enk1)
    {
        return enk1.aG;
    }

    static ewh h(enk enk1)
    {
        return enk1.aI;
    }

    static int i(enk enk1)
    {
        return enk1.an;
    }

    static int j(enk enk1)
    {
        return enk1.ai;
    }

    static int k(enk enk1)
    {
        if (enk1.at instanceof ShufflePlayHeaderView)
        {
            enk1 = (ShufflePlayHeaderView)enk1.at;
            if (((StickyHeaderView) (enk1)).f)
            {
                int i1 = enk1.getHeight();
                if (i1 == 0)
                {
                    enk1.measure(0, 0);
                    return enk1.getMeasuredHeight();
                } else
                {
                    return i1;
                }
            } else
            {
                return 0;
            }
        } else
        {
            return 0;
        }
    }

    static gfp l(enk enk1)
    {
        return enk1.ac;
    }

    static gin m(enk enk1)
    {
        return enk1.am;
    }

    static fop n(enk enk1)
    {
        return enk1.ay;
    }

    static String o(enk enk1)
    {
        return enk1.ab;
    }

    static FeatureIdentifier p(enk enk1)
    {
        return enk1.aF;
    }

    static fos q(enk enk1)
    {
        return enk1.az;
    }

    static os r(enk enk1)
    {
        return enk1.aq;
    }

    static void s(enk enk1)
    {
        byte byte0;
        boolean flag3;
        byte0 = 8;
        flag3 = true;
        if (!duc.a(enk1.aq.a())) goto _L2; else goto _L1
_L1:
        boolean flag1;
        boolean flag2;
        boolean flag;
        if (enk1.aq.getCount() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !enk1.as.b())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!enk1.ao.b() || !flag1) goto _L4; else goto _L3
_L3:
        enk1.ae.setVisibility(0);
        enk1.af.setVisibility(8);
_L6:
        flag2 = false;
_L7:
        View view;
        if (flag)
        {
            flag3 = false;
        }
        enk1.a(flag3);
        if (enk1.aI != null)
        {
            enk1.aI.b(flag2);
        }
_L2:
        return;
_L4:
        enk1.ae.setVisibility(8);
        view = enk1.af;
        if (flag1)
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        if (flag1) goto _L6; else goto _L5
_L5:
        flag2 = true;
          goto _L7
    }

    static Parcelable t(enk enk1)
    {
        return enk1.ah;
    }

    static Parcelable u(enk enk1)
    {
        enk1.ah = null;
        return null;
    }

    static gjf v(enk enk1)
    {
        return enk1.aA;
    }

    static ftg w(enk enk1)
    {
        return enk1.ar;
    }

    static LoadingView x(enk enk1)
    {
        return enk1.av;
    }

    static FilterHeaderView y(enk enk1)
    {
        return enk1.as;
    }

    static EmptyView z(enk enk1)
    {
        return enk1.ag;
    }

    public final void A()
    {
        super.A();
        as.a();
        ak.b();
    }

    public final void B()
    {
        super.B();
        ao.a();
        if (aI != null)
        {
            aI.a();
        }
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "collection:tracks";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aE = fyw.a(this);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        ar = new ftg(k());
        aq = new fts(k(), aC, aB, aE);
        ad = (ListView)viewgroup.findViewById(0x102000a);
        bundle = (ViewGroup)ad.getParent().getParent();
        Object obj = (ViewGroup)ad.getParent();
        af = eoo.a(k(), ((Boolean)aE.a(fys.N)).booleanValue());
        af.setVisibility(8);
        bundle.addView(af);
        ae = eoo.a(k(), aK);
        ae.setVisibility(8);
        bundle.addView(ae);
        ag = eoo.a(k(), "");
        Object obj1 = layoutinflater.inflate(0x7f030050, null);
        ((View) (obj1)).findViewById(0x7f11025e).setOnClickListener(aK);
        ar.a(aq, null, 0);
        ar.a(new ftm(ag, false), null, 1);
        ar.a(new ftm(((View) (obj1)), false), null, 2);
        ar.d(0);
        ar.a(new int[] {
            1, 2
        });
        as = FilterHeaderView.a(layoutinflater, ab, Z, ac, ao.e, aN, ad);
        as.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        as.a(al, "tracks");
        as.a(0x7f0802f4);
        au = (DownloadHeaderView)gaw.a(k());
        au.c = aL;
        au.d = aG;
        layoutinflater = gaw.b(k());
        if (ggi.a(k()))
        {
            at = ShufflePlayHeaderView.a(k(), ad, aO);
            ((ShufflePlayHeaderView)at).a = true;
            ((ShufflePlayHeaderView)at).a(true, aE);
            layoutinflater.addView(((StickyHeaderView) ((ShufflePlayHeaderView)at)).c);
        }
        layoutinflater.addView(au);
        ad.addHeaderView(layoutinflater, null, false);
        av = LoadingView.a(LayoutInflater.from(k()), k(), ((View) (obj)));
        bundle.addView(av);
        ((ViewGroup) (obj)).setVisibility(4);
        ad.setAdapter(ar);
        ad.setFastScrollEnabled(true);
        ad.setOnItemLongClickListener(new fuf(k()));
        aA.a();
        av.a();
        layoutinflater = k();
        bundle = ((giq)dmz.a(giq)).b(layoutinflater);
        obj = new ewi(viewgroup) {

            private ViewGroup a;
            private enk b;

            public final ListView a()
            {
                return enk.d(b);
            }

            public final ViewGroup b()
            {
                return a;
            }

            public final DownloadHeaderView c()
            {
                return enk.e(b);
            }

            
            {
                b = enk.this;
                a = viewgroup;
                super();
            }
        };
        obj1 = al;
        Flags flags = aE;
        new ewg();
        aI = new ewh(layoutinflater, ((ewi) (obj)), bundle, ((Verified) (obj1)), flags);
        aI.a(aH);
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f0801af);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(false);
        if (g() != null)
        {
            aD = g().getBoolean("can_download", false);
        }
        aE = fyw.a(this);
        aF = gnl.a(this);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ab = bundle.getString("filter");
            if (bundle.containsKey("list"))
            {
                ah = bundle.getParcelable("list");
            }
        }
        am = ((giq)dmz.a(giq)).b(k());
        ac = gfp.a(am, Y, aa, Z);
        ai = -1;
        Bundle bundle1 = g();
        if (bundle1 != null)
        {
            if (ab == null && bundle1.containsKey("filter"))
            {
                ab = bundle1.getString("filter");
            }
            if (bundle1.containsKey("sort_order"))
            {
                ac = gfp.a(bundle1.getString("sort_order"), Z);
            }
        }
        if (ab == null)
        {
            ab = "";
        }
        if (ac == null)
        {
            ac = aa;
        }
        al = ViewUri.br;
        aA = gjf.a(k(), al.toString());
        aA.c(bundle);
        ak = ggn.a(k(), al);
        ao = new eop(k(), al, "tracks", aD, am, eop.c);
        ao.f = aJ;
        ap = new gbv();
        aG = ewb.a(k(), aE, al);
        boolean flag;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aH = flag;
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        if (ggi.b(k()) && aq != null && aq.getCount() > 0)
        {
            at = fzr.a(k(), menu, al, FeatureIdentifier.s, aF, dti.a(ab, ao.b()));
        }
        menuinflater = k();
        Verified verified = al;
        android.net.Uri uri = dti.a;
        com.spotify.mobile.android.util.SpotifyLink.LinkType linktype = com.spotify.mobile.android.util.SpotifyLink.LinkType.u;
        fzt.a(menuinflater, menu, verified, uri, aw, ax, aG);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
    }

    public final void a(ListView listview, View view, int i1, long l1)
    {
        int j1 = ad.getHeaderViewsCount();
        switch (ar.b(i1 - j1))
        {
        default:
            return;

        case 0: // '\0'
            listview = dti.a(ab, ao.b());
            break;
        }
        view = (doe)view.getTag();
        if (gex.a(aE))
        {
            fop.a(k(), al, ClientEventFactory.a("tracks", com.spotify.mobile.android.util.ClientEvent.SubEvent.ah, view.e(), Long.valueOf(l1)));
            fos.a(k(), al, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, FeatureIdentifier.s, aF, listview, l1, aE);
            return;
        }
        fop.a(k(), al, ClientEventFactory.a("tracks", com.spotify.mobile.android.util.ClientEvent.SubEvent.ai, view.e(), Long.valueOf(l1)));
        if (at instanceof ShufflePlayHeaderView)
        {
            ((ShufflePlayHeaderView)at).a();
            return;
        } else
        {
            ShufflePlayHeaderView.a(ap, at);
            return;
        }
    }

    public final void c()
    {
        super.c();
        u().a(0x7f11006a, null, aQ);
        u().a(0x7f110075, null, aP);
    }

    public final void d()
    {
        super.d();
        u().a(0x7f11006a);
        u().a(0x7f110075);
        if (aI != null)
        {
            aI.b(false);
        }
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        if (g() != null && g().getString("lookup_track_uri") != null)
        {
            aj = new gge(k(), u(), 0x7f110076, aM);
            bundle = dti.a();
            String s1 = g().getString("lookup_track_uri");
            aj.a(bundle, s1, ac.a());
        }
    }

    public final void e()
    {
        FilterHeaderView.a(as);
        if (ad instanceof HideableHeadersListView)
        {
            ((HideableHeadersListView)ad).a(as);
        } else
        {
            ad.removeHeaderView(as);
        }
        if (aA.e())
        {
            aA.c();
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
        aA.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.s;
    }

    public final void z()
    {
        super.z();
        ak.a();
        J();
    }

    static 
    {
        b = ViewUri.br.toString();
        aa = new gfp("time_added", 0x7f080522);
        ArrayList arraylist = new ArrayList();
        Z = arraylist;
        arraylist.add(new gfp("name", 0x7f080524));
        Z.add(aa);
    }
}

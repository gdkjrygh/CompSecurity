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
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.model.Artist;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.HideableHeadersListView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;

public final class eni extends Fragment
    implements foo, fxy
{

    private static final List Y;
    private static final gfp Z;
    public static final String a;
    private static final gip b = gip.b("artists_sort_order");
    private String aa;
    private gfp ab;
    private ListView ac;
    private View ad;
    private View ae;
    private EmptyView af;
    private Parcelable ag;
    private eop ah;
    private ggl ai;
    private Verified aj;
    private gin ak;
    private emq al;
    private ftg am;
    private FilterHeaderView an;
    private LoadingView ao;
    private ftb ap;
    private fom aq;
    private fop ar;
    private gjf as;
    private boolean at;
    private Flags au;
    private eoq av;
    private android.view.View.OnClickListener aw;
    private gas ax;
    private android.widget.AdapterView.OnItemClickListener ay;
    private an az;

    public eni()
    {
        ar = (fop)dmz.a(fop);
        av = new eoq() {

            private eni a;

            public final void a()
            {
                eni.a(a);
            }

            
            {
                a = eni.this;
                super();
            }
        };
        aw = new android.view.View.OnClickListener() {

            private eni a;

            public final void onClick(View view)
            {
                eni.b(a).a(a.k());
            }

            
            {
                a = eni.this;
                super();
            }
        };
        ax = new gas() {

            private eni a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                eni.a(a, gfp1);
                eni.d(a).b().a(eni.a(), eni.c(a).a()).b();
                ftb ftb1 = eni.e(a);
                boolean flag;
                if ("time_added".equals(gfp1.a) || "most_played_rank".equals(gfp1.a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ftb1.a = flag;
                eni.a(a);
            }

            public final void a(String s1)
            {
                eni.a(a, s1);
                eni.a(a);
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = eni.this;
                super();
            }
        };
        ay = new android.widget.AdapterView.OnItemClickListener() {

            private eni a;

            public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
label0:
                {
                    adapterview = ((AdapterView) (view.getTag()));
                    if (adapterview instanceof Artist)
                    {
                        view = (Artist)adapterview;
                        eni.g(a);
                        fop.a(a.k(), eni.f(a), ClientEventFactory.a("artists", com.spotify.mobile.android.util.ClientEvent.SubEvent.at, ((Artist) (view)).e, Long.valueOf(l1)));
                        adapterview = ((Artist) (view)).f;
                        if (((Artist) (view)).c == 0 || TextUtils.isEmpty(((Artist) (view)).f) || eom.c(eni.h(a)))
                        {
                            adapterview = ((Artist) (view)).e;
                        }
                        if (!eni.i(a).a())
                        {
                            break label0;
                        }
                        eni.i(a).a(adapterview, ((Artist) (view)).d, false);
                    }
                    return;
                }
                a.a(gms.a(a.k(), adapterview).a(((Artist) (view)).d).a);
            }

            
            {
                a = eni.this;
                super();
            }
        };
        az = new an() {

            private eni a;

            public final da a(Bundle bundle)
            {
                bundle = dti.b(eni.s(a), eni.b(a).b());
                return new cu(a.k(), bundle, dnx.a, null, eni.c(a).a());
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (eni.i(a).b() && ((Cursor) (obj)).moveToFirst())
                {
                    eni.i(a).a(((Cursor) (obj)).getString(3), ((Cursor) (obj)).getString(1), true);
                }
                eni.j(a).b(((Cursor) (obj)));
                eni.p(a).d(0);
                if (duc.a(((Cursor) (obj))))
                {
                    eni.q(a).b();
                    if (((Cursor) (obj)).getCount() == 0 && eni.r(a).b())
                    {
                        eni.t(a).a(a.a(0x7f0803de, new Object[] {
                            eni.s(a)
                        }));
                        eni.p(a).b(new int[] {
                            1
                        });
                    } else
                    {
                        eni.p(a).a(new int[] {
                            1
                        });
                    }
                    if (((Cursor) (obj)).getCount() != 0 && eni.b(a).b())
                    {
                        eni.p(a).b(new int[] {
                            2
                        });
                    } else
                    {
                        eni.p(a).a(new int[] {
                            2
                        });
                    }
                }
                if (eni.b(a).b() && (eni.k(a) instanceof HideableHeadersListView))
                {
                    ((HideableHeadersListView)eni.k(a)).a();
                }
                eni.l(a);
                if (eni.m(a) != null && ((Cursor) (obj)).getCount() > 0)
                {
                    eni.k(a).onRestoreInstanceState(eni.m(a));
                    eni.n(a);
                }
                if (eni.o(a).e())
                {
                    eni.o(a).b();
                }
            }

            
            {
                a = eni.this;
                super();
            }
        };
    }

    private void H()
    {
        ((fpe)k()).a(this, k().getString(0x7f080191));
        ((fpe)k()).P_();
    }

    public static eni a(Flags flags, boolean flag)
    {
        eni eni1 = new eni();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_sync", flag);
        eni1.f(bundle);
        fyw.a(eni1, flags);
        return eni1;
    }

    static gfp a(eni eni1, gfp gfp1)
    {
        eni1.ab = gfp1;
        return gfp1;
    }

    static gip a()
    {
        return b;
    }

    static String a(eni eni1, String s1)
    {
        eni1.aa = s1;
        return s1;
    }

    static void a(eni eni1)
    {
        if (eni1.o())
        {
            eni1.u().b(0x7f110073, null, eni1.az);
        }
    }

    static eop b(eni eni1)
    {
        return eni1.ah;
    }

    static gfp c(eni eni1)
    {
        return eni1.ab;
    }

    static gin d(eni eni1)
    {
        return eni1.ak;
    }

    static ftb e(eni eni1)
    {
        return eni1.ap;
    }

    static Verified f(eni eni1)
    {
        return eni1.aj;
    }

    static fop g(eni eni1)
    {
        return eni1.ar;
    }

    static Flags h(eni eni1)
    {
        return eni1.au;
    }

    static fom i(eni eni1)
    {
        return eni1.aq;
    }

    static emq j(eni eni1)
    {
        return eni1.al;
    }

    static ListView k(eni eni1)
    {
        return eni1.ac;
    }

    static void l(eni eni1)
    {
        byte byte0;
        boolean flag1;
        flag1 = true;
        byte0 = 8;
        if (!duc.a(eni1.al.a())) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (eni1.al.getCount() == 0 && !eni1.an.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!eni1.ah.b() || !flag) goto _L4; else goto _L3
_L3:
        eni1.ad.setVisibility(0);
        eni1.ae.setVisibility(8);
        eni1 = eni1.aq;
_L8:
        flag1 = false;
_L6:
        eni1.a(flag1);
_L2:
        return;
_L4:
        Object obj;
        eni1.ad.setVisibility(8);
        obj = eni1.ae;
        if (flag)
        {
            byte0 = 0;
        }
        ((View) (obj)).setVisibility(byte0);
        obj = eni1.aq;
        eni1 = ((eni) (obj));
        if (!flag) goto _L6; else goto _L5
_L5:
        eni1 = ((eni) (obj));
        if (true) goto _L8; else goto _L7
_L7:
    }

    static Parcelable m(eni eni1)
    {
        return eni1.ag;
    }

    static Parcelable n(eni eni1)
    {
        eni1.ag = null;
        return null;
    }

    static gjf o(eni eni1)
    {
        return eni1.as;
    }

    static ftg p(eni eni1)
    {
        return eni1.am;
    }

    static LoadingView q(eni eni1)
    {
        return eni1.ao;
    }

    static FilterHeaderView r(eni eni1)
    {
        return eni1.an;
    }

    static String s(eni eni1)
    {
        return eni1.aa;
    }

    static EmptyView t(eni eni1)
    {
        return eni1.af;
    }

    public final void A()
    {
        super.A();
        an.a();
        ai.b();
    }

    public final void B()
    {
        super.B();
        ah.a();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "collection:artists";
    }

    public final Fragment a(String s1, String s2)
    {
        s1 = new SpotifyLink(s1);
        new foe();
        s1 = foe.a(s1, s2, au, FeatureIdentifier.m).F();
        s1.g().putBoolean("is_sub_fragment", true);
        return s1;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        au = fyw.a(this);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        al = new emq(k(), au);
        ac = (ListView)viewgroup.findViewById(0x102000a);
        ViewGroup viewgroup1 = (ViewGroup)ac.getParent();
        ae = eoo.c(k(), ((Boolean)au.a(fys.N)).booleanValue());
        ae.setVisibility(8);
        viewgroup1.addView(ae);
        ad = eoo.a(k(), aw);
        ad.setVisibility(8);
        viewgroup1.addView(ad);
        af = eoo.a(k(), "");
        View view = layoutinflater.inflate(0x7f030050, null);
        view.findViewById(0x7f11025e).setOnClickListener(aw);
        am = new ftg(k());
        ap = new ftb(k(), al, 14);
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
        am.a(ap, null, 0);
        am.a(new ftm(af, false), null, 1);
        am.a(new ftm(view, false), null, 2);
        am.d(0);
        am.a(new int[] {
            1, 2
        });
        an = FilterHeaderView.a(layoutinflater, aa, Y, ab, ah.e, ax, ac);
        an.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        an.a(aj, "artists");
        an.a(0x7f0802f0);
        ao = LoadingView.a(LayoutInflater.from(k()), k(), ac);
        viewgroup1.addView(ao);
        ac.setVisibility(4);
        ac.setAdapter(am);
        ac.setChoiceMode(0);
        ac.setFastScrollEnabled(true);
        ac.setOnItemClickListener(ay);
        ac.setOnItemLongClickListener(new fuf(k()));
        aq = new fom(this, this, viewgroup);
        aq.a(bundle);
        as.a();
        ao.a();
        return viewgroup;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080191);
    }

    public final void a(Bundle bundle)
    {
        boolean flag = true;
        super.a(bundle);
        if (g() != null)
        {
            at = g().getBoolean("can_sync", false);
        }
        a(true);
        au = fyw.a(this);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            aa = bundle.getString("filter");
            if (bundle.containsKey("list"))
            {
                ag = bundle.getParcelable("list");
            }
        }
        ak = ((giq)dmz.a(giq)).b(k());
        ab = gfp.a(ak, b, Z, Y);
        if (aa == null)
        {
            aa = "";
        }
        if (ab == null)
        {
            ab = Z;
        }
        aj = ViewUri.bn;
        as = gjf.a(k(), aj.toString());
        as.c(bundle);
        ai = ggn.a(k(), aj);
        if (!at || eom.c(au))
        {
            flag = false;
        }
        ah = new eop(k(), aj, "artists", flag, ak, eop.b);
        ah.f = av;
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        aq.a(menu);
    }

    public final void a(String s1)
    {
        emq emq1 = al;
        emq1.c = s1;
        emq1.notifyDataSetChanged();
        H();
    }

    public final void c()
    {
        super.c();
        u().a(0x7f110073, null, az);
    }

    public final void d()
    {
        super.d();
        u().a(0x7f110073);
    }

    public final void e()
    {
        FilterHeaderView.a(an);
        if (ac instanceof HideableHeadersListView)
        {
            ((HideableHeadersListView)ac).a(an);
        } else
        {
            ac.removeHeaderView(an);
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
        bundle.putString("filter", aa);
        if (ac != null)
        {
            bundle.putParcelable("list", ac.onSaveInstanceState());
        }
        aq.b(bundle);
        as.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.m;
    }

    public final void z()
    {
        super.z();
        ai.a();
        H();
    }

    static 
    {
        a = ViewUri.bn.toString();
        Z = new gfp("name", 0x7f080521);
        ArrayList arraylist = new ArrayList();
        Y = arraylist;
        arraylist.add(Z);
        Y.add(new gfp("time_added", 0x7f080522));
        Y.add(new gfp("most_played_rank", 0x7f080523, false));
    }
}

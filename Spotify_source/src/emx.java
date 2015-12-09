// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.DataSetObserver;
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
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.HideableHeadersListView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;

public final class emx extends emz
    implements foo
{

    private static final gip aa = gip.b("artists_sort_order_new");
    private static final List ab;
    private static final gfp ac;
    private String ad;
    private gfp ae;
    private ListView af;
    private View ag;
    private View ah;
    private EmptyView ai;
    private Parcelable aj;
    private epf ak;
    private eop al;
    private emp am;
    private ftg an;
    private FilterHeaderView ao;
    private LoadingView ap;
    private fom aq;
    private boolean ar;
    private String as;
    private epg at;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver au;
    private gas av;
    private DataSetObserver aw;
    private eoq ax;
    private android.view.View.OnClickListener ay;
    private android.widget.AdapterView.OnItemClickListener az;

    public emx()
    {
        super(ViewUri.bn);
        at = new epg() {

            final emx a;

            public final void a(Object obj)
            {
                obj = (fip)obj;
                a.o();
                ((fip) (obj)).isLoading();
                int i1 = ((ent[])((fip) (obj)).getItems()).length;
                if (!a.o()) goto _L2; else goto _L1
_L1:
                byte byte0;
                boolean flag;
                if (((fip) (obj)).getUnrangedLength() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (((fip) (obj)).isLoading() && flag) goto _L2; else goto _L3
_L3:
                if (!flag && emx.a(a).b())
                {
                    obj = ((ent[])((fip) (obj)).getItems())[0];
                    emx.a(a).a(((ent) (obj)).getCollectionUri(), ((ent) (obj)).getName(), true);
                }
                a.R();
                a.O();
                if (emx.b(a).d())
                {
                    emx.b(a).b();
                }
                if (flag && !emx.c(a).b())
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                if (!emx.d(a).b() || byte0 == 0) goto _L5; else goto _L4
_L4:
                emx.e(a).setVisibility(0);
                obj = emx.f(a);
_L7:
                byte0 = 8;
_L8:
                ((View) (obj)).setVisibility(byte0);
                if (emx.d(a).b() && (emx.g(a) instanceof HideableHeadersListView))
                {
                    ((HideableHeadersListView)emx.g(a)).a();
                }
                if (flag && emx.c(a).b())
                {
                    emx.i(a).a(a.a(0x7f0803de, new Object[] {
                        emx.h(a)
                    }));
                    emx.j(a).b(new int[] {
                        1
                    });
                } else
                {
                    emx.j(a).a(new int[] {
                        1
                    });
                }
                if (!flag && emx.d(a).b())
                {
                    emx.j(a).b(new int[] {
                        2
                    });
                } else
                {
                    emx.j(a).a(new int[] {
                        2
                    });
                }
                a.P();
                a.a(emx.a(a).a());
                ((fpe)a.k()).P_();
                emx.g(a).post(new Runnable(this, flag) {

                    private boolean a;
                    private _cls1 b;

                    public final void run()
                    {
                        if (emx.k(b.a) != null && !a)
                        {
                            emx.g(b.a).onRestoreInstanceState(emx.k(b.a));
                            emx.l(b.a);
                        }
                    }

            
            {
                b = _pcls1;
                a = flag;
                super();
            }
                });
_L2:
                return;
_L5:
                emx.e(a).setVisibility(8);
                obj = emx.f(a);
                if (byte0 == 0) goto _L7; else goto _L6
_L6:
                byte0 = 0;
                  goto _L8
            }

            public final void a(String s)
            {
                emx.b(a).b();
                Logger.c("Failed to load list of artist %s", new Object[] {
                    s
                });
            }

            
            {
                a = emx.this;
                super();
            }
        };
        au = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private emx a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                if (playerstate != null)
                {
                    emx.m(a).a(playerstate.entityUri());
                }
                emx.m(a).a(null);
            }

            
            {
                a = emx.this;
                super();
            }
        };
        av = new gas() {

            private emx a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                emx.a(a, gfp1);
                ((emz) (a)).Y.b().a(emx.L(), emx.o(a).a()).b();
                emx.n(a).a(gfp1);
                emx.n(a);
                emx.M().equals(emx.o(a));
                emx.m(a).a(gfp1);
                gfp1 = emx.m(a);
                emx.M().equals(emx.o(a));
                gfp1.a(true);
                a.Q();
            }

            public final void a(String s)
            {
                emx.a(a, s);
                emx.n(a).b(emx.h(a));
                emx.m(a).c(emx.h(a));
                a.Q();
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = emx.this;
                super();
            }
        };
        aw = new DataSetObserver() {

            private emx a;

            public final void onChanged()
            {
                emx.j(a).d(0);
            }

            
            {
                a = emx.this;
                super();
            }
        };
        ax = new eoq() {

            private emx a;

            public final void a()
            {
                emx.n(a).a(false, emx.d(a).b(), false);
                emx.m(a).b(emx.d(a).b());
                a.Q();
            }

            
            {
                a = emx.this;
                super();
            }
        };
        ay = new android.view.View.OnClickListener() {

            private emx a;

            public final void onClick(View view)
            {
                emx.d(a).a(a.k());
            }

            
            {
                a = emx.this;
                super();
            }
        };
        az = new android.widget.AdapterView.OnItemClickListener() {

            private emx a;

            public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
label0:
                {
                    adapterview = ((AdapterView) (view.getTag()));
                    if (adapterview instanceof ent)
                    {
                        adapterview = (ent)adapterview;
                        a.a(ClientEventFactory.a("artists", com.spotify.mobile.android.util.ClientEvent.SubEvent.at, adapterview.getUri(), Long.valueOf(l1)));
                        view = eos.a(((emz) (a)).Z, adapterview);
                        if (!emx.a(a).a())
                        {
                            break label0;
                        }
                        emx.a(a).a(view, adapterview.getName(), false);
                    }
                    return;
                }
                a.a(gms.a(a.k(), view).a(adapterview.getName()).a);
            }

            
            {
                a = emx.this;
                super();
            }
        };
    }

    static gip L()
    {
        return aa;
    }

    static gfp M()
    {
        return ac;
    }

    public static emx a(Flags flags, boolean flag, String s)
    {
        emx emx1 = new emx();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_sync", flag);
        bundle.putString("username", s);
        emx1.f(bundle);
        fyw.a(emx1, flags);
        return emx1;
    }

    static fom a(emx emx1)
    {
        return emx1.aq;
    }

    static gfp a(emx emx1, gfp gfp1)
    {
        emx1.ae = gfp1;
        return gfp1;
    }

    static String a(emx emx1, String s)
    {
        emx1.ad = s;
        return s;
    }

    static LoadingView b(emx emx1)
    {
        return emx1.ap;
    }

    static FilterHeaderView c(emx emx1)
    {
        return emx1.ao;
    }

    static eop d(emx emx1)
    {
        return emx1.al;
    }

    static View e(emx emx1)
    {
        return emx1.ag;
    }

    static View f(emx emx1)
    {
        return emx1.ah;
    }

    static ListView g(emx emx1)
    {
        return emx1.af;
    }

    static String h(emx emx1)
    {
        return emx1.ad;
    }

    static EmptyView i(emx emx1)
    {
        return emx1.ai;
    }

    static ftg j(emx emx1)
    {
        return emx1.an;
    }

    static Parcelable k(emx emx1)
    {
        return emx1.aj;
    }

    static Parcelable l(emx emx1)
    {
        emx1.aj = null;
        return null;
    }

    static emp m(emx emx1)
    {
        return emx1.am;
    }

    static epf n(emx emx1)
    {
        return emx1.ak;
    }

    static gfp o(emx emx1)
    {
        return emx1.ae;
    }

    public final void A()
    {
        super.A();
        ao.a();
    }

    public final void B()
    {
        super.B();
        al.a();
    }

    protected final epf H()
    {
        return ak;
    }

    public final String I()
    {
        return "collection:artists";
    }

    protected final HeaderableAdapter J()
    {
        return am;
    }

    protected final epg K()
    {
        return at;
    }

    public final Fragment a(String s, String s1)
    {
        s = new SpotifyLink(s);
        new foe();
        s = foe.a(s, s1, super.Z, FeatureIdentifier.m).F();
        s.g().putBoolean("is_sub_fragment", true);
        return s;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        am = new emp(k(), new enn(k(), super.a, as), super.b, super.Z);
        am.a(ae);
        am.b(al.b());
        am.c(ad);
        Object obj = am;
        ac.equals(ae);
        ((HeaderableAdapter) (obj)).a(true);
        am.registerDataSetObserver(aw);
        af = (ListView)viewgroup.findViewById(0x102000a);
        obj = (ViewGroup)af.getParent();
        ah = eoo.c(k(), ((Boolean)super.Z.a(fys.N)).booleanValue());
        ah.setVisibility(8);
        ((ViewGroup) (obj)).addView(ah);
        ag = eoo.a(k(), ay);
        ag.setVisibility(8);
        ((ViewGroup) (obj)).addView(ag);
        ai = eoo.a(k(), "");
        View view = layoutinflater.inflate(0x7f030050, null);
        view.findViewById(0x7f11025e).setOnClickListener(ay);
        an = new ftg(k());
        an.a(am, null, 0);
        an.a(new ftm(ai, false), null, 1);
        an.a(new ftm(view, false), null, 2);
        an.d(0);
        an.a(new int[] {
            1, 2
        });
        if (ao == null)
        {
            ao = FilterHeaderView.a(layoutinflater, ad, ab, ae, al.e, av, af);
        }
        ao.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        ao.a(super.b, "artists");
        ao.a(0x7f0802f0);
        ap = LoadingView.a(LayoutInflater.from(k()), k(), af);
        ((ViewGroup) (obj)).addView(ap);
        af.setVisibility(4);
        af.setAdapter(an);
        af.setChoiceMode(0);
        af.setFastScrollEnabled(true);
        af.setOnItemClickListener(az);
        af.setOnItemLongClickListener(new fuf(k()));
        if (aq == null)
        {
            aq = new fom(this, this, viewgroup);
        }
        aq.a(bundle);
        ap.a();
        ak.a(bundle, at);
        am.a(bundle);
        am.a();
        return viewgroup;
    }

    protected final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver a()
    {
        return au;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080191);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(false);
        if (g() != null)
        {
            ar = g().getBoolean("can_sync", false);
            as = g().getString("username");
        }
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ad = bundle.getString("filter");
            if (bundle.containsKey("list"))
            {
                aj = bundle.getParcelable("list");
            }
        }
        ae = gfp.a(super.Y, aa, ac, ab);
        if (ad == null)
        {
            ad = "";
        }
        if (ae == null)
        {
            ae = ac;
        }
        if (al == null)
        {
            boolean flag;
            if (ar && !eom.c(super.Z))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            al = new eop(k(), super.b, "artists", flag, super.Y, eop.b);
        }
        al.f = ax;
        if (ak == null)
        {
            ak = new enn(k(), super.a, as);
        }
        ak.a(Integer.valueOf(0), Integer.valueOf(1));
        ak.a(ae);
        ak.a(false, al.b(), false);
        ak.b(ad);
        ac.equals(ae);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        aq.a(menu);
    }

    public final void a(String s)
    {
        am.b(s);
        P();
    }

    public final void e()
    {
        FilterHeaderView.a(ao);
        if (af instanceof HideableHeadersListView)
        {
            ((HideableHeadersListView)af).a(ao);
        } else
        {
            af.removeHeaderView(ao);
        }
        am.unregisterDataSetObserver(aw);
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("filter", ad);
        if (af != null)
        {
            bundle.putParcelable("list", af.onSaveInstanceState());
        }
        aq.b(bundle);
        if (ak != null)
        {
            ak.a(bundle);
        }
        if (am != null)
        {
            am.b(bundle);
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.m;
    }

    static 
    {
        ViewUri.bn.toString();
        ac = new gfp("name", 0x7f080521);
        Object obj = new ArrayList();
        ab = ((List) (obj));
        ((List) (obj)).add(ac);
        obj = ab;
        gfp gfp1 = new gfp("addTime", 0x7f080522);
        gfp1.d = new gfp("name");
        ((List) (obj)).add(gfp1);
        ab.add(new gfp("mostPlayedRank", 0x7f080523, false));
    }
}

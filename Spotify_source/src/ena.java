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

public final class ena extends emz
    implements foo
{

    private static final gip aa = gip.b("playlists_sort_order_new");
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
    private fdd am;
    private ftg an;
    private FilterHeaderView ao;
    private LoadingView ap;
    private fom aq;
    private boolean ar;
    private epg as;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver at;
    private gas au;
    private DataSetObserver av;
    private eoq aw;
    private android.view.View.OnClickListener ax;
    private android.widget.AdapterView.OnItemClickListener ay;

    public ena()
    {
        super(ViewUri.bl);
        as = new epg() {

            final ena a;

            public final void a(Object obj)
            {
                obj = (fip)obj;
                a.o();
                ((fip) (obj)).isLoading();
                int i1 = ((fdj[])((fip) (obj)).getItems()).length;
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
                if (!flag && ena.a(a).b())
                {
                    obj = ((fdj[])((fip) (obj)).getItems())[0];
                    ena.a(a).a(((fdj) (obj)).a(), ((fdj) (obj)).b(), true);
                }
                a.R();
                a.O();
                if (ena.b(a).d())
                {
                    ena.b(a).b();
                }
                if (flag && !ena.c(a).b())
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                if (!ena.d(a).b() || byte0 == 0) goto _L5; else goto _L4
_L4:
                ena.e(a).setVisibility(0);
                obj = ena.f(a);
_L7:
                byte0 = 8;
_L8:
                ((View) (obj)).setVisibility(byte0);
                if (ena.d(a).b() && (ena.g(a) instanceof HideableHeadersListView))
                {
                    ((HideableHeadersListView)ena.g(a)).a();
                }
                if (flag && ena.c(a).b())
                {
                    ena.i(a).a(a.a(0x7f0803de, new Object[] {
                        ena.h(a)
                    }));
                    ena.j(a).b(new int[] {
                        1
                    });
                } else
                {
                    ena.j(a).a(new int[] {
                        1
                    });
                }
                if (!flag && ena.d(a).b())
                {
                    ena.j(a).b(new int[] {
                        2
                    });
                } else
                {
                    ena.j(a).a(new int[] {
                        2
                    });
                }
                a.P();
                ((fpe)a.k()).P_();
                ena.g(a).post(new Runnable(this, flag) {

                    private boolean a;
                    private _cls1 b;

                    public final void run()
                    {
                        if (ena.k(b.a) != null && !a)
                        {
                            ena.g(b.a).onRestoreInstanceState(ena.k(b.a));
                            ena.l(b.a);
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
                ena.e(a).setVisibility(8);
                obj = ena.f(a);
                if (byte0 == 0) goto _L7; else goto _L6
_L6:
                byte0 = 0;
                  goto _L8
            }

            public final void a(String s)
            {
                ena.b(a).b();
                Logger.c("Failed to load list of playlist %s", new Object[] {
                    s
                });
            }

            
            {
                a = ena.this;
                super();
            }
        };
        at = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private ena a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                if (playerstate != null)
                {
                    ena.m(a).a(playerstate.entityUri());
                }
                ena.m(a).a(null);
            }

            
            {
                a = ena.this;
                super();
            }
        };
        au = new gas() {

            private ena a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                ena.a(a, gfp1);
                ((emz) (a)).Y.b().a(ena.L(), ena.o(a).a()).b();
                ena.n(a).a(gfp1);
                ena.n(a);
                ena.M().equals(ena.o(a));
                ena.m(a).a(gfp1);
                gfp1 = ena.m(a);
                ena.M().equals(ena.o(a));
                gfp1.a(true);
                a.Q();
            }

            public final void a(String s)
            {
                ena.a(a, s);
                ena.n(a).b(ena.h(a));
                ena.m(a).c(ena.h(a));
                a.Q();
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = ena.this;
                super();
            }
        };
        av = new DataSetObserver() {

            private ena a;

            public final void onChanged()
            {
                ena.j(a).d(0);
            }

            
            {
                a = ena.this;
                super();
            }
        };
        aw = new eoq() {

            private ena a;

            public final void a()
            {
                ena.n(a).a(false, ena.d(a).b(), false);
                ena.m(a).b(ena.d(a).b());
                a.Q();
            }

            
            {
                a = ena.this;
                super();
            }
        };
        ax = new android.view.View.OnClickListener() {

            private ena a;

            public final void onClick(View view)
            {
                ena.d(a).a(a.k());
            }

            
            {
                a = ena.this;
                super();
            }
        };
        ay = new android.widget.AdapterView.OnItemClickListener() {

            private ena a;

            public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
label0:
                {
                    adapterview = ((AdapterView) (view.getTag()));
                    if (adapterview instanceof fdj)
                    {
                        adapterview = (fdj)adapterview;
                        a.a(ClientEventFactory.a("playlists", com.spotify.mobile.android.util.ClientEvent.SubEvent.au, adapterview.a(), Long.valueOf(l1)));
                        if (!ena.a(a).a())
                        {
                            break label0;
                        }
                        ena.a(a).a(adapterview.a(), adapterview.b(), false);
                    }
                    return;
                }
                a.a(gms.a(a.k(), adapterview.a()).a(adapterview.b()).a);
            }

            
            {
                a = ena.this;
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

    public static ena a(Flags flags, boolean flag)
    {
        ena ena1 = new ena();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_sync", flag);
        ena1.f(bundle);
        fyw.a(ena1, flags);
        return ena1;
    }

    static fom a(ena ena1)
    {
        return ena1.aq;
    }

    static gfp a(ena ena1, gfp gfp1)
    {
        ena1.ae = gfp1;
        return gfp1;
    }

    static String a(ena ena1, String s)
    {
        ena1.ad = s;
        return s;
    }

    static LoadingView b(ena ena1)
    {
        return ena1.ap;
    }

    static FilterHeaderView c(ena ena1)
    {
        return ena1.ao;
    }

    static eop d(ena ena1)
    {
        return ena1.al;
    }

    static View e(ena ena1)
    {
        return ena1.ag;
    }

    static View f(ena ena1)
    {
        return ena1.ah;
    }

    static ListView g(ena ena1)
    {
        return ena1.af;
    }

    static String h(ena ena1)
    {
        return ena1.ad;
    }

    static EmptyView i(ena ena1)
    {
        return ena1.ai;
    }

    static ftg j(ena ena1)
    {
        return ena1.an;
    }

    static Parcelable k(ena ena1)
    {
        return ena1.aj;
    }

    static Parcelable l(ena ena1)
    {
        ena1.aj = null;
        return null;
    }

    static fdd m(ena ena1)
    {
        return ena1.am;
    }

    static epf n(ena ena1)
    {
        return ena1.ak;
    }

    static gfp o(ena ena1)
    {
        return ena1.ae;
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
        return "collection:playlists";
    }

    protected final HeaderableAdapter J()
    {
        return am;
    }

    protected final epg K()
    {
        return as;
    }

    public final Fragment a(String s, String s1)
    {
        s = new SpotifyLink(s);
        new foe();
        s = foe.a(s, s1, super.Z, FeatureIdentifier.n).F();
        s.g().putBoolean("is_sub_fragment", true);
        return s;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        am = new fdd(k(), new fdh(k(), super.a), super.b, super.Z);
        am.a(ae);
        am.b(al.b());
        am.c(ad);
        Object obj = am;
        ac.equals(ae);
        ((HeaderableAdapter) (obj)).a(true);
        am.registerDataSetObserver(av);
        af = (ListView)viewgroup.findViewById(0x102000a);
        obj = (ViewGroup)af.getParent();
        ah = eoo.a(k());
        ah.setVisibility(8);
        ((ViewGroup) (obj)).addView(ah);
        ag = eoo.a(k(), ax);
        ag.setVisibility(8);
        ((ViewGroup) (obj)).addView(ag);
        ai = eoo.a(k(), "");
        View view = layoutinflater.inflate(0x7f030050, null);
        view.findViewById(0x7f11025e).setOnClickListener(ax);
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
            ao = FilterHeaderView.a(layoutinflater, ad, ab, ae, al.e, au, af);
        }
        ao.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        ao.a(super.b, "playlists");
        ao.a(0x7f0802f3);
        ap = LoadingView.a(LayoutInflater.from(k()), k(), af);
        ((ViewGroup) (obj)).addView(ap);
        af.setVisibility(4);
        af.setAdapter(an);
        af.setChoiceMode(0);
        af.setFastScrollEnabled(true);
        af.setOnItemClickListener(ay);
        af.setOnItemLongClickListener(new fuf(k()));
        if (aq == null)
        {
            aq = new fom(this, this, viewgroup);
        }
        aq.a(bundle);
        ap.a();
        ak.a(bundle, as);
        am.a(bundle);
        am.a();
        return viewgroup;
    }

    protected final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver a()
    {
        return at;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080401);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(true);
        if (g() != null)
        {
            ar = g().getBoolean("can_sync", false);
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
            al = new eop(k(), super.b, "playlists", ar, super.Y, eop.d);
        }
        al.f = aw;
        if (ak == null)
        {
            ak = new fdh(k(), super.a);
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
        fzr.a(k(), menu, super.b, super.Z);
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
        am.unregisterDataSetObserver(av);
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
        return FeatureIdentifier.n;
    }

    static 
    {
        ViewUri.bl.toString();
        ac = new gfp("", 0x7f08051f, false);
        ArrayList arraylist = new ArrayList();
        ab = arraylist;
        arraylist.add(ac);
        ab.add(new gfp("name", 0x7f080521));
        ab.add(new gfp("mostPlayedRank", 0x7f080523, false));
    }
}

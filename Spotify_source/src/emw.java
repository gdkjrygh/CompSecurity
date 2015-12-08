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

public final class emw extends emz
    implements foo
{

    private static final gip aa = gip.b("albums_sort_order_new");
    private static final gip ab = gip.b("albums_hide_incomplete_albums_new");
    private static final List ac;
    private static final gfp ad;
    private static final gfp ae;
    private eoq aA;
    private android.view.View.OnClickListener aB;
    private gdl aC;
    private android.widget.AdapterView.OnItemClickListener aD;
    private String af;
    private gfp ag;
    private ListView ah;
    private View ai;
    private View aj;
    private EmptyView ak;
    private Parcelable al;
    private epf am;
    private eop an;
    private gdk ao;
    private emn ap;
    private ftg aq;
    private FilterHeaderView ar;
    private LoadingView as;
    private fom at;
    private boolean au;
    private String av;
    private epg aw;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver ax;
    private gas ay;
    private DataSetObserver az;

    public emw()
    {
        super(ViewUri.bo);
        aw = new epg() {

            final emw a;

            public final void a(Object obj)
            {
                obj = (fip)obj;
                a.o();
                ((fip) (obj)).isLoading();
                int i1 = ((enr[])((fip) (obj)).getItems()).length;
                if (!a.o()) goto _L2; else goto _L1
_L1:
                byte byte0;
                boolean flag1;
                if (((fip) (obj)).getUnrangedLength() == 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (((fip) (obj)).isLoading() && flag1) goto _L2; else goto _L3
_L3:
                if (!flag1 && emw.a(a).b())
                {
                    obj = ((enr[])((fip) (obj)).getItems())[0];
                    emw.a(a).a(((enr) (obj)).getCollectionUri(), ((enr) (obj)).getName(), true);
                }
                a.R();
                a.O();
                if (emw.b(a).d())
                {
                    emw.b(a).b();
                }
                boolean flag;
                if (flag1 && !emw.c(a).b())
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                if (emw.d(a).b() || emw.e(a).a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!emw.d(a).b() || byte0 == 0) goto _L5; else goto _L4
_L4:
                emw.f(a).setVisibility(0);
                obj = emw.g(a);
_L7:
                byte0 = 8;
_L8:
                ((View) (obj)).setVisibility(byte0);
                if (flag && (emw.h(a) instanceof HideableHeadersListView))
                {
                    ((HideableHeadersListView)emw.h(a)).a();
                }
                if (flag1 && emw.c(a).b())
                {
                    emw.j(a).a(a.a(0x7f0803de, new Object[] {
                        emw.i(a)
                    }));
                    emw.k(a).b(new int[] {
                        1
                    });
                } else
                {
                    emw.k(a).a(new int[] {
                        1
                    });
                }
                if (!flag1 && flag)
                {
                    emw.k(a).b(new int[] {
                        2
                    });
                } else
                {
                    emw.k(a).a(new int[] {
                        2
                    });
                }
                a.P();
                a.a(emw.a(a).a());
                ((fpe)a.k()).P_();
                emw.h(a).post(new Runnable(this, flag1) {

                    private boolean a;
                    private _cls1 b;

                    public final void run()
                    {
                        if (emw.l(b.a) != null && !a)
                        {
                            emw.h(b.a).onRestoreInstanceState(emw.l(b.a));
                            emw.m(b.a);
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
                emw.f(a).setVisibility(8);
                obj = emw.g(a);
                if (byte0 == 0) goto _L7; else goto _L6
_L6:
                byte0 = 0;
                  goto _L8
            }

            public final void a(String s)
            {
                emw.b(a).b();
                Logger.c("Failed to load list of album %s", new Object[] {
                    s
                });
            }

            
            {
                a = emw.this;
                super();
            }
        };
        ax = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private emw a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                if (playerstate != null)
                {
                    emw.n(a).a(playerstate.entityUri());
                }
                emw.n(a).a(null);
            }

            
            {
                a = emw.this;
                super();
            }
        };
        ay = new gas() {

            private emw a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                emw.a(a, gfp1);
                ((emz) (a)).Y.b().a(emw.L(), emw.p(a).a()).b();
                emw.o(a).a(gfp1);
                emw.o(a);
                emw.M().equals(emw.p(a));
                emw.n(a).a(gfp1);
                gfp1 = emw.n(a);
                emw.M().equals(emw.p(a));
                gfp1.a(true);
                a.Q();
            }

            public final void a(String s)
            {
                emw.a(a, s);
                emw.o(a).b(emw.i(a));
                emw.n(a).c(emw.i(a));
                a.Q();
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = emw.this;
                super();
            }
        };
        az = new DataSetObserver() {

            private emw a;

            public final void onChanged()
            {
                emw.k(a).d(0);
            }

            
            {
                a = emw.this;
                super();
            }
        };
        aA = new eoq() {

            private emw a;

            public final void a()
            {
                emw.o(a).a(false, emw.d(a).b(), false);
                emw.n(a).b(emw.d(a).b());
                a.Q();
            }

            
            {
                a = emw.this;
                super();
            }
        };
        aB = new android.view.View.OnClickListener() {

            private emw a;

            public final void onClick(View view)
            {
                if (emw.e(a).a)
                {
                    emw.e(a).a(a.k());
                }
                emw.d(a).a(a.k());
            }

            
            {
                a = emw.this;
                super();
            }
        };
        aC = new gdl() {

            private emw a;

            public final void a(Context context, gdk gdk1)
            {
                ((emz) (a)).Y.b().a(emw.N(), gdk1.a).b();
                com.spotify.mobile.android.util.ClientEvent.SubEvent subevent;
                boolean flag;
                if (gdk1.a)
                {
                    subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.bM;
                } else
                {
                    subevent = com.spotify.mobile.android.util.ClientEvent.SubEvent.bN;
                }
                dmz.a(fop);
                fop.a(context, ((emz) (a)).b, ClientEventFactory.a("albums", subevent, null, null));
                emw.o(a).a(false, emw.d(a).b(), false);
                emw.o(a).b(gdk1.a);
                context = emw.n(a);
                flag = gdk1.a;
                ((HeaderableAdapter) (context)).f.b(flag);
                context.a(true);
                a.Q();
            }

            
            {
                a = emw.this;
                super();
            }
        };
        aD = new android.widget.AdapterView.OnItemClickListener() {

            private emw a;

            public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
label0:
                {
label1:
                    {
                        adapterview = ((AdapterView) (view.getTag()));
                        if (adapterview instanceof enr)
                        {
                            adapterview = (enr)adapterview;
                            if (adapterview.getCollectionUri().length() <= 0)
                            {
                                break label0;
                            }
                            a.a(ClientEventFactory.a("albums", com.spotify.mobile.android.util.ClientEvent.SubEvent.as, adapterview.getUri(), Long.valueOf(l1)));
                            if (!emw.a(a).a())
                            {
                                break label1;
                            }
                            emw.a(a).a(adapterview.getCollectionUri(), adapterview.getName(), false);
                        }
                        return;
                    }
                    a.a(gms.a(a.k(), adapterview.getCollectionUri()).a(adapterview.getName()).a);
                    return;
                }
                dmz.a(ggc);
                ggc.a(a.k(), 0x7f080575);
            }

            
            {
                a = emw.this;
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
        return ae;
    }

    static gip N()
    {
        return ab;
    }

    public static emw a(Flags flags, boolean flag, String s)
    {
        emw emw1 = new emw();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_sync", flag);
        bundle.putString("username", s);
        emw1.f(bundle);
        fyw.a(emw1, flags);
        return emw1;
    }

    static fom a(emw emw1)
    {
        return emw1.at;
    }

    static gfp a(emw emw1, gfp gfp1)
    {
        emw1.ag = gfp1;
        return gfp1;
    }

    static String a(emw emw1, String s)
    {
        emw1.af = s;
        return s;
    }

    static LoadingView b(emw emw1)
    {
        return emw1.as;
    }

    static FilterHeaderView c(emw emw1)
    {
        return emw1.ar;
    }

    static eop d(emw emw1)
    {
        return emw1.an;
    }

    static gdk e(emw emw1)
    {
        return emw1.ao;
    }

    static View f(emw emw1)
    {
        return emw1.ai;
    }

    static View g(emw emw1)
    {
        return emw1.aj;
    }

    static ListView h(emw emw1)
    {
        return emw1.ah;
    }

    static String i(emw emw1)
    {
        return emw1.af;
    }

    static EmptyView j(emw emw1)
    {
        return emw1.ak;
    }

    static ftg k(emw emw1)
    {
        return emw1.aq;
    }

    static Parcelable l(emw emw1)
    {
        return emw1.al;
    }

    static Parcelable m(emw emw1)
    {
        emw1.al = null;
        return null;
    }

    static emn n(emw emw1)
    {
        return emw1.ap;
    }

    static epf o(emw emw1)
    {
        return emw1.am;
    }

    static gfp p(emw emw1)
    {
        return emw1.ag;
    }

    public final void A()
    {
        super.A();
        ar.a();
    }

    public final void B()
    {
        super.B();
        an.a();
    }

    protected final epf H()
    {
        return am;
    }

    public final String I()
    {
        return "collection:albums";
    }

    protected final HeaderableAdapter J()
    {
        return ap;
    }

    protected final epg K()
    {
        return aw;
    }

    public final Fragment a(String s, String s1)
    {
        s = new SpotifyLink(s);
        new foe();
        s = foe.a(s, s1, super.Z, FeatureIdentifier.k).F();
        s.g().putBoolean("is_sub_fragment", true);
        return s;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        ap = new emn(k(), new enm(k(), super.a, av), super.b, super.Z);
        ap.a(ag);
        ap.b(an.b());
        ap.c(af);
        Object obj = ap;
        ae.equals(ag);
        ((HeaderableAdapter) (obj)).a(true);
        ap.registerDataSetObserver(az);
        ah = (ListView)viewgroup.findViewById(0x102000a);
        obj = (ViewGroup)ah.getParent();
        aj = eoo.b(k(), ((Boolean)super.Z.a(fys.N)).booleanValue());
        aj.setVisibility(8);
        ((ViewGroup) (obj)).addView(aj);
        ai = eoo.a(k(), aB);
        ai.setVisibility(8);
        ((ViewGroup) (obj)).addView(ai);
        ak = eoo.a(k(), "");
        View view = layoutinflater.inflate(0x7f030050, null);
        view.findViewById(0x7f11025e).setOnClickListener(aB);
        aq = new ftg(k());
        aq.a(ap, null, 0);
        aq.a(new ftm(ak, false), null, 1);
        aq.a(new ftm(view, false), null, 2);
        aq.d(0);
        aq.a(new int[] {
            1, 2
        });
        if (ar == null)
        {
            ar = FilterHeaderView.a(layoutinflater, af, ac, ag, an.e, ay, ah);
        }
        ar.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        ar.a(super.b, "albums");
        ar.a(0x7f0802ef);
        as = LoadingView.a(LayoutInflater.from(k()), k(), ah);
        ((ViewGroup) (obj)).addView(as);
        ah.setVisibility(4);
        ah.setAdapter(aq);
        ah.setChoiceMode(0);
        ah.setFastScrollEnabled(true);
        ah.setOnItemClickListener(aD);
        ah.setOnItemLongClickListener(new fuf(k()));
        if (at == null)
        {
            at = new fom(this, this, viewgroup);
        }
        at.a(bundle);
        as.a();
        am.a(bundle, aw);
        ap.a(bundle);
        ap.a();
        return viewgroup;
    }

    protected final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver a()
    {
        return ax;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f08018c);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        a(false);
        if (g() != null)
        {
            au = g().getBoolean("can_sync", false);
            av = g().getString("username");
        }
        if (bundle != null)
        {
            af = bundle.getString("filter");
            if (bundle.containsKey("list"))
            {
                al = bundle.getParcelable("list");
            }
        }
        ag = gfp.a(super.Y, aa, ae, ac);
        if (af == null)
        {
            af = "";
        }
        if (ag == null)
        {
            ag = ae;
        }
        if (an == null)
        {
            an = new eop(k(), super.b, "albums", au, super.Y, eop.a);
        }
        ao = new gdk(aC, 0x7f0802c9);
        ao.a = super.Y.a(ab, false);
        if (eom.a(super.Z))
        {
            an.a(ao);
        }
        an.f = aA;
        if (am == null)
        {
            am = new enm(k(), super.a, av);
        }
        am.a(Integer.valueOf(0), Integer.valueOf(1));
        am.a(ag);
        am.a(false, an.b(), false);
        am.b(ao.a);
        am.b(af);
        ae.equals(ag);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        at.a(menu);
    }

    public final void a(String s)
    {
        ap.b(s);
        P();
    }

    public final void e()
    {
        FilterHeaderView.a(ar);
        if (ah instanceof HideableHeadersListView)
        {
            ((HideableHeadersListView)ah).a(ar);
        } else
        {
            ah.removeHeaderView(ar);
        }
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("filter", af);
        if (ah != null)
        {
            bundle.putParcelable("list", ah.onSaveInstanceState());
        }
        at.b(bundle);
        if (am != null)
        {
            am.a(bundle);
        }
        if (ap != null)
        {
            ap.b(bundle);
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.k;
    }

    static 
    {
        ViewUri.bo.toString();
        ad = new gfp("name", 0x7f080524);
        Object obj = new gfp("artist.name", 0x7f08051e);
        obj.d = ad;
        ae = ((gfp) (obj));
        obj = new ArrayList();
        ac = ((List) (obj));
        ((List) (obj)).add(ad);
        ac.add(ae);
        obj = ac;
        gfp gfp1 = new gfp("addTime", 0x7f080522);
        gfp1.d = ad;
        ((List) (obj)).add(gfp1);
        ac.add(new gfp("mostPlayedRank", 0x7f080523, false));
    }
}

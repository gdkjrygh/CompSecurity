// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.common.base.Optional;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.collection.adapter.HeaderableAdapter;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.HideableHeadersListView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.ui.view.StickyHeaderView;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;

public final class end extends emz
{

    private static final gip aa = gip.b("tracks_sort_order_new");
    private static final List ab;
    private static final gfp ac;
    private boolean aA;
    private String aB;
    private Optional aC;
    private epg aD;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver aE;
    private gas aF;
    private DataSetObserver aG;
    private final hfb aH = new hfb() {

        private end a;

        public final void onCompleted()
        {
        }

        public final void onError(Throwable throwable)
        {
            Logger.b(throwable, "Error while observing unavailable songs settings", new Object[0]);
        }

        public final void onNext(Object obj)
        {
            boolean flag1 = false;
            obj = (Boolean)obj;
            if (end.u(a) == null || !end.u(a).equals(obj))
            {
                Object obj1 = end.s(a);
                boolean flag;
                if (!((Boolean) (obj)).booleanValue())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((epf) (obj1)).c(flag);
                obj1 = end.r(a);
                flag = flag1;
                if (!((Boolean) (obj)).booleanValue())
                {
                    flag = true;
                }
                ((HeaderableAdapter) (obj1)).f.c(flag);
                ((HeaderableAdapter) (obj1)).a(true);
                a.Q();
            }
            end.a(a, ((Boolean) (obj)));
        }

            
            {
                a = end.this;
                super();
            }
    };
    private eoq aI;
    private android.view.View.OnClickListener aJ;
    private gap aK;
    private final android.widget.AdapterView.OnItemClickListener aL = new android.widget.AdapterView.OnItemClickListener() {

        private end a;

        public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
        {
            int j1 = end.f(a).getHeaderViewsCount();
            switch (end.i(a).b(i1 - j1))
            {
            default:
                return;

            case 0: // '\0'
                adapterview = (enw)view.getTag();
                break;
            }
            if (gex.a(((emz) (a)).Z))
            {
                a.a(ClientEventFactory.a("tracks", com.spotify.mobile.android.util.ClientEvent.SubEvent.ah, adapterview.getUri(), Long.valueOf(l1)));
                adapterview = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).skipToIndex(0, (int)l1).build();
                ((epi)end.s(a)).a(adapterview, end.w(a));
                return;
            }
            a.a(ClientEventFactory.a("tracks", com.spotify.mobile.android.util.ClientEvent.SubEvent.ai, adapterview.getUri(), Long.valueOf(l1)));
            if (end.x(a) instanceof ShufflePlayHeaderView)
            {
                ((ShufflePlayHeaderView)end.x(a)).a();
                return;
            } else
            {
                ShufflePlayHeaderView.a(end.y(a), end.x(a));
                return;
            }
        }

            
            {
                a = end.this;
                super();
            }
    };
    private android.view.View.OnClickListener aM;
    private String ad;
    private gfp ae;
    private ListView af;
    private View ag;
    private View ah;
    private EmptyView ai;
    private Parcelable aj;
    private epf ak;
    private PlayOrigin al;
    private eop am;
    private gbv an;
    private ems ao;
    private ftg ap;
    private FilterHeaderView aq;
    private View ar;
    private DownloadHeaderView as;
    private LoadingView at;
    private int au;
    private int av;
    private boolean aw;
    private Boolean ax;
    private hew ay;
    private hfg az;

    public end()
    {
        super(ViewUri.br);
        aD = new epg() {

            final end a;

            public final void a(Object obj)
            {
                enx enx1;
                boolean flag1;
                flag1 = true;
                enx1 = (enx)obj;
                a.o();
                enx1.isLoading();
                int i1 = ((enw[])enx1.getItems()).length;
                if (!a.o()) goto _L2; else goto _L1
_L1:
                byte byte0;
                boolean flag;
                if (enx1.getUnrangedLength() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (enx1.isLoading() && flag) goto _L2; else goto _L3
_L3:
                a.R();
                a.O();
                if (end.a(a).d())
                {
                    end.a(a).b();
                }
                if (flag && !end.b(a).b())
                {
                    byte0 = 1;
                } else
                {
                    byte0 = 0;
                }
                if (!end.c(a).b() || byte0 == 0) goto _L5; else goto _L4
_L4:
                end.d(a).setVisibility(0);
                obj = end.e(a);
_L7:
                byte0 = 8;
_L8:
                ((View) (obj)).setVisibility(byte0);
                if (end.c(a).b() && (end.f(a) instanceof HideableHeadersListView))
                {
                    ((HideableHeadersListView)end.f(a)).a();
                }
                if (flag && end.b(a).b())
                {
                    end.h(a).a(a.a(0x7f0803de, new Object[] {
                        end.g(a)
                    }));
                    end.i(a).b(new int[] {
                        1
                    });
                } else
                {
                    end.i(a).a(new int[] {
                        1
                    });
                }
                if (!flag && end.c(a).b())
                {
                    end.i(a).b(new int[] {
                        2
                    });
                } else
                {
                    end.i(a).a(new int[] {
                        2
                    });
                }
                end.a(a, enx1.a());
                end.b(a, enx1.b());
                if (!end.j(a))
                {
                    end.k(a);
                    end.l(a);
                }
                a.P();
                end.o(a).a(end.m(a), end.n(a));
                obj = a;
                if (flag)
                {
                    flag1 = false;
                }
                ((end) (obj)).a(flag1);
                ((fpe)a.k()).P_();
                end.f(a).post(new Runnable(this, flag) {

                    private boolean a;
                    private _cls1 b;

                    public final void run()
                    {
                        if (end.p(b.a) != null && !a)
                        {
                            end.f(b.a).onRestoreInstanceState(end.p(b.a));
                            end.q(b.a);
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
                end.d(a).setVisibility(8);
                obj = end.e(a);
                if (byte0 == 0) goto _L7; else goto _L6
_L6:
                byte0 = 0;
                  goto _L8
            }

            public final void a(String s1)
            {
                end.a(a).b();
                Logger.c("Failed to load list of songs %s", new Object[] {
                    s1
                });
            }

            
            {
                a = end.this;
                super();
            }
        };
        aE = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private end a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                if (playerstate != null && playerstate.track() != null && ((emz) (a)).b.toString().equals(playerstate.playOrigin().viewUri()))
                {
                    end.r(a).a(playerstate.track().uri());
                    return;
                } else
                {
                    end.r(a).a(null);
                    return;
                }
            }

            
            {
                a = end.this;
                super();
            }
        };
        aF = new gas() {

            private end a;

            public final void a()
            {
            }

            public final void a(gfp gfp1)
            {
                end.a(a, gfp1);
                ((emz) (a)).Y.b().a(end.L(), end.t(a).a()).b();
                end.s(a).a(gfp1);
                a.Q();
                end.r(a).a(gfp1);
                end.k(a);
            }

            public final void a(String s1)
            {
                end.a(a, s1);
                end.s(a).b(end.g(a));
                a.Q();
                end.r(a).c(end.g(a));
            }

            public final void a(boolean flag)
            {
            }

            
            {
                a = end.this;
                super();
            }
        };
        aG = new DataSetObserver() {

            private end a;

            public final void onChanged()
            {
                end.i(a).d(0);
            }

            
            {
                a = end.this;
                super();
            }
        };
        aI = new eoq() {

            private end a;

            public final void a()
            {
                end.s(a).a(false, end.c(a).b(), false);
                a.Q();
                end.r(a).b(end.c(a).b());
                end.k(a);
            }

            
            {
                a = end.this;
                super();
            }
        };
        aJ = new android.view.View.OnClickListener() {

            private end a;

            public final void onClick(View view)
            {
                end.c(a).a(a.k());
            }

            
            {
                a = end.this;
                super();
            }
        };
        aK = new gap() {

            private end a;

            public final void a(boolean flag)
            {
                if (end.v(a).b())
                {
                    ((ewa)end.v(a).c()).a();
                }
                ((eph)end.s(a)).a(flag);
            }

            
            {
                a = end.this;
                super();
            }
        };
        aM = new android.view.View.OnClickListener() {

            private end a;

            public final void onClick(View view)
            {
                a.a(ClientEventFactory.a("tracks", com.spotify.mobile.android.util.ClientEvent.SubEvent.X, null, null));
                view = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).playerOptionsOverride(true, false, false).build();
                ((epi)end.s(a)).a(view, end.w(a));
            }

            
            {
                a = end.this;
                super();
            }
        };
    }

    static gip L()
    {
        return aa;
    }

    static int a(end end1, int i1)
    {
        end1.au = i1;
        return i1;
    }

    static LoadingView a(end end1)
    {
        return end1.at;
    }

    public static end a(Flags flags, boolean flag, String s1)
    {
        end end1 = new end();
        Bundle bundle = new Bundle();
        bundle.putBoolean("can_download", flag);
        bundle.putString("username", s1);
        end1.f(bundle);
        fyw.a(end1, flags);
        return end1;
    }

    static gfp a(end end1, gfp gfp1)
    {
        end1.ae = gfp1;
        return gfp1;
    }

    static Boolean a(end end1, Boolean boolean1)
    {
        end1.ax = boolean1;
        return boolean1;
    }

    static String a(end end1, String s1)
    {
        end1.ad = s1;
        return s1;
    }

    static int b(end end1, int i1)
    {
        end1.av = i1;
        return i1;
    }

    static FilterHeaderView b(end end1)
    {
        return end1.aq;
    }

    static eop c(end end1)
    {
        return end1.am;
    }

    static View d(end end1)
    {
        return end1.ag;
    }

    static View e(end end1)
    {
        return end1.ah;
    }

    static ListView f(end end1)
    {
        return end1.af;
    }

    static String g(end end1)
    {
        return end1.ad;
    }

    static EmptyView h(end end1)
    {
        return end1.ai;
    }

    static ftg i(end end1)
    {
        return end1.ap;
    }

    static boolean j(end end1)
    {
        return end1.aw;
    }

    static void k(end end1)
    {
        if (com.spotify.mobile.android.provider.Metadata.OfflineSync.a(end1.au, end1.av) || com.spotify.mobile.android.provider.Metadata.OfflineSync.c(end1.au))
        {
            ((eph)end1.ak).a(true);
        }
    }

    static boolean l(end end1)
    {
        end1.aw = true;
        return true;
    }

    static int m(end end1)
    {
        return end1.au;
    }

    static int n(end end1)
    {
        return end1.av;
    }

    static DownloadHeaderView o(end end1)
    {
        return end1.as;
    }

    static Parcelable p(end end1)
    {
        return end1.aj;
    }

    static Parcelable q(end end1)
    {
        end1.aj = null;
        return null;
    }

    static ems r(end end1)
    {
        return end1.ao;
    }

    static epf s(end end1)
    {
        return end1.ak;
    }

    static gfp t(end end1)
    {
        return end1.ae;
    }

    static Boolean u(end end1)
    {
        return end1.ax;
    }

    static Optional v(end end1)
    {
        return end1.aC;
    }

    static PlayOrigin w(end end1)
    {
        return end1.al;
    }

    static View x(end end1)
    {
        return end1.ar;
    }

    static gbv y(end end1)
    {
        return end1.an;
    }

    public final void A()
    {
        super.A();
        aq.a();
    }

    public final void B()
    {
        super.B();
        am.a();
    }

    protected final epf H()
    {
        return ak;
    }

    public final String I()
    {
        return "collection:tracks";
    }

    protected final HeaderableAdapter J()
    {
        return ao;
    }

    protected final epg K()
    {
        return aD;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.a(layoutinflater, viewgroup, bundle);
        viewgroup = (ViewGroup)layoutinflater.inflate(0x7f0300d3, viewgroup, false);
        ap = new ftg(k());
        ao = new ems(k(), new enq(k(), super.a, aB), super.b, super.Z);
        ao.a(ae);
        ao.b(am.b());
        ao.c(ad);
        ao.registerDataSetObserver(aG);
        af = (ListView)viewgroup.findViewById(0x102000a);
        ViewGroup viewgroup1 = (ViewGroup)af.getParent().getParent();
        ViewGroup viewgroup2 = (ViewGroup)af.getParent();
        ah = eoo.a(k(), ((Boolean)super.Z.a(fys.N)).booleanValue());
        ah.setVisibility(8);
        viewgroup1.addView(ah);
        ag = eoo.a(k(), aJ);
        ag.setVisibility(8);
        viewgroup1.addView(ag);
        ai = eoo.a(k(), "");
        View view = layoutinflater.inflate(0x7f030050, null);
        view.findViewById(0x7f11025e).setOnClickListener(aJ);
        ap.a(ao, null, 0);
        ap.a(new ftm(ai, false), null, 1);
        ap.a(new ftm(view, false), null, 2);
        ap.d(0);
        ap.a(new int[] {
            1, 2
        });
        if (aq == null)
        {
            aq = FilterHeaderView.a(layoutinflater, ad, ab, ae, am.e, aF, af);
        }
        aq.setBackgroundColor(gcg.b(k(), 0x7f0f0019));
        aq.a(super.b, "tracks");
        aq.a(0x7f0802f4);
        as = (DownloadHeaderView)gaw.a(k());
        as.c = aK;
        as.d = aC;
        layoutinflater = gaw.b(k());
        if (ggi.a(k()))
        {
            ar = ShufflePlayHeaderView.a(k(), af, aM);
            ((ShufflePlayHeaderView)ar).a = true;
            ((ShufflePlayHeaderView)ar).a(true, super.Z);
            layoutinflater.addView(((StickyHeaderView) ((ShufflePlayHeaderView)ar)).c);
        }
        layoutinflater.addView(as);
        af.addHeaderView(layoutinflater, null, false);
        at = LoadingView.a(LayoutInflater.from(k()), k(), viewgroup2);
        viewgroup1.addView(at);
        viewgroup2.setVisibility(4);
        af.setAdapter(ap);
        af.setFastScrollEnabled(true);
        af.setOnItemClickListener(aL);
        af.setOnItemLongClickListener(new fuf(k()));
        at.a();
        ak.a(bundle, aD);
        ao.a(bundle);
        ao.a();
        return viewgroup;
    }

    protected final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver a()
    {
        return aE;
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
            aA = g().getBoolean("can_download", false);
            aB = g().getString("username");
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
        if (am == null)
        {
            am = new eop(k(), super.b, "tracks", aA, super.Y, eop.c);
        }
        am.f = aI;
        an = new gbv();
        aC = ewb.a(k(), super.Z, super.b);
        bundle = gnl.a(this);
        al = new PlayOrigin(FeatureIdentifier.s.a(), "4.2.0.739", super.b.toString(), null, bundle.a());
        if (ak == null)
        {
            ak = new enq(k(), super.a, aB);
        }
        ak.a(Integer.valueOf(0), Integer.valueOf(0));
        ak.a(ae);
        ak.a(false, am.b(), false);
        ak.b(ad);
        ay = eon.a(k().getContentResolver());
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        if (ggi.b(k()) && ao != null && ao.getCount() > 0)
        {
            ar = fzr.a(k(), menu, aM);
        }
        menuinflater = new android.view.MenuItem.OnMenuItemClickListener() {

            private end a;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                ((eph)end.s(a)).a(false);
                dmz.a(ggc);
                ggc.f(a.k());
                return true;
            }

            
            {
                a = end.this;
                super();
            }
        };
        android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener = new android.view.MenuItem.OnMenuItemClickListener() {

            private end a;

            public final boolean onMenuItemClick(MenuItem menuitem)
            {
                if (end.v(a).b())
                {
                    ((ewa)end.v(a).c()).a();
                }
                ((eph)end.s(a)).a(true);
                return true;
            }

            
            {
                a = end.this;
                super();
            }
        };
        fzt.a(k(), menu, super.b, au, av, onmenuitemclicklistener, menuinflater);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
    }

    public final void c()
    {
        super.c();
        az = ay.a(aH);
    }

    public final void d()
    {
        super.d();
        az.unsubscribe();
    }

    public final void e()
    {
        FilterHeaderView.a(aq);
        if (af instanceof HideableHeadersListView)
        {
            ((HideableHeadersListView)af).a(aq);
        } else
        {
            af.removeHeaderView(aq);
        }
        ao.unregisterDataSetObserver(aG);
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
        if (ak != null)
        {
            ak.a(bundle);
        }
        if (ao != null)
        {
            ao.b(bundle);
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.s;
    }

    static 
    {
        Object obj = new gfp("addTime", 0x7f080522);
        obj.d = new gfp("name");
        ac = ((gfp) (obj));
        obj = new ArrayList();
        ab = ((List) (obj));
        ((List) (obj)).add(new gfp("name", 0x7f080524));
        ab.add(ac);
    }
}

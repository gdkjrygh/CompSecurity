// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.CardView;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.radio.model.RadioStationModel;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import com.spotify.music.spotlets.radio.service.RadioActionsService;

public final class goq extends al
    implements NavigationItem, fxy
{

    private gjf Y;
    private EmptyView Z;
    private LoadingView aa;
    private ContentViewManager ab;
    private final gab ac = new gab() {

        private goq a;

        public final void a(EmptyView emptyview, com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState contentstate)
        {
            boolean flag = false;
            int k;
            if (contentstate.equals(com.spotify.mobile.android.ui.stuff.ContentViewManager.ContentState.c) && goq.a(a).a())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            emptyview = goq.b(a).e();
            if (k != 0)
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = 8;
            }
            emptyview.setVisibility(k);
        }

            
            {
                a = goq.this;
                super();
            }
    };
    private an ad;
    private gcv ae;
    private ftg af;
    private gol ag;
    private gol ah;
    private ftw ai;
    private String aj;
    private ggl ak;
    private ClientInfo al;
    private gou am;
    private Flags an;
    private RecyclerView ao;
    private RecyclerView ap;
    private boolean b;

    public goq()
    {
        ad = new an() {

            private final String a[] = {
                "connected", "can_stream"
            };
            private goq b;

            public final da a(Bundle bundle)
            {
                return new cu(b.k(), dtw.a, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
label0:
                {
                    boolean flag1 = true;
                    obj = (Cursor)obj;
                    if (((Cursor) (obj)).moveToFirst())
                    {
                        boolean flag3 = gcw.a(((Cursor) (obj)), 0);
                        boolean flag2 = gcw.a(((Cursor) (obj)), 1);
                        obj = b;
                        boolean flag;
                        if (flag3 && flag2)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        goq.a(((goq) (obj)), flag);
                        b.k().q_();
                        obj = goq.c(b);
                        if (!flag3)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        ((ContentViewManager) (obj)).a(flag);
                        obj = goq.c(b);
                        if (!flag2)
                        {
                            flag = flag1;
                        } else
                        {
                            flag = false;
                        }
                        ((ContentViewManager) (obj)).b(flag);
                        if (!goq.d(b))
                        {
                            break label0;
                        }
                        goq.e(b).a();
                    }
                    return;
                }
                goq.e(b).b();
            }

            
            {
                b = goq.this;
                super();
            }
        };
        al = (ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo);
    }

    static ClientInfo a(goq goq1)
    {
        return goq1.al;
    }

    private gol a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, int k, int l, boolean flag)
    {
        RecyclerView recyclerview;
        subview = new gol(k(), ViewUri.h, subview, flag, an);
        int i1 = ((gcz)dmz.a(gcz)).b();
        int j1 = dft.b(64F, l());
        i1 = CardView.a(i1, 3, l().getDimensionPixelSize(0x7f0c0132), j1, l().getDimensionPixelOffset(0x7f0c0133));
        recyclerview = new RecyclerView(k(), null);
        recyclerview.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, i1));
        if (l != 0) goto _L2; else goto _L1
_L1:
        ao = recyclerview;
        ao.a(new LinearLayoutManager(0));
_L4:
        recyclerview.a(subview);
        af.a(new ftm(recyclerview), b(k), l);
        return subview;
_L2:
        if (l == 1)
        {
            ap = recyclerview;
            ap.a(new LinearLayoutManager(0));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static goq a(String s, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        s = new goq();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static void a(goq goq1, RadioStationsModel radiostationsmodel)
    {
        if (goq1.b)
        {
            goq1.ag.a(radiostationsmodel.userStations);
            goq1.af.d(0);
            if (goq1.ag.b() == 0)
            {
                goq1.af.a(new int[] {
                    0
                });
            }
            goq1.ah.a(radiostationsmodel.recommendedStations);
            goq1.af.d(1);
            gok gok1 = (gok)goq1.ai.a;
            radiostationsmodel = radiostationsmodel.genreStations;
            gok1.setNotifyOnChange(false);
            gok1.clear();
            gok1.addAll(radiostationsmodel);
            gok1.notifyDataSetChanged();
            goq1.af.d(2);
            goq1.ab.b(null);
        }
    }

    static boolean a(goq goq1, boolean flag)
    {
        goq1.b = flag;
        return flag;
    }

    static EmptyView b(goq goq1)
    {
        return goq1.Z;
    }

    static ContentViewManager c(goq goq1)
    {
        return goq1.ab;
    }

    static boolean d(goq goq1)
    {
        return goq1.b;
    }

    static gou e(goq goq1)
    {
        return goq1.am;
    }

    static gol f(goq goq1)
    {
        return goq1.ag;
    }

    static Flags g(goq goq1)
    {
        return goq1.an;
    }

    static gjf h(goq goq1)
    {
        return goq1.Y;
    }

    static LoadingView i(goq goq1)
    {
        return goq1.aa;
    }

    static RecyclerView j(goq goq1)
    {
        return goq1.ao;
    }

    public final void A()
    {
        super.A();
        ak.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.i;
    }

    public final void B()
    {
        super.B();
        ae.b.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "radio";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f03008f, viewgroup, false);
        Z = (EmptyView)layoutinflater.findViewById(0x7f11039a);
        viewgroup = dgp.b(k(), null);
        viewgroup.setText(0x7f080307);
        Z.a(viewgroup);
        viewgroup.setOnClickListener(new android.view.View.OnClickListener() {

            private goq a;

            public final void onClick(View view)
            {
                dmz.a(fop);
                fop.a(a.k(), null, ViewUri.h, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, null, goq.g(a));
            }

            
            {
                a = goq.this;
                super();
            }
        });
        af = new ftg(k());
        af.e = new ftr(k()) {

            public final void a(int l, SectionHeaderView sectionheaderview, String s, String s1)
            {
                super.a(l, sectionheaderview, s, s1);
                boolean flag;
                if (l == 2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                sectionheaderview.b(flag);
            }

        };
        a(((android.widget.ListAdapter) (af)));
        int k;
        if (gpl.a(an))
        {
            k = 0x7f08043f;
        } else
        {
            k = 0x7f080439;
        }
        ag = a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.c, k, 0, true);
        ah = a(com.spotify.mobile.android.util.viewuri.ViewUri.SubView.d, 0x7f080438, 1, false);
        k = l().getInteger(0x7f0e0000);
        ai = new ftw(k(), new gor(k(), an), k);
        af.a(ai, 0x7f080437, 2);
        af.a(new int[] {
            0, 1, 2
        });
        aa = LoadingView.a(LayoutInflater.from(k()));
        layoutinflater.addView(aa);
        return layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        if (aj == null)
        {
            return context.getString(0x7f080442);
        } else
        {
            return aj;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aj = g().getString("title");
        an = fyw.a(this);
        a(true);
        u u1 = k();
        ak = ggn.a(u1, ViewUri.h);
        Y = gjf.a(u1, ViewUri.h.toString());
        Y.c(bundle);
        ae = new gcv(Cosmos.getResolver(u1)) {

            private goq c;

            protected final void a(PlayerState playerstate)
            {
                if (goq.f(c) != null)
                {
                    goq.f(c).d = playerstate.entityUri();
                    gol gol1 = goq.f(c);
                    boolean flag;
                    if (!playerstate.isPaused())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    gol1.e = flag;
                    goq.f(c).c();
                }
            }

            protected final boolean a(PlayerState playerstate, PlayerState playerstate1)
            {
                return b(playerstate, playerstate1) || c(playerstate, playerstate1);
            }

            
            {
                c = goq.this;
                super(resolver);
            }
        };
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        if (b)
        {
            menuinflater = k();
            Verified verified = ViewUri.h;
            if (!fzr.a(menuinflater))
            {
                ji.a(menu.add(0, 0x7f110005, 0, menuinflater.getString(0x7f080306)).setIcon(new dfz(menuinflater, SpotifyIcon.aP)).setOnMenuItemClickListener(new fzr._cls6(menuinflater, verified)), 1);
            }
        }
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        view = (new gaa(k(), (EmptyView)view.findViewById(0x7f11039a), z_())).a(0x7f0802ad, 0x7f08030a).b(0x7f0805f6, 0x7f0805f5).a(SpotifyIcon.K, 0x7f080309, 0x7f080308);
        view.a = ac;
        ab = view.a();
        am = new gou(k().getApplicationContext(), new gpi() {

            final goq a;
            private RadioStationModel b;

            public final void a(RadioStationsModel radiostationsmodel)
            {
label0:
                {
                    if (goq.d(a))
                    {
                        boolean flag;
                        if (radiostationsmodel == null || radiostationsmodel.userStations.length == 0 && radiostationsmodel.recommendedStations.length == 0 && radiostationsmodel.genreStations.length == 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        if (flag)
                        {
                            break label0;
                        }
                        goq.h(a).b();
                        goq.a(a, radiostationsmodel);
                    }
                    return;
                }
                a.z_().setVisibility(8);
                goq.c(a).a(goq.i(a));
            }

            public final void a(gpg gpg1)
            {
                if (!cty.a(gpg1.a, b))
                {
                    b = gpg1.a;
                    goq.j(a).getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(this) {

                        private _cls6 a;

                        public final boolean onPreDraw()
                        {
                            if (goq.j(a.a) != null)
                            {
                                goq.j(a.a).getViewTreeObserver().removeOnPreDrawListener(this);
                                if (a.a.o())
                                {
                                    goq.j(a.a).b(0);
                                }
                            }
                            return true;
                        }

            
            {
                a = _pcls6;
                super();
            }
                    });
                    goq.j(a).invalidate();
                }
            }

            public final void p()
            {
                goq.a(a, RadioActionsService.b(((gpc)goq.e(a).f()).a).e.b);
            }

            
            {
                a = goq.this;
                super();
            }
        });
    }

    public final void c()
    {
        super.c();
        Y.a();
        ae.a();
        u().a(0x7f11009f, null, ad);
    }

    public final void d()
    {
        super.d();
        u().a(0x7f11009f);
        Y.c();
        am.b();
        ae.b();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        Y.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.U;
    }

    public final void z()
    {
        super.z();
        ak.a();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.n;
import android.support.v4.content.j;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.activity.NowPlaying;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.data.a;
import com.pandora.android.provider.b;
import com.pandora.android.tablet.TabletHome;
import com.pandora.android.util.OnListItemEntranceListener;
import com.pandora.android.util.SearchBox;
import com.pandora.android.util.aa;
import com.pandora.android.util.s;
import com.pandora.android.view.f;
import com.pandora.radio.data.PromotedStation;
import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.aj;
import com.pandora.radio.data.y;
import com.pandora.radio.data.z;
import com.pandora.radio.provider.StationProvider;
import com.pandora.radio.provider.g;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p.bz.t;
import p.cw.c;
import p.dd.ah;
import p.dd.at;
import p.dd.aw;
import p.dd.ay;
import p.dd.bh;
import p.dd.bo;
import p.dd.bq;
import p.di.h;
import p.di.q;
import p.l.d;
import p.l.i;

// Referenced classes of package p.ca:
//            m, af, y, ar, 
//            ao, am, q

public class ap extends m
    implements android.widget.AbsListView.OnScrollListener, android.widget.AdapterView.OnItemLongClickListener
{

    private static a Q[];
    private static a R[];
    private static a S[];
    private static a T[];
    private static com.pandora.android.activity.f.b U = new com.pandora.android.activity.f.b() {

        public a[] a(HomeTabsActivity hometabsactivity, boolean flag)
        {
            if (flag)
            {
                return ap.l();
            }
            if (hometabsactivity.ah())
            {
                if (hometabsactivity.ag() instanceof p.ca.q)
                {
                    return ap.m();
                } else
                {
                    return p.ca.ap.n();
                }
            } else
            {
                return ap.o();
            }
        }

    };
    private com.pandora.radio.provider.j A;
    private aa B;
    private PromotedStation C;
    private boolean D;
    private View E;
    private View F;
    private View G;
    private boolean H;
    private p.dk.a I;
    private boolean J;
    private OnListItemEntranceListener K;
    private android.view.View.OnClickListener L;
    private android.view.View.OnClickListener M;
    private android.view.View.OnClickListener N;
    private f O;
    private com.pandora.android.view.f.c P;
    private android.support.v4.app.n.a V;
    private Runnable W;
    private android.view.View.OnClickListener X;
    private ao j;
    private String k;
    private Handler l;
    private TextView m;
    private boolean n;
    private int o;
    private boolean p;
    private char q;
    private n r;
    private int s;
    private y t;
    private View u;
    private RadioButton v;
    private RadioButton w;
    private SearchBox x;
    private StationRecommendations y;
    private af z;

    public ap()
    {
        l = new Handler();
        q = '\0';
        s = -1;
        J = false;
        K = new OnListItemEntranceListener() {

            final ap a;

            public void a(AbsListView abslistview)
            {
            }

            public void a(AbsListView abslistview, long l1, int i1)
            {
                for (i1 -= ((ListView)abslistview).getHeaderViewsCount(); i1 < 0 || i1 >= p.ca.ap.a(a).getCount() || p.ca.ap.a(a).getItemViewType(i1) != 4;)
                {
                    return;
                }

                if (p.ca.ap.b(a) != null)
                {
                    p.ca.ap.b(a).a();
                    b.a.b().o().a(com.pandora.radio.util.k.i.a, p.ca.ap.b(a).n(), "station", null);
                    p.df.a.a("StationListFragment", "Track promoted station impressions.");
                    return;
                } else
                {
                    p.df.a.a("StationListFragment", "Promoted station impressions deferred.");
                    return;
                }
            }

            public void a(AbsListView abslistview, long l1, int i1, int j1)
            {
            }

            public void b(AbsListView abslistview, long l1, int i1)
            {
            }

            
            {
                a = ap.this;
                super();
            }
        };
        L = new android.view.View.OnClickListener() {

            final ap a;

            public void onClick(View view)
            {
                p.ca.ap.c(a);
            }

            
            {
                a = ap.this;
                super();
            }
        };
        M = new android.view.View.OnClickListener() {

            final ap a;

            public void onClick(View view)
            {
                p.ca.ap.a(a, com.pandora.radio.provider.h.b);
            }

            
            {
                a = ap.this;
                super();
            }
        };
        N = new android.view.View.OnClickListener() {

            final ap a;

            public void onClick(View view)
            {
                p.ca.ap.a(a, com.pandora.radio.provider.h.a);
            }

            
            {
                a = ap.this;
                super();
            }
        };
        P = new com.pandora.android.view.f.c() {

            final ap a;

            public void a(Parcelable parcelable)
            {
                Bundle bundle = (Bundle)parcelable;
                int i1 = bundle.getInt("deletedPosition");
                int j1 = p.ca.ap.d(a).a();
                if (j1 == 0)
                {
                    parcelable = a.getResources().getString(0x7f0801ec);
                } else
                {
                    parcelable = a.getResources().getQuantityString(0x7f110000, j1, new Object[] {
                        Integer.valueOf(j1)
                    });
                }
                p.ca.ap.d(a).a(parcelable);
                p.bv.d.a(a.m_(), false);
                p.ca.ap.a(a).a().d(i1);
                if (bundle.getBoolean("isShuffleDeleted"))
                {
                    p.ca.ap.a(a).a().d(0);
                }
                p.ca.ap.a(a).notifyDataSetChanged();
            }

            public void a(Iterator iterator)
            {
                for (; iterator.hasNext(); PandoraService.b(((Bundle)iterator.next()).getString("stationToken"))) { }
            }

            
            {
                a = ap.this;
                super();
            }
        };
        V = new android.support.v4.app.n.a() {

            final ap a;

            public void a(android.support.v4.content.i i1, Cursor cursor)
            {
                p.ca.ap.f(a);
                int j1;
                if (cursor == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = cursor.getCount();
                }
                p.ca.ap.a(a, b.a.b().y().b());
                if (cursor == null || p.ca.ap.g(a) == null)
                {
                    p.ca.ap.a(a).changeCursor(null);
                    p.ca.ap.h(a).a(a.m_());
                    return;
                }
                boolean flag;
                if (b.a.b().a(p.dj.b.a.e) || b.a.b().a(p.dj.b.a.f))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.ca.ap.a(a, null);
                if (p.ca.ap.g(a).p() && j1 > 0 && p.ca.ap.i(a))
                {
                    ap ap1 = a;
                    StationRecommendations stationrecommendations = p.ca.ap.j(a);
                    if (a.g())
                    {
                        i1 = p.ca.ap.b(a);
                    } else
                    {
                        i1 = null;
                    }
                    p.ca.ap.a(ap1, new com.pandora.radio.provider.j(stationrecommendations, i1, p.ca.ap.g(a).r(), flag));
                    ap.l(a).a(0, p.ca.ap.k(a).a());
                }
                i1 = new g(cursor, p.ca.ap.k(a), flag);
                for (cursor = p.ca.ap.d(a).c(); cursor.hasNext(); i1.c(((Bundle)cursor.next()).getInt("origStationPosition"))) { }
                p.ca.ap.a(a).changeCursor(i1);
                p.ca.ap.h(a).a(a.m_());
                ap.m(a);
            }

            public android.support.v4.content.i onCreateLoader(int i1, Bundle bundle)
            {
                return new android.support.v4.content.f(b.a.h(), StationProvider.f, com.pandora.radio.provider.h.l, com.pandora.radio.provider.h.i, null, ap.e(a));
            }

            public void onLoadFinished(android.support.v4.content.i i1, Object obj)
            {
                a(i1, (Cursor)obj);
            }

            public void onLoaderReset(android.support.v4.content.i i1)
            {
                p.ca.ap.a(a, 0);
                p.ca.ap.a(a).changeCursor(null);
                p.ca.ap.h(a).a(a.m_());
            }

            
            {
                a = ap.this;
                super();
            }
        };
        W = new Runnable() {

            final ap a;

            public void run()
            {
                ap.o(a);
            }

            
            {
                a = ap.this;
                super();
            }
        };
        X = new android.view.View.OnClickListener() {

            final ap a;

            public void onClick(View view)
            {
                boolean flag;
                flag = false;
                break MISSING_BLOCK_LABEL_2;
                if (a.b() != null && a.b().getCount() == 0)
                {
                    flag = true;
                }
                if (flag)
                {
                    ap.p(a);
                    return;
                } else
                {
                    p.ca.ap.n(a);
                    return;
                }
            }

            
            {
                a = ap.this;
                super();
            }
        };
        I = b.a.b().H();
    }

    private boolean A()
    {
        int i1;
        if (b.a.b().a(p.dj.b.a.e) || b.a.b().a(p.dj.b.a.f))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        return y != null && y.f() > i1;
    }

    private boolean B()
    {
        return t != null && t.A();
    }

    private void C()
    {
        O.a(true);
        if (com.pandora.android.util.s.u())
        {
            b.a.C().a(TabletHome.al());
            return;
        } else
        {
            i.a(p.ca.af.a(new com.pandora.radio.util.c(null), false, B()));
            return;
        }
    }

    private void D()
    {
        boolean flag = true;
        if (com.pandora.android.util.s.u())
        {
            p.bz.i i1 = (new p.bz.i.a()).a(com.pandora.android.view.HeaderLayout.d.a).a(com.pandora.android.view.HeaderLayout.a.a).a(com.pandora.android.view.HeaderLayout.b.b).b(com.pandora.android.view.HeaderLayout.a.a).b(0x7f080123).a(com.pandora.android.view.HeaderLayout.c.a, X).b(true).c(false).a();
            b.a.e().a(i1);
            if (x != null)
            {
                x.setVisibility(8);
            }
        } else
        if (x != null)
        {
            x.a();
            x.a(X);
            if (!b.a.b().a(p.dj.b.a.c) || com.pandora.android.util.s.u())
            {
                flag = false;
            }
            if (flag)
            {
                x.setHint(0x7f080124);
                return;
            }
        }
    }

    private static int a(g g1, String s1)
    {
        int i1;
        int j1;
        if (com.pandora.android.util.s.a(s1) || g1 == null)
        {
            return -1;
        }
        j1 = g1.getPosition();
        g1.moveToPosition(-1);
        i1 = 0;
_L2:
        boolean flag;
        if (!g1.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!g1.b(g1.getPosition()))
        {
            break MISSING_BLOCK_LABEL_68;
        }
        flag = s1.equalsIgnoreCase(g1.getString(1));
        if (flag)
        {
            g1.moveToPosition(j1);
            return i1;
        }
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        g1.moveToPosition(j1);
        return -1;
        s1;
        g1.moveToPosition(j1);
        throw s1;
    }

    static com.pandora.radio.provider.j a(ap ap1, com.pandora.radio.provider.j j1)
    {
        ap1.A = j1;
        return j1;
    }

    static ao a(ap ap1)
    {
        return ap1.j;
    }

    private void a(int i1)
    {
        if (i1 <= 3) goto _L2; else goto _L1
_L1:
        m_().setVisibility(0);
        E.setVisibility(8);
        G.setVisibility(8);
_L4:
        return;
_L2:
        if (i1 <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        E.setAlpha(1.0F);
        E.setTranslationY(0.0F);
        F.setTranslationY(0.0F);
        m_().setVisibility(0);
        E.setVisibility(8);
        if (b.a.b().a(p.dj.b.a.c) && !com.pandora.android.util.s.u())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        G.setVisibility(0);
        return;
        if (i1 != 0 || com.pandora.android.util.s.u()) goto _L4; else goto _L5
_L5:
        E.setVisibility(0);
        if (b.a.b().a(p.dj.b.a.c))
        {
            G.setVisibility(0);
        }
        q();
        return;
    }

    private void a(g g1, int i1)
    {
        y y1 = new y(g1);
        g1 = b.a.c();
        if (g1 != null && !g1.a(y1))
        {
            g1.b();
            return;
        }
        long l1 = SystemClock.elapsedRealtime();
        int j1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (t == null || !y1.c().equals(t.c()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = getResources().getConfiguration().orientation;
        if (flag)
        {
            flag1 = com.pandora.android.ads.VideoAdManager.c.a().a(getActivity(), y1);
        } else
        {
            flag1 = false;
        }
        g1 = m_();
        g1 = g1.getChildAt(i1 - g1.getFirstVisiblePosition());
        if (g1 != null)
        {
            g1 = (ImageView)g1.findViewById(0x7f1000b5);
        } else
        {
            g1 = null;
        }
        if (!com.pandora.android.util.s.u() && g1 != null)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        g1 = NowPlaying.a(y1, g1, j1, flag2, flag, flag1);
        if (flag)
        {
            b.a.b().o().b(new z(com.pandora.radio.data.z.a.e, l1));
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.pandora.android.activity.a.a(y1, null, flag, true, p.cw.b.b.a, g1);
            return;
        } else
        {
            PandoraIntent pandoraintent = new PandoraIntent("show_now_playing");
            pandoraintent.putExtras(g1);
            b.a.C().a(pandoraintent);
            return;
        }
    }

    static void a(ap ap1, int i1)
    {
        ap1.a(i1);
    }

    static void a(ap ap1, String s1)
    {
        ap1.e(s1);
    }

    static PromotedStation b(ap ap1)
    {
        return ap1.C;
    }

    private void b(StationRecommendation stationrecommendation)
    {
        PandoraIntent pandoraintent;
        if (stationrecommendation == com.pandora.radio.provider.k.c || stationrecommendation.j() == com.pandora.radio.data.StationRecommendations.b.g)
        {
            if (stationrecommendation.j() == com.pandora.radio.data.StationRecommendations.b.g)
            {
                B.b(stationrecommendation);
            }
            stationrecommendation = new com.pandora.radio.util.c(null);
            if (com.pandora.android.util.s.u())
            {
                b.a.C().a(TabletHome.a(y, stationrecommendation, u()));
                return;
            } else
            {
                i.a(p.ca.ar.a(y, stationrecommendation));
                return;
            }
        }
        com.pandora.android.util.s.j();
        pandoraintent = new PandoraIntent("cmd_create_station");
        pandoraintent.putExtra("intent_music_token", stationrecommendation.n());
        pandoraintent.putExtra("intent_allow_video_ad_opportunity", false);
        if (!(stationrecommendation instanceof PromotedStation)) goto _L2; else goto _L1
_L1:
        stationrecommendation = (PromotedStation)stationrecommendation;
        pandoraintent.putExtra("intent_promoted_station_campaign_id", stationrecommendation.c());
        pandoraintent.putExtra("intent_station_creation_source", p.cx.x.e.f.ordinal());
        pandoraintent.putExtra("intent_ad_server_correlation_id", stationrecommendation.h());
        stationrecommendation.a(b.a.b());
        b.a.b().o().b(stationrecommendation.c());
_L4:
        b.a.C().a(pandoraintent);
        return;
_L2:
        pandoraintent.putExtra("intent_station_creation_source", p.cx.x.e.b.ordinal());
        B.b(stationrecommendation);
        g g1 = j.a();
        if (g1 != null && g1.a() && stationrecommendation == g1.d())
        {
            b.a.b().o().a(stationrecommendation.n());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(String s1)
    {
        r();
        k = s1;
        d("queryForStations");
    }

    private void c(String s1)
    {
        if (isVisible())
        {
            Object obj = m_();
            int j1 = ((ListView) (obj)).getFirstVisiblePosition();
            int k1 = ((ListView) (obj)).getLastVisiblePosition();
            int i1 = j1;
            while (i1 <= k1) 
            {
                Object obj1 = (Cursor)((ListView) (obj)).getItemAtPosition(i1);
                if (obj1 != null && j.getItemViewType(((Cursor) (obj1)).getPosition()) == 0)
                {
                    obj1 = new y(((Cursor) (obj1)));
                    if (h().equals(((y) (obj1)).c()))
                    {
                        obj = (ImageView)((ListView) (obj)).getChildAt(i1 - j1).findViewById(0x7f1000b5);
                        p.l.g.a(this).a(s1).a(i.b).a(p.s.b.c).a(((ImageView) (obj)).getDrawable()).c().a(((ImageView) (obj)));
                        return;
                    }
                }
                i1++;
            }
        }
    }

    static void c(ap ap1)
    {
        ap1.w();
    }

    static f d(ap ap1)
    {
        return ap1.O;
    }

    private void d(String s1)
    {
        if (r != null)
        {
            j.notifyDataSetChanged();
            K.a(m_());
            r.b(23, null, V);
        }
    }

    static String e(ap ap1)
    {
        return ap1.k;
    }

    public static ap e()
    {
        return new ap();
    }

    private void e(String s1)
    {
        b(s1);
        b.a.b().x().a("SORT_PREFERENCE", s1);
        b.a.e().a(new t(s1));
    }

    public static com.pandora.android.activity.f f()
    {
        return new com.pandora.android.activity.f("stations", b.a.h().getString(0x7f080274), p/ca/ap, null, U);
    }

    static void f(ap ap1)
    {
        ap1.r();
    }

    static af g(ap ap1)
    {
        return ap1.z;
    }

    static OnListItemEntranceListener h(ap ap1)
    {
        return ap1.K;
    }

    static boolean i(ap ap1)
    {
        return ap1.A();
    }

    static StationRecommendations j(ap ap1)
    {
        return ap1.y;
    }

    static com.pandora.radio.provider.i j()
    {
        return b.a.b().y();
    }

    static com.pandora.radio.provider.j k(ap ap1)
    {
        return ap1.A;
    }

    static aa l(ap ap1)
    {
        return ap1.B;
    }

    static a[] l()
    {
        return Q;
    }

    static void m(ap ap1)
    {
        ap1.s();
    }

    static a[] m()
    {
        return R;
    }

    static void n(ap ap1)
    {
        ap1.C();
    }

    static a[] n()
    {
        return S;
    }

    static void o(ap ap1)
    {
        ap1.x();
    }

    static a[] o()
    {
        return T;
    }

    private void p()
    {
        int i1 = E.getHeight();
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(F, "translationY", new float[] {
            0.0F, (float)(i1 * -1)
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(E, "translationY", new float[] {
            0.0F, (float)(i1 / 2)
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(E, "alpha", new float[] {
            1.0F, 0.0F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(getActivity().getResources().getInteger(0x10e0001));
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2
        });
        animatorset.addListener(new AnimatorListenerAdapter() {

            final ap a;

            public void onAnimationEnd(Animator animator)
            {
                p.ca.ap.n(a);
            }

            
            {
                a = ap.this;
                super();
            }
        });
        animatorset.start();
    }

    static void p(ap ap1)
    {
        ap1.p();
    }

    private void q()
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(F, "translationY", new float[] {
            F.getTranslationY(), 0.0F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(E, "translationY", new float[] {
            E.getTranslationY(), 0.0F
        });
        ObjectAnimator objectanimator2 = ObjectAnimator.ofFloat(E, "alpha", new float[] {
            0.0F, 1.0F
        });
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.setDuration(getActivity().getResources().getInteger(0x10e0001));
        animatorset.playTogether(new Animator[] {
            objectanimator, objectanimator1, objectanimator2
        });
        animatorset.start();
    }

    private void r()
    {
        if (j == null)
        {
            m_().addHeaderView(u);
            j = new ao(this, null, L, B);
            a(j);
        }
        j.a(getActivity());
    }

    private void s()
    {
        if (!J && s >= 0)
        {
            ListView listview = m_();
            if (listview != null)
            {
                listview.setSelection(s);
            }
        }
    }

    private void t()
    {
        O.a(true);
        p = false;
        x();
    }

    private Bundle u()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(com.pandora.android.tablet.TabletHome.c.a);
        Bundle bundle = new Bundle(1);
        bundle.putString("intent_station_pane_stack", com.pandora.android.tablet.TabletHome.c.a(arraylist));
        return bundle;
    }

    private void w()
    {
label0:
        {
            if (j != null && j.a() != null && j().a() > 1)
            {
                if (!com.pandora.android.util.s.u())
                {
                    break label0;
                }
                b.a.C().a(TabletHome.c(k));
            }
            return;
        }
        i.a(p.ca.am.a(getString(0x7f080264), k));
    }

    private void x()
    {
        if (n)
        {
            n = false;
            m.setVisibility(4);
        }
    }

    private void y()
    {
        d("onStationRecommendations");
    }

    private void z()
    {
        if (C != null && C.f())
        {
            I.a(p.dk.a.a.b);
        }
    }

    public void a(ListView listview, View view, int i1, long l1)
    {
label0:
        {
            super.a(listview, view, i1, l1);
            p.df.b.a();
            p.df.b.a("STATION START");
            int j1 = i1 - listview.getHeaderViewsCount();
            if (j1 >= 0)
            {
                listview = (g)listview.getItemAtPosition(i1);
                if (!listview.b(j1))
                {
                    break label0;
                }
                a(((g) (listview)), i1);
            }
            return;
        }
        b(listview.c());
    }

    protected void a(StationRecommendation stationrecommendation)
    {
        if (stationrecommendation instanceof PromotedStation)
        {
            I.a();
            C = null;
            d("promotedStationDismissed");
            return;
        }
        com.pandora.android.util.s.j();
        B.c(stationrecommendation);
        B.a(b.a.b());
        boolean flag;
        if (b.a.b().a(p.dj.b.a.e) || b.a.b().a(p.dj.b.a.f))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        y.a(stationrecommendation, flag);
        y();
        (new h()).execute(new Object[] {
            b.a.b(), y, stationrecommendation
        });
    }

    public void a(boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        if (j != null && flag != D)
        {
            if (flag)
            {
                J = false;
                if (!flag1)
                {
                    x.f();
                }
                D();
                if (y != null)
                {
                    if (b.a.b().a(p.dj.b.a.e) || b.a.b().a(p.dj.b.a.f))
                    {
                        flag2 = true;
                    }
                    y.a(flag2);
                }
                K.c(m_());
                d("onTopChanged, isTop = true");
            } else
            {
                z();
                B.a(b.a.b());
                K.b(m_());
            }
            D = flag;
        }
        super.a(flag, flag1);
    }

    public boolean a()
    {
        return false;
    }

    public boolean a(Intent intent)
    {
        if (intent.getAction().equals(PandoraIntent.a("show_now_playing")))
        {
            if (com.pandora.android.ads.VideoAdManager.c.a().l())
            {
                a("skipping nowplaying start - waiting for video ad to finish");
                return false;
            }
            if (com.pandora.android.activity.a.c())
            {
                a("skipping nowplaying start - it's starting up already");
                return false;
            }
            Bundle bundle = intent.getExtras();
            if (bundle != null)
            {
                a("starting nowplaying");
                com.pandora.android.activity.c.a().a(this, com/pandora/android/activity/NowPlaying, 0x4000000, bundle, 132, new Pair(Integer.valueOf(0), Integer.valueOf(0)));
                return true;
            }
        }
        return super.a(intent);
    }

    public void b(Bundle bundle)
    {
        if (j != null)
        {
            (new q(b.a.b())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            if (!H)
            {
                s();
            }
            H = false;
        }
    }

    public void b(boolean flag)
    {
        if (flag)
        {
            p = true;
            return;
        } else
        {
            t();
            return;
        }
    }

    public boolean c()
    {
        return false;
    }

    public CharSequence d()
    {
        return getString(0x7f080274);
    }

    protected boolean g()
    {
        aj aj1;
        boolean flag2;
        flag2 = true;
        boolean flag;
        if (b.a.b().a(p.dj.b.a.e) || b.a.b().a(p.dj.b.a.f))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return false;
        }
        aj1 = b.a.b().k().J();
        if (z == null || !z.q()) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (com.pandora.android.util.s.u()) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (aj1 == null) goto _L4; else goto _L5
_L5:
        if (aj1.g()) goto _L2; else goto _L6
_L6:
        flag1 = flag2;
_L4:
        return flag1;
_L2:
        flag1 = false;
        if (true) goto _L4; else goto _L7
_L7:
    }

    String h()
    {
        if (t != null)
        {
            return t.c();
        } else
        {
            return null;
        }
    }

    public f k()
    {
        return O;
    }

    public int l_()
    {
        return HomeTabsActivity.r();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = m_();
        bundle.setOnItemLongClickListener(this);
        registerForContextMenu(bundle);
        bundle.setOnScrollListener(K);
        K.a(this);
        u = LayoutInflater.from(b.a.h()).inflate(0x7f0400a7, null);
        v = (RadioButton)u.findViewById(0x7f1002b2);
        w = (RadioButton)u.findViewById(0x7f1002b3);
        if (v != null)
        {
            v.setOnClickListener(M);
            w.setOnClickListener(N);
            boolean flag1 = com.pandora.radio.provider.h.b.equals(k);
            bundle = w;
            boolean flag;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bundle.setChecked(flag);
            v.setChecked(flag1);
        }
        r = getLoaderManager();
        r.a(23, null, V);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 132 && j1 == -1 && intent != null)
        {
            H = intent.getBooleanExtra("suppressScroll", false);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        k = b.a.b().x().b("SORT_PREFERENCE");
        if (k == null)
        {
            k = com.pandora.radio.provider.h.b;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400a0, viewgroup, false);
        m = (TextView)layoutinflater.findViewById(0x7f1002a5);
        x = (SearchBox)layoutinflater.findViewById(0x7f100043);
        E = layoutinflater.findViewById(0x7f1002a3);
        F = layoutinflater.findViewById(0x7f1002a2);
        G = layoutinflater.findViewById(0x7f1002a4);
        O = com.pandora.android.view.f.a.a(layoutinflater.findViewById(0x7f1002a6), P);
        viewgroup = new com.pandora.android.view.c();
        E.setBackgroundDrawable(viewgroup);
        D();
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        r.a(23);
        p = false;
        E.getBackground().setCallback(null);
        E = null;
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = (g)adapterview.getItemAtPosition(i1);
        J = true;
        i1 -= m_().getHeaderViewsCount();
        if (!adapterview.b(i1)) goto _L2; else goto _L1
_L1:
        adapterview = new y(adapterview);
        if (!adapterview.j() || adapterview.k()) goto _L4; else goto _L3
_L3:
        w();
_L6:
        return true;
_L4:
        j.a(view, adapterview, null, i1);
        return true;
_L2:
        adapterview = adapterview.c();
        if (adapterview != null && adapterview != com.pandora.radio.provider.k.c && adapterview.j() != com.pandora.radio.data.StationRecommendations.b.g)
        {
            j.a(view, null, adapterview, i1);
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131755038: 
            e(com.pandora.radio.provider.h.a);
            return true;

        case 2131755039: 
            e(com.pandora.radio.provider.h.b);
            return true;

        case 2131755037: 
            com.pandora.android.activity.a.a(getActivity(), null);
            return true;
        }
    }

    public void onPause()
    {
        super.onPause();
        K.b(m_());
        if (((PowerManager)getActivity().getSystemService("power")).isScreenOn())
        {
            z();
        }
    }

    public void onPromotedStation(ah ah1)
    {
        C = ah1.a;
        d("onPromotedStation(FETCH_SUCCESSFUL)");
    }

    public void onResume()
    {
        boolean flag1 = true;
        super.onResume();
        if (b.a.v())
        {
            return;
        }
        J = false;
        p = true;
        boolean flag = flag1;
        if (!b.a.b().a(p.dj.b.a.e))
        {
            if (b.a.b().a(p.dj.b.a.f))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        if (m_() != null)
        {
            K.c(m_());
        }
        if (y != null)
        {
            y.a(flag);
        }
        m_().setVisibility(0);
        b(((Bundle) (null)));
    }

    public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        if (j != null)
        {
            if ((abslistview = j.a()) != null)
            {
                k1 = abslistview.b();
                J = true;
                if (o != 0 && p && k1 > 10 && i1 > 1 && com.pandora.radio.provider.h.a.equals(k))
                {
                    i1 = (j1 / 2 + i1) - 1;
                    if (abslistview.b(i1))
                    {
                        abslistview = (new y((g)j.getItem(i1))).d();
                        if (!com.pandora.android.util.s.a(abslistview))
                        {
                            char c1 = abslistview.charAt(0);
                            if (Character.isLetter(c1))
                            {
                                if (!n && c1 != q)
                                {
                                    n = true;
                                    m.setVisibility(0);
                                }
                                m.setText(Character.valueOf(c1).toString().toUpperCase(Locale.US));
                                l.removeCallbacks(W);
                                l.postDelayed(W, 2000L);
                                q = c1;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i1)
    {
        o = i1;
    }

    public void onStart()
    {
        super.onStart();
        if (B == null)
        {
            com.pandora.radio.util.k.j j1;
            boolean flag;
            if (b.a.b().a(p.dj.b.a.e) || b.a.b().a(p.dj.b.a.f))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                j1 = com.pandora.radio.util.k.j.c;
            } else
            {
                j1 = com.pandora.radio.util.k.j.b;
            }
            B = new aa(j1);
        }
        if (A != null)
        {
            B.a(A.a());
        }
        r();
    }

    public void onStationData(at at1)
    {
        t = at1.a;
        if (j != null)
        {
            s = a(j.a(), h());
        }
    }

    public void onStationRecommendations(aw aw1)
    {
        com.pandora.android.util.s.k();
        y = aw1.a;
        y();
    }

    public void onStationStateChange(ay ay1)
    {
        static class _cls3
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.dd.bh.a.values().length];
                try
                {
                    b[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[p.dd.bh.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[p.dd.bh.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.dd.bh.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[p.dd.bh.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                a = new int[p.dd.ay.a.values().length];
                try
                {
                    a[p.dd.ay.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dd.ay.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dd.ay.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dd.ay.a.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (p.ca._cls3.a[ay1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());

        case 4: // '\004'
            s = a(j.a(), h());
            j.notifyDataSetChanged();
            K.a(m_());
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onStop()
    {
        super.onStop();
        t();
        B.a(b.a.b());
    }

    public void onTrackState(bh bh1)
    {
        switch (p.ca._cls3.b[bh1.a.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            break;

        case 1: // '\001'
            if (!bh1.b.M())
            {
                c(bh1.b.v());
            }
            break;
        }
    }

    public void onUserData(bo bo1)
    {
        z = bo1.a;
    }

    public void onValueExchangeRewardEvent(bq bq1)
    {
        if (bq1.a())
        {
            d("StartValueExchangeSuccessAppEvent");
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (y == null || y.e())
        {
            b.a.b().n().a();
        }
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.N;
    }

    static 
    {
        Q = (new a[] {
            a.f, a.g, a.h, a.d, a.e
        });
        R = (new a[] {
            a.h
        });
        S = (new a[] {
            a.e
        });
        T = (new a[] {
            a.f, a.g, a.e
        });
    }
}

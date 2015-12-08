// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.tablet;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.widget.popupmenu.f;
import com.pandora.android.activity.BaseAdFragmentActivity;
import com.pandora.android.activity.CapHitActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.activity.c;
import com.pandora.android.activity.n;
import com.pandora.android.ads.StationPaneAdView;
import com.pandora.android.ads.VideoAdManager;
import com.pandora.android.ads.g;
import com.pandora.android.coachmark.CoachmarkBuilder;
import com.pandora.android.eureka.DisappearingMediaRouteButton;
import com.pandora.android.personalization.StationPersonalizationActivity;
import com.pandora.android.util.s;
import com.pandora.android.view.MiniPlayerView;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.j;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.i;
import com.pandora.radio.util.o;
import com.pandora.radio.util.p;
import com.slidingmenu.lib.SlidingMenu;
import java.io.Serializable;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import p.bz.h;
import p.ca.ay;
import p.ca.bb;
import p.ca.q;
import p.ca.x;
import p.cn.e;
import p.cp.b;
import p.cw.d;
import p.dd.an;
import p.dd.as;
import p.dd.at;
import p.dd.au;
import p.dd.av;
import p.dd.az;
import p.dd.bc;
import p.dd.bd;
import p.dd.bh;
import p.dd.bu;
import p.df.a;

// Referenced classes of package com.pandora.android.tablet:
//            a

public class TabletHome extends BaseAdFragmentActivity
    implements android.view.MenuItem.OnMenuItemClickListener, com.android.widget.popupmenu.f.b, n, com.pandora.android.ads.c.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static Map f = new EnumMap(com/pandora/android/util/p);
        private static final a g[];
        com.pandora.android.util.p e;

        static Map a()
        {
            return f;
        }

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/pandora/android/tablet/TabletHome$a, s1);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("NOW_PLAYING", 0);
            b = new a("NO_STATION_SELECTED", 1);
            c = new a("CAP_LIMIT_REACHED", 2);
            d = new a("NO_STATIONS", 3);
            g = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
            e = null;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/pandora/android/tablet/TabletHome$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("SINGLE_PANE", 0);
            b = new b("STATION_PANE_CENTER_PANE", 1);
            c = new b("CENTER_PANE_THIRD_PANE", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        public static final c d;
        public static final c e;
        public static final c f;
        public static final c g;
        public static final c h;
        public static final Map j;
        private static final c k[];
        public com.pandora.android.util.p i;

        public static String a(List list)
        {
            JSONArray jsonarray = new JSONArray();
            for (list = list.iterator(); list.hasNext(); jsonarray.put(((c)list.next()).toString())) { }
            return jsonarray.toString();
        }

        public static List a(String s1)
        {
            ArrayList arraylist;
            int i1;
            try
            {
                arraylist = new ArrayList();
                s1 = new JSONArray(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                p.df.a.c("TabletHome", "Invalid stationPanes array string", s1);
                return null;
            }
            i1 = 0;
            if (i1 >= s1.length())
            {
                break; /* Loop/switch isn't completed */
            }
            arraylist.add((c)Enum.valueOf(com/pandora/android/tablet/TabletHome$c, s1.getString(i1)));
            i1++;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_19;
_L1:
            return arraylist;
        }

        public static c valueOf(String s1)
        {
            return (c)Enum.valueOf(com/pandora/android/tablet/TabletHome$c, s1);
        }

        public static c[] values()
        {
            return (c[])k.clone();
        }

        static 
        {
            int i1 = 0;
            a = new c("STATION_LIST", 0, com.pandora.android.util.p.a);
            b = new c("GENRE_CATEGEORIES", 1, com.pandora.android.util.p.h);
            c = new c("GENRE_STATIONS_LIST", 2, com.pandora.android.util.p.i);
            d = new c("SHUFFLE_LIST_EDIT", 3);
            e = new c("SEARCH_ADD_MUSIC_SEED", 4, com.pandora.android.util.p.d);
            f = new c("SEARCH_CREATE_STATION", 5, com.pandora.android.util.p.c);
            g = new c("SEARCH_RESULTS", 6, com.pandora.android.util.p.b);
            h = new c("ALL_RECOMMENDATIONS", 7);
            k = (new c[] {
                a, b, c, d, e, f, g, h
            });
            j = new EnumMap(com/pandora/android/util/p);
            c ac1[] = values();
            for (int j1 = ac1.length; i1 < j1; i1++)
            {
                c c1 = ac1[i1];
                if (c1.i == null)
                {
                    continue;
                }
                if (com.pandora.android.tablet.TabletHome.a(c1.i))
                {
                    throw new RuntimeException((new StringBuilder()).append("PageName used more than once in a pane enum: ").append(c1.i).toString());
                }
                j.put(c1.i, c1);
            }

        }

        private c(String s1, int i1)
        {
            super(s1, i1);
            i = null;
        }

        private c(String s1, int i1, com.pandora.android.util.p p1)
        {
            super(s1, i1);
            i = null;
            i = p1;
        }
    }

    public static final class d extends Enum
    {

        private static final Map A;
        private static final d B[];
        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        public static final d g;
        public static final d h;
        public static final d i;
        public static final d j;
        public static final d k;
        public static final d l;
        public static final d m;
        public static final d n;
        public static final d o;
        public static final d p;
        public static final d q;
        public static final d r;
        public static final d s;
        public static final d t;
        public static final d u;
        public static final d v;
        public static final d w;
        public static final d x;
        public static final d y;
        private com.pandora.android.util.p z;

        static Map a()
        {
            return A;
        }

        public static d valueOf(String s1)
        {
            return (d)Enum.valueOf(com/pandora/android/tablet/TabletHome$d, s1);
        }

        public static d[] values()
        {
            return (d[])B.clone();
        }

        static 
        {
            int i1 = 0;
            a = new d("FEED", 0, com.pandora.android.util.p.j);
            b = new d("FIND_PEOPLE", 1, com.pandora.android.util.p.k);
            c = new d("PROFILE", 2, com.pandora.android.util.p.l);
            d = new d("BOOKMARKS", 3, com.pandora.android.util.p.n);
            e = new d("LIKES", 4, com.pandora.android.util.p.o);
            f = new d("FOLLOWING", 5, com.pandora.android.util.p.p);
            g = new d("FOLLOWERS", 6, com.pandora.android.util.p.q);
            h = new d("SETTINGS", 7, com.pandora.android.util.p.r);
            i = new d("P1_UPGRADE", 8, com.pandora.android.util.p.s);
            j = new d("PRIVACY_SETTINGS", 9, com.pandora.android.util.p.t);
            k = new d("ACCOUNT_SETTINGS", 10, com.pandora.android.util.p.u);
            l = new d("COMMUNICATIONS_SETTINGS", 11, com.pandora.android.util.p.v);
            m = new d("ADVANCED_SETTINGS", 12, com.pandora.android.util.p.w);
            n = new d("DEVICES_SETTINGS", 13, com.pandora.android.util.p.z);
            o = new d("ARTIST_MESSAGE_SETTINGS", 14, com.pandora.android.util.p.A);
            p = new d("SLEEP_TIMER_SETTINGS", 15, com.pandora.android.util.p.x);
            q = new d("ALARM_CLOCK_SETTINGS", 16, com.pandora.android.util.p.y);
            r = new d("NOTICES", 17, com.pandora.android.util.p.B);
            s = new d("TRACK_DETAIL", 18, com.pandora.android.util.p.C);
            t = new d("ARTIST_DETAIL", 19, com.pandora.android.util.p.D);
            u = new d("ALBUM_DETAIL", 20, com.pandora.android.util.p.E);
            v = new d("STATION_DETAILS", 21, com.pandora.android.util.p.e);
            w = new d("STATION_PERSONALIZATION", 22, com.pandora.android.util.p.H);
            x = new d("EDIT_STATION", 23, com.pandora.android.util.p.f);
            y = new d("EDIT_PROFILE", 24, com.pandora.android.util.p.m);
            B = (new d[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y
            });
            A = new EnumMap(com/pandora/android/util/p);
            d ad1[] = values();
            for (int j1 = ad1.length; i1 < j1; i1++)
            {
                d d1 = ad1[i1];
                if (d1.z == null)
                {
                    continue;
                }
                if (com.pandora.android.tablet.TabletHome.a(d1.z))
                {
                    throw new RuntimeException((new StringBuilder()).append("PageName used more than once in a pane enum: ").append(d1.z).toString());
                }
                A.put(d1.z, d1);
            }

        }

        private d(String s1, int i1, com.pandora.android.util.p p1)
        {
            super(s1, i1);
            z = null;
            z = p1;
        }
    }

    public static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        public static final e d;
        private static final e f[];
        private final String e;

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(com/pandora/android/tablet/TabletHome$e, s1);
        }

        public static e[] values()
        {
            return (e[])f.clone();
        }

        public String toString()
        {
            return e;
        }

        static 
        {
            a = new e("FEED", 0, "Feed");
            b = new e("PROFILE", 1, "Profile");
            c = new e("SETTINGS", 2, "Settings");
            d = new e("STATION_PERSONALIZATION", 3, "Station Personalization");
            f = (new e[] {
                a, b, c, d
            });
        }

        private e(String s1, int i1, String s2)
        {
            super(s1, i1);
            e = s2;
        }
    }

    class f
        implements Runnable
    {

        final TabletHome a;
        private final aa b;
        private final int c;

        public void run()
        {
            if (!com.pandora.android.tablet.TabletHome.a(a))
            {
                com.pandora.android.tablet.TabletHome.a(a, "updateTrackInfo (skipping - we're not added)");
                return;
            }
            TabletHome tablethome = a;
            StringBuilder stringbuilder = (new StringBuilder()).append("updateTrackInfo (actual) - selected track ");
            String s1;
            if (b != null)
            {
                if (b.M())
                {
                    s1 = "AudioAd";
                } else
                {
                    s1 = (new StringBuilder()).append("Track [").append(b.s()).append("]").toString();
                }
            } else
            {
                s1 = "NULL";
            }
            com.pandora.android.tablet.TabletHome.b(tablethome, stringbuilder.append(s1).toString());
            if (b != null)
            {
                ((bb)com.pandora.android.tablet.TabletHome.c(a).e()).a(b, c, com.pandora.android.tablet.TabletHome.b(a));
            }
            com.pandora.android.tablet.TabletHome.a(a, null);
        }

        public f(aa aa1, int i1)
        {
            a = TabletHome.this;
            super();
            b = aa1;
            c = i1;
        }
    }


    private View A;
    private View B;
    private View C;
    private View D;
    private View E;
    private View F;
    private View G;
    private View H;
    private View I;
    private View J;
    private View K;
    private TextView L;
    private MiniPlayerView M;
    private MenuItem N;
    private DisappearingMediaRouteButton O;
    private boolean P;
    private boolean Q;
    private com.pandora.android.personalization.view.c R;
    private com.pandora.android.tablet.a S;
    private Handler T;
    private String U;
    private aa V;
    private y W;
    private boolean X;
    private long Y;
    private long Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private AlertDialog ad;
    private boolean ae;
    private Bundle af;
    private f ag;
    protected ScrollView o;
    protected SlidingMenu p;
    protected int z;

    public TabletHome()
    {
        P = true;
        Q = true;
        z = -1;
        aa = false;
        ab = true;
        ae = false;
        af = null;
    }

    public static Intent a(com.pandora.android.util.p p1, Bundle bundle)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.c);
        pandoraintent.putExtra("tablet_home_third_pane_view", (Serializable)com.pandora.android.tablet.d.a().get(p1));
        if (bundle != null)
        {
            pandoraintent.putExtras(bundle);
        }
        return pandoraintent;
    }

    public static Intent a(StationRecommendations stationrecommendations, com.pandora.radio.util.j j1, Bundle bundle)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.h);
        pandoraintent.putExtra("intent_station_recommendations", stationrecommendations);
        pandoraintent.putExtra("intent_search_result_consumer", j1);
        if (bundle != null)
        {
            pandoraintent.putExtra("intent_extra_key", bundle);
        }
        return pandoraintent;
    }

    public static Intent a(j j1, com.pandora.radio.util.j j2, Bundle bundle)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.c);
        pandoraintent.putExtra("intent_genre_name", j1.a());
        pandoraintent.putExtra("intent_genre_category_name", j1.a());
        pandoraintent.putExtra("intent_category_gcat", j1.b());
        pandoraintent.putExtra("intent_category_ad_url", j1.c());
        pandoraintent.putExtra("intent_stations_list", j1.d());
        pandoraintent.putExtra("intent_search_result_consumer", j2);
        if (bundle != null)
        {
            pandoraintent.putExtra("intent_extra_key", bundle);
        }
        return pandoraintent;
    }

    public static Intent a(com.pandora.radio.util.j j1, Bundle bundle)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.b);
        pandoraintent.putExtra("intent_search_result_consumer", j1);
        if (bundle != null)
        {
            pandoraintent.putExtra("intent_extra_key", bundle);
        }
        return pandoraintent;
    }

    static f a(TabletHome tablethome, f f1)
    {
        tablethome.ag = f1;
        return f1;
    }

    public static void a(Activity activity)
    {
        a(activity, p.cp.b.i(), true, null, 1310, "saveClicked", activity.getResources().getString(0x7f08013c));
    }

    public static void a(Activity activity, Bundle bundle)
    {
        com.pandora.android.activity.c.a().a(activity, com/pandora/android/tablet/TabletHome, 0x24000000, bundle);
    }

    public static void a(Activity activity, String s1)
    {
        if (!com.pandora.android.provider.b.a.b().y().c(s1))
        {
            return;
        } else
        {
            a(activity, p.cp.b.c(s1), true, s1, 1986, "saveClicked", activity.getResources().getString(0x7f08013d));
            return;
        }
    }

    public static void a(Activity activity, String s1, boolean flag, String s2, int i1, String s3, String s4)
    {
        if (activity == null || activity.isFinishing())
        {
            p.df.a.a("TabletHome", "TabletHome.showEditModal(...) --> Activity is null.  Aborting!");
            return;
        } else
        {
            s1 = q.b(s1, flag, s2, q.a, i1, s3, s4);
            s1.putBoolean("intent_modal_presenter_show_header", true);
            s1.putString("intent_title", s4);
            s1.putSerializable("intent_modal_presenter_left_button_type", com.pandora.android.view.HeaderLayout.a.e);
            s1.putString("intent_modal_presenter_right_button_title", "Save");
            s1.putInt("intent_modal_presenter_header_color", q.a);
            s1.putInt("intent_modal_presenter_footer_color", q.a);
            com.pandora.android.activity.a.a(activity, p/ca/q, 0, s1, 131);
            return;
        }
    }

    private void a(d d1)
    {
        S.a(com.pandora.android.tablet.b.c);
        Intent intent = new Intent();
        if (W != null)
        {
            intent.putExtra("intent_station_token", W.c());
        }
        S.a(intent, d1, true, Z);
        if (!p.b())
        {
            p.a(true);
        }
    }

    static void a(TabletHome tablethome, int i1)
    {
        tablethome.d(i1);
    }

    static void a(TabletHome tablethome, String s1)
    {
        tablethome.f(s1);
    }

    private void a(aa aa1, int i1)
    {
        if (ar())
        {
            aa aa2 = aa1;
            if (aa1 == null)
            {
                aa2 = ap().a();
            }
            f("updateTrackInfo (request)");
            if (ag != null)
            {
                T.removeCallbacks(ag);
            }
            ag = new f(aa2, i1);
            T.postDelayed(ag, 250L);
            return;
        } else
        {
            f("updateTrackInfo (skipping - we're not added)");
            return;
        }
    }

    static boolean a(TabletHome tablethome)
    {
        return tablethome.ar();
    }

    static boolean a(TabletHome tablethome, boolean flag)
    {
        tablethome.ac = flag;
        return flag;
    }

    static boolean a(com.pandora.android.util.p p1)
    {
        return b(p1);
    }

    private boolean a(aa aa1)
    {
        if (aa1 != null && !aa1.M() && af != null && af.containsKey("intent_followon_action"))
        {
            aa1 = new Intent(af.getString("intent_followon_action"));
            af.remove("intent_followon_action");
            aa1.putExtras(af);
            com.pandora.android.provider.b.a.C().a(aa1);
            af = null;
            return true;
        } else
        {
            return false;
        }
    }

    private void aA()
    {
        Object obj = getWindow().getCurrentFocus();
        if (obj != null)
        {
            ((View) (obj)).clearFocus();
        }
        obj = new p.bz.i.a();
        ((p.bz.i.a) (obj)).a(com.pandora.android.view.HeaderLayout.d.a).d(true).c(false);
        com.pandora.android.provider.b.a.e().a(((p.bz.i.a) (obj)).a());
    }

    private static i aB()
    {
        return com.pandora.android.provider.b.a.b().y();
    }

    private void aC()
    {
        if (S.a(d.v))
        {
            com.pandora.android.provider.b.a.C().a(new PandoraIntent("reload_backstage_page"));
        }
    }

    private void aD()
    {
        if (W != null)
        {
            if (ad == null)
            {
                ad = com.pandora.android.util.s.b(this, W.d());
            }
            if (!ad.isShowing())
            {
                ad.show();
                return;
            }
        }
    }

    private void aE()
    {
        if (!ae)
        {
            View view = M.getThumbDown();
            View view1 = M.getThumbUp();
            boolean flag = com.pandora.android.util.q.a(w, this, W, view, view1) | com.pandora.android.util.q.a(w, this, W, V);
            if (!flag)
            {
                com.pandora.android.util.q.b(w, this, W, V);
            }
            ae = true;
        }
    }

    public static Intent af()
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.a);
        pandoraintent.putExtra("tablet_home_center_pane_view", com.pandora.android.tablet.a.d);
        return pandoraintent;
    }

    public static Intent ag()
    {
        if (aB().d())
        {
            return ak();
        } else
        {
            return af();
        }
    }

    public static Intent ah()
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.a);
        pandoraintent.putExtra("tablet_home_center_pane_view", com.pandora.android.tablet.a.b);
        return pandoraintent;
    }

    public static Intent ai()
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.a);
        pandoraintent.putExtra("tablet_home_center_pane_view", com.pandora.android.tablet.a.c);
        return pandoraintent;
    }

    public static Intent aj()
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.a);
        pandoraintent.putExtra("tablet_home_center_pane_view", com.pandora.android.tablet.a.a);
        return pandoraintent;
    }

    public static Intent ak()
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.a);
        return pandoraintent;
    }

    public static Intent al()
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.f);
        return pandoraintent;
    }

    public static Intent am()
    {
        if (!aB().d())
        {
            return af();
        } else
        {
            PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
            pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
            pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.f);
            return pandoraintent;
        }
    }

    private ay ap()
    {
        if (aq())
        {
            return (ay)S.d();
        } else
        {
            return null;
        }
    }

    private boolean aq()
    {
        return S.d() instanceof ay;
    }

    private boolean ar()
    {
        return S.e() instanceof bb;
    }

    private com.android.widget.popupmenu.f as()
    {
        int i1 = 0;
        com.android.widget.popupmenu.f f1 = new com.android.widget.popupmenu.f(this, findViewById(0x7f1002cd));
        f1.a(this);
        f1.a().clear();
        f1.a(false);
        f1.a(0x7f120025);
        for (Menu menu = f1.a(); i1 < menu.size(); i1++)
        {
            menu.getItem(i1).setEnabled(P);
        }

        return f1;
    }

    private void at()
    {
        if (aq())
        {
            z = ap().e();
            return;
        } else
        {
            z = -1;
            return;
        }
    }

    private void au()
    {
        if (S.a(com.pandora.android.tablet.a.a))
        {
            com.pandora.radio.util.o.b b1;
            if (aq())
            {
                if (z > 1)
                {
                    b1 = com.pandora.radio.util.o.b.c;
                } else
                {
                    b1 = com.pandora.radio.util.o.b.b;
                }
            } else
            {
                b1 = com.pandora.radio.util.o.b.b;
            }
            com.pandora.radio.util.p.a().a(b1, com.pandora.radio.util.o.a.a(), s);
        }
    }

    private void av()
    {
        Object obj;
        Object obj1;
        obj = getIntent();
        if (obj == null)
        {
            p.df.a.a("TabletHome", "TabletHome.handleIntent() --> Intent was null");
            return;
        }
        if (((Intent) (obj)).getExtras() == null)
        {
            p.df.a.a("TabletHome", "TabletHome.handleIntent() --> Missing extras bundle");
            setIntent(null);
            return;
        }
        p.df.a.a("TabletHome", (new StringBuilder()).append("TabletHome.handleIntent() --> ").append(obj).append(", ").append(((Intent) (obj)).getExtras()).toString());
        f(((Intent) (obj)));
        if (!((Intent) (obj)).hasExtra("tablet_home_configuration"))
        {
            p.df.a.a("TabletHome", "TabletHome.handleIntent() --> Missing INTENT_TABLET_HOME_CONFIGURATION");
            setIntent(null);
            return;
        }
        P = true;
        obj1 = (b)((Intent) (obj)).getSerializableExtra("tablet_home_configuration");
        static class _cls2
        {

            static final int a[];
            static final int b[];
            static final int c[];
            static final int d[];
            static final int e[];
            static final int f[];
            static final int g[];
            static final int h[];
            static final int i[];

            static 
            {
                i = new int[com.pandora.android.coachmark.e.e.values().length];
                try
                {
                    i[com.pandora.android.coachmark.e.e.j.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror37) { }
                try
                {
                    i[com.pandora.android.coachmark.e.e.k.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror36) { }
                try
                {
                    i[com.pandora.android.coachmark.e.e.l.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror35) { }
                try
                {
                    i[com.pandora.android.coachmark.e.e.m.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror34) { }
                h = new int[p.dd.au.a.values().length];
                try
                {
                    h[p.dd.au.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    h[p.dd.au.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    h[p.dd.au.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    h[p.dd.au.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    h[p.dd.au.a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    h[p.dd.au.a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    h[p.dd.au.a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                g = new int[p.cx.e.a.values().length];
                try
                {
                    g[p.cx.e.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    g[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    g[p.cx.e.a.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    g[p.cx.e.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                f = new int[com.pandora.android.view.HeaderLayout.a.values().length];
                try
                {
                    f[com.pandora.android.view.HeaderLayout.a.e.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    f[com.pandora.android.view.HeaderLayout.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    f[com.pandora.android.view.HeaderLayout.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    f[com.pandora.android.view.HeaderLayout.a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    f[com.pandora.android.view.HeaderLayout.a.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                e = new int[com.pandora.android.view.HeaderLayout.d.values().length];
                try
                {
                    e[com.pandora.android.view.HeaderLayout.d.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    e[com.pandora.android.view.HeaderLayout.d.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    e[com.pandora.android.view.HeaderLayout.d.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                d = new int[p.dd.bh.a.values().length];
                try
                {
                    d[p.dd.bh.a.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    d[p.dd.bh.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    d[p.dd.bh.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    d[p.dd.bh.a.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    d[p.dd.bh.a.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                c = new int[p.dd.ay.a.values().length];
                try
                {
                    c[p.dd.ay.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    c[p.dd.ay.a.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    c[p.dd.ay.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    c[p.dd.ay.a.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                b = new int[e.values().length];
                try
                {
                    b[com.pandora.android.tablet.e.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.pandora.android.tablet.e.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.pandora.android.tablet.e.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[b.values().length];
                try
                {
                    a[com.pandora.android.tablet.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.pandora.android.tablet.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.pandora.android.tablet.b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.android.tablet._cls2.a[((b) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 3: default 160
    //                   1 188
    //                   2 328
    //                   3 391;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid TabletHome.LayoutConfiguration : ").append(obj1).toString());
_L2:
        p.df.a.a("TabletHome", "TabletHome.handleIntent() --> SINGLE_PANE");
        S.a(((b) (obj1)));
        c(((Intent) (obj)));
        Q = false;
        P = false;
_L6:
        super.d();
        if (((Intent) (obj)).hasExtra("intent_followon_intent"))
        {
            obj1 = (Intent)((Intent) (obj)).getParcelableExtra("intent_followon_intent");
            ((Intent) (obj)).removeExtra("intent_followon_intent");
            com.pandora.android.provider.b.a.C().a(((Intent) (obj1)));
        }
        if (((Intent) (obj)).getBooleanExtra("showCoachmark", false) && (com.pandora.android.coachmark.e.e)Enum.valueOf(com/pandora/android/coachmark/e$e, ((Intent) (obj)).getStringExtra("showCoachmarkType")) == com.pandora.android.coachmark.e.e.q)
        {
            obj = (SearchDescriptor)((Intent) (obj)).getParcelableExtra("intent_search_descriptor");
            com.pandora.android.util.q.a(w, ((SearchDescriptor) (obj)).e());
        }
        S.a(null);
        return;
_L3:
        p.df.a.a("TabletHome", "TabletHome.handleIntent() --> STATION_PANE_CENTER_PANE");
        S.a(((b) (obj1)));
        d(((Intent) (obj)));
        boolean flag;
        if (!S.a(com.pandora.android.tablet.a.b) && !S.a(com.pandora.android.tablet.a.c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Q = flag;
        continue; /* Loop/switch isn't completed */
_L4:
        p.df.a.a("TabletHome", "TabletHome.handleIntent() --> CENTER_PANE_THIRD_PANE");
        S.a(((b) (obj1)));
        e(((Intent) (obj)));
        Q = S.a(com.pandora.android.tablet.a.a);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void aw()
    {
        if (findViewById(0x7f1002cc) == null)
        {
            return;
        }
        ImageButton imagebutton = (ImageButton)findViewById(0x7f10000b);
        ImageButton imagebutton1 = (ImageButton)findViewById(0x7f100012);
        ImageButton imagebutton2 = (ImageButton)findViewById(0x7f100018);
        if (!p.b())
        {
            imagebutton.setImageResource(0x7f0201c0);
            imagebutton1.setImageResource(0x7f0201c5);
            imagebutton2.setImageResource(0x7f0201c8);
            return;
        }
        switch (com.pandora.android.tablet._cls2.b[S.g().ordinal()])
        {
        default:
            imagebutton.setImageResource(0x7f0201c0);
            imagebutton1.setImageResource(0x7f0201c5);
            imagebutton2.setImageResource(0x7f0201c8);
            return;

        case 1: // '\001'
            imagebutton.setImageResource(0x7f0201c4);
            imagebutton1.setImageResource(0x7f0201c5);
            imagebutton2.setImageResource(0x7f0201c8);
            return;

        case 2: // '\002'
            imagebutton.setImageResource(0x7f0201c0);
            imagebutton1.setImageResource(0x7f0201c7);
            imagebutton2.setImageResource(0x7f0201c8);
            return;

        case 3: // '\003'
            imagebutton.setImageResource(0x7f0201c0);
            break;
        }
        imagebutton1.setImageResource(0x7f0201c5);
        imagebutton2.setImageResource(0x7f0201ca);
    }

    private void ax()
    {
        ScrollView scrollview = (ScrollView)findViewById(0x7f1002c5);
        if (scrollview != null)
        {
            scrollview.scrollTo(0, 0);
        }
    }

    private void ay()
    {
        Y = System.currentTimeMillis();
        Z = 0L;
    }

    private void az()
    {
        long l1 = System.currentTimeMillis();
        if (l1 >= Y)
        {
            long l2 = Y;
            com.pandora.radio.util.p.a().a(l1 - l2);
        }
        Y = 0L;
        Z = l1;
    }

    public static Intent b(com.pandora.android.util.p p1, Bundle bundle)
    {
        if (!com.pandora.android.tablet.c.j.containsKey(p1))
        {
            throw new IllegalStateException((new StringBuilder()).append("expected a station pane page, was ").append(p1).toString());
        } else
        {
            PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
            pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
            pandoraintent.putExtra("tablet_home_station_pane_view", (Serializable)com.pandora.android.tablet.c.j.get(p1));
            pandoraintent.putExtras(bundle);
            return pandoraintent;
        }
    }

    static String b(TabletHome tablethome)
    {
        return tablethome.U;
    }

    static void b(TabletHome tablethome, String s1)
    {
        tablethome.f(s1);
    }

    static void b(TabletHome tablethome, boolean flag)
    {
        tablethome.c(flag);
    }

    private static boolean b(com.pandora.android.util.p p1)
    {
        while (com.pandora.android.tablet.c.j.containsKey(p1) || com.pandora.android.tablet.a.a().containsKey(p1) || com.pandora.android.tablet.d.a().containsKey(p1)) 
        {
            return true;
        }
        return false;
    }

    private boolean b(aa aa1)
    {
        return !aa1.M() && !aa1.k();
    }

    public static Intent c(Bundle bundle)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtras(bundle);
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.g);
        return pandoraintent;
    }

    public static Intent c(String s1)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
        pandoraintent.putExtra("tablet_home_station_pane_view", com.pandora.android.tablet.c.d);
        pandoraintent.putExtra("intent_station_list_sort_order", s1);
        return pandoraintent;
    }

    static com.pandora.android.tablet.a c(TabletHome tablethome)
    {
        return tablethome.S;
    }

    private void c(Intent intent)
    {
        P = S.a(intent);
        C.setVisibility(8);
        D.setVisibility(8);
        E.setVisibility(8);
        F.setVisibility(8);
        J.setVisibility(8);
        G.setVisibility(0);
        H.getLayoutParams().height = -1;
        K.setVisibility(8);
        o.setVisibility(8);
        I.setVisibility(8);
        ax();
    }

    private void c(boolean flag)
    {
        if (flag && O != null)
        {
            if (O.getVisibility() != 0)
            {
                O.setVisibility(0);
            }
        } else
        if (O != null && O.getVisibility() != 8)
        {
            O.setVisibility(8);
            return;
        }
    }

    public static Intent d(Bundle bundle)
    {
        PandoraIntent pandoraintent = new PandoraIntent("show_tablet_home");
        pandoraintent.putExtra("tablet_home_third_pane_view", com.pandora.android.tablet.d.b);
        pandoraintent.putExtras(bundle);
        return pandoraintent;
    }

    static View d(TabletHome tablethome)
    {
        return tablethome.A;
    }

    private void d(int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 2131755019: 
            a(com.pandora.android.tablet.d.a);
            return;

        case 2131755026: 
            a(com.pandora.android.tablet.d.c);
            return;

        case 2131755032: 
            a(com.pandora.android.tablet.d.h);
            return;

        case 2131755806: 
            a(d.v);
            break;
        }
    }

    private void d(Intent intent)
    {
        G.setVisibility(8);
        C.setVisibility(0);
        D.setVisibility(0);
        F.setVisibility(0);
        J.setVisibility(0);
        I.setVisibility(0);
        o.setVisibility(0);
        a.a a1 = S.b(intent);
        k(a1.a);
        if (a1.b)
        {
            f(intent.getExtras());
        } else
        {
            g(intent.getExtras());
        }
        findViewById(0x7f1002c2).setVisibility(0);
        p.setSlidingEnabled(true);
        if (p.b())
        {
            p.d(true);
        }
    }

    public static Intent e(Bundle bundle)
    {
        com.pandora.android.util.p p1;
        PandoraIntent pandoraintent;
        p1 = (com.pandora.android.util.p)bundle.getSerializable("intent_page_name");
        bundle.remove("intent_page_name");
        pandoraintent = new PandoraIntent("show_tablet_home");
        if (com.pandora.android.tablet.d.a().containsKey(p1))
        {
            pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.c);
            pandoraintent.putExtra("tablet_home_third_pane_view", (Serializable)com.pandora.android.tablet.d.a().get(p1));
        } else
        if (com.pandora.android.tablet.a.a().containsKey(p1))
        {
            pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.c);
            pandoraintent.putExtra("tablet_home_center_pane_view", (Serializable)com.pandora.android.tablet.a.a().get(p1));
        } else
        if (com.pandora.android.tablet.c.j.containsKey(p1))
        {
            pandoraintent.putExtra("tablet_home_configuration", com.pandora.android.tablet.b.b);
            pandoraintent.putExtra("tablet_home_station_pane_view", (Serializable)com.pandora.android.tablet.c.j.get(p1));
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("PageName not found in any of Station/Center/Third pane enums: ").append(p1).toString());
        }
        if (p1 != com.pandora.android.util.p.f) goto _L2; else goto _L1
_L1:
        pandoraintent.putExtra("intent_followon_intent", (new PandoraIntent("show_edit_station")).putExtra("intent_station_token", bundle.getString("intent_station_token")));
_L4:
        pandoraintent.putExtras(bundle);
        return pandoraintent;
_L2:
        if (p1 == com.pandora.android.util.p.m)
        {
            pandoraintent.putExtra("intent_followon_intent", new PandoraIntent("show_edit_profile"));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static View e(TabletHome tablethome)
    {
        return tablethome.B;
    }

    private void e(Intent intent)
    {
        G.setVisibility(8);
        C.setVisibility(0);
        D.setVisibility(0);
        F.setVisibility(0);
        I.setVisibility(0);
        o.setVisibility(0);
        if (S.c(intent).b)
        {
            f(intent.getExtras());
        }
        p.setSlidingEnabled(true);
        if (!p.b())
        {
            p.a(true);
        }
    }

    static View f(TabletHome tablethome)
    {
        return tablethome.D;
    }

    private void f(Intent intent)
    {
        d d1;
        for (d1 = (d)intent.getSerializableExtra("tablet_home_third_pane_view"); d1 != com.pandora.android.tablet.d.b || (b)intent.getSerializableExtra("tablet_home_configuration") != null;)
        {
            return;
        }

        Bundle bundle = S.a();
        bundle.putSerializable("tablet_home_third_pane_view", d1);
        intent.putExtras(bundle);
    }

    private void f(Bundle bundle)
    {
label0:
        {
label1:
            {
                if (!S.a(com.pandora.android.tablet.a.a))
                {
                    break label0;
                }
                J.getLayoutParams().height = -2;
                K.setVisibility(0);
                g(bundle);
                if (aq())
                {
                    bundle = ap();
                    if (z <= -1)
                    {
                        break label1;
                    }
                    bundle.a(z);
                }
                return;
            }
            bundle.f();
            return;
        }
        J.getLayoutParams().height = -1;
        K.setVisibility(8);
        ax();
    }

    static View g(TabletHome tablethome)
    {
        return tablethome.E;
    }

    private void g(Bundle bundle)
    {
        if (bundle != null && aq())
        {
            ap().a_(bundle.getString("intent_welcome_message"));
        }
    }

    private void h(Bundle bundle)
    {
        if (W != null)
        {
            Object obj = S.f();
            boolean flag1;
            if (obj instanceof p.cj.c)
            {
                obj = (p.cj.c)obj;
                boolean flag;
                if (!((p.cj.c) (obj)).b().c().equals(W.c()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag1 = ((p.cj.c) (obj)).i() | flag;
            } else
            {
                flag1 = true;
            }
            obj = new Intent();
            ((Intent) (obj)).putExtras(bundle);
            S.a(com.pandora.android.tablet.b.c);
            S.a(((Intent) (obj)), d.w, flag1);
            if (!p.b())
            {
                p.a(true);
                return;
            }
        }
    }

    static void h(TabletHome tablethome)
    {
        tablethome.az();
    }

    static void i(TabletHome tablethome)
    {
        tablethome.aw();
    }

    static void j(TabletHome tablethome)
    {
        tablethome.aA();
    }

    static void k(TabletHome tablethome)
    {
        tablethome.ay();
    }

    private void k(boolean flag)
    {
        if (S.a(com.pandora.android.tablet.c.a))
        {
            if (flag)
            {
                a("station_list_refresh", true);
            }
            return;
        } else
        {
            H();
            return;
        }
    }

    private void l(boolean flag)
    {
        P = flag;
        if (findViewById(0x7f1002cc) == null)
        {
            return;
        }
        ImageButton imagebutton = (ImageButton)findViewById(0x7f10000b);
        ImageButton imagebutton1 = (ImageButton)findViewById(0x7f100012);
        ImageButton imagebutton2 = (ImageButton)findViewById(0x7f100018);
        imagebutton.setEnabled(flag);
        int i1;
        if (flag)
        {
            i1 = 0x7f0201c0;
        } else
        {
            i1 = 0x7f0201c1;
        }
        imagebutton.setImageResource(i1);
        imagebutton1.setEnabled(flag);
        if (flag)
        {
            i1 = 0x7f0201c5;
        } else
        {
            i1 = 0x7f0201c6;
        }
        imagebutton1.setImageResource(i1);
        imagebutton2.setEnabled(flag);
        if (flag)
        {
            i1 = 0x7f0201c8;
        } else
        {
            i1 = 0x7f0201c9;
        }
        imagebutton2.setImageResource(i1);
    }

    static boolean l(TabletHome tablethome)
    {
        return tablethome.ac;
    }

    static com.android.widget.popupmenu.f m(TabletHome tablethome)
    {
        return tablethome.as();
    }

    private void m(boolean flag)
    {
        if (flag)
        {
            M.setDisplayMode(com.pandora.android.activity.j.a.a);
            return;
        } else
        {
            M.setDisplayMode(com.pandora.android.activity.j.a.d);
            return;
        }
    }

    static com.pandora.android.coachmark.e n(TabletHome tablethome)
    {
        return tablethome.w;
    }

    static DisappearingMediaRouteButton o(TabletHome tablethome)
    {
        return tablethome.O;
    }

    protected PandoraIntentFilter B()
    {
        PandoraIntentFilter pandoraintentfilter = super.B();
        pandoraintentfilter.a("add_music_seed_success");
        pandoraintentfilter.a("handle_share_now_playing");
        pandoraintentfilter.a("iap_complete");
        pandoraintentfilter.a("iap_error");
        return pandoraintentfilter;
    }

    public boolean F()
    {
        return false;
    }

    public boolean G()
    {
        return false;
    }

    protected boolean J()
    {
        return true;
    }

    public void a(int i1, aa aa1)
    {
        a(aa1, i1);
        super.d();
    }

    protected void a(Context context, Intent intent, String s1)
    {
        if (!PandoraIntent.a("add_music_seed_success").equals(s1)) goto _L2; else goto _L1
_L1:
        context = intent.getStringExtra("intent_station_token");
        Toast.makeText(this, getString(0x7f080079, new Object[] {
            intent.getStringExtra("intent_music_display_string"), aB().a(this, context).d()
        }), 1).show();
_L4:
        CapHitActivity.b(s1);
        return;
_L2:
        if (s1.equals(PandoraIntent.a("handle_share_now_playing")))
        {
            intent = ap();
            if (intent == null)
            {
                context = V;
            } else
            {
                context = ap().a();
            }
            if (intent == null)
            {
                intent = p.cn.e.a().e();
            } else
            {
                intent = intent.b();
            }
            com.pandora.android.activity.a.a(this, W, context, intent);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(com.pandora.android.ads.h.b b1)
    {
    }

    public void a(CoachmarkBuilder coachmarkbuilder)
    {
        super.a(coachmarkbuilder);
        com.pandora.android.coachmark.e.e e1 = coachmarkbuilder.e();
        switch (com.pandora.android.tablet._cls2.i[e1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            h(StationPersonalizationActivity.a(W, null, com/pandora/android/tablet/TabletHome, true, false, false));
            return;

        case 2: // '\002'
            com.pandora.android.activity.a.a(this, 1, W, null, null);
            return;

        case 3: // '\003'
            h(StationPersonalizationActivity.a(W, null, com/pandora/android/tablet/TabletHome, false, true, false));
            return;

        case 4: // '\004'
            com.pandora.android.activity.a.a(this, 1, (y)coachmarkbuilder.o(), null, null);
            break;
        }
    }

    protected boolean ab()
    {
        return true;
    }

    protected void ad()
    {
        Object obj = (ImageButton)findViewById(0x7f1002cd);
        if (obj != null)
        {
            ((ImageButton) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final TabletHome a;

                public void onClick(View view)
                {
                    TabletHome.m(a).c();
                }

            
            {
                a = TabletHome.this;
                super();
            }
            });
        }
        obj = new android.view.View.OnClickListener() {

            final TabletHome a;

            public void onClick(View view)
            {
                com.pandora.android.tablet.TabletHome.a(a, view.getId());
                com.pandora.android.tablet.TabletHome.i(a);
            }

            
            {
                a = TabletHome.this;
                super();
            }
        };
        if (findViewById(0x7f1002cc) != null)
        {
            findViewById(0x7f10000b).setOnClickListener(((android.view.View.OnClickListener) (obj)));
            findViewById(0x7f100012).setOnClickListener(((android.view.View.OnClickListener) (obj)));
            findViewById(0x7f100018).setOnClickListener(((android.view.View.OnClickListener) (obj)));
        }
    }

    protected void ae()
    {
        O = (DisappearingMediaRouteButton)findViewById(0x7f10000a);
        com.pandora.android.provider.b.a.c().a(O);
        O.setEnabledListener(new com.pandora.android.eureka.DisappearingMediaRouteButton.a() {

            final TabletHome a;

            public void a(View view, int i1)
            {
                boolean flag = com.pandora.android.provider.b.a.b().k().C();
                if (i1 == 0 && flag)
                {
                    com.pandora.android.util.q.b(com.pandora.android.tablet.TabletHome.n(a), com.pandora.android.tablet.TabletHome.o(a));
                }
            }

            public void a(boolean flag)
            {
                com.pandora.android.tablet.TabletHome.b(a, flag);
            }

            
            {
                a = TabletHome.this;
                super();
            }
        });
        c(O.b());
    }

    public void an()
    {
        ScrollView scrollview = (ScrollView)findViewById(0x7f1002c5);
        if (scrollview != null)
        {
            scrollview.scrollTo(0, J.getBottom());
        }
    }

    public com.pandora.android.personalization.view.c ao()
    {
        return R;
    }

    protected void b()
    {
        super.b();
        av();
        boolean flag = z();
        super.x();
        if (flag)
        {
            y();
        }
        ay ay1 = ap();
        if (ay1 != null)
        {
            ay1.a(z);
        }
    }

    public void b(String s1)
    {
        if ("skip".equals(s1) && com.pandora.android.ads.c.b().b(s1) && com.pandora.android.ads.VideoAdManager.c.a().a(this, null, true))
        {
            return;
        } else
        {
            a(s1, false);
            return;
        }
    }

    public void castDeviceListChanged(p.bz.e e1)
    {
        if (O != null)
        {
            O.a(e1);
        }
    }

    public void f(boolean flag)
    {
        super.f(false);
    }

    public void g(boolean flag)
    {
        super.g(false);
    }

    protected IntentFilter l()
    {
        return B();
    }

    protected int m()
    {
        return 0;
    }

    protected ViewGroup n()
    {
        return (ViewGroup)findViewById(0x7f1002bf);
    }

    protected int o()
    {
        return 0x7f1002c0;
    }

    public void onAutomotiveAccessoryRadioEvent(p.dd.e e1)
    {
        f((new StringBuilder()).append("onAutomotiveAccessoryRadioEvent called: ").append(e1.a).toString());
        if (e1.a == p.dd.e.a.a)
        {
            if (ad != null && ad.isShowing())
            {
                ad.dismiss();
            }
            com.pandora.android.util.s.f();
        }
    }

    public void onBackPressed()
    {
        if (p.b())
        {
            if (S == null || S.f() == null || !((x)S.f()).c())
            {
                p.c(true);
            }
        } else
        if (S == null || S.c() == null || !((x)S.c()).c())
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0400ae);
        A = findViewById(0x7f1002b9);
        B = findViewById(0x7f1002bb);
        A.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            final TabletHome a;

            public void onGlobalLayout()
            {
                if (com.pandora.android.tablet.TabletHome.d(a).getRootView().getHeight() - com.pandora.android.tablet.TabletHome.d(a).getHeight() > com.pandora.android.tablet.TabletHome.d(a).getHeight() / 3)
                {
                    com.pandora.android.tablet.TabletHome.e(a).setVisibility(8);
                    return;
                } else
                {
                    com.pandora.android.tablet.TabletHome.e(a).setVisibility(0);
                    return;
                }
            }

            
            {
                a = TabletHome.this;
                super();
            }
        });
        View view = LayoutInflater.from(this).inflate(0x7f04001a, null);
        android.support.v7.app.ActionBar.LayoutParams layoutparams = new android.support.v7.app.ActionBar.LayoutParams(-2, -2, 17);
        L = (TextView)view.findViewById(0x7f100070);
        j(true);
        a(view, layoutparams);
        h(false);
        T = new Handler(getMainLooper());
        C = findViewById(0x7f1002be);
        D = findViewById(0x7f1002bf);
        E = findViewById(0x7f1002c1);
        F = findViewById(0x7f1002c6);
        G = findViewById(0x7f1002c3);
        H = findViewById(0x7f1002c4);
        I = findViewById(0x7f1002ca);
        J = findViewById(0x7f1002c7);
        K = findViewById(0x7f1002c8);
        M = (MiniPlayerView)findViewById(0x7f1001be);
        S = new com.pandora.android.tablet.a(f(), this, w);
        r();
        v();
        ad();
        ae();
        b(0x7f020230);
        i(true);
        g(false);
        b(bundle);
        m(false);
        if (bundle != null)
        {
            PandoraIntent pandoraintent;
            int i1;
            if (com.pandora.android.provider.b.a.F())
            {
                i1 = -1;
            } else
            {
                i1 = bundle.getInt("TRACK_HISTORY_LAST_TILE_POSITION", -1);
            }
            z = i1;
            ab = false;
            pandoraintent = new PandoraIntent("show_tablet_home");
            bundle = bundle.getBundle("intent_extras_state");
            pandoraintent.putExtras(bundle);
            setIntent(pandoraintent);
            S.a(bundle);
        } else
        {
            a(bundle);
            S.a(null);
        }
        bundle = com.pandora.radio.util.p.a();
        bundle.b(true);
        bundle.a(com.pandora.radio.util.o.b.b, com.pandora.radio.util.o.a.a(), s);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        boolean flag = super.onCreateOptionsMenu(menu);
        y y1;
        if (W == null)
        {
            y1 = com.pandora.android.provider.b.a.b().d().t();
        } else
        {
            y1 = W;
        }
        if (y1 != null && !X && !y1.A())
        {
            if (com.pandora.android.activity.a.a(y1))
            {
                R = com.pandora.android.activity.a.a(this, menu);
                return flag;
            }
            if (!y1.j())
            {
                getMenuInflater().inflate(0x7f12001c, menu);
                N = menu.findItem(0x7f10031e);
                N.setOnMenuItemClickListener(this);
                return flag;
            }
        }
        return flag;
    }

    public void onDeleteStationSuccess(p.dd.p p1)
    {
        android.support.v4.app.Fragment fragment = S.f();
        if ((fragment instanceof p.cj.c) && ((p.cj.c)fragment).b().c().equals(p1.a))
        {
            S.h();
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        au();
    }

    public void onDismissStationRecommendation(av av1)
    {
        if (av1.a)
        {
            com.pandora.android.provider.b.a.b().n().a();
            return;
        } else
        {
            U();
            return;
        }
    }

    public void onHeaderButtonEvent(h h1)
    {
        p.df.a.a("TabletHome", (new StringBuilder()).append("TabletHome.onHeaderButtonEvent --> ").append(h1.a).append(" ").append(h1.b).toString());
        com.pandora.android.tablet._cls2.e[h1.a.ordinal()];
        JVM INSTR tableswitch 1 2: default 76
    //                   1 151
    //                   2 165;
           goto _L1 _L2 _L3
_L1:
        x x1 = null;
_L9:
        com.pandora.android.tablet._cls2.f[h1.b.ordinal()];
        JVM INSTR tableswitch 1 4: default 120
    //                   1 179
    //                   2 236
    //                   3 212
    //                   4 274;
           goto _L4 _L5 _L6 _L7 _L8
_L4:
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid ThirdPaneHeaderLayout.Button : ").append(h1.b).toString());
_L2:
        x1 = (x)S.c();
          goto _L9
_L3:
        x1 = (x)S.f();
          goto _L9
_L5:
        com.pandora.android.tablet._cls2.e[h1.a.ordinal()];
        JVM INSTR tableswitch 1 2: default 212
    //                   1 213
    //                   2 227;
           goto _L7 _L10 _L11
_L7:
        return;
_L10:
        com.pandora.android.provider.b.a.C().a(ak());
        return;
_L11:
        p.c(true);
        return;
_L6:
        if (x1 != null)
        {
            x1.c();
        }
        if (!(S.f() instanceof p.ca.j)) goto _L7; else goto _L12
_L12:
        ((p.ca.j)S.f()).h();
        return;
_L8:
        com.pandora.android.provider.b.a.C().a(a(com.pandora.android.util.p.k, ((Bundle) (null))));
        return;
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        d(menuitem.getItemId());
        return false;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        af = null;
        if (intent != null)
        {
            intent = intent.getExtras();
            if (intent != null && intent.containsKey("intent_followon_action"))
            {
                af = intent;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 2131755044 2131755044: default 24
    //                   2131755044 36;
           goto _L1 _L2
_L1:
        boolean flag = super.onOptionsItemSelected(menuitem);
_L4:
        aw();
        return flag;
_L2:
        h(StationPersonalizationActivity.a(W, null, com/pandora/android/tablet/TabletHome, false, false, false));
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onPause()
    {
        super.onPause();
        setIntent(null);
        au();
        at();
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        p.setSlidingEnabled(P);
        l(P);
        m(Q);
        if (P)
        {
            aw();
        }
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        au();
        if (ab)
        {
            at();
        }
        ab = true;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("intent_extras_state", S.a());
        bundle.putInt("TRACK_HISTORY_LAST_TILE_POSITION", z);
    }

    public void onSignInState(an an1)
    {
        switch (com.pandora.android.tablet._cls2.g[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            S.b();
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onStationCreated(as as1)
    {
        Toast.makeText(this, getString(0x7f080250, new Object[] {
            as1.a.d()
        }), 1).show();
    }

    public void onStationData(at at1)
    {
        W = at1.a;
        if (W != null)
        {
            L.setText(W.d());
            L.setVisibility(0);
        } else
        {
            L.setVisibility(8);
        }
        ae = false;
    }

    public void onStationPersonalizationChanged(au au1)
    {
        com.pandora.android.tablet._cls2.h[au1.b.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 138
    //                   2 83
    //                   3 83
    //                   4 138
    //                   5 138
    //                   6 138
    //                   7 138;
           goto _L1 _L2 _L3 _L3 _L2 _L2 _L2 _L2
_L1:
        throw new InvalidParameterException((new StringBuilder()).append("onSPChange called with unknown reason ").append(au1.b).toString());
_L3:
        int i1;
        if (R != null)
        {
            R.start();
        }
        i1 = au1.a.H() + au1.a.G();
        if (i1 != 1) goto _L5; else goto _L4
_L4:
        if (au1.a.H() != 1) goto _L7; else goto _L6
_L6:
        com.pandora.android.util.q.d(w, this);
_L2:
        return;
_L7:
        com.pandora.android.util.q.e(w, this);
        return;
_L5:
        com.pandora.android.util.q.a(w, this, i1);
        return;
    }

    public void onStationStateChange(p.dd.ay ay1)
    {
        switch (com.pandora.android.tablet._cls2.c[ay1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());

        case 3: // '\003'
        case 4: // '\004'
            aa = true;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
            return;
        }
    }

    public void onSubscriptionExpired(az az1)
    {
        super.onSubscriptionExpired(az1);
    }

    public void onThumbDown(p.dd.bb bb1)
    {
        if (p.cw.d.a(bb1.a))
        {
            return;
        }
        if (bb1.c && aq())
        {
            ((ay)S.d()).a(bb1.b.w(), -1);
        }
        aC();
        com.pandora.android.util.q.b(w, this);
    }

    public void onThumbRevert(bc bc1)
    {
        if (aq())
        {
            ((ay)S.d()).a(bc1.a.w(), bc1.b);
        }
        aC();
    }

    public void onThumbUp(bd bd1)
    {
        if (p.cw.d.a(bd1.a))
        {
            return;
        }
        if (bd1.c && aq())
        {
            ((ay)S.d()).a(bd1.b.w(), 1);
        }
        aC();
        com.pandora.android.util.q.a(w, this);
    }

    public void onTrackState(bh bh1)
    {
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = true;
        U = bh1.c;
        V = bh1.b;
        X = p.cn.e.a().a(V);
        com.pandora.android.tablet._cls2.d[bh1.a.ordinal()];
        JVM INSTR tableswitch 1 5: default 80
    //                   1 111
    //                   2 185
    //                   3 185
    //                   4 184
    //                   5 184;
           goto _L1 _L2 _L3 _L3 _L4 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        throw new InvalidParameterException((new StringBuilder()).append("onTrackState called with unknown TrackStateRadioEvent state : ").append(bh1.a).toString());
_L2:
        if (aa)
        {
            a("station_change", true);
            aa = false;
        }
        if (V != null && b(V))
        {
            z = -1;
        }
        if (!a(V))
        {
            aE();
        }
        if (!V.m())
        {
            a(((com.pandora.radio.util.k.a) (null)));
        }
_L6:
        return;
_L3:
        if (V != null)
        {
            if (V.M())
            {
                bh1 = (com.pandora.radio.data.d)V;
                if (W == null || !W.A())
                {
                    flag = false;
                }
                com.pandora.android.activity.a.a(this, bh1, flag);
                return;
            }
            if (V.k())
            {
                bh1 = V;
                boolean flag1;
                if (W != null && W.A())
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                com.pandora.android.activity.a.a(this, bh1, flag1);
                return;
            } else
            {
                a(V);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onZeroVolumeAutoPause(bu bu1)
    {
        f("onZeroVolumeAutoPause called");
        if (bu1.a)
        {
            aD();
        }
    }

    protected ViewGroup p()
    {
        return (ViewGroup)findViewById(o());
    }

    public void p_()
    {
    }

    protected void r()
    {
        p = (SlidingMenu)findViewById(0x7f1002ba);
        p.setIgnoreManageLayers(true);
        p.setIgnoreQuickReturn(true);
        p.getViewTreeObserver().addOnScrollChangedListener(new android.view.ViewTreeObserver.OnScrollChangedListener() {

            final TabletHome a;
            private Rect b;
            private int c;
            private float d;
            private float e;

            public void onScrollChanged()
            {
                if (c == -1)
                {
                    c = com.pandora.android.tablet.TabletHome.f(a).getMeasuredWidth();
                }
                com.pandora.android.tablet.TabletHome.f(a).getLocalVisibleRect(b);
                d = (float)(c - b.width()) / (float)c;
                if (d == 0.0F && com.pandora.android.tablet.TabletHome.g(a).getVisibility() == 0)
                {
                    com.pandora.android.tablet.TabletHome.g(a).setVisibility(8);
                    p.df.a.a("TabletHome", "TabletHome.onScrollChanged() --> mStationPaneOverlay = View.GONE");
                } else
                if (Math.abs(e - d) > 0.01F)
                {
                    if (com.pandora.android.tablet.TabletHome.g(a).getVisibility() != 0)
                    {
                        com.pandora.android.tablet.TabletHome.g(a).setVisibility(0);
                    }
                    com.pandora.android.tablet.TabletHome.g(a).setAlpha(d);
                    e = d;
                    return;
                }
            }

            
            {
                a = TabletHome.this;
                super();
                b = new Rect();
                c = -1;
            }
        });
        p.setOnCloseListener(new com.slidingmenu.lib.SlidingMenu.b() {

            final TabletHome a;

            public void a()
            {
                com.pandora.android.tablet.TabletHome.c(a).a(false);
                com.pandora.android.tablet.TabletHome.h(a);
                com.pandora.android.tablet.TabletHome.i(a);
                a.a("backstage_close", true);
            }

            
            {
                a = TabletHome.this;
                super();
            }
        });
        p.setOnOpenedListener(new com.slidingmenu.lib.SlidingMenu.e() {

            final TabletHome a;

            public void a()
            {
                com.pandora.android.tablet.TabletHome.j(a);
                com.pandora.android.tablet.TabletHome.c(a).a(true);
                TabletHome.k(a);
                com.pandora.android.tablet.TabletHome.i(a);
            }

            
            {
                a = TabletHome.this;
                super();
            }
        });
    }

    public void s()
    {
        finish();
    }

    public void setTitle(CharSequence charsequence)
    {
        boolean flag = com.pandora.android.activity.a.a(charsequence);
        if (S.f() instanceof p.ca.j)
        {
            ((p.ca.j)S.f()).a(flag);
        }
    }

    public boolean t()
    {
        return S.a(com.pandora.android.tablet.c.a) && !S.i();
    }

    public Point u()
    {
        return null;
    }

    protected void v()
    {
        GestureDetector gesturedetector = new GestureDetector(this, new android.view.GestureDetector.SimpleOnGestureListener() {

            final TabletHome a;

            public boolean onDown(MotionEvent motionevent)
            {
                p.df.a.a("TabletHome", "GestureDetector --> onDown");
                return true;
            }

            public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
            {
                if (!TabletHome.l(a))
                {
                    com.pandora.android.tablet.TabletHome.a(a, true);
                    com.pandora.android.tablet.TabletHome.j(a);
                }
                return false;
            }

            
            {
                a = TabletHome.this;
                super();
            }
        });
        o = (ScrollView)findViewById(0x7f1002c5);
        o.setOnTouchListener(new android.view.View.OnTouchListener(gesturedetector) {

            final GestureDetector a;
            final TabletHome b;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (a.onTouchEvent(motionevent))
                {
                    return true;
                }
                if (motionevent.getAction() == 1 && TabletHome.l(b))
                {
                    p.df.a.a("TabletHome", "OnTouchListener --> onTouch ACTION_UP");
                    com.pandora.android.tablet.TabletHome.a(b, false);
                }
                return false;
            }

            
            {
                b = TabletHome.this;
                a = gesturedetector;
                super();
            }
        });
    }

    protected com.pandora.android.ads.h w()
    {
        return new StationPaneAdView(this);
    }

    protected void x()
    {
    }
}

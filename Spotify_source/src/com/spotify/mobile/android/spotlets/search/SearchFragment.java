// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search;

import abd;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Observable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.common.collect.Maps;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.json.collection.PorcelainJsonImmutableLinearCollection;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.spotlets.search.loader.SearchLoader;
import com.spotify.mobile.android.spotlets.search.logging.SearchIntentSessionTracker;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.activity.DisableOfflineModeActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.framework.flag.NoFlags;
import com.spotify.music.spotlets.FeatureIdentifier;
import ctz;
import cuv;
import dmz;
import dod;
import dpt;
import drc;
import dro;
import drr;
import drz;
import eox;
import epl;
import epn;
import epo;
import epp;
import epu;
import epx;
import ffn;
import ffo;
import ffq;
import ffr;
import ffu;
import ffv;
import ffw;
import ffx;
import ffy;
import ffz;
import fga;
import fgb;
import fgc;
import fge;
import fgf;
import fgh;
import fgk;
import fgm;
import fgn;
import fgo;
import fgp;
import fgq;
import fgu;
import fgz;
import fha;
import fhb;
import fhc;
import fhd;
import fhg;
import fhh;
import fiy;
import fog;
import fol;
import fop;
import for;
import fos;
import fot;
import fpe;
import fpf;
import fud;
import fxf;
import fxy;
import fyj;
import fyw;
import fyx;
import gbr;
import gcl;
import geh;
import gex;
import ggl;
import ggn;
import ggp;
import gjm;
import gjn;
import gms;
import gnl;
import gpl;
import java.text.Normalizer;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import rf;
import u;

public final class SearchFragment extends Fragment
    implements NavigationItem, dod, epu, ffu, fol, fot, fxy, gjn
{

    private static final Object ad = new Object();
    String Y;
    com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType Z;
    fgk a;
    private boolean aA;
    private SearchResults aB;
    private int aC;
    private Parcelable aD;
    private boolean aE;
    private SearchLoader aF;
    private final fhb aG = new fhb() {

        private SearchFragment a;

        private void a()
        {
            fpf fpf1 = (fpf)a.k();
            if (fpf1 != null && fpf1.g())
            {
                fpf1.h();
            }
        }

        public final void a(String s1)
        {
            if (a.o() && SearchFragment.a(a) != null)
            {
                if (!TextUtils.equals(s1 = s1.trim(), a.b))
                {
                    a();
                    a.b = s1;
                    a.Z = com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a;
                    SearchFragment.b(a);
                    SearchFragment.c(a);
                    return;
                }
            }
        }

        public final void a(boolean flag)
        {
            if (!SearchFragment.e(a) && flag)
            {
                a();
            }
        }

        public final void b(String s1)
        {
            SearchFragment.d(a);
            if (a.o() && SpotifyLink.b(s1))
            {
                a.a(gms.a(a.k(), s1).a);
                return;
            } else
            {
                a.J();
                return;
            }
        }

            
            {
                a = SearchFragment.this;
                super();
            }
    };
    private final Runnable aH = new Runnable() {

        private SearchFragment a;

        public final void run()
        {
            if (SearchFragment.f(a))
            {
                SearchFragment.g(a);
                if (a.Z == com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a && a.aa != 0)
                {
                    SearchFragment.c(a);
                }
            }
            SearchFragment.i(a).postDelayed(this, SearchFragment.h(a));
        }

            
            {
                a = SearchFragment.this;
                super();
            }
    };
    private final ffq aI = new ffq() {

        private SearchFragment a;

        public final Flags a()
        {
            if (SearchFragment.a(a) != null)
            {
                return SearchFragment.a(a);
            } else
            {
                return new NoFlags("getFlags() called before fragment was ready");
            }
        }

        public final boolean b()
        {
            return gex.a(a());
        }

        public final boolean c()
        {
            return SearchFragment.j(a);
        }

        public final boolean d()
        {
            return SearchFragment.k(a);
        }

            
            {
                a = SearchFragment.this;
                super();
            }
    };
    private final fgz aJ = new fgz() {

    };
    private final fhg aK = new fhg() {

        private SearchFragment b;

        public final void a()
        {
            SearchFragment.d(b);
            if (b.ac.b())
            {
                b.J();
            }
        }

        public final void a(int i1)
        {
            int j1 = b.a.b();
            if (i1 >= 0 && i1 < j1)
            {
                SearchFragment.m(b).b(b.a.a(i1), i1, b.v_());
                b.a.b(i1);
                SearchFragment.g(b);
                return;
            } else
            {
                Assertion.b((new StringBuilder("Position out of bounds ")).append(i1).append(" (total: ").append(j1).append(")").toString());
                return;
            }
        }

        public final void a(PorcelainNavigationLink porcelainnavigationlink, int i1, int j1)
        {
            Object obj = fge.a(porcelainnavigationlink, b.ac.g.c, i1, b.v_());
            final class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.values().length];
                    try
                    {
                        a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.d.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.a.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            String s1;
            switch (_cls2.a[porcelainnavigationlink.getType().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                b.a(porcelainnavigationlink);
                SearchFragment.m(b).a(((fgg) (obj)));
                return;

            case 2: // '\002'
                porcelainnavigationlink = SearchFragment.o(b);
                fud.a(((ffo) (porcelainnavigationlink)).b, ((ffo) (porcelainnavigationlink)).a, obj);
                return;

            case 3: // '\003'
                s1 = porcelainnavigationlink.getTargetTitle();
                break;
            }
            obj = s1;
            if (s1 == null)
            {
                Assertion.b("No target title to show!");
                obj = "";
            }
            SearchFragment.a(b, porcelainnavigationlink.getUri(), ((String) (obj)));
        }

        public final void a(drz drz1, int i1)
        {
            SearchFragment.a(b, drz1);
            SearchFragment.m(b).a(fge.a(drz1, b.ac.g.c, i1, b.v_()));
        }

        public final void b(int i1)
        {
            int j1 = b.a.b();
            if (i1 >= 0 && i1 < j1)
            {
                String s1 = b.a.a(i1);
                SearchFragment.b(b, s1);
                SearchFragment.d(b);
                SearchFragment.m(b).a(s1, i1, b.v_());
                return;
            } else
            {
                Assertion.b((new StringBuilder("Position out of bounds ")).append(i1).append(" (total: ").append(j1).append(")").toString());
                return;
            }
        }

        public final boolean b()
        {
            return b.ac.b() && b.ac.g.c.hasMorePages();
        }

        public final void c()
        {
            if (b())
            {
                String s1 = b.ac.g.c.getLoadMoreUri();
                if (s1 != null)
                {
                    SearchFragment.a(b, s1);
                    return;
                } else
                {
                    Assertion.b("onLoadNextPage called with null uri!");
                    return;
                }
            } else
            {
                Assertion.b("Don't call loadNextPage if there is no next page");
                return;
            }
        }

        public final void d()
        {
            SearchFragment.a(b, b.Z, b.b);
            SearchFragment.m(b).a(b.b, b.v_(), SearchFragment.l(b));
        }

        public final void e()
        {
            Object obj = SearchFragment.n(b);
            if (fyj.F())
            {
                NetworkInfo networkinfo = ((ConnectivityManager)((ffn) (obj)).a.k().getSystemService("connectivity")).getActiveNetworkInfo();
                boolean flag;
                if (networkinfo != null && networkinfo.isConnectedOrConnecting())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    if (gcl.g)
                    {
                        if (android.provider.Settings.Global.getInt(((ffn) (obj)).a.k().getContentResolver(), "airplane_mode_on", 0) != 0)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    } else
                    if (android.provider.Settings.System.getInt(((ffn) (obj)).a.k().getContentResolver(), "airplane_mode_on", 0) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        try
                        {
                            ((ffn) (obj)).a.a(new Intent("android.settings.AIRPLANE_MODE_SETTINGS"));
                        }
                        catch (ActivityNotFoundException activitynotfoundexception)
                        {
                            ((ffn) (obj)).a();
                        }
                    } else
                    {
                        ((ffn) (obj)).a();
                    }
                }
            } else
            {
                ((ffn) (obj)).a.a(new Intent(((ffn) (obj)).a.k(), com/spotify/mobile/android/ui/activity/DisableOfflineModeActivity), 1);
            }
            obj = b.ac.g.c;
            SearchFragment.m(b).a(((SearchResults) (obj)).getSearchTerm(), ((SearchResults) (obj)).getLoggingContext(), b.v_(), b.ac.c(), SearchFragment.l(b));
        }

        public final void f()
        {
            b.a.c();
            SearchFragment.g(b);
            SearchFragment.m(b).a(b.v_());
        }

            
            {
                b = SearchFragment.this;
                super();
            }
    };
    private final fxf aL = new fxf() {

        private SearchFragment a;

        public final void a(com.spotify.mobile.android.util.ClientEvent.Event event, Object obj)
        {
            obj = (fge)obj;
            SearchFragment.m(a).a(event, ((fgg) (obj)));
        }

            
            {
                a = SearchFragment.this;
                super();
            }
    };
    private final fgb aM = new fgb() {

        private SearchFragment a;

        public final void a(String s1, String s2)
        {
            SearchFragment.m(a).a(s1, s2, a.v_());
        }

            
            {
                a = SearchFragment.this;
                super();
            }
    };
    int aa;
    int ab;
    fhd ac;
    private final ffn ae = new ffn(this);
    private Resolver af;
    private drr ag;
    private epn ah;
    private SearchIntentSessionTracker ai;
    private ggl aj;
    private Handler ak;
    private int al;
    private ffo am;
    private fgf an;
    private Flags ao;
    private fgq ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private SearchResults at;
    private int au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    String b;

    public SearchFragment()
    {
    }

    private void K()
    {
        String s1 = g().getString("username");
        if (!TextUtils.isEmpty(s1))
        {
            if (o())
            {
                ((epx)dmz.a(epx)).a(this, s1, "search");
            }
            return;
        } else
        {
            ah.a(new epp() {

                private SearchFragment a;

                public final boolean a(epo epo1)
                {
                    if (!epo1.d())
                    {
                        return false;
                    } else
                    {
                        a.g().putString("username", epo1.a());
                        SearchFragment.p(a);
                        return true;
                    }
                }

            
            {
                a = SearchFragment.this;
                super();
            }
            });
            return;
        }
    }

    private void L()
    {
        boolean flag2 = true;
        if (ac == null)
        {
            return;
        }
        int i1 = ab;
        if (at != null && ac != null)
        {
            fhd fhd1 = ac;
            SearchResults searchresults = at;
            Object obj = Z;
            fhd1.d.removeCallbacks(fhd1.a);
            fgp fgp1;
            boolean flag;
            boolean flag1;
            if (obj == com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (fhd1.i != null && fhd1.i.a(fhd1.g))
            {
                obj = fhd1.i;
                fhc fhc1;
                String s1;
                fgo fgo1;
                if (!flag)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                ((fhh) (obj)).a(flag1);
                fhd1.a(searchresults);
            }
            fhc1 = fhd1.g;
            fhc1.c = (SearchResults)ctz.a(searchresults);
            fgp1 = fhc1.b;
            obj = searchresults.getSearchTerm();
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                obj = "";
            } else
            {
                obj = Normalizer.normalize(((CharSequence) (obj)), java.text.Normalizer.Form.NFC).toLowerCase(fgp1.c);
            }
            if (!TextUtils.equals(fgp1.f, ((CharSequence) (obj))))
            {
                fgp1.a.clear();
                fgp1.f = ((String) (obj));
                obj = fgp1.d;
                s1 = fgp1.f;
                fgo1 = ((fgm) (obj)).a;
                ctz.a(s1);
                obj.b = s1.toLowerCase(fgo1.a);
                obj.c = ((fgm) (obj)).b.length();
                if (!fgp1.f.isEmpty())
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                fgp1.e = flag1;
            }
            fhc1.e.a(fhc1.c.getViews());
            ((PorcelainAdapter)((gbr) (fhc1)).h).c();
            fhc1.f = flag;
            if (!flag && searchresults.hasMorePages())
            {
                fhd1.d.post(fhd1.a);
            }
        }
        M();
        O();
    }

    private void M()
    {
        int i1 = ab;
        if (ac != null)
        {
            boolean flag = TextUtils.isEmpty(ap.b());
            Object obj = ac;
            boolean flag1 = aI.d();
            obj = ((fhd) (obj)).f;
            int j1;
            int k1;
            if (((fgu) (obj)).g != flag1)
            {
                obj.g = flag1;
                fgu fgu1;
                RecyclerView recyclerview;
                if (flag1)
                {
                    ((fgu) (obj)).e.addLast(((fgu) (obj)).d);
                    ((PorcelainAdapter)((gbr) (obj)).h).d(1);
                } else
                {
                    ((fgu) (obj)).e.remove(((fgu) (obj)).d);
                    ((PorcelainAdapter)((gbr) (obj)).h).e(1);
                }
            }
            if (aw)
            {
                obj = ac;
                if (((fhd) (obj)).i != null)
                {
                    ((fhd) (obj)).i.a(true);
                    fgu1 = ((fhd) (obj)).f;
                    recyclerview = ((fhd) (obj)).i.b;
                    fgu1.a(fgu1.c, recyclerview);
                    ((fhd) (obj)).a();
                    j1 = 0;
                    k1 = 1;
                } else
                {
                    Assertion.b("Views are destroyed!");
                    j1 = 0;
                    k1 = 1;
                }
            } else
            if (at != null && !at.isEmpty())
            {
                fhd fhd1 = ac;
                if (fhd1.i != null)
                {
                    fhh fhh1 = fhd1.i;
                    if (!fhd1.g.f)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    fhh1.a(flag);
                    fhh1 = fhd1.i;
                    fhd1.g.b(fhh1.b);
                    fhd1.a(fhd1.g.c);
                } else
                {
                    Assertion.b("Views are destroyed!");
                }
                if (!R())
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                k1 = 1;
            } else
            if (!flag)
            {
                if (S())
                {
                    fhd fhd2 = ac;
                    if (fhd2.i != null)
                    {
                        fhd2.i.a(true);
                        fgu fgu2 = fhd2.f;
                        RecyclerView recyclerview1 = fhd2.i.b;
                        String s1 = fhd2.g.c.getSearchTerm();
                        EmptyView emptyview1 = (EmptyView)fgu2.a.b;
                        Resources resources = ((EmptyView)fgu2.a.b).getResources();
                        if (fgu2.g)
                        {
                            j1 = 0x7f08025b;
                        } else
                        {
                            j1 = 0x7f08025a;
                        }
                        emptyview1.a(resources.getString(j1, new Object[] {
                            s1
                        }));
                        fgu2.a(fgu2.a, recyclerview1);
                        fhd2.a();
                        j1 = 0;
                        k1 = 1;
                    } else
                    {
                        Assertion.b("Views are destroyed!");
                        j1 = 0;
                        k1 = 1;
                    }
                } else
                {
                    j1 = 0;
                    k1 = 0;
                }
            } else
            if (a.b() > 0)
            {
                fhd fhd3 = ac;
                if (fhd3.i != null)
                {
                    fhd3.i.a(true);
                    fhd3.h.b(fhd3.i.b);
                    fhd3.a();
                    j1 = 0;
                    k1 = 1;
                } else
                {
                    Assertion.b("Views are destroyed!");
                    j1 = 0;
                    k1 = 1;
                }
            } else
            if (!ay)
            {
                j1 = 1;
                k1 = 0;
            } else
            {
                fhd fhd4 = ac;
                if (fhd4.i != null)
                {
                    fhd4.i.a(true);
                    fgu fgu3 = fhd4.f;
                    RecyclerView recyclerview2 = fhd4.i.b;
                    EmptyView emptyview = (EmptyView)fgu3.b.b;
                    if (fiy.a(fgu3.f.a()))
                    {
                        k1 = 0x7f080262;
                        j1 = 0x7f080261;
                    } else
                    {
                        k1 = 0x7f08025d;
                        j1 = 0x7f080260;
                    }
                    emptyview.a(emptyview.getResources().getString(k1));
                    emptyview.b(emptyview.getResources().getString(j1));
                    fgu3.a(fgu3.b, recyclerview2);
                    fhd4.a();
                    j1 = 0;
                    k1 = 1;
                } else
                {
                    Assertion.b("Views are destroyed!");
                    j1 = 0;
                    k1 = 1;
                }
            }
            if (k1 != 0)
            {
                a(false, false);
            }
            if (j1 != 0)
            {
                a(true, true);
                return;
            }
        }
    }

    private boolean N()
    {
        boolean flag = false;
        boolean flag1 = fyj.a();
        if (flag1 == av)
        {
            if (!flag1)
            {
                flag = true;
            }
            av = flag;
            return true;
        } else
        {
            return false;
        }
    }

    private void O()
    {
        String s1 = P();
        if (s1 == null)
        {
            s1 = "";
        }
        b(s1);
    }

    private String P()
    {
        Object obj;
        if (ac != null)
        {
            obj = ac.g.c.getTitle();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            return ((String) (obj));
        }
        obj = k();
        if (obj == null || b == null)
        {
            return "";
        } else
        {
            return ((Context) (obj)).getString(0x7f08046c, new Object[] {
                b
            });
        }
    }

    private void Q()
    {
        if (Z == null)
        {
            Z = com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a;
        }
        aE = false;
        a(Z, b);
    }

    private boolean R()
    {
        return aa == ab;
    }

    private boolean S()
    {
        return TextUtils.equals(b, Y);
    }

    private void T()
    {
        U();
        V();
        if (as)
        {
            u u1 = k();
            Intent intent = new Intent("com.spotify.mobile.android.ui.action.view.CLOSE");
            intent.setFlags(0x4000000);
            intent.putExtra("fragment_key", I());
            a((new gms((Context)ctz.a(u1), intent)).a);
        }
    }

    private void U()
    {
        View view = y();
        if (view != null)
        {
            ggp.a(view);
        }
    }

    private void V()
    {
        a.a(Y);
    }

    static Flags a(SearchFragment searchfragment)
    {
        return searchfragment.ao;
    }

    static void a(SearchFragment searchfragment, com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType searchtype, String s1)
    {
        searchfragment.a(searchtype, s1);
    }

    static void a(SearchFragment searchfragment, drz drz1)
    {
        searchfragment.a(drz1);
        searchfragment.T();
    }

    static void a(SearchFragment searchfragment, String s1)
    {
        searchfragment.aE = true;
        searchfragment.a(((com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType) (null)), s1);
    }

    static void a(SearchFragment searchfragment, String s1, String s2)
    {
        searchfragment.Z = com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.b;
        searchfragment.U();
        searchfragment.b = searchfragment.Y;
        searchfragment.b(s2);
        searchfragment.az = true;
        searchfragment.a(com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.b, s1);
        searchfragment.V();
    }

    private void a(com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType searchtype, String s1)
    {
        if (ao == null)
        {
            return;
        }
        boolean flag = TextUtils.isEmpty(s1);
        N();
        ak.removeCallbacksAndMessages(ad);
        int j1 = aa;
        SearchLoader searchloader = aF;
        int i1;
        if (searchloader.i)
        {
            i1 = 0;
        } else
        {
            geh.b();
            String s2;
            if (searchloader.g.isSessionAvailable())
            {
                s2 = searchloader.g.getCurrentSessionId();
                i1 = searchloader.g.getCurrentSequenceNumber();
            } else
            {
                Assertion.b("Session wanted but not available!");
                s2 = "";
                i1 = -1;
            }
            searchtype = ffw.a(s1, searchtype, searchloader.b, searchloader.c, searchloader.d.b(), searchloader.d.c(), searchloader.d.d(), s2, i1);
            if (searchtype == ffw.a)
            {
                searchloader.a(searchtype, searchloader.a);
            } else
            {
                searchloader.e.a(searchtype);
            }
            i1 = searchtype.hashCode();
        }
        aa = i1;
        if (j1 != aa && !flag)
        {
            a(true, true);
        }
        i1 = aa;
    }

    private void a(drz drz1)
    {
        if (aI.b())
        {
            drr drr1 = ag;
            Iterable iterable = at.getPlayables();
            drz1 = (drz)ctz.a(drz1);
            String s1 = v_().toString();
            String s2 = P();
            java.util.HashMap hashmap = Maps.b();
            hashmap.put("context_long_description", s2);
            hashmap.put("context_description", Y);
            drr1.a(iterable, drz1, s1, hashmap);
            return;
        } else
        {
            Assertion.a("Can't play track if on demand is disabled!");
            return;
        }
    }

    private void a(String s1)
    {
        ap.b.setText(s1);
        ap.a(true);
    }

    private void a(boolean flag, boolean flag1)
    {
        Object obj;
        int i1;
label0:
        {
            boolean flag2 = true;
            obj = ac;
            if (flag && !aE)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (((fhd) (obj)).i != null)
            {
                obj = ((fhd) (obj)).i;
                if (i1 != 0)
                {
                    if (!((fhh) (obj)).d.d())
                    {
                        ((fhh) (obj)).d.c();
                        obj = ((fhh) (obj)).d;
                        if (flag1)
                        {
                            i1 = 1000;
                        } else
                        {
                            i1 = 0;
                        }
                        ((LoadingView) (obj)).a(i1);
                    }
                } else
                {
                    if (((fhh) (obj)).d.c == com.spotify.mobile.android.ui.view.LoadingView.State.d)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 != 0)
                    {
                        ((fhh) (obj)).d.b();
                    } else
                    {
                        ((fhh) (obj)).d.c();
                    }
                }
            } else
            {
                Assertion.b("Views are destroyed!");
            }
            obj = ac;
            if (flag && aE)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            obj = ((fhd) (obj)).g;
            if (flag != ((fhc) (obj)).d.contains(fhc.a))
            {
                i1 = ((fhc) (obj)).c.getViews().getItemCount();
                if (!flag)
                {
                    break label0;
                }
                ((fhc) (obj)).d.addFirst(fhc.a);
                ((PorcelainAdapter)((gbr) (obj)).h).d(i1);
            }
            return;
        }
        int j1 = ((fhc) (obj)).d.indexOf(fhc.a);
        ((fhc) (obj)).d.remove(j1);
        ((PorcelainAdapter)((gbr) (obj)).h).e(j1 + i1);
    }

    static void b(SearchFragment searchfragment)
    {
        searchfragment.O();
    }

    static void b(SearchFragment searchfragment, String s1)
    {
        searchfragment.a(s1);
    }

    private void b(String s1)
    {
        u u1 = k();
        if (u1 == null)
        {
            return;
        }
        ((fpe)u1).a(this, s1);
        s1 = ap;
        boolean flag;
        if (aA && Z == com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1.a(flag);
    }

    private void c(int i1)
    {
        if (i1 == 0)
        {
            return;
        }
        if (ab == i1)
        {
            if (at != null && !at.isEmpty())
            {
                V();
            }
            au = 0;
            return;
        } else
        {
            au = i1;
            return;
        }
    }

    static void c(SearchFragment searchfragment)
    {
        searchfragment.Q();
    }

    static void d(SearchFragment searchfragment)
    {
        searchfragment.U();
    }

    private void d(boolean flag)
    {
        ax = true;
        fpe fpe1 = (fpe)k();
        if (flag)
        {
            a(b);
            SearchIntentSessionTracker searchintentsessiontracker = ai;
            ((fha)ctz.a(ap)).a(searchintentsessiontracker.a);
            if (searchintentsessiontracker.d == null)
            {
                searchintentsessiontracker.a();
            }
            ap.a(aG);
            fpe1.a(this);
            O();
            if (Z == com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a && TextUtils.isEmpty(b))
            {
                ap.c();
            }
        } else
        {
            ap.a(false);
            SearchIntentSessionTracker searchintentsessiontracker1 = ai;
            ((fha)ctz.a(ap)).b(searchintentsessiontracker1.a);
            ap.b(aG);
            fpe1.a(null);
        }
        aA = flag;
        ax = false;
    }

    static boolean e(SearchFragment searchfragment)
    {
        return searchfragment.ax;
    }

    static boolean f(SearchFragment searchfragment)
    {
        return searchfragment.N();
    }

    static void g(SearchFragment searchfragment)
    {
        searchfragment.M();
    }

    static int h(SearchFragment searchfragment)
    {
        return searchfragment.al;
    }

    static Handler i(SearchFragment searchfragment)
    {
        return searchfragment.ak;
    }

    static boolean j(SearchFragment searchfragment)
    {
        return searchfragment.aq;
    }

    static boolean k(SearchFragment searchfragment)
    {
        return searchfragment.av;
    }

    static SearchIntentSessionTracker l(SearchFragment searchfragment)
    {
        return searchfragment.ai;
    }

    static fgf m(SearchFragment searchfragment)
    {
        return searchfragment.an;
    }

    static ffn n(SearchFragment searchfragment)
    {
        return searchfragment.ae;
    }

    static ffo o(SearchFragment searchfragment)
    {
        return searchfragment.am;
    }

    static void p(SearchFragment searchfragment)
    {
        searchfragment.K();
    }

    static Parcelable q(SearchFragment searchfragment)
    {
        return searchfragment.aD;
    }

    static boolean r(SearchFragment searchfragment)
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (searchfragment.ac != null)
        {
            searchfragment = searchfragment.ac;
            boolean flag;
            if (((fhd) (searchfragment)).i != null)
            {
                flag = ((fhd) (searchfragment)).i.d.d();
            } else
            {
                Assertion.b("Views are destroyed!");
                flag = false;
            }
            flag1 = flag2;
            if (flag)
            {
                flag1 = true;
            }
        }
        return flag1;
    }

    static boolean s(SearchFragment searchfragment)
    {
        return searchfragment.az;
    }

    static SearchResults t(SearchFragment searchfragment)
    {
        return searchfragment.at;
    }

    static SearchResults u(SearchFragment searchfragment)
    {
        return searchfragment.aB;
    }

    static int v(SearchFragment searchfragment)
    {
        return searchfragment.aC;
    }

    public final void A()
    {
        d(false);
        super.A();
        ak.removeCallbacksAndMessages(ad);
        ak.removeCallbacks(aH);
        aj.b();
        an.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.b;
    }

    public final void B()
    {
        super.B();
        ((fpe)k()).R_().b(this);
        ak.removeCallbacksAndMessages(null);
        SearchLoader searchloader = aF;
        searchloader.i = true;
        searchloader.e.c();
        searchloader.a();
        searchloader.f.a();
        af.destroy();
        ah.c();
    }

    public final boolean C_()
    {
        if (Z != com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a)
        {
            ak.removeCallbacksAndMessages(ad);
            Z = com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a;
            if (az)
            {
                az = false;
            } else
            {
                at = aB;
                ab = aC;
                aB = null;
                aC = 0;
                aE = false;
            }
            aa = ab;
            L();
            if (aD != null)
            {
                fhd fhd1 = ac;
                Parcelable parcelable = aD;
                if (fhd1.i != null)
                {
                    fhd1.i.b.d().a(parcelable);
                } else
                {
                    Assertion.b("Views are destroyed!");
                }
                aD = null;
            }
            a(Y);
            return true;
        }
        if (!TextUtils.isEmpty(b))
        {
            a(((String) (null)));
            return true;
        } else
        {
            return false;
        }
    }

    public final Fragment F()
    {
        return this;
    }

    public final void H_()
    {
        fgn.a("feature state save");
    }

    public final String I()
    {
        return (new StringBuilder("search:")).append(g().getString("search_query")).toString();
    }

    final void J()
    {
        c(aa);
    }

    public final Uri a()
    {
        return Uri.parse(v_().toString());
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ao = fyw.a(this);
        ap = new fgq((rf)k());
        if (aI.c())
        {
            ap.a(0x7f08046a);
        }
        bundle = ac;
        bundle.i = new fhh(((fhd) (bundle)).c, layoutinflater, viewgroup);
        ((fhd) (bundle)).i.b.a(((fhd) (bundle)).b);
        return ((fhd) (bundle)).i.a;
    }

    public final String a(Context context, Flags flags)
    {
        if (b != null)
        {
            flags = b;
        } else
        {
            flags = "";
        }
        if (g().getBoolean("start_radio", false))
        {
            return context.getString(0x7f080468, new Object[] {
                flags
            });
        } else
        {
            return context.getString(0x7f08046c, new Object[] {
                flags
            });
        }
    }

    public final void a(int i1, int j1, Intent intent)
    {
        boolean flag1 = true;
        ffn ffn1 = ae;
        Verified verified = v_();
        boolean flag;
        if (i1 == 1)
        {
            flag = flag1;
            if (j1 == -1)
            {
                dmz.a(for);
                for.a(ffn1.a.k(), verified, false);
                flag = flag1;
            }
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            super.a(i1, j1, intent);
        }
    }

    public final void a(int i1, String s1, com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType searchtype)
    {
        boolean flag;
        if (i1 == aa && i1 != ab)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return;
        }
        Object obj = Integer.valueOf(i1);
        StringBuilder stringbuilder = new StringBuilder();
        if (obj != null)
        {
            obj = (new StringBuilder("Req#")).append(obj).toString();
        } else
        {
            obj = "Req";
        }
        obj = stringbuilder.append(((String) (obj))).append(" (");
        if (searchtype == null)
        {
            s1 = "raw";
        }
        fgn.a(((StringBuilder) (obj)).append(s1).append(')').toString());
        Y = null;
        at = (SearchResults)aF.a;
        aw = true;
        L();
    }

    public final void a(int i1, String s1, com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType searchtype, Object obj)
    {
        boolean flag1;
        flag1 = true;
        obj = (SearchResults)obj;
        Assertion.a(ac, "Views manager is null!");
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L4:
        if (flag)
        {
            if (i1 == aa)
            {
                aF.a();
            }
            if (searchtype != null && searchtype != com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.b || i1 == 0)
            {
                Y = s1;
            }
            if (az)
            {
                s1 = ac;
                int j1;
                int k1;
                if (((fhd) (s1)).i != null)
                {
                    s1 = ((fhd) (s1)).i.b.d().e();
                } else
                {
                    Assertion.b("Views are destroyed!");
                    s1 = null;
                }
                aD = s1;
                aB = at;
                aC = ab;
            }
            if (i1 != 0 && ((SearchResults) (obj)).shouldBeAppended())
            {
                at = at.append(((SearchResults) (obj)));
            } else
            {
                at = ((SearchResults) (obj));
            }
            ab = i1;
            if (searchtype == com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a)
            {
                c(au);
            }
            aw = false;
            L();
            if (ar)
            {
                ar = false;
                g().putBoolean("start_playback", false);
                if (aI.b() && !aI.c() && at != null && !at.isEmpty())
                {
                    s1 = (drz)cuv.d(at.getPlayables());
                    if (s1 != null)
                    {
                        a(((drz) (s1)));
                    }
                }
            }
            if (az)
            {
                az = false;
                s1 = ac;
                if (((fhd) (s1)).i == null)
                {
                    break; /* Loop/switch isn't completed */
                }
                ((fhd) (s1)).i.b.a(0);
            }
        }
        return;
_L2:
        if (ab != aa && (searchtype == null || searchtype == Z) && ((SearchResults) (obj)).shouldBeAppended() == aE && ab != i1)
        {
            flag = flag1;
            if (aa == i1)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (b != null && (b.startsWith(s1) || s1.startsWith(b)))
            {
                flag = flag1;
                if (TextUtils.isEmpty(Y))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (!b.startsWith(Y))
                {
                    flag = flag1;
                    if (!Y.startsWith(b))
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                }
                j1 = Math.abs(b.length() - s1.length());
                k1 = Math.abs(b.length() - Y.length());
                flag = flag1;
                if (j1 >= k1)
                {
                    flag = false;
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Assertion.b("Views are destroyed!");
        return;
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        ffq ffq1 = null;
        Object obj = ffq1;
        if (bundle != null)
        {
            obj = ffq1;
            if (bundle.containsKey("intent_session"))
            {
                bundle.setClassLoader(k().getClassLoader());
                obj = (SearchIntentSessionTracker)bundle.getParcelable("intent_session");
                Assertion.a(obj, "Previously saved session is invalid!");
            }
        }
        epn epn1;
        SearchIntentSessionTracker searchintentsessiontracker;
        Handler handler;
        int i1;
        int j1;
        if (obj == null)
        {
            obj = new SearchIntentSessionTracker();
        }
        ai = ((SearchIntentSessionTracker) (obj));
        ak = new Handler();
        aq = g().getBoolean("start_radio", false);
        as = g().getBoolean("close_search_on_click", false);
        ar = g().getBoolean("start_playback", false);
        b = g().getString("search_query");
        Z = com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.a;
        if (b == null)
        {
            b = "";
        }
        a(true);
        al = l().getInteger(0x7f0e000d);
        af = Cosmos.getResolver(k());
        af.connect();
        ag = drr.a(af, ViewUri.S.toString(), FeatureIdentifier.B, gnl.a(this));
        ah = new epl(k(), k().S_());
        bundle = k();
        obj = af;
        ffq1 = aI;
        i1 = (int)TypedValue.applyDimension(1, 60F, l().getDisplayMetrics());
        j1 = l().getDisplayMetrics().widthPixels / l().getInteger(0x7f0e0001);
        epn1 = ah;
        searchintentsessiontracker = ai;
        handler = new Handler();
        aF = new SearchLoader(new ffw(), handler, ffq1, i1, j1, epn1, searchintentsessiontracker, ffx.a(((Resolver) (obj)), com/spotify/mobile/android/spotlets/search/model/SearchResults, new ffz(bundle, searchintentsessiontracker), ffy.a, handler), SearchResults.NO_RESULTS, this);
        a = new fgh();
        an = new fga((fop)dmz.a(fop), k());
        am = new ffo(k(), aI, this, aL);
        ac = new fhd(k(), aK, a, ag, aI, aJ, new dro(k(), this));
    }

    public final void a(Fragment fragment)
    {
        if (o())
        {
            boolean flag;
            if (fragment == this)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d(flag);
        }
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            view = (SavedState)bundle.getParcelable("spotlet.search.fragment.saved_state");
            if (view != null)
            {
                if (((SavedState) (view)).a != null)
                {
                    a.a(((SavedState) (view)).a);
                    ay = true;
                }
                b = ((SavedState) (view)).b;
                Y = ((SavedState) (view)).c;
                aa = ((SavedState) (view)).e;
                if (((SavedState) (view)).f)
                {
                    a(true, false);
                } else
                {
                    a(false, true);
                }
                az = ((SavedState) (view)).g;
                Z = ((SavedState) (view)).h;
                at = ((SavedState) (view)).i;
                ab = ((SavedState) (view)).j;
                aB = ((SavedState) (view)).k;
                aC = ((SavedState) (view)).l;
                aD = ((SavedState) (view)).d;
            }
        }
        K();
        Assertion.a(ac, "Views manager is null!");
        view = ac.g.c;
        if (!TextUtils.isEmpty(view.getSearchTerm()) && view.isOnDemand() != aI.b())
        {
            ak.post(new Runnable() {

                private SearchFragment a;

                public final void run()
                {
                    SearchFragment.c(a);
                }

            
            {
                a = SearchFragment.this;
                super();
            }
            });
        }
        k().q_();
    }

    final void a(PorcelainNavigationLink porcelainnavigationlink)
    {
        if (aI.c())
        {
            Assertion.a(ac, "Views manager is null!");
            Flags flags = ao;
            Verified verified = v_();
            com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = ac.c();
            String s1 = porcelainnavigationlink.getUri();
            dmz.a(fos);
            fos.a(k(), new String[] {
                s1
            }, verified, subview, true);
            if (gpl.a(flags))
            {
                Object obj = gpl.b(porcelainnavigationlink.getUri());
                if (obj != null)
                {
                    obj = gms.a(k(), ((String) (obj)));
                    porcelainnavigationlink = porcelainnavigationlink.getTargetTitle();
                    if (porcelainnavigationlink == null)
                    {
                        porcelainnavigationlink = "";
                    }
                    a(((gms) (obj)).a((String)porcelainnavigationlink).a);
                } else
                {
                    Assertion.b((new StringBuilder("Station for uri ")).append(porcelainnavigationlink.getUri()).append("could not be created").toString());
                }
            }
        } else
        {
            SpotifyLink spotifylink = new SpotifyLink(porcelainnavigationlink.getUri());
            if (spotifylink.c == com.spotify.mobile.android.util.SpotifyLink.LinkType.aH)
            {
                porcelainnavigationlink = null;
                if (spotifylink.a.getPathSegments().size() > 1)
                {
                    porcelainnavigationlink = spotifylink.a(1);
                }
                if (!TextUtils.isEmpty(porcelainnavigationlink))
                {
                    a(((String) (porcelainnavigationlink)));
                } else
                {
                    Assertion.a("Invalid suggestion link", spotifylink.toString());
                }
            } else
            {
                gms gms1 = gms.a(k(), porcelainnavigationlink.getUri());
                porcelainnavigationlink = porcelainnavigationlink.getTargetTitle();
                if (porcelainnavigationlink == null)
                {
                    porcelainnavigationlink = "";
                }
                a(gms1.a((String)porcelainnavigationlink).a);
            }
        }
        T();
    }

    public final void a_(Bundle bundle)
    {
        bundle = bundle.getStringArray("recent_searches");
        if (bundle != null && bundle.length > 0)
        {
            a.a(bundle);
        }
        ay = true;
        M();
    }

    public final void b()
    {
        fgn.a("feature state load");
        ay = true;
        M();
    }

    public final void c()
    {
        super.c();
        ah.a();
        ai.c.registerObserver(aM);
        af.connect();
    }

    public final void c(Bundle bundle)
    {
        bundle.putStringArray("recent_searches", a.a());
    }

    public final void d()
    {
        super.d();
        ah.b();
        af.disconnect();
        ai.c.unregisterObserver(aM);
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ((fpe)k()).R_().a(this);
    }

    public final void e()
    {
        super.e();
        fhd fhd1 = ac;
        fhd1.d.removeCallbacks(fhd1.a);
        if (fhd1.i != null)
        {
            fhd1.i.b.b(fhd1.b);
        } else
        {
            Assertion.b("Views are destroyed!");
        }
        ap.d();
        ao = null;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelable("spotlet.search.fragment.saved_state", new SavedState(this, (byte)0));
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.B;
    }

    public final Verified v_()
    {
        String s1;
        if (Y != null)
        {
            s1 = Uri.encode(Y);
        } else
        {
            s1 = "";
        }
        if (aI.c())
        {
            return ViewUri.U.a((new StringBuilder("spotify:radio:create_station:")).append(s1).toString());
        } else
        {
            return ViewUri.S.a((new StringBuilder("spotify:search:")).append(s1).toString());
        }
    }

    public final void z()
    {
        super.z();
        if (aj == null)
        {
            aj = ggn.a(k(), ViewUri.T);
        }
        aj.a();
        an.a();
        N();
        L();
        d(true);
        if (!S() && R())
        {
            Q();
        }
        O();
        ak.postDelayed(aH, al);
    }


    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
        public final String a[];
        public final String b;
        public final String c;
        public final Parcelable d;
        public final int e;
        public final boolean f;
        public final boolean g;
        public final com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType h;
        public final SearchResults i;
        public final int j;
        public final SearchResults k;
        public final int l;
        private SearchIntentSessionTracker m;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeStringArray(a);
            parcel.writeString(b);
            parcel.writeString(c);
            parcel.writeParcelable(d, 0);
            parcel.writeInt(e);
            gen.a(parcel, f);
            gen.a(parcel, g);
            parcel.writeParcelable(m, 0);
            int j1;
            if (h == null)
            {
                j1 = -1;
            } else
            {
                j1 = h.ordinal();
            }
            parcel.writeInt(j1);
            parcel.writeParcelable(i, i1);
            parcel.writeInt(j);
            parcel.writeParcelable(k, i1);
            parcel.writeInt(l);
        }


        private SavedState(Parcel parcel)
        {
            a = parcel.createStringArray();
            b = parcel.readString();
            c = parcel.readString();
            d = parcel.readParcelable(com/spotify/mobile/android/spotlets/search/SearchFragment$SavedState.getClassLoader());
            e = parcel.readInt();
            f = gen.a(parcel);
            g = gen.a(parcel);
            m = (SearchIntentSessionTracker)parcel.readParcelable(com/spotify/mobile/android/spotlets/search/logging/SearchIntentSessionTracker.getClassLoader());
            int i1 = parcel.readInt();
            com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType searchtype;
            if (i1 == -1)
            {
                searchtype = null;
            } else
            {
                searchtype = com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType.values()[i1];
            }
            h = searchtype;
            i = (SearchResults)parcel.readParcelable(com/spotify/mobile/android/spotlets/search/model/SearchResults.getClassLoader());
            j = parcel.readInt();
            k = (SearchResults)parcel.readParcelable(com/spotify/mobile/android/spotlets/search/model/SearchResults.getClassLoader());
            l = parcel.readInt();
        }

        SavedState(Parcel parcel, byte byte0)
        {
            this(parcel);
        }

        private SavedState(SearchFragment searchfragment)
        {
            String as1[];
            if (searchfragment.a != null)
            {
                as1 = searchfragment.a.a();
            } else
            {
                as1 = null;
            }
            a = as1;
            b = searchfragment.b;
            c = searchfragment.Y;
            d = SearchFragment.q(searchfragment);
            e = searchfragment.aa;
            f = SearchFragment.r(searchfragment);
            g = SearchFragment.s(searchfragment);
            m = SearchFragment.l(searchfragment);
            h = searchfragment.Z;
            i = SearchFragment.t(searchfragment);
            j = searchfragment.ab;
            k = SearchFragment.u(searchfragment);
            l = SearchFragment.v(searchfragment);
        }

        SavedState(SearchFragment searchfragment, byte byte0)
        {
            this(searchfragment);
        }
    }

}

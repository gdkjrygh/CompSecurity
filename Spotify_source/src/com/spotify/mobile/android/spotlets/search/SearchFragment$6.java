// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import com.spotify.mobile.android.ui.activity.DisableOfflineModeActivity;
import com.spotify.mobile.android.util.Assertion;
import drz;
import ffn;
import ffo;
import fge;
import fgf;
import fgk;
import fhc;
import fhd;
import fhg;
import fud;
import fyj;
import gcl;
import u;

// Referenced classes of package com.spotify.mobile.android.spotlets.search:
//            SearchFragment

final class b
    implements fhg
{

    private SearchFragment b;

    public final void a()
    {
        SearchFragment.d(b);
        if (b.ac.b())
        {
            b.J();
        }
    }

    public final void a(int i)
    {
        int j = b.a.b();
        if (i >= 0 && i < j)
        {
            SearchFragment.m(b).b(b.a.a(i), i, b.v_());
            b.a.b(i);
            SearchFragment.g(b);
            return;
        } else
        {
            Assertion.b((new StringBuilder("Position out of bounds ")).append(i).append(" (total: ").append(j).append(")").toString());
            return;
        }
    }

    public final void a(PorcelainNavigationLink porcelainnavigationlink, int i, int j)
    {
        Object obj = fge.a(porcelainnavigationlink, b.ac.g.c, i, b.v_());
        String s;
        switch (a[porcelainnavigationlink.getType().ordinal()])
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
            s = porcelainnavigationlink.getTargetTitle();
            break;
        }
        obj = s;
        if (s == null)
        {
            Assertion.b("No target title to show!");
            obj = "";
        }
        SearchFragment.a(b, porcelainnavigationlink.getUri(), ((String) (obj)));
    }

    public final void a(drz drz, int i)
    {
        SearchFragment.a(b, drz);
        SearchFragment.m(b).a(fge.a(drz, b.ac.g.c, i, b.v_()));
    }

    public final void b(int i)
    {
        int j = b.a.b();
        if (i >= 0 && i < j)
        {
            String s = b.a.a(i);
            SearchFragment.b(b, s);
            SearchFragment.d(b);
            SearchFragment.m(b).a(s, i, b.v_());
            return;
        } else
        {
            Assertion.b((new StringBuilder("Position out of bounds ")).append(i).append(" (total: ").append(j).append(")").toString());
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
            String s = b.ac.g.c.getLoadMoreUri();
            if (s != null)
            {
                SearchFragment.a(b, s);
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
                    if (android.provider.etInt(((ffn) (obj)).a.k().getContentResolver(), "airplane_mode_on", 0) != 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                if (android.provider.etInt(((ffn) (obj)).a.k().getContentResolver(), "airplane_mode_on", 0) != 0)
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

    tionLink(SearchFragment searchfragment)
    {
        b = searchfragment;
        super();
    }
}

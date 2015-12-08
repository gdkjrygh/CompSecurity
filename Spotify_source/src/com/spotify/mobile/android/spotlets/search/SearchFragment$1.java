// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search;

import android.text.TextUtils;
import com.spotify.mobile.android.util.SpotifyLink;
import fhb;
import fpf;
import gms;

// Referenced classes of package com.spotify.mobile.android.spotlets.search:
//            SearchFragment

final class a
    implements fhb
{

    private SearchFragment a;

    private void a()
    {
        fpf fpf1 = (fpf)a.k();
        if (fpf1 != null && fpf1.g())
        {
            fpf1.h();
        }
    }

    public final void a(String s)
    {
        if (a.o() && SearchFragment.a(a) != null)
        {
            if (!TextUtils.equals(s = s.trim(), a.b))
            {
                a();
                a.b = s;
                a.Z = com.spotify.mobile.android.spotlets.search.loader.chType.a;
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

    public final void b(String s)
    {
        SearchFragment.d(a);
        if (a.o() && SpotifyLink.b(s))
        {
            a.a(gms.a(a.k(), s).a);
            return;
        } else
        {
            a.J();
            return;
        }
    }

    er.SearchType(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }
}

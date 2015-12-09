// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search;

import android.os.Handler;

// Referenced classes of package com.spotify.mobile.android.spotlets.search:
//            SearchFragment

final class a
    implements Runnable
{

    private SearchFragment a;

    public final void run()
    {
        if (SearchFragment.f(a))
        {
            SearchFragment.g(a);
            if (a.Z == com.spotify.mobile.android.spotlets.search.loader.chType.a && a.aa != 0)
            {
                SearchFragment.c(a);
            }
        }
        SearchFragment.i(a).postDelayed(this, SearchFragment.h(a));
    }

    er.SearchType(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search;

import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.music.framework.flag.NoFlags;
import ffq;
import gex;

// Referenced classes of package com.spotify.mobile.android.spotlets.search:
//            SearchFragment

final class a
    implements ffq
{

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

    A(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search;

import android.os.Bundle;
import epo;
import epp;

// Referenced classes of package com.spotify.mobile.android.spotlets.search:
//            SearchFragment

final class a
    implements epp
{

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

    A(SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search;


// Referenced classes of package com.spotify.mobile.android.spotlets.search:
//            SearchFragment

final class a
    implements Runnable
{

    private SearchFragment a;

    public final void run()
    {
        SearchFragment.c(a);
    }

    (SearchFragment searchfragment)
    {
        a = searchfragment;
        super();
    }
}

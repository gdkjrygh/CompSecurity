// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class fge
    implements fgg
{

    public final drx a;
    private final fgc b;
    private final String c;
    private final String d;
    private final Verified e;
    private final int f;

    private fge(drx drx1, String s, fgc fgc1, int i, Verified verified, String s1)
    {
        e = (Verified)ctz.a(verified);
        a = (drx)ctz.a(drx1);
        c = (String)ctz.a(s);
        b = (fgc)ctz.a(fgc1);
        d = (String)ctz.a(s1);
        f = i;
    }

    public static fge a(drx drx1, SearchResults searchresults, int i, Verified verified)
    {
        return new fge(drx1, searchresults.getLoggingContext(), searchresults, i, verified, searchresults.getSearchTerm());
    }

    public final String a()
    {
        return d;
    }

    public final Verified b()
    {
        return e;
    }

    public final drx c()
    {
        return a;
    }

    public final String d()
    {
        return c;
    }

    public final fgc e()
    {
        return b;
    }

    public final int f()
    {
        return f;
    }
}

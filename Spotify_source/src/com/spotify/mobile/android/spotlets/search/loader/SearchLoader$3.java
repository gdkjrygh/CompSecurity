// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.loader;

import android.util.SparseArray;
import com.spotify.mobile.android.util.logging.Logger;
import eqn;
import ffr;
import ffv;

// Referenced classes of package com.spotify.mobile.android.spotlets.search.loader:
//            SearchLoader

final class a
    implements eqn
{

    private ffv a;
    private SearchLoader b;

    public final void a(Object obj)
    {
        if (!SearchLoader.a(b))
        {
            SearchLoader.a(b, a);
            if (!SearchLoader.b(b).a())
            {
                SearchLoader.b(b).b();
            }
        }
        SearchLoader.c(b).remove(a.hashCode());
        Logger.a("%s failed in %d ms.", new Object[] {
            a, Long.valueOf(a.c())
        });
    }

    public final void b(Object obj)
    {
        if (!SearchLoader.a(b))
        {
            SearchLoader.a(b, a, obj);
            if (!SearchLoader.b(b).a())
            {
                SearchLoader.b(b).b();
            }
        }
        SearchLoader.c(b).remove(a.hashCode());
        Logger.a("%s completed in %d ms.", new Object[] {
            a, Long.valueOf(a.c())
        });
    }

    (SearchLoader searchloader, ffv ffv1)
    {
        b = searchloader;
        a = ffv1;
        super();
    }
}

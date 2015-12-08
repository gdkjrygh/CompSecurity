// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class huw extends mtf
{

    private final hrr a;
    private final hrr b;
    private final hru c;
    private final int j;

    public huw(int i, hrr hrr1, hrr hrr2, hru hru1)
    {
        super("com.goog.android.apps.photos.search.peoplelabeling-tag");
        j = i;
        b = hrr2;
        a = hrr1;
        c = hru1;
    }

    protected final mue a(Context context)
    {
        context = new hsh(context, j, a.b());
        context.a = b.c();
        context.b = b.ar_();
        context = context.a();
        context.d();
        if (context.l())
        {
            return new mue(((nxx) (context)).l, ((nxx) (context)).n, null);
        }
        Object obj = ((hsg) (context)).a;
        context = new mue(true);
        hrr hrr1;
        hrr hrr2;
        int i;
        int k;
        int l;
        long l1;
        if (((ple) (obj)).a != null && ((ple) (obj)).a.a != null)
        {
            l1 = ((ple) (obj)).a.a.a.longValue();
        } else
        {
            l1 = -1L;
        }
        if (((ple) (obj)).b != null && ((ple) (obj)).b.b != null)
        {
            k = ((ple) (obj)).b.b.a.intValue();
        } else
        {
            k = -1;
        }
        obj = c;
        l = j;
        hrr1 = a;
        hrr2 = b;
        if (hrr1.b() != k)
        {
            i = hrr1.b();
        } else
        if (hrr2.b() != k)
        {
            i = hrr2.b();
        } else
        {
            i = -1;
        }
        ((hru) (obj)).a(l, hsw.a, k, l1, hrr2.c(), hrr2.as_(), i);
        ((hru) (obj)).a(l, hsw.f, k, l1, hrr2.c(), hrr2.as_(), i);
        context.a().putLong("com.google.android.apps.photos.search.core.suggestions.subjectid", l1);
        context.a().putInt("com.google.android.apps.photos.search.core.suggestions.clusterid", k);
        context.a().putString("com.google.android.apps.photos.search.core.suggestions.displaytext", b.c());
        context.a().putString("com.google.android.apps.photos.search.core.suggestions.imageurl", b.as_());
        return context;
    }
}

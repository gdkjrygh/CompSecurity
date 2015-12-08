// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.aa.f;
import com.google.android.m4b.maps.model.internal.g;
import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            cg, cb, d, c, 
//            b

public final class cf extends com.google.android.m4b.maps.model.internal.g.a
{

    private final d a;
    private final cg b;
    private final cb c;

    public cf(d d1, cg cg1, cb cb1)
    {
        j.a(cg1.a(), "Building must have an id");
        a = d1;
        b = cg1;
        c = cb1;
    }

    private String f()
    {
        return b.a().toString();
    }

    public final int a()
    {
        c.b(cb.a.bE);
        return a.a(b);
    }

    public final boolean a(g g)
    {
        return equals(g);
    }

    public final int b()
    {
        c.b(cb.a.bG);
        return a.b(b);
    }

    public final boolean c()
    {
        c.b(cb.a.bH);
        return a.c(b);
    }

    public final List d()
    {
        Object obj = b.b();
        java.util.ArrayList arraylist = com.google.android.m4b.maps.aa.f.b(((List) (obj)).size());
        c c1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(new b(a, c1, c)))
        {
            c1 = (c)((Iterator) (obj)).next();
        }

        return arraylist;
    }

    public final int e()
    {
        return hashCode();
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof cf))
        {
            return false;
        } else
        {
            obj = (cf)obj;
            return b.a().equals(((cf) (obj)).b.a());
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            f()
        });
    }

    public final String toString()
    {
        return h.a(this).a("id", f()).a("number of level: ", b.b().size()).toString();
    }
}

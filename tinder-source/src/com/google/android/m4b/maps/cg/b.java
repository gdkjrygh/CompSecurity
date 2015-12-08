// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import com.google.android.m4b.maps.y.h;
import com.google.android.m4b.maps.y.j;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            c, cb, d

public final class b extends com.google.android.m4b.maps.model.internal.h.a
{

    private final d a;
    private final c b;
    private final cb c;

    public b(d d1, c c1, cb cb1)
    {
        j.a(c1.b(), "Level must have an id");
        a = d1;
        b = c1;
        c = cb1;
    }

    private String e()
    {
        return b.b().toString();
    }

    public final String a()
    {
        return b.c();
    }

    public final boolean a(com.google.android.m4b.maps.model.internal.h h1)
    {
        return equals(h1);
    }

    public final String b()
    {
        return b.d();
    }

    public final void c()
    {
        c.b(cb.a.bD);
        a.a(b.a());
    }

    public final int d()
    {
        return hashCode();
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof b))
        {
            return false;
        } else
        {
            obj = (b)obj;
            return b.b().equals(((b) (obj)).b.b());
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            e()
        });
    }

    public final String toString()
    {
        return h.a(this).a("id", e()).a("name", a()).a("shortName", b()).toString();
    }
}

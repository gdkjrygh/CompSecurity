// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            g

public final class i
    implements a
{

    static final boolean a;
    private final g b;

    private i(g g1)
    {
        if (!a && g1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = g1;
            return;
        }
    }

    public static a a(g g1)
    {
        return new i(g1);
    }

    public final Object get()
    {
        com.kik.cache.ad ad = b.a();
        if (ad == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ad;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/i.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

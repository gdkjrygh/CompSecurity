// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;
import kik.android.b.j;

// Referenced classes of package com.kik.j:
//            g

public final class h
    implements a
{

    static final boolean a;
    private final g b;

    private h(g g)
    {
        if (!a && g == null)
        {
            throw new AssertionError();
        } else
        {
            b = g;
            return;
        }
    }

    public static a a(g g)
    {
        return new h(g);
    }

    public final Object get()
    {
        com.kik.cache.ad ad = j.a();
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
        if (!com/kik/j/h.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

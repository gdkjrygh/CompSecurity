// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            a

public final class b
    implements a
{

    static final boolean a;
    private final com.kik.j.a b;

    private b(com.kik.j.a a1)
    {
        if (!a && a1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = a1;
            return;
        }
    }

    public static a a(com.kik.j.a a1)
    {
        return new b(a1);
    }

    public final Object get()
    {
        kik.a.a.c c = b.a();
        if (c == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return c;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

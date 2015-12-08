// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            m

public final class n
    implements a
{

    static final boolean a;
    private final m b;

    private n(m m1)
    {
        if (!a && m1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = m1;
            return;
        }
    }

    public static a a(m m1)
    {
        return new n(m1);
    }

    public final Object get()
    {
        kik.a.c.c c = b.a();
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
        if (!com/kik/j/n.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

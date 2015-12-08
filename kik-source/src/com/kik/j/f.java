// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            e

public final class f
    implements a
{

    static final boolean a;
    private final e b;

    private f(e e1)
    {
        if (!a && e1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = e1;
            return;
        }
    }

    public static a a(e e1)
    {
        return new f(e1);
    }

    public final Object get()
    {
        com.kik.l.ab ab = b.a();
        if (ab == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ab;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

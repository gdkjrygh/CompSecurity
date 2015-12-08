// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            o

public final class p
    implements a
{

    static final boolean a;
    private final o b;

    private p(o o1)
    {
        if (!a && o1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = o1;
            return;
        }
    }

    public static a a(o o1)
    {
        return new p(o1);
    }

    public final Object get()
    {
        com.kik.android.a a1 = b.a();
        if (a1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return a1;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/p.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            w

public final class x
    implements a
{

    static final boolean a;
    private final w b;

    private x(w w1)
    {
        if (!a && w1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = w1;
            return;
        }
    }

    public static a a(w w1)
    {
        return new x(w1);
    }

    public final Object get()
    {
        com.kik.android.c.f f = b.a();
        if (f == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return f;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/x.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

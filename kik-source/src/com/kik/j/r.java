// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            q

public final class r
    implements a
{

    static final boolean a;
    private final q b;

    private r(q q1)
    {
        if (!a && q1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = q1;
            return;
        }
    }

    public static a a(q q1)
    {
        return new r(q1);
    }

    public final Object get()
    {
        kik.a.e.q q1 = b.a();
        if (q1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return q1;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/r.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a;

import a.a.a;

// Referenced classes of package kik.a:
//            d

public final class r
    implements a
{

    static final boolean a;
    private final d b;

    private r(d d1)
    {
        if (!a && d1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = d1;
            return;
        }
    }

    public static a a(d d1)
    {
        return new r(d1);
    }

    public final Object get()
    {
        kik.a.j.m m = b.n();
        if (m == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return m;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/a/r.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

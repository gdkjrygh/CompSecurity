// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a;

import a.a.a;

// Referenced classes of package kik.a:
//            d

public final class f
    implements a
{

    static final boolean a;
    private final d b;

    private f(d d1)
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
        return new f(d1);
    }

    public final Object get()
    {
        kik.a.e.d d1 = b.h();
        if (d1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return d1;
        }
    }

    static 
    {
        boolean flag;
        if (!kik/a/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            k

public final class l
    implements a
{

    static final boolean a;
    private final k b;

    private l(k k1)
    {
        if (!a && k1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = k1;
            return;
        }
    }

    public static a a(k k1)
    {
        return new l(k1);
    }

    public final Object get()
    {
        kik.android.util.bj bj = b.a();
        if (bj == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return bj;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/l.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

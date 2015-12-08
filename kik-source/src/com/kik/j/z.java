// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            y

public final class z
    implements a
{

    static final boolean a;
    private final y b;

    private z(y y1)
    {
        if (!a && y1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = y1;
            return;
        }
    }

    public static a a(y y1)
    {
        return new z(y1);
    }

    public final Object get()
    {
        kik.android.util.ck ck = b.a();
        if (ck == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ck;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/z.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

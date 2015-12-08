// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            s

public final class t
    implements a
{

    static final boolean a;
    private final s b;

    private t(s s1)
    {
        if (!a && s1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = s1;
            return;
        }
    }

    public static a a(s s1)
    {
        return new t(s1);
    }

    public final Object get()
    {
        kik.android.scan.d d = b.a();
        if (d == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return d;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/t.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

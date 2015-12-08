// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            aa

public final class ab
    implements a
{

    static final boolean a;
    private final aa b;

    private ab(aa aa1)
    {
        if (!a && aa1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = aa1;
            return;
        }
    }

    public static a a(aa aa1)
    {
        return new ab(aa1);
    }

    public final Object get()
    {
        kik.android.chat.a.a a1 = b.a();
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
        if (!com/kik/j/ab.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            u

public final class v
    implements a
{

    static final boolean a;
    private final u b;

    private v(u u1)
    {
        if (!a && u1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = u1;
            return;
        }
    }

    public static a a(u u1)
    {
        return new v(u1);
    }

    public final Object get()
    {
        kik.android.util.ar ar = b.a();
        if (ar == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return ar;
        }
    }

    static 
    {
        boolean flag;
        if (!com/kik/j/v.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

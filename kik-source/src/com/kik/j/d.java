// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.j;

import a.a.a;

// Referenced classes of package com.kik.j:
//            c

public final class d
    implements a
{

    static final boolean a;
    private final c b;

    private d(c c1)
    {
        if (!a && c1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = c1;
            return;
        }
    }

    public static a a(c c1)
    {
        return new d(c1);
    }

    public final Object get()
    {
        kik.android.chat.b.d d1 = b.a();
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
        if (!com/kik/j/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

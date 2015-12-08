// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.lang.reflect.Method;

// Referenced classes of package com.c.b:
//            an, as, bd, bl, 
//            at, be

public static final class f extends an
{

    private c a;
    private final Class b;
    private final bd c;
    private final Method d;
    private final Method e;
    private final int f;

    public final f a()
    {
        if (a == null)
        {
            throw new IllegalStateException("getDescriptor() called before internalInit()");
        } else
        {
            return a.a();
        }
    }

    public final void a(a a1)
    {
        if (a != null)
        {
            throw new IllegalStateException("Already initialized.");
        } else
        {
            a = new at(this, a1);
            return;
        }
    }

    protected final int b()
    {
        return f;
    }

    public final volatile be c()
    {
        return c;
    }

    ss(Class class1, bd bd1, int i)
    {
        if (com/c/b/bd.isAssignableFrom(class1) && !class1.isInstance(bd1))
        {
            throw new IllegalArgumentException((new StringBuilder("Bad messageDefaultInstance for ")).append(class1.getName()).toString());
        }
        a = null;
        b = class1;
        c = bd1;
        if (com/c/b/bl.isAssignableFrom(class1))
        {
            d = as.a(class1, "valueOf", new Class[] {
                com/c/b/ak$e
            });
            e = as.a(class1, "getValueDescriptor", new Class[0]);
        } else
        {
            d = null;
            e = null;
        }
        f = i;
    }
}

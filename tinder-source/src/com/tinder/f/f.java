// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import com.tinder.enums.Environment;
import dagger.internal.a;

// Referenced classes of package com.tinder.f:
//            b

public final class f
    implements a
{

    static final boolean a;
    private final b b;
    private final a.a.a c;

    private f(b b1, a.a.a a1)
    {
        if (!a && b1 == null)
        {
            throw new AssertionError();
        }
        b = b1;
        if (!a && a1 == null)
        {
            throw new AssertionError();
        } else
        {
            c = a1;
            return;
        }
    }

    public static a a(b b1, a.a.a a1)
    {
        return new f(b1, a1);
    }

    public final Object a()
    {
        c.a();
        Environment environment = Environment.PROD;
        if (environment == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return environment;
        }
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/f.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import dagger.internal.a;
import de.greenrobot.event.c;
import de.greenrobot.event.d;

// Referenced classes of package com.tinder.f:
//            b

public final class e
    implements a
{

    static final boolean a;
    private final b b;

    private e(b b1)
    {
        if (!a && b1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = b1;
            return;
        }
    }

    public static a a(b b1)
    {
        return new e(b1);
    }

    public final Object a()
    {
        d d1 = c.a();
        d1.b = false;
        d1.a = false;
        d1.e = false;
        return new c(d1);
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/e.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

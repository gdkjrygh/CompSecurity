// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.f;

import com.squareup.okhttp.c;
import com.squareup.okhttp.s;
import dagger.internal.a;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.tinder.f:
//            b

public final class i
    implements a
{

    static final boolean a;
    private final b b;
    private final a.a.a c;
    private final a.a.a d;
    private final a.a.a e;

    private i(b b1, a.a.a a1, a.a.a a2, a.a.a a3)
    {
        if (!a && b1 == null)
        {
            throw new AssertionError();
        }
        b = b1;
        if (!a && a1 == null)
        {
            throw new AssertionError();
        }
        c = a1;
        if (!a && a2 == null)
        {
            throw new AssertionError();
        }
        d = a2;
        if (!a && a3 == null)
        {
            throw new AssertionError();
        } else
        {
            e = a3;
            return;
        }
    }

    public static a a(b b1, a.a.a a1, a.a.a a2, a.a.a a3)
    {
        return new i(b1, a1, a2, a3);
    }

    public final Object a()
    {
        c.a();
        d.a();
        c c1 = (c)e.a();
        s s1 = new s();
        s1.a(c1);
        s1.v = true;
        s1.a(10L, TimeUnit.SECONDS);
        s1.c(10L, TimeUnit.SECONDS);
        s1.b(30L, TimeUnit.SECONDS);
        return s1;
    }

    static 
    {
        boolean flag;
        if (!com/tinder/f/i.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}

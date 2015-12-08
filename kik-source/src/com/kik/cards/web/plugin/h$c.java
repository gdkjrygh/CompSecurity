// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import java.lang.reflect.Method;

// Referenced classes of package com.kik.cards.web.plugin:
//            h, d

private static final class d
{

    private Method a;
    private d b;
    private String c;
    private boolean d;

    public final Method a()
    {
        return a;
    }

    public final String b()
    {
        return c;
    }

    public final d c()
    {
        return b;
    }

    public final boolean d()
    {
        return d;
    }

    public final String e()
    {
        return String.format("%s.%s", new Object[] {
            b.f(), c
        });
    }

    public (Method method, d d1, String s)
    {
        a = method;
        b = d1;
        c = s;
        d = false;
    }

    public d(Method method, d d1, String s, byte byte0)
    {
        this(method, d1, s);
        d = true;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.d.a;
import org.json.JSONObject;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            x

public final class an
    implements a
{

    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final String f;

    an(x x1)
    {
        this(x1, 4, null, null, null, 0);
    }

    an(x x1, byte byte0)
    {
        this(x1, 0, null, null, null, 0);
    }

    an(x x1, int i)
    {
        this(x1, 1, null, null, null, i);
    }

    an(x x1, int i, String s, String s1, String s2, int j)
    {
        a = i;
        b = s;
        c = s1;
        d = s2;
        e = j;
        f = x1.l();
    }

    public final String a()
    {
        return f;
    }

    public final int b()
    {
        return a;
    }

    public final JSONObject c()
    {
        com.nuance.dragon.toolkit.d.a.a a1 = new com.nuance.dragon.toolkit.d.a.a();
        a1.a("type", Integer.valueOf(a));
        a1.a("text", b);
        a1.a("param", c);
        a1.a("prompt", d);
        a1.a("code", Integer.valueOf(e));
        return a1;
    }

    public final String d()
    {
        return b;
    }

    public final String e()
    {
        return c;
    }

    public final String f()
    {
        return d;
    }

    public final int g()
    {
        return e;
    }
}

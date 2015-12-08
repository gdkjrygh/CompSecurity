// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc.a;


// Referenced classes of package com.cm.kinfoc.a:
//            a, d

public final class c
{

    private int a;
    private d b;

    public c()
    {
        a = 17000;
        b = null;
    }

    static int a(c c1)
    {
        return c1.a;
    }

    static d b(c c1)
    {
        return c1.b;
    }

    public final a a()
    {
        return new a(this, (byte)0);
    }

    public final c a(d d)
    {
        b = d;
        return this;
    }

    public final c b()
    {
        a = 17000;
        return this;
    }
}

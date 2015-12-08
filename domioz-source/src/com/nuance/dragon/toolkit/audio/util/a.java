// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.util;


// Referenced classes of package com.nuance.dragon.toolkit.audio.util:
//            e, b, c, d

public final class a
{

    private e a;
    private e b;
    private int c;
    private int d;

    public a()
    {
    }

    static e a(a a1)
    {
        return a1.a;
    }

    static e a(a a1, e e1)
    {
        a1.a = e1;
        return e1;
    }

    private void a(e e1)
    {
        if (a == null)
        {
            a = e1;
        } else
        {
            b.a(e1);
        }
        b = e1;
    }

    static e b(a a1, e e1)
    {
        a1.b = e1;
        return e1;
    }

    static void b(a a1)
    {
        while (a1.a != null && a1.a.a != 1) 
        {
            e e1 = a1.a.c;
            a1.a.a();
            a1.a = e1;
            a1.c = a1.c + 1;
        }
    }

    static int c(a a1)
    {
        return a1.d;
    }

    static e d(a a1)
    {
        return a1.b;
    }

    public final c a()
    {
        b b1 = new b();
        a(((e) (b1)));
        return new c(this, b1, d);
    }

    public final void a(Object obj)
    {
        if (a == null)
        {
            return;
        } else
        {
            a(((e) (new d(obj))));
            d = d + 1;
            return;
        }
    }
}

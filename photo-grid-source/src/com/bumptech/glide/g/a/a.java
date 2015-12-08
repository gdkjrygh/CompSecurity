// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.a;


// Referenced classes of package com.bumptech.glide.g.a:
//            f, k, b, g, 
//            c, d

public final class a
    implements f
{

    private final k a;
    private final int b;
    private c c;
    private c d;

    public a()
    {
        this((byte)0);
    }

    private a(byte byte0)
    {
        this(new k(new b()));
    }

    private a(k k1)
    {
        a = k1;
        b = 300;
    }

    public final d a(boolean flag, boolean flag1)
    {
        if (flag)
        {
            return g.b();
        }
        if (flag1)
        {
            if (c == null)
            {
                c = new c(a.a(false, true), b);
            }
            return c;
        }
        if (d == null)
        {
            d = new c(a.a(false, false), b);
        }
        return d;
    }
}

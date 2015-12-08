// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            u, p

final class <init>
    implements <init>
{

    private final tion a;
    private tion b;
    private int c;
    private u d;

    public final byte a()
    {
        if (!b.hasNext())
        {
            b = a.a().a();
        }
        c = c - 1;
        return b.a();
    }

    public final boolean hasNext()
    {
        return c > 0;
    }

    public final Object next()
    {
        return Byte.valueOf(a());
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    private tion(u u1)
    {
        d = u1;
        super();
        a = new <init>(u1, (byte)0);
        b = a.a().a();
        c = u1.b();
    }

    c(u u1, byte byte0)
    {
        this(u1);
    }
}

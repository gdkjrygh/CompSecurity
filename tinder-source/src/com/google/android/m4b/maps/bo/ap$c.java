// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            ap, bb

final class <init>
    implements <init>
{

    private int a;
    private int b;
    private ap c;

    public final bb a()
    {
        return c.f[a];
    }

    public final void b()
    {
        b = a;
    }

    public final void c()
    {
        a = b;
    }

    public final boolean hasNext()
    {
        return a < c.f.length;
    }

    public final Object next()
    {
        bb abb[] = c.f;
        int i = a;
        a = i + 1;
        return abb[i];
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("remove() not supported");
    }

    private ion(ap ap1)
    {
        c = ap1;
        super();
        a = 0;
        b = 0;
    }

    b(ap ap1, byte byte0)
    {
        this(ap1);
    }
}

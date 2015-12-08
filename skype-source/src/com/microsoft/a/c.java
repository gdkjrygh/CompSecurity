// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;


// Referenced classes of package com.microsoft.a:
//            d, l

public final class c
{

    private d a;
    private short b;
    private l c;

    public c()
    {
        a = new d();
        b = 0;
        c = new l();
    }

    public final l a()
    {
        return c;
    }

    public final void a(d d1)
    {
        a = d1;
    }

    public final void a(l l1)
    {
        c = l1;
    }

    public final void a(short word0)
    {
        b = word0;
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return null;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;


// Referenced classes of package com.google.b.g.a:
//            c, d

final class l extends c
{

    private l()
    {
        super(null);
    }

    l(d d)
    {
        this();
    }

    boolean a(int i, int j)
    {
        return ((i + j & 1) + (i * j) % 3 & 1) == 0;
    }
}

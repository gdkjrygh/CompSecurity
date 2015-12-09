// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.g.a;


// Referenced classes of package com.google.b.g.a:
//            c, d

final class j extends c
{

    private j()
    {
        super(null);
    }

    j(d d)
    {
        this();
    }

    boolean a(int i, int k)
    {
        i *= k;
        return i % 3 + (i & 1) == 0;
    }
}

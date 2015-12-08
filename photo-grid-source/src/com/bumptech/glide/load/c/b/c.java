// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c.b;

import com.bumptech.glide.load.a.b;

// Referenced classes of package com.bumptech.glide.load.c.b:
//            g

public final class c
    implements g
{

    private final String a;

    public c()
    {
        this("");
    }

    private c(String s)
    {
        a = s;
    }

    public final com.bumptech.glide.load.a.c a(Object obj, int i, int j)
    {
        return new b((byte[])obj, a);
    }
}

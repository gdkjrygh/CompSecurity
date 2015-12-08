// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.a;

import java.io.ByteArrayInputStream;

// Referenced classes of package com.bumptech.glide.load.a:
//            c

public final class b
    implements c
{

    private final byte a[];
    private final String b;

    public b(byte abyte0[], String s)
    {
        a = abyte0;
        b = s;
    }

    public final Object a(int i)
    {
        return new ByteArrayInputStream(a);
    }

    public final void a()
    {
    }

    public final String b()
    {
        return b;
    }

    public final void c()
    {
    }
}

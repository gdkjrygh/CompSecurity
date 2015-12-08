// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import com.bumptech.glide.i.h;

// Referenced classes of package com.bumptech.glide.g.b:
//            a, h

public abstract class g extends a
{

    private final int a;
    private final int b;

    public g()
    {
        this((byte)0);
    }

    private g(byte byte0)
    {
        a = 0x80000000;
        b = 0x80000000;
    }

    public final void a(com.bumptech.glide.g.b.h h1)
    {
        if (!h.a(a, b))
        {
            throw new IllegalArgumentException((new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ")).append(a).append(" and height: ").append(b).append(", either provide dimensions in the constructor or call override()").toString());
        } else
        {
            h1.a(a, b);
            return;
        }
    }
}

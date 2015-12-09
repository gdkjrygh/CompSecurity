// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request.b;

import com.bumptech.glide.g.h;

// Referenced classes of package com.bumptech.glide.request.b:
//            a, h

public abstract class g extends a
{

    private final int a;
    private final int b;

    public g()
    {
        this(0x80000000, 0x80000000);
    }

    public g(int i, int j)
    {
        a = i;
        b = j;
    }

    public final void a(com.bumptech.glide.request.b.h h1)
    {
        if (!h.a(a, b))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ").append(a).append(" and height: ").append(b).append(", either provide dimensions in the constructor").append(" or call override()").toString());
        } else
        {
            h1.a(a, b);
            return;
        }
    }
}

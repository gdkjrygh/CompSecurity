// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.e.b;
import com.bumptech.glide.load.b.h;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            l

public class m
    implements b
{

    private final l a;
    private final e b;
    private final f c;
    private final h d;

    public m(b b1, b b2)
    {
        c = b1.d();
        d = new h(b1.c(), b2.c());
        b = b1.a();
        a = new l(b1.b(), b2.b());
    }

    public e a()
    {
        return b;
    }

    public e b()
    {
        return a;
    }

    public com.bumptech.glide.load.b c()
    {
        return d;
    }

    public f d()
    {
        return c;
    }
}

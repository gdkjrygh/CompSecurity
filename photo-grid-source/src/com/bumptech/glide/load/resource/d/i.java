// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.f.b;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.b.c;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            c, g, f

public final class i
    implements b
{

    private final e a;
    private final e b;
    private final f c;
    private final com.bumptech.glide.load.b d;

    public i(b b1, b b2, com.bumptech.glide.load.b.a.e e)
    {
        e = new com.bumptech.glide.load.resource.d.c(b1.b(), b2.b(), e);
        a = new c(new g(e));
        b = e;
        c = new com.bumptech.glide.load.resource.d.f(b1.d(), b2.d());
        d = b1.c();
    }

    public final e a()
    {
        return a;
    }

    public final e b()
    {
        return b;
    }

    public final com.bumptech.glide.load.b c()
    {
        return d;
    }

    public final f d()
    {
        return c;
    }
}

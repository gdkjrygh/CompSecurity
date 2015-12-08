// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.e.b;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.a;
import com.bumptech.glide.load.resource.b.c;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            p, h, b

public class g
    implements b
{

    private final e a;
    private final h b;
    private final com.bumptech.glide.load.resource.bitmap.b c = new com.bumptech.glide.load.resource.bitmap.b();
    private final com.bumptech.glide.load.b d = com.bumptech.glide.load.resource.a.b();

    public g(com.bumptech.glide.load.engine.a.c c1, com.bumptech.glide.load.a a1)
    {
        a = new c(new p(c1, a1));
        b = new h(c1, a1);
    }

    public e a()
    {
        return a;
    }

    public e b()
    {
        return b;
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

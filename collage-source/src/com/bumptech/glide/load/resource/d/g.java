// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.e.b;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.b.c;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            c, e, d

public class g
    implements b
{

    private final e a;
    private final e b;
    private final f c;
    private final com.bumptech.glide.load.b d;

    public g(b b1, b b2, com.bumptech.glide.load.engine.a.c c1)
    {
        c1 = new com.bumptech.glide.load.resource.d.c(b1.b(), b2.b(), c1);
        a = new c(new com.bumptech.glide.load.resource.d.e(c1));
        b = c1;
        c = new d(b1.d(), b2.d());
        d = b1.c();
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

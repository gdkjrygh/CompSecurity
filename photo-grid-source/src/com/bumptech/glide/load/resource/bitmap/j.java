// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.f.b;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.a;
import com.bumptech.glide.load.resource.b.c;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            w, k, b

public final class j
    implements b
{

    private final e a;
    private final k b;
    private final com.bumptech.glide.load.resource.bitmap.b c = new com.bumptech.glide.load.resource.bitmap.b();
    private final com.bumptech.glide.load.b d = com.bumptech.glide.load.resource.a.b();

    public j(com.bumptech.glide.load.b.a.e e, com.bumptech.glide.load.a a1)
    {
        a = new c(new w(e, a1));
        b = new k(e, a1);
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

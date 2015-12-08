// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.f.b;
import com.bumptech.glide.load.c.k;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            r

public final class s
    implements b
{

    private final r a;
    private final e b;
    private final f c;
    private final k d;

    public s(b b1, b b2)
    {
        c = b1.d();
        d = new k(b1.c(), b2.c());
        b = b1.a();
        a = new r(b1.b(), b2.b());
    }

    public final e a()
    {
        return b;
    }

    public final e b()
    {
        return a;
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.e;

import com.bumptech.glide.load.b;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.e.c;

// Referenced classes of package com.bumptech.glide.e:
//            f, b

public class e
    implements com.bumptech.glide.e.f
{

    private final l a;
    private final c b;
    private final com.bumptech.glide.e.b c;

    public e(l l, c c1, com.bumptech.glide.e.b b1)
    {
        if (l == null)
        {
            throw new NullPointerException("ModelLoader must not be null");
        }
        a = l;
        if (c1 == null)
        {
            throw new NullPointerException("Transcoder must not be null");
        }
        b = c1;
        if (b1 == null)
        {
            throw new NullPointerException("DataLoadProvider must not be null");
        } else
        {
            c = b1;
            return;
        }
    }

    public com.bumptech.glide.load.e a()
    {
        return c.a();
    }

    public com.bumptech.glide.load.e b()
    {
        return c.b();
    }

    public b c()
    {
        return c.c();
    }

    public f d()
    {
        return c.d();
    }

    public l e()
    {
        return a;
    }

    public c f()
    {
        return b;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.f;

import com.bumptech.glide.load.b;
import com.bumptech.glide.load.c.s;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.e.c;

// Referenced classes of package com.bumptech.glide.f:
//            f, b

public final class e
    implements com.bumptech.glide.f.f
{

    private final s a;
    private final c b;
    private final com.bumptech.glide.f.b c;

    public e(s s, c c1, com.bumptech.glide.f.b b1)
    {
        if (s == null)
        {
            throw new NullPointerException("ModelLoader must not be null");
        }
        a = s;
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

    public final com.bumptech.glide.load.e a()
    {
        return c.a();
    }

    public final com.bumptech.glide.load.e b()
    {
        return c.b();
    }

    public final b c()
    {
        return c.c();
    }

    public final f d()
    {
        return c.d();
    }

    public final s e()
    {
        return a;
    }

    public final c f()
    {
        return b;
    }
}

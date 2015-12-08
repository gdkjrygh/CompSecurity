// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.b.x;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            a

public final class b
    implements x
{

    private final a a;

    public b(a a1)
    {
        if (a1 == null)
        {
            throw new NullPointerException("Data must not be null");
        } else
        {
            a = a1;
            return;
        }
    }

    public final volatile Object b()
    {
        return a;
    }

    public final int c()
    {
        return a.a();
    }

    public final void d()
    {
        x x1 = a.b();
        if (x1 != null)
        {
            x1.d();
        }
        x1 = a.c();
        if (x1 != null)
        {
            x1.d();
        }
    }
}

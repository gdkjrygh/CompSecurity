// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.d;

import com.bumptech.glide.load.engine.j;

// Referenced classes of package com.bumptech.glide.load.resource.d:
//            a

public class b
    implements j
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

    public a a()
    {
        return a;
    }

    public Object b()
    {
        return a();
    }

    public int c()
    {
        return a.a();
    }

    public void d()
    {
        j j1 = a.b();
        if (j1 != null)
        {
            j1.d();
        }
        j1 = a.c();
        if (j1 != null)
        {
            j1.d();
        }
    }
}

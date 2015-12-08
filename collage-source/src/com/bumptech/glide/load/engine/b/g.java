// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.b;

import com.bumptech.glide.g.e;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.j;

// Referenced classes of package com.bumptech.glide.load.engine.b:
//            h

public class g extends e
    implements h
{

    private h.a a;

    public g(int i)
    {
        super(i);
    }

    protected int a(j j1)
    {
        return j1.c();
    }

    protected volatile int a(Object obj)
    {
        return a((j)obj);
    }

    public j a(c c1)
    {
        return (j)super.c(c1);
    }

    public void a(int i)
    {
        if (i >= 60)
        {
            c();
        } else
        if (i >= 40)
        {
            b(a() / 2);
            return;
        }
    }

    protected void a(c c1, j j1)
    {
        if (a != null)
        {
            a.b(j1);
        }
    }

    public void a(h.a a1)
    {
        a = a1;
    }

    protected volatile void a(Object obj, Object obj1)
    {
        a((c)obj, (j)obj1);
    }

    public volatile j b(c c1, j j1)
    {
        return (j)super.b(c1, j1);
    }
}

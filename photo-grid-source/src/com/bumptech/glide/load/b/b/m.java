// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.b;

import com.bumptech.glide.i.e;
import com.bumptech.glide.load.b.x;
import com.bumptech.glide.load.c;

// Referenced classes of package com.bumptech.glide.load.b.b:
//            n, o

public final class m extends e
    implements n
{

    private o a;

    public m(int i)
    {
        super(i);
    }

    protected final int a(Object obj)
    {
        return ((x)obj).c();
    }

    public final x a(c c)
    {
        return (x)super.c(c);
    }

    public final x a(c c, x x1)
    {
        return (x)super.b(c, x1);
    }

    public final void a(int i)
    {
        if (i >= 60)
        {
            a();
        } else
        if (i >= 40)
        {
            b(b() / 2);
            return;
        }
    }

    public final void a(o o1)
    {
        a = o1;
    }

    protected final void a(Object obj, Object obj1)
    {
        obj = (x)obj1;
        if (a != null)
        {
            a.b(((x) (obj)));
        }
    }
}

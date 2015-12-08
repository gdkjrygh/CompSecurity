// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.e;

import com.bumptech.glide.load.b;
import com.bumptech.glide.load.b.l;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.resource.e.c;

// Referenced classes of package com.bumptech.glide.e:
//            f

public class a
    implements com.bumptech.glide.e.f, Cloneable
{

    private final com.bumptech.glide.e.f a;
    private e b;
    private e c;
    private f d;
    private c e;
    private b f;

    public a(com.bumptech.glide.e.f f1)
    {
        a = f1;
    }

    public e a()
    {
        if (b != null)
        {
            return b;
        } else
        {
            return a.a();
        }
    }

    public void a(b b1)
    {
        f = b1;
    }

    public void a(e e1)
    {
        c = e1;
    }

    public e b()
    {
        if (c != null)
        {
            return c;
        } else
        {
            return a.b();
        }
    }

    public b c()
    {
        if (f != null)
        {
            return f;
        } else
        {
            return a.c();
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return g();
    }

    public f d()
    {
        if (d != null)
        {
            return d;
        } else
        {
            return a.d();
        }
    }

    public l e()
    {
        return a.e();
    }

    public c f()
    {
        if (e != null)
        {
            return e;
        } else
        {
            return a.f();
        }
    }

    public a g()
    {
        a a1;
        try
        {
            a1 = (a)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new RuntimeException(clonenotsupportedexception);
        }
        return a1;
    }
}

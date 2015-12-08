// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ak;

import p.ah.d;
import p.q.b;
import p.q.e;
import p.q.f;
import p.x.j;

// Referenced classes of package p.ak:
//            f

public class a
    implements Cloneable, p.ak.f
{

    private final p.ak.f a;
    private e b;
    private e c;
    private f d;
    private d e;
    private b f;

    public a(p.ak.f f1)
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

    public void a(d d1)
    {
        e = d1;
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

    public j e()
    {
        return a.e();
    }

    public d f()
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

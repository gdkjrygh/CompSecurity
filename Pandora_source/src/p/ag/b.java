// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ag;

import p.s.k;

// Referenced classes of package p.ag:
//            a

public class b
    implements k
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
        k k1 = a.b();
        if (k1 != null)
        {
            k1.d();
        }
        k1 = a.c();
        if (k1 != null)
        {
            k1.d();
        }
    }
}

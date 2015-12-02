// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;

import com.google.common.base.Objects;

// Referenced classes of package com.facebook.common.e:
//            n

public class m
{

    private final String a;
    private final String b;
    private final Throwable c;
    private final boolean d;
    private final int e;
    private final boolean f;

    m(n n1)
    {
        a = n1.a();
        b = n1.b();
        c = n1.c();
        d = n1.d();
        e = n1.e();
        f = n1.f();
    }

    public static n a(String s, String s1)
    {
        return (new n()).a(s).b(s1);
    }

    public static m b(String s, String s1)
    {
        return (new n()).a(s).b(s1).g();
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public Throwable c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public int e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (m)obj;
            if (d != ((m) (obj)).d)
            {
                return false;
            }
            if (f != ((m) (obj)).f)
            {
                return false;
            }
            if (e != ((m) (obj)).e)
            {
                return false;
            }
            if (!Objects.equal(a, ((m) (obj)).a))
            {
                return false;
            }
            if (!Objects.equal(c, ((m) (obj)).c))
            {
                return false;
            }
            if (!Objects.equal(b, ((m) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public boolean f()
    {
        return f;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b, Boolean.valueOf(d), Integer.valueOf(e)
        });
    }
}

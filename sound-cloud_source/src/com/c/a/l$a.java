// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;


// Referenced classes of package com.c.a:
//            l, D

public static final class a
{

    boolean a;
    String b[];
    String c[];
    boolean d;

    public final ject a()
    {
        if (!a)
        {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        } else
        {
            d = true;
            return this;
        }
    }

    public final transient d a(D ad[])
    {
        if (!a)
        {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String as[] = new String[ad.length];
        for (int i = 0; i < ad.length; i++)
        {
            as[i] = ad[i].e;
        }

        c = as;
        return this;
    }

    public final transient ring a(String as[])
    {
        if (!a)
        {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (as == null)
        {
            b = null;
            return this;
        } else
        {
            b = (String[])as.clone();
            return this;
        }
    }

    public final transient ring b(String as[])
    {
        if (!a)
        {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (as == null)
        {
            c = null;
            return this;
        } else
        {
            c = (String[])as.clone();
            return this;
        }
    }

    public final l b()
    {
        return new l(this, (byte)0);
    }

    public ring(l l1)
    {
        a = l1.d;
        b = l.a(l1);
        c = l.b(l1);
        d = l1.g;
    }

    d(boolean flag)
    {
        a = flag;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.c;


// Referenced classes of package com.nuance.a.a.a.c.c:
//            d

public final class c
{

    private String a;
    private Object b;
    private d c;

    public c(String s, d d1)
    {
        a = s;
        b = new byte[0];
        c = d1;
    }

    public c(String s, Object obj, d d1)
    {
        a = s;
        b = obj;
        c = d1;
    }

    public final String a()
    {
        return a;
    }

    public final byte[] b()
    {
        if (b instanceof byte[])
        {
            return (byte[])b;
        } else
        {
            return "THIS IS NOT A STRING PARAMETER!!!".getBytes();
        }
    }

    public final Object c()
    {
        return b;
    }

    public final Object clone()
    {
        return e();
    }

    public final d d()
    {
        return c;
    }

    public final c e()
    {
        Object obj = b;
        if (b instanceof byte[])
        {
            byte abyte0[] = (byte[])b;
            obj = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, obj, 0, abyte0.length);
        }
        return new c(a, obj, c);
    }
}

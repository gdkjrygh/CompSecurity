// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.d.d;


// Referenced classes of package com.facebook.d.d:
//            f, o, i, m, 
//            n, k, l, j

public class e
{

    public e()
    {
    }

    public static f a()
    {
        return new f();
    }

    public static transient f a(j aj[])
    {
        f f1 = new f();
        int i1 = aj.length;
        for (int j = 0; j < i1; j++)
        {
            f1.a(aj[j]);
        }

        return f1;
    }

    public static j a(String s)
    {
        return new o(s);
    }

    public static j a(String s, String s1)
    {
        return new i(s, s1);
    }

    public static j b(String s, String s1)
    {
        return new m(s, s1);
    }

    public static transient n b(j aj[])
    {
        n n1 = new n();
        int i1 = aj.length;
        for (int j = 0; j < i1; j++)
        {
            n1.a(aj[j]);
        }

        return n1;
    }

    public static j c(String s, String s1)
    {
        return new k(s, s1);
    }

    public static j d(String s, String s1)
    {
        return new l(s, s1);
    }
}

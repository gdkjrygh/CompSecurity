// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            b, ao, e

abstract class au extends b
{

    final CharSequence b;
    final e c;
    final boolean d;
    int e;
    int f;

    protected au(ao ao1, CharSequence charsequence)
    {
        e = 0;
        c = ao.a(ao1);
        d = ao.b(ao1);
        f = ao.c(ao1);
        b = charsequence;
    }

    abstract int a(int i);

    protected final Object a()
    {
        int j = e;
        do
        {
            if (e == -1)
            {
                break;
            }
            int i = a(e);
            if (i == -1)
            {
                i = b.length();
                e = -1;
            } else
            {
                e = b(i);
            }
            if (e == j)
            {
                e = e + 1;
                if (e >= b.length())
                {
                    e = -1;
                }
            } else
            {
                for (; j < i && c.a(b.charAt(j)); j++) { }
                for (; i > j && c.a(b.charAt(i - 1)); i--) { }
                if (d && j == i)
                {
                    j = e;
                } else
                {
                    int k;
                    if (f == 1)
                    {
                        i = b.length();
                        e = -1;
                        do
                        {
                            k = i;
                            if (i <= j)
                            {
                                break;
                            }
                            k = i;
                            if (!c.a(b.charAt(i - 1)))
                            {
                                break;
                            }
                            i--;
                        } while (true);
                    } else
                    {
                        f = f - 1;
                        k = i;
                    }
                    return b.subSequence(j, k).toString();
                }
            }
        } while (true);
        b();
        return null;
    }

    abstract int b(int i);
}

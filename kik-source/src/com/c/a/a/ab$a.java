// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


// Referenced classes of package com.c.a.a:
//            a, ab, c

private static abstract class b extends a
{

    final CharSequence b;
    final c c;
    final boolean d;
    int e;
    int f;

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
                for (; j < i && c.c(b.charAt(j)); j++) { }
                for (; i > j && c.c(b.charAt(i - 1)); i--) { }
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
                            if (!c.c(b.charAt(i - 1)))
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

    protected equence(ab ab1, CharSequence charsequence)
    {
        e = 0;
        c = ab.a(ab1);
        d = ab.b(ab1);
        f = ab.c(ab1);
        b = charsequence;
    }
}

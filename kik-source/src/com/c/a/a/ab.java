// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import java.util.Iterator;

// Referenced classes of package com.c.a.a:
//            c, u, ac, ae, 
//            a

public final class ab
{
    private static abstract class a extends com.c.a.a.a
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

        protected a(ab ab1, CharSequence charsequence)
        {
            e = 0;
            c = ab.a(ab1);
            d = ab.b(ab1);
            f = ab.c(ab1);
            b = charsequence;
        }
    }

    private static interface b
    {

        public abstract Iterator a(ab ab1, CharSequence charsequence);
    }


    private final c a;
    private final boolean b;
    private final b c;
    private final int d;

    private ab(b b1)
    {
        this(b1, c.m);
    }

    private ab(b b1, c c1)
    {
        c = b1;
        b = false;
        a = c1;
        d = 0x7fffffff;
    }

    public static ab a()
    {
        c c1 = com.c.a.a.c.a('.');
        u.a(c1);
        return new ab(new ac(c1));
    }

    static c a(ab ab1)
    {
        return ab1.a;
    }

    static Iterator a(ab ab1, CharSequence charsequence)
    {
        return ab1.c.a(ab1, charsequence);
    }

    static boolean b(ab ab1)
    {
        return ab1.b;
    }

    static int c(ab ab1)
    {
        return ab1.d;
    }

    public final Iterable a(CharSequence charsequence)
    {
        u.a(charsequence);
        return new ae(this, charsequence);
    }
}

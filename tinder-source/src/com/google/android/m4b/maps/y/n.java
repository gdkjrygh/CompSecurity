// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.y:
//            d, b, g

public final class n
{
    static abstract class a extends com.google.android.m4b.maps.y.b
    {

        final CharSequence b;
        private d c;
        private boolean d;
        private int e;
        private int f;

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
            super.a = b.a.c;
            return null;
        }

        abstract int b(int i);

        protected a(n n1, CharSequence charsequence)
        {
            e = 0;
            c = n1.a;
            d = n1.b;
            f = n1.d;
            b = charsequence;
        }
    }

    static interface b
    {

        public abstract Iterator a(n n1, CharSequence charsequence);
    }


    final d a;
    final boolean b;
    final b c;
    final int d;

    public n(b b1)
    {
        this(b1, d.g);
    }

    private n(b b1, d d1)
    {
        c = b1;
        b = false;
        a = d1;
        d = 0x7fffffff;
    }

    // Unreferenced inner class com/google/android/m4b/maps/y/n$1

/* anonymous class */
    public static final class _cls1
        implements b
    {

        final int a = 2;

        public final Iterator a(n n1, CharSequence charsequence)
        {
            return new a(this, n1, charsequence) {

                private _cls1 c;

                public final int a(int i)
                {
    public static final class _cls1
        implements b
    {
                    i = c.a + i;
                    if (i < b.length())
                    {
                        return i;
                    } else
                    {
                        return -1;
                    }
                }

                public final int b(int i)
                {
                    return i;
                }

            
            {
                c = _pcls1;
                super(n1, charsequence);
            }
            };
        }

            public 
            {
                super();
            }
    }


    // Unreferenced inner class com/google/android/m4b/maps/y/n$2

/* anonymous class */
    public final class _cls2
        implements Iterable
    {

        private CharSequence a;
        private n b;

        public final Iterator iterator()
        {
            n n1 = b;
            CharSequence charsequence = a;
            return n1.c.a(n1, charsequence);
        }

        public final String toString()
        {
            return g.a(", ").a(new StringBuilder("["), iterator()).append(']').toString();
        }

            public 
            {
                b = n.this;
                a = charsequence;
                super();
            }
    }

}

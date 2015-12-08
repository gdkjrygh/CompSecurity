// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class cub
{

    public final ctr a;
    final boolean b;
    public final cud c;
    public final int d;

    public cub(cud cud)
    {
        this(cud, false, ctr.a, 0x7fffffff);
    }

    public cub(cud cud, boolean flag, ctr ctr1, int i)
    {
        c = cud;
        b = flag;
        a = ctr1;
        d = i;
    }

    // Unreferenced inner class cub$1

/* anonymous class */
    public final class _cls1
        implements cud
    {

        final String a;

        public final Iterator a(cub cub1, CharSequence charsequence)
        {
            return new cuc(this, cub1, charsequence) {

                private _cls1 c;

                public final int a(int i)
                {
                    int k;
label0:
                    {
    public final class _cls1
        implements cud
    {
                        int l = c.a.length();
label1:
                        for (int i1 = b.length(); i <= i1 - l; i++)
                        {
                            int j = 0;
                            do
                            {
                                k = i;
                                if (j >= l)
                                {
                                    break label0;
                                }
                                if (b.charAt(j + i) != c.a.charAt(j))
                                {
                                    continue label1;
                                }
                                j++;
                            } while (true);
                        }

                        k = -1;
                    }
                    return k;
                }

                public final int b(int i)
                {
                    return c.a.length() + i;
                }

            
            {
                c = _pcls1;
                super(cub1, charsequence);
            }
            };
        }

            public 
            {
                a = s;
                super();
            }
    }


    // Unreferenced inner class cub$2

/* anonymous class */
    public final class _cls2
        implements Iterable
    {

        private CharSequence a;
        private cub b;

        public final Iterator iterator()
        {
            cub cub1 = b;
            CharSequence charsequence = a;
            return cub1.c.a(cub1, charsequence);
        }

        public final String toString()
        {
            return ctw.a(", ").a(new StringBuilder("["), iterator()).append(']').toString();
        }

            public 
            {
                b = cub.this;
                a = charsequence;
                super();
            }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            f

final class bu
{
    public static abstract class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/aa/bu$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        abstract int a(int i);

        static 
        {
            c = new a("NEXT_LOWER") {

                final int a(int i)
                {
                    return i - 1;
                }

            };
            a = new a("NEXT_HIGHER") {

                public final int a(int i)
                {
                    return i;
                }

            };
            b = new a("INVERTED_INSERTION_INDEX") {

                public final int a(int i)
                {
                    return ~i;
                }

            };
            d = (new a[] {
                c, a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }

        a(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

    public static abstract class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static b e;
        private static final b f[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/google/android/m4b/maps/aa/bu$b, s);
        }

        public static b[] values()
        {
            return (b[])f.clone();
        }

        abstract int a(Comparator comparator, Object obj, List list, int i);

        static 
        {
            a = new b("ANY_PRESENT") {

                final int a(Comparator comparator, Object obj, List list, int i)
                {
                    return i;
                }

            };
            b = new b("LAST_PRESENT") {

                final int a(Comparator comparator, Object obj, List list, int i)
                {
                    for (int k = list.size() - 1; i < k;)
                    {
                        int l = i + k + 1 >>> 1;
                        if (comparator.compare(list.get(l), obj) > 0)
                        {
                            k = l - 1;
                        } else
                        {
                            i = l;
                        }
                    }

                    return i;
                }

            };
            c = new b("FIRST_PRESENT") {

                final int a(Comparator comparator, Object obj, List list, int i)
                {
                    int k;
                    for (k = 0; k < i;)
                    {
                        int l = k + i >>> 1;
                        if (comparator.compare(list.get(l), obj) < 0)
                        {
                            k = l + 1;
                        } else
                        {
                            i = l;
                        }
                    }

                    return k;
                }

            };
            d = new b("FIRST_AFTER") {

                public final int a(Comparator comparator, Object obj, List list, int i)
                {
                    return b.a(comparator, obj, list, i) + 1;
                }

            };
            e = new b("LAST_BEFORE") {

                public final int a(Comparator comparator, Object obj, List list, int i)
                {
                    return c.a(comparator, obj, list, i) - 1;
                }

            };
            f = (new b[] {
                a, b, c, d, e
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }

        b(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    public static int a(List list, Object obj, Comparator comparator, b b1, a a1)
    {
        j.a(comparator);
        j.a(list);
        j.a(b1);
        j.a(a1);
        Object obj1 = list;
        if (!(list instanceof RandomAccess))
        {
            obj1 = f.a(list);
        }
        int i = 0;
        for (int k = ((List) (obj1)).size() - 1; i <= k;)
        {
            int l = i + k >>> 1;
            int i1 = comparator.compare(obj, ((List) (obj1)).get(l));
            if (i1 < 0)
            {
                k = l - 1;
            } else
            if (i1 > 0)
            {
                i = l + 1;
            } else
            {
                return b1.a(comparator, obj, ((List) (obj1)).subList(i, k + 1), l - i) + i;
            }
        }

        return a1.a(i);
    }
}

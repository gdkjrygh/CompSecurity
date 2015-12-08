// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctz;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            Lists

final class SortedLists
{

    public static int a(List list, Object obj, Comparator comparator, KeyPresentBehavior keypresentbehavior, KeyAbsentBehavior keyabsentbehavior)
    {
        ctz.a(comparator);
        ctz.a(list);
        ctz.a(keypresentbehavior);
        ctz.a(keyabsentbehavior);
        Object obj1 = list;
        if (!(list instanceof RandomAccess))
        {
            obj1 = Lists.a(list);
        }
        int i = 0;
        for (int j = ((List) (obj1)).size() - 1; i <= j;)
        {
            int k = i + j >>> 1;
            int l = comparator.compare(obj, ((List) (obj1)).get(k));
            if (l < 0)
            {
                j = k - 1;
            } else
            if (l > 0)
            {
                i = k + 1;
            } else
            {
                return keypresentbehavior.a(comparator, obj, ((List) (obj1)).subList(i, j + 1), k - i) + i;
            }
        }

        return keyabsentbehavior.a(i);
    }

    private class KeyPresentBehavior extends Enum
    {

        public static final KeyPresentBehavior a;
        public static final KeyPresentBehavior b;
        public static final KeyPresentBehavior c;
        public static final KeyPresentBehavior d;
        private static KeyPresentBehavior e;
        private static final KeyPresentBehavior f[];

        public static KeyPresentBehavior valueOf(String s)
        {
            return (KeyPresentBehavior)Enum.valueOf(com/google/common/collect/SortedLists$KeyPresentBehavior, s);
        }

        public static KeyPresentBehavior[] values()
        {
            return (KeyPresentBehavior[])f.clone();
        }

        abstract int a(Comparator comparator, Object obj, List list, int i);

        static 
        {
            a = new KeyPresentBehavior("ANY_PRESENT") {

                final int a(Comparator comparator, Object obj, List list, int i)
                {
                    return i;
                }

            };
            b = new KeyPresentBehavior("LAST_PRESENT") {

                final int a(Comparator comparator, Object obj, List list, int i)
                {
                    for (int j = list.size() - 1; i < j;)
                    {
                        int k = i + j + 1 >>> 1;
                        if (comparator.compare(list.get(k), obj) > 0)
                        {
                            j = k - 1;
                        } else
                        {
                            i = k;
                        }
                    }

                    return i;
                }

            };
            c = new KeyPresentBehavior("FIRST_PRESENT") {

                final int a(Comparator comparator, Object obj, List list, int i)
                {
                    int j;
                    for (j = 0; j < i;)
                    {
                        int k = j + i >>> 1;
                        if (comparator.compare(list.get(k), obj) < 0)
                        {
                            j = k + 1;
                        } else
                        {
                            i = k;
                        }
                    }

                    return j;
                }

            };
            d = new KeyPresentBehavior("FIRST_AFTER") {

                public final int a(Comparator comparator, Object obj, List list, int i)
                {
                    return b.a(comparator, obj, list, i) + 1;
                }

            };
            e = new KeyPresentBehavior("LAST_BEFORE") {

                public final int a(Comparator comparator, Object obj, List list, int i)
                {
                    return c.a(comparator, obj, list, i) - 1;
                }

            };
            f = (new KeyPresentBehavior[] {
                a, b, c, d, e
            });
        }

        private KeyPresentBehavior(String s, int i)
        {
            super(s, i);
        }

        KeyPresentBehavior(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    private class KeyAbsentBehavior extends Enum
    {

        public static final KeyAbsentBehavior a;
        public static final KeyAbsentBehavior b;
        private static KeyAbsentBehavior c;
        private static final KeyAbsentBehavior d[];

        public static KeyAbsentBehavior valueOf(String s)
        {
            return (KeyAbsentBehavior)Enum.valueOf(com/google/common/collect/SortedLists$KeyAbsentBehavior, s);
        }

        public static KeyAbsentBehavior[] values()
        {
            return (KeyAbsentBehavior[])d.clone();
        }

        abstract int a(int i);

        static 
        {
            c = new KeyAbsentBehavior("NEXT_LOWER") {

                final int a(int i)
                {
                    return i - 1;
                }

            };
            a = new KeyAbsentBehavior("NEXT_HIGHER") {

                public final int a(int i)
                {
                    return i;
                }

            };
            b = new KeyAbsentBehavior("INVERTED_INSERTION_INDEX") {

                public final int a(int i)
                {
                    return ~i;
                }

            };
            d = (new KeyAbsentBehavior[] {
                c, a, b
            });
        }

        private KeyAbsentBehavior(String s, int i)
        {
            super(s, i);
        }

        KeyAbsentBehavior(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

}

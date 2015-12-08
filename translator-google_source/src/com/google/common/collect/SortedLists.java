// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            Lists

final class SortedLists
{

    public static int a(List list, Object obj, Comparator comparator, KeyPresentBehavior keypresentbehavior, KeyAbsentBehavior keyabsentbehavior)
    {
        p.a(comparator);
        p.a(list);
        p.a(keypresentbehavior);
        p.a(keyabsentbehavior);
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
                return keypresentbehavior.resultIndex(comparator, obj, ((List) (obj1)).subList(i, j + 1), k - i) + i;
            }
        }

        return keyabsentbehavior.resultIndex(i);
    }

    private class KeyPresentBehavior extends Enum
    {

        public static final KeyPresentBehavior ANY_PRESENT;
        public static final KeyPresentBehavior FIRST_AFTER;
        public static final KeyPresentBehavior FIRST_PRESENT;
        public static final KeyPresentBehavior LAST_BEFORE;
        public static final KeyPresentBehavior LAST_PRESENT;
        private static final KeyPresentBehavior a[];

        public static KeyPresentBehavior valueOf(String s)
        {
            return (KeyPresentBehavior)Enum.valueOf(com/google/common/collect/SortedLists$KeyPresentBehavior, s);
        }

        public static KeyPresentBehavior[] values()
        {
            return (KeyPresentBehavior[])a.clone();
        }

        abstract int resultIndex(Comparator comparator, Object obj, List list, int i);

        static 
        {
            class _cls1 extends KeyPresentBehavior
            {

                final int resultIndex(Comparator comparator, Object obj, List list, int i)
                {
                    return i;
                }

                _cls1(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ANY_PRESENT = new _cls1("ANY_PRESENT", 0);
            class _cls2 extends KeyPresentBehavior
            {

                final int resultIndex(Comparator comparator, Object obj, List list, int i)
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

                _cls2(String s, int i)
                {
                    super(s, i, null);
                }
            }

            LAST_PRESENT = new _cls2("LAST_PRESENT", 1);
            class _cls3 extends KeyPresentBehavior
            {

                final int resultIndex(Comparator comparator, Object obj, List list, int i)
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

                _cls3(String s, int i)
                {
                    super(s, i, null);
                }
            }

            FIRST_PRESENT = new _cls3("FIRST_PRESENT", 2);
            class _cls4 extends KeyPresentBehavior
            {

                public final int resultIndex(Comparator comparator, Object obj, List list, int i)
                {
                    return LAST_PRESENT.resultIndex(comparator, obj, list, i) + 1;
                }

                _cls4(String s, int i)
                {
                    super(s, i, null);
                }
            }

            FIRST_AFTER = new _cls4("FIRST_AFTER", 3);
            class _cls5 extends KeyPresentBehavior
            {

                public final int resultIndex(Comparator comparator, Object obj, List list, int i)
                {
                    return FIRST_PRESENT.resultIndex(comparator, obj, list, i) - 1;
                }

                _cls5(String s, int i)
                {
                    super(s, i, null);
                }
            }

            LAST_BEFORE = new _cls5("LAST_BEFORE", 4);
            a = (new KeyPresentBehavior[] {
                ANY_PRESENT, LAST_PRESENT, FIRST_PRESENT, FIRST_AFTER, LAST_BEFORE
            });
        }

        private KeyPresentBehavior(String s, int i)
        {
            super(s, i);
        }

        KeyPresentBehavior(String s, int i, eh eh)
        {
            this(s, i);
        }
    }


    private class KeyAbsentBehavior extends Enum
    {

        public static final KeyAbsentBehavior INVERTED_INSERTION_INDEX;
        public static final KeyAbsentBehavior NEXT_HIGHER;
        public static final KeyAbsentBehavior NEXT_LOWER;
        private static final KeyAbsentBehavior a[];

        public static KeyAbsentBehavior valueOf(String s)
        {
            return (KeyAbsentBehavior)Enum.valueOf(com/google/common/collect/SortedLists$KeyAbsentBehavior, s);
        }

        public static KeyAbsentBehavior[] values()
        {
            return (KeyAbsentBehavior[])a.clone();
        }

        abstract int resultIndex(int i);

        static 
        {
            class _cls1 extends KeyAbsentBehavior
            {

                final int resultIndex(int i)
                {
                    return i - 1;
                }

                _cls1(String s, int i)
                {
                    super(s, i, null);
                }
            }

            NEXT_LOWER = new _cls1("NEXT_LOWER", 0);
            class _cls2 extends KeyAbsentBehavior
            {

                public final int resultIndex(int i)
                {
                    return i;
                }

                _cls2(String s, int i)
                {
                    super(s, i, null);
                }
            }

            NEXT_HIGHER = new _cls2("NEXT_HIGHER", 1);
            class _cls3 extends KeyAbsentBehavior
            {

                public final int resultIndex(int i)
                {
                    return ~i;
                }

                _cls3(String s, int i)
                {
                    super(s, i, null);
                }
            }

            INVERTED_INSERTION_INDEX = new _cls3("INVERTED_INSERTION_INDEX", 2);
            a = (new KeyAbsentBehavior[] {
                NEXT_LOWER, NEXT_HIGHER, INVERTED_INSERTION_INDEX
            });
        }

        private KeyAbsentBehavior(String s, int i)
        {
            super(s, i);
        }

        KeyAbsentBehavior(String s, int i, eh eh)
        {
            this(s, i);
        }
    }

}

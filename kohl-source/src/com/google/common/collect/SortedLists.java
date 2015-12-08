// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.List;

final class SortedLists
{
    static abstract class Relation extends Enum
    {

        private static final Relation $VALUES[];
        public static final Relation CEILING;
        public static final Relation EQUAL;
        public static final Relation FLOOR;
        public static final Relation HIGHER;
        public static final Relation LOWER;

        public static Relation valueOf(String s)
        {
            return (Relation)Enum.valueOf(com/google/common/collect/SortedLists$Relation, s);
        }

        public static Relation[] values()
        {
            return (Relation[])$VALUES.clone();
        }

        abstract int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag);

        abstract int exactMatchNotFound(List list, Object obj, int i, Comparator comparator);

        abstract Relation reverse();

        static 
        {
            LOWER = new Relation("LOWER", 0) {

                int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag)
                {
                    return FLOOR.exactMatchFound(list, obj, i, j, k, comparator, flag) - 1;
                }

                int exactMatchNotFound(List list, Object obj, int i, Comparator comparator)
                {
                    return i - 1;
                }

                Relation reverse()
                {
                    return HIGHER;
                }

            };
            FLOOR = new Relation("FLOOR", 1) {

                int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag)
                {
                    if (!flag)
                    {
                        return j;
                    }
                    while (i < j) 
                    {
                        k = i + (j - i) / 2;
                        if (comparator.compare(list.get(k), obj) < 0)
                        {
                            i = k + 1;
                        } else
                        {
                            j = k;
                        }
                    }
                    return i;
                }

                int exactMatchNotFound(List list, Object obj, int i, Comparator comparator)
                {
                    return i - 1;
                }

                Relation reverse()
                {
                    return CEILING;
                }

            };
            EQUAL = new Relation("EQUAL", 2) {

                int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag)
                {
                    return j;
                }

                int exactMatchNotFound(List list, Object obj, int i, Comparator comparator)
                {
                    return -1;
                }

                Relation reverse()
                {
                    return this;
                }

            };
            CEILING = new Relation("CEILING", 3) {

                int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag)
                {
                    if (!flag)
                    {
                        return j;
                    }
                    for (i = j; i < k;)
                    {
                        j = i + ((k - i) + 1) / 2;
                        if (comparator.compare(list.get(j), obj) > 0)
                        {
                            k = j - 1;
                        } else
                        {
                            i = j;
                        }
                    }

                    return i;
                }

                int exactMatchNotFound(List list, Object obj, int i, Comparator comparator)
                {
                    return i;
                }

                Relation reverse()
                {
                    return FLOOR;
                }

            };
            HIGHER = new Relation("HIGHER", 4) {

                int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag)
                {
                    return CEILING.exactMatchFound(list, obj, i, j, k, comparator, flag) + 1;
                }

                int exactMatchNotFound(List list, Object obj, int i, Comparator comparator)
                {
                    return i;
                }

                Relation reverse()
                {
                    return LOWER;
                }

            };
            $VALUES = (new Relation[] {
                LOWER, FLOOR, EQUAL, CEILING, HIGHER
            });
        }

        private Relation(String s, int i)
        {
            super(s, i);
        }

    }


    private SortedLists()
    {
    }

    static int binarySearch(List list, Object obj, Comparator comparator, Relation relation)
    {
        return binarySearch(list, obj, comparator, relation, true);
    }

    static int binarySearch(List list, Object obj, Comparator comparator, Relation relation, boolean flag)
    {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(relation);
        int j = 0;
        for (int i = list.size() - 1; j <= i;)
        {
            int k = j + (i - j) / 2;
            int l = comparator.compare(obj, list.get(k));
            if (l < 0)
            {
                i = k - 1;
            } else
            if (l > 0)
            {
                j = k + 1;
            } else
            {
                return relation.exactMatchFound(list, obj, j, k, i, comparator, flag);
            }
        }

        return relation.exactMatchNotFound(list, obj, j, comparator);
    }
}

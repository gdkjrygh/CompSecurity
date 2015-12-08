// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            SortedLists

static abstract class <init> extends Enum
{

    private static final HIGHER $VALUES[];
    public static final HIGHER CEILING;
    public static final HIGHER EQUAL;
    public static final HIGHER FLOOR;
    public static final HIGHER HIGHER;
    public static final HIGHER LOWER;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/SortedLists$Relation, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag);

    abstract int exactMatchNotFound(List list, Object obj, int i, Comparator comparator);

    abstract n_3B_.clone reverse();

    static 
    {
        LOWER = new SortedLists.Relation("LOWER", 0) {

            int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag)
            {
                return FLOOR.exactMatchFound(list, obj, i, j, k, comparator, flag) - 1;
            }

            int exactMatchNotFound(List list, Object obj, int i, Comparator comparator)
            {
                return i - 1;
            }

            SortedLists.Relation reverse()
            {
                return HIGHER;
            }

        };
        FLOOR = new SortedLists.Relation("FLOOR", 1) {

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

            SortedLists.Relation reverse()
            {
                return CEILING;
            }

        };
        EQUAL = new SortedLists.Relation("EQUAL", 2) {

            int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag)
            {
                return j;
            }

            int exactMatchNotFound(List list, Object obj, int i, Comparator comparator)
            {
                return -1;
            }

            SortedLists.Relation reverse()
            {
                return this;
            }

        };
        CEILING = new SortedLists.Relation("CEILING", 3) {

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

            SortedLists.Relation reverse()
            {
                return FLOOR;
            }

        };
        HIGHER = new SortedLists.Relation("HIGHER", 4) {

            int exactMatchFound(List list, Object obj, int i, int j, int k, Comparator comparator, boolean flag)
            {
                return CEILING.exactMatchFound(list, obj, i, j, k, comparator, flag) + 1;
            }

            int exactMatchNotFound(List list, Object obj, int i, Comparator comparator)
            {
                return i;
            }

            SortedLists.Relation reverse()
            {
                return LOWER;
            }

        };
        $VALUES = (new .VALUES[] {
            LOWER, FLOOR, EQUAL, CEILING, HIGHER
        });
    }

    private _cls5(String s, int i)
    {
        super(s, i);
    }

    _cls5(String s, int i, _cls5 _pcls5)
    {
        this(s, i);
    }
}

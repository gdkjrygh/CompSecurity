// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            eh

public abstract class <init> extends Enum
{

    public static final LAST_BEFORE ANY_PRESENT;
    public static final LAST_BEFORE FIRST_AFTER;
    public static final LAST_BEFORE FIRST_PRESENT;
    public static final LAST_BEFORE LAST_BEFORE;
    public static final LAST_BEFORE LAST_PRESENT;
    private static final LAST_BEFORE a[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/SortedLists$KeyPresentBehavior, s);
    }

    public static <init>[] values()
    {
        return (<init>[])a.clone();
    }

    abstract int resultIndex(Comparator comparator, Object obj, List list, int i);

    static 
    {
        class _cls1 extends SortedLists.KeyPresentBehavior
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
        class _cls2 extends SortedLists.KeyPresentBehavior
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
        class _cls3 extends SortedLists.KeyPresentBehavior
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
        class _cls4 extends SortedLists.KeyPresentBehavior
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
        class _cls5 extends SortedLists.KeyPresentBehavior
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
        a = (new a[] {
            ANY_PRESENT, LAST_PRESENT, FIRST_PRESENT, FIRST_AFTER, LAST_BEFORE
        });
    }

    private _cls5(String s, int i)
    {
        super(s, i);
    }

    _cls5(String s, int i, eh eh)
    {
        this(s, i);
    }
}

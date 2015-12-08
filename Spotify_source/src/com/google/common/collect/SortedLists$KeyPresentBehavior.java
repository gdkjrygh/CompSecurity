// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.List;

public abstract class <init> extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    private static e e;
    private static final e f[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/SortedLists$KeyPresentBehavior, s);
    }

    public static <init>[] values()
    {
        return (<init>[])f.clone();
    }

    abstract int a(Comparator comparator, Object obj, List list, int i);

    static 
    {
        a = new SortedLists.KeyPresentBehavior("ANY_PRESENT") {

            final int a(Comparator comparator, Object obj, List list, int i)
            {
                return i;
            }

        };
        b = new SortedLists.KeyPresentBehavior("LAST_PRESENT") {

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
        c = new SortedLists.KeyPresentBehavior("FIRST_PRESENT") {

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
        d = new SortedLists.KeyPresentBehavior("FIRST_AFTER") {

            public final int a(Comparator comparator, Object obj, List list, int i)
            {
                return b.a(comparator, obj, list, i) + 1;
            }

        };
        e = new SortedLists.KeyPresentBehavior("LAST_BEFORE") {

            public final int a(Comparator comparator, Object obj, List list, int i)
            {
                return c.a(comparator, obj, list, i) - 1;
            }

        };
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private _cls5(String s, int i)
    {
        super(s, i);
    }

    _cls5(String s, int i, byte byte0)
    {
        this(s, i);
    }
}

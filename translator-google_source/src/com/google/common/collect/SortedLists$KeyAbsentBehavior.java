// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            eh

public abstract class <init> extends Enum
{

    public static final INVERTED_INSERTION_INDEX INVERTED_INSERTION_INDEX;
    public static final INVERTED_INSERTION_INDEX NEXT_HIGHER;
    public static final INVERTED_INSERTION_INDEX NEXT_LOWER;
    private static final INVERTED_INSERTION_INDEX a[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/SortedLists$KeyAbsentBehavior, s);
    }

    public static <init>[] values()
    {
        return (<init>[])a.clone();
    }

    abstract int resultIndex(int i);

    static 
    {
        class _cls1 extends SortedLists.KeyAbsentBehavior
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
        class _cls2 extends SortedLists.KeyAbsentBehavior
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
        class _cls3 extends SortedLists.KeyAbsentBehavior
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
        a = (new a[] {
            NEXT_LOWER, NEXT_HIGHER, INVERTED_INSERTION_INDEX
        });
    }

    private _cls3(String s, int i)
    {
        super(s, i);
    }

    _cls3(String s, int i, eh eh)
    {
        this(s, i);
    }
}

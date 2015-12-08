// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.d;

// Referenced classes of package com.google.common.collect:
//            cz

abstract class <init> extends Enum
    implements d
{

    public static final VALUE KEY;
    public static final VALUE VALUE;
    private static final VALUE a[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/Maps$EntryFunction, s);
    }

    public static <init>[] values()
    {
        return (<init>[])a.clone();
    }

    static 
    {
        class _cls1 extends Maps.EntryFunction
        {

            public final volatile Object apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public final Object apply(java.util.Map.Entry entry)
            {
                return entry.getKey();
            }

            _cls1(String s, int i)
            {
                super(s, i, null);
            }
        }

        KEY = new _cls1("KEY", 0);
        class _cls2 extends Maps.EntryFunction
        {

            public final volatile Object apply(Object obj)
            {
                return apply((java.util.Map.Entry)obj);
            }

            public final Object apply(java.util.Map.Entry entry)
            {
                return entry.getValue();
            }

            _cls2(String s, int i)
            {
                super(s, i, null);
            }
        }

        VALUE = new _cls2("VALUE", 1);
        a = (new a[] {
            KEY, VALUE
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, cz cz)
    {
        this(s, i);
    }
}

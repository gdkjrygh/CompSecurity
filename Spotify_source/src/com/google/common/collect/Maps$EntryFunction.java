// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import ctv;

abstract class <init> extends Enum
    implements ctv
{

    public static final b a;
    private static b b;
    private static final b c[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/collect/Maps$EntryFunction, s);
    }

    public static <init>[] values()
    {
        return (<init>[])c.clone();
    }

    static 
    {
        a = new Maps.EntryFunction("KEY") {

            public final Object a(Object obj)
            {
                return ((java.util.Map.Entry)obj).getKey();
            }

        };
        b = new Maps.EntryFunction("VALUE") {

            public final Object a(Object obj)
            {
                return ((java.util.Map.Entry)obj).getValue();
            }

        };
        c = (new c[] {
            a, b
        });
    }

    private _cls2(String s, int i)
    {
        super(s, i);
    }

    _cls2(String s, int i, byte byte0)
    {
        this(s, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.a;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    private static final e f[];
    private final int e;

    private e(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/microsoft/a/e, s);
    }

    public static e[] values()
    {
        return (e[])f.clone();
    }

    static 
    {
        a = new e("Optional", 0, 0);
        b = new e("Required", 1, 1);
        c = new e("RequiredOptional", 2, 2);
        d = new e("__INVALID_ENUM_VALUE", 3, 3);
        f = (new e[] {
            a, b, c, d
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.process;


public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b MainProcessOnly;
    public static final b Multiple;
    public static final b Single;

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/common/process/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    static 
    {
        Multiple = new b("Multiple", 0);
        Single = new b("Single", 1);
        MainProcessOnly = new b("MainProcessOnly", 2);
        $VALUES = (new b[] {
            Multiple, Single, MainProcessOnly
        });
    }
}

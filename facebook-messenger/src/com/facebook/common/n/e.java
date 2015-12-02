// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.n;


final class e extends Enum
{

    private static final e $VALUES[];
    public static final e LONG;
    public static final e SHORT;

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(com/facebook/common/n/e, s);
    }

    public static e[] values()
    {
        return (e[])$VALUES.clone();
    }

    static 
    {
        SHORT = new e("SHORT", 0);
        LONG = new e("LONG", 1);
        $VALUES = (new e[] {
            SHORT, LONG
        });
    }
}

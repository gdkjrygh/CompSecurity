// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.bridge.constants;


public final class FilterType extends Enum
{

    private static final FilterType $VALUES[];
    public static final FilterType ASYNC;

    private FilterType(String s, int i)
    {
        super(s, i);
    }

    public static FilterType valueOf(String s)
    {
        return (FilterType)Enum.valueOf(com/facebook/tools/dextr/bridge/constants/FilterType, s);
    }

    public static FilterType[] values()
    {
        return (FilterType[])$VALUES.clone();
    }

    static 
    {
        ASYNC = new FilterType("ASYNC", 0);
        $VALUES = (new FilterType[] {
            ASYNC
        });
    }
}

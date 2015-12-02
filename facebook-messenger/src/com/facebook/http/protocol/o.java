// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;


public final class o extends Enum
{

    private static final o $VALUES[];
    public static final o MULTI_PART_ENTITY;
    public static final o SINGLE_STRING_ENTITY;

    private o(String s, int i)
    {
        super(s, i);
    }

    public static o valueOf(String s)
    {
        return (o)Enum.valueOf(com/facebook/http/protocol/o, s);
    }

    public static o[] values()
    {
        return (o[])$VALUES.clone();
    }

    static 
    {
        MULTI_PART_ENTITY = new o("MULTI_PART_ENTITY", 0);
        SINGLE_STRING_ENTITY = new o("SINGLE_STRING_ENTITY", 1);
        $VALUES = (new o[] {
            MULTI_PART_ENTITY, SINGLE_STRING_ENTITY
        });
    }
}

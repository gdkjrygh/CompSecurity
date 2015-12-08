// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;


final class EnumExceptionType extends Enum
{

    private static final EnumExceptionType $VALUES[];
    public static final EnumExceptionType HANDLED;
    public static final EnumExceptionType UNHANDLED;

    private EnumExceptionType(String s, int i)
    {
        super(s, i);
    }

    public static EnumExceptionType valueOf(String s)
    {
        return (EnumExceptionType)Enum.valueOf(com/splunk/mint/EnumExceptionType, s);
    }

    public static EnumExceptionType[] values()
    {
        return (EnumExceptionType[])$VALUES.clone();
    }

    static 
    {
        HANDLED = new EnumExceptionType("HANDLED", 0);
        UNHANDLED = new EnumExceptionType("UNHANDLED", 1);
        $VALUES = (new EnumExceptionType[] {
            HANDLED, UNHANDLED
        });
    }
}

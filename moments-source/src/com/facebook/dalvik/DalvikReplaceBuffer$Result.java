// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.dalvik;


public final class  extends Enum
{

    private static final SUCCESS $VALUES[];
    public static final SUCCESS FAILURE;
    public static final SUCCESS NOT_ATTEMPTED;
    public static final SUCCESS SUCCESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/facebook/dalvik/DalvikReplaceBuffer$Result, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NOT_ATTEMPTED = new <init>("NOT_ATTEMPTED", 0);
        FAILURE = new <init>("FAILURE", 1);
        SUCCESS = new <init>("SUCCESS", 2);
        $VALUES = (new .VALUES[] {
            NOT_ATTEMPTED, FAILURE, SUCCESS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

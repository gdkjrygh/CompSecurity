// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.event;


public final class  extends Enum
{

    private static final Close $VALUES[];
    public static final Close Close;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/activity/commerce/event/SecureDialogActivityEvent$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        Close = new <init>("Close", 0);
        $VALUES = (new .VALUES[] {
            Close
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

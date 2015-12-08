// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;


public final class  extends Enum
{

    private static final GOOGLE $VALUES[];
    public static final GOOGLE APPLE;
    public static final GOOGLE GOOGLE;
    public static final GOOGLE PINTEREST;
    public static final GOOGLE UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/model/commerce/Cart$WalletType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        PINTEREST = new <init>("PINTEREST", 1);
        APPLE = new <init>("APPLE", 2);
        GOOGLE = new <init>("GOOGLE", 3);
        $VALUES = (new .VALUES[] {
            UNKNOWN, PINTEREST, APPLE, GOOGLE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.dialog.agent;


public final class  extends Enum
{

    private static final COUPONREMOVED $VALUES[];
    public static final COUPONREMOVED COUPONADDED;
    public static final COUPONREMOVED COUPONREMOVED;
    public static final COUPONREMOVED ORDER;
    public static final COUPONREMOVED PRODUCT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/nina/dialog/agent/CartConfirmAgent$Mention, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PRODUCT = new <init>("PRODUCT", 0);
        ORDER = new <init>("ORDER", 1);
        COUPONADDED = new <init>("COUPONADDED", 2);
        COUPONREMOVED = new <init>("COUPONREMOVED", 3);
        $VALUES = (new .VALUES[] {
            PRODUCT, ORDER, COUPONADDED, COUPONREMOVED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

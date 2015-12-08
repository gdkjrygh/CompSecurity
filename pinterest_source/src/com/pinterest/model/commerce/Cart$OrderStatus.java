// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.model.commerce;


public final class  extends Enum
{

    private static final RETURNED $VALUES[];
    public static final RETURNED BACKORDER;
    public static final RETURNED CANCELLED;
    public static final RETURNED DELIVERED;
    public static final RETURNED IN_PROGRESS;
    public static final RETURNED NEW;
    public static final RETURNED RETURNED;
    public static final RETURNED SHIPPED;
    public static final RETURNED UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pinterest/model/commerce/Cart$OrderStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        UNKNOWN = new <init>("UNKNOWN", 0);
        NEW = new <init>("NEW", 1);
        IN_PROGRESS = new <init>("IN_PROGRESS", 2);
        SHIPPED = new <init>("SHIPPED", 3);
        BACKORDER = new <init>("BACKORDER", 4);
        CANCELLED = new <init>("CANCELLED", 5);
        DELIVERED = new <init>("DELIVERED", 6);
        RETURNED = new <init>("RETURNED", 7);
        $VALUES = (new .VALUES[] {
            UNKNOWN, NEW, IN_PROGRESS, SHIPPED, BACKORDER, CANCELLED, DELIVERED, RETURNED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

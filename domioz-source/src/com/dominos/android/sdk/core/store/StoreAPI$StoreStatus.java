// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.store;


public final class  extends Enum
{

    private static final NOT_FOUND $VALUES[];
    public static final NOT_FOUND AVAILABLE;
    public static final NOT_FOUND CARRYOUT_NOT_AVAILABLE;
    public static final NOT_FOUND CLOSED;
    public static final NOT_FOUND DELIVERY_NOT_AVAILABLE;
    public static final NOT_FOUND NOT_FOUND;
    public static final NOT_FOUND OFFLINE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/android/sdk/core/store/StoreAPI$StoreStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        AVAILABLE = new <init>("AVAILABLE", 0);
        CLOSED = new <init>("CLOSED", 1);
        OFFLINE = new <init>("OFFLINE", 2);
        DELIVERY_NOT_AVAILABLE = new <init>("DELIVERY_NOT_AVAILABLE", 3);
        CARRYOUT_NOT_AVAILABLE = new <init>("CARRYOUT_NOT_AVAILABLE", 4);
        NOT_FOUND = new <init>("NOT_FOUND", 5);
        $VALUES = (new .VALUES[] {
            AVAILABLE, CLOSED, OFFLINE, DELIVERY_NOT_AVAILABLE, CARRYOUT_NOT_AVAILABLE, NOT_FOUND
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

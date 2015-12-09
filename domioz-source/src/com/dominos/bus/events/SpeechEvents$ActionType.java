// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.bus.events;


public final class  extends Enum
{

    private static final SELECT_SAVED_LOCATION $VALUES[];
    public static final SELECT_SAVED_LOCATION CARRYOUT;
    public static final SELECT_SAVED_LOCATION CARRYOUT_LOAD_GUARD_FOCUSED;
    public static final SELECT_SAVED_LOCATION DELIVERY;
    public static final SELECT_SAVED_LOCATION NEW_ORDER;
    public static final SELECT_SAVED_LOCATION SELECT_ADDRESS;
    public static final SELECT_SAVED_LOCATION SELECT_SAVED_LOCATION;
    public static final SELECT_SAVED_LOCATION SELECT_STORE;
    public static final SELECT_SAVED_LOCATION SHOW_SAVED_ADDRESS;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/bus/events/SpeechEvents$ActionType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NEW_ORDER = new <init>("NEW_ORDER", 0);
        CARRYOUT = new <init>("CARRYOUT", 1);
        DELIVERY = new <init>("DELIVERY", 2);
        SELECT_STORE = new <init>("SELECT_STORE", 3);
        CARRYOUT_LOAD_GUARD_FOCUSED = new <init>("CARRYOUT_LOAD_GUARD_FOCUSED", 4);
        SELECT_ADDRESS = new <init>("SELECT_ADDRESS", 5);
        SHOW_SAVED_ADDRESS = new <init>("SHOW_SAVED_ADDRESS", 6);
        SELECT_SAVED_LOCATION = new <init>("SELECT_SAVED_LOCATION", 7);
        $VALUES = (new .VALUES[] {
            NEW_ORDER, CARRYOUT, DELIVERY, SELECT_STORE, CARRYOUT_LOAD_GUARD_FOCUSED, SELECT_ADDRESS, SHOW_SAVED_ADDRESS, SELECT_SAVED_LOCATION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

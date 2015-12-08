// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.tracker;

import com.google.a.b.av;
import com.google.a.b.aw;
import org.a.a.a.i;

public final class OrderStatus extends Enum
{

    private static final OrderStatus $VALUES[];
    public static final OrderStatus BEING_MADE;
    public static final OrderStatus CANCELLED;
    public static final OrderStatus COMPLETE;
    public static final OrderStatus FUTURE;
    public static final OrderStatus IN_THE_OVEN;
    public static final OrderStatus ON_THE_RACK;
    public static final OrderStatus OUT_THE_DOOR;
    public static final OrderStatus UNKNOWN;
    public static final OrderStatus WAITING;
    private static final av lookup;

    private OrderStatus(String s, int j)
    {
        super(s, j);
    }

    public static OrderStatus fromString(String s)
    {
        return (OrderStatus)i.a(lookup.get(s), UNKNOWN);
    }

    public static OrderStatus valueOf(String s)
    {
        return (OrderStatus)Enum.valueOf(com/dominos/android/sdk/common/dom/tracker/OrderStatus, s);
    }

    public static OrderStatus[] values()
    {
        return (OrderStatus[])$VALUES.clone();
    }

    static 
    {
        BEING_MADE = new OrderStatus("BEING_MADE", 0);
        CANCELLED = new OrderStatus("CANCELLED", 1);
        COMPLETE = new OrderStatus("COMPLETE", 2);
        FUTURE = new OrderStatus("FUTURE", 3);
        IN_THE_OVEN = new OrderStatus("IN_THE_OVEN", 4);
        ON_THE_RACK = new OrderStatus("ON_THE_RACK", 5);
        OUT_THE_DOOR = new OrderStatus("OUT_THE_DOOR", 6);
        UNKNOWN = new OrderStatus("UNKNOWN", 7);
        WAITING = new OrderStatus("WAITING", 8);
        $VALUES = (new OrderStatus[] {
            BEING_MADE, CANCELLED, COMPLETE, FUTURE, IN_THE_OVEN, ON_THE_RACK, OUT_THE_DOOR, UNKNOWN, WAITING
        });
        lookup = av.h().a("In Progress", WAITING).a("Makeline", BEING_MADE).a("Routing Station", ON_THE_RACK).a("Oven", IN_THE_OVEN).a("Out the Door", OUT_THE_DOOR).a("Complete", COMPLETE).a("Gift", COMPLETE).a("Bad", CANCELLED).a("Void", CANCELLED).a("Being Taken", WAITING).a("Abandoned", CANCELLED).a("Suspended", WAITING).a("Gift Card Purchase", WAITING).a("Gift Card Void", CANCELLED).a("Historic Order", COMPLETE).a("Being Assigned", ON_THE_RACK).a("Future", FUTURE).a();
    }
}

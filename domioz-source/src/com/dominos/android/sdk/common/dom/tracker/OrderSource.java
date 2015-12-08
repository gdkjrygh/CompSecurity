// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.tracker;

import com.google.a.b.av;
import com.google.a.b.aw;
import org.a.a.a.i;

public final class OrderSource extends Enum
{

    private static final OrderSource $VALUES[];
    public static final OrderSource PHONE;
    public static final OrderSource UNKNOWN;
    public static final OrderSource WALKIN;
    public static final OrderSource WEB;
    private static final av lookup;

    private OrderSource(String s, int j)
    {
        super(s, j);
    }

    public static OrderSource fromString(String s)
    {
        return (OrderSource)i.a(lookup.get(s), UNKNOWN);
    }

    public static OrderSource valueOf(String s)
    {
        return (OrderSource)Enum.valueOf(com/dominos/android/sdk/common/dom/tracker/OrderSource, s);
    }

    public static OrderSource[] values()
    {
        return (OrderSource[])$VALUES.clone();
    }

    static 
    {
        PHONE = new OrderSource("PHONE", 0);
        WEB = new OrderSource("WEB", 1);
        WALKIN = new OrderSource("WALKIN", 2);
        UNKNOWN = new OrderSource("UNKNOWN", 3);
        $VALUES = (new OrderSource[] {
            PHONE, WEB, WALKIN, UNKNOWN
        });
        lookup = av.h().a("Phone", PHONE).a("Web", WEB).a("WalkIn", WALKIN).a();
    }
}

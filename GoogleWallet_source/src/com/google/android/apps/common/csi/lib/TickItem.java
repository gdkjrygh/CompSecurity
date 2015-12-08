// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.csi.lib;


public final class TickItem
{

    private Long customerValue;
    private final String event;
    private final TickItem labelItem;
    private Long time;

    public TickItem(long l, String s)
    {
        customerValue = Long.valueOf(l);
        event = s;
        labelItem = null;
        time = null;
    }

    public TickItem(long l, String s, TickItem tickitem)
    {
        time = Long.valueOf(l);
        event = s;
        labelItem = tickitem;
    }

    public final Long getCustomerValue()
    {
        return customerValue;
    }

    public final String getEvent()
    {
        return event;
    }

    public final TickItem getLabelItem()
    {
        return labelItem;
    }

    public final Long getTime()
    {
        return time;
    }
}

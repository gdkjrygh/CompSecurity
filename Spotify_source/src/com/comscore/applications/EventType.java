// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.applications;

import java.util.Locale;

public final class EventType extends Enum
{

    public static final EventType a;
    public static final EventType b;
    public static final EventType c;
    public static final EventType d;
    public static final EventType e;
    public static final EventType f;
    private static final EventType g[];

    private EventType(String s, int i)
    {
        super(s, i);
    }

    public static EventType valueOf(String s)
    {
        return (EventType)Enum.valueOf(com/comscore/applications/EventType, s);
    }

    public static EventType[] values()
    {
        return (EventType[])g.clone();
    }

    public final String toString()
    {
        if (this == f)
        {
            return "keep-alive";
        } else
        {
            return super.toString().toLowerCase(new Locale("en", "US"));
        }
    }

    static 
    {
        a = new EventType("START", 0);
        b = new EventType("VIEW", 1);
        c = new EventType("CLOSE", 2);
        d = new EventType("AGGREGATE", 3);
        e = new EventType("HIDDEN", 4);
        f = new EventType("KEEPALIVE", 5);
        g = (new EventType[] {
            a, b, c, d, e, f
        });
    }
}

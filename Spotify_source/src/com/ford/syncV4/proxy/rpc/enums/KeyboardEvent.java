// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class KeyboardEvent extends Enum
{

    private static KeyboardEvent a;
    private static KeyboardEvent b;
    private static KeyboardEvent c;
    private static KeyboardEvent d;
    private static final KeyboardEvent e[];

    private KeyboardEvent(String s, int i)
    {
        super(s, i);
    }

    public static KeyboardEvent a(String s)
    {
        return valueOf(s);
    }

    public static KeyboardEvent valueOf(String s)
    {
        return (KeyboardEvent)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/KeyboardEvent, s);
    }

    public static KeyboardEvent[] values()
    {
        return (KeyboardEvent[])e.clone();
    }

    static 
    {
        a = new KeyboardEvent("KEYPRESS", 0);
        b = new KeyboardEvent("ENTRY_SUBMITTED", 1);
        c = new KeyboardEvent("ENTRY_CANCELLED", 2);
        d = new KeyboardEvent("ENTRY_ABORTED", 3);
        e = (new KeyboardEvent[] {
            a, b, c, d
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.trace.enums;


public final class InterfaceActivityDirection extends Enum
{

    public static final InterfaceActivityDirection a;
    public static final InterfaceActivityDirection b;
    public static final InterfaceActivityDirection c;
    private static final InterfaceActivityDirection d[];

    private InterfaceActivityDirection(String s, int i)
    {
        super(s, i);
    }

    public static InterfaceActivityDirection valueOf(String s)
    {
        return (InterfaceActivityDirection)Enum.valueOf(com/ford/syncV4/trace/enums/InterfaceActivityDirection, s);
    }

    public static InterfaceActivityDirection[] values()
    {
        return (InterfaceActivityDirection[])d.clone();
    }

    static 
    {
        a = new InterfaceActivityDirection("Transmit", 0);
        b = new InterfaceActivityDirection("Receive", 1);
        c = new InterfaceActivityDirection("None", 2);
        d = (new InterfaceActivityDirection[] {
            a, b, c
        });
    }
}

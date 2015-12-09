// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;

import java.util.EnumSet;
import java.util.Iterator;

public final class TriggerSource extends Enum
{

    public static final TriggerSource a;
    private static TriggerSource b;
    private static TriggerSource c;
    private static final TriggerSource d[];
    String internalName;

    private TriggerSource(String s, int i, String s1)
    {
        super(s, i);
        internalName = s1;
    }

    public static TriggerSource a(String s)
    {
        for (Iterator iterator = EnumSet.allOf(com/ford/syncV4/proxy/rpc/enums/TriggerSource).iterator(); iterator.hasNext();)
        {
            TriggerSource triggersource = (TriggerSource)iterator.next();
            if (triggersource.toString().equals(s))
            {
                return triggersource;
            }
        }

        return null;
    }

    public static TriggerSource valueOf(String s)
    {
        return (TriggerSource)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/TriggerSource, s);
    }

    public static TriggerSource[] values()
    {
        return (TriggerSource[])d.clone();
    }

    public final String toString()
    {
        return internalName;
    }

    static 
    {
        b = new TriggerSource("TS_MENU", 0, "MENU");
        a = new TriggerSource("TS_VR", 1, "VR");
        c = new TriggerSource("TS_KEYBOARD", 2, "KEYBOARD");
        d = (new TriggerSource[] {
            b, a, c
        });
    }
}

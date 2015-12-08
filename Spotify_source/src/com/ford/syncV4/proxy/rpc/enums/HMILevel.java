// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;

import java.util.EnumSet;
import java.util.Iterator;

public final class HMILevel extends Enum
{

    public static final HMILevel a;
    public static final HMILevel b;
    public static final HMILevel c;
    public static final HMILevel d;
    private static final HMILevel e[];
    String internalName;

    private HMILevel(String s, int i, String s1)
    {
        super(s, i);
        internalName = s1;
    }

    public static HMILevel a(String s)
    {
        for (Iterator iterator = EnumSet.allOf(com/ford/syncV4/proxy/rpc/enums/HMILevel).iterator(); iterator.hasNext();)
        {
            HMILevel hmilevel = (HMILevel)iterator.next();
            if (hmilevel.toString().equals(s))
            {
                return hmilevel;
            }
        }

        return null;
    }

    public static HMILevel valueOf(String s)
    {
        return (HMILevel)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/HMILevel, s);
    }

    public static HMILevel[] values()
    {
        return (HMILevel[])e.clone();
    }

    public final String toString()
    {
        return internalName;
    }

    static 
    {
        a = new HMILevel("HMI_FULL", 0, "FULL");
        b = new HMILevel("HMI_LIMITED", 1, "LIMITED");
        c = new HMILevel("HMI_BACKGROUND", 2, "BACKGROUND");
        d = new HMILevel("HMI_NONE", 3, "NONE");
        e = (new HMILevel[] {
            a, b, c, d
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;

import java.util.EnumSet;
import java.util.Iterator;

public final class SystemContext extends Enum
{

    public static final SystemContext a;
    public static final SystemContext b;
    public static final SystemContext c;
    public static final SystemContext d;
    public static final SystemContext e;
    private static final SystemContext f[];
    String internalName;

    private SystemContext(String s, int i, String s1)
    {
        super(s, i);
        internalName = s1;
    }

    public static SystemContext a(String s)
    {
        for (Iterator iterator = EnumSet.allOf(com/ford/syncV4/proxy/rpc/enums/SystemContext).iterator(); iterator.hasNext();)
        {
            SystemContext systemcontext = (SystemContext)iterator.next();
            if (systemcontext.toString().equals(s))
            {
                return systemcontext;
            }
        }

        return null;
    }

    public static SystemContext valueOf(String s)
    {
        return (SystemContext)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/SystemContext, s);
    }

    public static SystemContext[] values()
    {
        return (SystemContext[])f.clone();
    }

    public final String toString()
    {
        return internalName;
    }

    static 
    {
        a = new SystemContext("SYSCTXT_MAIN", 0, "MAIN");
        b = new SystemContext("SYSCTXT_VRSESSION", 1, "VRSESSION");
        c = new SystemContext("SYSCTXT_MENU", 2, "MENU");
        d = new SystemContext("SYSCTXT_HMI_OBSCURED", 3, "HMI_OBSCURED");
        e = new SystemContext("SYSCTXT_ALERT", 4, "ALERT");
        f = (new SystemContext[] {
            a, b, c, d, e
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.model;

import java.io.Serializable;

public final class ReachabilityType extends Enum
    implements Serializable
{

    private static final ReachabilityType $VALUES[];
    public static final ReachabilityType NotReachable;
    public static final ReachabilityType ReachableViaWIFI;
    public static final ReachabilityType ReachableViaWWAN;
    public static final ReachabilityType Unknown;
    private int value;

    private ReachabilityType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static ReachabilityType valueOf(String s)
    {
        return (ReachabilityType)Enum.valueOf(com/ibm/eo/model/ReachabilityType, s);
    }

    public static ReachabilityType[] values()
    {
        return (ReachabilityType[])$VALUES.clone();
    }

    public int getValue()
    {
        return value;
    }

    static 
    {
        Unknown = new ReachabilityType("Unknown", 0, 0);
        NotReachable = new ReachabilityType("NotReachable", 1, 1);
        ReachableViaWIFI = new ReachabilityType("ReachableViaWIFI", 2, 2);
        ReachableViaWWAN = new ReachabilityType("ReachableViaWWAN", 3, 3);
        $VALUES = (new ReachabilityType[] {
            Unknown, NotReachable, ReachableViaWIFI, ReachableViaWWAN
        });
    }
}

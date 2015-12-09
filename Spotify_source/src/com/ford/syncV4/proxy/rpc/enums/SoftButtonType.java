// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class SoftButtonType extends Enum
{

    public static final SoftButtonType a;
    public static final SoftButtonType b;
    private static SoftButtonType c;
    private static final SoftButtonType d[];
    String internalName;

    private SoftButtonType(String s, int i, String s1)
    {
        super(s, i);
        internalName = s1;
    }

    public static SoftButtonType valueOf(String s)
    {
        return (SoftButtonType)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/SoftButtonType, s);
    }

    public static SoftButtonType[] values()
    {
        return (SoftButtonType[])d.clone();
    }

    public final String toString()
    {
        return internalName;
    }

    static 
    {
        a = new SoftButtonType("SBT_TEXT", 0, "TEXT");
        b = new SoftButtonType("SBT_IMAGE", 1, "IMAGE");
        c = new SoftButtonType("SBT_BOTH", 2, "BOTH");
        d = (new SoftButtonType[] {
            a, b, c
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui.controller;


public final class SynclairType extends Enum
{

    public static final SynclairType a;
    public static final SynclairType b;
    private static final SynclairType c[];

    private SynclairType(String s, int i)
    {
        super(s, i);
    }

    public static SynclairType valueOf(String s)
    {
        return (SynclairType)Enum.valueOf(com/fitbit/synclair/ui/controller/SynclairType, s);
    }

    public static SynclairType[] values()
    {
        return (SynclairType[])c.clone();
    }

    static 
    {
        a = new SynclairType("PAIRING", 0);
        b = new SynclairType("UPDATE", 1);
        c = (new SynclairType[] {
            a, b
        });
    }
}

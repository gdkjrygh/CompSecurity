// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class HmiZoneCapabilities extends Enum
{

    private static HmiZoneCapabilities a;
    private static HmiZoneCapabilities b;
    private static final HmiZoneCapabilities c[];

    private HmiZoneCapabilities(String s, int i)
    {
        super(s, i);
    }

    public static HmiZoneCapabilities a(String s)
    {
        return valueOf(s);
    }

    public static HmiZoneCapabilities valueOf(String s)
    {
        return (HmiZoneCapabilities)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/HmiZoneCapabilities, s);
    }

    public static HmiZoneCapabilities[] values()
    {
        return (HmiZoneCapabilities[])c.clone();
    }

    static 
    {
        a = new HmiZoneCapabilities("FRONT", 0);
        b = new HmiZoneCapabilities("BACK", 1);
        c = (new HmiZoneCapabilities[] {
            a, b
        });
    }
}

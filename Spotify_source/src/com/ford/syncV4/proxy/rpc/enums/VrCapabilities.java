// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.proxy.rpc.enums;


public final class VrCapabilities extends Enum
{

    private static VrCapabilities a;
    private static final VrCapabilities b[];

    private VrCapabilities(String s)
    {
        super(s, 0);
    }

    public static VrCapabilities a(String s)
    {
        if (s.toUpperCase().equals(a.toString().toUpperCase()))
        {
            return a;
        } else
        {
            return null;
        }
    }

    public static VrCapabilities valueOf(String s)
    {
        return (VrCapabilities)Enum.valueOf(com/ford/syncV4/proxy/rpc/enums/VrCapabilities, s);
    }

    public static VrCapabilities[] values()
    {
        return (VrCapabilities[])b.clone();
    }

    static 
    {
        a = new VrCapabilities("Text");
        b = (new VrCapabilities[] {
            a
        });
    }
}

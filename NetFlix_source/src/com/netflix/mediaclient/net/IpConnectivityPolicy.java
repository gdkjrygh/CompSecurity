// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.net;


public final class IpConnectivityPolicy extends Enum
{

    private static final IpConnectivityPolicy $VALUES[];
    public static final IpConnectivityPolicy IP_V4_ONLY;
    public static final IpConnectivityPolicy IP_V4_V6;
    public static final IpConnectivityPolicy IP_V6_ONLY;
    public static final IpConnectivityPolicy IP_V6_V4;
    private int mValue;

    private IpConnectivityPolicy(String s, int i, int j)
    {
        super(s, i);
        mValue = j;
    }

    public static IpConnectivityPolicy from(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return IP_V4_ONLY;

        case 1: // '\001'
            return IP_V6_ONLY;

        case 2: // '\002'
            return IP_V4_V6;

        case 3: // '\003'
            return IP_V6_V4;
        }
    }

    public static IpConnectivityPolicy valueOf(String s)
    {
        return (IpConnectivityPolicy)Enum.valueOf(com/netflix/mediaclient/net/IpConnectivityPolicy, s);
    }

    public static IpConnectivityPolicy[] values()
    {
        return (IpConnectivityPolicy[])$VALUES.clone();
    }

    public int getValue()
    {
        return mValue;
    }

    static 
    {
        IP_V4_ONLY = new IpConnectivityPolicy("IP_V4_ONLY", 0, 0);
        IP_V6_ONLY = new IpConnectivityPolicy("IP_V6_ONLY", 1, 1);
        IP_V4_V6 = new IpConnectivityPolicy("IP_V4_V6", 2, 2);
        IP_V6_V4 = new IpConnectivityPolicy("IP_V6_V4", 3, 3);
        $VALUES = (new IpConnectivityPolicy[] {
            IP_V4_ONLY, IP_V6_ONLY, IP_V4_V6, IP_V6_V4
        });
    }
}

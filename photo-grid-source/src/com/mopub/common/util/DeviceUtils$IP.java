// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import org.apache.http.conn.util.InetAddressUtils;

// Referenced classes of package com.mopub.common.util:
//            a

public final class Utils extends Enum
{

    public static final IPv6 IPv4;
    public static final IPv6 IPv6;
    private static final IPv6 a[];

    static boolean a(Utils utils, String s)
    {
        switch (a.a[utils.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            return InetAddressUtils.isIPv4Address(s);

        case 2: // '\002'
            return InetAddressUtils.isIPv6Address(s);
        }
    }

    static String b(Utils.isIPv6Address isipv6address, String s)
    {
        String s1 = s;
        switch (a.a[isipv6address.ordinal()])
        {
        default:
            s1 = null;
            // fall through

        case 1: // '\001'
            return s1;

        case 2: // '\002'
            return s.split("%")[0];
        }
    }

    public static ordinal valueOf(String s)
    {
        return (ordinal)Enum.valueOf(com/mopub/common/util/DeviceUtils$IP, s);
    }

    public static ordinal[] values()
    {
        return (ordinal[])a.clone();
    }

    static 
    {
        IPv4 = new <init>("IPv4", 0);
        IPv6 = new <init>("IPv6", 1);
        a = (new a[] {
            IPv4, IPv6
        });
    }

    private Utils(String s, int i)
    {
        super(s, i);
    }
}

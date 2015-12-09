// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.net;


public final class NetworkType extends Enum
{

    private static final NetworkType $VALUES[];
    public static final NetworkType CDMA;
    public static final NetworkType EDGE;
    public static final NetworkType EHRPD;
    public static final NetworkType EVDO_0;
    public static final NetworkType EVDO_A;
    public static final NetworkType EVDO_B;
    public static final NetworkType GPRS;
    public static final NetworkType HSDPA;
    public static final NetworkType HSPA;
    public static final NetworkType HSUPA;
    public static final NetworkType IDEN;
    public static final NetworkType LTE;
    public static final NetworkType NONE;
    public static final NetworkType UMTS;
    public static final NetworkType UNKNOWN;
    public static final NetworkType _1xRTT;
    private String desc;
    private int type;

    private NetworkType(String s, int i, int j, String s1)
    {
        super(s, i);
        type = j;
        desc = s1;
    }

    public static NetworkType getNetworkType(int i)
    {
        for (int j = 0; j < values().length; j++)
        {
            if (values()[j].type == i)
            {
                return values()[j];
            }
        }

        return NONE;
    }

    public static boolean is2G(NetworkType networktype)
    {
        return EDGE.equals(networktype) || IDEN.equals(networktype) || CDMA.equals(networktype) || GPRS.equals(networktype);
    }

    public static boolean is3G(NetworkType networktype)
    {
        return UMTS.equals(networktype) || HSDPA.equals(networktype) || HSPA.equals(networktype) || EVDO_0.equals(networktype) || EVDO_A.equals(networktype) || EVDO_B.equals(networktype) || _1xRTT.equals(networktype) || HSUPA.equals(networktype) || EHRPD.equals(networktype);
    }

    public static boolean is4G(NetworkType networktype)
    {
        return LTE.equals(networktype);
    }

    public static NetworkType valueOf(String s)
    {
        return (NetworkType)Enum.valueOf(com/netflix/mediaclient/net/NetworkType, s);
    }

    public static NetworkType[] values()
    {
        return (NetworkType[])$VALUES.clone();
    }

    public final String getDesc()
    {
        return desc;
    }

    public final int getType()
    {
        return type;
    }

    static 
    {
        NONE = new NetworkType("NONE", 0, 0x80000000, "NONE");
        UNKNOWN = new NetworkType("UNKNOWN", 1, 0, "UNKNOWN");
        EDGE = new NetworkType("EDGE", 2, 2, "EDGE");
        UMTS = new NetworkType("UMTS", 3, 3, "UMTS");
        CDMA = new NetworkType("CDMA", 4, 4, "CDMA");
        EVDO_0 = new NetworkType("EVDO_0", 5, 5, "EVDO_0");
        EVDO_A = new NetworkType("EVDO_A", 6, 6, "EVDO_A");
        _1xRTT = new NetworkType("_1xRTT", 7, 7, "1xRTT");
        HSDPA = new NetworkType("HSDPA", 8, 8, "HSDPA");
        HSUPA = new NetworkType("HSUPA", 9, 9, "HSUPA");
        HSPA = new NetworkType("HSPA", 10, 10, "  HSPA");
        IDEN = new NetworkType("IDEN", 11, 11, "IDEN");
        EVDO_B = new NetworkType("EVDO_B", 12, 12, "EVDO_B");
        LTE = new NetworkType("LTE", 13, 13, "LTE");
        EHRPD = new NetworkType("EHRPD", 14, 14, "EHRPD");
        GPRS = new NetworkType("GPRS", 15, 1, "GPRS");
        $VALUES = (new NetworkType[] {
            NONE, UNKNOWN, EDGE, UMTS, CDMA, EVDO_0, EVDO_A, _1xRTT, HSDPA, HSUPA, 
            HSPA, IDEN, EVDO_B, LTE, EHRPD, GPRS
        });
    }
}

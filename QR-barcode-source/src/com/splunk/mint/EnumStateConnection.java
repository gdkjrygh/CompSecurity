// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;


final class EnumStateConnection extends Enum
{

    private static final EnumStateConnection $VALUES[];
    public static final EnumStateConnection NA;
    public static final EnumStateConnection NONE;
    public static final EnumStateConnection WiFi;
    public static final EnumStateConnection net_2G;
    public static final EnumStateConnection net_3G;

    private EnumStateConnection(String s, int i)
    {
        super(s, i);
    }

    public static EnumStateConnection valueOf(String s)
    {
        return (EnumStateConnection)Enum.valueOf(com/splunk/mint/EnumStateConnection, s);
    }

    public static EnumStateConnection[] values()
    {
        return (EnumStateConnection[])$VALUES.clone();
    }

    static 
    {
        WiFi = new EnumStateConnection("WiFi", 0);
        net_3G = new EnumStateConnection("net_3G", 1);
        net_2G = new EnumStateConnection("net_2G", 2);
        NONE = new EnumStateConnection("NONE", 3);
        NA = new EnumStateConnection("NA", 4);
        $VALUES = (new EnumStateConnection[] {
            WiFi, net_3G, net_2G, NONE, NA
        });
    }
}

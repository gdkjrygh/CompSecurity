// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;


final class EnumActionType extends Enum
{

    private static final EnumActionType $VALUES[];
    public static final EnumActionType error;
    public static final EnumActionType event;
    public static final EnumActionType gnip;
    public static final EnumActionType log;
    public static final EnumActionType network;
    public static final EnumActionType performance;
    public static final EnumActionType ping;
    public static final EnumActionType trstart;
    public static final EnumActionType trstop;
    public static final EnumActionType view;

    private EnumActionType(String s, int i)
    {
        super(s, i);
    }

    public static EnumActionType valueOf(String s)
    {
        return (EnumActionType)Enum.valueOf(com/splunk/mint/EnumActionType, s);
    }

    public static EnumActionType[] values()
    {
        return (EnumActionType[])$VALUES.clone();
    }

    static 
    {
        error = new EnumActionType("error", 0);
        event = new EnumActionType("event", 1);
        ping = new EnumActionType("ping", 2);
        gnip = new EnumActionType("gnip", 3);
        trstart = new EnumActionType("trstart", 4);
        trstop = new EnumActionType("trstop", 5);
        network = new EnumActionType("network", 6);
        performance = new EnumActionType("performance", 7);
        view = new EnumActionType("view", 8);
        log = new EnumActionType("log", 9);
        $VALUES = (new EnumActionType[] {
            error, event, ping, gnip, trstart, trstop, network, performance, view, log
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push;


public final class g extends Enum
{

    private static final g $VALUES[];
    public static final g C2DM;
    public static final g C2DM_OVER_MQTT;
    public static final g INTEGRATION_TEST;
    public static final g MMS;
    public static final g MQTT;
    public static final g SMS;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/push/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        C2DM = new g("C2DM", 0);
        MQTT = new g("MQTT", 1);
        C2DM_OVER_MQTT = new g("C2DM_OVER_MQTT", 2);
        SMS = new g("SMS", 3);
        MMS = new g("MMS", 4);
        INTEGRATION_TEST = new g("INTEGRATION_TEST", 5);
        $VALUES = (new g[] {
            C2DM, MQTT, C2DM_OVER_MQTT, SMS, MMS, INTEGRATION_TEST
        });
    }
}

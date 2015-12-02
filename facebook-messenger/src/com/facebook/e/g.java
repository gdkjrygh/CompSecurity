// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e;


final class g extends Enum
{

    private static final g $VALUES[];
    public static final g WIFI_OFF;
    public static final g WIFI_ON;
    public static final g WIFI_UNKNOWN;

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(com/facebook/e/g, s);
    }

    public static g[] values()
    {
        return (g[])$VALUES.clone();
    }

    static 
    {
        WIFI_ON = new g("WIFI_ON", 0);
        WIFI_OFF = new g("WIFI_OFF", 1);
        WIFI_UNKNOWN = new g("WIFI_UNKNOWN", 2);
        $VALUES = (new g[] {
            WIFI_ON, WIFI_OFF, WIFI_UNKNOWN
        });
    }
}

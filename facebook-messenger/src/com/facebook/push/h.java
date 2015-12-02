// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push;


public final class h extends Enum
{

    private static final h $VALUES[];
    public static final h C2DM;
    public static final h MQTT;

    private h(String s, int i)
    {
        super(s, i);
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/facebook/push/h, s);
    }

    public static h[] values()
    {
        return (h[])$VALUES.clone();
    }

    static 
    {
        C2DM = new h("C2DM", 0);
        MQTT = new h("MQTT", 1);
        $VALUES = (new h[] {
            C2DM, MQTT
        });
    }
}

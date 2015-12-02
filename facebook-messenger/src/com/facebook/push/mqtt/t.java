// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


public final class t extends Enum
{

    private static final t $VALUES[];
    public static final t BACKGROUND_LOCATION;
    public static final t UNUSED;
    public static final t VOIP;

    private t(String s, int i)
    {
        super(s, i);
    }

    public static t valueOf(String s)
    {
        return (t)Enum.valueOf(com/facebook/push/mqtt/t, s);
    }

    public static t[] values()
    {
        return (t[])$VALUES.clone();
    }

    static 
    {
        UNUSED = new t("UNUSED", 0);
        VOIP = new t("VOIP", 1);
        BACKGROUND_LOCATION = new t("BACKGROUND_LOCATION", 2);
        $VALUES = (new t[] {
            UNUSED, VOIP, BACKGROUND_LOCATION
        });
    }
}

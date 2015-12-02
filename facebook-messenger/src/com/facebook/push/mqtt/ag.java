// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


final class ag extends Enum
{

    private static final ag $VALUES[];
    public static final ag BY_REQUEST;
    public static final ag CONNECTION_LOST;
    public static final ag CONNECT_FAILED;

    private ag(String s, int i)
    {
        super(s, i);
    }

    public static ag valueOf(String s)
    {
        return (ag)Enum.valueOf(com/facebook/push/mqtt/ag, s);
    }

    public static ag[] values()
    {
        return (ag[])$VALUES.clone();
    }

    static 
    {
        CONNECT_FAILED = new ag("CONNECT_FAILED", 0);
        CONNECTION_LOST = new ag("CONNECTION_LOST", 1);
        BY_REQUEST = new ag("BY_REQUEST", 2);
        $VALUES = (new ag[] {
            CONNECT_FAILED, CONNECTION_LOST, BY_REQUEST
        });
    }
}

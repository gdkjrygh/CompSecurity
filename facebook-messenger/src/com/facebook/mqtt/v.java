// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.mqtt;


public final class v extends Enum
{

    private static final v $VALUES[];
    public static final v NOT_CONNECTED;

    private v(String s, int i)
    {
        super(s, i);
    }

    public static v valueOf(String s)
    {
        return (v)Enum.valueOf(com/facebook/mqtt/v, s);
    }

    public static v[] values()
    {
        return (v[])$VALUES.clone();
    }

    static 
    {
        NOT_CONNECTED = new v("NOT_CONNECTED", 0);
        $VALUES = (new v[] {
            NOT_CONNECTED
        });
    }
}

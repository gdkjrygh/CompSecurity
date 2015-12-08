// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class Subevent extends Enum
{

    private static final Subevent $VALUES[];
    public static final Subevent BASE;
    public static final Subevent CLIENT;
    public static final Subevent DEVICE;
    public static final Subevent HTTP;
    public static final Subevent LOCATION;
    public static final Subevent NETWORK;
    public static final Subevent RIDE;
    public static final Subevent USER;
    public static final Subevent VENDOR;
    private final String value = name().toLowerCase();

    private Subevent(String s, int i)
    {
        super(s, i);
    }

    public static Subevent valueOf(String s)
    {
        return (Subevent)Enum.valueOf(me/lyft/android/analytics/definitions/Subevent, s);
    }

    public static Subevent[] values()
    {
        return (Subevent[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        BASE = new Subevent("BASE", 0);
        USER = new Subevent("USER", 1);
        CLIENT = new Subevent("CLIENT", 2);
        RIDE = new Subevent("RIDE", 3);
        VENDOR = new Subevent("VENDOR", 4);
        DEVICE = new Subevent("DEVICE", 5);
        LOCATION = new Subevent("LOCATION", 6);
        NETWORK = new Subevent("NETWORK", 7);
        HTTP = new Subevent("HTTP", 8);
        $VALUES = (new Subevent[] {
            BASE, USER, CLIENT, RIDE, VENDOR, DEVICE, LOCATION, NETWORK, HTTP
        });
    }
}

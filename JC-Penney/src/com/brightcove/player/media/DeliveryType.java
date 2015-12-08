// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.media;


public final class DeliveryType extends Enum
{

    public static final DeliveryType DASH;
    public static final DeliveryType FLV;
    public static final DeliveryType HLS;
    public static final DeliveryType MP4;
    public static final DeliveryType UNKNOWN;
    public static final DeliveryType WVM;
    private static final DeliveryType b[];
    private final String a;

    private DeliveryType(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static DeliveryType valueOf(String s)
    {
        return (DeliveryType)Enum.valueOf(com/brightcove/player/media/DeliveryType, s);
    }

    public static DeliveryType[] values()
    {
        return (DeliveryType[])b.clone();
    }

    public String toString()
    {
        return a;
    }

    static 
    {
        UNKNOWN = new DeliveryType("UNKNOWN", 0, "UNKNOWN");
        MP4 = new DeliveryType("MP4", 1, "video/mp4");
        HLS = new DeliveryType("HLS", 2, "application/vnd.apple.mpegurl");
        FLV = new DeliveryType("FLV", 3, "video/x-flv");
        WVM = new DeliveryType("WVM", 4, "video/wvm");
        DASH = new DeliveryType("DASH", 5, "video/mpeg-dash");
        b = (new DeliveryType[] {
            UNKNOWN, MP4, HLS, FLV, WVM, DASH
        });
    }
}

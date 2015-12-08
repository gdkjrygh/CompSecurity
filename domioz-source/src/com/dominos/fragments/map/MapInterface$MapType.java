// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments.map;


public final class  extends Enum
{

    private static final SATELLITE $VALUES[];
    public static final SATELLITE NORMAL;
    public static final SATELLITE SATELLITE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/dominos/fragments/map/MapInterface$MapType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        SATELLITE = new <init>("SATELLITE", 1);
        $VALUES = (new .VALUES[] {
            NORMAL, SATELLITE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

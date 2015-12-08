// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.location;


public final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN AUTOCOMPLETE;
    public static final UNKNOWN CURRENT_LOCATION;
    public static final UNKNOWN FALLBACK;
    public static final UNKNOWN NEARBY;
    public static final UNKNOWN SHORTCUT;
    public static final UNKNOWN TOP_DESTINATIONS;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(me/lyft/android/domain/location/Location$PlaceType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        SHORTCUT = new <init>("SHORTCUT", 0);
        AUTOCOMPLETE = new <init>("AUTOCOMPLETE", 1);
        FALLBACK = new <init>("FALLBACK", 2);
        NEARBY = new <init>("NEARBY", 3);
        TOP_DESTINATIONS = new <init>("TOP_DESTINATIONS", 4);
        CURRENT_LOCATION = new <init>("CURRENT_LOCATION", 5);
        UNKNOWN = new <init>("UNKNOWN", 6);
        $VALUES = (new .VALUES[] {
            SHORTCUT, AUTOCOMPLETE, FALLBACK, NEARBY, TOP_DESTINATIONS, CURRENT_LOCATION, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

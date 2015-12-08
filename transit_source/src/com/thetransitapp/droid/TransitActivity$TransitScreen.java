// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;


// Referenced classes of package com.thetransitapp.droid:
//            TransitActivity

public static final class  extends Enum
{

    public static final ROUTING_SCREEN_DETAILS ABOUT_SCREEN;
    private static final ROUTING_SCREEN_DETAILS ENUM$VALUES[];
    public static final ROUTING_SCREEN_DETAILS ITINERARY_SCREEN;
    public static final ROUTING_SCREEN_DETAILS LEGAL_SCREEN;
    public static final ROUTING_SCREEN_DETAILS LOCATION_SCREEN;
    public static final ROUTING_SCREEN_DETAILS NEARBY_SCREEN;
    public static final ROUTING_SCREEN_DETAILS OPTION_SCREEN;
    public static final ROUTING_SCREEN_DETAILS ROUTING_SCREEN;
    public static final ROUTING_SCREEN_DETAILS ROUTING_SCREEN_DETAILS;
    public static final ROUTING_SCREEN_DETAILS SCHEDULE_SCREEN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/thetransitapp/droid/TransitActivity$TransitScreen, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        NEARBY_SCREEN = new <init>("NEARBY_SCREEN", 0);
        ROUTING_SCREEN = new <init>("ROUTING_SCREEN", 1);
        LOCATION_SCREEN = new <init>("LOCATION_SCREEN", 2);
        ITINERARY_SCREEN = new <init>("ITINERARY_SCREEN", 3);
        SCHEDULE_SCREEN = new <init>("SCHEDULE_SCREEN", 4);
        OPTION_SCREEN = new <init>("OPTION_SCREEN", 5);
        ABOUT_SCREEN = new <init>("ABOUT_SCREEN", 6);
        LEGAL_SCREEN = new <init>("LEGAL_SCREEN", 7);
        ROUTING_SCREEN_DETAILS = new <init>("ROUTING_SCREEN_DETAILS", 8);
        ENUM$VALUES = (new ENUM.VALUES[] {
            NEARBY_SCREEN, ROUTING_SCREEN, LOCATION_SCREEN, ITINERARY_SCREEN, SCHEDULE_SCREEN, OPTION_SCREEN, ABOUT_SCREEN, LEGAL_SCREEN, ROUTING_SCREEN_DETAILS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

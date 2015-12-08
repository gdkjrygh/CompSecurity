// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;


// Referenced classes of package com.thetransitapp.droid.model:
//            RoutingLeg

public static final class A extends Enum
{

    public static final CUSTOM_MOTOR_VEHICLE ALIGHTING;
    public static final CUSTOM_MOTOR_VEHICLE BICYCLE;
    public static final CUSTOM_MOTOR_VEHICLE BOARDING;
    public static final CUSTOM_MOTOR_VEHICLE BUS;
    public static final CUSTOM_MOTOR_VEHICLE BUSISH;
    public static final CUSTOM_MOTOR_VEHICLE CABLE_CAR;
    public static final CUSTOM_MOTOR_VEHICLE CAR;
    public static final CUSTOM_MOTOR_VEHICLE CUSTOM_MOTOR_VEHICLE;
    private static final CUSTOM_MOTOR_VEHICLE ENUM$VALUES[];
    public static final CUSTOM_MOTOR_VEHICLE FERRY;
    public static final CUSTOM_MOTOR_VEHICLE FUNICULAR;
    public static final CUSTOM_MOTOR_VEHICLE GONDOLA;
    public static final CUSTOM_MOTOR_VEHICLE RAIL;
    public static final CUSTOM_MOTOR_VEHICLE STL;
    public static final CUSTOM_MOTOR_VEHICLE SUBWAY;
    public static final CUSTOM_MOTOR_VEHICLE TRAINISH;
    public static final CUSTOM_MOTOR_VEHICLE TRAM;
    public static final CUSTOM_MOTOR_VEHICLE TRANSFER;
    public static final CUSTOM_MOTOR_VEHICLE TRANSIT;
    public static final CUSTOM_MOTOR_VEHICLE WAIT;
    public static final CUSTOM_MOTOR_VEHICLE WALK;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/thetransitapp/droid/model/RoutingLeg$TransportationMode, s);
    }

    public static A[] values()
    {
        A aa[] = ENUM$VALUES;
        int i = aa.length;
        A aa1[] = new ENUM.VALUES[i];
        System.arraycopy(aa, 0, aa1, 0, i);
        return aa1;
    }

    static 
    {
        WAIT = new <init>("WAIT", 0);
        WALK = new <init>("WALK", 1);
        BICYCLE = new <init>("BICYCLE", 2);
        CAR = new <init>("CAR", 3);
        TRAM = new <init>("TRAM", 4);
        SUBWAY = new <init>("SUBWAY", 5);
        RAIL = new <init>("RAIL", 6);
        BUS = new <init>("BUS", 7);
        FERRY = new <init>("FERRY", 8);
        CABLE_CAR = new <init>("CABLE_CAR", 9);
        GONDOLA = new <init>("GONDOLA", 10);
        FUNICULAR = new <init>("FUNICULAR", 11);
        TRANSIT = new <init>("TRANSIT", 12);
        TRAINISH = new <init>("TRAINISH", 13);
        BUSISH = new <init>("BUSISH", 14);
        BOARDING = new <init>("BOARDING", 15);
        ALIGHTING = new <init>("ALIGHTING", 16);
        TRANSFER = new <init>("TRANSFER", 17);
        STL = new <init>("STL", 18);
        CUSTOM_MOTOR_VEHICLE = new <init>("CUSTOM_MOTOR_VEHICLE", 19);
        ENUM$VALUES = (new ENUM.VALUES[] {
            WAIT, WALK, BICYCLE, CAR, TRAM, SUBWAY, RAIL, BUS, FERRY, CABLE_CAR, 
            GONDOLA, FUNICULAR, TRANSIT, TRAINISH, BUSISH, BOARDING, ALIGHTING, TRANSFER, STL, CUSTOM_MOTOR_VEHICLE
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}

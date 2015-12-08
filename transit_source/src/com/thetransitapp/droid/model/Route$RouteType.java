// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.model;


// Referenced classes of package com.thetransitapp.droid.model:
//            Route

public static final class  extends Enum
{

    public static final FUNICULAR BUS;
    public static final FUNICULAR CABLE_CAR;
    private static final FUNICULAR ENUM$VALUES[];
    public static final FUNICULAR FERRY;
    public static final FUNICULAR FUNICULAR;
    public static final FUNICULAR GONDOLA;
    public static final FUNICULAR SUBWAY;
    public static final FUNICULAR TRAIN;
    public static final FUNICULAR TRAMWAY;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/thetransitapp/droid/model/Route$RouteType, s);
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
        TRAMWAY = new <init>("TRAMWAY", 0);
        SUBWAY = new <init>("SUBWAY", 1);
        TRAIN = new <init>("TRAIN", 2);
        BUS = new <init>("BUS", 3);
        FERRY = new <init>("FERRY", 4);
        CABLE_CAR = new <init>("CABLE_CAR", 5);
        GONDOLA = new <init>("GONDOLA", 6);
        FUNICULAR = new <init>("FUNICULAR", 7);
        ENUM$VALUES = (new ENUM.VALUES[] {
            TRAMWAY, SUBWAY, TRAIN, BUS, FERRY, CABLE_CAR, GONDOLA, FUNICULAR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;


// Referenced classes of package com.accuweather.android.models.photos:
//            PhotoUtilities

public static final class conditionTag extends Enum
{

    private static final WINDY $VALUES[];
    public static final WINDY CLEAR;
    public static final WINDY CLOUDY;
    public static final WINDY COLD;
    public static final WINDY FOGGY;
    public static final WINDY HOT;
    public static final WINDY MIX;
    public static final WINDY PARTLY_CLOUDY;
    public static final WINDY RAINY;
    public static final WINDY SNOWY;
    public static final WINDY THUNDERSTORM;
    public static final WINDY WINDY;
    private final String conditionTag;

    public static conditionTag valueOf(String s)
    {
        return (conditionTag)Enum.valueOf(com/accuweather/android/models/photos/PhotoUtilities$Condition, s);
    }

    public static conditionTag[] values()
    {
        return (conditionTag[])$VALUES.clone();
    }

    public String getConditionCode()
    {
        return conditionTag;
    }

    static 
    {
        CLEAR = new <init>("CLEAR", 0, "1");
        PARTLY_CLOUDY = new <init>("PARTLY_CLOUDY", 1, "2");
        CLOUDY = new <init>("CLOUDY", 2, "6");
        FOGGY = new <init>("FOGGY", 3, "11");
        RAINY = new <init>("RAINY", 4, "12");
        THUNDERSTORM = new <init>("THUNDERSTORM", 5, "15");
        SNOWY = new <init>("SNOWY", 6, "22");
        MIX = new <init>("MIX", 7, "9");
        HOT = new <init>("HOT", 8, "30");
        COLD = new <init>("COLD", 9, "31");
        WINDY = new <init>("WINDY", 10, "32");
        $VALUES = (new .VALUES[] {
            CLEAR, PARTLY_CLOUDY, CLOUDY, FOGGY, RAINY, THUNDERSTORM, SNOWY, MIX, HOT, COLD, 
            WINDY
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        conditionTag = s1;
    }
}

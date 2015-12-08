// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.photos;


// Referenced classes of package com.accuweather.android.models.photos:
//            PhotoUtilities

public static final class iconCodeTag extends Enum
{

    private static final MOONMOSTLYCLOUDYSNOW $VALUES[];
    public static final MOONMOSTLYCLOUDYSNOW CLOUDY;
    public static final MOONMOSTLYCLOUDYSNOW COLD;
    public static final MOONMOSTLYCLOUDYSNOW DREARY;
    public static final MOONMOSTLYCLOUDYSNOW FLURRIES;
    public static final MOONMOSTLYCLOUDYSNOW FOG;
    public static final MOONMOSTLYCLOUDYSNOW FREEZINGRAIN;
    public static final MOONMOSTLYCLOUDYSNOW HAZYSUNSHINE;
    public static final MOONMOSTLYCLOUDYSNOW HOT;
    public static final MOONMOSTLYCLOUDYSNOW ICE;
    public static final MOONMOSTLYCLOUDYSNOW INTERMITTENTCLOUDS;
    public static final MOONMOSTLYCLOUDYSNOW MOONCLEAR;
    public static final MOONMOSTLYCLOUDYSNOW MOONHAZYMOONLIGHT;
    public static final MOONMOSTLYCLOUDYSNOW MOONINTERMITTENTCLOUDS;
    public static final MOONMOSTLYCLOUDYSNOW MOONMOSTLYCLEAR;
    public static final MOONMOSTLYCLOUDYSNOW MOONMOSTLYCLOUDY;
    public static final MOONMOSTLYCLOUDYSNOW MOONMOSTLYCLOUDYFLURRIES;
    public static final MOONMOSTLYCLOUDYSNOW MOONMOSTLYCLOUDYSHOWERS;
    public static final MOONMOSTLYCLOUDYSNOW MOONMOSTLYCLOUDYSNOW;
    public static final MOONMOSTLYCLOUDYSNOW MOONMOSTLYCLOUDYTSTORMS;
    public static final MOONMOSTLYCLOUDYSNOW MOONPARTLYCLOUDY;
    public static final MOONMOSTLYCLOUDYSNOW MOONPARTLYCLOUDYSHOWERS;
    public static final MOONMOSTLYCLOUDYSNOW MOONPARTLYCLOUDYTSTORMS;
    public static final MOONMOSTLYCLOUDYSNOW MOSTLYCLOUDY;
    public static final MOONMOSTLYCLOUDYSNOW MOSTLYCLOUDYFLURRIES;
    public static final MOONMOSTLYCLOUDYSNOW MOSTLYCLOUDYSHOWERS;
    public static final MOONMOSTLYCLOUDYSNOW MOSTLYCLOUDYSNOW;
    public static final MOONMOSTLYCLOUDYSNOW MOSTLYCLOUDYTSTORMS;
    public static final MOONMOSTLYCLOUDYSNOW MOSTLYSUNNY;
    public static final MOONMOSTLYCLOUDYSNOW PARTLYSUNNY;
    public static final MOONMOSTLYCLOUDYSNOW PARTLYSUNNYFLURRIES;
    public static final MOONMOSTLYCLOUDYSNOW PARTLYSUNNYSHOWERS;
    public static final MOONMOSTLYCLOUDYSNOW PARTLYSUNNYTSTORMS;
    public static final MOONMOSTLYCLOUDYSNOW RAIN;
    public static final MOONMOSTLYCLOUDYSNOW RAINSNOW;
    public static final MOONMOSTLYCLOUDYSNOW SHOWERS;
    public static final MOONMOSTLYCLOUDYSNOW SLEET;
    public static final MOONMOSTLYCLOUDYSNOW SNOW;
    public static final MOONMOSTLYCLOUDYSNOW SUNNY;
    public static final MOONMOSTLYCLOUDYSNOW THUNDERSTORMS;
    public static final MOONMOSTLYCLOUDYSNOW WINDY;
    private final String iconCodeTag;

    public static iconCodeTag valueOf(String s)
    {
        return (iconCodeTag)Enum.valueOf(com/accuweather/android/models/photos/PhotoUtilities$WeatherConditionCode, s);
    }

    public static iconCodeTag[] values()
    {
        return (iconCodeTag[])$VALUES.clone();
    }

    public String getWeatherConditionCode()
    {
        return iconCodeTag;
    }

    static 
    {
        SUNNY = new <init>("SUNNY", 0, "1");
        MOSTLYSUNNY = new <init>("MOSTLYSUNNY", 1, "2");
        PARTLYSUNNY = new <init>("PARTLYSUNNY", 2, "3");
        INTERMITTENTCLOUDS = new <init>("INTERMITTENTCLOUDS", 3, "4");
        HAZYSUNSHINE = new <init>("HAZYSUNSHINE", 4, "5");
        MOSTLYCLOUDY = new <init>("MOSTLYCLOUDY", 5, "6");
        CLOUDY = new <init>("CLOUDY", 6, "7");
        DREARY = new <init>("DREARY", 7, "8");
        FOG = new <init>("FOG", 8, "11");
        SHOWERS = new <init>("SHOWERS", 9, "12");
        MOSTLYCLOUDYSHOWERS = new <init>("MOSTLYCLOUDYSHOWERS", 10, "13");
        PARTLYSUNNYSHOWERS = new <init>("PARTLYSUNNYSHOWERS", 11, "14");
        THUNDERSTORMS = new <init>("THUNDERSTORMS", 12, "15");
        MOSTLYCLOUDYTSTORMS = new <init>("MOSTLYCLOUDYTSTORMS", 13, "16");
        PARTLYSUNNYTSTORMS = new <init>("PARTLYSUNNYTSTORMS", 14, "17");
        RAIN = new <init>("RAIN", 15, "18");
        FLURRIES = new <init>("FLURRIES", 16, "19");
        MOSTLYCLOUDYFLURRIES = new <init>("MOSTLYCLOUDYFLURRIES", 17, "20");
        PARTLYSUNNYFLURRIES = new <init>("PARTLYSUNNYFLURRIES", 18, "21");
        SNOW = new <init>("SNOW", 19, "22");
        MOSTLYCLOUDYSNOW = new <init>("MOSTLYCLOUDYSNOW", 20, "23");
        ICE = new <init>("ICE", 21, "24");
        SLEET = new <init>("SLEET", 22, "25");
        FREEZINGRAIN = new <init>("FREEZINGRAIN", 23, "26");
        RAINSNOW = new <init>("RAINSNOW", 24, "29");
        HOT = new <init>("HOT", 25, "30");
        COLD = new <init>("COLD", 26, "31");
        WINDY = new <init>("WINDY", 27, "32");
        MOONCLEAR = new <init>("MOONCLEAR", 28, "33");
        MOONMOSTLYCLEAR = new <init>("MOONMOSTLYCLEAR", 29, "34");
        MOONPARTLYCLOUDY = new <init>("MOONPARTLYCLOUDY", 30, "35");
        MOONINTERMITTENTCLOUDS = new <init>("MOONINTERMITTENTCLOUDS", 31, "36");
        MOONHAZYMOONLIGHT = new <init>("MOONHAZYMOONLIGHT", 32, "37");
        MOONMOSTLYCLOUDY = new <init>("MOONMOSTLYCLOUDY", 33, "38");
        MOONPARTLYCLOUDYSHOWERS = new <init>("MOONPARTLYCLOUDYSHOWERS", 34, "39");
        MOONMOSTLYCLOUDYSHOWERS = new <init>("MOONMOSTLYCLOUDYSHOWERS", 35, "40");
        MOONPARTLYCLOUDYTSTORMS = new <init>("MOONPARTLYCLOUDYTSTORMS", 36, "41");
        MOONMOSTLYCLOUDYTSTORMS = new <init>("MOONMOSTLYCLOUDYTSTORMS", 37, "42");
        MOONMOSTLYCLOUDYFLURRIES = new <init>("MOONMOSTLYCLOUDYFLURRIES", 38, "43");
        MOONMOSTLYCLOUDYSNOW = new <init>("MOONMOSTLYCLOUDYSNOW", 39, "44");
        $VALUES = (new .VALUES[] {
            SUNNY, MOSTLYSUNNY, PARTLYSUNNY, INTERMITTENTCLOUDS, HAZYSUNSHINE, MOSTLYCLOUDY, CLOUDY, DREARY, FOG, SHOWERS, 
            MOSTLYCLOUDYSHOWERS, PARTLYSUNNYSHOWERS, THUNDERSTORMS, MOSTLYCLOUDYTSTORMS, PARTLYSUNNYTSTORMS, RAIN, FLURRIES, MOSTLYCLOUDYFLURRIES, PARTLYSUNNYFLURRIES, SNOW, 
            MOSTLYCLOUDYSNOW, ICE, SLEET, FREEZINGRAIN, RAINSNOW, HOT, COLD, WINDY, MOONCLEAR, MOONMOSTLYCLEAR, 
            MOONPARTLYCLOUDY, MOONINTERMITTENTCLOUDS, MOONHAZYMOONLIGHT, MOONMOSTLYCLOUDY, MOONPARTLYCLOUDYSHOWERS, MOONMOSTLYCLOUDYSHOWERS, MOONPARTLYCLOUDYTSTORMS, MOONMOSTLYCLOUDYTSTORMS, MOONMOSTLYCLOUDYFLURRIES, MOONMOSTLYCLOUDYSNOW
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        iconCodeTag = s1;
    }
}

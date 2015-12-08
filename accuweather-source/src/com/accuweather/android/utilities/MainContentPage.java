// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;


public final class MainContentPage extends Enum
{

    private static final MainContentPage $VALUES[];
    public static final MainContentPage Forecast;
    public static final MainContentPage Hourly;
    public static final MainContentPage Location;
    public static final MainContentPage Maps;
    public static final MainContentPage MinuteCast;
    public static final MainContentPage News;
    public static final MainContentPage Now;
    public static final MainContentPage Video;

    private MainContentPage(String s, int i)
    {
        super(s, i);
    }

    public static MainContentPage valueOf(String s)
    {
        return (MainContentPage)Enum.valueOf(com/accuweather/android/utilities/MainContentPage, s);
    }

    public static MainContentPage[] values()
    {
        return (MainContentPage[])$VALUES.clone();
    }

    static 
    {
        Location = new MainContentPage("Location", 0);
        Now = new MainContentPage("Now", 1);
        MinuteCast = new MainContentPage("MinuteCast", 2);
        Hourly = new MainContentPage("Hourly", 3);
        Forecast = new MainContentPage("Forecast", 4);
        Maps = new MainContentPage("Maps", 5);
        Video = new MainContentPage("Video", 6);
        News = new MainContentPage("News", 7);
        $VALUES = (new MainContentPage[] {
            Location, Now, MinuteCast, Hourly, Forecast, Maps, Video, News
        });
    }
}

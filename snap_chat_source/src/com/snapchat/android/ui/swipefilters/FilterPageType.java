// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.swipefilters;


public final class FilterPageType extends Enum
{

    private static final FilterPageType $VALUES[];
    public static final FilterPageType BACKGROUNDFILTER;
    public static final FilterPageType GEOFILTER;
    public static final FilterPageType INFOFILTER;
    public static final FilterPageType TURN_ON_FILTERS_PAGE;
    public static final FilterPageType UNFILTERED;
    public static final FilterPageType VIDEO_SPEED_FILTER;

    private FilterPageType(String s, int i)
    {
        super(s, i);
    }

    public static FilterPageType valueOf(String s)
    {
        return (FilterPageType)Enum.valueOf(com/snapchat/android/ui/swipefilters/FilterPageType, s);
    }

    public static FilterPageType[] values()
    {
        return (FilterPageType[])$VALUES.clone();
    }

    static 
    {
        UNFILTERED = new FilterPageType("UNFILTERED", 0);
        GEOFILTER = new FilterPageType("GEOFILTER", 1);
        INFOFILTER = new FilterPageType("INFOFILTER", 2);
        BACKGROUNDFILTER = new FilterPageType("BACKGROUNDFILTER", 3);
        VIDEO_SPEED_FILTER = new FilterPageType("VIDEO_SPEED_FILTER", 4);
        TURN_ON_FILTERS_PAGE = new FilterPageType("TURN_ON_FILTERS_PAGE", 5);
        $VALUES = (new FilterPageType[] {
            UNFILTERED, GEOFILTER, INFOFILTER, BACKGROUNDFILTER, VIDEO_SPEED_FILTER, TURN_ON_FILTERS_PAGE
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            PublisherChannelTable

public static final class c extends Enum
    implements tt
{

    private static final INTRO_AD_TARGETING $VALUES[];
    public static final INTRO_AD_TARGETING ENABLED;
    public static final INTRO_AD_TARGETING FILLED_ICON;
    public static final INTRO_AD_TARGETING INTRO_AD_TARGETING;
    public static final INTRO_AD_TARGETING INTRO_AD_UNIT_ID;
    public static final INTRO_AD_TARGETING INTRO_MOVIE;
    public static final INTRO_AD_TARGETING INVERTED_ICON;
    public static final INTRO_AD_TARGETING LOADING_ICON;
    public static final INTRO_AD_TARGETING NAME;
    public static final INTRO_AD_TARGETING POSITION;
    public static final INTRO_AD_TARGETING PRIMARY_COLOR;
    public static final INTRO_AD_TARGETING PROMOTED_STORIES_PAGE_POSITION;
    public static final INTRO_AD_TARGETING PUBLISHER_FORMAL_NAME;
    public static final INTRO_AD_TARGETING PUBLISHER_INTERNATIONAL_NAME;
    public static final INTRO_AD_TARGETING SECONDARY_COLOR;
    public static final INTRO_AD_TARGETING SPONSORED;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_ALIGNMENT;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_HMARGIN;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_POSITION;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_STR_RECT_HEIGHT;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_STR_RECT_WIDTH;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_STR_RECT_X;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_STR_RECT_Y;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_TEXT;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_TIME_BEFORE_FADEOUT;
    public static final INTRO_AD_TARGETING SPONSORED_SLUG_VMARGIN;
    public static final INTRO_AD_TARGETING STORIES_PAGE_POSITION;
    private String a;
    private DataType b;
    private String c;

    static String a(c c1)
    {
        return c1.a;
    }

    static DataType b(a a1)
    {
        return a1.b;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/snapchat/android/discover/model/database/table/PublisherChannelTable$PublisherChannelSchema, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    public final String getColumnName()
    {
        return a;
    }

    public final int getColumnNumber()
    {
        return ordinal();
    }

    public final String getConstraints()
    {
        return c;
    }

    public final DataType getDataType()
    {
        return b;
    }

    static 
    {
        NAME = new <init>("NAME", "_id", DataType.TEXT, "PRIMARY KEY");
        PUBLISHER_FORMAL_NAME = new <init>("PUBLISHER_FORMAL_NAME", 1, "publisher_formal_name", DataType.TEXT);
        PUBLISHER_INTERNATIONAL_NAME = new <init>("PUBLISHER_INTERNATIONAL_NAME", 2, "publisher_international_name", DataType.TEXT);
        PRIMARY_COLOR = new <init>("PRIMARY_COLOR", 3, "primary_color", DataType.TEXT);
        SECONDARY_COLOR = new <init>("SECONDARY_COLOR", 4, "secondary_color", DataType.TEXT);
        FILLED_ICON = new <init>("FILLED_ICON", 5, "filled_icon", DataType.TEXT);
        INVERTED_ICON = new <init>("INVERTED_ICON", 6, "inverted_icon", DataType.TEXT);
        LOADING_ICON = new <init>("LOADING_ICON", 7, "loading_icon", DataType.TEXT);
        INTRO_MOVIE = new <init>("INTRO_MOVIE", 8, "intro_movie", DataType.TEXT);
        POSITION = new <init>("POSITION", 9, "position", DataType.INTEGER);
        STORIES_PAGE_POSITION = new <init>("STORIES_PAGE_POSITION", 10, "stories_page_position", DataType.INTEGER);
        PROMOTED_STORIES_PAGE_POSITION = new <init>("PROMOTED_STORIES_PAGE_POSITION", 11, "promoted_stories_page_position", DataType.INTEGER);
        ENABLED = new <init>("ENABLED", 12, "enabled", DataType.BOOLEAN);
        SPONSORED = new <init>("SPONSORED", 13, "sponsored", DataType.BOOLEAN);
        SPONSORED_SLUG_STR_RECT_X = new <init>("SPONSORED_SLUG_STR_RECT_X", 14, "sponsored_slug_str_rect_x", DataType.TEXT);
        SPONSORED_SLUG_STR_RECT_Y = new <init>("SPONSORED_SLUG_STR_RECT_Y", 15, "sponsored_slug_str_rect_y", DataType.TEXT);
        SPONSORED_SLUG_STR_RECT_WIDTH = new <init>("SPONSORED_SLUG_STR_RECT_WIDTH", 16, "sponsored_slug_str_rect_width", DataType.TEXT);
        SPONSORED_SLUG_STR_RECT_HEIGHT = new <init>("SPONSORED_SLUG_STR_RECT_HEIGHT", 17, "sponsored_slug_str_rect_height", DataType.TEXT);
        SPONSORED_SLUG_ALIGNMENT = new <init>("SPONSORED_SLUG_ALIGNMENT", 18, "sponsored_slug_alignment", DataType.TEXT);
        SPONSORED_SLUG_POSITION = new <init>("SPONSORED_SLUG_POSITION", 19, "sponsored_slug_position", DataType.TEXT);
        SPONSORED_SLUG_HMARGIN = new <init>("SPONSORED_SLUG_HMARGIN", 20, "sponsored_slug_hmargin", DataType.TEXT);
        SPONSORED_SLUG_VMARGIN = new <init>("SPONSORED_SLUG_VMARGIN", 21, "sponsored_slug_vmargin", DataType.TEXT);
        SPONSORED_SLUG_TEXT = new <init>("SPONSORED_SLUG_TEXT", 22, "sponsored_slug_text", DataType.TEXT);
        SPONSORED_SLUG_TIME_BEFORE_FADEOUT = new <init>("SPONSORED_SLUG_TIME_BEFORE_FADEOUT", 23, "sponsored_slug_time_before_fadeout", DataType.INTEGER);
        INTRO_AD_UNIT_ID = new <init>("INTRO_AD_UNIT_ID", 24, "ad_unit_id", DataType.TEXT);
        INTRO_AD_TARGETING = new <init>("INTRO_AD_TARGETING", 25, "targeting_parameters", DataType.MAP);
        $VALUES = (new .VALUES[] {
            NAME, PUBLISHER_FORMAL_NAME, PUBLISHER_INTERNATIONAL_NAME, PRIMARY_COLOR, SECONDARY_COLOR, FILLED_ICON, INVERTED_ICON, LOADING_ICON, INTRO_MOVIE, POSITION, 
            STORIES_PAGE_POSITION, PROMOTED_STORIES_PAGE_POSITION, ENABLED, SPONSORED, SPONSORED_SLUG_STR_RECT_X, SPONSORED_SLUG_STR_RECT_Y, SPONSORED_SLUG_STR_RECT_WIDTH, SPONSORED_SLUG_STR_RECT_HEIGHT, SPONSORED_SLUG_ALIGNMENT, SPONSORED_SLUG_POSITION, 
            SPONSORED_SLUG_HMARGIN, SPONSORED_SLUG_VMARGIN, SPONSORED_SLUG_TEXT, SPONSORED_SLUG_TIME_BEFORE_FADEOUT, INTRO_AD_UNIT_ID, INTRO_AD_TARGETING
        });
    }

    private (String s, int i, String s1, DataType datatype)
    {
        super(s, i);
        a = s1;
        b = datatype;
    }

    private b(String s, String s1, DataType datatype, String s2)
    {
        this(s, 0, s1, datatype);
        c = s2;
    }
}

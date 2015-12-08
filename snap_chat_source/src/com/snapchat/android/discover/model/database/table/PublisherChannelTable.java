// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import Br;
import Bt;
import Qa;
import SG;
import SY;
import TO;
import TP;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.snapchat.android.Timber;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.DatabaseHelper;
import com.snapchat.android.database.table.DbTable;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import tA;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            EditionChunkTable, EditionTable

public final class PublisherChannelTable extends DbTable
{
    public static final class PublisherChannelSchema extends Enum
        implements tt
    {

        private static final PublisherChannelSchema $VALUES[];
        public static final PublisherChannelSchema ENABLED;
        public static final PublisherChannelSchema FILLED_ICON;
        public static final PublisherChannelSchema INTRO_AD_TARGETING;
        public static final PublisherChannelSchema INTRO_AD_UNIT_ID;
        public static final PublisherChannelSchema INTRO_MOVIE;
        public static final PublisherChannelSchema INVERTED_ICON;
        public static final PublisherChannelSchema LOADING_ICON;
        public static final PublisherChannelSchema NAME;
        public static final PublisherChannelSchema POSITION;
        public static final PublisherChannelSchema PRIMARY_COLOR;
        public static final PublisherChannelSchema PROMOTED_STORIES_PAGE_POSITION;
        public static final PublisherChannelSchema PUBLISHER_FORMAL_NAME;
        public static final PublisherChannelSchema PUBLISHER_INTERNATIONAL_NAME;
        public static final PublisherChannelSchema SECONDARY_COLOR;
        public static final PublisherChannelSchema SPONSORED;
        public static final PublisherChannelSchema SPONSORED_SLUG_ALIGNMENT;
        public static final PublisherChannelSchema SPONSORED_SLUG_HMARGIN;
        public static final PublisherChannelSchema SPONSORED_SLUG_POSITION;
        public static final PublisherChannelSchema SPONSORED_SLUG_STR_RECT_HEIGHT;
        public static final PublisherChannelSchema SPONSORED_SLUG_STR_RECT_WIDTH;
        public static final PublisherChannelSchema SPONSORED_SLUG_STR_RECT_X;
        public static final PublisherChannelSchema SPONSORED_SLUG_STR_RECT_Y;
        public static final PublisherChannelSchema SPONSORED_SLUG_TEXT;
        public static final PublisherChannelSchema SPONSORED_SLUG_TIME_BEFORE_FADEOUT;
        public static final PublisherChannelSchema SPONSORED_SLUG_VMARGIN;
        public static final PublisherChannelSchema STORIES_PAGE_POSITION;
        private String a;
        private DataType b;
        private String c;

        static String a(PublisherChannelSchema publisherchannelschema)
        {
            return publisherchannelschema.a;
        }

        static DataType b(PublisherChannelSchema publisherchannelschema)
        {
            return publisherchannelschema.b;
        }

        public static PublisherChannelSchema valueOf(String s)
        {
            return (PublisherChannelSchema)Enum.valueOf(com/snapchat/android/discover/model/database/table/PublisherChannelTable$PublisherChannelSchema, s);
        }

        public static PublisherChannelSchema[] values()
        {
            return (PublisherChannelSchema[])$VALUES.clone();
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
            NAME = new PublisherChannelSchema("NAME", "_id", DataType.TEXT, "PRIMARY KEY");
            PUBLISHER_FORMAL_NAME = new PublisherChannelSchema("PUBLISHER_FORMAL_NAME", 1, "publisher_formal_name", DataType.TEXT);
            PUBLISHER_INTERNATIONAL_NAME = new PublisherChannelSchema("PUBLISHER_INTERNATIONAL_NAME", 2, "publisher_international_name", DataType.TEXT);
            PRIMARY_COLOR = new PublisherChannelSchema("PRIMARY_COLOR", 3, "primary_color", DataType.TEXT);
            SECONDARY_COLOR = new PublisherChannelSchema("SECONDARY_COLOR", 4, "secondary_color", DataType.TEXT);
            FILLED_ICON = new PublisherChannelSchema("FILLED_ICON", 5, "filled_icon", DataType.TEXT);
            INVERTED_ICON = new PublisherChannelSchema("INVERTED_ICON", 6, "inverted_icon", DataType.TEXT);
            LOADING_ICON = new PublisherChannelSchema("LOADING_ICON", 7, "loading_icon", DataType.TEXT);
            INTRO_MOVIE = new PublisherChannelSchema("INTRO_MOVIE", 8, "intro_movie", DataType.TEXT);
            POSITION = new PublisherChannelSchema("POSITION", 9, "position", DataType.INTEGER);
            STORIES_PAGE_POSITION = new PublisherChannelSchema("STORIES_PAGE_POSITION", 10, "stories_page_position", DataType.INTEGER);
            PROMOTED_STORIES_PAGE_POSITION = new PublisherChannelSchema("PROMOTED_STORIES_PAGE_POSITION", 11, "promoted_stories_page_position", DataType.INTEGER);
            ENABLED = new PublisherChannelSchema("ENABLED", 12, "enabled", DataType.BOOLEAN);
            SPONSORED = new PublisherChannelSchema("SPONSORED", 13, "sponsored", DataType.BOOLEAN);
            SPONSORED_SLUG_STR_RECT_X = new PublisherChannelSchema("SPONSORED_SLUG_STR_RECT_X", 14, "sponsored_slug_str_rect_x", DataType.TEXT);
            SPONSORED_SLUG_STR_RECT_Y = new PublisherChannelSchema("SPONSORED_SLUG_STR_RECT_Y", 15, "sponsored_slug_str_rect_y", DataType.TEXT);
            SPONSORED_SLUG_STR_RECT_WIDTH = new PublisherChannelSchema("SPONSORED_SLUG_STR_RECT_WIDTH", 16, "sponsored_slug_str_rect_width", DataType.TEXT);
            SPONSORED_SLUG_STR_RECT_HEIGHT = new PublisherChannelSchema("SPONSORED_SLUG_STR_RECT_HEIGHT", 17, "sponsored_slug_str_rect_height", DataType.TEXT);
            SPONSORED_SLUG_ALIGNMENT = new PublisherChannelSchema("SPONSORED_SLUG_ALIGNMENT", 18, "sponsored_slug_alignment", DataType.TEXT);
            SPONSORED_SLUG_POSITION = new PublisherChannelSchema("SPONSORED_SLUG_POSITION", 19, "sponsored_slug_position", DataType.TEXT);
            SPONSORED_SLUG_HMARGIN = new PublisherChannelSchema("SPONSORED_SLUG_HMARGIN", 20, "sponsored_slug_hmargin", DataType.TEXT);
            SPONSORED_SLUG_VMARGIN = new PublisherChannelSchema("SPONSORED_SLUG_VMARGIN", 21, "sponsored_slug_vmargin", DataType.TEXT);
            SPONSORED_SLUG_TEXT = new PublisherChannelSchema("SPONSORED_SLUG_TEXT", 22, "sponsored_slug_text", DataType.TEXT);
            SPONSORED_SLUG_TIME_BEFORE_FADEOUT = new PublisherChannelSchema("SPONSORED_SLUG_TIME_BEFORE_FADEOUT", 23, "sponsored_slug_time_before_fadeout", DataType.INTEGER);
            INTRO_AD_UNIT_ID = new PublisherChannelSchema("INTRO_AD_UNIT_ID", 24, "ad_unit_id", DataType.TEXT);
            INTRO_AD_TARGETING = new PublisherChannelSchema("INTRO_AD_TARGETING", 25, "targeting_parameters", DataType.MAP);
            $VALUES = (new PublisherChannelSchema[] {
                NAME, PUBLISHER_FORMAL_NAME, PUBLISHER_INTERNATIONAL_NAME, PRIMARY_COLOR, SECONDARY_COLOR, FILLED_ICON, INVERTED_ICON, LOADING_ICON, INTRO_MOVIE, POSITION, 
                STORIES_PAGE_POSITION, PROMOTED_STORIES_PAGE_POSITION, ENABLED, SPONSORED, SPONSORED_SLUG_STR_RECT_X, SPONSORED_SLUG_STR_RECT_Y, SPONSORED_SLUG_STR_RECT_WIDTH, SPONSORED_SLUG_STR_RECT_HEIGHT, SPONSORED_SLUG_ALIGNMENT, SPONSORED_SLUG_POSITION, 
                SPONSORED_SLUG_HMARGIN, SPONSORED_SLUG_VMARGIN, SPONSORED_SLUG_TEXT, SPONSORED_SLUG_TIME_BEFORE_FADEOUT, INTRO_AD_UNIT_ID, INTRO_AD_TARGETING
            });
        }

        private PublisherChannelSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private PublisherChannelSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }


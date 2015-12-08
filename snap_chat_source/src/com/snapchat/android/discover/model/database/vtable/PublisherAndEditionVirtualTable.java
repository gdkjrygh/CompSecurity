// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.vtable;

import Jh;
import SG;
import SY;
import android.database.Cursor;
import com.snapchat.android.database.DataType;
import com.snapchat.android.database.vtable.DbVirtualTable;
import java.util.HashMap;
import ts;
import tt;

public final class PublisherAndEditionVirtualTable extends DbVirtualTable
{
    public static final class ChannelSchema extends Enum
        implements tt
    {

        private static final ChannelSchema $VALUES[];
        public static final ChannelSchema CURRENT_EDITION_ID;
        public static final ChannelSchema ENABLED;
        public static final ChannelSchema FILLED_ICON;
        public static final ChannelSchema INTRO_AD_TARGETING;
        public static final ChannelSchema INTRO_AD_UNIT_ID;
        public static final ChannelSchema INTRO_MOVIE;
        public static final ChannelSchema INVERTED_ICON;
        public static final ChannelSchema LOADING_ICON;
        public static final ChannelSchema NUM_CHUNKS;
        public static final ChannelSchema POSITION;
        public static final ChannelSchema PRIMARY_COLOR;
        public static final ChannelSchema PROMOTED_STORIES_PAGE_POSITION;
        public static final ChannelSchema PUBLISHER_FORMAL_NAME;
        public static final ChannelSchema PUBLISHER_INTERNATIONAL_NAME;
        public static final ChannelSchema PUBLISHER_NAME;
        public static final ChannelSchema SECONDARY_COLOR;
        public static final ChannelSchema SPONSORED;
        public static final ChannelSchema SPONSORED_SLUG_ALIGNMENT;
        public static final ChannelSchema SPONSORED_SLUG_HMARGIN;
        public static final ChannelSchema SPONSORED_SLUG_POSITION;
        public static final ChannelSchema SPONSORED_SLUG_STR_RECT_HEIGHT;
        public static final ChannelSchema SPONSORED_SLUG_STR_RECT_WIDTH;
        public static final ChannelSchema SPONSORED_SLUG_STR_RECT_X;
        public static final ChannelSchema SPONSORED_SLUG_STR_RECT_Y;
        public static final ChannelSchema SPONSORED_SLUG_TEXT;
        public static final ChannelSchema SPONSORED_SLUG_TIME_BEFORE_FADEOUT;
        public static final ChannelSchema SPONSORED_SLUG_VMARGIN;
        public static final ChannelSchema STORIES_PAGE_POSITION;
        private String a;
        private DataType b;
        private String c;

        public static ChannelSchema valueOf(String s)
        {
            return (ChannelSchema)Enum.valueOf(com/snapchat/android/discover/model/database/vtable/PublisherAndEditionVirtualTable$ChannelSchema, s);
        }

        public static ChannelSchema[] values()
        {
            return (ChannelSchema[])$VALUES.clone();
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
            PUBLISHER_NAME = new ChannelSchema("PUBLISHER_NAME", "_id", DataType.TEXT, "PRIMARY KEY");
            PUBLISHER_FORMAL_NAME = new ChannelSchema("PUBLISHER_FORMAL_NAME", 1, "publisher_formal_name", DataType.TEXT);
            PUBLISHER_INTERNATIONAL_NAME = new ChannelSchema("PUBLISHER_INTERNATIONAL_NAME", 2, "publisher_international_name", DataType.TEXT);
            PRIMARY_COLOR = new ChannelSchema("PRIMARY_COLOR", 3, "primary_color", DataType.TEXT);
            SECONDARY_COLOR = new ChannelSchema("SECONDARY_COLOR", 4, "secondary_color", DataType.TEXT);
            FILLED_ICON = new ChannelSchema("FILLED_ICON", 5, "filled_icon", DataType.TEXT);
            INVERTED_ICON = new ChannelSchema("INVERTED_ICON", 6, "inverted_icon", DataType.TEXT);
            LOADING_ICON = new ChannelSchema("LOADING_ICON", 7, "loading_icon", DataType.TEXT);
            INTRO_MOVIE = new ChannelSchema("INTRO_MOVIE", 8, "intro_movie", DataType.TEXT);
            POSITION = new ChannelSchema("POSITION", 9, "position", DataType.INTEGER);
            STORIES_PAGE_POSITION = new ChannelSchema("STORIES_PAGE_POSITION", 10, "stories_page_position", DataType.INTEGER);
            PROMOTED_STORIES_PAGE_POSITION = new ChannelSchema("PROMOTED_STORIES_PAGE_POSITION", 11, "promoted_stories_page_position", DataType.INTEGER);
            ENABLED = new ChannelSchema("ENABLED", 12, "enabled", DataType.BOOLEAN);
            SPONSORED = new ChannelSchema("SPONSORED", 13, "sponsored", DataType.BOOLEAN);
            SPONSORED_SLUG_STR_RECT_X = new ChannelSchema("SPONSORED_SLUG_STR_RECT_X", 14, "sponsored_slug_str_rect_x", DataType.TEXT);
            SPONSORED_SLUG_STR_RECT_Y = new ChannelSchema("SPONSORED_SLUG_STR_RECT_Y", 15, "sponsored_slug_str_rect_y", DataType.TEXT);
            SPONSORED_SLUG_STR_RECT_WIDTH = new ChannelSchema("SPONSORED_SLUG_STR_RECT_WIDTH", 16, "sponsored_slug_str_rect_width", DataType.TEXT);
            SPONSORED_SLUG_STR_RECT_HEIGHT = new ChannelSchema("SPONSORED_SLUG_STR_RECT_HEIGHT", 17, "sponsored_slug_str_rect_height", DataType.TEXT);
            SPONSORED_SLUG_ALIGNMENT = new ChannelSchema("SPONSORED_SLUG_ALIGNMENT", 18, "sponsored_slug_alignment", DataType.TEXT);
            SPONSORED_SLUG_POSITION = new ChannelSchema("SPONSORED_SLUG_POSITION", 19, "sponsored_slug_position", DataType.TEXT);
            SPONSORED_SLUG_HMARGIN = new ChannelSchema("SPONSORED_SLUG_HMARGIN", 20, "sponsored_slug_hmargin", DataType.TEXT);
            SPONSORED_SLUG_VMARGIN = new ChannelSchema("SPONSORED_SLUG_VMARGIN", 21, "sponsored_slug_vmargin", DataType.TEXT);
            SPONSORED_SLUG_TEXT = new ChannelSchema("SPONSORED_SLUG_TEXT", 22, "sponsored_slug_text", DataType.TEXT);
            SPONSORED_SLUG_TIME_BEFORE_FADEOUT = new ChannelSchema("SPONSORED_SLUG_TIME_BEFORE_FADEOUT", 23, "sponsored_slug_time_before_fadeout", DataType.INTEGER);
            INTRO_AD_UNIT_ID = new ChannelSchema("INTRO_AD_UNIT_ID", 24, "ad_unit_id", DataType.TEXT);
            INTRO_AD_TARGETING = new ChannelSchema("INTRO_AD_TARGETING", 25, "targeting_parameters", DataType.MAP);
            CURRENT_EDITION_ID = new ChannelSchema("CURRENT_EDITION_ID", 26, "current_edition_id", DataType.TEXT);
            NUM_CHUNKS = new ChannelSchema("NUM_CHUNKS", 27, "num_chunks", DataType.INTEGER);
            $VALUES = (new ChannelSchema[] {
                PUBLISHER_NAME, PUBLISHER_FORMAL_NAME, PUBLISHER_INTERNATIONAL_NAME, PRIMARY_COLOR, SECONDARY_COLOR, FILLED_ICON, INVERTED_ICON, LOADING_ICON, INTRO_MOVIE, POSITION, 
                STORIES_PAGE_POSITION, PROMOTED_STORIES_PAGE_POSITION, ENABLED, SPONSORED, SPONSORED_SLUG_STR_RECT_X, SPONSORED_SLUG_STR_RECT_Y, SPONSORED_SLUG_STR_RECT_WIDTH, SPONSORED_SLUG_STR_RECT_HEIGHT, SPONSORED_SLUG_ALIGNMENT, SPONSORED_SLUG_POSITION, 
                SPONSORED_SLUG_HMARGIN, SPONSORED_SLUG_VMARGIN, SPONSORED_SLUG_TEXT, SPONSORED_SLUG_TIME_BEFORE_FADEOUT, INTRO_AD_UNIT_ID, INTRO_AD_TARGETING, CURRENT_EDITION_ID, NUM_CHUNKS
            });
        }

        private ChannelSchema(String s, int i, String s1, DataType datatype)
        {
            super(s, i);
            a = s1;
            b = datatype;
        }

        private ChannelSchema(String s, String s1, DataType datatype, String s2)
        {
            this(s, 0, s1, datatype);
            c = s2;
        }
    }


    public static final String a[];
    public static final HashMap b;
    private static PublisherAndEditionVirtualTable c;
    private static final String d;

    public PublisherAndEditionVirtualTable()
    {
    }

    public static com.snapchat.android.discover.model.ChannelPage.a a(Cursor cursor)
    {
        String s1 = cursor.getString(ChannelSchema.PUBLISHER_NAME.getColumnNumber());
        String s2 = cursor.getString(ChannelSchema.PUBLISHER_FORMAL_NAME.getColumnNumber());
        String s3 = cursor.getString(ChannelSchema.PUBLISHER_INTERNATIONAL_NAME.getColumnNumber());
        String s4 = cursor.getString(ChannelSchema.PRIMARY_COLOR.getColumnNumber());
        String s5 = cursor.getString(ChannelSchema.SECONDARY_COLOR.getColumnNumber());
        String s6 = cursor.getString(ChannelSchema.FILLED_ICON.getColumnNumber());
        String s7 = cursor.getString(ChannelSchema.INVERTED_ICON.getColumnNumber());
        String s8 = cursor.getString(ChannelSchema.LOADING_ICON.getColumnNumber());
        String s9 = cursor.getString(ChannelSchema.INTRO_MOVIE.getColumnNumber());
        String s10 = cursor.getString(ChannelSchema.INTRO_AD_UNIT_ID.getColumnNumber());
        java.util.Map map = Jh.a(cursor.getString(ChannelSchema.INTRO_AD_TARGETING.getColumnNumber()));
        String s;
        SG sg;
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        boolean flag1;
        if (cursor.getInt(ChannelSchema.ENABLED.getColumnNumber()) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cursor.getInt(ChannelSchema.SPONSORED.getColumnNumber()) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j = cursor.getInt(ChannelSchema.POSITION.getColumnNumber());
        k = cursor.getInt(ChannelSchema.STORIES_PAGE_POSITION.getColumnNumber());
        l = cursor.getInt(ChannelSchema.PROMOTED_STORIES_PAGE_POSITION.getColumnNumber());
        i = 0;
        if (!cursor.isNull(ChannelSchema.CURRENT_EDITION_ID.getColumnNumber()))
        {
            s = cursor.getString(ChannelSchema.CURRENT_EDITION_ID.getColumnNumber());
        } else
        {
            s = null;
        }
        sg = null;
        if (flag1)
        {
            sg = new SG();
            SY sy = new SY();
            sy.a(cursor.getString(ChannelSchema.SPONSORED_SLUG_STR_RECT_X.getColumnNumber()));
            sy.b(cursor.getString(ChannelSchema.SPONSORED_SLUG_STR_RECT_Y.getColumnNumber()));
            sy.c(cursor.getString(ChannelSchema.SPONSORED_SLUG_STR_RECT_WIDTH.getColumnNumber()));
            sy.d(cursor.getString(ChannelSchema.SPONSORED_SLUG_STR_RECT_HEIGHT.getColumnNumber()));
            sg.a(sy);
            sg.a(cursor.getString(ChannelSchema.SPONSORED_SLUG_ALIGNMENT.getColumnNumber()));
            sg.b(cursor.getString(ChannelSchema.SPONSORED_SLUG_POSITION.getColumnNumber()));
            sg.c(cursor.getString(ChannelSchema.SPONSORED_SLUG_HMARGIN.getColumnNumber()));
            sg.d(cursor.getString(ChannelSchema.SPONSORED_SLUG_VMARGIN.getColumnNumber()));
            sg.e(cursor.getString(ChannelSchema.SPONSORED_SLUG_TEXT.getColumnNumber()));
            sg.a(Integer.valueOf(cursor.getInt(ChannelSchema.SPONSORED_SLUG_TIME_BEFORE_FADEOUT.getColumnNumber())));
        }
        if (!cursor.isNull(ChannelSchema.NUM_CHUNKS.getColumnNumber()))
        {
            i = cursor.getInt(ChannelSchema.NUM_CHUNKS.getColumnNumber());
        }
        cursor = new com.snapchat.android.discover.model.ChannelPage.a();
        cursor.a = s1;
        cursor.b = s2;
        cursor.c = s3;
        cursor.d = s4;
        cursor.e = s5;
        cursor.h = s6;
        cursor.i = s7;
        cursor.j = s8;
        cursor.k = s9;
        cursor.n = j;
        cursor.o = k;
        cursor.p = l;
        cursor.l = flag;
        cursor.m = flag1;
        cursor.C = sg;
        cursor.q = s;
        cursor.r = i;
        cursor.w = s10;
        cursor.x = map;
        return cursor;
    }

    public static PublisherAndEditionVirtualTable d()
    {
        if (c == null)
        {
            c = new PublisherAndEditionVirtualTable();
        }
        return c;
    }

    public final String a()
    {
        return "PublisherAndEdition";
    }

    public final String b()
    {
        return d;
    }

    public final tt[] c()
    {
        return ChannelSchema.values();
    }

    static 
    {
        ChannelSchema achannelschema[] = ChannelSchema.values();
        int j = achannelschema.length;
        a = new String[j];
        b = new HashMap(j);
        for (int i = 0; i < j; i++)
        {
            ChannelSchema channelschema = achannelschema[i];
            a[i] = achannelschema[i].getColumnName();
            b.put(channelschema.getColumnName(), channelschema.getColumnName());
        }

        d = (new StringBuilder(" CREATE VIEW PublisherAndEdition AS SELECT * FROM PublisherChannel LEFT JOIN ")).append((new StringBuilder("(SELECT ")).append(ts.a("NumDSnapsAlias", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME)).append((new StringBuilder(" AS ")).append(ChannelSchema.PUBLISHER_NAME.getColumnName()).toString()).append(',').append(ts.a("NumDSnapsAlias", com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.EDITION_ID)).append((new StringBuilder(" AS ")).append(ChannelSchema.CURRENT_EDITION_ID.getColumnName()).toString()).append(',').append(ts.a("NumDSnapsAlias", ChannelSchema.NUM_CHUNKS)).append((new StringBuilder(" AS ")).append(ChannelSchema.NUM_CHUNKS.getColumnName()).toString()).append(" FROM ").append((new StringBuilder("(SELECT ")).append(ts.a("Edition", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME)).append((new StringBuilder(" AS ")).append(com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME.getColumnName()).toString()).append(", MIN(").append(com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.TIME_ADDED.getColumnName()).append(") AS ").append(com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.TIME_ADDED.getColumnName()).append(" FROM Edition GROUP BY ").append(ts.a("Edition", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME)).append(") AS OldestEditionAlias")).append(" INNER JOIN ").append((new StringBuilder("(SELECT ")).append(ts.a("DSnapsEditionAlias", com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.EDITION_ID)).append((new StringBuilder(" AS ")).append(com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.EDITION_ID.getColumnName()).toString()).append(',').append(ts.a("DSnapsEditionAlias", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME)).append((new StringBuilder(" AS ")).append(com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME.getColumnName()).toString()).append(',').append(ts.a("DSnapsEditionAlias", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.TIME_ADDED)).append((new StringBuilder(" AS ")).append(com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.TIME_ADDED.getColumnName()).toString()).append(',').append(" COUNT(*) AS ").append(ChannelSchema.NUM_CHUNKS.getColumnName()).append(" FROM ").append((new StringBuilder("(SELECT ")).append(ts.a("EditionChunk", com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.EDITION_ID)).append((new StringBuilder(" AS ")).append(com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.EDITION_ID.getColumnName()).toString()).append(',').append(ts.a("Edition", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME)).append((new StringBuilder(" AS ")).append(com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME.getColumnName()).toString()).append(',').append(ts.a("Edition", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.TIME_ADDED)).append((new StringBuilder(" AS ")).append(com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.TIME_ADDED.getColumnName()).toString()).append(',').append(ts.a("EditionChunk", com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.ID)).append((new StringBuilder(" AS ")).append(com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.ID.getColumnName()).toString()).append(" FROM Edition INNER JOIN EditionChunk ON ").append(ts.a("Edition", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.ID)).append('=').append(ts.a("EditionChunk", com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.EDITION_ID)).append(") AS DSnapsEditionAlias")).append(" GROUP BY ").append(ts.a("DSnapsEditionAlias", com.snapchat.android.discover.model.database.table.EditionChunkTable.EditionChunkSchema.EDITION_ID)).append(") AS NumDSnapsAlias")).append(" ON ").append(ts.a("OldestEditionAlias", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME)).append('=').append(ts.a("NumDSnapsAlias", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.PUBLISHER_NAME)).append(" AND ").append(ts.a("OldestEditionAlias", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.TIME_ADDED)).append('=').append(ts.a("NumDSnapsAlias", com.snapchat.android.discover.model.database.table.EditionTable.EditionSchema.TIME_ADDED)).append(") AS OldestEditionQueriesAlias")).append(" ON ").append(ts.a("PublisherChannel", com.snapchat.android.discover.model.database.table.PublisherChannelTable.PublisherChannelSchema.NAME)).append('=').append(ts.a("OldestEditionQueriesAlias", ChannelSchema.PUBLISHER_NAME)).toString();
    }
}

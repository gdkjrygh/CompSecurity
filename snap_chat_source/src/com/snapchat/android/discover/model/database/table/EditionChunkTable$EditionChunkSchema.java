// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            EditionChunkTable

public static final class c extends Enum
    implements tt
{

    private static final AD_TARGETING $VALUES[];
    public static final AD_TARGETING AD_KEY;
    public static final AD_TARGETING AD_LINE_ITEM_ID;
    public static final AD_TARGETING AD_PLACEMENT_ID;
    public static final AD_TARGETING AD_POSITION;
    public static final AD_TARGETING AD_TARGETING;
    public static final AD_TARGETING AD_TYPE;
    public static final AD_TARGETING AD_UNIT_ID;
    public static final AD_TARGETING COLOR;
    public static final AD_TARGETING EDITION_ID;
    public static final AD_TARGETING HASH;
    public static final AD_TARGETING ID;
    public static final AD_TARGETING POSITION;
    public static final AD_TARGETING STATUS;
    public static final AD_TARGETING URL;
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
        return (b)Enum.valueOf(com/snapchat/android/discover/model/database/table/EditionChunkTable$EditionChunkSchema, s);
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
        ID = new <init>("ID", "_id", DataType.TEXT, "PRIMARY KEY");
        EDITION_ID = new <init>("EDITION_ID", 1, "edition_id", DataType.TEXT);
        URL = new <init>("URL", 2, "url", DataType.TEXT);
        HASH = new <init>("HASH", 3, "hash", DataType.TEXT);
        AD_KEY = new <init>("AD_KEY", 4, "ad_key", DataType.TEXT);
        AD_PLACEMENT_ID = new <init>("AD_PLACEMENT_ID", 5, "ad_placement_id", DataType.TEXT);
        AD_LINE_ITEM_ID = new <init>("AD_LINE_ITEM_ID", 6, "ad_line_item_id", DataType.TEXT);
        COLOR = new <init>("COLOR", 7, "color", DataType.TEXT);
        AD_TYPE = new <init>("AD_TYPE", 8, "ad_type", DataType.INTEGER);
        AD_POSITION = new <init>("AD_POSITION", 9, "ad_position", DataType.INTEGER);
        POSITION = new <init>("POSITION", 10, "position", DataType.INTEGER);
        STATUS = new <init>("STATUS", 11, "status", DataType.TEXT);
        AD_UNIT_ID = new <init>("AD_UNIT_ID", 12, "ad_unit_id", DataType.TEXT);
        AD_TARGETING = new <init>("AD_TARGETING", 13, "targeting_parameters", DataType.MAP);
        $VALUES = (new .VALUES[] {
            ID, EDITION_ID, URL, HASH, AD_KEY, AD_PLACEMENT_ID, AD_LINE_ITEM_ID, COLOR, AD_TYPE, AD_POSITION, 
            POSITION, STATUS, AD_UNIT_ID, AD_TARGETING
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

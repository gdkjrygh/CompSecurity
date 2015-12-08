// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            StoryMetadataTable

public static final class d extends Enum
    implements tt
{

    private static final IS_LIVE_AND_EXPLORER_ENABLED $VALUES[];
    public static final IS_LIVE_AND_EXPLORER_ENABLED AD_INTERVAL_INDEX;
    public static final IS_LIVE_AND_EXPLORER_ENABLED DISPLAY_NAME;
    public static final IS_LIVE_AND_EXPLORER_ENABLED HAS_CUSTOM_DESCRIPTION;
    public static final IS_LIVE_AND_EXPLORER_ENABLED ID;
    public static final IS_LIVE_AND_EXPLORER_ENABLED IS_LIVE_AND_EXPLORER_ENABLED;
    public static final IS_LIVE_AND_EXPLORER_ENABLED IS_LOCAL;
    public static final IS_LIVE_AND_EXPLORER_ENABLED NEXT_AD_OPPORTUNITY_POSITION;
    public static final IS_LIVE_AND_EXPLORER_ENABLED NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY;
    public static final IS_LIVE_AND_EXPLORER_ENABLED SERIALIZED_AD_METADATA;
    public static final IS_LIVE_AND_EXPLORER_ENABLED SHARED_ID;
    public static final IS_LIVE_AND_EXPLORER_ENABLED THUMBNAILS;
    private int a;
    private String b;
    private DataType c;
    private String d;

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/snapchat/android/database/table/StoryMetadataTable$StoryMetadataTableSchema, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
    }

    public final String getColumnName()
    {
        return b;
    }

    public final int getColumnNumber()
    {
        return a;
    }

    public final String getConstraints()
    {
        return d;
    }

    public final DataType getDataType()
    {
        return c;
    }

    static 
    {
        ID = new <init>("ID", "username", DataType.TEXT, "PRIMARY KEY");
        SERIALIZED_AD_METADATA = new <init>("SERIALIZED_AD_METADATA", 1, 1, "adMetadata", DataType.TEXT);
        AD_INTERVAL_INDEX = new <init>("AD_INTERVAL_INDEX", 2, 2, "adIntervalIndex", DataType.INTEGER);
        THUMBNAILS = new <init>("THUMBNAILS", 3, 3, "thumbnails", DataType.TEXT);
        NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY = new <init>("NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY", 4, 4, "numSnapsSinceLastAdOpportunity", DataType.INTEGER);
        NEXT_AD_OPPORTUNITY_POSITION = new <init>("NEXT_AD_OPPORTUNITY_POSITION", 5, 5, "nextAdOpportunityPosition", DataType.INTEGER);
        DISPLAY_NAME = new <init>("DISPLAY_NAME", 6, 6, "display_name", DataType.TEXT);
        SHARED_ID = new <init>("SHARED_ID", 7, 7, "shared_id", DataType.TEXT);
        IS_LOCAL = new <init>("IS_LOCAL", 8, 8, "is_local", DataType.BOOLEAN);
        HAS_CUSTOM_DESCRIPTION = new <init>("HAS_CUSTOM_DESCRIPTION", 9, 9, "has_custom_description", DataType.BOOLEAN);
        IS_LIVE_AND_EXPLORER_ENABLED = new <init>("IS_LIVE_AND_EXPLORER_ENABLED", 10, 10, "is_live_and_explorer_enabled", DataType.BOOLEAN);
        $VALUES = (new .VALUES[] {
            ID, SERIALIZED_AD_METADATA, AD_INTERVAL_INDEX, THUMBNAILS, NUM_SNAPS_SINCE_LAST_AD_OPPORTUNITY, NEXT_AD_OPPORTUNITY_POSITION, DISPLAY_NAME, SHARED_ID, IS_LOCAL, HAS_CUSTOM_DESCRIPTION, 
            IS_LIVE_AND_EXPLORER_ENABLED
        });
    }

    private (String s, int i, int j, String s1, DataType datatype)
    {
        super(s, i);
        a = j;
        b = s1;
        c = datatype;
    }

    private c(String s, String s1, DataType datatype, String s2)
    {
        super(s, 0);
        a = 0;
        b = s1;
        c = datatype;
        d = s2;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.vtable;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.vtable:
//            DSnapPageVirtualTable

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
    public static final AD_TARGETING LONGFORM_MEDIA_TYPE;
    public static final AD_TARGETING LONGFORM_URI;
    public static final AD_TARGETING LONGFORM_VIDEO_ID;
    public static final AD_TARGETING POSITION;
    public static final AD_TARGETING PUBLISHER_NAME;
    public static final AD_TARGETING SHAREABLE;
    public static final AD_TARGETING TOP_SNAP_DOCKING;
    public static final AD_TARGETING TOP_SNAP_MEDIA_TYPE;
    public static final AD_TARGETING TOP_SNAP_MODE;
    public static final AD_TARGETING TOP_SNAP_OVERLAY_DOCKING;
    public static final AD_TARGETING TOP_SNAP_OVERLAY_URI;
    public static final AD_TARGETING TOP_SNAP_URI;
    public static final AD_TARGETING TOP_SNAP_VIDEO_FIRST_FRAME_URI;
    public static final AD_TARGETING TOP_SNAP_VIDEO_SHARE_FRAME_URI;
    public static final AD_TARGETING TYPE;
    public static final AD_TARGETING URL;
    private String a;
    private DataType b;
    private String c;

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/snapchat/android/discover/model/database/vtable/DSnapPageVirtualTable$DSnapPageSchema, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
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
        TYPE = new <init>("TYPE", 1, "type", DataType.TEXT);
        PUBLISHER_NAME = new <init>("PUBLISHER_NAME", 2, "publisher_name", DataType.TEXT);
        POSITION = new <init>("POSITION", 3, "position", DataType.INTEGER);
        EDITION_ID = new <init>("EDITION_ID", 4, "edition_id", DataType.TEXT);
        URL = new <init>("URL", 5, "url", DataType.TEXT);
        HASH = new <init>("HASH", 6, "hash", DataType.TEXT);
        AD_KEY = new <init>("AD_KEY", 7, "ad_key", DataType.TEXT);
        AD_PLACEMENT_ID = new <init>("AD_PLACEMENT_ID", 8, "ad_placement_id", DataType.TEXT);
        AD_LINE_ITEM_ID = new <init>("AD_LINE_ITEM_ID", 9, "ad_line_item_id", DataType.TEXT);
        COLOR = new <init>("COLOR", 10, "color", DataType.TEXT);
        AD_TYPE = new <init>("AD_TYPE", 11, "ad_type", DataType.INTEGER);
        AD_POSITION = new <init>("AD_POSITION", 12, "ad_position", DataType.INTEGER);
        SHAREABLE = new <init>("SHAREABLE", 13, "shareable", DataType.BOOLEAN);
        TOP_SNAP_URI = new <init>("TOP_SNAP_URI", 14, "top_snap_uri", DataType.TEXT);
        TOP_SNAP_MEDIA_TYPE = new <init>("TOP_SNAP_MEDIA_TYPE", 15, "top_snap_media_type", DataType.TEXT);
        TOP_SNAP_DOCKING = new <init>("TOP_SNAP_DOCKING", 16, "top_snap_docking", DataType.TEXT);
        TOP_SNAP_MODE = new <init>("TOP_SNAP_MODE", 17, "top_snap_mode", DataType.TEXT);
        TOP_SNAP_VIDEO_FIRST_FRAME_URI = new <init>("TOP_SNAP_VIDEO_FIRST_FRAME_URI", 18, "top_snap_video_first_frame_uri", DataType.TEXT);
        TOP_SNAP_VIDEO_SHARE_FRAME_URI = new <init>("TOP_SNAP_VIDEO_SHARE_FRAME_URI", 19, "top_snap_video_share_frame_uri", DataType.TEXT);
        TOP_SNAP_OVERLAY_URI = new <init>("TOP_SNAP_OVERLAY_URI", 20, "top_snap_overlay_uri", DataType.TEXT);
        TOP_SNAP_OVERLAY_DOCKING = new <init>("TOP_SNAP_OVERLAY_DOCKING", 21, "top_snap_overlay_docking", DataType.TEXT);
        LONGFORM_URI = new <init>("LONGFORM_URI", 22, "longform_uri", DataType.TEXT);
        LONGFORM_MEDIA_TYPE = new <init>("LONGFORM_MEDIA_TYPE", 23, "longform_media_type", DataType.TEXT);
        LONGFORM_VIDEO_ID = new <init>("LONGFORM_VIDEO_ID", 24, "longform_video_id", DataType.TEXT);
        AD_UNIT_ID = new <init>("AD_UNIT_ID", 25, "ad_unit_id", DataType.TEXT);
        AD_TARGETING = new <init>("AD_TARGETING", 26, "targeting_parameters", DataType.MAP);
        $VALUES = (new .VALUES[] {
            ID, TYPE, PUBLISHER_NAME, POSITION, EDITION_ID, URL, HASH, AD_KEY, AD_PLACEMENT_ID, AD_LINE_ITEM_ID, 
            COLOR, AD_TYPE, AD_POSITION, SHAREABLE, TOP_SNAP_URI, TOP_SNAP_MEDIA_TYPE, TOP_SNAP_DOCKING, TOP_SNAP_MODE, TOP_SNAP_VIDEO_FIRST_FRAME_URI, TOP_SNAP_VIDEO_SHARE_FRAME_URI, 
            TOP_SNAP_OVERLAY_URI, TOP_SNAP_OVERLAY_DOCKING, LONGFORM_URI, LONGFORM_MEDIA_TYPE, LONGFORM_VIDEO_ID, AD_UNIT_ID, AD_TARGETING
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

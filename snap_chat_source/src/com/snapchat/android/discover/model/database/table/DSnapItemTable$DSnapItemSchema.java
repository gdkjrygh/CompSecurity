// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            DSnapItemTable

public static final class c extends Enum
    implements tt
{

    private static final HASH $VALUES[];
    public static final HASH DOCKING;
    public static final HASH FORM;
    public static final HASH HASH;
    public static final HASH ID;
    public static final HASH MEDIA_TYPE;
    public static final HASH MODE;
    public static final HASH OVERLAY_DOCKING;
    public static final HASH OVERLAY_URI;
    public static final HASH URI;
    public static final HASH VIDEO_FIRST_FRAME_URI;
    public static final HASH VIDEO_ID;
    public static final HASH VIDEO_SHARE_FRAME_URI;
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
        return (b)Enum.valueOf(com/snapchat/android/discover/model/database/table/DSnapItemTable$DSnapItemSchema, s);
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
        FORM = new <init>("FORM", 1, "form", DataType.TEXT);
        MEDIA_TYPE = new <init>("MEDIA_TYPE", 2, "media_type", DataType.TEXT);
        URI = new <init>("URI", 3, "uri", DataType.TEXT);
        VIDEO_ID = new <init>("VIDEO_ID", 4, "video_id", DataType.TEXT);
        DOCKING = new <init>("DOCKING", 5, "docking", DataType.TEXT);
        MODE = new <init>("MODE", 6, "mode", DataType.TEXT);
        VIDEO_FIRST_FRAME_URI = new <init>("VIDEO_FIRST_FRAME_URI", 7, "video_first_frame_uri", DataType.TEXT);
        VIDEO_SHARE_FRAME_URI = new <init>("VIDEO_SHARE_FRAME_URI", 8, "video_share_frame_uri", DataType.TEXT);
        OVERLAY_URI = new <init>("OVERLAY_URI", 9, "overlay_uri", DataType.TEXT);
        OVERLAY_DOCKING = new <init>("OVERLAY_DOCKING", 10, "overlay_docking", DataType.TEXT);
        HASH = new <init>("HASH", 11, "hash", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            ID, FORM, MEDIA_TYPE, URI, VIDEO_ID, DOCKING, MODE, VIDEO_FIRST_FRAME_URI, VIDEO_SHARE_FRAME_URI, OVERLAY_URI, 
            OVERLAY_DOCKING, HASH
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

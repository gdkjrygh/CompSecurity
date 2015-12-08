// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            SnapbryoTable

public static final class c extends Enum
    implements tt
{

    private static final SNAP_ORIENTAITION_DEGREES $VALUES[];
    public static final SNAP_ORIENTAITION_DEGREES CAMERA_ORIENTATION_DEGREES;
    public static final SNAP_ORIENTAITION_DEGREES CAPTION_TEXT;
    public static final SNAP_ORIENTAITION_DEGREES CLIENT_ID;
    public static final SNAP_ORIENTAITION_DEGREES IS_DISCOVER_SNAP;
    public static final SNAP_ORIENTAITION_DEGREES IS_FLASH_ON;
    public static final SNAP_ORIENTAITION_DEGREES IS_FRONT_FACING;
    public static final SNAP_ORIENTAITION_DEGREES IS_MUTED;
    public static final SNAP_ORIENTAITION_DEGREES IS_ZIP_UPLOAD;
    public static final SNAP_ORIENTAITION_DEGREES POST_STATUS;
    public static final SNAP_ORIENTAITION_DEGREES RECIPIENTS;
    public static final SNAP_ORIENTAITION_DEGREES RETRIED;
    public static final SNAP_ORIENTAITION_DEGREES SEND_STATUS;
    public static final SNAP_ORIENTAITION_DEGREES SNAP_ORIENTAITION_DEGREES;
    public static final SNAP_ORIENTAITION_DEGREES STORY_GROUPS;
    public static final SNAP_ORIENTAITION_DEGREES TIME;
    public static final SNAP_ORIENTAITION_DEGREES TIMER_VALUE;
    public static final SNAP_ORIENTAITION_DEGREES TIME_OF_FIRST_ATTEMPT;
    public static final SNAP_ORIENTAITION_DEGREES TIME_OF_LAST_ATTEMPT;
    public static final SNAP_ORIENTAITION_DEGREES UPLOAD_STATUS;
    public static final SNAP_ORIENTAITION_DEGREES VIDEO_URI;
    private int a;
    private String b;
    private DataType c;

    static String a(c c1)
    {
        return c1.b;
    }

    static DataType b(b b1)
    {
        return b1.c;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/snapchat/android/database/table/SnapbryoTable$SnapbryoSchema, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
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
        return null;
    }

    public final DataType getDataType()
    {
        return c;
    }

    static 
    {
        CLIENT_ID = new <init>("CLIENT_ID", 0, 1, "ClientId", DataType.TEXT);
        TIME = new <init>("TIME", 1, 2, "Time", DataType.TEXT);
        VIDEO_URI = new <init>("VIDEO_URI", 2, 3, "VideoUri", DataType.TEXT);
        RECIPIENTS = new <init>("RECIPIENTS", 3, 4, "Recipients", DataType.TEXT);
        STORY_GROUPS = new <init>("STORY_GROUPS", 4, 5, "StoryGroups", DataType.TEXT);
        UPLOAD_STATUS = new <init>("UPLOAD_STATUS", 5, 6, "UploadStatus", DataType.INTEGER);
        SEND_STATUS = new <init>("SEND_STATUS", 6, 7, "SendStatus", DataType.INTEGER);
        POST_STATUS = new <init>("POST_STATUS", 7, 8, "PostStatus", DataType.INTEGER);
        IS_MUTED = new <init>("IS_MUTED", 8, 9, "IsMuted", DataType.BOOLEAN);
        IS_ZIP_UPLOAD = new <init>("IS_ZIP_UPLOAD", 9, 10, "HasBeenZipped", DataType.BOOLEAN);
        TIMER_VALUE = new <init>("TIMER_VALUE", 10, 11, "TimerValueOrDuration", DataType.REAL);
        CAPTION_TEXT = new <init>("CAPTION_TEXT", 11, 12, "CaptionText", DataType.TEXT);
        TIME_OF_FIRST_ATTEMPT = new <init>("TIME_OF_FIRST_ATTEMPT", 12, 13, "TimeOfFirstAttempt", DataType.TEXT);
        TIME_OF_LAST_ATTEMPT = new <init>("TIME_OF_LAST_ATTEMPT", 13, 14, "TimeOfLastAttempt", DataType.TEXT);
        RETRIED = new <init>("RETRIED", 14, 15, "Retried", DataType.BOOLEAN);
        IS_DISCOVER_SNAP = new <init>("IS_DISCOVER_SNAP", 15, 16, "IsDiscoverSnap", DataType.BOOLEAN);
        IS_FRONT_FACING = new <init>("IS_FRONT_FACING", 16, 17, "isFrontFacing", DataType.BOOLEAN);
        IS_FLASH_ON = new <init>("IS_FLASH_ON", 17, 18, "IsFlashOn", DataType.BOOLEAN);
        CAMERA_ORIENTATION_DEGREES = new <init>("CAMERA_ORIENTATION_DEGREES", 18, 19, "CameraOrientation", DataType.INTEGER);
        SNAP_ORIENTAITION_DEGREES = new <init>("SNAP_ORIENTAITION_DEGREES", 19, 20, "SnapOrientation", DataType.INTEGER);
        $VALUES = (new .VALUES[] {
            CLIENT_ID, TIME, VIDEO_URI, RECIPIENTS, STORY_GROUPS, UPLOAD_STATUS, SEND_STATUS, POST_STATUS, IS_MUTED, IS_ZIP_UPLOAD, 
            TIMER_VALUE, CAPTION_TEXT, TIME_OF_FIRST_ATTEMPT, TIME_OF_LAST_ATTEMPT, RETRIED, IS_DISCOVER_SNAP, IS_FRONT_FACING, IS_FLASH_ON, CAMERA_ORIENTATION_DEGREES, SNAP_ORIENTAITION_DEGREES
        });
    }

    private (String s, int i, int j, String s1, DataType datatype)
    {
        super(s, i);
        a = j;
        b = s1;
        c = datatype;
    }
}

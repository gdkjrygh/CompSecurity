// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            ReceivedSnapTable

public static final class d extends Enum
    implements tt
{

    private static final ES_ID $VALUES[];
    public static final ES_ID BROADCAST_HIDE_TIMER;
    public static final ES_ID BROADCAST_MEDIA_URL;
    public static final ES_ID BROADCAST_SECONDARY_TEXT;
    public static final ES_ID BROADCAST_TEXT;
    public static final ES_ID BROADCAST_URL;
    public static final ES_ID CAPTION_TEXT;
    public static final ES_ID CONVERSATION_ID;
    public static final ES_ID DISPLAY_TIME;
    public static final ES_ID ES_ID;
    public static final ES_ID FILTER_ID;
    public static final ES_ID ID;
    public static final ES_ID IS_LAST_SNAP_IN_STACK;
    public static final ES_ID IS_PAID_TO_REPLAY;
    public static final ES_ID IS_SCREENSHOTTED;
    public static final ES_ID IS_UPDATED;
    public static final ES_ID IS_ZIPPED;
    public static final ES_ID MEDIA_TYPE;
    public static final ES_ID REPLAY_PURCHASE_RECEIPT;
    public static final ES_ID SENDER;
    public static final ES_ID SENT_TIMESTAMP;
    public static final ES_ID STATUS;
    public static final ES_ID TARGET_VIEW;
    public static final ES_ID TIMESTAMP;
    public static final ES_ID VIEWED_TIMESTAMP;
    private int a;
    private String b;
    private DataType c;
    private String d;

    static String a(d d1)
    {
        return d1.b;
    }

    static DataType b(b b1)
    {
        return b1.c;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/snapchat/android/database/table/ReceivedSnapTable$SnapSchema, s);
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
        return d;
    }

    public final DataType getDataType()
    {
        return c;
    }

    static 
    {
        ID = new <init>("ID", "_id", DataType.TEXT, "PRIMARY KEY");
        TIMESTAMP = new <init>("TIMESTAMP", 1, 1, "Timestamp", DataType.INTEGER);
        MEDIA_TYPE = new <init>("MEDIA_TYPE", 2, 2, "MediaType", DataType.INTEGER);
        IS_ZIPPED = new <init>("IS_ZIPPED", 3, 3, "IsZipped", DataType.BOOLEAN);
        STATUS = new <init>("STATUS", 4, 4, "Status", DataType.TEXT);
        SENDER = new <init>("SENDER", 5, 5, "Sender", DataType.TEXT);
        DISPLAY_TIME = new <init>("DISPLAY_TIME", 6, 6, "DisplayTime", DataType.REAL);
        CAPTION_TEXT = new <init>("CAPTION_TEXT", 7, 7, "CaptionText", DataType.TEXT);
        IS_SCREENSHOTTED = new <init>("IS_SCREENSHOTTED", 8, 8, "IsScreenshotted", DataType.BOOLEAN);
        IS_UPDATED = new <init>("IS_UPDATED", 9, 9, "IsUpdated", DataType.BOOLEAN);
        VIEWED_TIMESTAMP = new <init>("VIEWED_TIMESTAMP", 10, 10, "ViewedTimestamp", DataType.INTEGER);
        CONVERSATION_ID = new <init>("CONVERSATION_ID", 11, 11, "ConversationId", DataType.TEXT);
        SENT_TIMESTAMP = new <init>("SENT_TIMESTAMP", 12, 12, "SentTimestamp", DataType.INTEGER);
        TARGET_VIEW = new <init>("TARGET_VIEW", 13, 13, "TargetView", DataType.TEXT);
        BROADCAST_MEDIA_URL = new <init>("BROADCAST_MEDIA_URL", 14, 14, "BroadcastMediaUrl", DataType.TEXT);
        BROADCAST_URL = new <init>("BROADCAST_URL", 15, 15, "BroadcastUrl", DataType.TEXT);
        BROADCAST_TEXT = new <init>("BROADCAST_TEXT", 16, 16, "BroadcastText", DataType.TEXT);
        BROADCAST_HIDE_TIMER = new <init>("BROADCAST_HIDE_TIMER", 17, 17, "BroadcastHideTimer", DataType.BOOLEAN);
        FILTER_ID = new <init>("FILTER_ID", 18, 18, "FilterId", DataType.TEXT);
        REPLAY_PURCHASE_RECEIPT = new <init>("REPLAY_PURCHASE_RECEIPT", 19, 19, "ReplayPurchaseReceipt", DataType.TEXT);
        IS_PAID_TO_REPLAY = new <init>("IS_PAID_TO_REPLAY", 20, 20, "IsPaidToReplay", DataType.BOOLEAN);
        IS_LAST_SNAP_IN_STACK = new <init>("IS_LAST_SNAP_IN_STACK", 21, 21, "IsLastSnapInStack", DataType.BOOLEAN);
        BROADCAST_SECONDARY_TEXT = new <init>("BROADCAST_SECONDARY_TEXT", 22, 22, "BroadcastSecondaryText", DataType.TEXT);
        ES_ID = new <init>("ES_ID", 23, 23, "ESnapId", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            ID, TIMESTAMP, MEDIA_TYPE, IS_ZIPPED, STATUS, SENDER, DISPLAY_TIME, CAPTION_TEXT, IS_SCREENSHOTTED, IS_UPDATED, 
            VIEWED_TIMESTAMP, CONVERSATION_ID, SENT_TIMESTAMP, TARGET_VIEW, BROADCAST_MEDIA_URL, BROADCAST_URL, BROADCAST_TEXT, BROADCAST_HIDE_TIMER, FILTER_ID, REPLAY_PURCHASE_RECEIPT, 
            IS_PAID_TO_REPLAY, IS_LAST_SNAP_IN_STACK, BROADCAST_SECONDARY_TEXT, ES_ID
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

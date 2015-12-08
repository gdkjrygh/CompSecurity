// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            SentSnapTable

public static final class d extends Enum
    implements tt
{

    private static final IS_SCREENSHOTTED $VALUES[];
    public static final IS_SCREENSHOTTED CLIENT_ID;
    public static final IS_SCREENSHOTTED CONVERSATION_ID;
    public static final IS_SCREENSHOTTED DISPLAY_TIME;
    public static final IS_SCREENSHOTTED ID;
    public static final IS_SCREENSHOTTED IS_SCREENSHOTTED;
    public static final IS_SCREENSHOTTED IS_ZIPPED;
    public static final IS_SCREENSHOTTED MEDIA_TYPE;
    public static final IS_SCREENSHOTTED RECIPIENT;
    public static final IS_SCREENSHOTTED SENT_TIMESTAMP;
    public static final IS_SCREENSHOTTED STATUS;
    public static final IS_SCREENSHOTTED TARGET_VIEW;
    public static final IS_SCREENSHOTTED TIMESTAMP;
    public static final IS_SCREENSHOTTED TIME_OF_LAST_SEND_ATTEMPT;
    public static final IS_SCREENSHOTTED URI;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/SentSnapTable$SnapSchema, s);
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
        CLIENT_ID = new <init>("CLIENT_ID", 1, 1, "ClientId", DataType.TEXT);
        TIMESTAMP = new <init>("TIMESTAMP", 2, 2, "Timestamp", DataType.INTEGER);
        MEDIA_TYPE = new <init>("MEDIA_TYPE", 3, 3, "MediaType", DataType.INTEGER);
        STATUS = new <init>("STATUS", 4, 4, "Status", DataType.TEXT);
        RECIPIENT = new <init>("RECIPIENT", 5, 5, "Recipient", DataType.TEXT);
        DISPLAY_TIME = new <init>("DISPLAY_TIME", 6, 6, "DisplayTime", DataType.REAL);
        URI = new <init>("URI", 7, 7, "Uri", DataType.TEXT);
        TIME_OF_LAST_SEND_ATTEMPT = new <init>("TIME_OF_LAST_SEND_ATTEMPT", 8, 8, "TimeOfLastSendAttempt", DataType.INTEGER);
        IS_ZIPPED = new <init>("IS_ZIPPED", 9, 9, "IsZipped", DataType.INTEGER);
        CONVERSATION_ID = new <init>("CONVERSATION_ID", 10, 10, "ConversationId", DataType.TEXT);
        SENT_TIMESTAMP = new <init>("SENT_TIMESTAMP", 11, 11, "SentTimestamp", DataType.INTEGER);
        TARGET_VIEW = new <init>("TARGET_VIEW", 12, 12, "TargetView", DataType.TEXT);
        IS_SCREENSHOTTED = new <init>("IS_SCREENSHOTTED", 13, 13, "IsScreenshotted", DataType.BOOLEAN);
        $VALUES = (new .VALUES[] {
            ID, CLIENT_ID, TIMESTAMP, MEDIA_TYPE, STATUS, RECIPIENT, DISPLAY_TIME, URI, TIME_OF_LAST_SEND_ATTEMPT, IS_ZIPPED, 
            CONVERSATION_ID, SENT_TIMESTAMP, TARGET_VIEW, IS_SCREENSHOTTED
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

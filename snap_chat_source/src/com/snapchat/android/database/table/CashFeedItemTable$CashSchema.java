// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            CashFeedItemTable

public static final class d extends Enum
    implements tt
{

    private static final IS_FAIL_SEND_RELEASE_MESSAGE $VALUES[];
    public static final IS_FAIL_SEND_RELEASE_MESSAGE AMOUNT;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE CURRENCY_CODE;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE ID;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE IS_FAIL_SEND_RELEASE_MESSAGE;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE IS_FROM_SERVER;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE IS_SAVED_BY_RECIPIENT;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE IS_SAVED_BY_SENDER;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE IS_VIEWED_BY_RECIPIENT;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE IS_VIEWED_BY_SENDER;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE ITER_TOKEN;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE PROVIDER;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE RECIPIENT;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE RECIPIENT_ID;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE RECIPIENT_SAVE_VERSION;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE SENDER;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE SENDER_ID;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE SENDER_SAVE_VERSION;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE SEND_RECEIVE_STATUS;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE STATUS;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE TARGET_VIEW;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE TIMESTAMP;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE UPDATED_TIMESTAMP;
    public static final IS_FAIL_SEND_RELEASE_MESSAGE USER_TEXT;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/CashFeedItemTable$CashSchema, s);
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
        RECIPIENT = new <init>("RECIPIENT", 1, 1, "recipient", DataType.TEXT);
        SENDER = new <init>("SENDER", 2, 2, "sender", DataType.TEXT);
        RECIPIENT_ID = new <init>("RECIPIENT_ID", 3, 3, "recipient_id", DataType.TEXT);
        SENDER_ID = new <init>("SENDER_ID", 4, 4, "sender_id", DataType.TEXT);
        AMOUNT = new <init>("AMOUNT", 5, 5, "amount", DataType.INTEGER);
        CURRENCY_CODE = new <init>("CURRENCY_CODE", 6, 6, "currency_code", DataType.TEXT);
        USER_TEXT = new <init>("USER_TEXT", 7, 7, "text", DataType.TEXT);
        IS_VIEWED_BY_SENDER = new <init>("IS_VIEWED_BY_SENDER", 8, 8, "sender_viewed", DataType.BOOLEAN);
        IS_VIEWED_BY_RECIPIENT = new <init>("IS_VIEWED_BY_RECIPIENT", 9, 9, "recipient_viewed", DataType.BOOLEAN);
        IS_SAVED_BY_SENDER = new <init>("IS_SAVED_BY_SENDER", 10, 10, "sender_saved", DataType.BOOLEAN);
        IS_SAVED_BY_RECIPIENT = new <init>("IS_SAVED_BY_RECIPIENT", 11, 11, "recipient_saved", DataType.BOOLEAN);
        SENDER_SAVE_VERSION = new <init>("SENDER_SAVE_VERSION", 12, 12, "sender_save_version", DataType.INTEGER);
        RECIPIENT_SAVE_VERSION = new <init>("RECIPIENT_SAVE_VERSION", 13, 13, "recipient_save_version", DataType.INTEGER);
        STATUS = new <init>("STATUS", 14, 14, "status", DataType.TEXT);
        TIMESTAMP = new <init>("TIMESTAMP", 15, 15, "timestamp", DataType.INTEGER);
        UPDATED_TIMESTAMP = new <init>("UPDATED_TIMESTAMP", 16, 16, "updated_timestamp", DataType.INTEGER);
        IS_FROM_SERVER = new <init>("IS_FROM_SERVER", 17, 17, "is_from_server", DataType.BOOLEAN);
        ITER_TOKEN = new <init>("ITER_TOKEN", 18, 18, "iter_token", DataType.TEXT);
        TARGET_VIEW = new <init>("TARGET_VIEW", 19, 19, "target_view", DataType.TEXT);
        SEND_RECEIVE_STATUS = new <init>("SEND_RECEIVE_STATUS", 20, 20, "send_receive_status", DataType.TEXT);
        PROVIDER = new <init>("PROVIDER", 21, 21, "provider", DataType.TEXT);
        IS_FAIL_SEND_RELEASE_MESSAGE = new <init>("IS_FAIL_SEND_RELEASE_MESSAGE", 22, 22, "fail_send_release_message", DataType.BOOLEAN);
        $VALUES = (new .VALUES[] {
            ID, RECIPIENT, SENDER, RECIPIENT_ID, SENDER_ID, AMOUNT, CURRENCY_CODE, USER_TEXT, IS_VIEWED_BY_SENDER, IS_VIEWED_BY_RECIPIENT, 
            IS_SAVED_BY_SENDER, IS_SAVED_BY_RECIPIENT, SENDER_SAVE_VERSION, RECIPIENT_SAVE_VERSION, STATUS, TIMESTAMP, UPDATED_TIMESTAMP, IS_FROM_SERVER, ITER_TOKEN, TARGET_VIEW, 
            SEND_RECEIVE_STATUS, PROVIDER, IS_FAIL_SEND_RELEASE_MESSAGE
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            NotificationTable

public static final class c extends Enum
    implements tt
{

    private static final CHAT_SEQ_NUM $VALUES[];
    public static final CHAT_SEQ_NUM CASH_AMOUNT;
    public static final CHAT_SEQ_NUM CHAT_MESSAGE_ID;
    public static final CHAT_SEQ_NUM CHAT_SEQ_NUM;
    public static final CHAT_SEQ_NUM ID;
    public static final CHAT_SEQ_NUM NINJA_MODE;
    public static final CHAT_SEQ_NUM SENDER;
    public static final CHAT_SEQ_NUM SENDER_USERNAME;
    public static final CHAT_SEQ_NUM TEXT;
    public static final CHAT_SEQ_NUM TIMESTAMP;
    public static final CHAT_SEQ_NUM TYPE;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/NotificationTable$NotificationSchema, s);
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
        ID = new <init>("ID", 0, 0, "_id", DataType.TEXT);
        TIMESTAMP = new <init>("TIMESTAMP", 1, 1, "timestamp", DataType.INTEGER);
        SENDER = new <init>("SENDER", 2, 2, "sender", DataType.TEXT);
        SENDER_USERNAME = new <init>("SENDER_USERNAME", 3, 3, "sender_username", DataType.TEXT);
        TEXT = new <init>("TEXT", 4, 4, "text", DataType.TEXT);
        CHAT_MESSAGE_ID = new <init>("CHAT_MESSAGE_ID", 5, 5, "chat_message_id", DataType.TEXT);
        TYPE = new <init>("TYPE", 6, 6, "type", DataType.TEXT);
        NINJA_MODE = new <init>("NINJA_MODE", 7, 7, "ninja_mode", DataType.INTEGER);
        CASH_AMOUNT = new <init>("CASH_AMOUNT", 8, 8, "cash_amount", DataType.TEXT);
        CHAT_SEQ_NUM = new <init>("CHAT_SEQ_NUM", 9, 9, "chat_seq_num", DataType.INTEGER);
        $VALUES = (new .VALUES[] {
            ID, TIMESTAMP, SENDER, SENDER_USERNAME, TEXT, CHAT_MESSAGE_ID, TYPE, NINJA_MODE, CASH_AMOUNT, CHAT_SEQ_NUM
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

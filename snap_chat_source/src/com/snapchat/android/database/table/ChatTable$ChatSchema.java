// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            ChatTable

public static final class d extends Enum
    implements tt
{

    private static final LINK_CONTENT $VALUES[];
    public static final LINK_CONTENT ACK_ID;
    public static final LINK_CONTENT CONVERSATION_ID;
    public static final LINK_CONTENT HAS_LINKS;
    public static final LINK_CONTENT ID;
    public static final LINK_CONTENT IS_RELEASED_BY_RECIPIENT;
    public static final LINK_CONTENT IS_SAVED_BY_RECIPIENT;
    public static final LINK_CONTENT IS_SAVED_BY_SENDER;
    public static final LINK_CONTENT IS_ZIPPED;
    public static final LINK_CONTENT ITER_TOKEN;
    public static final LINK_CONTENT LINK_CONTENT;
    public static final LINK_CONTENT MEDIA_HEIGHT;
    public static final LINK_CONTENT MEDIA_ID;
    public static final LINK_CONTENT MEDIA_TYPE;
    public static final LINK_CONTENT MEDIA_WIDTH;
    public static final LINK_CONTENT RECIPIENT;
    public static final LINK_CONTENT RECIPIENT_MESSAGE_STATE_VERSION;
    public static final LINK_CONTENT RELEASED_TIMESTAMP;
    public static final LINK_CONTENT SENDER;
    public static final LINK_CONTENT SENDER_MESSAGE_STATE_VERSION;
    public static final LINK_CONTENT SEND_RECEIVE_STATUS;
    public static final LINK_CONTENT SEQ_NUM;
    public static final LINK_CONTENT STATUS_TEXT;
    public static final LINK_CONTENT TARGET_VIEW;
    public static final LINK_CONTENT TEXT_FORMAT;
    public static final LINK_CONTENT TIMESTAMP;
    public static final LINK_CONTENT TYPE;
    public static final LINK_CONTENT USER_TEXT;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/ChatTable$ChatSchema, s);
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
        TYPE = new <init>("TYPE", 1, 1, "type", DataType.TEXT);
        ACK_ID = new <init>("ACK_ID", 2, 2, "ack_id", DataType.TEXT);
        RECIPIENT = new <init>("RECIPIENT", 3, 3, "recipient", DataType.TEXT);
        SENDER = new <init>("SENDER", 4, 4, "sender", DataType.TEXT);
        IS_SAVED_BY_SENDER = new <init>("IS_SAVED_BY_SENDER", 5, 5, "is_saved_by_sender", DataType.BOOLEAN);
        IS_SAVED_BY_RECIPIENT = new <init>("IS_SAVED_BY_RECIPIENT", 6, 6, "is_saved_by_recipient", DataType.BOOLEAN);
        IS_RELEASED_BY_RECIPIENT = new <init>("IS_RELEASED_BY_RECIPIENT", 7, 7, "is_released_by_recipient", DataType.BOOLEAN);
        SEND_RECEIVE_STATUS = new <init>("SEND_RECEIVE_STATUS", 8, 8, "send_receive_status", DataType.TEXT);
        TIMESTAMP = new <init>("TIMESTAMP", 9, 9, "timestamp", DataType.INTEGER);
        SEQ_NUM = new <init>("SEQ_NUM", 10, 10, "seq_num", DataType.INTEGER);
        USER_TEXT = new <init>("USER_TEXT", 11, 11, "text", DataType.TEXT);
        MEDIA_ID = new <init>("MEDIA_ID", 12, 12, "media_id", DataType.TEXT);
        CONVERSATION_ID = new <init>("CONVERSATION_ID", 13, 13, "conversation_id", DataType.TEXT);
        SENDER_MESSAGE_STATE_VERSION = new <init>("SENDER_MESSAGE_STATE_VERSION", 14, 14, "sender_message_state_version", DataType.INTEGER);
        RECIPIENT_MESSAGE_STATE_VERSION = new <init>("RECIPIENT_MESSAGE_STATE_VERSION", 15, 15, "recipient_message_state_version", DataType.INTEGER);
        ITER_TOKEN = new <init>("ITER_TOKEN", 16, 16, "iter_token", DataType.TEXT);
        HAS_LINKS = new <init>("HAS_LINKS", 17, 17, "has_links", DataType.BOOLEAN);
        TARGET_VIEW = new <init>("TARGET_VIEW", 18, 18, "target_view", DataType.TEXT);
        RELEASED_TIMESTAMP = new <init>("RELEASED_TIMESTAMP", 19, 19, "released_timestamp", DataType.INTEGER);
        STATUS_TEXT = new <init>("STATUS_TEXT", 20, 20, "status_text", DataType.TEXT);
        MEDIA_TYPE = new <init>("MEDIA_TYPE", 21, 21, "media_type", DataType.TEXT);
        MEDIA_WIDTH = new <init>("MEDIA_WIDTH", 22, 22, "media_width", DataType.INTEGER);
        MEDIA_HEIGHT = new <init>("MEDIA_HEIGHT", 23, 23, "media_height", DataType.INTEGER);
        TEXT_FORMAT = new <init>("TEXT_FORMAT", 24, 24, "text_format", DataType.TEXT);
        IS_ZIPPED = new <init>("IS_ZIPPED", 25, 25, "is_zipped", DataType.BOOLEAN);
        LINK_CONTENT = new <init>("LINK_CONTENT", 26, 26, "link_content", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            ID, TYPE, ACK_ID, RECIPIENT, SENDER, IS_SAVED_BY_SENDER, IS_SAVED_BY_RECIPIENT, IS_RELEASED_BY_RECIPIENT, SEND_RECEIVE_STATUS, TIMESTAMP, 
            SEQ_NUM, USER_TEXT, MEDIA_ID, CONVERSATION_ID, SENDER_MESSAGE_STATE_VERSION, RECIPIENT_MESSAGE_STATE_VERSION, ITER_TOKEN, HAS_LINKS, TARGET_VIEW, RELEASED_TIMESTAMP, 
            STATUS_TEXT, MEDIA_TYPE, MEDIA_WIDTH, MEDIA_HEIGHT, TEXT_FORMAT, IS_ZIPPED, LINK_CONTENT
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

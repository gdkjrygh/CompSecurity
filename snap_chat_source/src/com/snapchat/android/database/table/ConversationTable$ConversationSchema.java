// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            ConversationTable

public static final class d extends Enum
    implements tt
{

    private static final CONVERSATION_INTERACTION_EVENT_TYPE $VALUES[];
    public static final CONVERSATION_INTERACTION_EVENT_TYPE CHATS_ITER_TOKEN;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE CONVERSATION_INTERACTION_EVENT_TYPE;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE HAS_UNVIEWED_AUDIO_SNAPS;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE HAS_UNVIEWED_CASH;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE HAS_UNVIEWED_CHATS;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE HAS_UNVIEWED_SNAPS;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE ID;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE ITER_TOKEN;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE MY_LAST_ACKED_SEQ_NUM;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE MY_LAST_SEQ_NUM;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE RECIPIENT;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE SENDER;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE SEQ_NUM_STATE;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE THEIR_LAST_SEQ_NUM;
    public static final CONVERSATION_INTERACTION_EVENT_TYPE TIMESTAMP;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/ConversationTable$ConversationSchema, s);
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
        SENDER = new <init>("SENDER", 1, 1, "sender", DataType.TEXT);
        RECIPIENT = new <init>("RECIPIENT", 2, 2, "recipient", DataType.TEXT);
        TIMESTAMP = new <init>("TIMESTAMP", 3, 3, "timestamp", DataType.INTEGER);
        HAS_UNVIEWED_CHATS = new <init>("HAS_UNVIEWED_CHATS", 4, 4, "has_unviewed_chats", DataType.BOOLEAN);
        HAS_UNVIEWED_SNAPS = new <init>("HAS_UNVIEWED_SNAPS", 5, 5, "has_unviewed_snaps", DataType.BOOLEAN);
        HAS_UNVIEWED_AUDIO_SNAPS = new <init>("HAS_UNVIEWED_AUDIO_SNAPS", 6, 6, "has_unviewed_audio_snap", DataType.BOOLEAN);
        HAS_UNVIEWED_CASH = new <init>("HAS_UNVIEWED_CASH", 7, 7, "has_unviewed_cash", DataType.BOOLEAN);
        ITER_TOKEN = new <init>("ITER_TOKEN", 8, 8, "iter_token", DataType.TEXT);
        CHATS_ITER_TOKEN = new <init>("CHATS_ITER_TOKEN", 9, 9, "chats_iter_token", DataType.TEXT);
        LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED = new <init>("LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED", 10, 10, "last_seq_num_of_my_chat_they_released", DataType.INTEGER);
        LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED = new <init>("LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED", 11, 11, "last_seq_num_of_their_chat_i_released", DataType.INTEGER);
        LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED = new <init>("LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED", 12, 12, "last_seq_num_of_my_chat_i_deleted", DataType.INTEGER);
        LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED = new <init>("LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED", 13, 13, "last_seq_num_of_their_chat_i_deleted", DataType.INTEGER);
        LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED = new <init>("LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED", 14, 14, "last_timestamp_of_sent_snap_read_receipt_i_deleted", DataType.INTEGER);
        LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED = new <init>("LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED", 15, 15, "last_timestamp_of_received_snap_read_receipt_i_deleted", DataType.INTEGER);
        MY_LAST_SEQ_NUM = new <init>("MY_LAST_SEQ_NUM", 16, 16, "my_last_seq_num", DataType.INTEGER);
        THEIR_LAST_SEQ_NUM = new <init>("THEIR_LAST_SEQ_NUM", 17, 17, "their_last_seq_num", DataType.INTEGER);
        MY_LAST_ACKED_SEQ_NUM = new <init>("MY_LAST_ACKED_SEQ_NUM", 18, 18, "my_last_acked_seq_num", DataType.INTEGER);
        SEQ_NUM_STATE = new <init>("SEQ_NUM_STATE", 19, 19, "seq_num_state", DataType.TEXT);
        CONVERSATION_INTERACTION_EVENT_TYPE = new <init>("CONVERSATION_INTERACTION_EVENT_TYPE", 20, 20, "CONVERSATION_INTERACTION_EVENT_TYPE", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            ID, SENDER, RECIPIENT, TIMESTAMP, HAS_UNVIEWED_CHATS, HAS_UNVIEWED_SNAPS, HAS_UNVIEWED_AUDIO_SNAPS, HAS_UNVIEWED_CASH, ITER_TOKEN, CHATS_ITER_TOKEN, 
            LAST_SEQ_NUM_OF_MY_CHAT_THEY_RELEASED, LAST_SEQ_NUM_OF_THEIR_CHAT_I_RELEASED, LAST_SEQ_NUM_OF_MY_CHAT_I_DELETED, LAST_SEQ_NUM_OF_THEIR_CHAT_I_DELETED, LAST_TIMESTAMP_OF_SENT_SNAP_READ_RECEIPT_I_DELETED, LAST_TIMESTAMP_OF_RECEIVED_SNAP_READ_RECEIPT_I_DELETED, MY_LAST_SEQ_NUM, THEIR_LAST_SEQ_NUM, MY_LAST_ACKED_SEQ_NUM, SEQ_NUM_STATE, 
            CONVERSATION_INTERACTION_EVENT_TYPE
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

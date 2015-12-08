// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            ClearedChatIdsTable

public static final class d extends Enum
    implements tt
{

    private static final TIMESTAMP $VALUES[];
    public static final TIMESTAMP CONVERSATION_ID;
    public static final TIMESTAMP ID;
    public static final TIMESTAMP TIMESTAMP;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/ClearedChatIdsTable$ClearedChatIdsSchema, s);
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
        ID = new <init>("ID", "_id", DataType.TEXT, "PRIMARY_KEY");
        CONVERSATION_ID = new <init>("CONVERSATION_ID", 1, 1, "conversationId", DataType.TEXT);
        TIMESTAMP = new <init>("TIMESTAMP", 2, 2, "timestamp", DataType.INTEGER);
        $VALUES = (new .VALUES[] {
            ID, CONVERSATION_ID, TIMESTAMP
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

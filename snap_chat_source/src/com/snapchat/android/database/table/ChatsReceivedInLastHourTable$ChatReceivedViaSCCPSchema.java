// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            ChatsReceivedInLastHourTable

public static final class d extends Enum
    implements tt
{

    private static final SENDER_USERNAME $VALUES[];
    public static final SENDER_USERNAME ID;
    public static final SENDER_USERNAME SENDER_USERNAME;
    public static final SENDER_USERNAME TIMESTAMP;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/ChatsReceivedInLastHourTable$ChatReceivedViaSCCPSchema, s);
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
        TIMESTAMP = new <init>("TIMESTAMP", 1, 1, "timestamp", DataType.INTEGER);
        SENDER_USERNAME = new <init>("SENDER_USERNAME", 2, 2, "sender_username", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            ID, TIMESTAMP, SENDER_USERNAME
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

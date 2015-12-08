// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            FindFriendRequestCacheTable

public static final class d extends Enum
    implements tt
{

    private static final REQUEST_TIMESTAMP $VALUES[];
    public static final REQUEST_TIMESTAMP HASHED_NUMBER;
    public static final REQUEST_TIMESTAMP REQUEST_TIMESTAMP;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/FindFriendRequestCacheTable$NumberToTimestampSchema, s);
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
        HASHED_NUMBER = new <init>("HASHED_NUMBER", "hashedPhoneNumber", DataType.TEXT, "PRIMARY KEY");
        REQUEST_TIMESTAMP = new <init>("REQUEST_TIMESTAMP", "requestTimestamp", DataType.LONG);
        $VALUES = (new .VALUES[] {
            HASHED_NUMBER, REQUEST_TIMESTAMP
        });
    }

    private (String s, String s1, DataType datatype)
    {
        super(s, 1);
        a = 1;
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

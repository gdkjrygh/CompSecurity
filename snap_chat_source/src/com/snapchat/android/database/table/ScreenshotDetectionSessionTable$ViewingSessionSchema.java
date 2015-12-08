// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            ScreenshotDetectionSessionTable

public static final class c extends Enum
    implements tt
{

    private static final EXTRA $VALUES[];
    public static final EXTRA END_TIME;
    public static final EXTRA EXTRA;
    public static final EXTRA SENDER;
    public static final EXTRA START_TIME;
    public static final EXTRA TYPE;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/ScreenshotDetectionSessionTable$ViewingSessionSchema, s);
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
        SENDER = new <init>("SENDER", 0, 1, "Sender", DataType.TEXT);
        START_TIME = new <init>("START_TIME", 1, 2, "StartTime", DataType.INTEGER);
        END_TIME = new <init>("END_TIME", 2, 3, "EndTime", DataType.INTEGER);
        TYPE = new <init>("TYPE", 3, 4, "Type", DataType.TEXT);
        EXTRA = new <init>("EXTRA", 4, 5, "Extra", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            SENDER, START_TIME, END_TIME, TYPE, EXTRA
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

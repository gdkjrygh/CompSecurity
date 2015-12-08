// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            UpdateSnapsAnalyticsTable

public static final class c extends Enum
    implements tt
{

    private static final EVENT_LEVELS_BLOB $VALUES[];
    public static final EVENT_LEVELS_BLOB EVENT_LEVELS_BLOB;
    public static final EVENT_LEVELS_BLOB EVENT_NAME;
    public static final EVENT_LEVELS_BLOB EVENT_PARAMETERS;
    public static final EVENT_LEVELS_BLOB EVENT_TIMERS_BLOB;
    public static final EVENT_LEVELS_BLOB EVENT_TIMESTAMP;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/UpdateSnapsAnalyticsTable$AnalyticsEventSchema, s);
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
        EVENT_NAME = new <init>("EVENT_NAME", 0, 1, "EventName", DataType.TEXT);
        EVENT_PARAMETERS = new <init>("EVENT_PARAMETERS", 1, 2, "EventParameters", DataType.TEXT);
        EVENT_TIMESTAMP = new <init>("EVENT_TIMESTAMP", 2, 3, "EventTimestamp", DataType.TEXT);
        EVENT_TIMERS_BLOB = new <init>("EVENT_TIMERS_BLOB", 3, 4, "EventTimersBlob", DataType.BLOB);
        EVENT_LEVELS_BLOB = new <init>("EVENT_LEVELS_BLOB", 4, 5, "EventLevelsBlob", DataType.BLOB);
        $VALUES = (new .VALUES[] {
            EVENT_NAME, EVENT_PARAMETERS, EVENT_TIMESTAMP, EVENT_TIMERS_BLOB, EVENT_LEVELS_BLOB
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            DSnapViewStateTable

public static final class c extends Enum
    implements tt
{

    private static final TIME_LAST_VIEWED_MILLISECONDS $VALUES[];
    public static final TIME_LAST_VIEWED_MILLISECONDS ID;
    public static final TIME_LAST_VIEWED_MILLISECONDS TIME_LAST_VIEWED_MILLISECONDS;
    private String a;
    private DataType b;
    private String c;

    static String a(c c1)
    {
        return c1.a;
    }

    static DataType b(a a1)
    {
        return a1.b;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/snapchat/android/discover/model/database/table/DSnapViewStateTable$DSnapViewStateSchema, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    public final String getColumnName()
    {
        return a;
    }

    public final int getColumnNumber()
    {
        return ordinal();
    }

    public final String getConstraints()
    {
        return c;
    }

    public final DataType getDataType()
    {
        return b;
    }

    static 
    {
        ID = new <init>("ID", "_id", DataType.TEXT, "PRIMARY KEY");
        TIME_LAST_VIEWED_MILLISECONDS = new <init>("TIME_LAST_VIEWED_MILLISECONDS", 1, "time_last_viewed_milli", DataType.INTEGER);
        $VALUES = (new .VALUES[] {
            ID, TIME_LAST_VIEWED_MILLISECONDS
        });
    }

    private a(String s, int i, String s1, DataType datatype)
    {
        super(s, i);
        a = s1;
        b = datatype;
    }

    private b(String s, String s1, DataType datatype, String s2)
    {
        this(s, 0, s1, datatype);
        c = s2;
    }
}

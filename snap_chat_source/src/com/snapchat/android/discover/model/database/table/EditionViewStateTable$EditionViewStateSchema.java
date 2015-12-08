// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            EditionViewStateTable

public static final class c extends Enum
    implements tt
{

    private static final VIEWED_ALL_DSNAPS $VALUES[];
    public static final VIEWED_ALL_DSNAPS ID;
    public static final VIEWED_ALL_DSNAPS LAST_ID_VIEWED;
    public static final VIEWED_ALL_DSNAPS VIEWED_ALL_DSNAPS;
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
        return (b)Enum.valueOf(com/snapchat/android/discover/model/database/table/EditionViewStateTable$EditionViewStateSchema, s);
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
        LAST_ID_VIEWED = new <init>("LAST_ID_VIEWED", 1, "last_id_viewed", DataType.TEXT);
        VIEWED_ALL_DSNAPS = new <init>("VIEWED_ALL_DSNAPS", 2, "viewed_all_dsnaps", DataType.BOOLEAN);
        $VALUES = (new .VALUES[] {
            ID, LAST_ID_VIEWED, VIEWED_ALL_DSNAPS
        });
    }

    private (String s, int i, String s1, DataType datatype)
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

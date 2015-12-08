// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            IdToFileTable

public static final class c extends Enum
    implements tt
{

    private static final LAST_ACCESS_MILLISECONDS $VALUES[];
    public static final LAST_ACCESS_MILLISECONDS FILE_PATH;
    public static final LAST_ACCESS_MILLISECONDS LAST_ACCESS_MILLISECONDS;
    public static final LAST_ACCESS_MILLISECONDS SNAP_ID;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/IdToFileTable$IdToFileSchema, s);
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
        SNAP_ID = new <init>("SNAP_ID", 0, 1, "id", DataType.TEXT);
        FILE_PATH = new <init>("FILE_PATH", 1, 2, "path", DataType.TEXT);
        LAST_ACCESS_MILLISECONDS = new <init>("LAST_ACCESS_MILLISECONDS", 2, 3, "last_access", DataType.LONG);
        $VALUES = (new .VALUES[] {
            SNAP_ID, FILE_PATH, LAST_ACCESS_MILLISECONDS
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

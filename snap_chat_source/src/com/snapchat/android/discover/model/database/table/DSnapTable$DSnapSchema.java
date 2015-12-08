// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            DSnapTable

public static final class c extends Enum
    implements tt
{

    private static final SHAREABLE $VALUES[];
    public static final SHAREABLE HASH;
    public static final SHAREABLE SHAREABLE;
    public static final SHAREABLE TYPE;
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
        return (b)Enum.valueOf(com/snapchat/android/discover/model/database/table/DSnapTable$DSnapSchema, s);
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
        HASH = new <init>("HASH", "_id", DataType.TEXT, "PRIMARY KEY");
        TYPE = new <init>("TYPE", 1, "type", DataType.TEXT);
        SHAREABLE = new <init>("SHAREABLE", 2, "shareable", DataType.BOOLEAN);
        $VALUES = (new .VALUES[] {
            HASH, TYPE, SHAREABLE
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

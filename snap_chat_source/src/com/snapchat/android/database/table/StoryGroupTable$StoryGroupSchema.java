// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.database.table:
//            StoryGroupTable

public static final class d extends Enum
    implements tt
{

    private static final CUSTOM_DESCRIPTION $VALUES[];
    public static final CUSTOM_DESCRIPTION CUSTOM_DESCRIPTION;
    public static final CUSTOM_DESCRIPTION DISPLAY_NAME;
    public static final CUSTOM_DESCRIPTION ID;
    public static final CUSTOM_DESCRIPTION SHOULD_FETCH_CUSTOM_DESCRIPTION;
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
        return (c)Enum.valueOf(com/snapchat/android/database/table/StoryGroupTable$StoryGroupSchema, s);
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
        ID = new <init>("ID", "storyGroupId", DataType.TEXT, "PRIMARY KEY");
        DISPLAY_NAME = new <init>("DISPLAY_NAME", 1, 1, "displayName", DataType.TEXT);
        SHOULD_FETCH_CUSTOM_DESCRIPTION = new <init>("SHOULD_FETCH_CUSTOM_DESCRIPTION", 2, 2, "shouldFetchCustomDescription", DataType.BOOLEAN);
        CUSTOM_DESCRIPTION = new <init>("CUSTOM_DESCRIPTION", 3, 3, "customDescription", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            ID, DISPLAY_NAME, SHOULD_FETCH_CUSTOM_DESCRIPTION, CUSTOM_DESCRIPTION
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

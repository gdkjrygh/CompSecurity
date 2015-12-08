// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model.database.table;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.discover.model.database.table:
//            ChannelViewDatesTable

public static final class c extends Enum
    implements tt
{

    private static final DATE_VIEWED $VALUES[];
    public static final DATE_VIEWED DATE_VIEWED;
    public static final DATE_VIEWED ID;
    public static final DATE_VIEWED PUBLISHER_INTERNATIONAL_NAME;
    public static final DATE_VIEWED PUBLISHER_NAME;
    private String a;
    private DataType b;
    private String c;

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(com/snapchat/android/discover/model/database/table/ChannelViewDatesTable$ChannelViewDatesSchema, s);
    }

    public static c[] values()
    {
        return (c[])$VALUES.clone();
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
        ID = new <init>("ID", "_id", DataType.INTEGER, "PRIMARY KEY");
        PUBLISHER_NAME = new <init>("PUBLISHER_NAME", 1, "publisher_name", DataType.TEXT);
        PUBLISHER_INTERNATIONAL_NAME = new <init>("PUBLISHER_INTERNATIONAL_NAME", 2, "publisher_international_name", DataType.TEXT);
        DATE_VIEWED = new <init>("DATE_VIEWED", 3, "date_viewed", DataType.LONG);
        $VALUES = (new .VALUES[] {
            ID, PUBLISHER_NAME, PUBLISHER_INTERNATIONAL_NAME, DATE_VIEWED
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

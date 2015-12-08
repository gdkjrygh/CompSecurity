// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.networkmanager.consumption;

import com.snapchat.android.database.DataType;
import tt;

// Referenced classes of package com.snapchat.android.networkmanager.consumption:
//            DataConsumptionRecordTable

public static final class d extends Enum
    implements tt
{

    private static final MEDIA_TYPE $VALUES[];
    public static final MEDIA_TYPE EXPIRATION;
    public static final MEDIA_TYPE ID;
    public static final MEDIA_TYPE MEDIA_TYPE;
    public static final MEDIA_TYPE REQUEST_ID;
    public static final MEDIA_TYPE SIZE_IN_BYTES;
    public static final MEDIA_TYPE TYPE;
    private int a;
    private String b;
    private DataType c;
    private String d;

    public static d valueOf(String s)
    {
        return (d)Enum.valueOf(com/snapchat/android/networkmanager/consumption/DataConsumptionRecordTable$DataConsumptionRecordSchema, s);
    }

    public static d[] values()
    {
        return (d[])$VALUES.clone();
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
        ID = new <init>("ID", "contentKey", DataType.TEXT, "PRIMARY KEY");
        REQUEST_ID = new <init>("REQUEST_ID", 1, 1, "requestId", DataType.TEXT);
        TYPE = new <init>("TYPE", 2, 2, "type", DataType.TEXT);
        EXPIRATION = new <init>("EXPIRATION", 3, 3, "expiration", DataType.LONG);
        SIZE_IN_BYTES = new <init>("SIZE_IN_BYTES", 4, 4, "size_bytes", DataType.INTEGER);
        MEDIA_TYPE = new <init>("MEDIA_TYPE", 5, 5, "media_type", DataType.TEXT);
        $VALUES = (new .VALUES[] {
            ID, REQUEST_ID, TYPE, EXPIRATION, SIZE_IN_BYTES, MEDIA_TYPE
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

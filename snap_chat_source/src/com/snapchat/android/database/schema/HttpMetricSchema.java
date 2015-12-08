// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.schema;

import com.snapchat.android.database.DataType;
import tt;

public final class HttpMetricSchema extends Enum
    implements tt
{

    private static final HttpMetricSchema $VALUES[];
    public static final HttpMetricSchema DURATION;
    public static final HttpMetricSchema ID;
    public static final HttpMetricSchema METHOD;
    public static final HttpMetricSchema PATH;
    public static final HttpMetricSchema RECEIVED_BYTES;
    public static final HttpMetricSchema SENT_BYTES;
    public static final HttpMetricSchema STATUS_CODE;
    public static final HttpMetricSchema STATUS_LINE;
    public static final HttpMetricSchema TIMESTAMP;
    private String a;
    private DataType b;
    private String c;

    private HttpMetricSchema(String s, int i, String s1, DataType datatype)
    {
        super(s, i);
        a = s1;
        b = datatype;
    }

    private HttpMetricSchema(String s, String s1, DataType datatype, String s2)
    {
        super(s, 0);
        a = s1;
        b = datatype;
        c = s2;
    }

    public static HttpMetricSchema valueOf(String s)
    {
        return (HttpMetricSchema)Enum.valueOf(com/snapchat/android/database/schema/HttpMetricSchema, s);
    }

    public static HttpMetricSchema[] values()
    {
        return (HttpMetricSchema[])$VALUES.clone();
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
        ID = new HttpMetricSchema("ID", "_id", DataType.INTEGER, "PRIMARY KEY AUTOINCREMENT");
        TIMESTAMP = new HttpMetricSchema("TIMESTAMP", 1, "timestamp", DataType.INTEGER);
        METHOD = new HttpMetricSchema("METHOD", 2, "method", DataType.TEXT);
        PATH = new HttpMetricSchema("PATH", 3, "path", DataType.TEXT);
        SENT_BYTES = new HttpMetricSchema("SENT_BYTES", 4, "sent_bytes", DataType.INTEGER);
        RECEIVED_BYTES = new HttpMetricSchema("RECEIVED_BYTES", 5, "received_bytes", DataType.INTEGER);
        DURATION = new HttpMetricSchema("DURATION", 6, "duration", DataType.INTEGER);
        STATUS_LINE = new HttpMetricSchema("STATUS_LINE", 7, "status_line", DataType.TEXT);
        STATUS_CODE = new HttpMetricSchema("STATUS_CODE", 8, "status_code", DataType.INTEGER);
        $VALUES = (new HttpMetricSchema[] {
            ID, TIMESTAMP, METHOD, PATH, SENT_BYTES, RECEIVED_BYTES, DURATION, STATUS_LINE, STATUS_CODE
        });
    }
}

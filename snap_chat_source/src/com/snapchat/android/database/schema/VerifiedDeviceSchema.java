// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.schema;

import com.snapchat.android.database.DataType;
import tt;

public final class VerifiedDeviceSchema extends Enum
    implements tt
{

    private static final VerifiedDeviceSchema $VALUES[];
    public static final VerifiedDeviceSchema DEVICE_ID;
    public static final VerifiedDeviceSchema DEVICE_NAME;
    public static final VerifiedDeviceSchema ID;
    public static final VerifiedDeviceSchema LAST_LOGIN;
    private String a;
    private DataType b;
    private String c;

    private VerifiedDeviceSchema(String s, int i, String s1, DataType datatype)
    {
        super(s, i);
        a = s1;
        b = datatype;
    }

    private VerifiedDeviceSchema(String s, String s1, DataType datatype, String s2)
    {
        super(s, 0);
        a = s1;
        b = datatype;
        c = s2;
    }

    public static VerifiedDeviceSchema valueOf(String s)
    {
        return (VerifiedDeviceSchema)Enum.valueOf(com/snapchat/android/database/schema/VerifiedDeviceSchema, s);
    }

    public static VerifiedDeviceSchema[] values()
    {
        return (VerifiedDeviceSchema[])$VALUES.clone();
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
        ID = new VerifiedDeviceSchema("ID", "_id", DataType.INTEGER, "PRIMARY KEY AUTOINCREMENT");
        DEVICE_ID = new VerifiedDeviceSchema("DEVICE_ID", 1, "deviceID", DataType.TEXT);
        DEVICE_NAME = new VerifiedDeviceSchema("DEVICE_NAME", 2, "deviceName", DataType.TEXT);
        LAST_LOGIN = new VerifiedDeviceSchema("LAST_LOGIN", 3, "lastLogin", DataType.LONG);
        $VALUES = (new VerifiedDeviceSchema[] {
            ID, DEVICE_ID, DEVICE_NAME, LAST_LOGIN
        });
    }
}

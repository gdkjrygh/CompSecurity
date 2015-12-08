// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.datastore;


// Referenced classes of package com.google.android.apps.wallet.datastore:
//            Column

public static final class defaultValue extends Enum
{

    private static final TEXT $VALUES[];
    public static final TEXT BLOB;
    public static final TEXT INTEGER;
    public static final TEXT LONG;
    public static final TEXT REAL;
    public static final TEXT TEXT;
    private String defaultValue;

    public static defaultValue valueOf(String s)
    {
        return (defaultValue)Enum.valueOf(com/google/android/apps/wallet/datastore/Column$ColumnType, s);
    }

    public static defaultValue[] values()
    {
        return (defaultValue[])$VALUES.clone();
    }

    protected final String getDefaultValue()
    {
        return defaultValue;
    }

    static 
    {
        BLOB = new <init>("BLOB", 0, "NULL");
        INTEGER = new <init>("INTEGER", 1, "0");
        LONG = new <init>("LONG", 2, "0");
        REAL = new <init>("REAL", 3, "0.0");
        TEXT = new <init>("TEXT", 4, "NULL");
        $VALUES = (new .VALUES[] {
            BLOB, INTEGER, LONG, REAL, TEXT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        defaultValue = s1;
    }
}

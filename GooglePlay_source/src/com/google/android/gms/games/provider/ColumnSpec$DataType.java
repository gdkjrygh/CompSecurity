// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.provider;


// Referenced classes of package com.google.android.gms.games.provider:
//            ColumnSpec

public static final class  extends Enum
{

    private static final BLOB $VALUES[];
    public static final BLOB BLOB;
    public static final BLOB BOOLEAN;
    public static final BLOB INTEGER;
    public static final BLOB LONG;
    public static final BLOB STRING;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/gms/games/provider/ColumnSpec$DataType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final String toSQLiteDataType()
    {
        switch (Map.com.google.android.gms.games.provider.ColumnSpec.DataType[ordinal()])
        {
        default:
            return "TEXT";

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return "INTEGER";

        case 4: // '\004'
            return "BLOB";
        }
    }

    static 
    {
        STRING = new <init>("STRING", 0);
        BOOLEAN = new <init>("BOOLEAN", 1);
        INTEGER = new <init>("INTEGER", 2);
        LONG = new <init>("LONG", 3);
        BLOB = new <init>("BLOB", 4);
        $VALUES = (new .VALUES[] {
            STRING, BOOLEAN, INTEGER, LONG, BLOB
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

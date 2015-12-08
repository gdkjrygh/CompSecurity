// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database;


// Referenced classes of package com.snapchat.android.database:
//            DatabaseHelper

public static final class a extends Enum
{

    private static final VIEW $VALUES[];
    public static final VIEW TABLE;
    public static final VIEW VIEW;
    private final String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/snapchat/android/database/DatabaseHelper$TableType, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public final String getType()
    {
        return a;
    }

    static 
    {
        TABLE = new <init>("TABLE", 0, "table");
        VIEW = new <init>("VIEW", 1, "view");
        $VALUES = (new .VALUES[] {
            TABLE, VIEW
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}

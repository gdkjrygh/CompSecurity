// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            MPDbAdapter

public static final class mTableName extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    private final String mTableName;

    public static mTableName valueOf(String s)
    {
        return (mTableName)Enum.valueOf(com/mixpanel/android/mpmetrics/MPDbAdapter$Table, s);
    }

    public static mTableName[] values()
    {
        return (mTableName[])c.clone();
    }

    public String a()
    {
        return mTableName;
    }

    static 
    {
        a = new <init>("EVENTS", 0, "events");
        b = new <init>("PEOPLE", 1, "people");
        c = (new c[] {
            a, b
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mTableName = s1;
    }
}

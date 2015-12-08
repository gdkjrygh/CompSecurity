// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;


// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            Settings

public static final class a extends Enum
{

    private static final Above250K $VALUES[];
    public static final Above250K Above250K;
    public static final Above250K Between100KAnd150K;
    public static final Above250K Between150KAnd200K;
    public static final Above250K Between200KAnd250K;
    public static final Above250K Between25KAnd50K;
    public static final Above250K Between50KAnd75K;
    public static final Above250K Between75KAnd100K;
    public static final Above250K LessThan25K;
    public static final Above250K Unknown;
    private String a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/Settings$IncomeRange, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    public String toString()
    {
        return a;
    }

    static 
    {
        Unknown = new <init>("Unknown", 0, "unknown");
        LessThan25K = new <init>("LessThan25K", 1, "0-25");
        Between25KAnd50K = new <init>("Between25KAnd50K", 2, "25-50");
        Between50KAnd75K = new <init>("Between50KAnd75K", 3, "50-75");
        Between75KAnd100K = new <init>("Between75KAnd100K", 4, "75-100");
        Between100KAnd150K = new <init>("Between100KAnd150K", 5, "100-150");
        Between150KAnd200K = new <init>("Between150KAnd200K", 6, "150-200");
        Between200KAnd250K = new <init>("Between200KAnd250K", 7, "200-250");
        Above250K = new <init>("Above250K", 8, "250+");
        $VALUES = (new .VALUES[] {
            Unknown, LessThan25K, Between25KAnd50K, Between50KAnd75K, Between75KAnd100K, Between100KAnd150K, Between150KAnd200K, Between200KAnd250K, Above250K
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.logic;


// Referenced classes of package com.apptentive.android.sdk.module.engagement.logic:
//            ComparisonPredicate

private static final class  extends Enum
{

    private static final other $VALUES[];
    public static final other build;
    public static final other other;
    public static final other time_ago;
    public static final other total;
    public static final other version;

    public static  parse(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return other;
        }
        return s;
    }

    public static other valueOf(String s)
    {
        return (other)Enum.valueOf(com/apptentive/android/sdk/module/engagement/logic/ComparisonPredicate$ValueSubFilterType, s);
    }

    public static other[] values()
    {
        return (other[])$VALUES.clone();
    }

    static 
    {
        total = new <init>("total", 0);
        version = new <init>("version", 1);
        build = new <init>("build", 2);
        time_ago = new <init>("time_ago", 3);
        other = new <init>("other", 4);
        $VALUES = (new .VALUES[] {
            total, version, build, time_ago, other
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

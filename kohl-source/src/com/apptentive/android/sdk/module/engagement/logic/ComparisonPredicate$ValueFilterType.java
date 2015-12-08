// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.logic;


// Referenced classes of package com.apptentive.android.sdk.module.engagement.logic:
//            ComparisonPredicate

private static final class  extends Enum
{

    private static final other $VALUES[];
    public static final other invokes;
    public static final other other;

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
        return (other)Enum.valueOf(com/apptentive/android/sdk/module/engagement/logic/ComparisonPredicate$ValueFilterType, s);
    }

    public static other[] values()
    {
        return (other[])$VALUES.clone();
    }

    static 
    {
        invokes = new <init>("invokes", 0);
        other = new <init>("other", 1);
        $VALUES = (new .VALUES[] {
            invokes, other
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

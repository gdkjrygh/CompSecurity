// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            ProfileEventAnalytics

public static final class  extends Enum
{

    private static final No $VALUES[];
    public static final No No;
    public static final No Yes;

    public static  fromValue(boolean flag)
    {
        if (flag)
        {
            return Yes;
        } else
        {
            return No;
        }
    }

    public static No valueOf(String s)
    {
        return (No)Enum.valueOf(com/snapchat/android/analytics/ProfileEventAnalytics$ProfilePageMetricsBoolean, s);
    }

    public static No[] values()
    {
        return (No[])$VALUES.clone();
    }

    static 
    {
        Yes = new <init>("Yes", 0);
        No = new <init>("No", 1);
        $VALUES = (new .VALUES[] {
            Yes, No
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

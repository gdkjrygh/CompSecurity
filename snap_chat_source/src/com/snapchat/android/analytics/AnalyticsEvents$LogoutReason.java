// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.analytics;


// Referenced classes of package com.snapchat.android.analytics:
//            AnalyticsEvents

public static final class A extends Enum
{

    private static final NO_USERNAME $VALUES[];
    public static final NO_USERNAME AUTHENTICATION_ERROR;
    public static final NO_USERNAME NO_USERNAME;
    public static final NO_USERNAME USER_INITIATED;

    public static A valueOf(String s)
    {
        return (A)Enum.valueOf(com/snapchat/android/analytics/AnalyticsEvents$LogoutReason, s);
    }

    public static A[] values()
    {
        return (A[])$VALUES.clone();
    }

    static 
    {
        USER_INITIATED = new <init>("USER_INITIATED", 0);
        AUTHENTICATION_ERROR = new <init>("AUTHENTICATION_ERROR", 1);
        NO_USERNAME = new <init>("NO_USERNAME", 2);
        $VALUES = (new .VALUES[] {
            USER_INITIATED, AUTHENTICATION_ERROR, NO_USERNAME
        });
    }

    private A(String s, int i)
    {
        super(s, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.analytics;


// Referenced classes of package com.snapchat.android.discover.analytics:
//            DiscoverUsageAnalytics

public static final class  extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR COMPLETED;
    public static final ERROR ERROR;
    public static final ERROR INCOMPLETE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/android/discover/analytics/DiscoverUsageAnalytics$ViewStatus, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final boolean wasFullView()
    {
        return equals(COMPLETED);
    }

    static 
    {
        INCOMPLETE = new <init>("INCOMPLETE", 0);
        COMPLETED = new <init>("COMPLETED", 1);
        ERROR = new <init>("ERROR", 2);
        $VALUES = (new .VALUES[] {
            INCOMPLETE, COMPLETED, ERROR
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.logging;


// Referenced classes of package com.google.android.apps.wallet.logging:
//            WLog

public static final class priority extends Enum
{

    private static final ERROR $VALUES[];
    public static final ERROR DEBUG;
    public static final ERROR ERROR;
    public static final ERROR INFO;
    public static final ERROR VERBOSE;
    public static final ERROR WARN;
    private final int priority;

    public static priority valueOf(String s)
    {
        return (priority)Enum.valueOf(com/google/android/apps/wallet/logging/WLog$LogPriority, s);
    }

    public static priority[] values()
    {
        return (priority[])$VALUES.clone();
    }

    final boolean isShown()
    {
        return priority >= WLog.access$000().priority;
    }

    static 
    {
        VERBOSE = new <init>("VERBOSE", 0, 2);
        DEBUG = new <init>("DEBUG", 1, 3);
        INFO = new <init>("INFO", 2, 4);
        WARN = new <init>("WARN", 3, 5);
        ERROR = new <init>("ERROR", 4, 6);
        $VALUES = (new .VALUES[] {
            VERBOSE, DEBUG, INFO, WARN, ERROR
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        priority = j;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;


// Referenced classes of package com.google.android.play.analytics:
//            EventLogger

public static final class mServerTimeoutMs
{

    public long delayBetweenUploadsMs;
    public String logDirectoryName;
    public int mServerTimeoutMs;
    public String mServerUrl;
    public long maxStorageSize;
    public long minDelayBetweenUploadsMs;
    public long recommendedLogFileSize;

    public A()
    {
        logDirectoryName = "logs";
        maxStorageSize = 0x200000L;
        recommendedLogFileSize = 51200L;
        delayBetweenUploadsMs = 0x493e0L;
        minDelayBetweenUploadsMs = 60000L;
        mServerUrl = "https://play.googleapis.com/log";
        mServerTimeoutMs = 10000;
    }
}

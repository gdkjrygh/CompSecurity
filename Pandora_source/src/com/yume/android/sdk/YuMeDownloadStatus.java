// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;


public final class YuMeDownloadStatus extends Enum
{

    public static final YuMeDownloadStatus DOWNLOADS_IN_PROGRESS;
    public static final YuMeDownloadStatus DOWNLOADS_NOT_IN_PROGRESS;
    public static final YuMeDownloadStatus DOWNLOADS_PAUSED;
    public static final YuMeDownloadStatus NONE;
    private static final YuMeDownloadStatus a[];

    private YuMeDownloadStatus(String s, int i)
    {
        super(s, i);
    }

    public static YuMeDownloadStatus valueOf(String s)
    {
        return (YuMeDownloadStatus)Enum.valueOf(com/yume/android/sdk/YuMeDownloadStatus, s);
    }

    public static YuMeDownloadStatus[] values()
    {
        YuMeDownloadStatus ayumedownloadstatus[] = a;
        int i = ayumedownloadstatus.length;
        YuMeDownloadStatus ayumedownloadstatus1[] = new YuMeDownloadStatus[i];
        System.arraycopy(ayumedownloadstatus, 0, ayumedownloadstatus1, 0, i);
        return ayumedownloadstatus1;
    }

    static 
    {
        NONE = new YuMeDownloadStatus("NONE", 0);
        DOWNLOADS_IN_PROGRESS = new YuMeDownloadStatus("DOWNLOADS_IN_PROGRESS", 1);
        DOWNLOADS_NOT_IN_PROGRESS = new YuMeDownloadStatus("DOWNLOADS_NOT_IN_PROGRESS", 2);
        DOWNLOADS_PAUSED = new YuMeDownloadStatus("DOWNLOADS_PAUSED", 3);
        a = (new YuMeDownloadStatus[] {
            NONE, DOWNLOADS_IN_PROGRESS, DOWNLOADS_NOT_IN_PROGRESS, DOWNLOADS_PAUSED
        });
    }
}

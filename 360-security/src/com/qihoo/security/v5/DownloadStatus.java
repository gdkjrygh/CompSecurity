// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;


public final class DownloadStatus extends Enum
{

    public static final DownloadStatus DOWNLOADING;
    public static final DownloadStatus FAILED;
    public static final DownloadStatus IDLE;
    public static final DownloadStatus PAUSED;
    public static final DownloadStatus PENDING;
    public static final DownloadStatus SUCCESS;
    private static final DownloadStatus a[];

    private DownloadStatus(String s, int i)
    {
        super(s, i);
    }

    public static DownloadStatus valueOf(String s)
    {
        return (DownloadStatus)Enum.valueOf(com/qihoo/security/v5/DownloadStatus, s);
    }

    public static DownloadStatus[] values()
    {
        return (DownloadStatus[])a.clone();
    }

    static 
    {
        PENDING = new DownloadStatus("PENDING", 0);
        DOWNLOADING = new DownloadStatus("DOWNLOADING", 1);
        PAUSED = new DownloadStatus("PAUSED", 2);
        SUCCESS = new DownloadStatus("SUCCESS", 3);
        FAILED = new DownloadStatus("FAILED", 4);
        IDLE = new DownloadStatus("IDLE", 5);
        a = (new DownloadStatus[] {
            PENDING, DOWNLOADING, PAUSED, SUCCESS, FAILED, IDLE
        });
    }
}

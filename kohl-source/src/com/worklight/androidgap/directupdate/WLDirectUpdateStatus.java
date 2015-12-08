// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.directupdate;


public final class WLDirectUpdateStatus extends Enum
{

    private static final WLDirectUpdateStatus $VALUES[];
    public static final WLDirectUpdateStatus CANCELED;
    public static final WLDirectUpdateStatus DOWNLOAD_IN_PROGRESS;
    public static final WLDirectUpdateStatus FAILURE_ALREADY_IN_PROGRESS;
    public static final WLDirectUpdateStatus FAILURE_DOWNLOADING;
    public static final WLDirectUpdateStatus FAILURE_INTEGRITY;
    public static final WLDirectUpdateStatus FAILURE_NETWORK_PROBLEM;
    public static final WLDirectUpdateStatus FAILURE_NOT_ENOUGH_SPACE;
    public static final WLDirectUpdateStatus FAILURE_UNKNOWN;
    public static final WLDirectUpdateStatus FAILURE_UNZIPPING;
    public static final WLDirectUpdateStatus SUCCESS;
    public static final WLDirectUpdateStatus UNZIP_IN_PROGRESS;

    private WLDirectUpdateStatus(String s, int i)
    {
        super(s, i);
    }

    public static WLDirectUpdateStatus valueOf(String s)
    {
        return (WLDirectUpdateStatus)Enum.valueOf(com/worklight/androidgap/directupdate/WLDirectUpdateStatus, s);
    }

    public static WLDirectUpdateStatus[] values()
    {
        return (WLDirectUpdateStatus[])$VALUES.clone();
    }

    static 
    {
        DOWNLOAD_IN_PROGRESS = new WLDirectUpdateStatus("DOWNLOAD_IN_PROGRESS", 0);
        UNZIP_IN_PROGRESS = new WLDirectUpdateStatus("UNZIP_IN_PROGRESS", 1);
        SUCCESS = new WLDirectUpdateStatus("SUCCESS", 2);
        CANCELED = new WLDirectUpdateStatus("CANCELED", 3);
        FAILURE_NETWORK_PROBLEM = new WLDirectUpdateStatus("FAILURE_NETWORK_PROBLEM", 4);
        FAILURE_DOWNLOADING = new WLDirectUpdateStatus("FAILURE_DOWNLOADING", 5);
        FAILURE_NOT_ENOUGH_SPACE = new WLDirectUpdateStatus("FAILURE_NOT_ENOUGH_SPACE", 6);
        FAILURE_UNZIPPING = new WLDirectUpdateStatus("FAILURE_UNZIPPING", 7);
        FAILURE_ALREADY_IN_PROGRESS = new WLDirectUpdateStatus("FAILURE_ALREADY_IN_PROGRESS", 8);
        FAILURE_UNKNOWN = new WLDirectUpdateStatus("FAILURE_UNKNOWN", 9);
        FAILURE_INTEGRITY = new WLDirectUpdateStatus("FAILURE_INTEGRITY", 10);
        $VALUES = (new WLDirectUpdateStatus[] {
            DOWNLOAD_IN_PROGRESS, UNZIP_IN_PROGRESS, SUCCESS, CANCELED, FAILURE_NETWORK_PROBLEM, FAILURE_DOWNLOADING, FAILURE_NOT_ENOUGH_SPACE, FAILURE_UNZIPPING, FAILURE_ALREADY_IN_PROGRESS, FAILURE_UNKNOWN, 
            FAILURE_INTEGRITY
        });
    }
}

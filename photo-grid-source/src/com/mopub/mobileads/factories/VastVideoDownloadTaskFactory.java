// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads.factories;

import com.mopub.mobileads.VastVideoDownloadTask;

public class VastVideoDownloadTaskFactory
{

    private static VastVideoDownloadTaskFactory a = new VastVideoDownloadTaskFactory();

    public VastVideoDownloadTaskFactory()
    {
    }

    public static VastVideoDownloadTask create(com.mopub.mobileads.VastVideoDownloadTask.VastVideoDownloadTaskListener vastvideodownloadtasklistener)
    {
        return new VastVideoDownloadTask(vastvideodownloadtasklistener);
    }

    public static void setInstance(VastVideoDownloadTaskFactory vastvideodownloadtaskfactory)
    {
        a = vastvideodownloadtaskfactory;
    }

}

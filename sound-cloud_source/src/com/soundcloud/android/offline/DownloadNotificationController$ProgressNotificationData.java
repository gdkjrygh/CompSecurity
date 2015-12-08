// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.java.objects.MoreObjects;

// Referenced classes of package com.soundcloud.android.offline:
//            DownloadNotificationController

private static class <init>
{

    private final int currentDownload;
    private final int downloadProgress;
    private final int totalDownloads;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof <init>))
            {
                return false;
            }
            obj = (<init>)obj;
            if (!MoreObjects.equal(Integer.valueOf(currentDownload), Integer.valueOf(((currentDownload) (obj)).currentDownload)) || !MoreObjects.equal(Integer.valueOf(totalDownloads), Integer.valueOf(((totalDownloads) (obj)).totalDownloads)) || !MoreObjects.equal(Integer.valueOf(downloadProgress), Integer.valueOf(((downloadProgress) (obj)).downloadProgress)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            Integer.valueOf(currentDownload), Integer.valueOf(totalDownloads), Integer.valueOf(downloadProgress)
        });
    }




    private (int i, int j, int k)
    {
        currentDownload = i;
        totalDownloads = j;
        downloadProgress = k;
    }

    downloadProgress(int i, int j, int k, downloadProgress downloadprogress)
    {
        this(i, j, k);
    }
}

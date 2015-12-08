// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.drive:
//            DriveResource, Contents, MetadataChangeSet

public interface DriveFile
    extends DriveResource
{
    public static interface DownloadProgressListener
    {

        public abstract void onProgress(long l, long l1);
    }


    public static final int MODE_READ_ONLY = 0x10000000;
    public static final int MODE_READ_WRITE = 0x30000000;
    public static final int MODE_WRITE_ONLY = 0x20000000;

    public abstract PendingResult commitAndCloseContents(GoogleApiClient googleapiclient, Contents contents);

    public abstract PendingResult commitAndCloseContents(GoogleApiClient googleapiclient, Contents contents, MetadataChangeSet metadatachangeset);

    public abstract PendingResult discardContents(GoogleApiClient googleapiclient, Contents contents);

    public abstract PendingResult openContents(GoogleApiClient googleapiclient, int i, DownloadProgressListener downloadprogresslistener);
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive:
//            Contents, DriveFolder, DriveId, DriveFile, 
//            CreateFileActivityBuilder, OpenFileActivityBuilder, MetadataBuffer

public interface DriveApi
{
    public static interface ContentsResult
        extends Result
    {

        public abstract Contents getContents();
    }

    public static interface DriveIdResult
        extends Result
    {

        public abstract DriveId getDriveId();
    }

    public static interface MetadataBufferResult
        extends Result
    {

        public abstract MetadataBuffer getMetadataBuffer();
    }


    public abstract PendingResult discardContents(GoogleApiClient googleapiclient, Contents contents);

    public abstract PendingResult fetchDriveId(GoogleApiClient googleapiclient, String s);

    public abstract DriveFolder getAppFolder(GoogleApiClient googleapiclient);

    public abstract DriveFile getFile(GoogleApiClient googleapiclient, DriveId driveid);

    public abstract DriveFolder getFolder(GoogleApiClient googleapiclient, DriveId driveid);

    public abstract DriveFolder getRootFolder(GoogleApiClient googleapiclient);

    public abstract PendingResult newContents(GoogleApiClient googleapiclient);

    public abstract CreateFileActivityBuilder newCreateFileActivityBuilder();

    public abstract OpenFileActivityBuilder newOpenFileActivityBuilder();

    public abstract PendingResult query(GoogleApiClient googleapiclient, Query query1);

    public abstract PendingResult requestSync(GoogleApiClient googleapiclient);
}

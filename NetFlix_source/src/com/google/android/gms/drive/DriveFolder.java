// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive:
//            DriveResource, MetadataChangeSet, Contents, DriveFile

public interface DriveFolder
    extends DriveResource
{
    public static interface DriveFileResult
        extends Result
    {

        public abstract DriveFile getDriveFile();
    }

    public static interface DriveFolderResult
        extends Result
    {

        public abstract DriveFolder getDriveFolder();
    }


    public static final String MIME_TYPE = "application/vnd.google-apps.folder";

    public abstract PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, Contents contents);

    public abstract PendingResult createFolder(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset);

    public abstract PendingResult listChildren(GoogleApiClient googleapiclient);

    public abstract PendingResult queryChildren(GoogleApiClient googleapiclient, Query query);
}

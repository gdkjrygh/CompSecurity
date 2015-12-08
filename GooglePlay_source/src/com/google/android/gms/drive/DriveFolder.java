// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.drive:
//            DriveResource, MetadataChangeSet, DriveContents, ExecutionOptions, 
//            DriveFile

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


    public abstract PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents);

    public abstract PendingResult createUniqueFile$c19798a(GoogleApiClient googleapiclient, String s, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions);

    public abstract PendingResult createUniqueFolder(GoogleApiClient googleapiclient, String s, MetadataChangeSet metadatachangeset);
}

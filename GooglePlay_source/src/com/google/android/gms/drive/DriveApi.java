// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.drive.query.Query;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive:
//            DriveFolder, DriveContents, DriveId, MetadataBuffer

public interface DriveApi
{
    public static interface DriveContentsResult
        extends Result
    {

        public abstract DriveContents getDriveContents();
    }

    public static interface DriveIdResult
        extends Result
    {

        public abstract DriveId getDriveId();
    }

    public static interface MetadataBufferResult
        extends Releasable, Result
    {

        public abstract MetadataBuffer getMetadataBuffer();

        public abstract boolean moreEntriesMayExist();
    }

    public static interface ResourceIdSetResult
        extends Result
    {

        public abstract Set getExistingResourceIds();
    }


    public abstract PendingResult checkResourceIdsExist(GoogleApiClient googleapiclient, Set set);

    public abstract PendingResult fetchDriveId(GoogleApiClient googleapiclient, String s);

    public abstract DriveFolder getAppFolder(GoogleApiClient googleapiclient);

    public abstract PendingResult getDriveIdFromUniqueIdentifier$70b7f367(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult newDriveContents(GoogleApiClient googleapiclient);

    public abstract PendingResult newDriveContents(GoogleApiClient googleapiclient, int i);

    public abstract PendingResult query(GoogleApiClient googleapiclient, Query query1);
}

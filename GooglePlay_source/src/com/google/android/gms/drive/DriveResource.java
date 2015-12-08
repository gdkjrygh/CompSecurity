// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.drive:
//            DriveId, Metadata

public interface DriveResource
{
    public static interface MetadataResult
        extends Result
    {

        public abstract Metadata getMetadata();
    }


    public abstract PendingResult delete(GoogleApiClient googleapiclient);

    public abstract DriveId getDriveId();

    public abstract PendingResult getMetadata(GoogleApiClient googleapiclient);
}

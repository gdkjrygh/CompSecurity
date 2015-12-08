// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveContentsImpl, DriveClientImpl, IDriveService, CloseContentsAndUpdateMetadataRequest, 
//            StatusCallback

final class pl.StatusMethod extends pl.StatusMethod
{

    final DriveContentsImpl this$0;
    final MetadataChangeSet val$changeSetToCommit;
    final ExecutionOptions val$requestExecutionOptions;

    protected final volatile void doExecute(com.google.android.gms.common.api.l._cls2 _pcls2)
        throws RemoteException
    {
        _pcls2 = (DriveClientImpl)_pcls2;
        val$changeSetToCommit.mBag.setContext(((GmsClient) (_pcls2)).mContext);
        ((IDriveService)_pcls2.getService()).closeContentsAndUpdateMetadata(new CloseContentsAndUpdateMetadataRequest(mContents.mDriveId, val$changeSetToCommit.mBag, mContents.mRequestId, mContents.mValidForConflictDetection, val$requestExecutionOptions), new StatusCallback(this));
    }

    teMetadataRequest(ExecutionOptions executionoptions)
    {
        this$0 = final_drivecontentsimpl;
        val$changeSetToCommit = MetadataChangeSet.this;
        val$requestExecutionOptions = executionoptions;
        super(final_googleapiclient);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.Metadata;

// Referenced classes of package com.google.android.gms.drive.internal:
//            BaseDriveServiceCallbacks, DelegatingMetadata, OnMetadataResponse, DriveBaseApiMethodImpl, 
//            DriveClientImpl, IDriveService, GetMetadataRequest, DeleteResourceRequest, 
//            StatusCallback

public class DriveResourceImpl
    implements DriveResource
{
    private static final class MetadataCallback extends BaseDriveServiceCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onError(Status status)
            throws RemoteException
        {
            mResultHolder.setResult(new MetadataResultImpl(status, null));
        }

        public final void onMetadataResponse(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            mResultHolder.setResult(new MetadataResultImpl(Status.RESULT_SUCCESS, new DelegatingMetadata(onmetadataresponse.mMetadata)));
        }

        public MetadataCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = resultholder;
        }
    }

    private static final class MetadataResultImpl
        implements com.google.android.gms.drive.DriveResource.MetadataResult
    {

        private final Metadata mMetadata;
        private final Status mStatus;

        public final Metadata getMetadata()
        {
            return mMetadata;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public MetadataResultImpl(Status status, Metadata metadata)
        {
            mStatus = status;
            mMetadata = metadata;
        }
    }

    private abstract class MetadataResultMethod extends DriveBaseApiMethodImpl
    {

        final DriveResourceImpl this$0;

        public final volatile Result createFailedResult(Status status)
        {
            return new MetadataResultImpl(status, null);
        }

        private MetadataResultMethod(GoogleApiClient googleapiclient)
        {
            this$0 = DriveResourceImpl.this;
            super(googleapiclient);
        }

        MetadataResultMethod(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    protected final DriveId mDriveId;

    public DriveResourceImpl(DriveId driveid)
    {
        mDriveId = driveid;
    }

    public final PendingResult delete(GoogleApiClient googleapiclient)
    {
        return googleapiclient.execute(new DriveBaseApiMethodImpl.StatusMethod(googleapiclient) {

            final DriveResourceImpl this$0;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IDriveService)((DriveClientImpl)client).getService()).deleteResource(new DeleteResourceRequest(mDriveId), new StatusCallback(this));
            }

            
            {
                this$0 = DriveResourceImpl.this;
                super(googleapiclient);
            }
        });
    }

    public final DriveId getDriveId()
    {
        return mDriveId;
    }

    public final PendingResult getMetadata(final GoogleApiClient final_googleapiclient)
    {
        return final_googleapiclient.enqueue(new MetadataResultMethod(false) {

            final DriveResourceImpl this$0;
            final boolean val$forceFromServer = false;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IDriveService)((DriveClientImpl)client).getService()).getMetadata(new GetMetadataRequest(mDriveId, forceFromServer), new MetadataCallback(this));
            }

            
            {
                this$0 = DriveResourceImpl.this;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}

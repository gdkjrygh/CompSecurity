// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.query.Query;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveClientImpl, DriveFolderImpl, BaseDriveServiceCallbacks, DriveContentsImpl, 
//            OnContentsResponse, DriveBaseApiMethodImpl, OnDriveIdResponse, DelegatingMetadata, 
//            OnMetadataResponse, OnListEntriesResponse, OnResourceIdSetResponse, IDriveService, 
//            QueryRequest, CreateContentsRequest, GetMetadataRequest, CheckResourceIdsExistRequest, 
//            GetDriveIdFromUniqueIdentifierRequest

public final class DriveApiImpl
    implements DriveApi
{
    private static final class DriveContentsCallback extends BaseDriveServiceCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onContentsResponse(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            mResultHolder.setResult(new DriveContentsResultImpl(Status.RESULT_SUCCESS, new DriveContentsImpl(oncontentsresponse.mContents)));
        }

        public final void onError(Status status)
            throws RemoteException
        {
            mResultHolder.setResult(new DriveContentsResultImpl(status, null));
        }

        public DriveContentsCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = resultholder;
        }
    }

    static final class DriveContentsResultImpl
        implements Releasable, com.google.android.gms.drive.DriveApi.DriveContentsResult
    {

        private final DriveContents mDriveContents;
        private final Status mStatus;

        public final DriveContents getDriveContents()
        {
            return mDriveContents;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final void release()
        {
            if (mDriveContents != null)
            {
                mDriveContents.markClosedOnClient();
            }
        }

        public DriveContentsResultImpl(Status status, DriveContents drivecontents)
        {
            mStatus = status;
            mDriveContents = drivecontents;
        }
    }

    static abstract class DriveContentsResultMethod extends DriveBaseApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return new DriveContentsResultImpl(status, null);
        }

        DriveContentsResultMethod(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    static final class DriveIdCallback extends BaseDriveServiceCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onDriveIdResponse(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            mResultHolder.setResult(new DriveIdResultImpl(Status.RESULT_SUCCESS, ondriveidresponse.mId));
        }

        public final void onError(Status status)
            throws RemoteException
        {
            mResultHolder.setResult(new DriveIdResultImpl(status, null));
        }

        public final void onMetadataResponse(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            mResultHolder.setResult(new DriveIdResultImpl(Status.RESULT_SUCCESS, (new DelegatingMetadata(onmetadataresponse.mMetadata)).getDriveId()));
        }

        public DriveIdCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = resultholder;
        }
    }

    private static final class DriveIdResultImpl
        implements com.google.android.gms.drive.DriveApi.DriveIdResult
    {

        private final DriveId mDriveId;
        private final Status mStatus;

        public final DriveId getDriveId()
        {
            return mDriveId;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public DriveIdResultImpl(Status status, DriveId driveid)
        {
            mStatus = status;
            mDriveId = driveid;
        }
    }

    static abstract class DriveIdResultMethod extends DriveBaseApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return new DriveIdResultImpl(status, null);
        }

        DriveIdResultMethod(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    static final class MetadataBufferResultImpl
        implements com.google.android.gms.drive.DriveApi.MetadataBufferResult
    {

        private final MetadataBuffer mBuffer;
        private final boolean mMoreEntriesMayExist;
        private final Status mStatus;

        public final MetadataBuffer getMetadataBuffer()
        {
            return mBuffer;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public final boolean moreEntriesMayExist()
        {
            return mMoreEntriesMayExist;
        }

        public final void release()
        {
            if (mBuffer != null)
            {
                mBuffer.release();
            }
        }

        public MetadataBufferResultImpl(Status status, MetadataBuffer metadatabuffer, boolean flag)
        {
            mStatus = status;
            mBuffer = metadatabuffer;
            mMoreEntriesMayExist = flag;
        }
    }

    static abstract class MetadataBufferResultMethod extends DriveBaseApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return new MetadataBufferResultImpl(status, null, false);
        }

        MetadataBufferResultMethod(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static final class QueryResponseCallback extends BaseDriveServiceCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onError(Status status)
            throws RemoteException
        {
            mResultHolder.setResult(new MetadataBufferResultImpl(status, null, false));
        }

        public final void onListEntriesResponse(OnListEntriesResponse onlistentriesresponse)
            throws RemoteException
        {
            MetadataBuffer metadatabuffer = new MetadataBuffer(onlistentriesresponse.mEntries);
            mResultHolder.setResult(new MetadataBufferResultImpl(Status.RESULT_SUCCESS, metadatabuffer, onlistentriesresponse.mMoreEntriesMayExist));
        }

        public QueryResponseCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = resultholder;
        }
    }

    private static final class ResourceIdSetCallback extends BaseDriveServiceCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onError(Status status)
            throws RemoteException
        {
            mResultHolder.setResult(new ResourceIdSetResultImpl(status, null, (byte)0));
        }

        public final void onResourceIdSetResponse(OnResourceIdSetResponse onresourceidsetresponse)
            throws RemoteException
        {
            mResultHolder.setResult(new ResourceIdSetResultImpl(Status.RESULT_SUCCESS, new HashSet(onresourceidsetresponse.mResourceIds), (byte)0));
        }

        private ResourceIdSetCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = resultholder;
        }

        ResourceIdSetCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, byte byte0)
        {
            this(resultholder);
        }
    }

    private static final class ResourceIdSetResultImpl
        implements com.google.android.gms.drive.DriveApi.ResourceIdSetResult
    {

        private final Set mResourceIds;
        private final Status mStatus;

        public final Set getExistingResourceIds()
        {
            return mResourceIds;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        private ResourceIdSetResultImpl(Status status, Set set)
        {
            mStatus = status;
            mResourceIds = set;
        }

        ResourceIdSetResultImpl(Status status, Set set, byte byte0)
        {
            this(status, set);
        }
    }

    private static abstract class ResourceIdSetResultMethod extends DriveBaseApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return new ResourceIdSetResultImpl(status, null, (byte)0);
        }

        private ResourceIdSetResultMethod(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        ResourceIdSetResultMethod(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public DriveApiImpl()
    {
    }

    public final PendingResult checkResourceIdsExist(final GoogleApiClient final_googleapiclient, Set set)
    {
        return final_googleapiclient.enqueue(new ResourceIdSetResultMethod(set) {

            final DriveApiImpl this$0;
            final Set val$resourceIds;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IDriveService)((DriveClientImpl)client).getService()).checkResourceIdsExist(new CheckResourceIdsExistRequest(resourceIds), new ResourceIdSetCallback(this, (byte)0));
            }

            
            {
                this$0 = DriveApiImpl.this;
                resourceIds = set;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult fetchDriveId(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.enqueue(new DriveIdResultMethod(s) {

            final DriveApiImpl this$0;
            final String val$resourceId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IDriveService)((DriveClientImpl)client).getService()).getMetadata(new GetMetadataRequest(DriveId.createFromResourceId(resourceId), false), new DriveIdCallback(this));
            }

            
            {
                this$0 = DriveApiImpl.this;
                resourceId = s;
                super(final_googleapiclient);
            }
        });
    }

    public final DriveFolder getAppFolder(GoogleApiClient googleapiclient)
    {
        googleapiclient = (DriveClientImpl)googleapiclient.getClient(Drive.CLIENT_KEY);
        if (!((DriveClientImpl) (googleapiclient)).mIsInitComplete)
        {
            throw new IllegalStateException("Client is not yet connected");
        }
        googleapiclient = ((DriveClientImpl) (googleapiclient)).mAppDataId;
        if (googleapiclient != null)
        {
            return new DriveFolderImpl(googleapiclient);
        } else
        {
            return null;
        }
    }

    public final PendingResult getDriveIdFromUniqueIdentifier$70b7f367(final GoogleApiClient final_googleapiclient, final String uniqueIdentifier)
    {
        return final_googleapiclient.enqueue(new DriveIdResultMethod(true) {

            final DriveApiImpl this$0;
            final boolean val$isInAppFolder = true;
            final String val$uniqueIdentifier;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IDriveService)((DriveClientImpl)client).getService()).getDriveIdFromUniqueIdentifier(new GetDriveIdFromUniqueIdentifierRequest(uniqueIdentifier, isInAppFolder), new DriveIdCallback(this));
            }

            
            {
                this$0 = DriveApiImpl.this;
                uniqueIdentifier = s;
                super(final_googleapiclient);
            }
        });
    }

    public final PendingResult newDriveContents(GoogleApiClient googleapiclient)
    {
        return newDriveContents(googleapiclient, 0x20000000);
    }

    public final PendingResult newDriveContents(final GoogleApiClient final_googleapiclient, int i)
    {
        return final_googleapiclient.enqueue(new DriveContentsResultMethod(i) {

            final DriveApiImpl this$0;
            final int val$mode;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IDriveService)((DriveClientImpl)client).getService()).createContents(new CreateContentsRequest(mode), new DriveContentsCallback(this));
            }

            
            {
                this$0 = DriveApiImpl.this;
                mode = i;
                super(final_googleapiclient);
            }
        });
    }

    public final PendingResult query(final GoogleApiClient final_googleapiclient, Query query1)
    {
        if (query1 == null)
        {
            throw new IllegalArgumentException("Query must be provided.");
        } else
        {
            return final_googleapiclient.enqueue(new MetadataBufferResultMethod(query1) {

                final DriveApiImpl this$0;
                final Query val$query;

                protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    ((IDriveService)((DriveClientImpl)client).getService()).query(new QueryRequest(query), new QueryResponseCallback(this));
                }

            
            {
                this$0 = DriveApiImpl.this;
                query = query1;
                super(final_googleapiclient);
            }
            });
        }
    }
}

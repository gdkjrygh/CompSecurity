// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.io.FileOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveClientImpl, IDriveService, CloseContentsAndUpdateMetadataRequest, StatusCallback, 
//            DriveLog, CloseContentsRequest

public final class DriveContentsImpl
    implements DriveContents
{

    private boolean mClosed;
    final Contents mContents;
    private boolean mGetInputStreamCalled;
    private boolean mGetOutputStreamCalled;

    public DriveContentsImpl(Contents contents)
    {
        mClosed = false;
        mGetInputStreamCalled = false;
        mGetOutputStreamCalled = false;
        mContents = (Contents)Preconditions.checkNotNull(contents);
    }

    public final PendingResult commit(final GoogleApiClient final_googleapiclient, final MetadataChangeSet changeSetToCommit, ExecutionOptions executionoptions)
    {
        ExecutionOptions executionoptions1;
        executionoptions1 = executionoptions;
        if (executionoptions == null)
        {
            executionoptions1 = (new com.google.android.gms.drive.ExecutionOptions.Builder()).build();
        }
        if (mContents.mMode == 0x10000000)
        {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        }
        executionoptions1.mConflictStrategy;
        JVM INSTR tableswitch 1 1: default 64
    //                   1 92;
           goto _L1 _L2
_L1:
        boolean flag = false;
_L4:
        if (flag && !mContents.mValidForConflictDetection)
        {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        break; /* Loop/switch isn't completed */
_L2:
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        ExecutionOptions.checkValidCompletionEventRequest(final_googleapiclient, executionoptions1);
        if (mClosed)
        {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (mContents.mDriveId == null)
        {
            throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
        }
        if (changeSetToCommit == null)
        {
            changeSetToCommit = MetadataChangeSet.EMPTY_CHANGESET;
        }
        markClosedOnClient();
        return final_googleapiclient.execute(new DriveBaseApiMethodImpl.StatusMethod(executionoptions1) {

            final DriveContentsImpl this$0;
            final MetadataChangeSet val$changeSetToCommit;
            final ExecutionOptions val$requestExecutionOptions;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (DriveClientImpl)client;
                changeSetToCommit.mBag.setContext(((GmsClient) (client)).mContext);
                ((IDriveService)client.getService()).closeContentsAndUpdateMetadata(new CloseContentsAndUpdateMetadataRequest(mContents.mDriveId, changeSetToCommit.mBag, mContents.mRequestId, mContents.mValidForConflictDetection, requestExecutionOptions), new StatusCallback(this));
            }

            
            {
                this$0 = DriveContentsImpl.this;
                changeSetToCommit = metadatachangeset;
                requestExecutionOptions = executionoptions;
                super(final_googleapiclient);
            }
        });
    }

    public final void discard(GoogleApiClient googleapiclient)
    {
        if (mClosed)
        {
            throw new IllegalStateException("DriveContents already closed.");
        } else
        {
            markClosedOnClient();
            ((_cls4)googleapiclient.execute(new DriveBaseApiMethodImpl.StatusMethod(googleapiclient) {

                final DriveContentsImpl this$0;

                protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    ((IDriveService)((DriveClientImpl)client).getService()).closeContents(new CloseContentsRequest(mContents.mRequestId), new StatusCallback(this));
                }

            
            {
                this$0 = DriveContentsImpl.this;
                super(googleapiclient);
            }
            })).setResultCallback(new ResultCallback() {

                final DriveContentsImpl this$0;

                public final volatile void onResult(Result result)
                {
                    if (!((Status)result).isSuccess())
                    {
                        DriveLog.e("DriveContentsImpl", "Error discarding contents");
                        return;
                    } else
                    {
                        DriveLog.d("DriveContentsImpl", "Contents discarded");
                        return;
                    }
                }

            
            {
                this$0 = DriveContentsImpl.this;
                super();
            }
            });
            return;
        }
    }

    public final Contents getContents()
    {
        return mContents;
    }

    public final DriveId getDriveId()
    {
        return mContents.mDriveId;
    }

    public final int getMode()
    {
        return mContents.mMode;
    }

    public final OutputStream getOutputStream()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (mContents.mMode != 0x20000000)
        {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (mGetOutputStreamCalled)
        {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else
        {
            mGetOutputStreamCalled = true;
            return new FileOutputStream(mContents.mParcelFileDescriptor.getFileDescriptor());
        }
    }

    public final ParcelFileDescriptor getParcelFileDescriptor()
    {
        if (mClosed)
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else
        {
            return mContents.mParcelFileDescriptor;
        }
    }

    public final boolean isMarkedClosedOnClient()
    {
        return mClosed;
    }

    public final void markClosedOnClient()
    {
        IOUtils.closeQuietly(mContents.mParcelFileDescriptor);
        mClosed = true;
    }
}

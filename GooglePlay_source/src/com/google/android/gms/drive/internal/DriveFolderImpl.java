// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.metadata.internal.fields.BasicFields;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveResourceImpl, DriveContentsImpl, BaseDriveServiceCallbacks, DriveFileImpl, 
//            OnDriveIdResponse, DriveBaseApiMethodImpl, DriveClientImpl, CreateFileRequest, 
//            IDriveService, CreateFolderRequest

public final class DriveFolderImpl extends DriveResourceImpl
    implements DriveFolder
{
    private static final class CreateFileCallback extends BaseDriveServiceCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onDriveIdResponse(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            mResultHolder.setResult(new DriveFileResultImpl(Status.RESULT_SUCCESS, new DriveFileImpl(ondriveidresponse.mId)));
        }

        public final void onError(Status status)
            throws RemoteException
        {
            mResultHolder.setResult(new DriveFileResultImpl(status, null));
        }

        public CreateFileCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = resultholder;
        }
    }

    private static final class CreateFolderCallback extends BaseDriveServiceCallbacks
    {

        private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

        public final void onDriveIdResponse(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            mResultHolder.setResult(new DriveFolderResultImpl(Status.RESULT_SUCCESS, new DriveFolderImpl(ondriveidresponse.mId)));
        }

        public final void onError(Status status)
            throws RemoteException
        {
            mResultHolder.setResult(new DriveFolderResultImpl(status, null));
        }

        public CreateFolderCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
        {
            mResultHolder = resultholder;
        }
    }

    private static final class DriveFileResultImpl
        implements com.google.android.gms.drive.DriveFolder.DriveFileResult
    {

        private final DriveFile mFile;
        private final Status mStatus;

        public final DriveFile getDriveFile()
        {
            return mFile;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public DriveFileResultImpl(Status status, DriveFile drivefile)
        {
            mStatus = status;
            mFile = drivefile;
        }
    }

    static abstract class DriveFileResultMethod extends DriveBaseApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return new DriveFileResultImpl(status, null);
        }

        DriveFileResultMethod(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static final class DriveFolderResultImpl
        implements com.google.android.gms.drive.DriveFolder.DriveFolderResult
    {

        private final DriveFolder mFolder;
        private final Status mStatus;

        public final DriveFolder getDriveFolder()
        {
            return mFolder;
        }

        public final Status getStatus()
        {
            return mStatus;
        }

        public DriveFolderResultImpl(Status status, DriveFolder drivefolder)
        {
            mStatus = status;
            mFolder = drivefolder;
        }
    }

    static abstract class DriveFolderResultMethod extends DriveBaseApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return new DriveFolderResultImpl(status, null);
        }

        DriveFolderResultMethod(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public DriveFolderImpl(DriveId driveid)
    {
        super(driveid);
    }

    private PendingResult internalCreateBinaryFile(final GoogleApiClient final_googleapiclient, final MetadataChangeSet changeSet, DriveContents drivecontents, ExecutionOptions executionoptions)
    {
        final int openContentsRequestId;
        if (drivecontents != null)
        {
            if (!(drivecontents instanceof DriveContentsImpl))
            {
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if (drivecontents.getDriveId() != null)
            {
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (drivecontents.isMarkedClosedOnClient())
            {
                throw new IllegalArgumentException("DriveContents are already closed.");
            }
            openContentsRequestId = drivecontents.getContents().mRequestId;
            drivecontents.markClosedOnClient();
        } else
        {
            openContentsRequestId = 1;
        }
        if (changeSet == null)
        {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if ("application/vnd.google-apps.folder".equals(changeSet.getMimeType()))
        {
            throw new IllegalArgumentException("May not create folders (mimetype: application/vnd.google-apps.folder) using this method. Use DriveFolder.createFolder() instead.");
        } else
        {
            ExecutionOptions.checkValidCompletionEventRequest(final_googleapiclient, executionoptions);
            return final_googleapiclient.execute(new DriveFileResultMethod(executionoptions) {

                final DriveFolderImpl this$0;
                final MetadataChangeSet val$changeSet;
                final ExecutionOptions val$executionOptions;
                final int val$fileType = 0;
                final int val$openContentsRequestId;

                protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    client = (DriveClientImpl)client;
                    changeSet.mBag.setContext(((GmsClient) (client)).mContext);
                    CreateFileRequest createfilerequest = new CreateFileRequest(getDriveId(), changeSet.mBag, openContentsRequestId, fileType, executionOptions);
                    ((IDriveService)client.getService()).createFile(createfilerequest, new CreateFileCallback(this));
                }

            
            {
                this$0 = DriveFolderImpl.this;
                changeSet = metadatachangeset;
                openContentsRequestId = i;
                executionOptions = executionoptions;
                super(final_googleapiclient);
            }
            });
        }
    }

    private static void validateUniqueIdentifier(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Invalid Unique identifier provided.");
        }
        if (s.length() > 0x10000)
        {
            throw new IllegalArgumentException("Unique identifier length exceeds the max length allowed(65536)");
        } else
        {
            return;
        }
    }

    public final PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents)
    {
        ExecutionOptions executionoptions = (new com.google.android.gms.drive.ExecutionOptions.Builder()).build();
        if (executionoptions.mConflictStrategy != 0)
        {
            throw new IllegalStateException("May not set a conflict strategy for calls to createFile.");
        } else
        {
            return internalCreateBinaryFile(googleapiclient, metadatachangeset, drivecontents, executionoptions);
        }
    }

    public final PendingResult createUniqueFile$c19798a(GoogleApiClient googleapiclient, String s, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions)
    {
        ExecutionOptions executionoptions1 = executionoptions;
        if (executionoptions == null)
        {
            executionoptions1 = (new com.google.android.gms.drive.ExecutionOptions.Builder()).build();
        }
        validateUniqueIdentifier(s);
        if (!ExecutionOptions.isValidConflictStrategy(executionoptions1.mConflictStrategy))
        {
            throw new IllegalArgumentException("Invalid createStrategy.");
        }
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        executionoptions = executionoptions1.mTrackingTag;
        if (executionoptions != null && !ExecutionOptions.isValidTrackingTag(executionoptions))
        {
            throw new IllegalArgumentException("Invalid tracking tag");
        } else
        {
            metadatachangeset = MetadataChangeSet.copyOf(metadatachangeset);
            metadatachangeset.mBag.put(BasicFields.UNIQUE_IDENTIFIER, s);
            return internalCreateBinaryFile(googleapiclient, metadatachangeset, null, executionoptions1);
        }
    }

    public final PendingResult createUniqueFolder(final GoogleApiClient final_googleapiclient, String s, MetadataChangeSet metadatachangeset)
    {
        validateUniqueIdentifier(s);
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        metadatachangeset = MetadataChangeSet.copyOf(metadatachangeset);
        metadatachangeset.mBag.put(BasicFields.UNIQUE_IDENTIFIER, s);
        if (metadatachangeset.getMimeType() != null && !metadatachangeset.getMimeType().equals("application/vnd.google-apps.folder"))
        {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        } else
        {
            return final_googleapiclient.execute(new DriveFolderResultMethod(metadatachangeset) {

                final DriveFolderImpl this$0;
                final MetadataChangeSet val$changeSet;

                protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    client = (DriveClientImpl)client;
                    changeSet.mBag.setContext(((GmsClient) (client)).mContext);
                    ((IDriveService)client.getService()).createFolder(new CreateFolderRequest(getDriveId(), changeSet.mBag), new CreateFolderCallback(this));
                }

            
            {
                this$0 = DriveFolderImpl.this;
                changeSet = metadatachangeset;
                super(final_googleapiclient);
            }
            });
        }
    }
}

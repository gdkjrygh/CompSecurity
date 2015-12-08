// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            DriveResourceImpl, DriveClientImpl, IDriveService, OpenContentsRequest, 
//            OpenDriveContentsCallback, DriveServiceResponse

public final class DriveFileImpl extends DriveResourceImpl
    implements DriveFile
{

    public DriveFileImpl(DriveId driveid)
    {
        super(driveid);
    }

    public final PendingResult open$298a1a43(final GoogleApiClient final_googleapiclient, int i)
    {
        return final_googleapiclient.enqueue(new DriveApiImpl.DriveContentsResultMethod(null) {

            final DriveFileImpl this$0;
            final com.google.android.gms.drive.DriveFile.DownloadProgressListener val$callbackListener = null;
            final int val$mode;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                setCancelToken(com.google.android.gms.common.internal.ICancelToken.Stub.asInterface(((IDriveService)((DriveClientImpl)client).getService()).openContents(new OpenContentsRequest(getDriveId(), mode), new OpenDriveContentsCallback(this, callbackListener)).mCancelToken));
            }

            
            {
                this$0 = DriveFileImpl.this;
                mode = i;
                super(final_googleapiclient);
            }
        });
    }
}

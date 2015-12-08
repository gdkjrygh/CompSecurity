// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            BaseDriveServiceCallbacks, OnContentsResponse, DriveContentsImpl, OnDownloadProgressResponse

final class OpenDriveContentsCallback extends BaseDriveServiceCallbacks
{

    private final com.google.android.gms.drive.DriveFile.DownloadProgressListener mProgressListener;
    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

    OpenDriveContentsCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        mResultHolder = resultholder;
        mProgressListener = downloadprogresslistener;
    }

    public final void onContentsResponse(OnContentsResponse oncontentsresponse)
        throws RemoteException
    {
        Status status;
        if (oncontentsresponse.mOutOfDate)
        {
            status = new Status(-1);
        } else
        {
            status = Status.RESULT_SUCCESS;
        }
        mResultHolder.setResult(new DriveApiImpl.DriveContentsResultImpl(status, new DriveContentsImpl(oncontentsresponse.mContents)));
    }

    public final void onDownloadProgress(OnDownloadProgressResponse ondownloadprogressresponse)
        throws RemoteException
    {
        if (mProgressListener != null)
        {
            mProgressListener.onProgress(ondownloadprogressresponse.mBytesLoaded, ondownloadprogressresponse.mBytesExpected);
        }
    }

    public final void onError(Status status)
        throws RemoteException
    {
        mResultHolder.setResult(new DriveApiImpl.DriveContentsResultImpl(status, null));
    }
}

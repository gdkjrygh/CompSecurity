// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            BaseDriveServiceCallbacks, DriveFolderImpl, DriveFileImpl, OnDriveIdResponse

private static final class mResultHolder extends BaseDriveServiceCallbacks
{

    private final com.google.android.gms.common.api.internal.t> mResultHolder;

    public final void onDriveIdResponse(OnDriveIdResponse ondriveidresponse)
        throws RemoteException
    {
        mResultHolder.Result(new (Status.RESULT_SUCCESS, new DriveFileImpl(ondriveidresponse.mId)));
    }

    public final void onError(Status status)
        throws RemoteException
    {
        mResultHolder.Result(new (status, null));
    }

    public r(com.google.android.gms.common.api.internal. )
    {
        mResultHolder = ;
    }
}

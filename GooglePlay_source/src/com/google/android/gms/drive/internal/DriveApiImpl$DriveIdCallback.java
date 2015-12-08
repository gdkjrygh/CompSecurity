// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            BaseDriveServiceCallbacks, DriveApiImpl, OnDriveIdResponse, DelegatingMetadata, 
//            OnMetadataResponse

static final class mResultHolder extends BaseDriveServiceCallbacks
{

    private final com.google.android.gms.common.api.internal.er mResultHolder;

    public final void onDriveIdResponse(OnDriveIdResponse ondriveidresponse)
        throws RemoteException
    {
        mResultHolder.setResult(new l(Status.RESULT_SUCCESS, ondriveidresponse.mId));
    }

    public final void onError(Status status)
        throws RemoteException
    {
        mResultHolder.setResult(new l(status, null));
    }

    public final void onMetadataResponse(OnMetadataResponse onmetadataresponse)
        throws RemoteException
    {
        mResultHolder.setResult(new l(Status.RESULT_SUCCESS, (new DelegatingMetadata(onmetadataresponse.mMetadata)).getDriveId()));
    }

    public tHolder(com.google.android.gms.common.api.internal.er er)
    {
        mResultHolder = er;
    }
}

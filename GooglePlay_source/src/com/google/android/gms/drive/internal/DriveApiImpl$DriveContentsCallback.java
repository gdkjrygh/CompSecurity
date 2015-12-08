// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            BaseDriveServiceCallbacks, DriveApiImpl, DriveContentsImpl, OnContentsResponse

private static final class mResultHolder extends BaseDriveServiceCallbacks
{

    private final com.google.android.gms.common.api.internal.it> mResultHolder;

    public final void onContentsResponse(OnContentsResponse oncontentsresponse)
        throws RemoteException
    {
        mResultHolder.Result(new l(Status.RESULT_SUCCESS, new DriveContentsImpl(oncontentsresponse.mContents)));
    }

    public final void onError(Status status)
        throws RemoteException
    {
        mResultHolder.Result(new l(status, null));
    }

    public r(com.google.android.gms.common.api.internal. )
    {
        mResultHolder = ;
    }
}

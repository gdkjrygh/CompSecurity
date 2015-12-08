// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            BaseDriveServiceCallbacks, DriveClientImpl, OnSyncMoreResponse

static final class mResultHolder extends BaseDriveServiceCallbacks
{

    private final com.google.android.gms.common.api.internal.t mResultHolder;

    public final void onError(Status status)
        throws RemoteException
    {
        mResultHolder.etResult(new l(status, false));
    }

    public final void onSyncMoreResponse(OnSyncMoreResponse onsyncmoreresponse)
        throws RemoteException
    {
        mResultHolder.etResult(new l(Status.RESULT_SUCCESS, onsyncmoreresponse.mMoreEntriesMayExist));
    }

    public der(com.google.android.gms.common.api.internal.Q q)
    {
        mResultHolder = q;
    }
}

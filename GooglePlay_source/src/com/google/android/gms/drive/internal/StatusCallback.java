// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            BaseDriveServiceCallbacks

public final class StatusCallback extends BaseDriveServiceCallbacks
{

    private final com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder mResultHolder;

    public StatusCallback(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultholder)
    {
        mResultHolder = resultholder;
    }

    public final void onError(Status status)
        throws RemoteException
    {
        mResultHolder.setResult(status);
    }

    public final void onSuccess()
        throws RemoteException
    {
        mResultHolder.setResult(Status.RESULT_SUCCESS);
    }
}

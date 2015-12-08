// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.MetadataBuffer;

// Referenced classes of package com.google.android.gms.drive.internal:
//            BaseDriveServiceCallbacks, DriveApiImpl, OnListEntriesResponse

private static final class mResultHolder extends BaseDriveServiceCallbacks
{

    private final com.google.android.gms.common.api.internal.st mResultHolder;

    public final void onError(Status status)
        throws RemoteException
    {
        mResultHolder.Result(new pl(status, null, false));
    }

    public final void onListEntriesResponse(OnListEntriesResponse onlistentriesresponse)
        throws RemoteException
    {
        MetadataBuffer metadatabuffer = new MetadataBuffer(onlistentriesresponse.mEntries);
        mResultHolder.Result(new pl(Status.RESULT_SUCCESS, metadatabuffer, onlistentriesresponse.mMoreEntriesMayExist));
    }

    public r(com.google.android.gms.common.api.internal. )
    {
        mResultHolder = ;
    }
}

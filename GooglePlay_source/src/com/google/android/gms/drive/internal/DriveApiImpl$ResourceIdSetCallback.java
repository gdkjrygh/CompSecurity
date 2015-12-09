// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.drive.internal:
//            BaseDriveServiceCallbacks, DriveApiImpl, OnResourceIdSetResponse

private static final class r extends BaseDriveServiceCallbacks
{

    private final com.google.android.gms.common.api.internal.it> mResultHolder;

    public final void onError(Status status)
        throws RemoteException
    {
        mResultHolder.Result(new l(status, null, (byte)0));
    }

    public final void onResourceIdSetResponse(OnResourceIdSetResponse onresourceidsetresponse)
        throws RemoteException
    {
        mResultHolder.Result(new l(Status.RESULT_SUCCESS, new HashSet(onresourceidsetresponse.mResourceIds), (byte)0));
    }

    private r(com.google.android.gms.common.api.internal. )
    {
        mResultHolder = ;
    }

    r(com.google.android.gms.common.api.internal.ltHolder ltholder, byte byte0)
    {
        this(ltholder);
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            c, OnContentsResponse, r, OnDownloadProgressResponse

class av extends c
{

    private final com.google.android.gms.common.api.BaseImplementation.b De;
    private final com.google.android.gms.drive.DriveFile.DownloadProgressListener OU;

    av(com.google.android.gms.common.api.BaseImplementation.b b, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        De = b;
        OU = downloadprogresslistener;
    }

    public void a(OnContentsResponse oncontentsresponse)
        throws RemoteException
    {
        Status status;
        if (oncontentsresponse.ie())
        {
            status = new Status(-1);
        } else
        {
            status = Status.Jv;
        }
        De.b(new o.c(status, new r(oncontentsresponse.id())));
    }

    public void a(OnDownloadProgressResponse ondownloadprogressresponse)
        throws RemoteException
    {
        if (OU != null)
        {
            OU.onProgress(ondownloadprogressresponse._mthif(), ondownloadprogressresponse.ig());
        }
    }

    public void o(Status status)
        throws RemoteException
    {
        De.b(new o.c(status, null));
    }
}

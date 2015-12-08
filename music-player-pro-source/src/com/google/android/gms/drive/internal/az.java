// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            c, OnContentsResponse, s, OnDownloadProgressResponse

class az extends c
{

    private final com.google.android.gms.common.api.BaseImplementation.b Ea;
    private final com.google.android.gms.drive.DriveFile.DownloadProgressListener QU;

    az(com.google.android.gms.common.api.BaseImplementation.b b, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        Ea = b;
        QU = downloadprogresslistener;
    }

    public void a(OnContentsResponse oncontentsresponse)
        throws RemoteException
    {
        Status status;
        if (oncontentsresponse.iM())
        {
            status = new Status(-1);
        } else
        {
            status = Status.Kw;
        }
        Ea.b(new p.a(status, new s(oncontentsresponse.iL())));
    }

    public void a(OnDownloadProgressResponse ondownloadprogressresponse)
        throws RemoteException
    {
        if (QU != null)
        {
            QU.onProgress(ondownloadprogressresponse.iO(), ondownloadprogressresponse.iP());
        }
    }

    public void n(Status status)
        throws RemoteException
    {
        Ea.b(new p.a(status, null));
    }
}

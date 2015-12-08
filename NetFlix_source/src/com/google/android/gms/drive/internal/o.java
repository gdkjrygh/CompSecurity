// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, m, n, OpenContentsRequest, 
//            u, c, OnContentsResponse, OnDownloadProgressResponse, 
//            CloseContentsRequest, al, CloseContentsAndUpdateMetadataRequest

public class o extends r
    implements DriveFile
{
    private abstract class a extends m
    {

        final o Fr;

        public Result d(Status status)
        {
            return f(status);
        }

        public Status f(Status status)
        {
            return status;
        }

        private a()
        {
            Fr = o.this;
            super();
        }

    }

    private abstract class b extends m
    {

        final o Fr;

        public Result d(Status status)
        {
            return f(status);
        }

        public Status f(Status status)
        {
            return status;
        }

        private b()
        {
            Fr = o.this;
            super();
        }

    }

    private static class c extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.drive.DriveFile.DownloadProgressListener Ft;
        private final com.google.android.gms.common.api.a.d wH;

        public void a(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            wH.b(new l.a(Status.Bv, oncontentsresponse.fI()));
        }

        public void a(OnDownloadProgressResponse ondownloadprogressresponse)
            throws RemoteException
        {
            if (Ft != null)
            {
                Ft.onProgress(ondownloadprogressresponse.fJ(), ondownloadprogressresponse.fK());
            }
        }

        public void m(Status status)
            throws RemoteException
        {
            wH.b(new l.a(status, null));
        }

        public c(com.google.android.gms.common.api.a.d d1, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
        {
            wH = d1;
            Ft = downloadprogresslistener;
        }
    }

    private abstract class d extends m
    {

        final o Fr;

        public Result d(Status status)
        {
            return o(status);
        }

        public com.google.android.gms.drive.DriveApi.ContentsResult o(Status status)
        {
            return new l.a(status, null);
        }

        private d()
        {
            Fr = o.this;
            super();
        }

    }


    public o(DriveId driveid)
    {
        super(driveid);
    }

    public PendingResult commitAndCloseContents(GoogleApiClient googleapiclient, Contents contents)
    {
        if (contents == null)
        {
            throw new IllegalArgumentException("Contents must be provided.");
        } else
        {
            return googleapiclient.b(new b(contents) {

                final Contents Fd;
                final o Fr;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((n)a1);
                }

                protected void a(n n1)
                    throws RemoteException
                {
                    Fd.close();
                    n1.fE().a(new CloseContentsRequest(Fd, true), new al(this));
                }

            
            {
                Fr = o.this;
                Fd = contents;
                super();
            }
            });
        }
    }

    public PendingResult commitAndCloseContents(GoogleApiClient googleapiclient, Contents contents, MetadataChangeSet metadatachangeset)
    {
        if (contents == null)
        {
            throw new IllegalArgumentException("Contents must be provided.");
        } else
        {
            return googleapiclient.b(new a(contents, metadatachangeset) {

                final Contents Fd;
                final o Fr;
                final MetadataChangeSet Fs;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((n)a1);
                }

                protected void a(n n1)
                    throws RemoteException
                {
                    Fd.close();
                    n1.fE().a(new CloseContentsAndUpdateMetadataRequest(Fr.Ew, Fs.fD(), Fd), new al(this));
                }

            
            {
                Fr = o.this;
                Fd = contents;
                Fs = metadatachangeset;
                super();
            }
            });
        }
    }

    public PendingResult discardContents(GoogleApiClient googleapiclient, Contents contents)
    {
        return Drive.DriveApi.discardContents(googleapiclient, contents);
    }

    public PendingResult openContents(GoogleApiClient googleapiclient, int i, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        if (i != 0x10000000 && i != 0x20000000 && i != 0x30000000)
        {
            throw new IllegalArgumentException("Invalid mode provided.");
        } else
        {
            return googleapiclient.a(new d(i, downloadprogresslistener) {

                final int Fp;
                final com.google.android.gms.drive.DriveFile.DownloadProgressListener Fq;
                final o Fr;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((n)a1);
                }

                protected void a(n n1)
                    throws RemoteException
                {
                    n1.fE().a(new OpenContentsRequest(Fr.getDriveId(), Fp), new c(this, Fq));
                }

            
            {
                Fr = o.this;
                Fp = i;
                Fq = downloadprogresslistener;
                super();
            }
            });
        }
    }
}

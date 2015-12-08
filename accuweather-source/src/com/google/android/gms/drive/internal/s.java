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
//            v, q, r, OpenContentsRequest, 
//            aa, c, OnContentsResponse, OnDownloadProgressResponse, 
//            CloseContentsRequest, aw, CloseContentsAndUpdateMetadataRequest

public class s extends v
    implements DriveFile
{
    private abstract class a extends q
    {

        final s IZ;

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private a()
        {
            IZ = s.this;
            super();
        }

    }

    private abstract class b extends q
    {

        final s IZ;

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private b()
        {
            IZ = s.this;
            super();
        }

    }

    private static class c extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.drive.DriveFile.DownloadProgressListener Jb;
        private final com.google.android.gms.common.api.a.d yO;

        public void a(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            yO.a(new p.a(Status.Ek, oncontentsresponse.go()));
        }

        public void a(OnDownloadProgressResponse ondownloadprogressresponse)
            throws RemoteException
        {
            if (Jb != null)
            {
                Jb.onProgress(ondownloadprogressresponse.gp(), ondownloadprogressresponse.gq());
            }
        }

        public void o(Status status)
            throws RemoteException
        {
            yO.a(new p.a(status, null));
        }

        public c(com.google.android.gms.common.api.a.d d1, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
        {
            yO = d1;
            Jb = downloadprogresslistener;
        }
    }

    private abstract class d extends q
    {

        final s IZ;

        public Result c(Status status)
        {
            return q(status);
        }

        public com.google.android.gms.drive.DriveApi.ContentsResult q(Status status)
        {
            return new p.a(status, null);
        }

        private d()
        {
            IZ = s.this;
            super();
        }

    }


    public s(DriveId driveid)
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

                final Contents IJ;
                final s IZ;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    IJ.close();
                    r1.gk().a(new CloseContentsRequest(IJ, true), new aw(this));
                }

            
            {
                IZ = s.this;
                IJ = contents;
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

                final Contents IJ;
                final s IZ;
                final MetadataChangeSet Ja;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    IJ.close();
                    r1.gk().a(new CloseContentsAndUpdateMetadataRequest(IZ.Hw, Ja.gh(), IJ, false, null), new aw(this));
                }

            
            {
                IZ = s.this;
                IJ = contents;
                Ja = metadatachangeset;
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

                final int IX;
                final com.google.android.gms.drive.DriveFile.DownloadProgressListener IY;
                final s IZ;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.gk().a(new OpenContentsRequest(IZ.getDriveId(), IX), new c(this, IY));
                }

            
            {
                IZ = s.this;
                IX = i;
                IY = downloadprogresslistener;
                super();
            }
            });
        }
    }
}

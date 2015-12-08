// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;

// Referenced classes of package com.google.android.gms.drive.internal:
//            w, r, c, OnContentsResponse, 
//            OnDownloadProgressResponse, q, OpenContentsRequest, ab, 
//            av

public class s extends w
    implements DriveFile
{
    private static class a
        implements com.google.android.gms.drive.DriveFile.DownloadProgressListener
    {

        private final c OQ;

        public void onProgress(long l, long l1)
        {
            OQ.a(new com.google.android.gms.common.api.c.b(this, l, l1) {

                final long OR;
                final long OS;
                final a OT;

                public void a(com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
                {
                    downloadprogresslistener.onProgress(OR, OS);
                }

                public void d(Object obj)
                {
                    a((com.google.android.gms.drive.DriveFile.DownloadProgressListener)obj);
                }

                public void gr()
                {
                }

            
            {
                OT = a1;
                OR = l;
                OS = l1;
                super();
            }
            });
        }

        public a(c c1)
        {
            OQ = c1;
        }
    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;
        private final com.google.android.gms.drive.DriveFile.DownloadProgressListener OU;

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
            De.b(new o.a(status, oncontentsresponse.id()));
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
            De.b(new o.a(status, null));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
        {
            De = b1;
            OU = downloadprogresslistener;
        }
    }


    public s(DriveId driveid)
    {
        super(driveid);
    }

    private static com.google.android.gms.drive.DriveFile.DownloadProgressListener a(GoogleApiClient googleapiclient, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        if (downloadprogresslistener == null)
        {
            return null;
        } else
        {
            return new a(googleapiclient.c(downloadprogresslistener));
        }
    }

    public PendingResult commitAndCloseContents(GoogleApiClient googleapiclient, Contents contents)
    {
        return (new r(contents)).commit(googleapiclient, null);
    }

    public PendingResult commitAndCloseContents(GoogleApiClient googleapiclient, Contents contents, MetadataChangeSet metadatachangeset)
    {
        return (new r(contents)).commit(googleapiclient, metadatachangeset);
    }

    public PendingResult discardContents(GoogleApiClient googleapiclient, Contents contents)
    {
        return Drive.DriveApi.discardContents(googleapiclient, contents);
    }

    public PendingResult open(GoogleApiClient googleapiclient, int i, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        if (i != 0x10000000 && i != 0x20000000 && i != 0x30000000)
        {
            throw new IllegalArgumentException("Invalid mode provided.");
        } else
        {
            return googleapiclient.a(new o.d(i, a(googleapiclient, downloadprogresslistener)) {

                final com.google.android.gms.drive.DriveFile.DownloadProgressListener OO;
                final s OP;
                final int Ou;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    q1.hY().a(new OpenContentsRequest(OP.getDriveId(), Ou, 0), new av(this, OO));
                }

            
            {
                OP = s.this;
                Ou = i;
                OO = downloadprogresslistener;
                super();
            }
            });
        }
    }

    public PendingResult openContents(GoogleApiClient googleapiclient, int i, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        if (i != 0x10000000 && i != 0x20000000 && i != 0x30000000)
        {
            throw new IllegalArgumentException("Invalid mode provided.");
        } else
        {
            return googleapiclient.a(new o.b(i, a(googleapiclient, downloadprogresslistener)) {

                final com.google.android.gms.drive.DriveFile.DownloadProgressListener OO;
                final s OP;
                final int Ou;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    q1.hY().a(new OpenContentsRequest(OP.getDriveId(), Ou, 0), new b(this, OO));
                }

            
            {
                OP = s.this;
                Ou = i;
                OO = downloadprogresslistener;
                super();
            }
            });
        }
    }
}

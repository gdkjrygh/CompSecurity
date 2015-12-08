// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.d;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.internal:
//            y, r, OpenContentsRequest, az, 
//            ae

public class t extends y
    implements DriveFile
{
    private static class a
        implements com.google.android.gms.drive.DriveFile.DownloadProgressListener
    {

        private final d Qe;

        public void onProgress(long l, long l1)
        {
            Qe.a(new com.google.android.gms.common.api.d.b(this, l, l1) {

                final long Qf;
                final long Qg;
                final a Qh;

                public void a(com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
                {
                    downloadprogresslistener.onProgress(Qf, Qg);
                }

                public void c(Object obj)
                {
                    a((com.google.android.gms.drive.DriveFile.DownloadProgressListener)obj);
                }

                public void gG()
                {
                }

            
            {
                Qh = a1;
                Qf = l;
                Qg = l1;
                super();
            }
            });
        }

        public a(d d1)
        {
            Qe = d1;
        }
    }


    public t(DriveId driveid)
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
            return new a(googleapiclient.d(downloadprogresslistener));
        }
    }

    public PendingResult open(GoogleApiClient googleapiclient, int i, com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
    {
        if (i != 0x10000000 && i != 0x20000000 && i != 0x30000000)
        {
            throw new IllegalArgumentException("Invalid mode provided.");
        } else
        {
            return googleapiclient.a(new p.b(googleapiclient, i, a(googleapiclient, downloadprogresslistener)) {

                final int PG;
                final com.google.android.gms.drive.DriveFile.DownloadProgressListener Qc;
                final t Qd;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.iG().a(new OpenContentsRequest(Qd.getDriveId(), PG, 0), new az(this, Qc));
                }

            
            {
                Qd = t.this;
                PG = i;
                Qc = downloadprogresslistener;
                super(googleapiclient);
            }
            });
        }
    }
}

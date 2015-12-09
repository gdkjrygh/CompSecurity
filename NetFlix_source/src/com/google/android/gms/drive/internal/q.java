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
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SearchableField;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, l, c, o, 
//            OnDriveIdResponse, m, n, CreateFileRequest, 
//            u, CreateFolderRequest

public class q extends r
    implements DriveFolder
{
    private static class a extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d wH;

        public void a(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            wH.b(new d(Status.Bv, new o(ondriveidresponse.getDriveId())));
        }

        public void m(Status status)
            throws RemoteException
        {
            wH.b(new d(status, null));
        }

        public a(com.google.android.gms.common.api.a.d d1)
        {
            wH = d1;
        }
    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d wH;

        public void a(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            wH.b(new e(Status.Bv, new q(ondriveidresponse.getDriveId())));
        }

        public void m(Status status)
            throws RemoteException
        {
            wH.b(new e(status, null));
        }

        public b(com.google.android.gms.common.api.a.d d1)
        {
            wH = d1;
        }
    }

    private abstract class c extends m
    {

        final q Fu;

        public Result d(Status status)
        {
            return r(status);
        }

        public com.google.android.gms.drive.DriveFolder.DriveFolderResult r(Status status)
        {
            return new e(status, null);
        }

        private c()
        {
            Fu = q.this;
            super();
        }

    }

    private static class d
        implements com.google.android.gms.drive.DriveFolder.DriveFileResult
    {

        private final DriveFile Fv;
        private final Status wJ;

        public DriveFile getDriveFile()
        {
            return Fv;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public d(Status status, DriveFile drivefile)
        {
            wJ = status;
            Fv = drivefile;
        }
    }

    private static class e
        implements com.google.android.gms.drive.DriveFolder.DriveFolderResult
    {

        private final DriveFolder Fw;
        private final Status wJ;

        public DriveFolder getDriveFolder()
        {
            return Fw;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public e(Status status, DriveFolder drivefolder)
        {
            wJ = status;
            Fw = drivefolder;
        }
    }


    public q(DriveId driveid)
    {
        super(driveid);
    }

    public PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, Contents contents)
    {
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("MetatadataChangeSet must be provided.");
        }
        if (contents == null)
        {
            throw new IllegalArgumentException("Contents must be provided.");
        }
        if ("application/vnd.google-apps.folder".equals(metadatachangeset.getMimeType()))
        {
            throw new IllegalArgumentException("May not create folders (mimetype: application/vnd.google-apps.folder) using this method. Use DriveFolder.createFolder() instead.");
        } else
        {
            return googleapiclient.b(new m(contents, metadatachangeset) {

                final Contents Fd;
                final MetadataChangeSet Fs;
                final q Fu;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((n)a1);
                }

                protected void a(n n1)
                    throws RemoteException
                {
                    Fd.close();
                    n1.fE().a(new CreateFileRequest(Fu.getDriveId(), Fs.fD(), Fd), new a(this));
                }

                public Result d(Status status)
                {
                    return q(status);
                }

                public com.google.android.gms.drive.DriveFolder.DriveFileResult q(Status status)
                {
                    return new d(status, null);
                }

            
            {
                Fu = q.this;
                Fd = contents;
                Fs = metadatachangeset;
                super();
            }
            });
        }
    }

    public PendingResult createFolder(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("MetatadataChangeSet must be provided.");
        }
        if (metadatachangeset.getMimeType() != null && !metadatachangeset.getMimeType().equals("application/vnd.google-apps.folder"))
        {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        } else
        {
            return googleapiclient.b(new c(metadatachangeset) {

                final MetadataChangeSet Fs;
                final q Fu;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((n)a1);
                }

                protected void a(n n1)
                    throws RemoteException
                {
                    n1.fE().a(new CreateFolderRequest(Fu.getDriveId(), Fs.fD()), new b(this));
                }

            
            {
                Fu = q.this;
                Fs = metadatachangeset;
                super();
            }
            });
        }
    }

    public PendingResult listChildren(GoogleApiClient googleapiclient)
    {
        return queryChildren(googleapiclient, null);
    }

    public PendingResult queryChildren(GoogleApiClient googleapiclient, Query query)
    {
        com.google.android.gms.drive.query.Query.Builder builder = (new com.google.android.gms.drive.query.Query.Builder()).addFilter(Filters.in(SearchableField.PARENTS, getDriveId()));
        if (query != null)
        {
            if (query.getFilter() != null)
            {
                builder.addFilter(query.getFilter());
            }
            builder.setPageToken(query.getPageToken());
            builder.a(query.fV());
        }
        return (new l()).query(googleapiclient, builder.build());
    }
}

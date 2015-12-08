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
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.query.Filters;
import com.google.android.gms.drive.query.Query;
import com.google.android.gms.drive.query.SearchableField;

// Referenced classes of package com.google.android.gms.drive.internal:
//            y, s, p, c, 
//            t, OnDriveIdResponse, q, r, 
//            CreateFileRequest, ae, CreateFolderRequest

public class v extends y
    implements DriveFolder
{
    private static class a extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            Ea.b(new c(Status.Kw, new t(ondriveidresponse.getDriveId())));
        }

        public void n(Status status)
            throws RemoteException
        {
            Ea.b(new c(status, null));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }
    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            Ea.b(new e(Status.Kw, new v(ondriveidresponse.getDriveId())));
        }

        public void n(Status status)
            throws RemoteException
        {
            Ea.b(new e(status, null));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }
    }

    private static class c
        implements com.google.android.gms.drive.DriveFolder.DriveFileResult
    {

        private final Status Eb;
        private final DriveFile Qn;

        public DriveFile getDriveFile()
        {
            return Qn;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public c(Status status, DriveFile drivefile)
        {
            Eb = status;
            Qn = drivefile;
        }
    }

    static abstract class d extends q
    {

        public Result c(Status status)
        {
            return r(status);
        }

        public com.google.android.gms.drive.DriveFolder.DriveFileResult r(Status status)
        {
            return new c(status, null);
        }

        d(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static class e
        implements com.google.android.gms.drive.DriveFolder.DriveFolderResult
    {

        private final Status Eb;
        private final DriveFolder Qo;

        public DriveFolder getDriveFolder()
        {
            return Qo;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public e(Status status, DriveFolder drivefolder)
        {
            Eb = status;
            Qo = drivefolder;
        }
    }

    static abstract class f extends q
    {

        public Result c(Status status)
        {
            return s(status);
        }

        public com.google.android.gms.drive.DriveFolder.DriveFolderResult s(Status status)
        {
            return new e(status, null);
        }

        f(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }


    public v(DriveId driveid)
    {
        super(driveid);
    }

    private PendingResult a(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, int i, int j, ExecutionOptions executionoptions)
    {
        ExecutionOptions.a(googleapiclient, executionoptions);
        return googleapiclient.b(new d(googleapiclient, metadatachangeset, i, j, executionoptions) {

            final MetadataChangeSet Qi;
            final int Qj;
            final int Qk;
            final ExecutionOptions Ql;
            final v Qm;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                Qi.iz().setContext(r1.getContext());
                CreateFileRequest createfilerequest = new CreateFileRequest(Qm.getDriveId(), Qi.iz(), Qj, Qk, Ql);
                r1.iG().a(createfilerequest, new a(this));
            }

            
            {
                Qm = v.this;
                Qi = metadatachangeset;
                Qj = i;
                Qk = j;
                Ql = executionoptions;
                super(googleapiclient);
            }
        });
    }

    private PendingResult a(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents, ExecutionOptions executionoptions)
    {
        int i;
        if (drivecontents != null)
        {
            if (!(drivecontents instanceof s))
            {
                throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
            }
            if (drivecontents.getDriveId() != null)
            {
                throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
            }
            if (drivecontents.it())
            {
                throw new IllegalArgumentException("DriveContents are already closed.");
            }
            i = drivecontents.ir().getRequestId();
            drivecontents.is();
        } else
        {
            i = 1;
        }
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if ("application/vnd.google-apps.folder".equals(metadatachangeset.getMimeType()))
        {
            throw new IllegalArgumentException("May not create folders (mimetype: application/vnd.google-apps.folder) using this method. Use DriveFolder.createFolder() instead.");
        } else
        {
            return a(googleapiclient, metadatachangeset, i, 0, executionoptions);
        }
    }

    public PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents)
    {
        return createFile(googleapiclient, metadatachangeset, drivecontents, null);
    }

    public PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents, ExecutionOptions executionoptions)
    {
        ExecutionOptions executionoptions1 = executionoptions;
        if (executionoptions == null)
        {
            executionoptions1 = (new com.google.android.gms.drive.ExecutionOptions.Builder()).build();
        }
        if (executionoptions1.ix() != 0)
        {
            throw new IllegalStateException("May not set a conflict strategy for calls to createFile.");
        } else
        {
            return a(googleapiclient, metadatachangeset, drivecontents, executionoptions1);
        }
    }

    public PendingResult createFolder(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("MetadataChangeSet must be provided.");
        }
        if (metadatachangeset.getMimeType() != null && !metadatachangeset.getMimeType().equals("application/vnd.google-apps.folder"))
        {
            throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
        } else
        {
            return googleapiclient.b(new f(googleapiclient, metadatachangeset) {

                final MetadataChangeSet Qi;
                final v Qm;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    Qi.iz().setContext(r1.getContext());
                    r1.iG().a(new CreateFolderRequest(Qm.getDriveId(), Qi.iz()), new b(this));
                }

            
            {
                Qm = v.this;
                Qi = metadatachangeset;
                super(googleapiclient);
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
            builder.setSortOrder(query.getSortOrder());
        }
        return (new p()).query(googleapiclient, builder.build());
    }
}

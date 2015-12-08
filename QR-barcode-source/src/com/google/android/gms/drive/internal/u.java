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
//            w, r, o, c, 
//            s, OnDriveIdResponse, p, q, 
//            CreateFileRequest, ab, CreateFolderRequest

public class u extends w
    implements DriveFolder
{
    private static class a extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            De.b(new c(Status.Jv, new s(ondriveidresponse.getDriveId())));
        }

        public void o(Status status)
            throws RemoteException
        {
            De.b(new c(status, null));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            De.b(new e(Status.Jv, new u(ondriveidresponse.getDriveId())));
        }

        public void o(Status status)
            throws RemoteException
        {
            De.b(new e(status, null));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    private static class c
        implements com.google.android.gms.drive.DriveFolder.DriveFileResult
    {

        private final Status CM;
        private final DriveFile OY;

        public DriveFile getDriveFile()
        {
            return OY;
        }

        public Status getStatus()
        {
            return CM;
        }

        public c(Status status, DriveFile drivefile)
        {
            CM = status;
            OY = drivefile;
        }
    }

    static abstract class d extends p
    {

        public Result c(Status status)
        {
            return t(status);
        }

        public com.google.android.gms.drive.DriveFolder.DriveFileResult t(Status status)
        {
            return new c(status, null);
        }

        d()
        {
        }
    }

    private static class e
        implements com.google.android.gms.drive.DriveFolder.DriveFolderResult
    {

        private final Status CM;
        private final DriveFolder OZ;

        public DriveFolder getDriveFolder()
        {
            return OZ;
        }

        public Status getStatus()
        {
            return CM;
        }

        public e(Status status, DriveFolder drivefolder)
        {
            CM = status;
            OZ = drivefolder;
        }
    }

    static abstract class f extends p
    {

        public Result c(Status status)
        {
            return u(status);
        }

        public com.google.android.gms.drive.DriveFolder.DriveFolderResult u(Status status)
        {
            return new e(status, null);
        }

        f()
        {
        }
    }


    public u(DriveId driveid)
    {
        super(driveid);
    }

    private PendingResult a(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, Contents contents, int i, ExecutionOptions executionoptions)
    {
        ExecutionOptions.a(googleapiclient, executionoptions);
        if (contents != null)
        {
            contents.hJ();
        }
        return googleapiclient.b(new d(metadatachangeset, contents, i, executionoptions) {

            final ExecutionOptions ON;
            final MetadataChangeSet OV;
            final int OW;
            final u OX;
            final Contents Ov;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                OV.hS().setContext(q1.getContext());
                CreateFileRequest createfilerequest;
                int j;
                if (Ov == null)
                {
                    j = 0;
                } else
                {
                    j = Ov.getRequestId();
                }
                createfilerequest = new CreateFileRequest(OX.getDriveId(), OV.hS(), j, OW, ON);
                q1.hY().a(createfilerequest, new a(this));
            }

            
            {
                OX = u.this;
                OV = metadatachangeset;
                Ov = contents;
                OW = i;
                ON = executionoptions;
                super();
            }
        });
    }

    private PendingResult a(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, DriveContents drivecontents, ExecutionOptions executionoptions)
    {
        if (drivecontents == null)
        {
            throw new IllegalArgumentException("DriveContents must be provided.");
        }
        if (!(drivecontents instanceof r))
        {
            throw new IllegalArgumentException("Only DriveContents obtained from the Drive API are accepted.");
        }
        if (drivecontents.getDriveId() != null)
        {
            throw new IllegalArgumentException("Only DriveContents obtained through DriveApi.newDriveContents are accepted for file creation.");
        }
        if (drivecontents.getContents().hK())
        {
            throw new IllegalArgumentException("DriveContents are already closed.");
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
            return a(googleapiclient, metadatachangeset, drivecontents.getContents(), 0, executionoptions);
        }
    }

    public PendingResult createFile(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, Contents contents)
    {
        return createFile(googleapiclient, metadatachangeset, ((DriveContents) (new r(contents))));
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
        if (executionoptions1.hQ() != 0)
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
            return googleapiclient.b(new f(metadatachangeset) {

                final MetadataChangeSet OV;
                final u OX;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    OV.hS().setContext(q1.getContext());
                    q1.hY().a(new CreateFolderRequest(OX.getDriveId(), OV.hS()), new b(this));
                }

            
            {
                OX = u.this;
                OV = metadatachangeset;
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
            builder.setSortOrder(query.getSortOrder());
        }
        return (new o()).query(googleapiclient, builder.build());
    }
}

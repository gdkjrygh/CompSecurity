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
import com.google.android.gms.drive.CreateFileActivityBuilder;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive.internal:
//            n, q, o, c, 
//            j, OnMetadataResponse, m, OnContentsResponse, 
//            OnListEntriesResponse, QueryRequest, u, CreateContentsRequest, 
//            CloseContentsRequest, al, GetMetadataRequest

public class com.google.android.gms.drive.internal.l
    implements DriveApi
{
    static class a
        implements com.google.android.gms.drive.DriveApi.ContentsResult
    {

        private final Contents EA;
        private final Status wJ;

        public Contents getContents()
        {
            return EA;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public a(Status status, Contents contents)
        {
            wJ = status;
            EA = contents;
        }
    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d wH;

        public void a(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            wH.b(new c(Status.Bv, (new com.google.android.gms.drive.internal.j(onmetadataresponse.fQ())).getDriveId()));
        }

        public void m(Status status)
            throws RemoteException
        {
            wH.b(new c(status, null));
        }

        public b(com.google.android.gms.common.api.a.d d1)
        {
            wH = d1;
        }
    }

    static class c
        implements com.google.android.gms.drive.DriveApi.DriveIdResult
    {

        private final DriveId Ew;
        private final Status wJ;

        public DriveId getDriveId()
        {
            return Ew;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public c(Status status, DriveId driveid)
        {
            wJ = status;
            Ew = driveid;
        }
    }

    abstract class d extends m
    {

        final com.google.android.gms.drive.internal.l Fc;

        public Result d(Status status)
        {
            return n(status);
        }

        public com.google.android.gms.drive.DriveApi.DriveIdResult n(Status status)
        {
            return new c(status, null);
        }

        d()
        {
            Fc = com.google.android.gms.drive.internal.l.this;
            super();
        }
    }

    static class e
        implements com.google.android.gms.drive.DriveApi.MetadataBufferResult
    {

        private final MetadataBuffer Ff;
        private final boolean Fg;
        private final Status wJ;

        public MetadataBuffer getMetadataBuffer()
        {
            return Ff;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public e(Status status, MetadataBuffer metadatabuffer, boolean flag)
        {
            wJ = status;
            Ff = metadatabuffer;
            Fg = flag;
        }
    }

    private static class f extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d wH;

        public void a(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            wH.b(new a(Status.Bv, oncontentsresponse.fI()));
        }

        public void m(Status status)
            throws RemoteException
        {
            wH.b(new a(status, null));
        }

        public f(com.google.android.gms.common.api.a.d d1)
        {
            wH = d1;
        }
    }

    abstract class g extends m
    {

        final com.google.android.gms.drive.internal.l Fc;

        public Result d(Status status)
        {
            return o(status);
        }

        public com.google.android.gms.drive.DriveApi.ContentsResult o(Status status)
        {
            return new a(status, null);
        }

        g()
        {
            Fc = com.google.android.gms.drive.internal.l.this;
            super();
        }
    }

    static class h extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d wH;

        public void a(OnListEntriesResponse onlistentriesresponse)
            throws RemoteException
        {
            MetadataBuffer metadatabuffer = new MetadataBuffer(onlistentriesresponse.fN(), null);
            wH.b(new e(Status.Bv, metadatabuffer, onlistentriesresponse.fO()));
        }

        public void m(Status status)
            throws RemoteException
        {
            wH.b(new e(status, null, false));
        }

        public h(com.google.android.gms.common.api.a.d d1)
        {
            wH = d1;
        }
    }

    abstract class i extends m
    {

        final com.google.android.gms.drive.internal.l Fc;

        public Result d(Status status)
        {
            return p(status);
        }

        public com.google.android.gms.drive.DriveApi.MetadataBufferResult p(Status status)
        {
            return new e(status, null, false);
        }

        i()
        {
            Fc = com.google.android.gms.drive.internal.l.this;
            super();
        }
    }

    static abstract class j extends m
    {

        public Result d(Status status)
        {
            return f(status);
        }

        public Status f(Status status)
        {
            return status;
        }

        j()
        {
        }
    }

    static class k extends j
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((n)a1);
        }

        protected void a(n n1)
        {
        }

        k(GoogleApiClient googleapiclient, Status status)
        {
            a(new com.google.android.gms.common.api.a.c(((n)googleapiclient.a(Drive.wx)).getLooper()));
            a(status);
        }
    }

    abstract class l extends m
    {

        final com.google.android.gms.drive.internal.l Fc;

        public Result d(Status status)
        {
            return f(status);
        }

        public Status f(Status status)
        {
            return status;
        }

        l()
        {
            Fc = com.google.android.gms.drive.internal.l.this;
            super();
        }
    }


    public com.google.android.gms.drive.internal.l()
    {
    }

    public PendingResult discardContents(GoogleApiClient googleapiclient, Contents contents)
    {
        return googleapiclient.b(new j(contents) {

            final com.google.android.gms.drive.internal.l Fc;
            final Contents Fd;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((n)a1);
            }

            protected void a(n n1)
                throws RemoteException
            {
                n1.fE().a(new CloseContentsRequest(Fd, false), new al(this));
            }

            
            {
                Fc = com.google.android.gms.drive.internal.l.this;
                Fd = contents;
                super();
            }
        });
    }

    public PendingResult fetchDriveId(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new d(s) {

            final com.google.android.gms.drive.internal.l Fc;
            final String Fe;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((n)a1);
            }

            protected void a(n n1)
                throws RemoteException
            {
                n1.fE().a(new GetMetadataRequest(DriveId.aw(Fe)), new b(this));
            }

            
            {
                Fc = com.google.android.gms.drive.internal.l.this;
                Fe = s;
                super();
            }
        });
    }

    public DriveFolder getAppFolder(GoogleApiClient googleapiclient)
    {
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        }
        googleapiclient = ((n)googleapiclient.a(Drive.wx)).fG();
        if (googleapiclient != null)
        {
            return new q(googleapiclient);
        } else
        {
            return null;
        }
    }

    public DriveFile getFile(GoogleApiClient googleapiclient, DriveId driveid)
    {
        if (driveid == null)
        {
            throw new IllegalArgumentException("Id must be provided.");
        }
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        } else
        {
            return new o(driveid);
        }
    }

    public DriveFolder getFolder(GoogleApiClient googleapiclient, DriveId driveid)
    {
        if (driveid == null)
        {
            throw new IllegalArgumentException("Id must be provided.");
        }
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        } else
        {
            return new q(driveid);
        }
    }

    public DriveFolder getRootFolder(GoogleApiClient googleapiclient)
    {
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        } else
        {
            return new q(((n)googleapiclient.a(Drive.wx)).fF());
        }
    }

    public PendingResult newContents(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new g() {

            final com.google.android.gms.drive.internal.l Fc;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((n)a1);
            }

            protected void a(n n1)
                throws RemoteException
            {
                n1.fE().a(new CreateContentsRequest(), new f(this));
            }

            
            {
                Fc = com.google.android.gms.drive.internal.l.this;
                super();
            }
        });
    }

    public CreateFileActivityBuilder newCreateFileActivityBuilder()
    {
        return new CreateFileActivityBuilder();
    }

    public OpenFileActivityBuilder newOpenFileActivityBuilder()
    {
        return new OpenFileActivityBuilder();
    }

    public PendingResult query(GoogleApiClient googleapiclient, Query query1)
    {
        if (query1 == null)
        {
            throw new IllegalArgumentException("Query must be provided.");
        } else
        {
            return googleapiclient.a(new i(query1) {

                final Query Fb;
                final com.google.android.gms.drive.internal.l Fc;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((n)a1);
                }

                protected void a(n n1)
                    throws RemoteException
                {
                    n1.fE().a(new QueryRequest(Fb), new h(this));
                }

            
            {
                Fc = com.google.android.gms.drive.internal.l.this;
                Fb = query1;
                super();
            }
            });
        }
    }

    public PendingResult requestSync(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new l() {

            final com.google.android.gms.drive.internal.l Fc;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((n)a1);
            }

            protected void a(n n1)
                throws RemoteException
            {
                n1.fE().a(new al(this));
            }

            
            {
                Fc = com.google.android.gms.drive.internal.l.this;
                super();
            }
        });
    }
}

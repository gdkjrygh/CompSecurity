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
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.drive.DriveFolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.OpenFileActivityBuilder;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive.internal:
//            q, u, s, p, 
//            c, OnDriveIdResponse, l, OnMetadataResponse, 
//            OnContentsResponse, r, OnListEntriesResponse, QueryRequest, 
//            ab, CreateContentsRequest, CloseContentsRequest, bb, 
//            GetMetadataRequest

public class o
    implements DriveApi
{
    static class a
        implements com.google.android.gms.drive.DriveApi.ContentsResult
    {

        private final Status CM;
        private final Contents Ox;

        public Contents getContents()
        {
            return Ox;
        }

        public Status getStatus()
        {
            return CM;
        }

        public a(Status status, Contents contents)
        {
            CM = status;
            Ox = contents;
        }
    }

    static abstract class b extends p
    {

        public Result c(Status status)
        {
            return p(status);
        }

        public com.google.android.gms.drive.DriveApi.ContentsResult p(Status status)
        {
            return new a(status, null);
        }

        b()
        {
        }
    }

    static class c
        implements com.google.android.gms.drive.DriveApi.DriveContentsResult
    {

        private final Status CM;
        private final DriveContents Nb;

        public DriveContents getDriveContents()
        {
            return Nb;
        }

        public Status getStatus()
        {
            return CM;
        }

        public c(Status status, DriveContents drivecontents)
        {
            CM = status;
            Nb = drivecontents;
        }
    }

    static abstract class d extends p
    {

        public Result c(Status status)
        {
            return q(status);
        }

        public com.google.android.gms.drive.DriveApi.DriveContentsResult q(Status status)
        {
            return new c(status, null);
        }

        d()
        {
        }
    }

    static class e extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            De.b(new f(Status.Jv, ondriveidresponse.getDriveId()));
        }

        public void a(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            De.b(new f(Status.Jv, (new com.google.android.gms.drive.internal.l(onmetadataresponse.il())).getDriveId()));
        }

        public void o(Status status)
            throws RemoteException
        {
            De.b(new f(status, null));
        }

        public e(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    private static class f
        implements com.google.android.gms.drive.DriveApi.DriveIdResult
    {

        private final Status CM;
        private final DriveId MW;

        public DriveId getDriveId()
        {
            return MW;
        }

        public Status getStatus()
        {
            return CM;
        }

        public f(Status status, DriveId driveid)
        {
            CM = status;
            MW = driveid;
        }
    }

    static abstract class g extends p
    {

        public Result c(Status status)
        {
            return r(status);
        }

        public com.google.android.gms.drive.DriveApi.DriveIdResult r(Status status)
        {
            return new f(status, null);
        }

        g()
        {
        }
    }

    static class h
        implements com.google.android.gms.drive.DriveApi.MetadataBufferResult
    {

        private final Status CM;
        private final MetadataBuffer Oy;
        private final boolean Oz;

        public MetadataBuffer getMetadataBuffer()
        {
            return Oy;
        }

        public Status getStatus()
        {
            return CM;
        }

        public h(Status status, MetadataBuffer metadatabuffer, boolean flag)
        {
            CM = status;
            Oy = metadatabuffer;
            Oz = flag;
        }
    }

    static abstract class i extends p
    {

        public Result c(Status status)
        {
            return s(status);
        }

        public com.google.android.gms.drive.DriveApi.MetadataBufferResult s(Status status)
        {
            return new h(status, null, false);
        }

        i()
        {
        }
    }

    private static class j extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            De.b(new a(Status.Jv, oncontentsresponse.id()));
        }

        public void o(Status status)
            throws RemoteException
        {
            De.b(new a(status, null));
        }

        public j(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    private static class k extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            De.b(new c(Status.Jv, new r(oncontentsresponse.id())));
        }

        public void o(Status status)
            throws RemoteException
        {
            De.b(new c(status, null));
        }

        public k(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    private static class l extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(OnListEntriesResponse onlistentriesresponse)
            throws RemoteException
        {
            MetadataBuffer metadatabuffer = new MetadataBuffer(onlistentriesresponse.ii(), null);
            De.b(new h(Status.Jv, metadatabuffer, onlistentriesresponse.ij()));
        }

        public void o(Status status)
            throws RemoteException
        {
            De.b(new h(status, null, false));
        }

        public l(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    static class m extends p.a
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((q)a1);
        }

        protected void a(q q1)
        {
        }

        m(GoogleApiClient googleapiclient, Status status)
        {
            a(new com.google.android.gms.common.api.BaseImplementation.CallbackHandler(((q)googleapiclient.a(Drive.CU)).getLooper()));
            b(status);
        }
    }


    public o()
    {
    }

    public PendingResult a(GoogleApiClient googleapiclient, int i1)
    {
        return googleapiclient.a(new d(i1) {

            final o Ot;
            final int Ou;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                q1.hY().a(new CreateContentsRequest(Ou), new k(this));
            }

            
            {
                Ot = o.this;
                Ou = i1;
                super();
            }
        });
    }

    public PendingResult discardContents(GoogleApiClient googleapiclient, Contents contents)
    {
        if (contents.hK())
        {
            throw new IllegalStateException("DriveContents already closed.");
        } else
        {
            contents.hJ();
            return googleapiclient.b(new p.a(contents) {

                final o Ot;
                final Contents Ov;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    q1.hY().a(new CloseContentsRequest(Ov, false), new bb(this));
                }

            
            {
                Ot = o.this;
                Ov = contents;
                super();
            }
            });
        }
    }

    public PendingResult fetchDriveId(GoogleApiClient googleapiclient, String s1)
    {
        return googleapiclient.a(new g(s1) {

            final o Ot;
            final String Ow;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                q1.hY().a(new GetMetadataRequest(DriveId.bg(Ow)), new e(this));
            }

            
            {
                Ot = o.this;
                Ow = s1;
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
        googleapiclient = ((q)googleapiclient.a(Drive.CU)).ia();
        if (googleapiclient != null)
        {
            return new u(googleapiclient);
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
            return new s(driveid);
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
            return new u(driveid);
        }
    }

    public DriveFolder getRootFolder(GoogleApiClient googleapiclient)
    {
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        } else
        {
            return new u(((q)googleapiclient.a(Drive.CU)).hZ());
        }
    }

    public PendingResult newContents(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new b() {

            final o Ot;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                q1.hY().a(new CreateContentsRequest(0x20000000), new j(this));
            }

            
            {
                Ot = o.this;
                super();
            }
        });
    }

    public CreateFileActivityBuilder newCreateFileActivityBuilder()
    {
        return new CreateFileActivityBuilder();
    }

    public PendingResult newDriveContents(GoogleApiClient googleapiclient)
    {
        return a(googleapiclient, 0x20000000);
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

                final Query Os;
                final o Ot;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    q1.hY().a(new QueryRequest(Os), new l(this));
                }

            
            {
                Ot = o.this;
                Os = query1;
                super();
            }
            });
        }
    }

    public PendingResult requestSync(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new p.a() {

            final o Ot;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                q1.hY().a(new bb(this));
            }

            
            {
                Ot = o.this;
                super();
            }
        });
    }
}

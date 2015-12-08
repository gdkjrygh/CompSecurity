// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
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
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, v, t, q, 
//            c, OnDriveIdResponse, m, OnMetadataResponse, 
//            s, OnContentsResponse, OnListEntriesResponse, QueryRequest, 
//            ae, CreateContentsRequest, GetMetadataRequest, bg

public class p
    implements DriveApi
{
    static class a
        implements com.google.android.gms.drive.DriveApi.DriveContentsResult
    {

        private final Status Eb;
        private final DriveContents Om;

        public DriveContents getDriveContents()
        {
            return Om;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public a(Status status, DriveContents drivecontents)
        {
            Eb = status;
            Om = drivecontents;
        }
    }

    static abstract class b extends q
    {

        public Result c(Status status)
        {
            return o(status);
        }

        public com.google.android.gms.drive.DriveApi.DriveContentsResult o(Status status)
        {
            return new a(status, null);
        }

        b(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    static class c extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            Ea.b(new d(Status.Kw, ondriveidresponse.getDriveId()));
        }

        public void a(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            Ea.b(new d(Status.Kw, (new m(onmetadataresponse.iU())).getDriveId()));
        }

        public void n(Status status)
            throws RemoteException
        {
            Ea.b(new d(status, null));
        }

        public c(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }
    }

    private static class d
        implements com.google.android.gms.drive.DriveApi.DriveIdResult
    {

        private final Status Eb;
        private final DriveId Oj;

        public DriveId getDriveId()
        {
            return Oj;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public d(Status status, DriveId driveid)
        {
            Eb = status;
            Oj = driveid;
        }
    }

    static abstract class e extends q
    {

        public Result c(Status status)
        {
            return p(status);
        }

        public com.google.android.gms.drive.DriveApi.DriveIdResult p(Status status)
        {
            return new d(status, null);
        }

        e(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    static class f
        implements com.google.android.gms.drive.DriveApi.MetadataBufferResult
    {

        private final Status Eb;
        private final MetadataBuffer PI;
        private final boolean PJ;

        public MetadataBuffer getMetadataBuffer()
        {
            return PI;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public f(Status status, MetadataBuffer metadatabuffer, boolean flag)
        {
            Eb = status;
            PI = metadatabuffer;
            PJ = flag;
        }
    }

    static abstract class g extends q
    {

        public Result c(Status status)
        {
            return q(status);
        }

        public com.google.android.gms.drive.DriveApi.MetadataBufferResult q(Status status)
        {
            return new f(status, null, false);
        }

        g(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }
    }

    private static class h extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            Ea.b(new a(Status.Kw, new s(oncontentsresponse.iL())));
        }

        public void n(Status status)
            throws RemoteException
        {
            Ea.b(new a(status, null));
        }

        public h(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }
    }

    private static class i extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(OnListEntriesResponse onlistentriesresponse)
            throws RemoteException
        {
            MetadataBuffer metadatabuffer = new MetadataBuffer(onlistentriesresponse.iR(), null);
            Ea.b(new f(Status.Kw, metadatabuffer, onlistentriesresponse.iS()));
        }

        public void n(Status status)
            throws RemoteException
        {
            Ea.b(new f(status, null, false));
        }

        public i(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }
    }

    static class j extends q.a
    {

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((r)a1);
        }

        protected void a(r r1)
        {
        }

        j(GoogleApiClient googleapiclient, Status status)
        {
            super(googleapiclient);
            b(status);
        }
    }


    public p()
    {
    }

    public PendingResult a(GoogleApiClient googleapiclient, int k)
    {
        return googleapiclient.a(new b(googleapiclient, k) {

            final p PF;
            final int PG;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().a(new CreateContentsRequest(PG), new h(this));
            }

            
            {
                PF = p.this;
                PG = k;
                super(googleapiclient);
            }
        });
    }

    public PendingResult cancelPendingActions(GoogleApiClient googleapiclient, List list)
    {
        return ((r)googleapiclient.a(Drive.DQ)).cancelPendingActions(googleapiclient, list);
    }

    public PendingResult fetchDriveId(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.a(new e(googleapiclient, s) {

            final p PF;
            final String PH;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().a(new GetMetadataRequest(DriveId.bi(PH)), new c(this));
            }

            
            {
                PF = p.this;
                PH = s;
                super(googleapiclient);
            }
        });
    }

    public DriveFolder getAppFolder(GoogleApiClient googleapiclient)
    {
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        }
        googleapiclient = ((r)googleapiclient.a(Drive.DQ)).iI();
        if (googleapiclient != null)
        {
            return new v(googleapiclient);
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
            return new t(driveid);
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
            return new v(driveid);
        }
    }

    public DriveFolder getRootFolder(GoogleApiClient googleapiclient)
    {
        if (!googleapiclient.isConnected())
        {
            throw new IllegalStateException("Client must be connected");
        } else
        {
            return new v(((r)googleapiclient.a(Drive.DQ)).iH());
        }
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
            return googleapiclient.a(new g(googleapiclient, query1) {

                final Query PE;
                final p PF;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.iG().a(new QueryRequest(PE), new i(this));
                }

            
            {
                PF = p.this;
                PE = query1;
                super(googleapiclient);
            }
            });
        }
    }

    public PendingResult requestSync(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new q.a(googleapiclient) {

            final p PF;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().a(new bg(this));
            }

            
            {
                PF = p.this;
                super(googleapiclient);
            }
        });
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.MetadataChangeSet;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, q, GetMetadataRequest, aa, 
//            c, OnListParentsResponse, l, OnMetadataResponse, 
//            ListParentsRequest, UpdateMetadataRequest

public class v
    implements DriveResource
{
    private abstract class a extends q
    {

        final v Jl;

        public Result c(Status status)
        {
            return u(status);
        }

        public com.google.android.gms.drive.DriveResource.MetadataResult u(Status status)
        {
            return new e(status, null);
        }

        private a()
        {
            Jl = v.this;
            super();
        }

    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d yR;

        public void a(OnListParentsResponse onlistparentsresponse)
            throws RemoteException
        {
            onlistparentsresponse = new MetadataBuffer(onlistparentsresponse.gA(), null);
            yR.a(new p.e(Status.En, onlistparentsresponse, false));
        }

        public void o(Status status)
            throws RemoteException
        {
            yR.a(new p.e(status, null, false));
        }

        public b(com.google.android.gms.common.api.a.d d1)
        {
            yR = d1;
        }
    }

    private abstract class c extends q
    {

        final v Jl;

        public Result c(Status status)
        {
            return r(status);
        }

        public com.google.android.gms.drive.DriveApi.MetadataBufferResult r(Status status)
        {
            return new p.e(status, null, false);
        }

        private c()
        {
            Jl = v.this;
            super();
        }

    }

    private static class d extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d yR;

        public void a(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            yR.a(new e(Status.En, new l(onmetadataresponse.gB())));
        }

        public void o(Status status)
            throws RemoteException
        {
            yR.a(new e(status, null));
        }

        public d(com.google.android.gms.common.api.a.d d1)
        {
            yR = d1;
        }
    }

    private static class e
        implements com.google.android.gms.drive.DriveResource.MetadataResult
    {

        private final Metadata Jm;
        private final Status yz;

        public Metadata getMetadata()
        {
            return Jm;
        }

        public Status getStatus()
        {
            return yz;
        }

        public e(Status status, Metadata metadata)
        {
            yz = status;
            Jm = metadata;
        }
    }

    private abstract class f extends q
    {

        final v Jl;

        public Result c(Status status)
        {
            return u(status);
        }

        public com.google.android.gms.drive.DriveResource.MetadataResult u(Status status)
        {
            return new e(status, null);
        }

        private f()
        {
            Jl = v.this;
            super();
        }

    }


    protected final DriveId Hz;

    protected v(DriveId driveid)
    {
        Hz = driveid;
    }

    public PendingResult addChangeListener(GoogleApiClient googleapiclient, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        return ((r)googleapiclient.a(Drive.yH)).a(googleapiclient, Hz, 1, listener);
    }

    public DriveId getDriveId()
    {
        return Hz;
    }

    public PendingResult getMetadata(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new a() {

            final v Jl;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.gp().a(new GetMetadataRequest(Jl.Hz), new d(this));
            }

            
            {
                Jl = v.this;
                super();
            }
        });
    }

    public PendingResult listParents(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new c() {

            final v Jl;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.gp().a(new ListParentsRequest(Jl.Hz), new b(this));
            }

            
            {
                Jl = v.this;
                super();
            }
        });
    }

    public PendingResult removeChangeListener(GoogleApiClient googleapiclient, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        return ((r)googleapiclient.a(Drive.yH)).b(googleapiclient, Hz, 1, listener);
    }

    public PendingResult updateMetadata(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("ChangeSet must be provided.");
        } else
        {
            return googleapiclient.b(new f(metadatachangeset) {

                final MetadataChangeSet Jd;
                final v Jl;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.gp().a(new UpdateMetadataRequest(Jl.Hz, Jd.gm()), new d(this));
                }

            
            {
                Jl = v.this;
                Jd = metadatachangeset;
                super();
            }
            });
        }
    }
}

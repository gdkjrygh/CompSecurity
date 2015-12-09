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
//            n, m, GetMetadataRequest, u, 
//            c, OnListParentsResponse, j, OnMetadataResponse, 
//            ListParentsRequest, UpdateMetadataRequest

public class r
    implements DriveResource
{
    private abstract class a extends m
    {

        final r Fx;

        public Result d(Status status)
        {
            return s(status);
        }

        public com.google.android.gms.drive.DriveResource.MetadataResult s(Status status)
        {
            return new e(status, null);
        }

        private a()
        {
            Fx = r.this;
            super();
        }

    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d wH;

        public void a(OnListParentsResponse onlistparentsresponse)
            throws RemoteException
        {
            onlistparentsresponse = new MetadataBuffer(onlistparentsresponse.fP(), null);
            wH.b(new l.e(Status.Bv, onlistparentsresponse, false));
        }

        public void m(Status status)
            throws RemoteException
        {
            wH.b(new l.e(status, null, false));
        }

        public b(com.google.android.gms.common.api.a.d d1)
        {
            wH = d1;
        }
    }

    private abstract class c extends m
    {

        final r Fx;

        public Result d(Status status)
        {
            return p(status);
        }

        public com.google.android.gms.drive.DriveApi.MetadataBufferResult p(Status status)
        {
            return new l.e(status, null, false);
        }

        private c()
        {
            Fx = r.this;
            super();
        }

    }

    private static class d extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d wH;

        public void a(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            wH.b(new e(Status.Bv, new j(onmetadataresponse.fQ())));
        }

        public void m(Status status)
            throws RemoteException
        {
            wH.b(new e(status, null));
        }

        public d(com.google.android.gms.common.api.a.d d1)
        {
            wH = d1;
        }
    }

    private static class e
        implements com.google.android.gms.drive.DriveResource.MetadataResult
    {

        private final Metadata Fy;
        private final Status wJ;

        public Metadata getMetadata()
        {
            return Fy;
        }

        public Status getStatus()
        {
            return wJ;
        }

        public e(Status status, Metadata metadata)
        {
            wJ = status;
            Fy = metadata;
        }
    }

    private abstract class f extends m
    {

        final r Fx;

        public Result d(Status status)
        {
            return s(status);
        }

        public com.google.android.gms.drive.DriveResource.MetadataResult s(Status status)
        {
            return new e(status, null);
        }

        private f()
        {
            Fx = r.this;
            super();
        }

    }


    protected final DriveId Ew;

    protected r(DriveId driveid)
    {
        Ew = driveid;
    }

    public PendingResult addChangeListener(GoogleApiClient googleapiclient, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        return ((n)googleapiclient.a(Drive.wx)).a(googleapiclient, Ew, 1, listener);
    }

    public DriveId getDriveId()
    {
        return Ew;
    }

    public PendingResult getMetadata(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new a() {

            final r Fx;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((n)a1);
            }

            protected void a(n n1)
                throws RemoteException
            {
                n1.fE().a(new GetMetadataRequest(Fx.Ew), new d(this));
            }

            
            {
                Fx = r.this;
                super();
            }
        });
    }

    public PendingResult listParents(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new c() {

            final r Fx;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((n)a1);
            }

            protected void a(n n1)
                throws RemoteException
            {
                n1.fE().a(new ListParentsRequest(Fx.Ew), new b(this));
            }

            
            {
                Fx = r.this;
                super();
            }
        });
    }

    public PendingResult removeChangeListener(GoogleApiClient googleapiclient, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        return ((n)googleapiclient.a(Drive.wx)).b(googleapiclient, Ew, 1, listener);
    }

    public PendingResult updateMetadata(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("ChangeSet must be provided.");
        } else
        {
            return googleapiclient.b(new f(metadatachangeset) {

                final MetadataChangeSet Fs;
                final r Fx;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((n)a1);
                }

                protected void a(n n1)
                    throws RemoteException
                {
                    n1.fE().a(new UpdateMetadataRequest(Fx.Ew, Fs.fD()), new d(this));
                }

            
            {
                Fx = r.this;
                Fs = metadatachangeset;
                super();
            }
            });
        }
    }
}

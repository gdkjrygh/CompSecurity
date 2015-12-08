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

        final v Ji;

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
            Ji = v.this;
            super();
        }

    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d yO;

        public void a(OnListParentsResponse onlistparentsresponse)
            throws RemoteException
        {
            onlistparentsresponse = new MetadataBuffer(onlistparentsresponse.gv(), null);
            yO.a(new p.e(Status.Ek, onlistparentsresponse, false));
        }

        public void o(Status status)
            throws RemoteException
        {
            yO.a(new p.e(status, null, false));
        }

        public b(com.google.android.gms.common.api.a.d d1)
        {
            yO = d1;
        }
    }

    private abstract class c extends q
    {

        final v Ji;

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
            Ji = v.this;
            super();
        }

    }

    private static class d extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.a.d yO;

        public void a(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            yO.a(new e(Status.Ek, new l(onmetadataresponse.gw())));
        }

        public void o(Status status)
            throws RemoteException
        {
            yO.a(new e(status, null));
        }

        public d(com.google.android.gms.common.api.a.d d1)
        {
            yO = d1;
        }
    }

    private static class e
        implements com.google.android.gms.drive.DriveResource.MetadataResult
    {

        private final Metadata Jj;
        private final Status yw;

        public Metadata getMetadata()
        {
            return Jj;
        }

        public Status getStatus()
        {
            return yw;
        }

        public e(Status status, Metadata metadata)
        {
            yw = status;
            Jj = metadata;
        }
    }

    private abstract class f extends q
    {

        final v Ji;

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
            Ji = v.this;
            super();
        }

    }


    protected final DriveId Hw;

    protected v(DriveId driveid)
    {
        Hw = driveid;
    }

    public PendingResult addChangeListener(GoogleApiClient googleapiclient, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        return ((r)googleapiclient.a(Drive.yE)).a(googleapiclient, Hw, 1, listener);
    }

    public DriveId getDriveId()
    {
        return Hw;
    }

    public PendingResult getMetadata(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new a() {

            final v Ji;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.gk().a(new GetMetadataRequest(Ji.Hw), new d(this));
            }

            
            {
                Ji = v.this;
                super();
            }
        });
    }

    public PendingResult listParents(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new c() {

            final v Ji;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.gk().a(new ListParentsRequest(Ji.Hw), new b(this));
            }

            
            {
                Ji = v.this;
                super();
            }
        });
    }

    public PendingResult removeChangeListener(GoogleApiClient googleapiclient, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        return ((r)googleapiclient.a(Drive.yE)).b(googleapiclient, Hw, 1, listener);
    }

    public PendingResult updateMetadata(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("ChangeSet must be provided.");
        } else
        {
            return googleapiclient.b(new f(metadatachangeset) {

                final MetadataChangeSet Ja;
                final v Ji;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.gk().a(new UpdateMetadataRequest(Ji.Hw, Ja.gh()), new d(this));
                }

            
            {
                Ji = v.this;
                Ja = metadatachangeset;
                super();
            }
            });
        }
    }
}

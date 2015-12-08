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
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, c, OnListParentsResponse, m, 
//            OnMetadataResponse, q, GetMetadataRequest, ae, 
//            ListParentsRequest, SetResourceParentsRequest, bg, UpdateMetadataRequest

public class y
    implements DriveResource
{
    private static class a extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(OnListParentsResponse onlistparentsresponse)
            throws RemoteException
        {
            onlistparentsresponse = new MetadataBuffer(onlistparentsresponse.iT(), null);
            Ea.b(new p.f(Status.Kw, onlistparentsresponse, false));
        }

        public void n(Status status)
            throws RemoteException
        {
            Ea.b(new p.f(status, null, false));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }
    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b Ea;

        public void a(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            Ea.b(new c(Status.Kw, new m(onmetadataresponse.iU())));
        }

        public void n(Status status)
            throws RemoteException
        {
            Ea.b(new c(status, null));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            Ea = b1;
        }
    }

    private static class c
        implements com.google.android.gms.drive.DriveResource.MetadataResult
    {

        private final Status Eb;
        private final Metadata Qv;

        public Metadata getMetadata()
        {
            return Qv;
        }

        public Status getStatus()
        {
            return Eb;
        }

        public c(Status status, Metadata metadata)
        {
            Eb = status;
            Qv = metadata;
        }
    }

    private abstract class d extends q
    {

        final y Qt;

        public Result c(Status status)
        {
            return u(status);
        }

        public com.google.android.gms.drive.DriveResource.MetadataResult u(Status status)
        {
            return new c(status, null);
        }

        private d(GoogleApiClient googleapiclient)
        {
            Qt = y.this;
            super(googleapiclient);
        }

    }


    protected final DriveId Oj;

    protected y(DriveId driveid)
    {
        Oj = driveid;
    }

    public PendingResult addChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener)
    {
        return ((r)googleapiclient.a(Drive.DQ)).a(googleapiclient, Oj, 1, changelistener);
    }

    public PendingResult addChangeSubscription(GoogleApiClient googleapiclient)
    {
        return ((r)googleapiclient.a(Drive.DQ)).a(googleapiclient, Oj, 1);
    }

    public DriveId getDriveId()
    {
        return Oj;
    }

    public PendingResult getMetadata(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d(googleapiclient) {

            final y Qt;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().a(new GetMetadataRequest(Qt.Oj), new b(this));
            }

            
            {
                Qt = y.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult listParents(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new p.g(googleapiclient) {

            final y Qt;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                r1.iG().a(new ListParentsRequest(Qt.Oj), new a(this));
            }

            
            {
                Qt = y.this;
                super(googleapiclient);
            }
        });
    }

    public PendingResult removeChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener)
    {
        return ((r)googleapiclient.a(Drive.DQ)).b(googleapiclient, Oj, 1, changelistener);
    }

    public PendingResult removeChangeSubscription(GoogleApiClient googleapiclient)
    {
        return ((r)googleapiclient.a(Drive.DQ)).b(googleapiclient, Oj, 1);
    }

    public PendingResult setParents(GoogleApiClient googleapiclient, Set set)
    {
        if (set == null)
        {
            throw new IllegalArgumentException("ParentIds must be provided.");
        }
        if (set.isEmpty())
        {
            throw new IllegalArgumentException("ParentIds must contain at least one parent.");
        } else
        {
            return googleapiclient.b(new q.a(googleapiclient, new ArrayList(set)) {

                final y Qt;
                final List Qu;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.iG().a(new SetResourceParentsRequest(Qt.Oj, Qu), new bg(this));
                }

            
            {
                Qt = y.this;
                Qu = list;
                super(googleapiclient);
            }
            });
        }
    }

    public PendingResult updateMetadata(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        if (metadatachangeset == null)
        {
            throw new IllegalArgumentException("ChangeSet must be provided.");
        } else
        {
            return googleapiclient.b(new d(googleapiclient, metadatachangeset) {

                final MetadataChangeSet Qi;
                final y Qt;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    Qi.iz().setContext(r1.getContext());
                    r1.iG().a(new UpdateMetadataRequest(Qt.Oj, Qi.iz()), new b(this));
                }

            
            {
                Qt = y.this;
                Qi = metadatachangeset;
                super(googleapiclient);
            }
            });
        }
    }
}

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
//            q, c, OnListParentsResponse, l, 
//            OnMetadataResponse, p, GetMetadataRequest, ab, 
//            ListParentsRequest, SetResourceParentsRequest, bb, UpdateMetadataRequest

public class w
    implements DriveResource
{
    private static class a extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(OnListParentsResponse onlistparentsresponse)
            throws RemoteException
        {
            onlistparentsresponse = new MetadataBuffer(onlistparentsresponse.ik(), null);
            De.b(new o.h(Status.Jv, onlistparentsresponse, false));
        }

        public void o(Status status)
            throws RemoteException
        {
            De.b(new o.h(status, null, false));
        }

        public a(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    private static class b extends com.google.android.gms.drive.internal.c
    {

        private final com.google.android.gms.common.api.BaseImplementation.b De;

        public void a(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            De.b(new c(Status.Jv, new l(onmetadataresponse.il())));
        }

        public void o(Status status)
            throws RemoteException
        {
            De.b(new c(status, null));
        }

        public b(com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            De = b1;
        }
    }

    private static class c
        implements com.google.android.gms.drive.DriveResource.MetadataResult
    {

        private final Status CM;
        private final Metadata Pd;

        public Metadata getMetadata()
        {
            return Pd;
        }

        public Status getStatus()
        {
            return CM;
        }

        public c(Status status, Metadata metadata)
        {
            CM = status;
            Pd = metadata;
        }
    }

    private abstract class d extends p
    {

        final w Pb;

        public Result c(Status status)
        {
            return v(status);
        }

        public com.google.android.gms.drive.DriveResource.MetadataResult v(Status status)
        {
            return new c(status, null);
        }

        private d()
        {
            Pb = w.this;
            super();
        }

    }


    protected final DriveId MW;

    protected w(DriveId driveid)
    {
        MW = driveid;
    }

    public PendingResult addChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener)
    {
        return ((q)googleapiclient.a(Drive.CU)).a(googleapiclient, MW, 1, changelistener);
    }

    public PendingResult addChangeListener(GoogleApiClient googleapiclient, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        return ((q)googleapiclient.a(Drive.CU)).a(googleapiclient, MW, 1, listener);
    }

    public PendingResult addChangeSubscription(GoogleApiClient googleapiclient)
    {
        return ((q)googleapiclient.a(Drive.CU)).a(googleapiclient, MW, 1);
    }

    public DriveId getDriveId()
    {
        return MW;
    }

    public PendingResult getMetadata(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new d() {

            final w Pb;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                q1.hY().a(new GetMetadataRequest(Pb.MW), new b(this));
            }

            
            {
                Pb = w.this;
                super();
            }
        });
    }

    public PendingResult listParents(GoogleApiClient googleapiclient)
    {
        return googleapiclient.a(new o.i() {

            final w Pb;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                q1.hY().a(new ListParentsRequest(Pb.MW), new a(this));
            }

            
            {
                Pb = w.this;
                super();
            }
        });
    }

    public PendingResult removeChangeListener(GoogleApiClient googleapiclient, ChangeListener changelistener)
    {
        return ((q)googleapiclient.a(Drive.CU)).b(googleapiclient, MW, 1, changelistener);
    }

    public PendingResult removeChangeListener(GoogleApiClient googleapiclient, com.google.android.gms.drive.events.DriveEvent.Listener listener)
    {
        return ((q)googleapiclient.a(Drive.CU)).b(googleapiclient, MW, 1, listener);
    }

    public PendingResult removeChangeSubscription(GoogleApiClient googleapiclient)
    {
        return ((q)googleapiclient.a(Drive.CU)).b(googleapiclient, MW, 1);
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
            return googleapiclient.b(new p.a(new ArrayList(set)) {

                final w Pb;
                final List Pc;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    q1.hY().a(new SetResourceParentsRequest(Pb.MW, Pc), new bb(this));
                }

            
            {
                Pb = w.this;
                Pc = list;
                super();
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
            return googleapiclient.b(new d(metadatachangeset) {

                final MetadataChangeSet OV;
                final w Pb;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    OV.hS().setContext(q1.getContext());
                    q1.hY().a(new UpdateMetadataRequest(Pb.MW, OV.hS()), new b(this));
                }

            
            {
                Pb = w.this;
                OV = metadatachangeset;
                super();
            }
            });
        }
    }
}

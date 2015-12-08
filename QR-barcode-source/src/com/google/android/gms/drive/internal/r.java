// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.drive.internal:
//            q, OpenContentsRequest, av, ab, 
//            v, CloseContentsRequest, bb, CloseContentsAndUpdateMetadataRequest

public class r
    implements DriveContents
{

    private final Contents Ox;

    public r(Contents contents)
    {
        Ox = (Contents)o.i(contents);
    }

    private PendingResult a(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions)
    {
        if (Ox.getMode() == 0x10000000)
        {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        }
        if (ExecutionOptions.aV(executionoptions.hQ()) && !Ox.hL())
        {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        ExecutionOptions.a(googleapiclient, executionoptions);
        if (Ox.hK())
        {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (getDriveId() == null)
        {
            throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
        }
        if (metadatachangeset == null)
        {
            metadatachangeset = MetadataChangeSet.Nt;
        }
        Ox.hJ();
        return googleapiclient.b(new p.a(metadatachangeset, executionoptions) {

            final r OL;
            final MetadataChangeSet OM;
            final ExecutionOptions ON;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((q)a1);
            }

            protected void a(q q1)
                throws RemoteException
            {
                OM.hS().setContext(q1.getContext());
                q1.hY().a(new CloseContentsAndUpdateMetadataRequest(r.a(OL).getDriveId(), OM.hS(), r.a(OL), ON), new bb(this));
            }

            
            {
                OL = r.this;
                OM = metadatachangeset;
                ON = executionoptions;
                super();
            }
        });
    }

    static Contents a(r r1)
    {
        return r1.Ox;
    }

    public PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        return a(googleapiclient, metadatachangeset, (new com.google.android.gms.drive.ExecutionOptions.Builder()).build());
    }

    public PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions)
    {
        return a(googleapiclient, metadatachangeset, executionoptions);
    }

    public void discard(GoogleApiClient googleapiclient)
    {
        if (Ox.hK())
        {
            throw new IllegalStateException("DriveContents already closed.");
        } else
        {
            Ox.hJ();
            ((_cls3)googleapiclient.b(new p.a() {

                final r OL;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    q1.hY().a(new CloseContentsRequest(r.a(OL), false), new bb(this));
                }

            
            {
                OL = r.this;
                super();
            }
            })).setResultCallback(new ResultCallback() {

                final r OL;

                public void k(Status status)
                {
                    if (!status.isSuccess())
                    {
                        v.q("DriveContentsImpl", "Error discarding contents");
                        return;
                    } else
                    {
                        v.n("DriveContentsImpl", "Contents discarded");
                        return;
                    }
                }

                public void onResult(Result result)
                {
                    k((Status)result);
                }

            
            {
                OL = r.this;
                super();
            }
            });
            return;
        }
    }

    public Contents getContents()
    {
        return Ox;
    }

    public DriveId getDriveId()
    {
        return Ox.getDriveId();
    }

    public InputStream getInputStream()
    {
        return Ox.getInputStream();
    }

    public int getMode()
    {
        return Ox.getMode();
    }

    public OutputStream getOutputStream()
    {
        return Ox.getOutputStream();
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        return Ox.getParcelFileDescriptor();
    }

    public PendingResult reopenForWrite(GoogleApiClient googleapiclient)
    {
        if (Ox.hK())
        {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (Ox.getMode() != 0x10000000)
        {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        } else
        {
            Ox.hJ();
            return googleapiclient.a(new o.d() {

                final r OL;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((q)a1);
                }

                protected void a(q q1)
                    throws RemoteException
                {
                    q1.hY().a(new OpenContentsRequest(OL.getDriveId(), 0x20000000, r.a(OL).getRequestId()), new av(this, null));
                }

            
            {
                OL = r.this;
                super();
            }
            });
        }
    }
}

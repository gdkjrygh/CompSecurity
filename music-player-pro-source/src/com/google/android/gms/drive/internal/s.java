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
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.jx;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, OpenContentsRequest, az, ae, 
//            CloseContentsAndUpdateMetadataRequest, bg, w, CloseContentsRequest

public class s
    implements DriveContents
{

    private final Contents PW;
    private boolean PX;
    private boolean PY;
    private boolean mClosed;

    public s(Contents contents)
    {
        mClosed = false;
        PX = false;
        PY = false;
        PW = (Contents)jx.i(contents);
    }

    static Contents a(s s1)
    {
        return s1.PW;
    }

    public PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        return commit(googleapiclient, metadatachangeset, null);
    }

    public PendingResult commit(GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions)
    {
        ExecutionOptions executionoptions1 = executionoptions;
        if (executionoptions == null)
        {
            executionoptions1 = (new com.google.android.gms.drive.ExecutionOptions.Builder()).build();
        }
        if (PW.getMode() == 0x10000000)
        {
            throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
        }
        if (ExecutionOptions.ba(executionoptions1.ix()) && !PW.ip())
        {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        ExecutionOptions.a(googleapiclient, executionoptions1);
        if (it())
        {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (getDriveId() == null)
        {
            throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
        }
        if (metadatachangeset == null)
        {
            metadatachangeset = MetadataChangeSet.OE;
        }
        is();
        return googleapiclient.b(new q.a(googleapiclient, metadatachangeset, executionoptions1) {

            final s PZ;
            final MetadataChangeSet Qa;
            final ExecutionOptions Qb;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((r)a1);
            }

            protected void a(r r1)
                throws RemoteException
            {
                Qa.iz().setContext(r1.getContext());
                r1.iG().a(new CloseContentsAndUpdateMetadataRequest(s.a(PZ).getDriveId(), Qa.iz(), s.a(PZ), Qb), new bg(this));
            }

            
            {
                PZ = s.this;
                Qa = metadatachangeset;
                Qb = executionoptions;
                super(googleapiclient);
            }
        });
    }

    public void discard(GoogleApiClient googleapiclient)
    {
        if (it())
        {
            throw new IllegalStateException("DriveContents already closed.");
        } else
        {
            is();
            ((_cls4)googleapiclient.b(new q.a(googleapiclient) {

                final s PZ;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.iG().a(new CloseContentsRequest(s.a(PZ), false), new bg(this));
                }

            
            {
                PZ = s.this;
                super(googleapiclient);
            }
            })).setResultCallback(new ResultCallback() {

                final s PZ;

                public void j(Status status)
                {
                    if (!status.isSuccess())
                    {
                        w.p("DriveContentsImpl", "Error discarding contents");
                        return;
                    } else
                    {
                        w.m("DriveContentsImpl", "Contents discarded");
                        return;
                    }
                }

                public void onResult(Result result)
                {
                    j((Status)result);
                }

            
            {
                PZ = s.this;
                super();
            }
            });
            return;
        }
    }

    public DriveId getDriveId()
    {
        return PW.getDriveId();
    }

    public InputStream getInputStream()
    {
        if (it())
        {
            throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
        }
        if (PW.getMode() != 0x10000000)
        {
            throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
        }
        if (PX)
        {
            throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
        } else
        {
            PX = true;
            return PW.getInputStream();
        }
    }

    public int getMode()
    {
        return PW.getMode();
    }

    public OutputStream getOutputStream()
    {
        if (it())
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        }
        if (PW.getMode() != 0x20000000)
        {
            throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
        }
        if (PY)
        {
            throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
        } else
        {
            PY = true;
            return PW.getOutputStream();
        }
    }

    public ParcelFileDescriptor getParcelFileDescriptor()
    {
        if (it())
        {
            throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
        } else
        {
            return PW.getParcelFileDescriptor();
        }
    }

    public Contents ir()
    {
        return PW;
    }

    public void is()
    {
        mClosed = true;
    }

    public boolean it()
    {
        return mClosed;
    }

    public PendingResult reopenForWrite(GoogleApiClient googleapiclient)
    {
        if (it())
        {
            throw new IllegalStateException("DriveContents already closed.");
        }
        if (PW.getMode() != 0x10000000)
        {
            throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
        } else
        {
            is();
            return googleapiclient.a(new p.b(googleapiclient) {

                final s PZ;

                protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                    throws RemoteException
                {
                    a((r)a1);
                }

                protected void a(r r1)
                    throws RemoteException
                {
                    r1.iG().a(new OpenContentsRequest(PZ.getDriveId(), 0x20000000, s.a(PZ).getRequestId()), new az(this, null));
                }

            
            {
                PZ = s.this;
                super(googleapiclient);
            }
            });
        }
    }
}

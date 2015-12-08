// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            v, r, CreateFileRequest, ae

class iClient extends iClient
{

    final MetadataChangeSet Qi;
    final int Qj;
    final int Qk;
    final ExecutionOptions Ql;
    final v Qm;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((r)a1);
    }

    protected void a(r r1)
        throws RemoteException
    {
        Qi.iz().setContext(r1.getContext());
        CreateFileRequest createfilerequest = new CreateFileRequest(Qm.getDriveId(), Qi.iz(), Qj, Qk, Ql);
        r1.iG().a(createfilerequest, new <init>(this));
    }

    iClient(v v1, GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, int i, int j, ExecutionOptions executionoptions)
    {
        Qm = v1;
        Qi = metadatachangeset;
        Qj = i;
        Qk = j;
        Ql = executionoptions;
        super(googleapiclient);
    }
}

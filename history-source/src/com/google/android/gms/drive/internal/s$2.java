// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            s, r, CloseContentsAndUpdateMetadataRequest, bg, 
//            ae

class iClient extends iClient
{

    final s PZ;
    final MetadataChangeSet Qa;
    final ExecutionOptions Qb;

    protected volatile void a(com.google.android.gms.common.api.a a1)
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

    iClient(s s1, GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions)
    {
        PZ = s1;
        Qa = metadatachangeset;
        Qb = executionoptions;
        super(googleapiclient);
    }
}

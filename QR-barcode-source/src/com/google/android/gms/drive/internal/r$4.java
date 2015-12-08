// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            r, q, CloseContentsAndUpdateMetadataRequest, bb, 
//            ab

class <init> extends <init>
{

    final r OL;
    final MetadataChangeSet OM;
    final ExecutionOptions ON;

    protected volatile void a(com.google.android.gms.common.api.a a1)
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

    ons(r r1, MetadataChangeSet metadatachangeset, ExecutionOptions executionoptions)
    {
        OL = r1;
        OM = metadatachangeset;
        ON = executionoptions;
        super();
    }
}

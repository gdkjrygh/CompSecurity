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
//            u, q, CreateFileRequest, ab

class <init> extends <init>
{

    final ExecutionOptions ON;
    final MetadataChangeSet OV;
    final int OW;
    final u OX;
    final Contents Ov;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((q)a1);
    }

    protected void a(q q1)
        throws RemoteException
    {
        OV.hS().setContext(q1.getContext());
        CreateFileRequest createfilerequest;
        int i;
        if (Ov == null)
        {
            i = 0;
        } else
        {
            i = Ov.getRequestId();
        }
        createfilerequest = new CreateFileRequest(OX.getDriveId(), OV.hS(), i, OW, ON);
        q1.hY().a(createfilerequest, new <init>(this));
    }

    ons(u u1, MetadataChangeSet metadatachangeset, Contents contents, int i, ExecutionOptions executionoptions)
    {
        OX = u1;
        OV = metadatachangeset;
        Ov = contents;
        OW = i;
        ON = executionoptions;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            w, q, UpdateMetadataRequest, ab

class <init> extends <init>
{

    final MetadataChangeSet OV;
    final w Pb;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((q)a1);
    }

    protected void a(q q1)
        throws RemoteException
    {
        OV.hS().setContext(q1.getContext());
        q1.hY().a(new UpdateMetadataRequest(Pb.MW, OV.hS()), new <init>(this));
    }

    eSet(w w1, MetadataChangeSet metadatachangeset)
    {
        Pb = w1;
        OV = metadatachangeset;
        super(w1, null);
    }
}

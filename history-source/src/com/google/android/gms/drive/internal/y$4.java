// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

// Referenced classes of package com.google.android.gms.drive.internal:
//            y, r, UpdateMetadataRequest, ae

class iClient extends iClient
{

    final MetadataChangeSet Qi;
    final y Qt;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((r)a1);
    }

    protected void a(r r1)
        throws RemoteException
    {
        Qi.iz().setContext(r1.getContext());
        r1.iG().a(new UpdateMetadataRequest(Qt.Oj, Qi.iz()), new <init>(this));
    }

    iClient(y y1, GoogleApiClient googleapiclient, MetadataChangeSet metadatachangeset)
    {
        Qt = y1;
        Qi = metadatachangeset;
        super(y1, googleapiclient, null);
    }
}

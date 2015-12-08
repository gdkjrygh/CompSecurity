// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive.internal:
//            p, r, QueryRequest, aa

class <init> extends <init>
{

    final Query IK;
    final p IL;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((r)a1);
    }

    protected void a(r r1)
        throws RemoteException
    {
        r1.gp().a(new QueryRequest(IK), new <init>(this));
    }

    yRequest(p p1, Query query)
    {
        IL = p1;
        IK = query;
        super(p1);
    }
}

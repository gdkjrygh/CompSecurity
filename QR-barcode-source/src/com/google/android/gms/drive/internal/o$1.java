// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive.internal:
//            o, q, QueryRequest, ab

class <init> extends <init>
{

    final Query Os;
    final o Ot;

    protected volatile void a(com.google.android.gms.common.api.a a1)
        throws RemoteException
    {
        a((q)a1);
    }

    protected void a(q q1)
        throws RemoteException
    {
        q1.hY().a(new QueryRequest(Os), new <init>(this));
    }

    yRequest(o o1, Query query)
    {
        Ot = o1;
        Os = query;
        super();
    }
}

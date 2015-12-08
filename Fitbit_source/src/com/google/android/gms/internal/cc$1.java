// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.k;

// Referenced classes of package com.google.android.gms.internal:
//            cc, ch

class <init> extends <init>
{

    final LocationRequest b;
    final k c;
    final cc d;

    protected void a(ch ch1)
        throws RemoteException
    {
        ch1.a(b, c, null);
        a(((com.google.android.gms.common.api.k) (Status.a)));
    }

    protected void b(com.google.android.gms.common.api.s.a a1)
        throws RemoteException
    {
        a((ch)a1);
    }

    ionRequest(cc cc1, h h, LocationRequest locationrequest, k k)
    {
        d = cc1;
        b = locationrequest;
        c = k;
        super(h);
    }
}

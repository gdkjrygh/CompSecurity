// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.f;

// Referenced classes of package com.google.android.gms.location.internal:
//            c, i

final class <init> extends <init>
{

    final LocationRequest b;
    final f c;
    final com.google.android.gms.location.internal.c d;

    protected final volatile void a(com.google.android.gms.common.api.._cls1 _pcls1)
        throws RemoteException
    {
        ((i)_pcls1).a(b, c);
        a(((com.google.android.gms.common.api.g) (Status.a)));
    }

    st(com.google.android.gms.location.internal.c c1, c c2, LocationRequest locationrequest, f f)
    {
        d = c1;
        b = locationrequest;
        c = f;
        super(c2);
    }
}

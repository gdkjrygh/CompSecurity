// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wearable.PutDataRequest;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw, bg, ao

final class nit> extends aw
{

    final PutDataRequest b;
    final bg c;

    public final g a(Status status)
    {
        return new <init>(status, null);
    }

    protected final volatile void a(com.google.android.gms.common.api._cls1 _pcls1)
        throws RemoteException
    {
        ((ao)_pcls1).a(this, b);
    }

    (bg bg1, c c1, PutDataRequest putdatarequest)
    {
        c = bg1;
        b = putdatarequest;
        super(c1);
    }
}

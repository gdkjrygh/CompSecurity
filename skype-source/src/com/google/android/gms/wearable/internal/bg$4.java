// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wearable.Asset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw, bg, ao, x

final class nit> extends aw
{

    final Asset b;
    final bg c;

    protected final g a(Status status)
    {
        return new <init>(status, null);
    }

    protected final void a(com.google.android.gms.common.api._cls4 _pcls4)
        throws RemoteException
    {
        _pcls4 = (ao)_pcls4;
        Asset asset = b;
        ((x)_pcls4.n()).a(new <init>(this), asset);
    }

    (bg bg1, c c1, Asset asset)
    {
        c = bg1;
        b = asset;
        super(c1);
    }
}

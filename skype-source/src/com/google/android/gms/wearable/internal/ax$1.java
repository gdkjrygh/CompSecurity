// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aw, ax, ao, x

final class nit> extends aw
{

    final String b;
    final int c = 1;
    final ax d;

    protected final g a(Status status)
    {
        return new <init>(status, null);
    }

    protected final void a(com.google.android.gms.common.api._cls1 _pcls1)
        throws RemoteException
    {
        _pcls1 = (ao)_pcls1;
        String s = b;
        int i = c;
        ((x)_pcls1.n()).a(new <init>(this), s, i);
    }

    (ax ax1, c c1, String s)
    {
        d = ax1;
        b = s;
        super(c1);
    }
}

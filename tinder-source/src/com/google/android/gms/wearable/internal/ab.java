// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.dp;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ay, ap

final class ab extends ay
{
    static interface a
    {

        public abstract void a(ap ap1, com.google.android.gms.internal.dg.b b1, Object obj, dp dp1)
            throws RemoteException;
    }


    private Object c;
    private dp d;
    private a e;

    private ab(c c1, Object obj, dp dp1, a a1)
    {
        super(c1);
        c = u.a(obj);
        d = (dp)u.a(dp1);
        e = (a)u.a(a1);
    }

    static d a(c c1, a a1, Object obj)
    {
        return c1.a(new ab(c1, obj, c1.a(obj), a1));
    }

    protected final void b(com.google.android.gms.common.api.a.b b1)
        throws RemoteException
    {
        b1 = (ap)b1;
        e.a(b1, this, c, d);
        c = null;
        d = null;
    }

    protected final f c(Status status)
    {
        c = null;
        d = null;
        return status;
    }
}

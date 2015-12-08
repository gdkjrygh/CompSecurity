// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.q;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            r, m

public final class v extends r.g
{

    final GoogleApiClient a;
    final m b;
    final boolean c;
    final long d;
    final long e[];
    final JSONObject f;
    final r g;

    public v(r r1, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, m m, boolean flag, long l, 
            long al[], JSONObject jsonobject)
    {
        g = r1;
        a = googleapiclient1;
        b = m;
        c = flag;
        d = l;
        e = al;
        f = jsonobject;
        super(googleapiclient);
    }

    protected final void zza(com.google.android.gms.common.api.Api.zzb zzb)
        throws RemoteException
    {
        zzb = ((com.google.android.gms.common.api.Api.zzb) (g.a));
        zzb;
        JVM INSTR monitorenter ;
        g.c.a = a;
        g.b.a(h, b, c, d, e, f);
        g.c.a = null;
_L1:
        zzb;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        zza(((com.google.android.gms.common.api.Result) (a(new Status(2100)))));
        g.c.a = null;
          goto _L1
        obj;
        zzb;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        g.c.a = null;
        throw obj;
    }
}

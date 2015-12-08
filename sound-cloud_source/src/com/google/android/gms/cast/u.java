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
//            r

public final class u extends r.g
{

    final GoogleApiClient a;
    final int b;
    final JSONObject c;
    final r d;

    public u(r r1, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, int i, JSONObject jsonobject)
    {
        d = r1;
        a = googleapiclient1;
        b = i;
        c = jsonobject;
        super(googleapiclient);
    }

    protected final void zza(com.google.android.gms.common.api.Api.zzb zzb)
        throws RemoteException
    {
        zzb = ((com.google.android.gms.common.api.Api.zzb) (d.a));
        zzb;
        JVM INSTR monitorenter ;
        d.c.a = a;
        d.b.a(h, 0, null, 0, Integer.valueOf(b), c);
        d.c.a = null;
_L1:
        zzb;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        zza(((com.google.android.gms.common.api.Result) (a(new Status(2100)))));
        d.c.a = null;
          goto _L1
        obj;
        zzb;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        d.c.a = null;
        throw obj;
    }
}

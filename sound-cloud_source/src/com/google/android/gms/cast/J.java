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
//            r, o

final class J extends r.g
{

    final GoogleApiClient a;
    final o b[];
    final int c;
    final JSONObject d;
    final r e;

    J(r r1, GoogleApiClient googleapiclient, GoogleApiClient googleapiclient1, o ao[], int i, JSONObject jsonobject)
    {
        e = r1;
        a = googleapiclient1;
        b = ao;
        c = i;
        d = jsonobject;
        super(googleapiclient);
    }

    protected final void zza(com.google.android.gms.common.api.Api.zzb zzb)
        throws RemoteException
    {
        zzb = ((com.google.android.gms.common.api.Api.zzb) (e.a));
        zzb;
        JVM INSTR monitorenter ;
        e.c.a = a;
        e.b.a(h, b, c, d);
        e.c.a = null;
_L1:
        zzb;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        zza(((com.google.android.gms.common.api.Result) (a(new Status(2100)))));
        e.c.a = null;
          goto _L1
        obj;
        zzb;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        e.c.a = null;
        throw obj;
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.q;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            r, p, o

public final class y extends r.g
{

    final int a;
    final int b;
    final GoogleApiClient c;
    final JSONObject d;
    final r e;

    public y(r r1, GoogleApiClient googleapiclient, int i, int j, GoogleApiClient googleapiclient1, JSONObject jsonobject)
    {
        e = r1;
        a = i;
        b = j;
        c = googleapiclient1;
        d = jsonobject;
        super(googleapiclient);
    }

    protected final void zza(com.google.android.gms.common.api.Api.zzb zzb)
        throws RemoteException
    {
        boolean flag = false;
        zzb = ((com.google.android.gms.common.api.Api.zzb) (e.a));
        zzb;
        JVM INSTR monitorenter ;
        int i = r.a(e, a);
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zza(((com.google.android.gms.common.api.Result) (a(new Status(0)))));
        zzb;
        JVM INSTR monitorexit ;
        return;
        if (b >= 0)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        zza(((com.google.android.gms.common.api.Result) (a(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[] {
            Integer.valueOf(b)
        }))))));
        zzb;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        zzb;
        JVM INSTR monitorexit ;
        throw obj;
        if (i != b)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        zza(((com.google.android.gms.common.api.Result) (a(new Status(0)))));
        zzb;
        JVM INSTR monitorexit ;
        return;
        if (b <= i) goto _L2; else goto _L1
_L1:
        i = b + 1;
_L3:
        o o1 = e.c().b(i);
        i = ((flag) ? 1 : 0);
        if (o1 == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        i = o1.b;
        e.c.a = c;
        q q1 = e.b;
        com.google.android.gms.cast.internal.s s = h;
        int j = a;
        JSONObject jsonobject = d;
        q1.a(s, new int[] {
            j
        }, i, jsonobject);
        e.c.a = null;
_L4:
        zzb;
        JVM INSTR monitorexit ;
        return;
_L2:
        i = b;
          goto _L3
        q1;
        zza(((com.google.android.gms.common.api.Result) (a(new Status(2100)))));
        e.c.a = null;
          goto _L4
        q1;
        e.c.a = null;
        throw q1;
          goto _L3
    }
}

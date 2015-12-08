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

public final class x extends r.g
{

    final int a;
    final GoogleApiClient b;
    final JSONObject c;
    final r d;

    public x(r r1, GoogleApiClient googleapiclient, int i, GoogleApiClient googleapiclient1, JSONObject jsonobject)
    {
        d = r1;
        a = i;
        b = googleapiclient1;
        c = jsonobject;
        super(googleapiclient);
    }

    protected final void zza(com.google.android.gms.common.api.Api.zzb zzb)
        throws RemoteException
    {
label0:
        {
            synchronized (d.a)
            {
                if (r.a(d, a) != -1)
                {
                    break label0;
                }
                zza(((com.google.android.gms.common.api.Result) (a(new Status(0)))));
            }
            return;
        }
        d.c.a = b;
        d.b.a(h, a, null, 0, null, c);
        d.c.a = null;
_L1:
        zzb;
        JVM INSTR monitorexit ;
        return;
        exception;
        zzb;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        obj;
        zza(((com.google.android.gms.common.api.Result) (a(new Status(2100)))));
        d.c.a = null;
          goto _L1
        obj;
        d.c.a = null;
        throw obj;
    }
}

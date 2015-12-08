// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.cast.internal.e;
import com.google.android.gms.cast.internal.l;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

final class f extends l
{

    final String a;
    final a.b.a b;

    f(a.b.a a1, GoogleApiClient googleapiclient, String s)
    {
        b = a1;
        a = s;
        super(googleapiclient);
    }

    protected final void zza(com.google.android.gms.common.api.Api.zzb zzb)
        throws RemoteException
    {
        e e1;
        e1 = (e)zzb;
        if (TextUtils.isEmpty(a))
        {
            zza(zzb(new Status(2001, "IllegalArgument: sessionId cannot be null or empty", null)));
            return;
        }
        String s = a;
        zzb = ((com.google.android.gms.common.api.Api.zzb) (e.h));
        zzb;
        JVM INSTR monitorenter ;
        if (e1.g == null) goto _L2; else goto _L1
_L1:
        zzn(new Status(2001));
_L4:
        try
        {
            ((m)e1.zzoA()).a(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.Api.zzb zzb)
        {
            a();
        }
        return;
_L2:
        e1.g = this;
        zzb;
        JVM INSTR monitorexit ;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        zzb;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

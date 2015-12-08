// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzi, zzn

final class h
    implements Runnable
{

    final AdRequestParcel a;
    final zzi b;

    h(zzi zzi1, AdRequestParcel adrequestparcel)
    {
        b = zzi1;
        a = adrequestparcel;
        super();
    }

    public final void run()
    {
        synchronized (zzi.a(b))
        {
            zzn zzn1 = b.a();
            zzi.a(b, new WeakReference(zzn1));
            zzn1.zzb(zzi.b(b));
            zzn1.zzb(zzi.c(b));
            zzn1.zza(zzi.d(b));
            zzn1.zza(zzi.e(b));
            zzn1.zzb(zzi.f(b));
            zzn1.zza(zzi.g(b));
            zzn1.zzb(zzi.h(b));
            zzn1.zzb(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}

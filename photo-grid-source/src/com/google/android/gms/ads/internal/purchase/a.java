// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.lu;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzc, zzf, zzk, zzg

final class a
    implements Runnable
{

    final zzf a;
    final Intent b;
    final zzc c;

    a(zzc zzc1, zzf zzf1, Intent intent)
    {
        c = zzc1;
        a = zzf1;
        b = intent;
        super();
    }

    public final void run()
    {
        if (zzc.a(c).zza(a.zzCR, -1, b))
        {
            zzc.c(c).a(new zzg(zzc.b(c), a.zzCS, true, -1, b, a));
            return;
        }
        try
        {
            zzc.c(c).a(new zzg(zzc.b(c), a.zzCS, false, -1, b, a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzaH("Fail to verify and dispatch pending transaction");
        }
        return;
    }
}

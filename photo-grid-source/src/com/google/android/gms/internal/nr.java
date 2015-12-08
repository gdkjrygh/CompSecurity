// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zzk;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            nj, pe

final class nr
    implements Runnable
{

    final AdRequestInfoParcel a;
    final zzk b;
    final nj c;

    nr(nj nj1, AdRequestInfoParcel adrequestinfoparcel, zzk zzk1)
    {
        c = nj1;
        a = adrequestinfoparcel;
        b = zzk1;
        super();
    }

    public final void run()
    {
        AdResponseParcel adresponseparcel;
        AdResponseParcel adresponseparcel1;
        try
        {
            adresponseparcel = c.zze(a);
        }
        catch (Exception exception)
        {
            zzp.zzby().a(exception, true);
            zzb.zzd("Could not fetch ad response due to an Exception.", exception);
            exception = null;
        }
        adresponseparcel1 = adresponseparcel;
        if (adresponseparcel == null)
        {
            adresponseparcel1 = new AdResponseParcel(0);
        }
        try
        {
            b.zzb(adresponseparcel1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Fail to forward ad response.", remoteexception);
        }
    }
}

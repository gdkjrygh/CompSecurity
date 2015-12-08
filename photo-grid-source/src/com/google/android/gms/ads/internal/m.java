// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.es;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn, zzq

final class m
    implements Runnable
{

    final zzd a;
    final zzn b;

    m(zzn zzn1, zzd zzd)
    {
        b = zzn1;
        a = zzd;
        super();
    }

    public final void run()
    {
        try
        {
            b.f.j.a(a);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", remoteexception);
        }
    }
}

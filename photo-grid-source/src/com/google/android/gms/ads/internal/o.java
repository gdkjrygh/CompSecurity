// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.fb;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.wb;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzn, zzq

final class o
    implements Runnable
{

    final String a;
    final pa b;
    final zzn c;

    o(zzn zzn1, String s, pa pa1)
    {
        c = zzn1;
        a = s;
        b = pa1;
        super();
    }

    public final void run()
    {
        try
        {
            ((fb)c.f.m.get(a)).a((zzf)b.w);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", remoteexception);
        }
    }
}

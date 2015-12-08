// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzfu, zzid, zzie, zzhl

class zzBw
    implements Runnable
{

    final zzfu zzBw;

    public void run()
    {
label0:
        {
            synchronized (zzBw.zzqt)
            {
                if (zzBw.zzBt.errorCode == -2)
                {
                    break label0;
                }
            }
            return;
        }
        zzBw.zzoA.zzgF().zza(zzBw);
        zzBw.zzfn();
        zzb.zzaB("Loading HTML in WebView.");
        zzBw.zzoA.loadDataWithBaseURL(zzo.zzbv().zzat(zzBw.zzBt.zzzG), zzBw.zzBt.zzCI, "text/html", "UTF-8", null);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (zzfu zzfu1)
    {
        zzBw = zzfu1;
        super();
    }
}

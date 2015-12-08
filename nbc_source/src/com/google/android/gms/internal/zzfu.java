// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzfp, zzhl, zzid, zzie

public class zzfu extends zzfp
{

    zzfu(Context context, zzha.zza zza, zzid zzid, zzft.zza zza1)
    {
        super(context, zza, zzid, zza1);
    }

    protected void zzfn()
    {
    }

    protected void zzh(long l)
        throws zzfs.zza
    {
        zzhl.zzGk.post(new Runnable() {

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

            
            {
                zzBw = zzfu.this;
                super();
            }
        });
        zzg(l);
    }
}

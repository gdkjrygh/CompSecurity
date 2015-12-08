// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.internal:
//            zzn, zzk, zzm, zzr

public class zze
    implements zzn
{
    private class zza
        implements Runnable
    {

        final zze zzu;
        private final zzk zzv;
        private final zzm zzw;
        private final Runnable zzx;

        public void run()
        {
            if (zzv.isCanceled())
            {
                zzv.zzd("canceled-at-delivery");
            } else
            {
                if (zzw.isSuccess())
                {
                    zzv.zza(zzw.result);
                } else
                {
                    zzv.zzc(zzw.zzah);
                }
                if (zzw.zzai)
                {
                    zzv.zzc("intermediate-response");
                } else
                {
                    zzv.zzd("done");
                }
                if (zzx != null)
                {
                    zzx.run();
                    return;
                }
            }
        }

        public zza(zzk zzk1, zzm zzm1, Runnable runnable)
        {
            zzu = zze.this;
            super();
            zzv = zzk1;
            zzw = zzm1;
            zzx = runnable;
        }
    }


    private final Executor zzs;

    public zze(Handler handler)
    {
        zzs = new Executor(handler) {

            final Handler zzt;
            final zze zzu;

            public void execute(Runnable runnable)
            {
                zzt.post(runnable);
            }

            
            {
                zzu = zze.this;
                zzt = handler;
                super();
            }
        };
    }

    public void zza(zzk zzk1, zzm zzm1)
    {
        zza(zzk1, zzm1, null);
    }

    public void zza(zzk zzk1, zzm zzm1, Runnable runnable)
    {
        zzk1.zzv();
        zzk1.zzc("post-response");
        zzs.execute(new zza(zzk1, zzm1, runnable));
    }

    public void zza(zzk zzk1, zzr zzr)
    {
        zzk1.zzc("post-error");
        zzr = zzm.zzd(zzr);
        zzs.execute(new zza(zzk1, zzr, null));
    }
}

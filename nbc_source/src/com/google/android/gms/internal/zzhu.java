// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            zzhs, zzhv

public class zzhu
{
    public static interface zza
    {

        public abstract Object zze(Object obj);
    }


    public static zzhv zza(zzhv zzhv1, zza zza1)
    {
        zzhs zzhs1 = new zzhs();
        zzhv1.zzb(new Runnable(zzhs1, zza1, zzhv1) {

            final zzhs zzGN;
            final zza zzGO;
            final zzhv zzGP;

            public void run()
            {
                try
                {
                    zzGN.zzf(zzGO.zze(zzGP.get()));
                    return;
                }
                catch (CancellationException cancellationexception) { }
                catch (InterruptedException interruptedexception) { }
                catch (ExecutionException executionexception) { }
                zzGN.cancel(true);
            }

            
            {
                zzGN = zzhs1;
                zzGO = zza1;
                zzGP = zzhv1;
                super();
            }
        });
        return zzhs1;
    }
}

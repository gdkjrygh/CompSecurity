// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            zzfs, zzfv

public class zzfu
{
    public static interface zza
    {

        public abstract Object zzb(Object obj);
    }


    public static zzfv zza(zzfv zzfv1, zza zza1)
    {
        zzfs zzfs1 = new zzfs();
        zzfv1.zzb(new Runnable(zzfs1, zza1, zzfv1) {

            final zzfs a;
            final zza b;
            final zzfv c;

            public void run()
            {
                try
                {
                    a.zzc(b.zzb(c.get()));
                    return;
                }
                catch (CancellationException cancellationexception) { }
                catch (InterruptedException interruptedexception) { }
                catch (ExecutionException executionexception) { }
                a.cancel(true);
            }

            
            {
                a = zzfs1;
                b = zza1;
                c = zzfv1;
                super();
            }
        });
        return zzfs1;
    }
}

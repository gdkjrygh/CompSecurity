// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzhn

public abstract class zzhl
{

    private final Runnable zzmG = new Runnable() {

        final zzhl zzzj;

        public final void run()
        {
            zzhl.zza(zzzj, Thread.currentThread());
            zzzj.zzdw();
        }

            
            {
                zzzj = zzhl.this;
                super();
            }
    };
    private volatile Thread zzzi;

    public zzhl()
    {
    }

    static Thread zza(zzhl zzhl1, Thread thread)
    {
        zzhl1.zzzi = thread;
        return thread;
    }

    public final void cancel()
    {
        onStop();
        if (zzzi != null)
        {
            zzzi.interrupt();
        }
    }

    public abstract void onStop();

    public final void start()
    {
        zzhn.zzb(zzmG);
    }

    public abstract void zzdw();

    public final void zzeq()
    {
        zzhn.zza(1, zzmG);
    }
}

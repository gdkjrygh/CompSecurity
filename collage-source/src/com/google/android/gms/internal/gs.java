// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            gv

public abstract class gs
{

    private volatile Thread zzHt;
    private final Runnable zzx = new zzhq._cls1(this);

    public gs()
    {
    }

    static Thread zza(gs gs1, Thread thread)
    {
        gs1.zzHt = thread;
        return thread;
    }

    public final void cancel()
    {
        onStop();
        if (zzHt != null)
        {
            zzHt.interrupt();
        }
    }

    public abstract void onStop();

    public abstract void zzdG();

    public final Future zzgn()
    {
        return gv.a(zzx);
    }

    public final void zzgo()
    {
        gv.a(1, zzx);
    }
}

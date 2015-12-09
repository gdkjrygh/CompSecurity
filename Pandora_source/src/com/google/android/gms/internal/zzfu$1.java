// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            zzfu, zzfv, zzfs

static final class c
    implements Runnable
{

    final zzfs a;
    final a b;
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

    a(zzfs zzfs1, a a1, zzfv zzfv1)
    {
        a = zzfs1;
        b = a1;
        c = zzfv1;
        super();
    }
}

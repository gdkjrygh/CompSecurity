// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzh;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            zzfk, zzfs, zzfc

static final class b
    implements Runnable
{

    final zzfs a;
    final Callable b;

    public void run()
    {
        try
        {
            Process.setThreadPriority(10);
            a.zzc(b.call());
            return;
        }
        catch (Exception exception)
        {
            zzh.zzaT().zzc(exception, true);
        }
        a.cancel(true);
    }

    (zzfs zzfs1, Callable callable)
    {
        a = zzfs1;
        b = callable;
        super();
    }
}

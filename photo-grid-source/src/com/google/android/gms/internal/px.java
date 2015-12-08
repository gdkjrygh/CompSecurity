// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            rf, pe

final class px
    implements Runnable
{

    final rf a;
    final Callable b;

    px(rf rf1, Callable callable)
    {
        a = rf1;
        b = callable;
        super();
    }

    public final void run()
    {
        try
        {
            Process.setThreadPriority(10);
            a.b(b.call());
            return;
        }
        catch (Exception exception)
        {
            zzp.zzby().a(exception, true);
        }
        a.cancel(true);
    }
}

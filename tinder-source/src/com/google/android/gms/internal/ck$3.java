// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.d;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal:
//            ck, cs, cf

static final class b
    implements Runnable
{

    final cs a;
    final Callable b;

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
            d.f().a(exception, true);
        }
        a.cancel(true);
    }

    (cs cs1, Callable callable)
    {
        a = cs1;
        b = callable;
        super();
    }
}

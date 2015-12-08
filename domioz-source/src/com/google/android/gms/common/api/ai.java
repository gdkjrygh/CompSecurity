// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.util.Log;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            r, aa

final class ai
    implements r
{

    final aa a;

    ai(aa aa1)
    {
        a = aa1;
        super();
    }

    private void a(int i)
    {
        aa.a(a).lock();
        if (aa.i(a) == i)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        Log.wtf("GoogleApiClientImpl", String.format("Internal error: step mismatch. Expected: %d, Actual: %d", new Object[] {
            Integer.valueOf(aa.i(a)), Integer.valueOf(i)
        }));
        aa.a(a, 4);
        aa.a(a).unlock();
        return;
        if (aa.j(a) == 1)
        {
            aa.c(a);
        }
        aa.a(a).unlock();
        return;
        Exception exception;
        exception;
        aa.a(a).unlock();
        throw exception;
    }

    public final void a()
    {
        a(0);
    }

    public final void b()
    {
        a(1);
    }
}

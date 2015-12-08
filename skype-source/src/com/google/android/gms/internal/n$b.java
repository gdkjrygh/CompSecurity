// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.internal:
//            n

private static final class a
    implements Runnable
{

    private Context a;

    public final void run()
    {
        a a1;
        a1 = new a(a);
        a1.a();
        com/google/android/gms/internal/n;
        JVM INSTR monitorenter ;
        if (com.google.android.gms.internal.n.a() != null) goto _L2; else goto _L1
_L1:
        com.google.android.gms.internal.n.a(a1);
_L3:
        com/google/android/gms/internal/n;
        JVM INSTR monitorexit ;
_L4:
        com.google.android.gms.internal.n.c().countDown();
        return;
_L2:
        a1.c();
          goto _L3
        Exception exception;
        exception;
        com/google/android/gms/internal/n;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (c c1)
        {
            n.b();
        }
        catch (IOException ioexception) { }
        catch (d d1) { }
          goto _L4
    }

    public (Context context)
    {
        a = context.getApplicationContext();
        if (a == null)
        {
            a = context;
        }
    }
}

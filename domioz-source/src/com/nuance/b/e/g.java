// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.e;

import android.util.Log;
import com.nuance.b.e.a.b;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.nuance.b.e:
//            c, w

final class g
    implements Runnable
{

    final c a;

    g(c c1)
    {
        a = c1;
        super();
    }

    public final void run()
    {
        try
        {
            c.c(a).waitForStartingComplete();
            c.d(a);
            c.e(a).compareAndSet(com.nuance.b.e.w.b, w.c);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("Nina", "Interrupted while waiting for the persona to start.");
        }
    }
}

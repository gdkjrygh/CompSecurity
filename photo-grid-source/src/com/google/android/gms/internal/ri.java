// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            rl, rk, rf

final class ri
    implements Runnable
{

    final rf a;
    final rk b;
    final rl c;

    ri(rf rf1, rk rk1, rl rl1)
    {
        a = rf1;
        b = rk1;
        c = rl1;
        super();
    }

    public final void run()
    {
        try
        {
            a.b(b.a(c.get()));
            return;
        }
        catch (CancellationException cancellationexception) { }
        catch (InterruptedException interruptedexception) { }
        catch (ExecutionException executionexception) { }
        a.cancel(true);
    }
}

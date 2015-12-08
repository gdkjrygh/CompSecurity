// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            gz, ha, gx

static final class c
    implements Runnable
{

    final gx a;
    final ncel b;
    final ha c;

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

    on(gx gx1, on on, ha ha1)
    {
        a = gx1;
        b = on;
        c = ha1;
        super();
    }
}

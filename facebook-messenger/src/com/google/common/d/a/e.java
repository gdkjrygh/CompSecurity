// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.d.a:
//            d, f

class e
{

    final Runnable a;
    final Executor b;

    e(Runnable runnable, Executor executor)
    {
        a = runnable;
        b = executor;
    }

    void a()
    {
        if (d.b() == null)
        {
            try
            {
                b.execute(a);
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                d.c().log(Level.SEVERE, (new StringBuilder()).append("RuntimeException while executing runnable ").append(a).append(" with executor ").append(b).toString(), runtimeexception);
            }
            return;
        }
        try
        {
            b.execute(a);
            return;
        }
        catch (Throwable throwable)
        {
            d.b().a(throwable);
        }
    }
}

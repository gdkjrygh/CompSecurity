// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.android.gms.internal:
//            ha, gx

public final class gz
{
    public static interface a
    {

        public abstract Object a(Object obj);
    }


    // Unreferenced inner class com/google/android/gms/internal/gz$1

/* anonymous class */
    static final class _cls1
        implements Runnable
    {

        final gx a;
        final a b;
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

            
            {
                a = gx1;
                b = a1;
                c = ha1;
                super();
            }
    }

}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.util.Log;

// Referenced classes of package crittercism.android:
//            l

public final class a
    implements Runnable
{

    final l a;

    public final void run()
    {
        l l1;
        Thread thread;
        l1 = l.i();
        thread = l1.r;
_L2:
        if (l1.q || thread == null || !thread.isAlive())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        thread.join();
        continue; /* Loop/switch isn't completed */
        InterruptedException interruptedexception;
        interruptedexception;
        if (!l1.q)
        {
            continue; /* Loop/switch isn't completed */
        }
        Exception exception1;
        try
        {
            l1.a(false);
            l1.k();
            return;
        }
        catch (Exception exception)
        {
            (new StringBuilder("Exception in AppLoadRunnable: ")).append(exception.getClass().getName());
        }
        break; /* Loop/switch isn't completed */
        exception1;
        Log.w("CrittercismInstance", "Exception in Thread in sendAppLoadData");
        if (true) goto _L2; else goto _L1
_L1:
    }

    public eption(l l1)
    {
        a = l1;
        super();
    }
}

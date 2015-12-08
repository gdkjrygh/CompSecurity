// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.os.Handler;

// Referenced classes of package com.yume.android.player:
//            n, r

final class p
    implements Runnable
{

    private n a;

    p(n n1)
    {
        a = n1;
        super();
    }

    public final void run()
    {
        int i;
        int i1;
        int j1;
        i1 = a.b.a();
        j1 = a.b.b();
        i = 0;
_L2:
        int j = 0;
_L3:
        if (j < i1)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        j = i;
        if (j1 != 0)
        {
            j = i + 1;
        }
        if (!a.a || j > j1)
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
        if (!Thread.currentThread().isInterrupted()) goto _L2; else goto _L1
_L1:
        return;
        a.c = a.b.b(j);
        int l = a.b.a(j);
        int k = l;
        if (l <= 0)
        {
            k = 100;
        }
        a.d.post(a.f);
        long l1 = k;
        try
        {
            Thread.sleep(l1);
        }
        catch (InterruptedException interruptedexception) { }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        j++;
          goto _L3
    }
}

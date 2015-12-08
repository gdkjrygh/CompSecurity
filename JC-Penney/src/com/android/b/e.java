// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.b:
//            d, q

class e
    implements Runnable
{

    final q a;
    final d b;

    e(d d1, q q)
    {
        b = d1;
        a = q;
        super();
    }

    public void run()
    {
        try
        {
            d.a(b).put(a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}

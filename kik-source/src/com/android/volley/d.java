// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            c, n

final class d
    implements Runnable
{

    final n a;
    final c b;

    d(c c1, n n)
    {
        b = c1;
        a = n;
        super();
    }

    public final void run()
    {
        try
        {
            c.a(b).put(a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}

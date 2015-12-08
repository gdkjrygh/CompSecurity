// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.google.android.m4b.maps.a:
//            c, k

final class a
    implements Runnable
{

    private k a;
    private c b;

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

    (c c1, k k)
    {
        b = c1;
        a = k;
        super();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            CacheDispatcher, k

class a
    implements Runnable
{

    final k a;
    final CacheDispatcher b;

    public void run()
    {
        try
        {
            CacheDispatcher.a(b).put(a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    (CacheDispatcher cachedispatcher, k k)
    {
        b = cachedispatcher;
        a = k;
        super();
    }
}

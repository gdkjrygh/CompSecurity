// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.volley;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.mopub.volley:
//            CacheDispatcher, Request

final class a
    implements Runnable
{

    final Request a;
    final CacheDispatcher b;

    a(CacheDispatcher cachedispatcher, Request request)
    {
        b = cachedispatcher;
        a = request;
        super();
    }

    public final void run()
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
}

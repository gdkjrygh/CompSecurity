// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            b, Request

final class 
    implements Runnable
{

    final Request a;
    final b b;

    public final void run()
    {
        try
        {
            com.android.volley.b.a(b).put(a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    est(b b1, Request request)
    {
        b = b1;
        a = request;
        super();
    }
}

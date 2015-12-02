// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import java.util.concurrent.BlockingQueue;

// Referenced classes of package com.android.volley:
//            b, Request

class 
    implements Runnable
{

    final b a;
    private final Request b;

    public void run()
    {
        try
        {
            a.b.put(b);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    est(b b1, Request request)
    {
        a = b1;
        b = request;
        super();
    }
}

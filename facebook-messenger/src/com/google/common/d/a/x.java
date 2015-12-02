// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

final class x
    implements Runnable
{

    final ExecutorService a;
    final long b;
    final TimeUnit c;

    public void run()
    {
        try
        {
            a.shutdown();
            a.awaitTermination(b, c);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}

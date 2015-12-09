// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.millennialmedia.internal:
//            MMIntentWrapperActivity

static final class 
    implements Runnable
{

    final a a;

    public void run()
    {
        try
        {
            if (!a.a.await(5000L, TimeUnit.MILLISECONDS))
            {
                a.b.a("Failed to start activity");
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.communicator;

import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;

// Referenced classes of package kik.android.net.communicator:
//            a

private final class b extends TimerTask
{

    final a a;
    private b b;

    public final void run()
    {
        try
        {
            if (b.c())
            {
                return;
            }
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        kik.android.net.communicator.a.r(a).put(new <init>(a, 4, b));
        return;
    }

    public e(a a1, e e)
    {
        a = a1;
        super();
        b = e;
    }
}

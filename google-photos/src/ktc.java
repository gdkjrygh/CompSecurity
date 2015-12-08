// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.BlockingQueue;

final class ktc
    implements Runnable
{

    private kyw a;
    private ktb b;

    ktc(ktb ktb1, kyw kyw)
    {
        b = ktb1;
        a = kyw;
        super();
    }

    public final void run()
    {
        try
        {
            ktb.a(b).put(a);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }
}

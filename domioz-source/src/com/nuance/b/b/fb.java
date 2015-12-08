// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;


// Referenced classes of package com.nuance.b.b:
//            fr, es

final class fb extends Thread
{

    es a;

    public fb(es es1)
    {
        super("PromptPlayer_QueueReaderThread");
        a = es1;
    }

    public final void run()
    {
        fr.c("QueueReaderThread starting...");
        try
        {
            do
            {
                a.b();
            } while (true);
        }
        catch (InterruptedException interruptedexception)
        {
            fr.c("QueueReaderThread interrupted.");
        }
    }
}

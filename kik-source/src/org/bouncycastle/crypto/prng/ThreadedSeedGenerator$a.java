// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.prng;


// Referenced classes of package org.bouncycastle.crypto.prng:
//            ThreadedSeedGenerator

private final class <init>
    implements Runnable
{

    final ThreadedSeedGenerator a;
    private volatile int b;
    private volatile boolean c;

    public final byte[] generateSeed(int i, boolean flag)
    {
        int k = 0;
        Thread thread = new Thread(this);
        byte abyte0[] = new byte[i];
        b = 0;
        c = false;
        thread.start();
        int j = i;
        if (!flag)
        {
            j = i * 8;
        }
        i = 0;
        while (i < j) 
        {
            while (b == k) 
            {
                try
                {
                    Thread.sleep(1L);
                }
                catch (InterruptedException interruptedexception) { }
            }
            k = b;
            if (flag)
            {
                abyte0[i] = (byte)(k & 0xff);
            } else
            {
                int l = i / 8;
                abyte0[l] = (byte)(abyte0[l] << 1 | k & 1);
            }
            i++;
        }
        c = true;
        return abyte0;
    }

    public final void run()
    {
        while (!c) 
        {
            b = b + 1;
        }
    }

    private (ThreadedSeedGenerator threadedseedgenerator)
    {
        a = threadedseedgenerator;
        super();
        b = 0;
        c = false;
    }

    c(ThreadedSeedGenerator threadedseedgenerator, c c1)
    {
        this(threadedseedgenerator);
    }
}

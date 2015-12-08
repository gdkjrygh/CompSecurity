// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.prng;


// Referenced classes of package org.bouncycastle.crypto.prng:
//            ThreadedSeedGenerator

private class <init>
    implements Runnable
{

    private volatile int counter;
    private volatile boolean stop;
    final ThreadedSeedGenerator this$0;

    public byte[] generateSeed(int i, boolean flag)
    {
        int j = 0;
        Thread thread = new Thread(this);
        byte abyte0[] = new byte[i];
        counter = 0;
        stop = false;
        thread.start();
        int k;
        if (!flag)
        {
            i *= 8;
        }
        k = 0;
        while (j < i) 
        {
            while (counter == k) 
            {
                try
                {
                    Thread.sleep(1L);
                }
                catch (InterruptedException interruptedexception) { }
            }
            k = counter;
            if (flag)
            {
                abyte0[j] = (byte)(k & 0xff);
            } else
            {
                int l = j / 8;
                abyte0[l] = (byte)(abyte0[l] << 1 | k & 1);
            }
            j++;
        }
        stop = true;
        return abyte0;
    }

    public void run()
    {
        while (!stop) 
        {
            counter = counter + 1;
        }
    }

    private ()
    {
        this$0 = ThreadedSeedGenerator.this;
        super();
        counter = 0;
        stop = false;
    }

    stop(stop stop1)
    {
        this();
    }
}

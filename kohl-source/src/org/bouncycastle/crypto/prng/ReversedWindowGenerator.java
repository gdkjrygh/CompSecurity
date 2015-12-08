// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.prng;


// Referenced classes of package org.bouncycastle.crypto.prng:
//            RandomGenerator

public class ReversedWindowGenerator
    implements RandomGenerator
{

    private final RandomGenerator generator;
    private byte window[];
    private int windowCount;

    public ReversedWindowGenerator(RandomGenerator randomgenerator, int i)
    {
        if (randomgenerator == null)
        {
            throw new IllegalArgumentException("generator cannot be null");
        }
        if (i < 2)
        {
            throw new IllegalArgumentException("windowSize must be at least 2");
        } else
        {
            generator = randomgenerator;
            window = new byte[i];
            return;
        }
    }

    private void doNextBytes(byte abyte0[], int i, int j)
    {
        int k = 0;
        this;
        JVM INSTR monitorenter ;
_L2:
        if (k >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte1[];
        int l;
        if (windowCount < 1)
        {
            generator.nextBytes(window, 0, window.length);
            windowCount = window.length;
        }
        abyte1 = window;
        l = windowCount - 1;
        windowCount = l;
        abyte0[k + i] = abyte1[l];
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void addSeedMaterial(long l)
    {
        this;
        JVM INSTR monitorenter ;
        windowCount = 0;
        generator.addSeedMaterial(l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void addSeedMaterial(byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        windowCount = 0;
        generator.addSeedMaterial(abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    public void nextBytes(byte abyte0[])
    {
        doNextBytes(abyte0, 0, abyte0.length);
    }

    public void nextBytes(byte abyte0[], int i, int j)
    {
        doNextBytes(abyte0, i, j);
    }
}

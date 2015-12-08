// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.prng;


// Referenced classes of package org.bouncycastle.crypto.prng:
//            RandomGenerator

public class ReversedWindowGenerator
    implements RandomGenerator
{

    private final RandomGenerator a;
    private byte b[];
    private int c;

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
            a = randomgenerator;
            b = new byte[i];
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
        if (c <= 0)
        {
            a.nextBytes(b, 0, b.length);
            c = b.length;
        }
        abyte1 = b;
        l = c - 1;
        c = l;
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
        c = 0;
        a.addSeedMaterial(l);
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
        c = 0;
        a.addSeedMaterial(abyte0);
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

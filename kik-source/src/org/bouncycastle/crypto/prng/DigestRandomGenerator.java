// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.crypto.prng:
//            RandomGenerator

public class DigestRandomGenerator
    implements RandomGenerator
{

    private static long a = 10L;
    private long b;
    private long c;
    private Digest d;
    private byte e[];
    private byte f[];

    public DigestRandomGenerator(Digest digest)
    {
        d = digest;
        f = new byte[digest.getDigestSize()];
        c = 1L;
        e = new byte[digest.getDigestSize()];
        b = 1L;
    }

    private void cycleSeed()
    {
        digestUpdate(f);
        long l = c;
        c = 1L + l;
        digestAddCounter(l);
        digestDoFinal(f);
    }

    private void digestAddCounter(long l)
    {
        for (int i = 0; i != 8; i++)
        {
            d.update((byte)(int)l);
            l >>>= 8;
        }

    }

    private void digestDoFinal(byte abyte0[])
    {
        d.doFinal(abyte0, 0);
    }

    private void digestUpdate(byte abyte0[])
    {
        d.update(abyte0, 0, abyte0.length);
    }

    private void generateState()
    {
        long l = b;
        b = 1L + l;
        digestAddCounter(l);
        digestUpdate(e);
        digestUpdate(f);
        digestDoFinal(e);
        if (b % a == 0L)
        {
            cycleSeed();
        }
    }

    public void addSeedMaterial(long l)
    {
        this;
        JVM INSTR monitorenter ;
        digestAddCounter(l);
        digestUpdate(f);
        digestDoFinal(f);
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
        digestUpdate(abyte0);
        digestUpdate(f);
        digestDoFinal(f);
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
        nextBytes(abyte0, 0, abyte0.length);
    }

    public void nextBytes(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        generateState();
        int k;
        int l;
        k = 0;
        l = i;
_L2:
        int i1;
        i1 = l;
        if (i1 == i + j)
        {
            break; /* Loop/switch isn't completed */
        }
        l = k;
        if (k != e.length)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        generateState();
        l = 0;
        abyte0[i1] = e[l];
        i1++;
        k = l + 1;
        l = i1;
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

}

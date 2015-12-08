// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;

public abstract class GeneralDigest
    implements ExtendedDigest
{

    private byte a[];
    private int b;
    private long c;

    protected GeneralDigest()
    {
        a = new byte[4];
        b = 0;
    }

    protected GeneralDigest(GeneralDigest generaldigest)
    {
        a = new byte[generaldigest.a.length];
        System.arraycopy(generaldigest.a, 0, a, 0, generaldigest.a.length);
        b = generaldigest.b;
        c = generaldigest.c;
    }

    public void finish()
    {
        long l = c;
        update((byte)-128);
        while (b != 0) 
        {
            update((byte)0);
        }
        processLength(l << 3);
        processBlock();
    }

    public int getByteLength()
    {
        return 64;
    }

    protected abstract void processBlock();

    protected abstract void processLength(long l);

    protected abstract void processWord(byte abyte0[], int i);

    public void reset()
    {
        c = 0L;
        b = 0;
        for (int i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }

    }

    public void update(byte byte0)
    {
        byte abyte0[] = a;
        int i = b;
        b = i + 1;
        abyte0[i] = byte0;
        if (b == a.length)
        {
            processWord(a, 0);
            b = 0;
        }
        c = c + 1L;
    }

    public void update(byte abyte0[], int i, int j)
    {
        int k = j;
        int l = i;
        do
        {
            i = l;
            j = k;
            if (b == 0)
            {
                break;
            }
            i = l;
            j = k;
            if (k <= 0)
            {
                break;
            }
            update(abyte0[l]);
            l++;
            k--;
        } while (true);
        do
        {
            k = i;
            l = j;
            if (j <= a.length)
            {
                break;
            }
            processWord(abyte0, i);
            i += a.length;
            j -= a.length;
            c = c + (long)a.length;
        } while (true);
        for (; l > 0; l--)
        {
            update(abyte0[k]);
            k++;
        }

    }
}

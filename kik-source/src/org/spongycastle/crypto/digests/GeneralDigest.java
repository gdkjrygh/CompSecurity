// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;

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

    public final void a(byte byte0)
    {
        byte abyte0[] = a;
        int i = b;
        b = i + 1;
        abyte0[i] = byte0;
        if (b == a.length)
        {
            b(a, 0);
            b = 0;
        }
        c = c + 1L;
    }

    protected abstract void a(long l);

    public final void a(byte abyte0[], int i, int j)
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
            a(abyte0[l]);
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
            b(abyte0, i);
            i += a.length;
            j -= a.length;
            c = c + (long)a.length;
        } while (true);
        for (; l > 0; l--)
        {
            a(abyte0[k]);
            k++;
        }

    }

    protected abstract void b(byte abyte0[], int i);

    public void c()
    {
        c = 0L;
        b = 0;
        for (int i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }

    }

    public final int d()
    {
        return 64;
    }

    public final void e()
    {
        long l = c;
        a((byte)-128);
        while (b != 0) 
        {
            a((byte)0);
        }
        a(l << 3);
        f();
    }

    protected abstract void f();
}

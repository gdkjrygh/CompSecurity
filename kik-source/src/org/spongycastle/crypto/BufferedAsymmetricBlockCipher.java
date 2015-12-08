// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;


// Referenced classes of package org.spongycastle.crypto:
//            AsymmetricBlockCipher, DataLengthException, CipherParameters

public class BufferedAsymmetricBlockCipher
{

    protected byte a[];
    protected int b;
    private final AsymmetricBlockCipher c;

    public BufferedAsymmetricBlockCipher(AsymmetricBlockCipher asymmetricblockcipher)
    {
        c = asymmetricblockcipher;
    }

    private void d()
    {
        if (a != null)
        {
            for (int i = 0; i < a.length; i++)
            {
                a[i] = 0;
            }

        }
        b = 0;
    }

    public final int a()
    {
        return c.a();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        d();
        c.a(flag, cipherparameters);
        int j = c.a();
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        a = new byte[i + j];
        b = 0;
    }

    public final void a(byte abyte0[], int i, int j)
    {
        if (j == 0)
        {
            return;
        }
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        if (b + j > a.length)
        {
            throw new DataLengthException("attempt to process message too long for cipher");
        } else
        {
            System.arraycopy(abyte0, i, a, b, j);
            b = b + j;
            return;
        }
    }

    public final int b()
    {
        return c.b();
    }

    public final byte[] c()
    {
        byte abyte0[] = c.a(a, 0, b);
        d();
        return abyte0;
    }
}

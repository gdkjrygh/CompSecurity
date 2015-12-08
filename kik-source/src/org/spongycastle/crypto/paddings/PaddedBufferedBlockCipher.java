// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.paddings;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithRandom;

// Referenced classes of package org.spongycastle.crypto.paddings:
//            PKCS7Padding, BlockCipherPadding

public class PaddedBufferedBlockCipher extends BufferedBlockCipher
{

    BlockCipherPadding g;

    public PaddedBufferedBlockCipher(BlockCipher blockcipher)
    {
        this(blockcipher, ((BlockCipherPadding) (new PKCS7Padding())));
    }

    public PaddedBufferedBlockCipher(BlockCipher blockcipher, BlockCipherPadding blockcipherpadding)
    {
        d = blockcipher;
        g = blockcipherpadding;
        a = new byte[blockcipher.b()];
        b = 0;
    }

    public final int a(int i)
    {
        i = b + i;
        int j = i % a.length;
        if (j == 0)
        {
            return i - a.length;
        } else
        {
            return i - j;
        }
    }

    public final int a(byte abyte0[], int i)
    {
        int j = d.b();
        if (c)
        {
            if (b == j)
            {
                if (j * 2 + i > abyte0.length)
                {
                    c();
                    throw new DataLengthException("output buffer too short");
                }
                j = d.a(a, 0, abyte0, i);
                b = 0;
            } else
            {
                j = 0;
            }
            g.a(a, b);
            i = d.a(a, 0, abyte0, i + j);
            c();
            return j + i;
        }
        if (b != j)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        j = d.a(a, 0, a, 0);
        b = 0;
        j -= g.a(a);
        System.arraycopy(a, 0, abyte0, i, j);
        c();
        return j;
        c();
        throw new DataLengthException("last block incomplete in decryption");
        abyte0;
        c();
        throw abyte0;
    }

    public final int a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int i2 = b();
        int l = a(j);
        if (l > 0 && l + k > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        int j1 = a.length - b;
        int k1;
        int l1;
        if (j > j1)
        {
            System.arraycopy(abyte0, i, a, b, j1);
            int i1 = d.a(a, 0, abyte1, k) + 0;
            b = 0;
            j -= j1;
            i = j1 + i;
            do
            {
                l1 = i1;
                k1 = j;
                j1 = i;
                if (j <= a.length)
                {
                    break;
                }
                i1 += d.a(abyte0, i, abyte1, k + i1);
                j -= i2;
                i += i2;
            } while (true);
        } else
        {
            l1 = 0;
            j1 = i;
            k1 = j;
        }
        System.arraycopy(abyte0, j1, a, b, k1);
        b = k1 + b;
        return l1;
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
        c();
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            g.a(cipherparameters.a());
            d.a(flag, cipherparameters.b());
            return;
        } else
        {
            g.a(null);
            d.a(flag, cipherparameters);
            return;
        }
    }

    public final int b(int i)
    {
        int j = b + i;
        i = j % a.length;
        if (i == 0)
        {
            i = j;
            if (c)
            {
                i = j + a.length;
            }
            return i;
        } else
        {
            return (j - i) + a.length;
        }
    }
}

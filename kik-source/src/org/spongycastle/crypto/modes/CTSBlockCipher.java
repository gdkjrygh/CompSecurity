// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.DataLengthException;

// Referenced classes of package org.spongycastle.crypto.modes:
//            OFBBlockCipher, CFBBlockCipher, CBCBlockCipher

public class CTSBlockCipher extends BufferedBlockCipher
{

    private int g;

    public CTSBlockCipher(BlockCipher blockcipher)
    {
        if ((blockcipher instanceof OFBBlockCipher) || (blockcipher instanceof CFBBlockCipher))
        {
            throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
        } else
        {
            d = blockcipher;
            g = blockcipher.b();
            a = new byte[g * 2];
            b = 0;
            return;
        }
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
        if (b + i > abyte0.length)
        {
            throw new DataLengthException("output buffer to small in doFinal");
        }
        int j = d.b();
        int j1 = b - j;
        byte abyte1[] = new byte[j];
        if (c)
        {
            d.a(a, 0, abyte1, 0);
            if (b < j)
            {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            for (int k = b; k != a.length; k++)
            {
                a[k] = abyte1[k - j];
            }

            for (int l = j; l != b; l++)
            {
                byte abyte2[] = a;
                abyte2[l] = (byte)(abyte2[l] ^ abyte1[l - j]);
            }

            if (d instanceof CBCBlockCipher)
            {
                ((CBCBlockCipher)d).d().a(a, j, abyte0, i);
            } else
            {
                d.a(a, j, abyte0, i);
            }
            System.arraycopy(abyte1, 0, abyte0, i + j, j1);
        } else
        {
            byte abyte3[] = new byte[j];
            int i1;
            if (d instanceof CBCBlockCipher)
            {
                ((CBCBlockCipher)d).d().a(a, 0, abyte1, 0);
            } else
            {
                d.a(a, 0, abyte1, 0);
            }
            for (i1 = j; i1 != b; i1++)
            {
                abyte3[i1 - j] = (byte)(abyte1[i1 - j] ^ a[i1]);
            }

            System.arraycopy(a, j, abyte1, 0, j1);
            d.a(abyte1, 0, abyte0, i);
            System.arraycopy(abyte3, 0, abyte0, i + j, j1);
        }
        i = b;
        c();
        return i;
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
            System.arraycopy(a, i2, a, 0, i2);
            b = i2;
            j -= j1;
            i += j1;
            do
            {
                l1 = i1;
                k1 = i;
                j1 = j;
                if (j <= i2)
                {
                    break;
                }
                System.arraycopy(abyte0, i, a, b, i2);
                i1 += d.a(a, 0, abyte1, k + i1);
                System.arraycopy(a, i2, a, 0, i2);
                j -= i2;
                i += i2;
            } while (true);
        } else
        {
            l1 = 0;
            j1 = j;
            k1 = i;
        }
        System.arraycopy(abyte0, k1, a, b, j1);
        b = b + j1;
        return l1;
    }

    public final int b(int i)
    {
        return b + i;
    }
}

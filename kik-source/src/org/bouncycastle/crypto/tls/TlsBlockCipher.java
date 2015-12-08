// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCipher, TlsClientContext, SecurityParameters, TlsUtils, 
//            TlsMac, TlsFatalAlert

public class TlsBlockCipher
    implements TlsCipher
{

    protected TlsClientContext a;
    protected BlockCipher b;
    protected BlockCipher c;
    protected TlsMac d;
    protected TlsMac e;

    public TlsBlockCipher(TlsClientContext tlsclientcontext, BlockCipher blockcipher, BlockCipher blockcipher1, Digest digest, Digest digest1, int i)
    {
        a = tlsclientcontext;
        b = blockcipher;
        c = blockcipher1;
        int j = digest.getDigestSize();
        int k = digest1.getDigestSize();
        int l = blockcipher.getBlockSize();
        int i1 = blockcipher1.getBlockSize();
        tlsclientcontext = tlsclientcontext.getSecurityParameters();
        tlsclientcontext = TlsUtils.PRF(((SecurityParameters) (tlsclientcontext)).c, "key expansion", TlsUtils.concat(((SecurityParameters) (tlsclientcontext)).b, ((SecurityParameters) (tlsclientcontext)).a), i * 2 + j + k + l + i1);
        d = new TlsMac(digest, tlsclientcontext, 0, digest.getDigestSize());
        j = digest.getDigestSize() + 0;
        e = new TlsMac(digest1, tlsclientcontext, j, digest1.getDigestSize());
        j += digest1.getDigestSize();
        initCipher(true, blockcipher, tlsclientcontext, i, j, j + i * 2);
        j += i;
        initCipher(false, blockcipher1, tlsclientcontext, i, j, j + i + blockcipher.getBlockSize());
    }

    protected int chooseExtraPadBlocks(SecureRandom securerandom, int i)
    {
        return Math.min(lowestBitSet(securerandom.nextInt()), i);
    }

    public byte[] decodeCiphertext(short word0, byte abyte0[], int i, int j)
    {
        boolean flag = true;
        int j1 = e.getSize() + 1;
        int i1 = c.getBlockSize();
        if (j < j1)
        {
            throw new TlsFatalAlert((short)50);
        }
        if (j % i1 != 0)
        {
            throw new TlsFatalAlert((short)21);
        }
        for (int k = 0; k < j; k += i1)
        {
            c.processBlock(abyte0, k + i, abyte0, k + i);
        }

        int k1 = (i + j) - 1;
        byte byte0 = abyte0[k1];
        i1 = byte0 & 0xff;
        j1 = j - j1;
        byte abyte1[];
        byte abyte3[];
        int l;
        if (i1 > j1)
        {
            l = 0;
            j = 1;
        } else
        {
            j = k1 - i1;
            l = 0;
            for (; j < k1; j++)
            {
                l = (byte)(l | abyte0[j] ^ byte0);
            }

            byte abyte2[];
            if (l != 0)
            {
                l = 0;
                j = 1;
            } else
            {
                j = 0;
                l = i1;
            }
        }
        l = j1 - l;
        abyte1 = e.calculateMac(word0, abyte0, i, l);
        abyte3 = new byte[abyte1.length];
        System.arraycopy(abyte0, i + l, abyte3, 0, abyte1.length);
        if (!Arrays.b(abyte1, abyte3))
        {
            j = ((flag) ? 1 : 0);
        }
        if (j != 0)
        {
            throw new TlsFatalAlert((short)20);
        } else
        {
            abyte2 = new byte[l];
            System.arraycopy(abyte0, i, abyte2, 0, l);
            return abyte2;
        }
    }

    public byte[] encodePlaintext(short word0, byte abyte0[], int i, int j)
    {
        boolean flag = false;
        int l = b.getBlockSize();
        int k = l - (d.getSize() + j + 1) % l;
        int i1 = (255 - k) / l;
        int j1 = chooseExtraPadBlocks(a.getSecureRandom(), i1) * l + k;
        i1 = d.getSize() + j + j1 + 1;
        byte abyte1[] = new byte[i1];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        abyte0 = d.calculateMac(word0, abyte0, i, j);
        System.arraycopy(abyte0, 0, abyte1, j, abyte0.length);
        int k1 = abyte0.length;
        i = 0;
        do
        {
            k = ((flag) ? 1 : 0);
            if (i > j1)
            {
                break;
            }
            abyte1[i + (j + k1)] = (byte)j1;
            i++;
        } while (true);
        for (; k < i1; k += l)
        {
            b.processBlock(abyte1, k, abyte1, k);
        }

        return abyte1;
    }

    protected void initCipher(boolean flag, BlockCipher blockcipher, byte abyte0[], int i, int j, int k)
    {
        blockcipher.init(flag, new ParametersWithIV(new KeyParameter(abyte0, j, i), abyte0, k, blockcipher.getBlockSize()));
    }

    protected int lowestBitSet(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        int k = 32;
_L4:
        return k;
_L2:
        k = 0;
        int j = i;
        i = k;
        do
        {
            k = i;
            if ((j & 1) != 0)
            {
                continue;
            }
            i++;
            j >>= 1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}

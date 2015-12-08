// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.tls:
//            TlsCipher, TlsUtils, TlsMac, TlsFatalAlert, 
//            TlsClientContext, ProtocolVersion

public class TlsBlockCipher
    implements TlsCipher
{

    protected TlsClientContext context;
    protected BlockCipher decryptCipher;
    protected BlockCipher encryptCipher;
    protected TlsMac readMac;
    protected TlsMac writeMac;

    public TlsBlockCipher(TlsClientContext tlsclientcontext, BlockCipher blockcipher, BlockCipher blockcipher1, Digest digest, Digest digest1, int i)
    {
        context = tlsclientcontext;
        encryptCipher = blockcipher;
        decryptCipher = blockcipher1;
        byte abyte0[] = TlsUtils.calculateKeyBlock(tlsclientcontext, i * 2 + digest.getDigestSize() + digest1.getDigestSize() + blockcipher.getBlockSize() + blockcipher1.getBlockSize());
        writeMac = new TlsMac(tlsclientcontext, digest, abyte0, 0, digest.getDigestSize());
        int j = 0 + digest.getDigestSize();
        readMac = new TlsMac(tlsclientcontext, digest1, abyte0, j, digest1.getDigestSize());
        j += digest1.getDigestSize();
        initCipher(true, blockcipher, abyte0, i, j, j + i * 2);
        j += i;
        initCipher(false, blockcipher1, abyte0, i, j, j + i + blockcipher.getBlockSize());
    }

    protected int chooseExtraPadBlocks(SecureRandom securerandom, int i)
    {
        return Math.min(lowestBitSet(securerandom.nextInt()), i);
    }

    public byte[] decodeCiphertext(short word0, byte abyte0[], int i, int j)
        throws IOException
    {
        int l;
        int i1;
        int j1;
        int i2;
        byte byte0;
        boolean flag = true;
        int l1 = readMac.getSize() + 1;
        int j2 = decryptCipher.getBlockSize();
        if (j < l1)
        {
            throw new TlsFatalAlert((short)50);
        }
        if (j % j2 != 0)
        {
            throw new TlsFatalAlert((short)21);
        }
        for (int k = 0; k < j; k += j2)
        {
            decryptCipher.processBlock(abyte0, k + i, abyte0, k + i);
        }

        i2 = (i + j) - 1;
        byte0 = abyte0[i2];
        j1 = byte0 & 0xff;
        byte abyte1[];
        byte abyte3[];
        int k1;
        if (context.getServerVersion().getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k1 = j - l1;
        i1 = k1;
        if (l == 0)
        {
            i1 = Math.min(k1, j2);
        }
        if (j1 <= i1) goto _L2; else goto _L1
_L1:
        i1 = 0;
        l = 1;
_L4:
        i1 = j - l1 - i1;
        abyte1 = readMac.calculateMac(word0, abyte0, i, i1);
        abyte3 = new byte[abyte1.length];
        System.arraycopy(abyte0, i + i1, abyte3, 0, abyte1.length);
        if (!Arrays.constantTimeAreEqual(abyte1, abyte3))
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = l;
        }
        if (j != 0)
        {
            throw new TlsFatalAlert((short)20);
        } else
        {
            byte abyte2[] = new byte[i1];
            System.arraycopy(abyte0, i, abyte2, 0, i1);
            return abyte2;
        }
_L2:
        if (l != 0)
        {
            l = i2 - j1;
            i1 = 0;
            for (; l < i2; l++)
            {
                i1 = (byte)(i1 | abyte0[l] ^ byte0);
            }

            if (i1 != 0)
            {
                i1 = 0;
                l = 1;
                continue; /* Loop/switch isn't completed */
            }
        }
        l = 0;
        i1 = j1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public byte[] encodePlaintext(short word0, byte abyte0[], int i, int j)
    {
        int j1 = encryptCipher.getBlockSize();
        int i1 = j1 - (writeMac.getSize() + j + 1) % j1;
        byte abyte1[];
        int k;
        int l;
        if (context.getServerVersion().getFullVersion() >= ProtocolVersion.TLSv10.getFullVersion())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k = i1;
        if (l != 0)
        {
            k = (255 - i1) / j1;
            k = i1 + chooseExtraPadBlocks(context.getSecureRandom(), k) * j1;
        }
        l = writeMac.getSize() + j + k + 1;
        abyte1 = new byte[l];
        System.arraycopy(abyte0, i, abyte1, 0, j);
        abyte0 = writeMac.calculateMac(word0, abyte0, i, j);
        System.arraycopy(abyte0, 0, abyte1, j, abyte0.length);
        i1 = abyte0.length;
        for (i = 0; i <= k; i++)
        {
            abyte1[i + (j + i1)] = (byte)k;
        }

        for (i = 0; i < l; i += j1)
        {
            encryptCipher.processBlock(abyte1, i, abyte1, i);
        }

        return abyte1;
    }

    public TlsMac getReadMac()
    {
        return readMac;
    }

    public TlsMac getWriteMac()
    {
        return writeMac;
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

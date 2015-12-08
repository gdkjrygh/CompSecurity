// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.encodings;

import java.security.AccessController;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

// Referenced classes of package org.bouncycastle.crypto.encodings:
//            a

public class PKCS1Encoding
    implements AsymmetricBlockCipher
{

    private SecureRandom a;
    private AsymmetricBlockCipher b;
    private boolean c;
    private boolean d;
    private boolean e;

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricblockcipher)
    {
        b = asymmetricblockcipher;
        e = useStrict();
    }

    private byte[] decodeBlock(byte abyte0[], int i, int j)
    {
        abyte0 = b.processBlock(abyte0, i, j);
        if (abyte0.length < getOutputBlockSize())
        {
            throw new InvalidCipherTextException("block truncated");
        }
        j = abyte0[0];
        if (j != 1 && j != 2)
        {
            throw new InvalidCipherTextException("unknown block type");
        }
        if (e && abyte0.length != b.getOutputBlockSize())
        {
            throw new InvalidCipherTextException("block incorrect size");
        }
        i = 1;
        do
        {
            if (i == abyte0.length)
            {
                break;
            }
            byte byte0 = abyte0[i];
            if (byte0 == 0)
            {
                break;
            }
            if (j == 1 && byte0 != -1)
            {
                throw new InvalidCipherTextException("block padding incorrect");
            }
            i++;
        } while (true);
        i++;
        if (i > abyte0.length || i < 10)
        {
            throw new InvalidCipherTextException("no data in block");
        } else
        {
            byte abyte1[] = new byte[abyte0.length - i];
            System.arraycopy(abyte0, i, abyte1, 0, abyte1.length);
            return abyte1;
        }
    }

    private byte[] encodeBlock(byte abyte0[], int i, int j)
    {
        boolean flag = true;
        int k = 1;
        if (j > getInputBlockSize())
        {
            throw new IllegalArgumentException("input data too large");
        }
        byte abyte1[] = new byte[b.getInputBlockSize()];
        if (d)
        {
            abyte1[0] = 1;
            for (; k != abyte1.length - j - 1; k++)
            {
                abyte1[k] = -1;
            }

        } else
        {
            a.nextBytes(abyte1);
            abyte1[0] = 2;
            for (int l = ((flag) ? 1 : 0); l != abyte1.length - j - 1; l++)
            {
                for (; abyte1[l] == 0; abyte1[l] = (byte)a.nextInt()) { }
            }

        }
        abyte1[abyte1.length - j - 1] = 0;
        System.arraycopy(abyte0, i, abyte1, abyte1.length - j, j);
        return b.processBlock(abyte1, 0, abyte1.length);
    }

    private boolean useStrict()
    {
        String s = (String)AccessController.doPrivileged(new a(this));
        return s == null || s.equals("true");
    }

    public int getInputBlockSize()
    {
        int j = b.getInputBlockSize();
        int i = j;
        if (c)
        {
            i = j - 10;
        }
        return i;
    }

    public int getOutputBlockSize()
    {
        int i = b.getOutputBlockSize();
        if (c)
        {
            return i;
        } else
        {
            return i - 10;
        }
    }

    public AsymmetricBlockCipher getUnderlyingCipher()
    {
        return b;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        Object obj;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            obj = (ParametersWithRandom)cipherparameters;
            a = ((ParametersWithRandom) (obj)).getRandom();
            obj = (AsymmetricKeyParameter)((ParametersWithRandom) (obj)).getParameters();
        } else
        {
            a = new SecureRandom();
            obj = (AsymmetricKeyParameter)cipherparameters;
        }
        b.init(flag, cipherparameters);
        d = ((AsymmetricKeyParameter) (obj)).isPrivate();
        c = flag;
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        if (c)
        {
            return encodeBlock(abyte0, i, j);
        } else
        {
            return decodeBlock(abyte0, i, j);
        }
    }
}

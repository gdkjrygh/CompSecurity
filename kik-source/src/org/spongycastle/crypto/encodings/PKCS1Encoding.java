// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.encodings;

import java.security.AccessController;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.ParametersWithRandom;

// Referenced classes of package org.spongycastle.crypto.encodings:
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
        asymmetricblockcipher = (String)AccessController.doPrivileged(new a(this));
        boolean flag;
        if (asymmetricblockcipher == null || asymmetricblockcipher.equals("true"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }

    private byte[] b(byte abyte0[], int i, int j)
    {
        abyte0 = b.a(abyte0, i, j);
        if (abyte0.length < b())
        {
            throw new InvalidCipherTextException("block truncated");
        }
        j = abyte0[0];
        if (j != 1 && j != 2)
        {
            throw new InvalidCipherTextException("unknown block type");
        }
        if (e && abyte0.length != b.b())
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

    public final int a()
    {
        int j = b.a();
        int i = j;
        if (c)
        {
            i = j - 10;
        }
        return i;
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        Object obj;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            obj = (ParametersWithRandom)cipherparameters;
            a = ((ParametersWithRandom) (obj)).a();
            obj = (AsymmetricKeyParameter)((ParametersWithRandom) (obj)).b();
        } else
        {
            a = new SecureRandom();
            obj = (AsymmetricKeyParameter)cipherparameters;
        }
        b.a(flag, cipherparameters);
        d = ((AsymmetricKeyParameter) (obj)).a();
        c = flag;
    }

    public final byte[] a(byte abyte0[], int i, int j)
    {
        boolean flag = true;
        int k = 1;
        if (c)
        {
            if (j > a())
            {
                throw new IllegalArgumentException("input data too large");
            }
            byte abyte1[] = new byte[b.a()];
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
            return b.a(abyte1, 0, abyte1.length);
        } else
        {
            return b(abyte0, i, j);
        }
    }

    public final int b()
    {
        int i = b.b();
        if (c)
        {
            return i;
        } else
        {
            return i - 10;
        }
    }
}

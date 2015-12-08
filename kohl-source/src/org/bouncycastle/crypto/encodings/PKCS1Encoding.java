// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.encodings;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class PKCS1Encoding
    implements AsymmetricBlockCipher
{

    private static final int HEADER_LENGTH = 10;
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private SecureRandom random;
    private boolean useStrictLength;

    public PKCS1Encoding(AsymmetricBlockCipher asymmetricblockcipher)
    {
        engine = asymmetricblockcipher;
        useStrictLength = useStrict();
    }

    private byte[] decodeBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        abyte0 = engine.processBlock(abyte0, i, j);
        if (abyte0.length < getOutputBlockSize())
        {
            throw new InvalidCipherTextException("block truncated");
        }
        j = abyte0[0];
        if (j != 1 && j != 2)
        {
            throw new InvalidCipherTextException("unknown block type");
        }
        if (useStrictLength && abyte0.length != engine.getOutputBlockSize())
        {
            throw new InvalidCipherTextException("block incorrect size");
        }
        i = 1;
        do
        {
label0:
            {
                byte byte0;
                if (i != abyte0.length)
                {
                    byte0 = abyte0[i];
                    if (byte0 != 0)
                    {
                        break label0;
                    }
                }
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
            if (j == 1 && byte0 != -1)
            {
                throw new InvalidCipherTextException("block padding incorrect");
            }
            i++;
        } while (true);
    }

    private byte[] encodeBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        boolean flag = true;
        int k = 1;
        if (j > getInputBlockSize())
        {
            throw new IllegalArgumentException("input data too large");
        }
        byte abyte1[] = new byte[engine.getInputBlockSize()];
        if (forPrivateKey)
        {
            abyte1[0] = 1;
            for (; k != abyte1.length - j - 1; k++)
            {
                abyte1[k] = -1;
            }

        } else
        {
            random.nextBytes(abyte1);
            abyte1[0] = 2;
            for (int l = ((flag) ? 1 : 0); l != abyte1.length - j - 1; l++)
            {
                for (; abyte1[l] == 0; abyte1[l] = (byte)random.nextInt()) { }
            }

        }
        abyte1[abyte1.length - j - 1] = 0;
        System.arraycopy(abyte0, i, abyte1, abyte1.length - j, j);
        return engine.processBlock(abyte1, 0, abyte1.length);
    }

    private boolean useStrict()
    {
        String s = (String)AccessController.doPrivileged(new PrivilegedAction() {

            final PKCS1Encoding this$0;

            public Object run()
            {
                return System.getProperty("org.bouncycastle.pkcs1.strict");
            }

            
            {
                this$0 = PKCS1Encoding.this;
                super();
            }
        });
        return s == null || s.equals("true");
    }

    public int getInputBlockSize()
    {
        int j = engine.getInputBlockSize();
        int i = j;
        if (forEncryption)
        {
            i = j - 10;
        }
        return i;
    }

    public int getOutputBlockSize()
    {
        int i = engine.getOutputBlockSize();
        if (forEncryption)
        {
            return i;
        } else
        {
            return i - 10;
        }
    }

    public AsymmetricBlockCipher getUnderlyingCipher()
    {
        return engine;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        Object obj;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            obj = (ParametersWithRandom)cipherparameters;
            random = ((ParametersWithRandom) (obj)).getRandom();
            obj = (AsymmetricKeyParameter)((ParametersWithRandom) (obj)).getParameters();
        } else
        {
            random = new SecureRandom();
            obj = (AsymmetricKeyParameter)cipherparameters;
        }
        engine.init(flag, cipherparameters);
        forPrivateKey = ((AsymmetricKeyParameter) (obj)).isPrivate();
        forEncryption = flag;
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        if (forEncryption)
        {
            return encodeBlock(abyte0, i, j);
        } else
        {
            return decodeBlock(abyte0, i, j);
        }
    }
}

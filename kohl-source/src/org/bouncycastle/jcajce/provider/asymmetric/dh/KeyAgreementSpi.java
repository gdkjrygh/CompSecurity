// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.dh:
//            BCDHPublicKey

public class KeyAgreementSpi extends javax.crypto.KeyAgreementSpi
{

    private static final Hashtable algorithms;
    private BigInteger g;
    private BigInteger p;
    private BigInteger result;
    private BigInteger x;

    public KeyAgreementSpi()
    {
    }

    private byte[] bigIntToBytes(BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (biginteger[0] == 0)
        {
            byte abyte0[] = new byte[biginteger.length - 1];
            System.arraycopy(biginteger, 1, abyte0, 0, abyte0.length);
            return abyte0;
        } else
        {
            return biginteger;
        }
    }

    protected Key engineDoPhase(Key key, boolean flag)
        throws InvalidKeyException, IllegalStateException
    {
        if (x == null)
        {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        if (!(key instanceof DHPublicKey))
        {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        DHPublicKey dhpublickey = (DHPublicKey)key;
        if (!dhpublickey.getParams().getG().equals(g) || !dhpublickey.getParams().getP().equals(p))
        {
            throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
        }
        if (flag)
        {
            result = ((DHPublicKey)key).getY().modPow(x, p);
            return null;
        } else
        {
            result = ((DHPublicKey)key).getY().modPow(x, p);
            return new BCDHPublicKey(result, dhpublickey.getParams());
        }
    }

    protected int engineGenerateSecret(byte abyte0[], int i)
        throws IllegalStateException, ShortBufferException
    {
        if (x == null)
        {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        byte abyte1[] = bigIntToBytes(result);
        if (abyte0.length - i < abyte1.length)
        {
            throw new ShortBufferException("DHKeyAgreement - buffer too short");
        } else
        {
            System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
            return abyte1.length;
        }
    }

    protected SecretKey engineGenerateSecret(String s)
    {
        if (x == null)
        {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        String s1 = Strings.toUpperCase(s);
        byte abyte0[] = bigIntToBytes(result);
        if (algorithms.containsKey(s1))
        {
            byte abyte1[] = new byte[((Integer)algorithms.get(s1)).intValue() / 8];
            System.arraycopy(abyte0, 0, abyte1, 0, abyte1.length);
            if (s1.startsWith("DES"))
            {
                DESParameters.setOddParity(abyte1);
            }
            return new SecretKeySpec(abyte1, s);
        } else
        {
            return new SecretKeySpec(abyte0, s);
        }
    }

    protected byte[] engineGenerateSecret()
        throws IllegalStateException
    {
        if (x == null)
        {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        } else
        {
            return bigIntToBytes(result);
        }
    }

    protected void engineInit(Key key, SecureRandom securerandom)
        throws InvalidKeyException
    {
        if (!(key instanceof DHPrivateKey))
        {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
        } else
        {
            key = (DHPrivateKey)key;
            p = key.getParams().getP();
            g = key.getParams().getG();
            key = key.getX();
            result = key;
            x = key;
            return;
        }
    }

    protected void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidKeyException, InvalidAlgorithmParameterException
    {
        if (!(key instanceof DHPrivateKey))
        {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey for initialisation");
        }
        key = (DHPrivateKey)key;
        if (algorithmparameterspec != null)
        {
            if (!(algorithmparameterspec instanceof DHParameterSpec))
            {
                throw new InvalidAlgorithmParameterException("DHKeyAgreement only accepts DHParameterSpec");
            }
            algorithmparameterspec = (DHParameterSpec)algorithmparameterspec;
            p = algorithmparameterspec.getP();
            g = algorithmparameterspec.getG();
        } else
        {
            p = key.getParams().getP();
            g = key.getParams().getG();
        }
        key = key.getX();
        result = key;
        x = key;
    }

    static 
    {
        algorithms = new Hashtable();
        Integer integer = new Integer(64);
        Integer integer1 = new Integer(192);
        Integer integer2 = new Integer(128);
        Integer integer3 = new Integer(256);
        algorithms.put("DES", integer);
        algorithms.put("DESEDE", integer1);
        algorithms.put("BLOWFISH", integer2);
        algorithms.put("AES", integer3);
    }
}

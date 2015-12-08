// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.util.Strings;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEDHPublicKey

public class JCEDHKeyAgreement extends KeyAgreementSpi
{

    private static final Hashtable e;
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;

    public JCEDHKeyAgreement()
    {
    }

    private static byte[] a(BigInteger biginteger)
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
    {
        if (a == null)
        {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        if (!(key instanceof DHPublicKey))
        {
            throw new InvalidKeyException("DHKeyAgreement doPhase requires DHPublicKey");
        }
        DHPublicKey dhpublickey = (DHPublicKey)key;
        if (!dhpublickey.getParams().getG().equals(c) || !dhpublickey.getParams().getP().equals(b))
        {
            throw new InvalidKeyException("DHPublicKey not for this KeyAgreement!");
        }
        if (flag)
        {
            d = ((DHPublicKey)key).getY().modPow(a, b);
            return null;
        } else
        {
            d = ((DHPublicKey)key).getY().modPow(a, b);
            return new JCEDHPublicKey(d, dhpublickey.getParams());
        }
    }

    protected int engineGenerateSecret(byte abyte0[], int i)
    {
        if (a == null)
        {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        byte abyte1[] = a(d);
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
        if (a == null)
        {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        }
        String s1 = Strings.b(s);
        byte abyte0[] = a(d);
        if (e.containsKey(s1))
        {
            byte abyte1[] = new byte[((Integer)e.get(s1)).intValue() / 8];
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
    {
        if (a == null)
        {
            throw new IllegalStateException("Diffie-Hellman not initialised.");
        } else
        {
            return a(d);
        }
    }

    protected void engineInit(Key key, SecureRandom securerandom)
    {
        if (!(key instanceof DHPrivateKey))
        {
            throw new InvalidKeyException("DHKeyAgreement requires DHPrivateKey");
        } else
        {
            key = (DHPrivateKey)key;
            b = key.getParams().getP();
            c = key.getParams().getG();
            key = key.getX();
            d = key;
            a = key;
            return;
        }
    }

    protected void engineInit(Key key, AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
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
            b = algorithmparameterspec.getP();
            c = algorithmparameterspec.getG();
        } else
        {
            b = key.getParams().getP();
            c = key.getParams().getG();
        }
        key = key.getX();
        d = key;
        a = key;
    }

    static 
    {
        e = new Hashtable();
        Integer integer = new Integer(64);
        Integer integer1 = new Integer(192);
        Integer integer2 = new Integer(128);
        Integer integer3 = new Integer(256);
        e.put("DES", integer);
        e.put("DESEDE", integer1);
        e.put("BLOWFISH", integer2);
        e.put("AES", integer3);
    }
}

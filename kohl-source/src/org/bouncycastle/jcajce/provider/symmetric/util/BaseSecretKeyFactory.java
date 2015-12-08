// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            PBE, BCPBEKey

public class BaseSecretKeyFactory extends SecretKeyFactorySpi
    implements PBE
{
    public static class DES extends BaseSecretKeyFactory
    {

        protected SecretKey engineGenerateSecret(KeySpec keyspec)
            throws InvalidKeySpecException
        {
            if (keyspec instanceof DESKeySpec)
            {
                return new SecretKeySpec(((DESKeySpec)keyspec).getKey(), "DES");
            } else
            {
                return engineGenerateSecret(keyspec);
            }
        }

        public DES()
        {
            super("DES", null);
        }
    }

    public static class DESPBEKeyFactory extends BaseSecretKeyFactory
    {

        private int digest;
        private boolean forCipher;
        private int ivSize;
        private int keySize;
        private int scheme;

        protected SecretKey engineGenerateSecret(KeySpec keyspec)
            throws InvalidKeySpecException
        {
            if (keyspec instanceof PBEKeySpec)
            {
                PBEKeySpec pbekeyspec = (PBEKeySpec)keyspec;
                if (pbekeyspec.getSalt() == null)
                {
                    return new BCPBEKey(algName, algOid, scheme, digest, keySize, ivSize, pbekeyspec, null);
                }
                KeyParameter keyparameter;
                if (forCipher)
                {
                    keyspec = PBE.Util.makePBEParameters(pbekeyspec, scheme, digest, keySize, ivSize);
                } else
                {
                    keyspec = PBE.Util.makePBEMacParameters(pbekeyspec, scheme, digest, keySize);
                }
                if (keyspec instanceof ParametersWithIV)
                {
                    keyparameter = (KeyParameter)((ParametersWithIV)keyspec).getParameters();
                } else
                {
                    keyparameter = (KeyParameter)keyspec;
                }
                DESParameters.setOddParity(keyparameter.getKey());
                return new BCPBEKey(algName, algOid, scheme, digest, keySize, ivSize, pbekeyspec, keyspec);
            } else
            {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }

        public DESPBEKeyFactory(String s, DERObjectIdentifier derobjectidentifier, boolean flag, int i, int j, int k, int l)
        {
            super(s, derobjectidentifier);
            forCipher = flag;
            scheme = i;
            digest = j;
            keySize = k;
            ivSize = l;
        }
    }


    protected String algName;
    protected DERObjectIdentifier algOid;

    protected BaseSecretKeyFactory(String s, DERObjectIdentifier derobjectidentifier)
    {
        algName = s;
        algOid = derobjectidentifier;
    }

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
        throws InvalidKeySpecException
    {
        if (keyspec instanceof SecretKeySpec)
        {
            return (SecretKey)keyspec;
        } else
        {
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    protected KeySpec engineGetKeySpec(SecretKey secretkey, Class class1)
        throws InvalidKeySpecException
    {
        if (class1 == null)
        {
            throw new InvalidKeySpecException("keySpec parameter is null");
        }
        if (secretkey == null)
        {
            throw new InvalidKeySpecException("key parameter is null");
        }
        if (javax/crypto/spec/SecretKeySpec.isAssignableFrom(class1))
        {
            return new SecretKeySpec(secretkey.getEncoded(), algName);
        }
        try
        {
            secretkey = (KeySpec)class1.getConstructor(new Class[] {
                [B
            }).newInstance(new Object[] {
                secretkey.getEncoded()
            });
        }
        // Misplaced declaration of an exception variable
        catch (SecretKey secretkey)
        {
            throw new InvalidKeySpecException(secretkey.toString());
        }
        return secretkey;
    }

    protected SecretKey engineTranslateKey(SecretKey secretkey)
        throws InvalidKeyException
    {
        if (secretkey == null)
        {
            throw new InvalidKeyException("key parameter is null");
        }
        if (!secretkey.getAlgorithm().equalsIgnoreCase(algName))
        {
            throw new InvalidKeyException((new StringBuilder()).append("Key not of type ").append(algName).append(".").toString());
        } else
        {
            return new SecretKeySpec(secretkey.getEncoded(), algName);
        }
    }
}

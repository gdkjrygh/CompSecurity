// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.security.InvalidKeyException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactorySpi;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.crypto.params.DESParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric.util:
//            PBE, BCPBEKey

public class BaseSecretKeyFactory extends SecretKeyFactorySpi
    implements PBE
{
    public static class DES extends BaseSecretKeyFactory
    {

        protected SecretKey engineGenerateSecret(KeySpec keyspec)
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
            super("DES");
        }
    }

    public static class DESPBEKeyFactory extends BaseSecretKeyFactory
    {

        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;

        protected SecretKey engineGenerateSecret(KeySpec keyspec)
        {
            if (keyspec instanceof PBEKeySpec)
            {
                PBEKeySpec pbekeyspec = (PBEKeySpec)keyspec;
                if (pbekeyspec.getSalt() == null)
                {
                    return new BCPBEKey(a, b, d, e, f, g, pbekeyspec, null);
                }
                KeyParameter keyparameter;
                if (c)
                {
                    keyspec = PBE.Util.a(pbekeyspec, d, e, f, g);
                } else
                {
                    keyspec = PBE.Util.a(pbekeyspec, d, e, f);
                }
                if (keyspec instanceof ParametersWithIV)
                {
                    keyparameter = (KeyParameter)((ParametersWithIV)keyspec).b();
                } else
                {
                    keyparameter = (KeyParameter)keyspec;
                }
                DESParameters.a(keyparameter.a());
                return new BCPBEKey(a, b, d, e, f, g, pbekeyspec, keyspec);
            } else
            {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }
    }


    protected String a;
    protected DERObjectIdentifier b;

    protected BaseSecretKeyFactory(String s)
    {
        a = s;
        b = null;
    }

    protected SecretKey engineGenerateSecret(KeySpec keyspec)
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
            return new SecretKeySpec(secretkey.getEncoded(), a);
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
    {
        if (secretkey == null)
        {
            throw new InvalidKeyException("key parameter is null");
        }
        if (!secretkey.getAlgorithm().equalsIgnoreCase(a))
        {
            throw new InvalidKeyException((new StringBuilder("Key not of type ")).append(a).append(".").toString());
        } else
        {
            return new SecretKeySpec(secretkey.getEncoded(), a);
        }
    }
}

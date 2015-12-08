// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

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
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

// Referenced classes of package org.bouncycastle.jce.provider:
//            PBE, JCEPBEKey

public class JCESecretKeyFactory extends SecretKeyFactorySpi
    implements PBE
{
    public static class DES extends JCESecretKeyFactory
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
            super("DES", null);
        }
    }

    public static class DESPBEKeyFactory extends JCESecretKeyFactory
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
                    return new JCEPBEKey(a, b, d, e, f, g, pbekeyspec, null);
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
                    keyparameter = (KeyParameter)((ParametersWithIV)keyspec).getParameters();
                } else
                {
                    keyparameter = (KeyParameter)keyspec;
                }
                DESParameters.setOddParity(keyparameter.getKey());
                return new JCEPBEKey(a, b, d, e, f, g, pbekeyspec, keyspec);
            } else
            {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }

        public DESPBEKeyFactory(String s, DERObjectIdentifier derobjectidentifier, int i, int j, int k)
        {
            super(s, derobjectidentifier);
            c = true;
            d = i;
            e = j;
            f = k;
            g = 64;
        }
    }

    public static class PBEKeyFactory extends JCESecretKeyFactory
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
                    return new JCEPBEKey(a, b, d, e, f, g, pbekeyspec, null);
                }
                if (c)
                {
                    keyspec = PBE.Util.a(pbekeyspec, d, e, f, g);
                } else
                {
                    keyspec = PBE.Util.a(pbekeyspec, d, e, f);
                }
                return new JCEPBEKey(a, b, d, e, f, g, pbekeyspec, keyspec);
            } else
            {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }

        public PBEKeyFactory(String s, DERObjectIdentifier derobjectidentifier, boolean flag, int i, int j, int k, int l)
        {
            super(s, derobjectidentifier);
            c = flag;
            d = i;
            e = j;
            f = k;
            g = l;
        }
    }

    public static class PBEWithMD2AndDES extends DESPBEKeyFactory
    {

        public PBEWithMD2AndDES()
        {
            super("PBEwithMD2andDES", PKCSObjectIdentifiers.s_, 0, 5, 64);
        }
    }

    public static class PBEWithMD2AndRC2 extends PBEKeyFactory
    {

        public PBEWithMD2AndRC2()
        {
            super("PBEwithMD2andRC2", PKCSObjectIdentifiers.t, true, 0, 5, 64, 64);
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBEKeyFactory
    {

        public PBEWithMD5And128BitAESCBCOpenSSL()
        {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBEKeyFactory
    {

        public PBEWithMD5And192BitAESCBCOpenSSL()
        {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBEKeyFactory
    {

        public PBEWithMD5And256BitAESCBCOpenSSL()
        {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    public static class PBEWithMD5AndDES extends DESPBEKeyFactory
    {

        public PBEWithMD5AndDES()
        {
            super("PBEwithMD5andDES", PKCSObjectIdentifiers.u, 0, 0, 64);
        }
    }

    public static class PBEWithMD5AndRC2 extends PBEKeyFactory
    {

        public PBEWithMD5AndRC2()
        {
            super("PBEwithMD5andRC2", PKCSObjectIdentifiers.v, true, 0, 0, 64, 64);
        }
    }

    public static class PBEWithRIPEMD160 extends PBEKeyFactory
    {

        public PBEWithRIPEMD160()
        {
            super("PBEwithHmacRIPEMD160", null, false, 2, 2, 160, 0);
        }
    }

    public static class PBEWithSHA extends PBEKeyFactory
    {

        public PBEWithSHA()
        {
            super("PBEwithHmacSHA", null, false, 2, 1, 160, 0);
        }
    }

    public static class PBEWithSHA1AndDES extends DESPBEKeyFactory
    {

        public PBEWithSHA1AndDES()
        {
            super("PBEwithSHA1andDES", PKCSObjectIdentifiers.w, 0, 1, 64);
        }
    }

    public static class PBEWithSHA1AndRC2 extends PBEKeyFactory
    {

        public PBEWithSHA1AndRC2()
        {
            super("PBEwithSHA1andRC2", PKCSObjectIdentifiers.x, true, 0, 1, 64, 64);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends PBEKeyFactory
    {

        public PBEWithSHA256And128BitAESBC()
        {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends PBEKeyFactory
    {

        public PBEWithSHA256And192BitAESBC()
        {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends PBEKeyFactory
    {

        public PBEWithSHA256And256BitAESBC()
        {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBEKeyFactory
    {

        public PBEWithSHAAnd128BitAESBC()
        {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd128BitRC2 extends PBEKeyFactory
    {

        public PBEWithSHAAnd128BitRC2()
        {
            super("PBEwithSHAand128BitRC2-CBC", PKCSObjectIdentifiers.bu, true, 2, 1, 128, 64);
        }
    }

    public static class PBEWithSHAAnd128BitRC4 extends PBEKeyFactory
    {

        public PBEWithSHAAnd128BitRC4()
        {
            super("PBEWithSHAAnd128BitRC4", PKCSObjectIdentifiers.bq, true, 2, 1, 128, 0);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBEKeyFactory
    {

        public PBEWithSHAAnd192BitAESBC()
        {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBEKeyFactory
    {

        public PBEWithSHAAnd256BitAESBC()
        {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    public static class PBEWithSHAAnd40BitRC2 extends PBEKeyFactory
    {

        public PBEWithSHAAnd40BitRC2()
        {
            super("PBEwithSHAand40BitRC2-CBC", PKCSObjectIdentifiers.bv, true, 2, 1, 40, 64);
        }
    }

    public static class PBEWithSHAAnd40BitRC4 extends PBEKeyFactory
    {

        public PBEWithSHAAnd40BitRC4()
        {
            super("PBEWithSHAAnd128BitRC4", PKCSObjectIdentifiers.bq, true, 2, 1, 40, 0);
        }
    }

    public static class PBEWithSHAAndDES2Key extends DESPBEKeyFactory
    {

        public PBEWithSHAAndDES2Key()
        {
            super("PBEwithSHAandDES2Key-CBC", PKCSObjectIdentifiers.bt, 2, 1, 128);
        }
    }

    public static class PBEWithSHAAndDES3Key extends DESPBEKeyFactory
    {

        public PBEWithSHAAndDES3Key()
        {
            super("PBEwithSHAandDES3Key-CBC", PKCSObjectIdentifiers.bs, 2, 1, 192);
        }
    }

    public static class PBEWithSHAAndTwofish extends PBEKeyFactory
    {

        public PBEWithSHAAndTwofish()
        {
            super("PBEwithSHAandTwofish-CBC", null, true, 2, 1, 256, 128);
        }
    }

    public static class PBEWithTiger extends PBEKeyFactory
    {

        public PBEWithTiger()
        {
            super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
        }
    }


    protected String a;
    protected DERObjectIdentifier b;

    protected JCESecretKeyFactory(String s, DERObjectIdentifier derobjectidentifier)
    {
        a = s;
        b = derobjectidentifier;
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

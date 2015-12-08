// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.engines.RFC3211WrapEngine;
import org.spongycastle.crypto.generators.DESKeyGenerator;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;
import org.spongycastle.crypto.macs.CFBBlockCipherMac;
import org.spongycastle.crypto.macs.CMac;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.ISO7816d4Padding;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public final class DES
{
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator
    {

        protected AlgorithmParameters engineGenerateParameters()
        {
            byte abyte0[] = new byte[8];
            if (b == null)
            {
                b = new SecureRandom();
            }
            b.nextBytes(abyte0);
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("DES", BouncyCastleProvider.a);
                algorithmparameters.init(new IvParameterSpec(abyte0));
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.getMessage());
            }
            return algorithmparameters;
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }

        public AlgParamGen()
        {
        }
    }

    public static class CBC extends BaseBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new DESEngine()), 64);
        }
    }

    public static class CBCMAC extends BaseMac
    {

        public CBCMAC()
        {
            super(new CBCBlockCipherMac(new DESEngine()));
        }
    }

    public static class CMAC extends BaseMac
    {

        public CMAC()
        {
            super(new CMac(new DESEngine()));
        }
    }

    public static class DES64 extends BaseMac
    {

        public DES64()
        {
            super(new CBCBlockCipherMac(new DESEngine(), 64));
        }
    }

    public static class DES64with7816d4 extends BaseMac
    {

        public DES64with7816d4()
        {
            super(new CBCBlockCipherMac(new DESEngine(), 64, new ISO7816d4Padding()));
        }
    }

    public static class DESCFB8 extends BaseMac
    {

        public DESCFB8()
        {
            super(new CFBBlockCipherMac(new DESEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new DESEngine());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory
    {

        protected SecretKey engineGenerateSecret(KeySpec keyspec)
        {
            if (keyspec instanceof DESKeySpec)
            {
                return new SecretKeySpec(((DESKeySpec)keyspec).getKey(), "DES");
            } else
            {
                return super.engineGenerateSecret(keyspec);
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
            if (javax/crypto/spec/DESKeySpec.isAssignableFrom(class1))
            {
                secretkey = secretkey.getEncoded();
                try
                {
                    secretkey = new DESKeySpec(secretkey);
                }
                // Misplaced declaration of an exception variable
                catch (SecretKey secretkey)
                {
                    throw new InvalidKeySpecException(secretkey.toString());
                }
                return secretkey;
            } else
            {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }

        public KeyFactory()
        {
            super("DES");
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        protected SecretKey engineGenerateKey()
        {
            if (e)
            {
                d.a(new KeyGenerationParameters(new SecureRandom(), c));
                e = false;
            }
            return new SecretKeySpec(d.a(), a);
        }

        protected void engineInit(int i, SecureRandom securerandom)
        {
            super.engineInit(i, securerandom);
        }

        public KeyGenerator()
        {
            super("DES", 64, new DESKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String a = org/spongycastle/jcajce/provider/symmetric/DES.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("Cipher.DES", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(OIWObjectIdentifiers.e).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            ASN1ObjectIdentifier asn1objectidentifier = OIWObjectIdentifiers.e;
            configurableprovider.a((new StringBuilder("Alg.Alias.KeyGenerator.")).append(asn1objectidentifier.c()).toString(), "DES");
            configurableprovider.a((new StringBuilder("Alg.Alias.KeyFactory.")).append(asn1objectidentifier.c()).toString(), "DES");
            configurableprovider.a("Cipher.DESRFC3211WRAP", (new StringBuilder()).append(a).append("$RFC3211").toString());
            configurableprovider.a("KeyGenerator.DES", (new StringBuilder()).append(a).append("$KeyGenerator").toString());
            configurableprovider.a("SecretKeyFactory.DES", (new StringBuilder()).append(a).append("$KeyFactory").toString());
            configurableprovider.a("Mac.DESCMAC", (new StringBuilder()).append(a).append("$CMAC").toString());
            configurableprovider.a("Mac.DESMAC", (new StringBuilder()).append(a).append("$CBCMAC").toString());
            configurableprovider.a("Alg.Alias.Mac.DES", "DESMAC");
            configurableprovider.a("Mac.DESMAC/CFB8", (new StringBuilder()).append(a).append("$DESCFB8").toString());
            configurableprovider.a("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
            configurableprovider.a("Mac.DESMAC64", (new StringBuilder()).append(a).append("$DES64").toString());
            configurableprovider.a("Alg.Alias.Mac.DES64", "DESMAC64");
            configurableprovider.a("Mac.DESMAC64WITHISO7816-4PADDING", (new StringBuilder()).append(a).append("$DES64with7816d4").toString());
            configurableprovider.a("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableprovider.a("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableprovider.a("Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            configurableprovider.a("AlgorithmParameters.DES", "org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(OIWObjectIdentifiers.e).toString(), "DES");
            configurableprovider.a("AlgorithmParameterGenerator.DES", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(OIWObjectIdentifiers.e).toString(), "DES");
        }


        public Mappings()
        {
        }
    }

    public static class RFC3211 extends BaseWrapCipher
    {

        public RFC3211()
        {
            super(new RFC3211WrapEngine(new DESEngine()), 8);
        }
    }


    private DES()
    {
    }
}

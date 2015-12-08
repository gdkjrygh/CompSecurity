// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.DESedeWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public final class DESede
{
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator
    {

        protected AlgorithmParameters engineGenerateParameters()
        {
            byte abyte0[] = new byte[8];
            if (random == null)
            {
                random = new SecureRandom();
            }
            random.nextBytes(abyte0);
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("DES", BouncyCastleProvider.PROVIDER_NAME);
                algorithmparameters.init(new IvParameterSpec(abyte0));
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.getMessage());
            }
            return algorithmparameters;
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
            throws InvalidAlgorithmParameterException
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
            super(new CBCBlockCipher(new DESedeEngine()), 64);
        }
    }

    public static class CBCMAC extends BaseMac
    {

        public CBCMAC()
        {
            super(new CBCBlockCipherMac(new DESedeEngine()));
        }
    }

    public static class CMAC extends BaseMac
    {

        public CMAC()
        {
            super(new CMac(new DESedeEngine()));
        }
    }

    public static class DESede64 extends BaseMac
    {

        public DESede64()
        {
            super(new CBCBlockCipherMac(new DESedeEngine(), 64));
        }
    }

    public static class DESede64with7816d4 extends BaseMac
    {

        public DESede64with7816d4()
        {
            super(new CBCBlockCipherMac(new DESedeEngine(), 64, new ISO7816d4Padding()));
        }
    }

    public static class DESedeCFB8 extends BaseMac
    {

        public DESedeCFB8()
        {
            super(new CFBBlockCipherMac(new DESedeEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new DESedeEngine());
        }
    }

    public static class KeyFactory extends BaseSecretKeyFactory
    {

        protected SecretKey engineGenerateSecret(KeySpec keyspec)
            throws InvalidKeySpecException
        {
            if (keyspec instanceof DESedeKeySpec)
            {
                return new SecretKeySpec(((DESedeKeySpec)keyspec).getKey(), "DESede");
            } else
            {
                return super.engineGenerateSecret(keyspec);
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
            if (!javax/crypto/spec/DESedeKeySpec.isAssignableFrom(class1))
            {
                break MISSING_BLOCK_LABEL_137;
            }
            secretkey = secretkey.getEncoded();
            if (secretkey.length != 16)
            {
                break MISSING_BLOCK_LABEL_126;
            }
            class1 = new byte[24];
            System.arraycopy(secretkey, 0, class1, 0, 16);
            System.arraycopy(secretkey, 0, class1, 16, 8);
            secretkey = new DESedeKeySpec(class1);
            return secretkey;
            try
            {
                secretkey = new DESedeKeySpec(secretkey);
            }
            // Misplaced declaration of an exception variable
            catch (SecretKey secretkey)
            {
                throw new InvalidKeySpecException(secretkey.toString());
            }
            return secretkey;
            throw new InvalidKeySpecException("Invalid KeySpec");
        }

        public KeyFactory()
        {
            super("DESede", null);
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        private boolean keySizeSet;

        protected SecretKey engineGenerateKey()
        {
            if (uninitialised)
            {
                engine.init(new KeyGenerationParameters(new SecureRandom(), defaultKeySize));
                uninitialised = false;
            }
            if (!keySizeSet)
            {
                byte abyte0[] = engine.generateKey();
                System.arraycopy(abyte0, 0, abyte0, 16, 8);
                return new SecretKeySpec(abyte0, algName);
            } else
            {
                return new SecretKeySpec(engine.generateKey(), algName);
            }
        }

        protected void engineInit(int i, SecureRandom securerandom)
        {
            super.engineInit(i, securerandom);
            keySizeSet = true;
        }

        public KeyGenerator()
        {
            super("DESede", 192, new DESedeKeyGenerator());
            keySizeSet = false;
        }
    }

    public static class KeyGenerator3 extends BaseKeyGenerator
    {

        public KeyGenerator3()
        {
            super("DESede3", 192, new DESedeKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/DESede.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("Cipher.DESEDE", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(PKCSObjectIdentifiers.des_EDE3_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm("Cipher.DESEDEWRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(PKCSObjectIdentifiers.id_alg_CMS3DESwrap).toString(), (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
            configurableprovider.addAlgorithm("Cipher.DESEDERFC3211WRAP", (new StringBuilder()).append(PREFIX).append("$RFC3211").toString());
            if (configurableprovider.hasAlgorithm("MessageDigest", "SHA-1"))
            {
                configurableprovider.addAlgorithm("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$PBEWithSHAAndDES3Key").toString());
                configurableprovider.addAlgorithm("Cipher.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$BrokePBEWithSHAAndDES3Key").toString());
                configurableprovider.addAlgorithm("Cipher.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$OldPBEWithSHAAndDES3Key").toString());
                configurableprovider.addAlgorithm("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$PBEWithSHAAndDES2Key").toString());
                configurableprovider.addAlgorithm("Cipher.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$BrokePBEWithSHAAndDES2Key").toString());
                configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC).toString(), "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC).toString(), "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableprovider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableprovider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableprovider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            }
            configurableprovider.addAlgorithm("KeyGenerator.DESEDE", (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(PKCSObjectIdentifiers.des_EDE3_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator3").toString());
            configurableprovider.addAlgorithm("KeyGenerator.DESEDEWRAP", (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
            configurableprovider.addAlgorithm("SecretKeyFactory.DESEDE", (new StringBuilder()).append(PREFIX).append("$KeyFactory").toString());
            configurableprovider.addAlgorithm("Mac.DESEDECMAC", (new StringBuilder()).append(PREFIX).append("$CMAC").toString());
            configurableprovider.addAlgorithm("Mac.DESEDEMAC", (new StringBuilder()).append(PREFIX).append("$CBCMAC").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
            configurableprovider.addAlgorithm("Mac.DESEDEMAC/CFB8", (new StringBuilder()).append(PREFIX).append("$DESedeCFB8").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
            configurableprovider.addAlgorithm("Mac.DESEDEMAC64", (new StringBuilder()).append(PREFIX).append("$DESede64").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
            configurableprovider.addAlgorithm("Mac.DESEDEMAC64WITHISO7816-4PADDING", (new StringBuilder()).append(PREFIX).append("$DESede64with7816d4").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableprovider.addAlgorithm("AlgorithmParameters.DESEDE", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(PKCSObjectIdentifiers.des_EDE3_CBC).toString(), "DESEDE");
            configurableprovider.addAlgorithm("AlgorithmParameterGenerator.DESEDE", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(PKCSObjectIdentifiers.des_EDE3_CBC).toString(), "DESEDE");
        }


        public Mappings()
        {
        }
    }

    public static class PBEWithSHAAndDES2Key extends BaseBlockCipher
    {

        public PBEWithSHAAndDES2Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()));
        }
    }

    public static class PBEWithSHAAndDES3Key extends BaseBlockCipher
    {

        public PBEWithSHAAndDES3Key()
        {
            super(new CBCBlockCipher(new DESedeEngine()));
        }
    }

    public static class RFC3211 extends BaseWrapCipher
    {

        public RFC3211()
        {
            super(new RFC3211WrapEngine(new DESedeEngine()), 8);
        }
    }

    public static class Wrap extends BaseWrapCipher
    {

        public Wrap()
        {
            super(new DESedeWrapEngine());
        }
    }


    private DESede()
    {
    }
}

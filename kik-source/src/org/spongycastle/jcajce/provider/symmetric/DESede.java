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
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.engines.DESedeWrapEngine;
import org.spongycastle.crypto.engines.RFC3211WrapEngine;
import org.spongycastle.crypto.generators.DESedeKeyGenerator;
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

public final class DESede
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
            super("DESede");
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        private boolean f;

        protected SecretKey engineGenerateKey()
        {
            if (e)
            {
                d.a(new KeyGenerationParameters(new SecureRandom(), c));
                e = false;
            }
            if (!f)
            {
                byte abyte0[] = d.a();
                System.arraycopy(abyte0, 0, abyte0, 16, 8);
                return new SecretKeySpec(abyte0, a);
            } else
            {
                return new SecretKeySpec(d.a(), a);
            }
        }

        protected void engineInit(int i, SecureRandom securerandom)
        {
            super.engineInit(i, securerandom);
            f = true;
        }

        public KeyGenerator()
        {
            super("DESede", 192, new DESedeKeyGenerator());
            f = false;
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

        private static final String a = org/spongycastle/jcajce/provider/symmetric/DESede.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("Cipher.DESEDE", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.B).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a("Cipher.DESEDEWRAP", (new StringBuilder()).append(a).append("$Wrap").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.bx).toString(), (new StringBuilder()).append(a).append("$Wrap").toString());
            configurableprovider.a("Cipher.DESEDERFC3211WRAP", (new StringBuilder()).append(a).append("$RFC3211").toString());
            if (configurableprovider.b("MessageDigest", "SHA-1"))
            {
                configurableprovider.a("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$PBEWithSHAAndDES3Key").toString());
                configurableprovider.a("Cipher.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$BrokePBEWithSHAAndDES3Key").toString());
                configurableprovider.a("Cipher.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$OldPBEWithSHAAndDES3Key").toString());
                configurableprovider.a("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$PBEWithSHAAndDES2Key").toString());
                configurableprovider.a("Cipher.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$BrokePBEWithSHAAndDES2Key").toString());
                configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.bs).toString(), "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.bt).toString(), "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableprovider.a("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableprovider.a("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableprovider.a("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            }
            configurableprovider.a("KeyGenerator.DESEDE", (new StringBuilder()).append(a).append("$KeyGenerator").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(PKCSObjectIdentifiers.B).toString(), (new StringBuilder()).append(a).append("$KeyGenerator3").toString());
            configurableprovider.a("KeyGenerator.DESEDEWRAP", (new StringBuilder()).append(a).append("$KeyGenerator").toString());
            configurableprovider.a("SecretKeyFactory.DESEDE", (new StringBuilder()).append(a).append("$KeyFactory").toString());
            configurableprovider.a("Mac.DESEDECMAC", (new StringBuilder()).append(a).append("$CMAC").toString());
            configurableprovider.a("Mac.DESEDEMAC", (new StringBuilder()).append(a).append("$CBCMAC").toString());
            configurableprovider.a("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
            configurableprovider.a("Mac.DESEDEMAC/CFB8", (new StringBuilder()).append(a).append("$DESedeCFB8").toString());
            configurableprovider.a("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
            configurableprovider.a("Mac.DESEDEMAC64", (new StringBuilder()).append(a).append("$DESede64").toString());
            configurableprovider.a("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
            configurableprovider.a("Mac.DESEDEMAC64WITHISO7816-4PADDING", (new StringBuilder()).append(a).append("$DESede64with7816d4").toString());
            configurableprovider.a("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableprovider.a("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableprovider.a("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableprovider.a("AlgorithmParameters.DESEDE", "org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(PKCSObjectIdentifiers.B).toString(), "DESEDE");
            configurableprovider.a("AlgorithmParameterGenerator.DESEDE", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(PKCSObjectIdentifiers.B).toString(), "DESEDE");
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

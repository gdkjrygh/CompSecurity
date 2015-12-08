// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.AESFastEngine;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public final class AES
{
    public static class AESCMAC extends BaseMac
    {

        public AESCMAC()
        {
            super(new CMac(new AESFastEngine()));
        }
    }

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator
    {

        protected AlgorithmParameters engineGenerateParameters()
        {
            byte abyte0[] = new byte[16];
            if (random == null)
            {
                random = new SecureRandom();
            }
            random.nextBytes(abyte0);
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("AES", BouncyCastleProvider.PROVIDER_NAME);
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
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }

        public AlgParamGen()
        {
        }
    }

    public static class AlgParams extends IvAlgorithmParameters
    {

        protected String engineToString()
        {
            return "AES IV";
        }

        public AlgParams()
        {
        }
    }

    public static class CBC extends BaseBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new AESFastEngine()), 128);
        }
    }

    public static class CFB extends BaseBlockCipher
    {

        public CFB()
        {
            super(new BufferedBlockCipher(new CFBBlockCipher(new AESFastEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new AESFastEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            this(192);
        }

        public KeyGen(int i)
        {
            super("AES", i, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen
    {

        public KeyGen128()
        {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen
    {

        public KeyGen192()
        {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen
    {

        public KeyGen256()
        {
            super(256);
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/AES.getName();
        private static final String wrongAES128 = "2.16.840.1.101.3.4.2";
        private static final String wrongAES192 = "2.16.840.1.101.3.4.22";
        private static final String wrongAES256 = "2.16.840.1.101.3.4.42";

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("AlgorithmParameters.AES", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NISTObjectIdentifiers.id_aes128_CBC).toString(), "AES");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NISTObjectIdentifiers.id_aes192_CBC).toString(), "AES");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NISTObjectIdentifiers.id_aes256_CBC).toString(), "AES");
            configurableprovider.addAlgorithm("AlgorithmParameterGenerator.AES", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NISTObjectIdentifiers.id_aes128_CBC).toString(), "AES");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NISTObjectIdentifiers.id_aes192_CBC).toString(), "AES");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NISTObjectIdentifiers.id_aes256_CBC).toString(), "AES");
            configurableprovider.addAlgorithm("Cipher.AES", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes128_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$ECB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes192_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$ECB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes256_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$ECB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes128_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes192_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes256_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes128_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$OFB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes192_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$OFB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes256_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$OFB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes128_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$CFB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes192_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$CFB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes256_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$CFB").toString());
            configurableprovider.addAlgorithm("Cipher.AESWRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NISTObjectIdentifiers.id_aes128_wrap).toString(), "AESWRAP");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NISTObjectIdentifiers.id_aes192_wrap).toString(), "AESWRAP");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NISTObjectIdentifiers.id_aes256_wrap).toString(), "AESWRAP");
            configurableprovider.addAlgorithm("Cipher.AESRFC3211WRAP", (new StringBuilder()).append(PREFIX).append("$RFC3211Wrap").toString());
            configurableprovider.addAlgorithm("KeyGenerator.AES", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
            configurableprovider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.2", (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
            configurableprovider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.22", (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
            configurableprovider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.42", (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
            configurableprovider.addAlgorithm("KeyGenerator.AESWRAP", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
            configurableprovider.addAlgorithm("Mac.AESCMAC", (new StringBuilder()).append(PREFIX).append("$AESCMAC").toString());
        }


        public Mappings()
        {
        }
    }

    public static class OFB extends BaseBlockCipher
    {

        public OFB()
        {
            super(new BufferedBlockCipher(new OFBBlockCipher(new AESFastEngine(), 128)), 128);
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher
    {

        public RFC3211Wrap()
        {
            super(new RFC3211WrapEngine(new AESFastEngine()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher
    {

        public Wrap()
        {
            super(new AESWrapEngine());
        }
    }


    private AES()
    {
    }
}

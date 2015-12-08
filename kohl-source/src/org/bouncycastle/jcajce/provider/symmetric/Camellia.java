// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.CamelliaWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public final class Camellia
{
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
                algorithmparameters = AlgorithmParameters.getInstance("Camellia", BouncyCastleProvider.PROVIDER_NAME);
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
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }

        public AlgParamGen()
        {
        }
    }

    public static class AlgParams extends IvAlgorithmParameters
    {

        protected String engineToString()
        {
            return "Camellia IV";
        }

        public AlgParams()
        {
        }
    }

    public static class CBC extends BaseBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new CamelliaEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            this(256);
        }

        public KeyGen(int i)
        {
            super("Camellia", i, new CipherKeyGenerator());
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

        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/Camellia.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("AlgorithmParameters.CAMELLIA", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NTTObjectIdentifiers.id_camellia128_cbc).toString(), "CAMELLIA");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NTTObjectIdentifiers.id_camellia192_cbc).toString(), "CAMELLIA");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NTTObjectIdentifiers.id_camellia256_cbc).toString(), "CAMELLIA");
            configurableprovider.addAlgorithm("AlgorithmParameterGenerator.CAMELLIA", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NTTObjectIdentifiers.id_camellia128_cbc).toString(), "CAMELLIA");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NTTObjectIdentifiers.id_camellia192_cbc).toString(), "CAMELLIA");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NTTObjectIdentifiers.id_camellia256_cbc).toString(), "CAMELLIA");
            configurableprovider.addAlgorithm("Cipher.CAMELLIA", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NTTObjectIdentifiers.id_camellia128_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NTTObjectIdentifiers.id_camellia192_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NTTObjectIdentifiers.id_camellia256_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm("Cipher.CAMELLIARFC3211WRAP", (new StringBuilder()).append(PREFIX).append("$RFC3211Wrap").toString());
            configurableprovider.addAlgorithm("Cipher.CAMELLIAWRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NTTObjectIdentifiers.id_camellia128_wrap).toString(), "CAMELLIAWRAP");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NTTObjectIdentifiers.id_camellia192_wrap).toString(), "CAMELLIAWRAP");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NTTObjectIdentifiers.id_camellia256_wrap).toString(), "CAMELLIAWRAP");
            configurableprovider.addAlgorithm("KeyGenerator.CAMELLIA", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia128_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia192_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia256_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia128_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia192_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia256_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
        }


        public Mappings()
        {
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher
    {

        public RFC3211Wrap()
        {
            super(new RFC3211WrapEngine(new CamelliaEngine()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher
    {

        public Wrap()
        {
            super(new CamelliaWrapEngine());
        }
    }


    private Camellia()
    {
    }
}

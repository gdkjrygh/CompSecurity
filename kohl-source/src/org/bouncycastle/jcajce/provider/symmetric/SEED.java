// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.engines.SEEDWrapEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public final class SEED
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
                algorithmparameters = AlgorithmParameters.getInstance("SEED", BouncyCastleProvider.PROVIDER_NAME);
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
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }

        public AlgParamGen()
        {
        }
    }

    public static class AlgParams extends IvAlgorithmParameters
    {

        protected String engineToString()
        {
            return "SEED IV";
        }

        public AlgParams()
        {
        }
    }

    public static class CBC extends BaseBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new SEEDEngine()), 128);
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new SEEDEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("SEED", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/SEED.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("AlgorithmParameters.SEED", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(KISAObjectIdentifiers.id_seedCBC).toString(), "SEED");
            configurableprovider.addAlgorithm("AlgorithmParameterGenerator.SEED", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(KISAObjectIdentifiers.id_seedCBC).toString(), "SEED");
            configurableprovider.addAlgorithm("Cipher.SEED", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(KISAObjectIdentifiers.id_seedCBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm("Cipher.SEEDWRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap).toString(), "SEEDWRAP");
            configurableprovider.addAlgorithm("KeyGenerator.SEED", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(KISAObjectIdentifiers.id_seedCBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        }


        public Mappings()
        {
        }
    }

    public static class Wrap extends BaseWrapCipher
    {

        public Wrap()
        {
            super(new SEEDWrapEngine());
        }
    }


    private SEED()
    {
    }
}

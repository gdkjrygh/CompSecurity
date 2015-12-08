// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.asn1.kisa.KISAObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.SEEDEngine;
import org.spongycastle.crypto.engines.SEEDWrapEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public final class SEED
{
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator
    {

        protected AlgorithmParameters engineGenerateParameters()
        {
            byte abyte0[] = new byte[16];
            if (b == null)
            {
                b = new SecureRandom();
            }
            b.nextBytes(abyte0);
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("SEED", BouncyCastleProvider.a);
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

        private static final String a = org/spongycastle/jcajce/provider/symmetric/SEED.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("AlgorithmParameters.SEED", (new StringBuilder()).append(a).append("$AlgParams").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(KISAObjectIdentifiers.a).toString(), "SEED");
            configurableprovider.a("AlgorithmParameterGenerator.SEED", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(KISAObjectIdentifiers.a).toString(), "SEED");
            configurableprovider.a("Cipher.SEED", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(KISAObjectIdentifiers.a).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a("Cipher.SEEDWRAP", (new StringBuilder()).append(a).append("$Wrap").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(KISAObjectIdentifiers.b).toString(), "SEEDWRAP");
            configurableprovider.a("KeyGenerator.SEED", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(KISAObjectIdentifiers.a).toString(), (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(KISAObjectIdentifiers.b).toString(), (new StringBuilder()).append(a).append("$KeyGen").toString());
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

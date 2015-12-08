// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.asn1.ntt.NTTObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.CamelliaEngine;
import org.spongycastle.crypto.engines.CamelliaWrapEngine;
import org.spongycastle.crypto.engines.RFC3211WrapEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public final class Camellia
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
                algorithmparameters = AlgorithmParameters.getInstance("Camellia", BouncyCastleProvider.a);
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

        private static final String a = org/spongycastle/jcajce/provider/symmetric/Camellia.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("AlgorithmParameters.CAMELLIA", (new StringBuilder()).append(a).append("$AlgParams").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NTTObjectIdentifiers.a).toString(), "CAMELLIA");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NTTObjectIdentifiers.b).toString(), "CAMELLIA");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NTTObjectIdentifiers.c).toString(), "CAMELLIA");
            configurableprovider.a("AlgorithmParameterGenerator.CAMELLIA", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NTTObjectIdentifiers.a).toString(), "CAMELLIA");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NTTObjectIdentifiers.b).toString(), "CAMELLIA");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NTTObjectIdentifiers.c).toString(), "CAMELLIA");
            configurableprovider.a("Cipher.CAMELLIA", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NTTObjectIdentifiers.a).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NTTObjectIdentifiers.b).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NTTObjectIdentifiers.c).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a("Cipher.CAMELLIARFC3211WRAP", (new StringBuilder()).append(a).append("$RFC3211Wrap").toString());
            configurableprovider.a("Cipher.CAMELLIAWRAP", (new StringBuilder()).append(a).append("$Wrap").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NTTObjectIdentifiers.d).toString(), "CAMELLIAWRAP");
            configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NTTObjectIdentifiers.e).toString(), "CAMELLIAWRAP");
            configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NTTObjectIdentifiers.f).toString(), "CAMELLIAWRAP");
            configurableprovider.a("KeyGenerator.CAMELLIA", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.d).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.e).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.f).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.a).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.b).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.c).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
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

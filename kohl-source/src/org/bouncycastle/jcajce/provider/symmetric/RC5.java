// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.RC532Engine;
import org.bouncycastle.crypto.engines.RC564Engine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public final class RC5
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
                algorithmparameters = AlgorithmParameters.getInstance("RC5", BouncyCastleProvider.PROVIDER_NAME);
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
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC5 parameter generation.");
        }

        public AlgParamGen()
        {
        }
    }

    public static class AlgParams extends IvAlgorithmParameters
    {

        protected String engineToString()
        {
            return "RC5 IV";
        }

        public AlgParams()
        {
        }
    }

    public static class CBC32 extends BaseBlockCipher
    {

        public CBC32()
        {
            super(new CBCBlockCipher(new RC532Engine()), 64);
        }
    }

    public static class CFB8Mac32 extends BaseMac
    {

        public CFB8Mac32()
        {
            super(new CFBBlockCipherMac(new RC532Engine()));
        }
    }

    public static class ECB32 extends BaseBlockCipher
    {

        public ECB32()
        {
            super(new RC532Engine());
        }
    }

    public static class ECB64 extends BaseBlockCipher
    {

        public ECB64()
        {
            super(new RC564Engine());
        }
    }

    public static class KeyGen32 extends BaseKeyGenerator
    {

        public KeyGen32()
        {
            super("RC5", 128, new CipherKeyGenerator());
        }
    }

    public static class KeyGen64 extends BaseKeyGenerator
    {

        public KeyGen64()
        {
            super("RC5-64", 256, new CipherKeyGenerator());
        }
    }

    public static class Mac32 extends BaseMac
    {

        public Mac32()
        {
            super(new CBCBlockCipherMac(new RC532Engine()));
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/RC5.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("Cipher.RC5", (new StringBuilder()).append(PREFIX).append("$ECB32").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.RC5-32", "RC5");
            configurableprovider.addAlgorithm("Cipher.RC5-64", (new StringBuilder()).append(PREFIX).append("$ECB64").toString());
            configurableprovider.addAlgorithm("KeyGenerator.RC5", (new StringBuilder()).append(PREFIX).append("$KeyGen32").toString());
            configurableprovider.addAlgorithm("Alg.Alias.KeyGenerator.RC5-32", "RC5");
            configurableprovider.addAlgorithm("KeyGenerator.RC5-64", (new StringBuilder()).append(PREFIX).append("$KeyGen64").toString());
            configurableprovider.addAlgorithm("AlgorithmParameters.RC5", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
            configurableprovider.addAlgorithm("AlgorithmParameters.RC5-64", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
            configurableprovider.addAlgorithm("Mac.RC5MAC", (new StringBuilder()).append(PREFIX).append("$Mac32").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Mac.RC5", "RC5MAC");
            configurableprovider.addAlgorithm("Mac.RC5MAC/CFB8", (new StringBuilder()).append(PREFIX).append("$CFB8Mac32").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }


        public Mappings()
        {
        }
    }


    private RC5()
    {
    }
}

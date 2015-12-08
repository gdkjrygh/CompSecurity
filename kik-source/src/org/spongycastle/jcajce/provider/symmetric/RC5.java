// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.RC532Engine;
import org.spongycastle.crypto.engines.RC564Engine;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;
import org.spongycastle.crypto.macs.CFBBlockCipherMac;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public final class RC5
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
                algorithmparameters = AlgorithmParameters.getInstance("RC5", BouncyCastleProvider.a);
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

        private static final String a = org/spongycastle/jcajce/provider/symmetric/RC5.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("Cipher.RC5", (new StringBuilder()).append(a).append("$ECB32").toString());
            configurableprovider.a("Alg.Alias.Cipher.RC5-32", "RC5");
            configurableprovider.a("Cipher.RC5-64", (new StringBuilder()).append(a).append("$ECB64").toString());
            configurableprovider.a("KeyGenerator.RC5", (new StringBuilder()).append(a).append("$KeyGen32").toString());
            configurableprovider.a("Alg.Alias.KeyGenerator.RC5-32", "RC5");
            configurableprovider.a("KeyGenerator.RC5-64", (new StringBuilder()).append(a).append("$KeyGen64").toString());
            configurableprovider.a("AlgorithmParameters.RC5", (new StringBuilder()).append(a).append("$AlgParams").toString());
            configurableprovider.a("AlgorithmParameters.RC5-64", (new StringBuilder()).append(a).append("$AlgParams").toString());
            configurableprovider.a("Mac.RC5MAC", (new StringBuilder()).append(a).append("$Mac32").toString());
            configurableprovider.a("Alg.Alias.Mac.RC5", "RC5MAC");
            configurableprovider.a("Mac.RC5MAC/CFB8", (new StringBuilder()).append(a).append("$CFB8Mac32").toString());
            configurableprovider.a("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }


        public Mappings()
        {
        }
    }


    private RC5()
    {
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.GOST28147Engine;
import org.spongycastle.crypto.macs.GOST28147Mac;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public final class GOST28147
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
                algorithmparameters = AlgorithmParameters.getInstance("GOST28147", BouncyCastleProvider.a);
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
            return "GOST IV";
        }

        public AlgParams()
        {
        }
    }

    public static class CBC extends BaseBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new GOST28147Engine()), 64);
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new GOST28147Engine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            this((byte)0);
        }

        private KeyGen(byte byte0)
        {
            super("GOST28147", 256, new CipherKeyGenerator());
        }
    }

    public static class Mac extends BaseMac
    {

        public Mac()
        {
            super(new GOST28147Mac());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String a = org/spongycastle/jcajce/provider/symmetric/GOST28147.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("Cipher.GOST28147", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableprovider.a("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            configurableprovider.a((new StringBuilder("Cipher.")).append(CryptoProObjectIdentifiers.b).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a("KeyGenerator.GOST28147", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableprovider.a("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            configurableprovider.a((new StringBuilder("Alg.Alias.KeyGenerator.")).append(CryptoProObjectIdentifiers.b).toString(), "GOST28147");
            configurableprovider.a("Mac.GOST28147MAC", (new StringBuilder()).append(a).append("$Mac").toString());
            configurableprovider.a("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }


        public Mappings()
        {
        }
    }


    private GOST28147()
    {
    }
}

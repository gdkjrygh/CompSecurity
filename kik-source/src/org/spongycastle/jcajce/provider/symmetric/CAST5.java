// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.misc.CAST5CBCParameters;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.CAST5Engine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public final class CAST5
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
                algorithmparameters = AlgorithmParameters.getInstance("CAST5", BouncyCastleProvider.a);
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
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for CAST5 parameter generation.");
        }

        public AlgParamGen()
        {
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters
    {

        private byte a[];
        private int b;

        protected final AlgorithmParameterSpec a(Class class1)
        {
            if (class1 == javax/crypto/spec/IvParameterSpec)
            {
                return new IvParameterSpec(a);
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to CAST5 parameters object.");
            }
        }

        protected byte[] engineGetEncoded()
        {
            byte abyte0[] = new byte[a.length];
            System.arraycopy(a, 0, abyte0, 0, a.length);
            return abyte0;
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (a(s))
            {
                return (new CAST5CBCParameters(engineGetEncoded(), b)).b();
            }
            if (s.equals("RAW"))
            {
                return engineGetEncoded();
            } else
            {
                return null;
            }
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
        {
            if (algorithmparameterspec instanceof IvParameterSpec)
            {
                a = ((IvParameterSpec)algorithmparameterspec).getIV();
                return;
            } else
            {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a CAST5 parameters algorithm parameters object");
            }
        }

        protected void engineInit(byte abyte0[])
        {
            a = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, a, 0, a.length);
        }

        protected void engineInit(byte abyte0[], String s)
        {
            if (a(s))
            {
                abyte0 = CAST5CBCParameters.a((new ASN1InputStream(abyte0)).b());
                b = abyte0.d();
                a = abyte0.c();
                return;
            }
            if (s.equals("RAW"))
            {
                engineInit(abyte0);
                return;
            } else
            {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
        }

        protected String engineToString()
        {
            return "CAST5 Parameters";
        }

        public AlgParams()
        {
            b = 128;
        }
    }

    public static class CBC extends BaseBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new CAST5Engine()), 64);
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new CAST5Engine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("CAST5", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String a = org/spongycastle/jcajce/provider/symmetric/CAST5.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("AlgorithmParameters.CAST5", (new StringBuilder()).append(a).append("$AlgParams").toString());
            configurableprovider.a("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5");
            configurableprovider.a("AlgorithmParameterGenerator.CAST5", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
            configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5");
            configurableprovider.a("Cipher.CAST5", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a("Cipher.1.2.840.113533.7.66.10", (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a("KeyGenerator.CAST5", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("Alg.Alias.KeyGenerator.1.2.840.113533.7.66.10", "CAST5");
        }


        public Mappings()
        {
        }
    }


    private CAST5()
    {
    }
}

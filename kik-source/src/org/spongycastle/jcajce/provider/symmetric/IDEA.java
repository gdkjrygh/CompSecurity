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
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.misc.IDEACBCPar;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.IDEAEngine;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;
import org.spongycastle.crypto.macs.CFBBlockCipherMac;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public final class IDEA
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
                algorithmparameters = AlgorithmParameters.getInstance("IDEA", BouncyCastleProvider.a);
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
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for IDEA parameter generation.");
        }

        public AlgParamGen()
        {
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters
    {

        private byte a[];

        protected final AlgorithmParameterSpec a(Class class1)
        {
            if (class1 == javax/crypto/spec/IvParameterSpec)
            {
                return new IvParameterSpec(a);
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
            }
        }

        protected byte[] engineGetEncoded()
        {
            return engineGetEncoded("ASN.1");
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (a(s))
            {
                return (new IDEACBCPar(engineGetEncoded("RAW"))).b();
            }
            if (s.equals("RAW"))
            {
                s = new byte[a.length];
                System.arraycopy(a, 0, s, 0, a.length);
                return s;
            } else
            {
                return null;
            }
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
        {
            if (!(algorithmparameterspec instanceof IvParameterSpec))
            {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            } else
            {
                a = ((IvParameterSpec)algorithmparameterspec).getIV();
                return;
            }
        }

        protected void engineInit(byte abyte0[])
        {
            a = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, a, 0, a.length);
        }

        protected void engineInit(byte abyte0[], String s)
        {
            if (s.equals("RAW"))
            {
                engineInit(abyte0);
                return;
            }
            if (s.equals("ASN.1"))
            {
                engineInit((new IDEACBCPar((ASN1Sequence)(new ASN1InputStream(abyte0)).b())).c());
                return;
            } else
            {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
        }

        protected String engineToString()
        {
            return "IDEA Parameters";
        }

        public AlgParams()
        {
        }
    }

    public static class CBC extends BaseBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new IDEAEngine()), 64);
        }
    }

    public static class CFB8Mac extends BaseMac
    {

        public CFB8Mac()
        {
            super(new CFBBlockCipherMac(new IDEAEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new IDEAEngine());
        }
    }

    public static class KeyGen extends BaseKeyGenerator
    {

        public KeyGen()
        {
            super("IDEA", 128, new CipherKeyGenerator());
        }
    }

    public static class Mac extends BaseMac
    {

        public Mac()
        {
            super(new CBCBlockCipherMac(new IDEAEngine()));
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String a = org/spongycastle/jcajce/provider/symmetric/IDEA.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("AlgorithmParameterGenerator.IDEA", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
            configurableprovider.a("AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
            configurableprovider.a("AlgorithmParameters.IDEA", (new StringBuilder()).append(a).append("$AlgParams").toString());
            configurableprovider.a("AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2", (new StringBuilder()).append(a).append("$AlgParams").toString());
            configurableprovider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE");
            configurableprovider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE");
            configurableprovider.a("Cipher.IDEA", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a("Cipher.1.3.6.1.4.1.188.7.1.1.2", (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a("Cipher.PBEWITHSHAANDIDEA-CBC", (new StringBuilder()).append(a).append("$PBEWithSHAAndIDEA").toString());
            configurableprovider.a("KeyGenerator.IDEA", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("KeyGenerator.1.3.6.1.4.1.188.7.1.1.2", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", (new StringBuilder()).append(a).append("$PBEWithSHAAndIDEAKeyGen").toString());
            configurableprovider.a("Mac.IDEAMAC", (new StringBuilder()).append(a).append("$Mac").toString());
            configurableprovider.a("Alg.Alias.Mac.IDEA", "IDEAMAC");
            configurableprovider.a("Mac.IDEAMAC/CFB8", (new StringBuilder()).append(a).append("$CFB8Mac").toString());
            configurableprovider.a("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
        }


        public Mappings()
        {
        }
    }

    public static class PBEWithSHAAndIDEA extends BaseBlockCipher
    {

        public PBEWithSHAAndIDEA()
        {
            super(new CBCBlockCipher(new IDEAEngine()));
        }
    }

    public static class PBEWithSHAAndIDEAKeyGen extends PBESecretKeyFactory
    {

        public PBEWithSHAAndIDEAKeyGen()
        {
            super("PBEwithSHAandIDEA-CBC");
        }
    }


    private IDEA()
    {
    }
}

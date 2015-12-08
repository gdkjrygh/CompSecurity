// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.engines.AESFastEngine;
import org.spongycastle.crypto.engines.AESWrapEngine;
import org.spongycastle.crypto.engines.RFC3211WrapEngine;
import org.spongycastle.crypto.macs.CMac;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.modes.CFBBlockCipher;
import org.spongycastle.crypto.modes.OFBBlockCipher;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;
import org.spongycastle.jce.provider.BouncyCastleProvider;

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
            if (b == null)
            {
                b = new SecureRandom();
            }
            b.nextBytes(abyte0);
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("AES", BouncyCastleProvider.a);
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
            super(new BufferedBlockCipher(new CFBBlockCipher(new AESFastEngine(), 128)));
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

        private static final String a = org/spongycastle/jcajce/provider/symmetric/AES.getName();

        public final void a(ConfigurableProvider configurableprovider)
        {
            configurableprovider.a("AlgorithmParameters.AES", (new StringBuilder()).append(a).append("$AlgParams").toString());
            configurableprovider.a("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableprovider.a("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableprovider.a("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.h).toString(), "AES");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.o).toString(), "AES");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.v).toString(), "AES");
            configurableprovider.a("AlgorithmParameterGenerator.AES", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
            configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.h).toString(), "AES");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.o).toString(), "AES");
            configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.v).toString(), "AES");
            configurableprovider.a("Cipher.AES", (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableprovider.a("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableprovider.a("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.g).toString(), (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.n).toString(), (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.u).toString(), (new StringBuilder()).append(a).append("$ECB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.h).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.o).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.v).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.i).toString(), (new StringBuilder()).append(a).append("$OFB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.p).toString(), (new StringBuilder()).append(a).append("$OFB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.w).toString(), (new StringBuilder()).append(a).append("$OFB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.j).toString(), (new StringBuilder()).append(a).append("$CFB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.q).toString(), (new StringBuilder()).append(a).append("$CFB").toString());
            configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.x).toString(), (new StringBuilder()).append(a).append("$CFB").toString());
            configurableprovider.a("Cipher.AESWRAP", (new StringBuilder()).append(a).append("$Wrap").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.k).toString(), "AESWRAP");
            configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.r).toString(), "AESWRAP");
            configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.y).toString(), "AESWRAP");
            configurableprovider.a("Cipher.AESRFC3211WRAP", (new StringBuilder()).append(a).append("$RFC3211Wrap").toString());
            configurableprovider.a("KeyGenerator.AES", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a("KeyGenerator.2.16.840.1.101.3.4.2", (new StringBuilder()).append(a).append("$KeyGen128").toString());
            configurableprovider.a("KeyGenerator.2.16.840.1.101.3.4.22", (new StringBuilder()).append(a).append("$KeyGen192").toString());
            configurableprovider.a("KeyGenerator.2.16.840.1.101.3.4.42", (new StringBuilder()).append(a).append("$KeyGen256").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.g).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.h).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.i).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.j).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.n).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.o).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.p).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.q).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.u).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.v).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.w).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.x).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
            configurableprovider.a("KeyGenerator.AESWRAP", (new StringBuilder()).append(a).append("$KeyGen").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.k).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.r).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
            configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.y).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
            configurableprovider.a("Mac.AESCMAC", (new StringBuilder()).append(a).append("$AESCMAC").toString());
        }


        public Mappings()
        {
        }
    }

    public static class OFB extends BaseBlockCipher
    {

        public OFB()
        {
            super(new BufferedBlockCipher(new OFBBlockCipher(new AESFastEngine(), 128)));
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

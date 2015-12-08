// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.AESFastEngine;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.JCEBlockCipher;
import org.bouncycastle.jce.provider.JCEKeyGenerator;
import org.bouncycastle.jce.provider.JCEMac;
import org.bouncycastle.jce.provider.JDKAlgorithmParameterGenerator;
import org.bouncycastle.jce.provider.WrapCipherSpi;

public final class AES
{
    public static class AESCMAC extends JCEMac
    {

        public AESCMAC()
        {
            super(new CMac(new AESFastEngine()));
        }
    }

    public static class AlgParamGen extends JDKAlgorithmParameterGenerator
    {

        protected AlgorithmParameters engineGenerateParameters()
        {
            byte abyte0[] = new byte[16];
            if (a == null)
            {
                a = new SecureRandom();
            }
            a.nextBytes(abyte0);
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

    public static class AlgParams extends org.bouncycastle.jce.provider.JDKAlgorithmParameters.IVAlgorithmParameters
    {

        protected String engineToString()
        {
            return "AES IV";
        }

        public AlgParams()
        {
        }
    }

    public static class CBC extends JCEBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new AESFastEngine()), 128);
        }
    }

    public static class CFB extends JCEBlockCipher
    {

        public CFB()
        {
            super(new BufferedBlockCipher(new CFBBlockCipher(new AESFastEngine(), 128)));
        }
    }

    public static class ECB extends JCEBlockCipher
    {

        public ECB()
        {
            super(new AESFastEngine());
        }
    }

    public static class KeyGen extends JCEKeyGenerator
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

    public static class Mappings extends HashMap
    {

        public Mappings()
        {
            put("AlgorithmParameters.AES", "org.bouncycastle.jce.provider.symmetric.AES$AlgParams");
            put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.h).toString(), "AES");
            put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.o).toString(), "AES");
            put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.v).toString(), "AES");
            put("AlgorithmParameterGenerator.AES", "org.bouncycastle.jce.provider.symmetric.AES$AlgParamGen");
            put("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            put("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            put("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.h).toString(), "AES");
            put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.o).toString(), "AES");
            put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.v).toString(), "AES");
            put("Cipher.AES", "org.bouncycastle.jce.provider.symmetric.AES$ECB");
            put("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            put("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            put("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.g).toString(), "org.bouncycastle.jce.provider.symmetric.AES$ECB");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.n).toString(), "org.bouncycastle.jce.provider.symmetric.AES$ECB");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.u).toString(), "org.bouncycastle.jce.provider.symmetric.AES$ECB");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.h).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CBC");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.o).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CBC");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.v).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CBC");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.i).toString(), "org.bouncycastle.jce.provider.symmetric.AES$OFB");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.p).toString(), "org.bouncycastle.jce.provider.symmetric.AES$OFB");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.w).toString(), "org.bouncycastle.jce.provider.symmetric.AES$OFB");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.j).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CFB");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.q).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CFB");
            put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.x).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CFB");
            put("Cipher.AESWRAP", "org.bouncycastle.jce.provider.symmetric.AES$Wrap");
            put((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.k).toString(), "AESWRAP");
            put((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.r).toString(), "AESWRAP");
            put((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.y).toString(), "AESWRAP");
            put("Cipher.AESRFC3211WRAP", "org.bouncycastle.jce.provider.symmetric.AES$RFC3211Wrap");
            put("KeyGenerator.AES", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen");
            put("KeyGenerator.2.16.840.1.101.3.4.2", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
            put("KeyGenerator.2.16.840.1.101.3.4.22", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
            put("KeyGenerator.2.16.840.1.101.3.4.42", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.g).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.h).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.i).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.j).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.n).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.o).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.p).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.q).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.u).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.v).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.w).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.x).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
            put("KeyGenerator.AESWRAP", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.k).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.r).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
            put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.y).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
            put("Mac.AESCMAC", "org.bouncycastle.jce.provider.symmetric.AES$AESCMAC");
        }
    }

    public static class OFB extends JCEBlockCipher
    {

        public OFB()
        {
            super(new BufferedBlockCipher(new OFBBlockCipher(new AESFastEngine(), 128)));
        }
    }

    public static class RFC3211Wrap extends WrapCipherSpi
    {

        public RFC3211Wrap()
        {
            super(new RFC3211WrapEngine(new AESFastEngine()), 16);
        }
    }

    public static class Wrap extends WrapCipherSpi
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

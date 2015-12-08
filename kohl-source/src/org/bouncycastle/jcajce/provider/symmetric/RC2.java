// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RC2CBCParameter;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.RC2Engine;
import org.bouncycastle.crypto.engines.RC2WrapEngine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Arrays;

public final class RC2
{
    public static class AlgParamGen extends BaseAlgorithmParameterGenerator
    {

        RC2ParameterSpec spec;

        protected AlgorithmParameters engineGenerateParameters()
        {
            if (spec == null)
            {
                byte abyte0[] = new byte[8];
                if (random == null)
                {
                    random = new SecureRandom();
                }
                random.nextBytes(abyte0);
                AlgorithmParameters algorithmparameters1;
                try
                {
                    algorithmparameters1 = AlgorithmParameters.getInstance("RC2", BouncyCastleProvider.PROVIDER_NAME);
                    algorithmparameters1.init(new IvParameterSpec(abyte0));
                }
                catch (Exception exception)
                {
                    throw new RuntimeException(exception.getMessage());
                }
                return algorithmparameters1;
            }
            AlgorithmParameters algorithmparameters;
            try
            {
                algorithmparameters = AlgorithmParameters.getInstance("RC2", BouncyCastleProvider.PROVIDER_NAME);
                algorithmparameters.init(spec);
            }
            catch (Exception exception1)
            {
                throw new RuntimeException(exception1.getMessage());
            }
            return algorithmparameters;
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
            throws InvalidAlgorithmParameterException
        {
            if (algorithmparameterspec instanceof RC2ParameterSpec)
            {
                spec = (RC2ParameterSpec)algorithmparameterspec;
                return;
            } else
            {
                throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
            }
        }

        public AlgParamGen()
        {
            spec = null;
        }
    }

    public static class AlgParams extends BaseAlgorithmParameters
    {

        private static final short ekb[] = {
            93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 
            133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 
            104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 
            82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 
            219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 
            22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 
            109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 
            199, 184, 80, 232, 36, 23, 252, 37, 111, 187, 
            106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 
            31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 
            224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 
            91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 
            64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 
            204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 
            88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 
            130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 
            40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 
            220, 255, 6, 164, 234, 66, 8, 218, 180, 113, 
            176, 207, 18, 122, 78, 250, 108, 29, 132, 0, 
            200, 127, 145, 69, 170, 43, 194, 177, 143, 213, 
            186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 
            146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 
            19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 
            81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 
            59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 
            95, 50, 136, 14, 53, 253
        };
        private static final short table[] = {
            189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 
            209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 
            125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 
            33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 
            160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 
            251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 
            166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 
            103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 
            72, 230, 30, 83, 243, 146, 164, 114, 140, 8, 
            21, 110, 134, 0, 132, 250, 244, 127, 138, 66, 
            25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 
            6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 
            148, 153, 183, 113, 116, 211, 228, 191, 58, 222, 
            150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 
            121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 
            34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 
            24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 
            194, 87, 99, 202, 61, 108, 180, 197, 204, 112, 
            178, 145, 89, 13, 71, 32, 200, 79, 88, 224, 
            1, 226, 22, 56, 196, 111, 59, 15, 101, 70, 
            190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 
            248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 
            170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 
            68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 
            167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 
            185, 233, 76, 255, 67, 171
        };
        private byte iv[];
        private int parameterVersion;

        protected byte[] engineGetEncoded()
        {
            return Arrays.clone(iv);
        }

        protected byte[] engineGetEncoded(String s)
            throws IOException
        {
            if (isASN1FormatString(s))
            {
                if (parameterVersion == -1)
                {
                    return (new RC2CBCParameter(engineGetEncoded())).getEncoded();
                } else
                {
                    return (new RC2CBCParameter(parameterVersion, engineGetEncoded())).getEncoded();
                }
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
            throws InvalidParameterSpecException
        {
            if (algorithmparameterspec instanceof IvParameterSpec)
            {
                iv = ((IvParameterSpec)algorithmparameterspec).getIV();
                return;
            }
            if (algorithmparameterspec instanceof RC2ParameterSpec)
            {
                int i = ((RC2ParameterSpec)algorithmparameterspec).getEffectiveKeyBits();
                if (i != -1)
                {
                    if (i < 256)
                    {
                        parameterVersion = table[i];
                    } else
                    {
                        parameterVersion = i;
                    }
                }
                iv = ((RC2ParameterSpec)algorithmparameterspec).getIV();
                return;
            } else
            {
                throw new InvalidParameterSpecException("IvParameterSpec or RC2ParameterSpec required to initialise a RC2 parameters algorithm parameters object");
            }
        }

        protected void engineInit(byte abyte0[])
            throws IOException
        {
            iv = Arrays.clone(abyte0);
        }

        protected void engineInit(byte abyte0[], String s)
            throws IOException
        {
            if (isASN1FormatString(s))
            {
                abyte0 = RC2CBCParameter.getInstance(ASN1Primitive.fromByteArray(abyte0));
                if (abyte0.getRC2ParameterVersion() != null)
                {
                    parameterVersion = abyte0.getRC2ParameterVersion().intValue();
                }
                iv = abyte0.getIV();
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
            return "RC2 Parameters";
        }

        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
            throws InvalidParameterSpecException
        {
            if (class1 == javax/crypto/spec/RC2ParameterSpec && parameterVersion != -1)
            {
                if (parameterVersion < 256)
                {
                    return new RC2ParameterSpec(ekb[parameterVersion], iv);
                } else
                {
                    return new RC2ParameterSpec(parameterVersion, iv);
                }
            }
            if (class1 == javax/crypto/spec/IvParameterSpec)
            {
                return new IvParameterSpec(iv);
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to RC2 parameters object.");
            }
        }


        public AlgParams()
        {
            parameterVersion = 58;
        }
    }

    public static class CBC extends BaseBlockCipher
    {

        public CBC()
        {
            super(new CBCBlockCipher(new RC2Engine()), 64);
        }
    }

    public static class CBCMAC extends BaseMac
    {

        public CBCMAC()
        {
            super(new CBCBlockCipherMac(new RC2Engine()));
        }
    }

    public static class CFB8MAC extends BaseMac
    {

        public CFB8MAC()
        {
            super(new CFBBlockCipherMac(new RC2Engine()));
        }
    }

    public static class ECB extends BaseBlockCipher
    {

        public ECB()
        {
            super(new RC2Engine());
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator
    {

        public KeyGenerator()
        {
            super("RC2", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends AlgorithmProvider
    {

        private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/RC2.getName();

        public void configure(ConfigurableProvider configurableprovider)
        {
            configurableprovider.addAlgorithm("AlgorithmParameterGenerator.RC2", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
            configurableprovider.addAlgorithm("AlgorithmParameterGenerator.1.2.840.113549.3.2", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
            configurableprovider.addAlgorithm("KeyGenerator.RC2", (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
            configurableprovider.addAlgorithm("KeyGenerator.1.2.840.113549.3.2", (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
            configurableprovider.addAlgorithm("AlgorithmParameters.RC2", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
            configurableprovider.addAlgorithm("AlgorithmParameters.1.2.840.113549.3.2", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
            configurableprovider.addAlgorithm("Cipher.RC2", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
            configurableprovider.addAlgorithm("Cipher.RC2WRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(PKCSObjectIdentifiers.id_alg_CMSRC2wrap).toString(), "RC2WRAP");
            configurableprovider.addAlgorithm("Cipher.1.2.840.113549.3.2", (new StringBuilder()).append(PREFIX).append("$CBC").toString());
            configurableprovider.addAlgorithm("Mac.RC2MAC", (new StringBuilder()).append(PREFIX).append("$CBCMAC").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Mac.RC2", "RC2MAC");
            configurableprovider.addAlgorithm("Mac.RC2MAC/CFB8", (new StringBuilder()).append(PREFIX).append("$CFB8MAC").toString());
            configurableprovider.addAlgorithm("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
        }


        public Mappings()
        {
        }
    }

    public static class Wrap extends BaseWrapCipher
    {

        public Wrap()
        {
            super(new RC2WrapEngine());
        }
    }


    private RC2()
    {
    }
}

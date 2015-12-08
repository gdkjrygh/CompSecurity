// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.RC2CBCParameter;
import org.bouncycastle.util.Arrays;

public abstract class BaseAlgorithmParameters extends AlgorithmParametersSpi
{
    public static class PBKDF2 extends BaseAlgorithmParameters
    {

        PBKDF2Params params;

        protected byte[] engineGetEncoded()
        {
            byte abyte0[];
            try
            {
                abyte0 = params.getEncoded("DER");
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException((new StringBuilder()).append("Oooops! ").append(ioexception.toString()).toString());
            }
            return abyte0;
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (isASN1FormatString(s))
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
            if (!(algorithmparameterspec instanceof PBEParameterSpec))
            {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
            } else
            {
                algorithmparameterspec = (PBEParameterSpec)algorithmparameterspec;
                params = new PBKDF2Params(algorithmparameterspec.getSalt(), algorithmparameterspec.getIterationCount());
                return;
            }
        }

        protected void engineInit(byte abyte0[])
            throws IOException
        {
            params = PBKDF2Params.getInstance(ASN1Primitive.fromByteArray(abyte0));
        }

        protected void engineInit(byte abyte0[], String s)
            throws IOException
        {
            if (isASN1FormatString(s))
            {
                engineInit(abyte0);
                return;
            } else
            {
                throw new IOException("Unknown parameters format in PWRIKEK parameters object");
            }
        }

        protected String engineToString()
        {
            return "PBKDF2 Parameters";
        }

        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
            throws InvalidParameterSpecException
        {
            if (class1 == javax/crypto/spec/PBEParameterSpec)
            {
                return new PBEParameterSpec(params.getSalt(), params.getIterationCount().intValue());
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
            }
        }

        public PBKDF2()
        {
        }
    }

    public static class PKCS12PBE extends BaseAlgorithmParameters
    {

        PKCS12PBEParams params;

        protected byte[] engineGetEncoded()
        {
            byte abyte0[];
            try
            {
                abyte0 = params.getEncoded("DER");
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException((new StringBuilder()).append("Oooops! ").append(ioexception.toString()).toString());
            }
            return abyte0;
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (isASN1FormatString(s))
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
            if (!(algorithmparameterspec instanceof PBEParameterSpec))
            {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
            } else
            {
                algorithmparameterspec = (PBEParameterSpec)algorithmparameterspec;
                params = new PKCS12PBEParams(algorithmparameterspec.getSalt(), algorithmparameterspec.getIterationCount());
                return;
            }
        }

        protected void engineInit(byte abyte0[])
            throws IOException
        {
            params = PKCS12PBEParams.getInstance(ASN1Primitive.fromByteArray(abyte0));
        }

        protected void engineInit(byte abyte0[], String s)
            throws IOException
        {
            if (isASN1FormatString(s))
            {
                engineInit(abyte0);
                return;
            } else
            {
                throw new IOException("Unknown parameters format in PKCS12 PBE parameters object");
            }
        }

        protected String engineToString()
        {
            return "PKCS12 PBE Parameters";
        }

        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
            throws InvalidParameterSpecException
        {
            if (class1 == javax/crypto/spec/PBEParameterSpec)
            {
                return new PBEParameterSpec(params.getIV(), params.getIterations().intValue());
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
            }
        }

        public PKCS12PBE()
        {
        }
    }

    public static class RC2AlgorithmParameters extends BaseAlgorithmParameters
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


        public RC2AlgorithmParameters()
        {
            parameterVersion = 58;
        }
    }


    public BaseAlgorithmParameters()
    {
    }

    protected AlgorithmParameterSpec engineGetParameterSpec(Class class1)
        throws InvalidParameterSpecException
    {
        if (class1 == null)
        {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        } else
        {
            return localEngineGetParameterSpec(class1);
        }
    }

    protected boolean isASN1FormatString(String s)
    {
        return s == null || s.equals("ASN.1");
    }

    protected abstract AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
        throws InvalidParameterSpecException;
}

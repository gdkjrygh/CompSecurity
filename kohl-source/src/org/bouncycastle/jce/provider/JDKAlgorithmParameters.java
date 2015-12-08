// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.jce.spec.IESParameterSpec;

public abstract class JDKAlgorithmParameters extends AlgorithmParametersSpi
{
    public static class IES extends JDKAlgorithmParameters
    {

        IESParameterSpec currentSpec;

        protected byte[] engineGetEncoded()
        {
            byte abyte0[];
            try
            {
                ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
                asn1encodablevector.add(new DEROctetString(currentSpec.getDerivationV()));
                asn1encodablevector.add(new DEROctetString(currentSpec.getEncodingV()));
                asn1encodablevector.add(new DERInteger(currentSpec.getMacKeySize()));
                abyte0 = (new DERSequence(asn1encodablevector)).getEncoded("DER");
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException("Error encoding IESParameters");
            }
            return abyte0;
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (isASN1FormatString(s) || s.equalsIgnoreCase("X.509"))
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
            if (!(algorithmparameterspec instanceof IESParameterSpec))
            {
                throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
            } else
            {
                currentSpec = (IESParameterSpec)algorithmparameterspec;
                return;
            }
        }

        protected void engineInit(byte abyte0[])
            throws IOException
        {
            try
            {
                abyte0 = (ASN1Sequence)ASN1Primitive.fromByteArray(abyte0);
                currentSpec = new IESParameterSpec(((ASN1OctetString)abyte0.getObjectAt(0)).getOctets(), ((ASN1OctetString)abyte0.getObjectAt(0)).getOctets(), ((DERInteger)abyte0.getObjectAt(0)).getValue().intValue());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IOException("Not a valid IES Parameter encoding.");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IOException("Not a valid IES Parameter encoding.");
            }
        }

        protected void engineInit(byte abyte0[], String s)
            throws IOException
        {
            if (isASN1FormatString(s) || s.equalsIgnoreCase("X.509"))
            {
                engineInit(abyte0);
                return;
            } else
            {
                throw new IOException((new StringBuilder()).append("Unknown parameter format ").append(s).toString());
            }
        }

        protected String engineToString()
        {
            return "IES Parameters";
        }

        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
            throws InvalidParameterSpecException
        {
            if (class1 == org/bouncycastle/jce/spec/IESParameterSpec)
            {
                return currentSpec;
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
            }
        }

        public IES()
        {
        }
    }

    public static class PBKDF2 extends JDKAlgorithmParameters
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

    public static class PKCS12PBE extends JDKAlgorithmParameters
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


    public JDKAlgorithmParameters()
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

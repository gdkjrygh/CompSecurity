// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.asn1.ASN1EncodableVector;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERSequence;
import org.spongycastle.asn1.pkcs.PBKDF2Params;
import org.spongycastle.asn1.pkcs.PKCS12PBEParams;
import org.spongycastle.jce.spec.IESParameterSpec;

public abstract class JDKAlgorithmParameters extends AlgorithmParametersSpi
{
    public static class IES extends JDKAlgorithmParameters
    {

        IESParameterSpec a;

        protected final AlgorithmParameterSpec a(Class class1)
        {
            if (class1 == org/spongycastle/jce/spec/IESParameterSpec)
            {
                return a;
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
            }
        }

        protected byte[] engineGetEncoded()
        {
            byte abyte0[];
            try
            {
                ASN1EncodableVector asn1encodablevector = new ASN1EncodableVector();
                asn1encodablevector.a(new DEROctetString(a.a()));
                asn1encodablevector.a(new DEROctetString(a.b()));
                asn1encodablevector.a(new DERInteger(a.c()));
                abyte0 = (new DERSequence(asn1encodablevector)).a("DER");
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException("Error encoding IESParameters");
            }
            return abyte0;
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (a(s) || s.equalsIgnoreCase("X.509"))
            {
                return engineGetEncoded();
            } else
            {
                return null;
            }
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
        {
            if (!(algorithmparameterspec instanceof IESParameterSpec))
            {
                throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
            } else
            {
                a = (IESParameterSpec)algorithmparameterspec;
                return;
            }
        }

        protected void engineInit(byte abyte0[])
        {
            try
            {
                abyte0 = (ASN1Sequence)ASN1Primitive.a(abyte0);
                a = new IESParameterSpec(((ASN1OctetString)abyte0.a(0)).d(), ((ASN1OctetString)abyte0.a(0)).d(), ((DERInteger)abyte0.a(0)).c().intValue());
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
        {
            if (a(s) || s.equalsIgnoreCase("X.509"))
            {
                engineInit(abyte0);
                return;
            } else
            {
                throw new IOException((new StringBuilder("Unknown parameter format ")).append(s).toString());
            }
        }

        protected String engineToString()
        {
            return "IES Parameters";
        }

        public IES()
        {
        }
    }

    public static class PBKDF2 extends JDKAlgorithmParameters
    {

        PBKDF2Params a;

        protected final AlgorithmParameterSpec a(Class class1)
        {
            if (class1 == javax/crypto/spec/PBEParameterSpec)
            {
                return new PBEParameterSpec(a.c(), a.d().intValue());
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
            }
        }

        protected byte[] engineGetEncoded()
        {
            byte abyte0[];
            try
            {
                abyte0 = a.a("DER");
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException((new StringBuilder("Oooops! ")).append(ioexception.toString()).toString());
            }
            return abyte0;
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (a(s))
            {
                return engineGetEncoded();
            } else
            {
                return null;
            }
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
        {
            if (!(algorithmparameterspec instanceof PBEParameterSpec))
            {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
            } else
            {
                algorithmparameterspec = (PBEParameterSpec)algorithmparameterspec;
                a = new PBKDF2Params(algorithmparameterspec.getSalt(), algorithmparameterspec.getIterationCount());
                return;
            }
        }

        protected void engineInit(byte abyte0[])
        {
            a = PBKDF2Params.a(ASN1Primitive.a(abyte0));
        }

        protected void engineInit(byte abyte0[], String s)
        {
            if (a(s))
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

        public PBKDF2()
        {
        }
    }

    public static class PKCS12PBE extends JDKAlgorithmParameters
    {

        PKCS12PBEParams a;

        protected final AlgorithmParameterSpec a(Class class1)
        {
            if (class1 == javax/crypto/spec/PBEParameterSpec)
            {
                return new PBEParameterSpec(a.d(), a.c().intValue());
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
            }
        }

        protected byte[] engineGetEncoded()
        {
            byte abyte0[];
            try
            {
                abyte0 = a.a("DER");
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException((new StringBuilder("Oooops! ")).append(ioexception.toString()).toString());
            }
            return abyte0;
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (a(s))
            {
                return engineGetEncoded();
            } else
            {
                return null;
            }
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
        {
            if (!(algorithmparameterspec instanceof PBEParameterSpec))
            {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
            } else
            {
                algorithmparameterspec = (PBEParameterSpec)algorithmparameterspec;
                a = new PKCS12PBEParams(algorithmparameterspec.getSalt(), algorithmparameterspec.getIterationCount());
                return;
            }
        }

        protected void engineInit(byte abyte0[])
        {
            a = PKCS12PBEParams.a(ASN1Primitive.a(abyte0));
        }

        protected void engineInit(byte abyte0[], String s)
        {
            if (a(s))
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

        public PKCS12PBE()
        {
        }
    }


    public JDKAlgorithmParameters()
    {
    }

    protected static boolean a(String s)
    {
        return s == null || s.equals("ASN.1");
    }

    protected abstract AlgorithmParameterSpec a(Class class1);

    protected AlgorithmParameterSpec engineGetParameterSpec(Class class1)
    {
        if (class1 == null)
        {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        } else
        {
            return a(class1);
        }
    }
}

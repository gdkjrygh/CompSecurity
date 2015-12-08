// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.RSAESOAEPparams;
import org.spongycastle.asn1.pkcs.RSASSAPSSparams;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.provider.util.DigestFactory;

public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi
{
    public static class OAEP extends AlgorithmParametersSpi
    {

        OAEPParameterSpec a;

        protected final AlgorithmParameterSpec a(Class class1)
        {
            if (class1 == javax/crypto/spec/OAEPParameterSpec && a != null)
            {
                return a;
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
            }
        }

        protected byte[] engineGetEncoded()
        {
            Object obj = new AlgorithmIdentifier(DigestFactory.b(a.getDigestAlgorithm()), new DERNull());
            Object obj1 = (MGF1ParameterSpec)a.getMGFParameters();
            obj1 = new AlgorithmIdentifier(PKCSObjectIdentifiers.H_, new AlgorithmIdentifier(DigestFactory.b(((MGF1ParameterSpec) (obj1)).getDigestAlgorithm()), new DERNull()));
            javax.crypto.spec.PSource.PSpecified pspecified = (javax.crypto.spec.PSource.PSpecified)a.getPSource();
            obj = new RSAESOAEPparams(((AlgorithmIdentifier) (obj)), ((AlgorithmIdentifier) (obj1)), new AlgorithmIdentifier(PKCSObjectIdentifiers.j, new DEROctetString(pspecified.getValue())));
            byte abyte0[];
            try
            {
                abyte0 = ((RSAESOAEPparams) (obj)).a("DER");
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException("Error encoding OAEPParameters");
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
            if (!(algorithmparameterspec instanceof OAEPParameterSpec))
            {
                throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
            } else
            {
                a = (OAEPParameterSpec)algorithmparameterspec;
                return;
            }
        }

        protected void engineInit(byte abyte0[])
        {
            try
            {
                abyte0 = RSAESOAEPparams.a(abyte0);
                a = new OAEPParameterSpec(abyte0.c().d().c(), abyte0.d().d().c(), new MGF1ParameterSpec(AlgorithmIdentifier.a(abyte0.d().e()).d().c()), new javax.crypto.spec.PSource.PSpecified(ASN1OctetString.a(abyte0.e().e()).d()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
        }

        protected void engineInit(byte abyte0[], String s)
        {
            if (s.equalsIgnoreCase("X.509") || s.equalsIgnoreCase("ASN.1"))
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
            return "OAEP Parameters";
        }

        public OAEP()
        {
        }
    }

    public static class PSS extends AlgorithmParametersSpi
    {

        PSSParameterSpec a;

        protected final AlgorithmParameterSpec a(Class class1)
        {
            if (class1 == java/security/spec/PSSParameterSpec && a != null)
            {
                return a;
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
            }
        }

        protected byte[] engineGetEncoded()
        {
            PSSParameterSpec pssparameterspec = a;
            AlgorithmIdentifier algorithmidentifier = new AlgorithmIdentifier(DigestFactory.b(pssparameterspec.getDigestAlgorithm()), new DERNull());
            MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)pssparameterspec.getMGFParameters();
            return (new RSASSAPSSparams(algorithmidentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.H_, new AlgorithmIdentifier(DigestFactory.b(mgf1parameterspec.getDigestAlgorithm()), new DERNull())), new ASN1Integer(pssparameterspec.getSaltLength()), new ASN1Integer(pssparameterspec.getTrailerField()))).a("DER");
        }

        protected byte[] engineGetEncoded(String s)
        {
            if (s.equalsIgnoreCase("X.509") || s.equalsIgnoreCase("ASN.1"))
            {
                return engineGetEncoded();
            } else
            {
                return null;
            }
        }

        protected void engineInit(AlgorithmParameterSpec algorithmparameterspec)
        {
            if (!(algorithmparameterspec instanceof PSSParameterSpec))
            {
                throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
            } else
            {
                a = (PSSParameterSpec)algorithmparameterspec;
                return;
            }
        }

        protected void engineInit(byte abyte0[])
        {
            try
            {
                abyte0 = RSASSAPSSparams.a(abyte0);
                a = new PSSParameterSpec(abyte0.c().d().c(), abyte0.d().d().c(), new MGF1ParameterSpec(AlgorithmIdentifier.a(abyte0.d().e()).d().c()), abyte0.e().intValue(), abyte0.f().intValue());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IOException("Not a valid PSS Parameter encoding.");
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IOException("Not a valid PSS Parameter encoding.");
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
            return "PSS Parameters";
        }

        public PSS()
        {
        }
    }


    public AlgorithmParametersSpi()
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

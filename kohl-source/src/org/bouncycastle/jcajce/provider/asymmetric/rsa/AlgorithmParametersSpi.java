// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAESOAEPparams;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.provider.util.DigestFactory;

public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi
{
    public static class OAEP extends AlgorithmParametersSpi
    {

        OAEPParameterSpec currentSpec;

        protected byte[] engineGetEncoded()
        {
            Object obj = new AlgorithmIdentifier(DigestFactory.getOID(currentSpec.getDigestAlgorithm()), new DERNull());
            Object obj1 = (MGF1ParameterSpec)currentSpec.getMGFParameters();
            obj1 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, new AlgorithmIdentifier(DigestFactory.getOID(((MGF1ParameterSpec) (obj1)).getDigestAlgorithm()), new DERNull()));
            javax.crypto.spec.PSource.PSpecified pspecified = (javax.crypto.spec.PSource.PSpecified)currentSpec.getPSource();
            obj = new RSAESOAEPparams(((AlgorithmIdentifier) (obj)), ((AlgorithmIdentifier) (obj1)), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_pSpecified, new DEROctetString(pspecified.getValue())));
            byte abyte0[];
            try
            {
                abyte0 = ((RSAESOAEPparams) (obj)).getEncoded("DER");
            }
            catch (IOException ioexception)
            {
                throw new RuntimeException("Error encoding OAEPParameters");
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
            if (!(algorithmparameterspec instanceof OAEPParameterSpec))
            {
                throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
            } else
            {
                currentSpec = (OAEPParameterSpec)algorithmparameterspec;
                return;
            }
        }

        protected void engineInit(byte abyte0[])
            throws IOException
        {
            try
            {
                abyte0 = RSAESOAEPparams.getInstance(abyte0);
                currentSpec = new OAEPParameterSpec(abyte0.getHashAlgorithm().getAlgorithm().getId(), abyte0.getMaskGenAlgorithm().getAlgorithm().getId(), new MGF1ParameterSpec(AlgorithmIdentifier.getInstance(abyte0.getMaskGenAlgorithm().getParameters()).getAlgorithm().getId()), new javax.crypto.spec.PSource.PSpecified(ASN1OctetString.getInstance(abyte0.getPSourceAlgorithm().getParameters()).getOctets()));
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
            throws IOException
        {
            if (s.equalsIgnoreCase("X.509") || s.equalsIgnoreCase("ASN.1"))
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
            return "OAEP Parameters";
        }

        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
            throws InvalidParameterSpecException
        {
            if (class1 == javax/crypto/spec/OAEPParameterSpec && currentSpec != null)
            {
                return currentSpec;
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
            }
        }

        public OAEP()
        {
        }
    }

    public static class PSS extends AlgorithmParametersSpi
    {

        PSSParameterSpec currentSpec;

        protected byte[] engineGetEncoded()
            throws IOException
        {
            PSSParameterSpec pssparameterspec = currentSpec;
            AlgorithmIdentifier algorithmidentifier = new AlgorithmIdentifier(DigestFactory.getOID(pssparameterspec.getDigestAlgorithm()), new DERNull());
            MGF1ParameterSpec mgf1parameterspec = (MGF1ParameterSpec)pssparameterspec.getMGFParameters();
            return (new RSASSAPSSparams(algorithmidentifier, new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, new AlgorithmIdentifier(DigestFactory.getOID(mgf1parameterspec.getDigestAlgorithm()), new DERNull())), new ASN1Integer(pssparameterspec.getSaltLength()), new ASN1Integer(pssparameterspec.getTrailerField()))).getEncoded("DER");
        }

        protected byte[] engineGetEncoded(String s)
            throws IOException
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
            throws InvalidParameterSpecException
        {
            if (!(algorithmparameterspec instanceof PSSParameterSpec))
            {
                throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
            } else
            {
                currentSpec = (PSSParameterSpec)algorithmparameterspec;
                return;
            }
        }

        protected void engineInit(byte abyte0[])
            throws IOException
        {
            try
            {
                abyte0 = RSASSAPSSparams.getInstance(abyte0);
                currentSpec = new PSSParameterSpec(abyte0.getHashAlgorithm().getAlgorithm().getId(), abyte0.getMaskGenAlgorithm().getAlgorithm().getId(), new MGF1ParameterSpec(AlgorithmIdentifier.getInstance(abyte0.getMaskGenAlgorithm().getParameters()).getAlgorithm().getId()), abyte0.getSaltLength().intValue(), abyte0.getTrailerField().intValue());
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
            return "PSS Parameters";
        }

        protected AlgorithmParameterSpec localEngineGetParameterSpec(Class class1)
            throws InvalidParameterSpecException
        {
            if (class1 == java/security/spec/PSSParameterSpec && currentSpec != null)
            {
                return currentSpec;
            } else
            {
                throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
            }
        }

        public PSS()
        {
        }
    }


    public AlgorithmParametersSpi()
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

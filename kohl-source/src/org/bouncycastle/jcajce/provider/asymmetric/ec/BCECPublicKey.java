// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.ec:
//            EC5Util, ECUtil

public class BCECPublicKey
    implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder
{

    static final long serialVersionUID = 0x219f7a8aa3ea4824L;
    private String algorithm;
    private transient ProviderConfiguration configuration;
    private transient java.security.spec.ECParameterSpec ecSpec;
    private transient ECPoint q;
    private boolean withCompression;

    public BCECPublicKey(String s, ECPublicKeySpec ecpublickeyspec, ProviderConfiguration providerconfiguration)
    {
        algorithm = "EC";
        algorithm = s;
        ecSpec = ecpublickeyspec.getParams();
        q = EC5Util.convertPoint(ecSpec, ecpublickeyspec.getW(), false);
        configuration = providerconfiguration;
    }

    BCECPublicKey(String s, SubjectPublicKeyInfo subjectpublickeyinfo, ProviderConfiguration providerconfiguration)
    {
        algorithm = "EC";
        algorithm = s;
        configuration = providerconfiguration;
        populateFromPubKeyInfo(subjectpublickeyinfo);
    }

    public BCECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, java.security.spec.ECParameterSpec ecparameterspec, ProviderConfiguration providerconfiguration)
    {
        algorithm = "EC";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.getParameters();
        algorithm = s;
        q = ecpublickeyparameters.getQ();
        if (ecparameterspec == null)
        {
            ecSpec = createSpec(EC5Util.convertCurve(ecdomainparameters.getCurve(), ecdomainparameters.getSeed()), ecdomainparameters);
        } else
        {
            ecSpec = ecparameterspec;
        }
        configuration = providerconfiguration;
    }

    public BCECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, ProviderConfiguration providerconfiguration)
    {
        algorithm = "EC";
        algorithm = s;
        q = ecpublickeyparameters.getQ();
        ecSpec = null;
        configuration = providerconfiguration;
    }

    public BCECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, ECParameterSpec ecparameterspec, ProviderConfiguration providerconfiguration)
    {
        algorithm = "EC";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.getParameters();
        algorithm = s;
        q = ecpublickeyparameters.getQ();
        if (ecparameterspec == null)
        {
            ecSpec = createSpec(EC5Util.convertCurve(ecdomainparameters.getCurve(), ecdomainparameters.getSeed()), ecdomainparameters);
        } else
        {
            ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(ecparameterspec.getCurve(), ecparameterspec.getSeed()), ecparameterspec);
        }
        configuration = providerconfiguration;
    }

    public BCECPublicKey(String s, BCECPublicKey bcecpublickey)
    {
        algorithm = "EC";
        algorithm = s;
        q = bcecpublickey.q;
        ecSpec = bcecpublickey.ecSpec;
        withCompression = bcecpublickey.withCompression;
        configuration = bcecpublickey.configuration;
    }

    public BCECPublicKey(String s, org.bouncycastle.jce.spec.ECPublicKeySpec ecpublickeyspec, ProviderConfiguration providerconfiguration)
    {
        algorithm = "EC";
        algorithm = s;
        q = ecpublickeyspec.getQ();
        if (ecpublickeyspec.getParams() != null)
        {
            ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(ecpublickeyspec.getParams().getCurve(), ecpublickeyspec.getParams().getSeed()), ecpublickeyspec.getParams());
        } else
        {
            if (q.getCurve() == null)
            {
                q = providerconfiguration.getEcImplicitlyCa().getCurve().createPoint(q.getX().toBigInteger(), q.getY().toBigInteger(), false);
            }
            ecSpec = null;
        }
        configuration = providerconfiguration;
    }

    public BCECPublicKey(ECPublicKey ecpublickey, ProviderConfiguration providerconfiguration)
    {
        algorithm = "EC";
        algorithm = ecpublickey.getAlgorithm();
        ecSpec = ecpublickey.getParams();
        q = EC5Util.convertPoint(ecSpec, ecpublickey.getW(), false);
    }

    private java.security.spec.ECParameterSpec createSpec(EllipticCurve ellipticcurve, ECDomainParameters ecdomainparameters)
    {
        return new java.security.spec.ECParameterSpec(ellipticcurve, new java.security.spec.ECPoint(ecdomainparameters.getG().getX().toBigInteger(), ecdomainparameters.getG().getY().toBigInteger()), ecdomainparameters.getN(), ecdomainparameters.getH().intValue());
    }

    private void extractBytes(byte abyte0[], int i, BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (biginteger.length < 32)
        {
            byte abyte1[] = new byte[32];
            System.arraycopy(biginteger, 0, abyte1, abyte1.length - biginteger.length, biginteger.length);
            biginteger = abyte1;
        }
        for (int j = 0; j != 32; j++)
        {
            abyte0[i + j] = biginteger[biginteger.length - 1 - j];
        }

    }

    private void populateFromPubKeyInfo(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
label0:
        {
            Object obj = new X962Parameters((ASN1Primitive)subjectpublickeyinfo.getAlgorithm().getParameters());
            DEROctetString deroctetstring;
            byte abyte0[];
            if (((X962Parameters) (obj)).isNamedCurve())
            {
                ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)((X962Parameters) (obj)).getParameters();
                X9ECParameters x9ecparameters1 = ECUtil.getNamedCurveByOid(asn1objectidentifier);
                obj = x9ecparameters1.getCurve();
                EllipticCurve ellipticcurve = EC5Util.convertCurve(((ECCurve) (obj)), x9ecparameters1.getSeed());
                ecSpec = new ECNamedCurveSpec(ECUtil.getCurveName(asn1objectidentifier), ellipticcurve, new java.security.spec.ECPoint(x9ecparameters1.getG().getX().toBigInteger(), x9ecparameters1.getG().getY().toBigInteger()), x9ecparameters1.getN(), x9ecparameters1.getH());
            } else
            if (((X962Parameters) (obj)).isImplicitlyCA())
            {
                ecSpec = null;
                obj = configuration.getEcImplicitlyCa().getCurve();
            } else
            {
                X9ECParameters x9ecparameters = X9ECParameters.getInstance(((X962Parameters) (obj)).getParameters());
                obj = x9ecparameters.getCurve();
                ecSpec = new java.security.spec.ECParameterSpec(EC5Util.convertCurve(((ECCurve) (obj)), x9ecparameters.getSeed()), new java.security.spec.ECPoint(x9ecparameters.getG().getX().toBigInteger(), x9ecparameters.getG().getY().toBigInteger()), x9ecparameters.getN(), x9ecparameters.getH().intValue());
            }
            abyte0 = subjectpublickeyinfo.getPublicKeyData().getBytes();
            deroctetstring = new DEROctetString(abyte0);
            subjectpublickeyinfo = deroctetstring;
            if (abyte0[0] != 4)
            {
                break label0;
            }
            subjectpublickeyinfo = deroctetstring;
            if (abyte0[1] != abyte0.length - 2)
            {
                break label0;
            }
            if (abyte0[2] != 2)
            {
                subjectpublickeyinfo = deroctetstring;
                if (abyte0[2] != 3)
                {
                    break label0;
                }
            }
            subjectpublickeyinfo = deroctetstring;
            if ((new X9IntegerConverter()).getByteLength(((ECCurve) (obj))) >= abyte0.length - 3)
            {
                try
                {
                    subjectpublickeyinfo = (ASN1OctetString)ASN1Primitive.fromByteArray(abyte0);
                }
                // Misplaced declaration of an exception variable
                catch (SubjectPublicKeyInfo subjectpublickeyinfo)
                {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
        }
        q = (new X9ECPoint(((ECCurve) (obj)), subjectpublickeyinfo)).getPoint();
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        populateFromPubKeyInfo(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[])(byte[])objectinputstream.readObject())));
        configuration = BouncyCastleProvider.CONFIGURATION;
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(getEncoded());
    }

    public ECPoint engineGetQ()
    {
        return q;
    }

    ECParameterSpec engineGetSpec()
    {
        if (ecSpec != null)
        {
            return EC5Util.convertSpec(ecSpec, withCompression);
        } else
        {
            return configuration.getEcImplicitlyCa();
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof BCECPublicKey)
        {
            if (engineGetQ().equals(((BCECPublicKey) (obj = (BCECPublicKey)obj)).engineGetQ()) && engineGetSpec().equals(((BCECPublicKey) (obj)).engineGetSpec()))
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return algorithm;
    }

    public byte[] getEncoded()
    {
        Object obj;
        ASN1OctetString asn1octetstring;
        if (ecSpec instanceof ECNamedCurveSpec)
        {
            ASN1ObjectIdentifier asn1objectidentifier = ECUtil.getNamedCurveOid(((ECNamedCurveSpec)ecSpec).getName());
            obj = asn1objectidentifier;
            if (asn1objectidentifier == null)
            {
                obj = new ASN1ObjectIdentifier(((ECNamedCurveSpec)ecSpec).getName());
            }
            obj = new X962Parameters(((ASN1ObjectIdentifier) (obj)));
        } else
        if (ecSpec == null)
        {
            obj = new X962Parameters(DERNull.INSTANCE);
        } else
        {
            obj = EC5Util.convertCurve(ecSpec.getCurve());
            obj = new X962Parameters(new X9ECParameters(((ECCurve) (obj)), EC5Util.convertPoint(((ECCurve) (obj)), ecSpec.getGenerator(), withCompression), ecSpec.getOrder(), BigInteger.valueOf(ecSpec.getCofactor()), ecSpec.getCurve().getSeed()));
        }
        asn1octetstring = (ASN1OctetString)(new X9ECPoint(engineGetQ().getCurve().createPoint(getQ().getX().toBigInteger(), getQ().getY().toBigInteger(), withCompression))).toASN1Primitive();
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, ((org.bouncycastle.asn1.ASN1Encodable) (obj))), asn1octetstring.getOctets()));
    }

    public String getFormat()
    {
        return "X.509";
    }

    public ECParameterSpec getParameters()
    {
        if (ecSpec == null)
        {
            return null;
        } else
        {
            return EC5Util.convertSpec(ecSpec, withCompression);
        }
    }

    public java.security.spec.ECParameterSpec getParams()
    {
        return ecSpec;
    }

    public ECPoint getQ()
    {
        if (ecSpec == null)
        {
            if (q instanceof org.bouncycastle.math.ec.ECPoint.Fp)
            {
                return new org.bouncycastle.math.ec.ECPoint.Fp(null, q.getX(), q.getY());
            } else
            {
                return new org.bouncycastle.math.ec.ECPoint.F2m(null, q.getX(), q.getY());
            }
        } else
        {
            return q;
        }
    }

    public java.security.spec.ECPoint getW()
    {
        return new java.security.spec.ECPoint(q.getX().toBigInteger(), q.getY().toBigInteger());
    }

    public int hashCode()
    {
        return engineGetQ().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String s)
    {
        boolean flag;
        if (!"UNCOMPRESSED".equalsIgnoreCase(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        withCompression = flag;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("EC Public Key").append(s);
        stringbuffer.append("            X: ").append(q.getX().toBigInteger().toString(16)).append(s);
        stringbuffer.append("            Y: ").append(q.getY().toBigInteger().toString(16)).append(s);
        return stringbuffer.toString();
    }
}

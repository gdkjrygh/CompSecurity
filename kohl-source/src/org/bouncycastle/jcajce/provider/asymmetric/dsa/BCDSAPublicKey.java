// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;

public class BCDSAPublicKey
    implements DSAPublicKey
{

    private static final long serialVersionUID = 0x1851f637e242c807L;
    private transient DSAParams dsaSpec;
    private BigInteger y;

    BCDSAPublicKey(BigInteger biginteger, DSAParameterSpec dsaparameterspec)
    {
        y = biginteger;
        dsaSpec = dsaparameterspec;
    }

    BCDSAPublicKey(DSAPublicKey dsapublickey)
    {
        y = dsapublickey.getY();
        dsaSpec = dsapublickey.getParams();
    }

    BCDSAPublicKey(DSAPublicKeySpec dsapublickeyspec)
    {
        y = dsapublickeyspec.getY();
        dsaSpec = new DSAParameterSpec(dsapublickeyspec.getP(), dsapublickeyspec.getQ(), dsapublickeyspec.getG());
    }

    public BCDSAPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        ASN1Integer asn1integer;
        try
        {
            asn1integer = (ASN1Integer)subjectpublickeyinfo.parsePublicKey();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
        y = asn1integer.getValue();
        if (isNotNull(subjectpublickeyinfo.getAlgorithm().getParameters()))
        {
            subjectpublickeyinfo = DSAParameter.getInstance(subjectpublickeyinfo.getAlgorithm().getParameters());
            dsaSpec = new DSAParameterSpec(subjectpublickeyinfo.getP(), subjectpublickeyinfo.getQ(), subjectpublickeyinfo.getG());
        }
    }

    BCDSAPublicKey(DSAPublicKeyParameters dsapublickeyparameters)
    {
        y = dsapublickeyparameters.getY();
        dsaSpec = new DSAParameterSpec(dsapublickeyparameters.getParameters().getP(), dsapublickeyparameters.getParameters().getQ(), dsapublickeyparameters.getParameters().getG());
    }

    private boolean isNotNull(ASN1Encodable asn1encodable)
    {
        return asn1encodable != null && !DERNull.INSTANCE.equals(asn1encodable.toASN1Primitive());
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        dsaSpec = new DSAParameterSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(dsaSpec.getP());
        objectoutputstream.writeObject(dsaSpec.getQ());
        objectoutputstream.writeObject(dsaSpec.getG());
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAPublicKey)
        {
            if (getY().equals(((DSAPublicKey) (obj = (DSAPublicKey)obj)).getY()) && getParams().getG().equals(((DSAPublicKey) (obj)).getParams().getG()) && getParams().getP().equals(((DSAPublicKey) (obj)).getParams().getP()) && getParams().getQ().equals(((DSAPublicKey) (obj)).getParams().getQ()))
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "DSA";
    }

    public byte[] getEncoded()
    {
        if (dsaSpec == null)
        {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa), new ASN1Integer(y));
        } else
        {
            return KeyUtil.getEncodedSubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, (new DSAParameter(dsaSpec.getP(), dsaSpec.getQ(), dsaSpec.getG())).toASN1Primitive()), new ASN1Integer(y));
        }
    }

    public String getFormat()
    {
        return "X.509";
    }

    public DSAParams getParams()
    {
        return dsaSpec;
    }

    public BigInteger getY()
    {
        return y;
    }

    public int hashCode()
    {
        return getY().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getQ().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("DSA Public Key").append(s);
        stringbuffer.append("            y: ").append(getY().toString(16)).append(s);
        return stringbuffer.toString();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;

public class JDKDSAPublicKey
    implements DSAPublicKey
{

    private static final long serialVersionUID = 0x1851f637e242c807L;
    private DSAParams dsaSpec;
    private BigInteger y;

    JDKDSAPublicKey(BigInteger biginteger, DSAParameterSpec dsaparameterspec)
    {
        y = biginteger;
        dsaSpec = dsaparameterspec;
    }

    JDKDSAPublicKey(DSAPublicKey dsapublickey)
    {
        y = dsapublickey.getY();
        dsaSpec = dsapublickey.getParams();
    }

    JDKDSAPublicKey(DSAPublicKeySpec dsapublickeyspec)
    {
        y = dsapublickeyspec.getY();
        dsaSpec = new DSAParameterSpec(dsapublickeyspec.getP(), dsapublickeyspec.getQ(), dsapublickeyspec.getG());
    }

    JDKDSAPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        DERInteger derinteger;
        try
        {
            derinteger = (DERInteger)subjectpublickeyinfo.parsePublicKey();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
        y = derinteger.getValue();
        if (isNotNull(subjectpublickeyinfo.getAlgorithmId().getParameters()))
        {
            subjectpublickeyinfo = new DSAParameter((ASN1Sequence)subjectpublickeyinfo.getAlgorithmId().getParameters());
            dsaSpec = new DSAParameterSpec(subjectpublickeyinfo.getP(), subjectpublickeyinfo.getQ(), subjectpublickeyinfo.getG());
        }
    }

    JDKDSAPublicKey(DSAPublicKeyParameters dsapublickeyparameters)
    {
        y = dsapublickeyparameters.getY();
        dsaSpec = new DSAParameterSpec(dsapublickeyparameters.getParameters().getP(), dsapublickeyparameters.getParameters().getQ(), dsapublickeyparameters.getParameters().getG());
    }

    private boolean isNotNull(ASN1Encodable asn1encodable)
    {
        return asn1encodable != null && !DERNull.INSTANCE.equals(asn1encodable);
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        y = (BigInteger)objectinputstream.readObject();
        dsaSpec = new DSAParameterSpec((BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject(), (BigInteger)objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.writeObject(y);
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
        byte abyte0[];
        try
        {
            if (dsaSpec == null)
            {
                return (new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa), new DERInteger(y))).getEncoded("DER");
            }
            abyte0 = (new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, new DSAParameter(dsaSpec.getP(), dsaSpec.getQ(), dsaSpec.getG())), new DERInteger(y))).getEncoded("DER");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return abyte0;
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

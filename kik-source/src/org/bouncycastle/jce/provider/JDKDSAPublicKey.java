// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
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

    private BigInteger a;
    private DSAParams b;

    JDKDSAPublicKey(DSAPublicKey dsapublickey)
    {
        a = dsapublickey.getY();
        b = dsapublickey.getParams();
    }

    JDKDSAPublicKey(DSAPublicKeySpec dsapublickeyspec)
    {
        a = dsapublickeyspec.getY();
        b = new DSAParameterSpec(dsapublickeyspec.getP(), dsapublickeyspec.getQ(), dsapublickeyspec.getG());
    }

    JDKDSAPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        Object obj;
        boolean flag;
        try
        {
            obj = (DERInteger)subjectpublickeyinfo.f();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
        a = ((DERInteger) (obj)).e();
        obj = subjectpublickeyinfo.e().g();
        if (obj != null && !DERNull.b.equals(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            subjectpublickeyinfo = new DSAParameter((ASN1Sequence)subjectpublickeyinfo.e().g());
            b = new DSAParameterSpec(subjectpublickeyinfo.e(), subjectpublickeyinfo.f(), subjectpublickeyinfo.g());
        }
    }

    JDKDSAPublicKey(DSAPublicKeyParameters dsapublickeyparameters)
    {
        a = dsapublickeyparameters.getY();
        b = new DSAParameterSpec(dsapublickeyparameters.getParameters().getP(), dsapublickeyparameters.getParameters().getQ(), dsapublickeyparameters.getParameters().getG());
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
        if (b == null)
        {
            return (new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.U), new DERInteger(a))).b();
        } else
        {
            return (new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.U, (new DSAParameter(b.getP(), b.getQ(), b.getG())).c()), new DERInteger(a))).b();
        }
    }

    public String getFormat()
    {
        return "X.509";
    }

    public DSAParams getParams()
    {
        return b;
    }

    public BigInteger getY()
    {
        return a;
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

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPublicKeySpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;

public class BCDSAPublicKey
    implements DSAPublicKey
{

    private BigInteger a;
    private transient DSAParams b;

    BCDSAPublicKey(DSAPublicKey dsapublickey)
    {
        a = dsapublickey.getY();
        b = dsapublickey.getParams();
    }

    BCDSAPublicKey(DSAPublicKeySpec dsapublickeyspec)
    {
        a = dsapublickeyspec.getY();
        b = new DSAParameterSpec(dsapublickeyspec.getP(), dsapublickeyspec.getQ(), dsapublickeyspec.getG());
    }

    public BCDSAPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        Object obj;
        boolean flag;
        try
        {
            obj = (ASN1Integer)subjectpublickeyinfo.e();
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in DSA public key");
        }
        a = ((ASN1Integer) (obj)).c();
        obj = subjectpublickeyinfo.c().e();
        if (obj != null && !DERNull.a.equals(((ASN1Encodable) (obj)).a()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            subjectpublickeyinfo = DSAParameter.a(subjectpublickeyinfo.c().e());
            b = new DSAParameterSpec(subjectpublickeyinfo.c(), subjectpublickeyinfo.d(), subjectpublickeyinfo.e());
        }
    }

    BCDSAPublicKey(DSAPublicKeyParameters dsapublickeyparameters)
    {
        a = dsapublickeyparameters.c();
        b = new DSAParameterSpec(dsapublickeyparameters.b().a(), dsapublickeyparameters.b().b(), dsapublickeyparameters.b().c());
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
            return KeyUtil.a(new AlgorithmIdentifier(X9ObjectIdentifiers.U), new ASN1Integer(a));
        } else
        {
            return KeyUtil.a(new AlgorithmIdentifier(X9ObjectIdentifiers.U, (new DSAParameter(b.getP(), b.getQ(), b.getG())).a()), new ASN1Integer(a));
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

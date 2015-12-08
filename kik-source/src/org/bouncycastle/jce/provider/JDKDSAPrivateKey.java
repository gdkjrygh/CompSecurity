// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

// Referenced classes of package org.bouncycastle.jce.provider:
//            e

public class JDKDSAPrivateKey
    implements DSAPrivateKey, PKCS12BagAttributeCarrier
{

    BigInteger a;
    DSAParams b;
    private e c;

    protected JDKDSAPrivateKey()
    {
        c = new e();
    }

    JDKDSAPrivateKey(DSAPrivateKey dsaprivatekey)
    {
        c = new e();
        a = dsaprivatekey.getX();
        b = dsaprivatekey.getParams();
    }

    JDKDSAPrivateKey(DSAPrivateKeySpec dsaprivatekeyspec)
    {
        c = new e();
        a = dsaprivatekeyspec.getX();
        b = new DSAParameterSpec(dsaprivatekeyspec.getP(), dsaprivatekeyspec.getQ(), dsaprivatekeyspec.getG());
    }

    JDKDSAPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        c = new e();
        DSAParameter dsaparameter = new DSAParameter((ASN1Sequence)privatekeyinfo.e().g());
        a = ((DERInteger)privatekeyinfo.f()).e();
        b = new DSAParameterSpec(dsaparameter.e(), dsaparameter.f(), dsaparameter.g());
    }

    JDKDSAPrivateKey(DSAPrivateKeyParameters dsaprivatekeyparameters)
    {
        c = new e();
        a = dsaprivatekeyparameters.getX();
        b = new DSAParameterSpec(dsaprivatekeyparameters.getParameters().getP(), dsaprivatekeyparameters.getParameters().getQ(), dsaprivatekeyparameters.getParameters().getG());
    }

    public final DEREncodable a(DERObjectIdentifier derobjectidentifier)
    {
        return c.a(derobjectidentifier);
    }

    public final void a(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        c.a(derobjectidentifier, derencodable);
    }

    public final Enumeration c()
    {
        return c.c();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DSAPrivateKey)
        {
            if (getX().equals(((DSAPrivateKey) (obj = (DSAPrivateKey)obj)).getX()) && getParams().getG().equals(((DSAPrivateKey) (obj)).getParams().getG()) && getParams().getP().equals(((DSAPrivateKey) (obj)).getParams().getP()) && getParams().getQ().equals(((DSAPrivateKey) (obj)).getParams().getQ()))
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
        return (new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.U, (new DSAParameter(b.getP(), b.getQ(), b.getG())).c()), new DERInteger(getX()))).b();
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public DSAParams getParams()
    {
        return b;
    }

    public BigInteger getX()
    {
        return a;
    }

    public int hashCode()
    {
        return getX().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getQ().hashCode();
    }
}

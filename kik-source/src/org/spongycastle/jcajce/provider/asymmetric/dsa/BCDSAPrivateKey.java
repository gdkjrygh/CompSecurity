// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dsa;

import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.spec.DSAParameterSpec;
import java.security.spec.DSAPrivateKeySpec;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class BCDSAPrivateKey
    implements DSAPrivateKey, PKCS12BagAttributeCarrier
{

    private BigInteger a;
    private transient DSAParams b;
    private transient PKCS12BagAttributeCarrierImpl c;

    protected BCDSAPrivateKey()
    {
        c = new PKCS12BagAttributeCarrierImpl();
    }

    BCDSAPrivateKey(DSAPrivateKey dsaprivatekey)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = dsaprivatekey.getX();
        b = dsaprivatekey.getParams();
    }

    BCDSAPrivateKey(DSAPrivateKeySpec dsaprivatekeyspec)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = dsaprivatekeyspec.getX();
        b = new DSAParameterSpec(dsaprivatekeyspec.getP(), dsaprivatekeyspec.getQ(), dsaprivatekeyspec.getG());
    }

    public BCDSAPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        DSAParameter dsaparameter = DSAParameter.a(privatekeyinfo.c().e());
        a = ((ASN1Integer)privatekeyinfo.e()).c();
        b = new DSAParameterSpec(dsaparameter.c(), dsaparameter.d(), dsaparameter.e());
    }

    BCDSAPrivateKey(DSAPrivateKeyParameters dsaprivatekeyparameters)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = dsaprivatekeyparameters.c();
        b = new DSAParameterSpec(dsaprivatekeyparameters.b().a(), dsaprivatekeyparameters.b().b(), dsaprivatekeyparameters.b().c());
    }

    public final Enumeration a()
    {
        return c.a();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return c.a(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        c.a(asn1objectidentifier, asn1encodable);
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
        return KeyUtil.b(new AlgorithmIdentifier(X9ObjectIdentifiers.U, (new DSAParameter(b.getP(), b.getQ(), b.getG())).a()), new ASN1Integer(getX()));
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

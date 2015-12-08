// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dh;

import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.pkcs.DHParameter;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x9.DHDomainParameters;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class BCDHPrivateKey
    implements DHPrivateKey, PKCS12BagAttributeCarrier
{

    private BigInteger a;
    private transient DHParameterSpec b;
    private transient PrivateKeyInfo c;
    private transient PKCS12BagAttributeCarrierImpl d;

    protected BCDHPrivateKey()
    {
        d = new PKCS12BagAttributeCarrierImpl();
    }

    BCDHPrivateKey(DHPrivateKey dhprivatekey)
    {
        d = new PKCS12BagAttributeCarrierImpl();
        a = dhprivatekey.getX();
        b = dhprivatekey.getParams();
    }

    BCDHPrivateKey(DHPrivateKeySpec dhprivatekeyspec)
    {
        d = new PKCS12BagAttributeCarrierImpl();
        a = dhprivatekeyspec.getX();
        b = new DHParameterSpec(dhprivatekeyspec.getP(), dhprivatekeyspec.getG());
    }

    public BCDHPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        d = new PKCS12BagAttributeCarrierImpl();
        ASN1Sequence asn1sequence = ASN1Sequence.a(privatekeyinfo.c().e());
        ASN1Integer asn1integer = (ASN1Integer)privatekeyinfo.e();
        ASN1ObjectIdentifier asn1objectidentifier = privatekeyinfo.c().d();
        c = privatekeyinfo;
        a = asn1integer.c();
        if (asn1objectidentifier.equals(PKCSObjectIdentifiers.q))
        {
            privatekeyinfo = DHParameter.a(asn1sequence);
            if (privatekeyinfo.e() != null)
            {
                b = new DHParameterSpec(privatekeyinfo.c(), privatekeyinfo.d(), privatekeyinfo.e().intValue());
                return;
            } else
            {
                b = new DHParameterSpec(privatekeyinfo.c(), privatekeyinfo.d());
                return;
            }
        }
        if (asn1objectidentifier.equals(X9ObjectIdentifiers.ab))
        {
            privatekeyinfo = DHDomainParameters.a(asn1sequence);
            b = new DHParameterSpec(privatekeyinfo.c().c(), privatekeyinfo.d().c());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unknown algorithm type: ")).append(asn1objectidentifier).toString());
        }
    }

    BCDHPrivateKey(DHPrivateKeyParameters dhprivatekeyparameters)
    {
        d = new PKCS12BagAttributeCarrierImpl();
        a = dhprivatekeyparameters.c();
        b = new DHParameterSpec(dhprivatekeyparameters.b().a(), dhprivatekeyparameters.b().b(), dhprivatekeyparameters.b().e());
    }

    public final Enumeration a()
    {
        return d.a();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return d.a(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        d.a(asn1objectidentifier, asn1encodable);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DHPrivateKey)
        {
            if (getX().equals(((DHPrivateKey) (obj = (DHPrivateKey)obj)).getX()) && getParams().getG().equals(((DHPrivateKey) (obj)).getParams().getG()) && getParams().getP().equals(((DHPrivateKey) (obj)).getParams().getP()) && getParams().getL() == ((DHPrivateKey) (obj)).getParams().getL())
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "DH";
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            if (c != null)
            {
                return c.a("DER");
            }
            abyte0 = (new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.q, (new DHParameter(b.getP(), b.getG(), b.getL())).a()), new ASN1Integer(getX()))).a("DER");
        }
        catch (Exception exception)
        {
            return null;
        }
        return abyte0;
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public DHParameterSpec getParams()
    {
        return b;
    }

    public BigInteger getX()
    {
        return a;
    }

    public int hashCode()
    {
        return getX().hashCode() ^ getParams().getG().hashCode() ^ getParams().getP().hashCode() ^ getParams().getL();
    }
}

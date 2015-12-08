// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.oiw.ElGamalParameter;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.interfaces.ElGamalPrivateKey;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.jce.spec.ElGamalParameterSpec;
import org.spongycastle.jce.spec.ElGamalPrivateKeySpec;

public class BCElGamalPrivateKey
    implements DHPrivateKey, ElGamalPrivateKey, PKCS12BagAttributeCarrier
{

    private BigInteger a;
    private transient ElGamalParameterSpec b;
    private transient PKCS12BagAttributeCarrierImpl c;

    protected BCElGamalPrivateKey()
    {
        c = new PKCS12BagAttributeCarrierImpl();
    }

    BCElGamalPrivateKey(DHPrivateKey dhprivatekey)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = dhprivatekey.getX();
        b = new ElGamalParameterSpec(dhprivatekey.getParams().getP(), dhprivatekey.getParams().getG());
    }

    BCElGamalPrivateKey(DHPrivateKeySpec dhprivatekeyspec)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = dhprivatekeyspec.getX();
        b = new ElGamalParameterSpec(dhprivatekeyspec.getP(), dhprivatekeyspec.getG());
    }

    BCElGamalPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        ElGamalParameter elgamalparameter = new ElGamalParameter((ASN1Sequence)privatekeyinfo.d().e());
        a = ASN1Integer.a(privatekeyinfo.e()).c();
        b = new ElGamalParameterSpec(elgamalparameter.c(), elgamalparameter.d());
    }

    BCElGamalPrivateKey(ElGamalPrivateKeyParameters elgamalprivatekeyparameters)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = elgamalprivatekeyparameters.c();
        b = new ElGamalParameterSpec(elgamalprivatekeyparameters.b().a(), elgamalprivatekeyparameters.b().b());
    }

    BCElGamalPrivateKey(ElGamalPrivateKey elgamalprivatekey)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = elgamalprivatekey.getX();
        b = elgamalprivatekey.b();
    }

    BCElGamalPrivateKey(ElGamalPrivateKeySpec elgamalprivatekeyspec)
    {
        c = new PKCS12BagAttributeCarrierImpl();
        a = elgamalprivatekeyspec.b();
        b = new ElGamalParameterSpec(elgamalprivatekeyspec.a().a(), elgamalprivatekeyspec.a().b());
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

    public final ElGamalParameterSpec b()
    {
        return b;
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
        return "ElGamal";
    }

    public byte[] getEncoded()
    {
        byte abyte0[];
        try
        {
            abyte0 = (new PrivateKeyInfo(new AlgorithmIdentifier(OIWObjectIdentifiers.l, new ElGamalParameter(b.a(), b.b())), new DERInteger(getX()))).a("DER");
        }
        catch (IOException ioexception)
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
        return new DHParameterSpec(b.a(), b.b());
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

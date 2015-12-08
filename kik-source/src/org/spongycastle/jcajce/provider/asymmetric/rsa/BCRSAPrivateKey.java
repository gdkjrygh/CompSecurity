// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class BCRSAPrivateKey
    implements RSAPrivateKey, PKCS12BagAttributeCarrier
{

    private static BigInteger c = BigInteger.valueOf(0L);
    protected BigInteger a;
    protected BigInteger b;
    private transient PKCS12BagAttributeCarrierImpl d;

    protected BCRSAPrivateKey()
    {
        d = new PKCS12BagAttributeCarrierImpl();
    }

    BCRSAPrivateKey(RSAPrivateKey rsaprivatekey)
    {
        d = new PKCS12BagAttributeCarrierImpl();
        a = rsaprivatekey.getModulus();
        b = rsaprivatekey.getPrivateExponent();
    }

    BCRSAPrivateKey(RSAPrivateKeySpec rsaprivatekeyspec)
    {
        d = new PKCS12BagAttributeCarrierImpl();
        a = rsaprivatekeyspec.getModulus();
        b = rsaprivatekeyspec.getPrivateExponent();
    }

    BCRSAPrivateKey(RSAKeyParameters rsakeyparameters)
    {
        d = new PKCS12BagAttributeCarrierImpl();
        a = rsakeyparameters.b();
        b = rsakeyparameters.c();
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
        if (obj instanceof RSAPrivateKey)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (RSAPrivateKey)obj;
            if (getModulus().equals(((RSAPrivateKey) (obj)).getModulus()) && getPrivateExponent().equals(((RSAPrivateKey) (obj)).getPrivateExponent()))
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return "RSA";
    }

    public byte[] getEncoded()
    {
        return KeyUtil.b(new AlgorithmIdentifier(PKCSObjectIdentifiers.D_, new DERNull()), new org.spongycastle.asn1.pkcs.RSAPrivateKey(getModulus(), c, getPrivateExponent(), c, c, c, c, c));
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public BigInteger getModulus()
    {
        return a;
    }

    public BigInteger getPrivateExponent()
    {
        return b;
    }

    public int hashCode()
    {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

}

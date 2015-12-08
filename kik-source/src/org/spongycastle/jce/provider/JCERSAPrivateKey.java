// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;

public class JCERSAPrivateKey
    implements RSAPrivateKey, PKCS12BagAttributeCarrier
{

    private static BigInteger c = BigInteger.valueOf(0L);
    protected BigInteger a;
    protected BigInteger b;
    private PKCS12BagAttributeCarrierImpl d;

    protected JCERSAPrivateKey()
    {
        d = new PKCS12BagAttributeCarrierImpl();
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

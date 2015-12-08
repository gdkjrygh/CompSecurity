// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

// Referenced classes of package org.bouncycastle.jce.provider:
//            e

public class JCERSAPrivateKey
    implements RSAPrivateKey, PKCS12BagAttributeCarrier
{

    private static BigInteger c = BigInteger.valueOf(0L);
    protected BigInteger a;
    protected BigInteger b;
    private e d;

    protected JCERSAPrivateKey()
    {
        d = new e();
    }

    JCERSAPrivateKey(RSAPrivateKey rsaprivatekey)
    {
        d = new e();
        a = rsaprivatekey.getModulus();
        b = rsaprivatekey.getPrivateExponent();
    }

    JCERSAPrivateKey(RSAPrivateKeySpec rsaprivatekeyspec)
    {
        d = new e();
        a = rsaprivatekeyspec.getModulus();
        b = rsaprivatekeyspec.getPrivateExponent();
    }

    JCERSAPrivateKey(RSAKeyParameters rsakeyparameters)
    {
        d = new e();
        a = rsakeyparameters.getModulus();
        b = rsakeyparameters.getExponent();
    }

    public final DEREncodable a(DERObjectIdentifier derobjectidentifier)
    {
        return d.a(derobjectidentifier);
    }

    public final void a(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        d.a(derobjectidentifier, derencodable);
    }

    public final Enumeration c()
    {
        return d.c();
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
        return (new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.h_, new DERNull()), (new RSAPrivateKeyStructure(getModulus(), c, getPrivateExponent(), c, c, c, c, c)).c())).b();
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

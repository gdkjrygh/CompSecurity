// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;

public class BCRSAPublicKey
    implements RSAPublicKey
{

    private BigInteger a;
    private BigInteger b;

    BCRSAPublicKey(RSAPublicKey rsapublickey)
    {
        a = rsapublickey.getModulus();
        b = rsapublickey.getPublicExponent();
    }

    BCRSAPublicKey(RSAPublicKeySpec rsapublickeyspec)
    {
        a = rsapublickeyspec.getModulus();
        b = rsapublickeyspec.getPublicExponent();
    }

    BCRSAPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        try
        {
            subjectpublickeyinfo = org.spongycastle.asn1.pkcs.RSAPublicKey.a(subjectpublickeyinfo.e());
            a = subjectpublickeyinfo.c();
            b = subjectpublickeyinfo.d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SubjectPublicKeyInfo subjectpublickeyinfo)
        {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    BCRSAPublicKey(RSAKeyParameters rsakeyparameters)
    {
        a = rsakeyparameters.b();
        b = rsakeyparameters.c();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof RSAPublicKey))
            {
                return false;
            }
            obj = (RSAPublicKey)obj;
            if (!getModulus().equals(((RSAPublicKey) (obj)).getModulus()) || !getPublicExponent().equals(((RSAPublicKey) (obj)).getPublicExponent()))
            {
                return false;
            }
        }
        return true;
    }

    public String getAlgorithm()
    {
        return "RSA";
    }

    public byte[] getEncoded()
    {
        return KeyUtil.a(new AlgorithmIdentifier(PKCSObjectIdentifiers.D_, new DERNull()), new org.spongycastle.asn1.pkcs.RSAPublicKey(getModulus(), getPublicExponent()));
    }

    public String getFormat()
    {
        return "X.509";
    }

    public BigInteger getModulus()
    {
        return a;
    }

    public BigInteger getPublicExponent()
    {
        return b;
    }

    public int hashCode()
    {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("RSA Public Key").append(s);
        stringbuffer.append("            modulus: ").append(getModulus().toString(16)).append(s);
        stringbuffer.append("    public exponent: ").append(getPublicExponent().toString(16)).append(s);
        return stringbuffer.toString();
    }
}

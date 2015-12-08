// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCERSAPrivateKey

public class JCERSAPrivateCrtKey extends JCERSAPrivateKey
    implements RSAPrivateCrtKey
{

    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;

    JCERSAPrivateCrtKey(RSAPrivateCrtKey rsaprivatecrtkey)
    {
        a = rsaprivatecrtkey.getModulus();
        c = rsaprivatecrtkey.getPublicExponent();
        b = rsaprivatecrtkey.getPrivateExponent();
        d = rsaprivatecrtkey.getPrimeP();
        e = rsaprivatecrtkey.getPrimeQ();
        f = rsaprivatecrtkey.getPrimeExponentP();
        g = rsaprivatecrtkey.getPrimeExponentQ();
        h = rsaprivatecrtkey.getCrtCoefficient();
    }

    JCERSAPrivateCrtKey(RSAPrivateCrtKeySpec rsaprivatecrtkeyspec)
    {
        a = rsaprivatecrtkeyspec.getModulus();
        c = rsaprivatecrtkeyspec.getPublicExponent();
        b = rsaprivatecrtkeyspec.getPrivateExponent();
        d = rsaprivatecrtkeyspec.getPrimeP();
        e = rsaprivatecrtkeyspec.getPrimeQ();
        f = rsaprivatecrtkeyspec.getPrimeExponentP();
        g = rsaprivatecrtkeyspec.getPrimeExponentQ();
        h = rsaprivatecrtkeyspec.getCrtCoefficient();
    }

    JCERSAPrivateCrtKey(PrivateKeyInfo privatekeyinfo)
    {
        this(new RSAPrivateKeyStructure((ASN1Sequence)privatekeyinfo.f()));
    }

    JCERSAPrivateCrtKey(RSAPrivateKeyStructure rsaprivatekeystructure)
    {
        a = rsaprivatekeystructure.e();
        c = rsaprivatekeystructure.f();
        b = rsaprivatekeystructure.g();
        d = rsaprivatekeystructure.h();
        e = rsaprivatekeystructure.i();
        f = rsaprivatekeystructure.j();
        g = rsaprivatekeystructure.k();
        h = rsaprivatekeystructure.l();
    }

    JCERSAPrivateCrtKey(RSAPrivateCrtKeyParameters rsaprivatecrtkeyparameters)
    {
        super(rsaprivatecrtkeyparameters);
        c = rsaprivatecrtkeyparameters.getPublicExponent();
        d = rsaprivatecrtkeyparameters.getP();
        e = rsaprivatecrtkeyparameters.getQ();
        f = rsaprivatecrtkeyparameters.getDP();
        g = rsaprivatecrtkeyparameters.getDQ();
        h = rsaprivatecrtkeyparameters.getQInv();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof RSAPrivateCrtKey))
            {
                return false;
            }
            obj = (RSAPrivateCrtKey)obj;
            if (!getModulus().equals(((RSAPrivateCrtKey) (obj)).getModulus()) || !getPublicExponent().equals(((RSAPrivateCrtKey) (obj)).getPublicExponent()) || !getPrivateExponent().equals(((RSAPrivateCrtKey) (obj)).getPrivateExponent()) || !getPrimeP().equals(((RSAPrivateCrtKey) (obj)).getPrimeP()) || !getPrimeQ().equals(((RSAPrivateCrtKey) (obj)).getPrimeQ()) || !getPrimeExponentP().equals(((RSAPrivateCrtKey) (obj)).getPrimeExponentP()) || !getPrimeExponentQ().equals(((RSAPrivateCrtKey) (obj)).getPrimeExponentQ()) || !getCrtCoefficient().equals(((RSAPrivateCrtKey) (obj)).getCrtCoefficient()))
            {
                return false;
            }
        }
        return true;
    }

    public BigInteger getCrtCoefficient()
    {
        return h;
    }

    public byte[] getEncoded()
    {
        return (new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.h_, new DERNull()), (new RSAPrivateKeyStructure(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient())).c())).b();
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public BigInteger getPrimeExponentP()
    {
        return f;
    }

    public BigInteger getPrimeExponentQ()
    {
        return g;
    }

    public BigInteger getPrimeP()
    {
        return d;
    }

    public BigInteger getPrimeQ()
    {
        return e;
    }

    public BigInteger getPublicExponent()
    {
        return c;
    }

    public int hashCode()
    {
        return getModulus().hashCode() ^ getPublicExponent().hashCode() ^ getPrivateExponent().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("RSA Private CRT Key").append(s);
        stringbuffer.append("            modulus: ").append(getModulus().toString(16)).append(s);
        stringbuffer.append("    public exponent: ").append(getPublicExponent().toString(16)).append(s);
        stringbuffer.append("   private exponent: ").append(getPrivateExponent().toString(16)).append(s);
        stringbuffer.append("             primeP: ").append(getPrimeP().toString(16)).append(s);
        stringbuffer.append("             primeQ: ").append(getPrimeQ().toString(16)).append(s);
        stringbuffer.append("     primeExponentP: ").append(getPrimeExponentP().toString(16)).append(s);
        stringbuffer.append("     primeExponentQ: ").append(getPrimeExponentQ().toString(16)).append(s);
        stringbuffer.append("     crtCoefficient: ").append(getCrtCoefficient().toString(16)).append(s);
        return stringbuffer.toString();
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.rsa;

import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.RSAPrivateKey;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.rsa:
//            BCRSAPrivateKey

public class BCRSAPrivateCrtKey extends BCRSAPrivateKey
    implements RSAPrivateCrtKey
{

    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;

    BCRSAPrivateCrtKey(RSAPrivateCrtKey rsaprivatecrtkey)
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

    BCRSAPrivateCrtKey(RSAPrivateCrtKeySpec rsaprivatecrtkeyspec)
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

    BCRSAPrivateCrtKey(PrivateKeyInfo privatekeyinfo)
    {
        this(RSAPrivateKey.a(privatekeyinfo.e()));
    }

    BCRSAPrivateCrtKey(RSAPrivateKey rsaprivatekey)
    {
        a = rsaprivatekey.c();
        c = rsaprivatekey.d();
        b = rsaprivatekey.e();
        d = rsaprivatekey.f();
        e = rsaprivatekey.g();
        f = rsaprivatekey.h();
        g = rsaprivatekey.i();
        h = rsaprivatekey.j();
    }

    BCRSAPrivateCrtKey(RSAPrivateCrtKeyParameters rsaprivatecrtkeyparameters)
    {
        super(rsaprivatecrtkeyparameters);
        c = rsaprivatecrtkeyparameters.d();
        d = rsaprivatecrtkeyparameters.e();
        e = rsaprivatecrtkeyparameters.f();
        f = rsaprivatecrtkeyparameters.g();
        g = rsaprivatecrtkeyparameters.h();
        h = rsaprivatecrtkeyparameters.i();
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
        return KeyUtil.b(new AlgorithmIdentifier(PKCSObjectIdentifiers.D_, new DERNull()), new RSAPrivateKey(getModulus(), getPublicExponent(), getPrivateExponent(), getPrimeP(), getPrimeQ(), getPrimeExponentP(), getPrimeExponentQ(), getCrtCoefficient()));
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

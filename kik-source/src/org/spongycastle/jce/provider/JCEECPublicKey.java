// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.EllipticCurve;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.spongycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X962Parameters;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECPoint;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.spongycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.interfaces.ECPointEncoder;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.jce.spec.ECParameterSpec;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;

// Referenced classes of package org.spongycastle.jce.provider:
//            BouncyCastleProvider

public class JCEECPublicKey
    implements ECPublicKey, ECPointEncoder, org.spongycastle.jce.interfaces.ECPublicKey
{

    private String a;
    private ECPoint b;
    private java.security.spec.ECParameterSpec c;
    private boolean d;
    private GOST3410PublicKeyAlgParameters e;

    private static void a(byte abyte0[], int i, BigInteger biginteger)
    {
        biginteger = biginteger.toByteArray();
        if (biginteger.length < 32)
        {
            byte abyte1[] = new byte[32];
            System.arraycopy(biginteger, 0, abyte1, 32 - biginteger.length, biginteger.length);
            biginteger = abyte1;
        }
        for (int j = 0; j != 32; j++)
        {
            abyte0[i + j] = biginteger[biginteger.length - 1 - j];
        }

    }

    private ECParameterSpec c()
    {
        if (c != null)
        {
            return EC5Util.a(c, d);
        } else
        {
            return BouncyCastleProvider.b.a();
        }
    }

    public final ECPoint a()
    {
        if (c == null)
        {
            if (b instanceof org.spongycastle.math.ec.ECPoint.Fp)
            {
                return new org.spongycastle.math.ec.ECPoint.Fp(null, b.b(), b.c());
            } else
            {
                return new org.spongycastle.math.ec.ECPoint.F2m(null, b.b(), b.c());
            }
        } else
        {
            return b;
        }
    }

    public final ECParameterSpec b()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return EC5Util.a(c, d);
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof JCEECPublicKey)
        {
            if (b.equals(((JCEECPublicKey) (obj = (JCEECPublicKey)obj)).b) && c().equals(((JCEECPublicKey) (obj)).c()))
            {
                return true;
            }
        }
        return false;
    }

    public String getAlgorithm()
    {
        return a;
    }

    public byte[] getEncoded()
    {
        if (!a.equals("ECGOST3410")) goto _L2; else goto _L1
_L1:
        Object obj;
        BigInteger biginteger;
        BigInteger biginteger1;
        byte abyte0[];
        if (e != null)
        {
            obj = e;
        } else
        if (c instanceof ECNamedCurveSpec)
        {
            obj = new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.b(((ECNamedCurveSpec)c).a()), CryptoProObjectIdentifiers.g);
        } else
        {
            obj = EC5Util.a(c.getCurve());
            obj = new X962Parameters(new X9ECParameters(((ECCurve) (obj)), EC5Util.a(((ECCurve) (obj)), c.getGenerator(), d), c.getOrder(), BigInteger.valueOf(c.getCofactor()), c.getCurve().getSeed()));
        }
        biginteger = b.b().a();
        biginteger1 = b.c().a();
        abyte0 = new byte[64];
        a(abyte0, 0, biginteger);
        a(abyte0, 32, biginteger1);
        obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.d, ((org.spongycastle.asn1.ASN1Encodable) (obj))), new DEROctetString(abyte0));
_L4:
        return KeyUtil.a(((SubjectPublicKeyInfo) (obj)));
_L2:
        if (!(c instanceof ECNamedCurveSpec))
        {
            break; /* Loop/switch isn't completed */
        }
        ASN1ObjectIdentifier asn1objectidentifier = ECUtil.a(((ECNamedCurveSpec)c).a());
        obj = asn1objectidentifier;
        if (asn1objectidentifier == null)
        {
            obj = new ASN1ObjectIdentifier(((ECNamedCurveSpec)c).a());
        }
        obj = new X962Parameters(((ASN1ObjectIdentifier) (obj)));
_L5:
        ASN1OctetString asn1octetstring = (ASN1OctetString)(new X9ECPoint(b.a().a(a().b().a(), a().c().a(), d))).a();
        obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.k, ((org.spongycastle.asn1.ASN1Encodable) (obj))), asn1octetstring.d());
        if (true) goto _L4; else goto _L3
_L3:
        if (c == null)
        {
            obj = new X962Parameters(DERNull.a);
        } else
        {
            obj = EC5Util.a(c.getCurve());
            obj = new X962Parameters(new X9ECParameters(((ECCurve) (obj)), EC5Util.a(((ECCurve) (obj)), c.getGenerator(), d), c.getOrder(), BigInteger.valueOf(c.getCofactor()), c.getCurve().getSeed()));
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public String getFormat()
    {
        return "X.509";
    }

    public java.security.spec.ECParameterSpec getParams()
    {
        return c;
    }

    public java.security.spec.ECPoint getW()
    {
        return new java.security.spec.ECPoint(b.b().a(), b.c().a());
    }

    public int hashCode()
    {
        return b.hashCode() ^ c().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("EC Public Key").append(s);
        stringbuffer.append("            X: ").append(b.b().a().toString(16)).append(s);
        stringbuffer.append("            Y: ").append(b.c().a().toString(16)).append(s);
        return stringbuffer.toString();
    }
}

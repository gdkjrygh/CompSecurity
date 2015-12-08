// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X962Parameters;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ECPoint;
import org.spongycastle.asn1.x9.X9IntegerConverter;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.interfaces.ECPointEncoder;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.jce.spec.ECParameterSpec;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            EC5Util, ECUtil

public class BCECPublicKey
    implements ECPublicKey, ECPointEncoder, org.spongycastle.jce.interfaces.ECPublicKey
{

    private String a;
    private boolean b;
    private transient org.spongycastle.math.ec.ECPoint c;
    private transient java.security.spec.ECParameterSpec d;
    private transient ProviderConfiguration e;

    public BCECPublicKey(String s, ECPublicKeySpec ecpublickeyspec, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        a = s;
        d = ecpublickeyspec.getParams();
        c = EC5Util.a(d, ecpublickeyspec.getW());
        e = providerconfiguration;
    }

    BCECPublicKey(String s, SubjectPublicKeyInfo subjectpublickeyinfo, ProviderConfiguration providerconfiguration)
    {
label0:
        {
            super();
            a = "EC";
            a = s;
            e = providerconfiguration;
            s = new X962Parameters((ASN1Primitive)subjectpublickeyinfo.c().e());
            byte abyte0[];
            if (s.c())
            {
                providerconfiguration = (ASN1ObjectIdentifier)s.e();
                X9ECParameters x9ecparameters = ECUtil.a(providerconfiguration);
                s = x9ecparameters.c();
                x9ecparameters.g();
                EllipticCurve ellipticcurve = EC5Util.a(s);
                d = new ECNamedCurveSpec(ECUtil.b(providerconfiguration), ellipticcurve, new ECPoint(x9ecparameters.d().b().a(), x9ecparameters.d().c().a()), x9ecparameters.e(), x9ecparameters.f());
            } else
            if (s.d())
            {
                d = null;
                s = e.a().b();
            } else
            {
                providerconfiguration = X9ECParameters.a(s.e());
                s = providerconfiguration.c();
                providerconfiguration.g();
                d = new java.security.spec.ECParameterSpec(EC5Util.a(s), new ECPoint(providerconfiguration.d().b().a(), providerconfiguration.d().c().a()), providerconfiguration.e(), providerconfiguration.f().intValue());
            }
            abyte0 = subjectpublickeyinfo.f().c();
            providerconfiguration = new DEROctetString(abyte0);
            subjectpublickeyinfo = providerconfiguration;
            if (abyte0[0] != 4)
            {
                break label0;
            }
            subjectpublickeyinfo = providerconfiguration;
            if (abyte0[1] != abyte0.length - 2)
            {
                break label0;
            }
            if (abyte0[2] != 2)
            {
                subjectpublickeyinfo = providerconfiguration;
                if (abyte0[2] != 3)
                {
                    break label0;
                }
            }
            new X9IntegerConverter();
            subjectpublickeyinfo = providerconfiguration;
            if (X9IntegerConverter.a(s) >= abyte0.length - 3)
            {
                try
                {
                    subjectpublickeyinfo = (ASN1OctetString)ASN1Primitive.a(abyte0);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
        }
        c = (new X9ECPoint(s, subjectpublickeyinfo)).c();
    }

    public BCECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, java.security.spec.ECParameterSpec ecparameterspec, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.b();
        a = s;
        c = ecpublickeyparameters.c();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.a();
            ecdomainparameters.e();
            d = a(EC5Util.a(s), ecdomainparameters);
        } else
        {
            d = ecparameterspec;
        }
        e = providerconfiguration;
    }

    public BCECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        a = s;
        c = ecpublickeyparameters.c();
        d = null;
        e = providerconfiguration;
    }

    public BCECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, ECParameterSpec ecparameterspec, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.b();
        a = s;
        c = ecpublickeyparameters.c();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.a();
            ecdomainparameters.e();
            d = a(EC5Util.a(s), ecdomainparameters);
        } else
        {
            d = EC5Util.a(EC5Util.a(ecparameterspec.b()), ecparameterspec);
        }
        e = providerconfiguration;
    }

    public BCECPublicKey(String s, org.spongycastle.jce.spec.ECPublicKeySpec ecpublickeyspec, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        a = s;
        c = ecpublickeyspec.b();
        if (ecpublickeyspec.a() != null)
        {
            d = EC5Util.a(EC5Util.a(ecpublickeyspec.a().b()), ecpublickeyspec.a());
        } else
        {
            if (c.a() == null)
            {
                c = providerconfiguration.a().b().a(c.b().a(), c.c().a(), false);
            }
            d = null;
        }
        e = providerconfiguration;
    }

    public BCECPublicKey(ECPublicKey ecpublickey)
    {
        a = "EC";
        a = ecpublickey.getAlgorithm();
        d = ecpublickey.getParams();
        c = EC5Util.a(d, ecpublickey.getW());
    }

    private static java.security.spec.ECParameterSpec a(EllipticCurve ellipticcurve, ECDomainParameters ecdomainparameters)
    {
        return new java.security.spec.ECParameterSpec(ellipticcurve, new ECPoint(ecdomainparameters.b().b().a(), ecdomainparameters.b().c().a()), ecdomainparameters.c(), ecdomainparameters.d().intValue());
    }

    private ECParameterSpec d()
    {
        if (d != null)
        {
            return EC5Util.a(d, b);
        } else
        {
            return e.a();
        }
    }

    public final org.spongycastle.math.ec.ECPoint a()
    {
        if (d == null)
        {
            if (c instanceof org.spongycastle.math.ec.ECPoint.Fp)
            {
                return new org.spongycastle.math.ec.ECPoint.Fp(null, c.b(), c.c());
            } else
            {
                return new org.spongycastle.math.ec.ECPoint.F2m(null, c.b(), c.c());
            }
        } else
        {
            return c;
        }
    }

    public final ECParameterSpec b()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return EC5Util.a(d, b);
        }
    }

    public final org.spongycastle.math.ec.ECPoint c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof BCECPublicKey)
        {
            if (c.equals(((BCECPublicKey) (obj = (BCECPublicKey)obj)).c) && d().equals(((BCECPublicKey) (obj)).d()))
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
        Object obj;
        ASN1OctetString asn1octetstring;
        if (d instanceof ECNamedCurveSpec)
        {
            ASN1ObjectIdentifier asn1objectidentifier = ECUtil.a(((ECNamedCurveSpec)d).a());
            obj = asn1objectidentifier;
            if (asn1objectidentifier == null)
            {
                obj = new ASN1ObjectIdentifier(((ECNamedCurveSpec)d).a());
            }
            obj = new X962Parameters(((ASN1ObjectIdentifier) (obj)));
        } else
        if (d == null)
        {
            obj = new X962Parameters(DERNull.a);
        } else
        {
            obj = EC5Util.a(d.getCurve());
            obj = new X962Parameters(new X9ECParameters(((ECCurve) (obj)), EC5Util.a(((ECCurve) (obj)), d.getGenerator(), b), d.getOrder(), BigInteger.valueOf(d.getCofactor()), d.getCurve().getSeed()));
        }
        asn1octetstring = (ASN1OctetString)(new X9ECPoint(c.a().a(a().b().a(), a().c().a(), b))).a();
        return KeyUtil.a(new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.k, ((org.spongycastle.asn1.ASN1Encodable) (obj))), asn1octetstring.d()));
    }

    public String getFormat()
    {
        return "X.509";
    }

    public java.security.spec.ECParameterSpec getParams()
    {
        return d;
    }

    public ECPoint getW()
    {
        return new ECPoint(c.b().a(), c.c().a());
    }

    public int hashCode()
    {
        return c.hashCode() ^ d().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("EC Public Key").append(s);
        stringbuffer.append("            X: ").append(c.b().a().toString(16)).append(s);
        stringbuffer.append("            Y: ").append(c.c().a().toString(16)).append(s);
        return stringbuffer.toString();
    }
}

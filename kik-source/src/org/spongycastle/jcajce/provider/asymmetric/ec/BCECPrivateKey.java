// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DERBitString;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X962Parameters;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.interfaces.ECPointEncoder;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.math.ec.ECFieldElement;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            ECUtil, EC5Util, BCECPublicKey

public class BCECPrivateKey
    implements ECPrivateKey, ECPointEncoder, org.spongycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier
{

    private String a;
    private boolean b;
    private transient BigInteger c;
    private transient ECParameterSpec d;
    private transient ProviderConfiguration e;
    private transient DERBitString f;
    private transient PKCS12BagAttributeCarrierImpl g;

    protected BCECPrivateKey()
    {
        a = "EC";
        g = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECPrivateKey(String s, ECPrivateKeySpec ecprivatekeyspec, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        g = new PKCS12BagAttributeCarrierImpl();
        a = s;
        c = ecprivatekeyspec.getS();
        d = ecprivatekeyspec.getParams();
        e = providerconfiguration;
    }

    BCECPrivateKey(String s, PrivateKeyInfo privatekeyinfo, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        g = new PKCS12BagAttributeCarrierImpl();
        a = s;
        e = providerconfiguration;
        s = X962Parameters.a(privatekeyinfo.c().e());
        if (s.c())
        {
            s = ASN1ObjectIdentifier.a(s.e());
            providerconfiguration = ECUtil.a(s);
            if (providerconfiguration == null)
            {
                providerconfiguration = ECGOST3410NamedCurves.a(s);
                Object obj = providerconfiguration.a();
                providerconfiguration.e();
                obj = EC5Util.a(((org.spongycastle.math.ec.ECCurve) (obj)));
                d = new ECNamedCurveSpec(ECGOST3410NamedCurves.b(s), ((EllipticCurve) (obj)), new ECPoint(providerconfiguration.b().b().a(), providerconfiguration.b().c().a()), providerconfiguration.c(), providerconfiguration.d());
            } else
            {
                Object obj1 = providerconfiguration.c();
                providerconfiguration.g();
                obj1 = EC5Util.a(((org.spongycastle.math.ec.ECCurve) (obj1)));
                d = new ECNamedCurveSpec(ECUtil.b(s), ((EllipticCurve) (obj1)), new ECPoint(providerconfiguration.d().b().a(), providerconfiguration.d().c().a()), providerconfiguration.e(), providerconfiguration.f());
            }
        } else
        if (s.d())
        {
            d = null;
        } else
        {
            s = X9ECParameters.a(s.e());
            providerconfiguration = s.c();
            s.g();
            d = new ECParameterSpec(EC5Util.a(providerconfiguration), new ECPoint(s.d().b().a(), s.d().c().a()), s.e(), s.f().intValue());
        }
        s = privatekeyinfo.e();
        if (s instanceof DERInteger)
        {
            c = DERInteger.a(s).c();
            return;
        } else
        {
            s = org.spongycastle.asn1.sec.ECPrivateKey.a(s);
            c = s.c();
            f = s.d();
            return;
        }
    }

    public BCECPrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters, BCECPublicKey bcecpublickey, ECParameterSpec ecparameterspec, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        g = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters ecdomainparameters = ecprivatekeyparameters.b();
        a = s;
        c = ecprivatekeyparameters.c();
        e = providerconfiguration;
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.a();
            ecdomainparameters.e();
            d = new ECParameterSpec(EC5Util.a(s), new ECPoint(ecdomainparameters.b().b().a(), ecdomainparameters.b().c().a()), ecdomainparameters.c(), ecdomainparameters.d().intValue());
        } else
        {
            d = ecparameterspec;
        }
        f = a(bcecpublickey);
    }

    public BCECPrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters, BCECPublicKey bcecpublickey, org.spongycastle.jce.spec.ECParameterSpec ecparameterspec, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        g = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters ecdomainparameters = ecprivatekeyparameters.b();
        a = s;
        c = ecprivatekeyparameters.c();
        e = providerconfiguration;
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.a();
            ecdomainparameters.e();
            d = new ECParameterSpec(EC5Util.a(s), new ECPoint(ecdomainparameters.b().b().a(), ecdomainparameters.b().c().a()), ecdomainparameters.c(), ecdomainparameters.d().intValue());
        } else
        {
            d = new ECParameterSpec(EC5Util.a(ecparameterspec.b()), new ECPoint(ecparameterspec.c().b().a(), ecparameterspec.c().c().a()), ecparameterspec.d(), ecparameterspec.e().intValue());
        }
        f = a(bcecpublickey);
    }

    public BCECPrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        g = new PKCS12BagAttributeCarrierImpl();
        a = s;
        c = ecprivatekeyparameters.c();
        d = null;
        e = providerconfiguration;
    }

    public BCECPrivateKey(String s, org.spongycastle.jce.spec.ECPrivateKeySpec ecprivatekeyspec, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        g = new PKCS12BagAttributeCarrierImpl();
        a = s;
        c = ecprivatekeyspec.b();
        if (ecprivatekeyspec.a() != null)
        {
            d = EC5Util.a(EC5Util.a(ecprivatekeyspec.a().b()), ecprivatekeyspec.a());
        } else
        {
            d = null;
        }
        e = providerconfiguration;
    }

    public BCECPrivateKey(ECPrivateKey ecprivatekey, ProviderConfiguration providerconfiguration)
    {
        a = "EC";
        g = new PKCS12BagAttributeCarrierImpl();
        c = ecprivatekey.getS();
        a = ecprivatekey.getAlgorithm();
        d = ecprivatekey.getParams();
        e = providerconfiguration;
    }

    private static DERBitString a(BCECPublicKey bcecpublickey)
    {
        try
        {
            bcecpublickey = SubjectPublicKeyInfo.a(ASN1Primitive.a(bcecpublickey.getEncoded())).f();
        }
        // Misplaced declaration of an exception variable
        catch (BCECPublicKey bcecpublickey)
        {
            return null;
        }
        return bcecpublickey;
    }

    private org.spongycastle.jce.spec.ECParameterSpec d()
    {
        if (d != null)
        {
            return EC5Util.a(d, b);
        } else
        {
            return e.a();
        }
    }

    public final Enumeration a()
    {
        return g.a();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return g.a(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        g.a(asn1objectidentifier, asn1encodable);
    }

    public final org.spongycastle.jce.spec.ECParameterSpec b()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return EC5Util.a(d, b);
        }
    }

    public final BigInteger c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof BCECPrivateKey)
        {
            if (c.equals(((BCECPrivateKey) (obj = (BCECPrivateKey)obj)).c) && d().equals(((BCECPrivateKey) (obj)).d()))
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
        org.spongycastle.asn1.sec.ECPrivateKey ecprivatekey;
        if (d instanceof ECNamedCurveSpec)
        {
            ASN1ObjectIdentifier asn1objectidentifier = ECUtil.a(((ECNamedCurveSpec)d).a());
            obj = asn1objectidentifier;
            if (asn1objectidentifier == null)
            {
                obj = new DERObjectIdentifier(((ECNamedCurveSpec)d).a());
            }
            obj = new X962Parameters(((ASN1Primitive) (obj)));
        } else
        if (d == null)
        {
            obj = new X962Parameters(DERNull.a);
        } else
        {
            obj = EC5Util.a(d.getCurve());
            obj = new X962Parameters(new X9ECParameters(((org.spongycastle.math.ec.ECCurve) (obj)), EC5Util.a(((org.spongycastle.math.ec.ECCurve) (obj)), d.getGenerator(), b), d.getOrder(), BigInteger.valueOf(d.getCofactor()), d.getCurve().getSeed()));
        }
        if (f != null)
        {
            ecprivatekey = new org.spongycastle.asn1.sec.ECPrivateKey(getS(), f, ((org.spongycastle.asn1.ASN1Object) (obj)));
        } else
        {
            ecprivatekey = new org.spongycastle.asn1.sec.ECPrivateKey(getS(), ((org.spongycastle.asn1.ASN1Object) (obj)));
        }
        if (!a.equals("ECGOST3410"))
        {
            break MISSING_BLOCK_LABEL_240;
        }
        obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.d, ((X962Parameters) (obj)).a()), ecprivatekey.a());
_L1:
        obj = ((PrivateKeyInfo) (obj)).a("DER");
        return ((byte []) (obj));
        try
        {
            obj = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.k, ((X962Parameters) (obj)).a()), ecprivatekey.a());
        }
        catch (IOException ioexception)
        {
            return null;
        }
          goto _L1
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public ECParameterSpec getParams()
    {
        return d;
    }

    public BigInteger getS()
    {
        return c;
    }

    public int hashCode()
    {
        return c.hashCode() ^ d().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("EC Private Key").append(s);
        stringbuffer.append("             S: ").append(c.toString(16)).append(s);
        return stringbuffer.toString();
    }
}

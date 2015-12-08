// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ecgost;

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
import org.spongycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.spongycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.spongycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.interfaces.ECPointEncoder;
import org.spongycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.math.ec.ECFieldElement;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ecgost:
//            BCECGOST3410PublicKey

public class BCECGOST3410PrivateKey
    implements ECPrivateKey, ECPointEncoder, org.spongycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier
{

    private String a;
    private boolean b;
    private transient BigInteger c;
    private transient ECParameterSpec d;
    private transient DERBitString e;
    private transient PKCS12BagAttributeCarrierImpl f;

    protected BCECGOST3410PrivateKey()
    {
        a = "ECGOST3410";
        f = new PKCS12BagAttributeCarrierImpl();
    }

    public BCECGOST3410PrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters)
    {
        a = "ECGOST3410";
        f = new PKCS12BagAttributeCarrierImpl();
        a = s;
        c = ecprivatekeyparameters.c();
        d = null;
    }

    public BCECGOST3410PrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters, BCECGOST3410PublicKey bcecgost3410publickey, ECParameterSpec ecparameterspec)
    {
        a = "ECGOST3410";
        f = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters ecdomainparameters = ecprivatekeyparameters.b();
        a = s;
        c = ecprivatekeyparameters.c();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.a();
            ecdomainparameters.e();
            d = new ECParameterSpec(EC5Util.a(s), new ECPoint(ecdomainparameters.b().b().a(), ecdomainparameters.b().c().a()), ecdomainparameters.c(), ecdomainparameters.d().intValue());
        } else
        {
            d = ecparameterspec;
        }
        e = a(bcecgost3410publickey);
    }

    public BCECGOST3410PrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters, BCECGOST3410PublicKey bcecgost3410publickey, org.spongycastle.jce.spec.ECParameterSpec ecparameterspec)
    {
        a = "ECGOST3410";
        f = new PKCS12BagAttributeCarrierImpl();
        ECDomainParameters ecdomainparameters = ecprivatekeyparameters.b();
        a = s;
        c = ecprivatekeyparameters.c();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.a();
            ecdomainparameters.e();
            d = new ECParameterSpec(EC5Util.a(s), new ECPoint(ecdomainparameters.b().b().a(), ecdomainparameters.b().c().a()), ecdomainparameters.c(), ecdomainparameters.d().intValue());
        } else
        {
            d = new ECParameterSpec(EC5Util.a(ecparameterspec.b()), new ECPoint(ecparameterspec.c().b().a(), ecparameterspec.c().c().a()), ecparameterspec.d(), ecparameterspec.e().intValue());
        }
        e = a(bcecgost3410publickey);
    }

    public BCECGOST3410PrivateKey(ECPrivateKeySpec ecprivatekeyspec)
    {
        a = "ECGOST3410";
        f = new PKCS12BagAttributeCarrierImpl();
        c = ecprivatekeyspec.getS();
        d = ecprivatekeyspec.getParams();
    }

    BCECGOST3410PrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        a = "ECGOST3410";
        f = new PKCS12BagAttributeCarrierImpl();
        Object obj = new X962Parameters((ASN1Primitive)privatekeyinfo.c().e());
        if (((X962Parameters) (obj)).c())
        {
            obj = ASN1ObjectIdentifier.a(((X962Parameters) (obj)).e());
            Object obj1 = ECUtil.a(((ASN1ObjectIdentifier) (obj)));
            if (obj1 == null)
            {
                obj1 = ECGOST3410NamedCurves.a(((ASN1ObjectIdentifier) (obj)));
                Object obj2 = ((ECDomainParameters) (obj1)).a();
                ((ECDomainParameters) (obj1)).e();
                obj2 = EC5Util.a(((org.spongycastle.math.ec.ECCurve) (obj2)));
                d = new ECNamedCurveSpec(ECGOST3410NamedCurves.b(((ASN1ObjectIdentifier) (obj))), ((EllipticCurve) (obj2)), new ECPoint(((ECDomainParameters) (obj1)).b().b().a(), ((ECDomainParameters) (obj1)).b().c().a()), ((ECDomainParameters) (obj1)).c(), ((ECDomainParameters) (obj1)).d());
            } else
            {
                Object obj3 = ((X9ECParameters) (obj1)).c();
                ((X9ECParameters) (obj1)).g();
                obj3 = EC5Util.a(((org.spongycastle.math.ec.ECCurve) (obj3)));
                d = new ECNamedCurveSpec(ECUtil.b(((ASN1ObjectIdentifier) (obj))), ((EllipticCurve) (obj3)), new ECPoint(((X9ECParameters) (obj1)).d().b().a(), ((X9ECParameters) (obj1)).d().c().a()), ((X9ECParameters) (obj1)).e(), ((X9ECParameters) (obj1)).f());
            }
        } else
        if (((X962Parameters) (obj)).d())
        {
            d = null;
        } else
        {
            obj = X9ECParameters.a(((X962Parameters) (obj)).e());
            org.spongycastle.math.ec.ECCurve eccurve = ((X9ECParameters) (obj)).c();
            ((X9ECParameters) (obj)).g();
            d = new ECParameterSpec(EC5Util.a(eccurve), new ECPoint(((X9ECParameters) (obj)).d().b().a(), ((X9ECParameters) (obj)).d().c().a()), ((X9ECParameters) (obj)).e(), ((X9ECParameters) (obj)).f().intValue());
        }
        privatekeyinfo = privatekeyinfo.e();
        if (privatekeyinfo instanceof DERInteger)
        {
            c = DERInteger.a(privatekeyinfo).c();
            return;
        } else
        {
            privatekeyinfo = org.spongycastle.asn1.sec.ECPrivateKey.a(privatekeyinfo);
            c = privatekeyinfo.c();
            e = privatekeyinfo.d();
            return;
        }
    }

    public BCECGOST3410PrivateKey(org.spongycastle.jce.spec.ECPrivateKeySpec ecprivatekeyspec)
    {
        a = "ECGOST3410";
        f = new PKCS12BagAttributeCarrierImpl();
        c = ecprivatekeyspec.b();
        if (ecprivatekeyspec.a() != null)
        {
            d = EC5Util.a(EC5Util.a(ecprivatekeyspec.a().b()), ecprivatekeyspec.a());
            return;
        } else
        {
            d = null;
            return;
        }
    }

    private static DERBitString a(BCECGOST3410PublicKey bcecgost3410publickey)
    {
        try
        {
            bcecgost3410publickey = SubjectPublicKeyInfo.a(ASN1Primitive.a(bcecgost3410publickey.getEncoded())).f();
        }
        // Misplaced declaration of an exception variable
        catch (BCECGOST3410PublicKey bcecgost3410publickey)
        {
            return null;
        }
        return bcecgost3410publickey;
    }

    private org.spongycastle.jce.spec.ECParameterSpec d()
    {
        if (d != null)
        {
            return EC5Util.a(d, b);
        } else
        {
            return BouncyCastleProvider.b.a();
        }
    }

    public final Enumeration a()
    {
        return f.a();
    }

    public final ASN1Encodable a(DERObjectIdentifier derobjectidentifier)
    {
        return f.a(derobjectidentifier);
    }

    public final void a(ASN1ObjectIdentifier asn1objectidentifier, ASN1Encodable asn1encodable)
    {
        f.a(asn1objectidentifier, asn1encodable);
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
        if (obj instanceof BCECGOST3410PrivateKey)
        {
            if (c.equals(((BCECGOST3410PrivateKey) (obj = (BCECGOST3410PrivateKey)obj)).c) && d().equals(((BCECGOST3410PrivateKey) (obj)).d()))
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
        if (e != null)
        {
            ecprivatekey = new org.spongycastle.asn1.sec.ECPrivateKey(getS(), e, ((org.spongycastle.asn1.ASN1Object) (obj)));
        } else
        {
            ecprivatekey = new org.spongycastle.asn1.sec.ECPrivateKey(getS(), ((org.spongycastle.asn1.ASN1Object) (obj)));
        }
        if (!a.equals("ECGOST3410"))
        {
            break MISSING_BLOCK_LABEL_239;
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

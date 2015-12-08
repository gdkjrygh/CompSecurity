// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKeyStructure;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.asymmetric.ec.EC5Util;
import org.bouncycastle.jce.provider.asymmetric.ec.ECUtil;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.ec.ECFieldElement;

// Referenced classes of package org.bouncycastle.jce.provider:
//            e, JCEECPublicKey, ProviderUtil

public class JCEECPrivateKey
    implements ECPrivateKey, ECPointEncoder, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier
{

    private String a;
    private BigInteger b;
    private ECParameterSpec c;
    private boolean d;
    private DERBitString e;
    private e f;

    protected JCEECPrivateKey()
    {
        a = "EC";
        f = new e();
    }

    public JCEECPrivateKey(String s, ECPrivateKeySpec ecprivatekeyspec)
    {
        a = "EC";
        f = new e();
        a = s;
        b = ecprivatekeyspec.getS();
        c = ecprivatekeyspec.getParams();
    }

    public JCEECPrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters)
    {
        a = "EC";
        f = new e();
        a = s;
        b = ecprivatekeyparameters.getD();
        c = null;
    }

    public JCEECPrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters, JCEECPublicKey jceecpublickey, ECParameterSpec ecparameterspec)
    {
        a = "EC";
        f = new e();
        ECDomainParameters ecdomainparameters = ecprivatekeyparameters.getParameters();
        a = s;
        b = ecprivatekeyparameters.getD();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.getCurve();
            ecdomainparameters.getSeed();
            c = new ECParameterSpec(EC5Util.a(s), new ECPoint(ecdomainparameters.getG().b().a(), ecdomainparameters.getG().c().a()), ecdomainparameters.getN(), ecdomainparameters.getH().intValue());
        } else
        {
            c = ecparameterspec;
        }
        e = a(jceecpublickey);
    }

    public JCEECPrivateKey(String s, ECPrivateKeyParameters ecprivatekeyparameters, JCEECPublicKey jceecpublickey, org.bouncycastle.jce.spec.ECParameterSpec ecparameterspec)
    {
        a = "EC";
        f = new e();
        ECDomainParameters ecdomainparameters = ecprivatekeyparameters.getParameters();
        a = s;
        b = ecprivatekeyparameters.getD();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.getCurve();
            ecdomainparameters.getSeed();
            c = new ECParameterSpec(EC5Util.a(s), new ECPoint(ecdomainparameters.getG().b().a(), ecdomainparameters.getG().c().a()), ecdomainparameters.getN(), ecdomainparameters.getH().intValue());
        } else
        {
            c = new ECParameterSpec(EC5Util.a(ecparameterspec.b()), new ECPoint(ecparameterspec.c().b().a(), ecparameterspec.c().c().a()), ecparameterspec.d(), ecparameterspec.e().intValue());
        }
        e = a(jceecpublickey);
    }

    public JCEECPrivateKey(String s, JCEECPrivateKey jceecprivatekey)
    {
        a = "EC";
        f = new e();
        a = s;
        b = jceecprivatekey.b;
        c = jceecprivatekey.c;
        d = jceecprivatekey.d;
        f = jceecprivatekey.f;
        e = jceecprivatekey.e;
    }

    public JCEECPrivateKey(String s, org.bouncycastle.jce.spec.ECPrivateKeySpec ecprivatekeyspec)
    {
        a = "EC";
        f = new e();
        a = s;
        b = ecprivatekeyspec.b();
        if (ecprivatekeyspec.a() != null)
        {
            c = EC5Util.a(EC5Util.a(ecprivatekeyspec.a().b()), ecprivatekeyspec.a());
            return;
        } else
        {
            c = null;
            return;
        }
    }

    public JCEECPrivateKey(ECPrivateKey ecprivatekey)
    {
        a = "EC";
        f = new e();
        b = ecprivatekey.getS();
        a = ecprivatekey.getAlgorithm();
        c = ecprivatekey.getParams();
    }

    JCEECPrivateKey(PrivateKeyInfo privatekeyinfo)
    {
        a = "EC";
        f = new e();
        Object obj = new X962Parameters((DERObject)privatekeyinfo.e().g());
        if (((X962Parameters) (obj)).e())
        {
            obj = (DERObjectIdentifier)((X962Parameters) (obj)).g();
            Object obj1 = ECUtil.a(((DERObjectIdentifier) (obj)));
            if (obj1 == null)
            {
                obj1 = ECGOST3410NamedCurves.a(((DERObjectIdentifier) (obj)));
                Object obj2 = ((ECDomainParameters) (obj1)).getCurve();
                ((ECDomainParameters) (obj1)).getSeed();
                obj2 = EC5Util.a(((org.bouncycastle.math.ec.ECCurve) (obj2)));
                c = new ECNamedCurveSpec(ECGOST3410NamedCurves.b(((DERObjectIdentifier) (obj))), ((EllipticCurve) (obj2)), new ECPoint(((ECDomainParameters) (obj1)).getG().b().a(), ((ECDomainParameters) (obj1)).getG().c().a()), ((ECDomainParameters) (obj1)).getN(), ((ECDomainParameters) (obj1)).getH());
            } else
            {
                Object obj3 = ((X9ECParameters) (obj1)).e();
                ((X9ECParameters) (obj1)).i();
                obj3 = EC5Util.a(((org.bouncycastle.math.ec.ECCurve) (obj3)));
                c = new ECNamedCurveSpec(ECUtil.b(((DERObjectIdentifier) (obj))), ((EllipticCurve) (obj3)), new ECPoint(((X9ECParameters) (obj1)).f().b().a(), ((X9ECParameters) (obj1)).f().c().a()), ((X9ECParameters) (obj1)).g(), ((X9ECParameters) (obj1)).h());
            }
        } else
        if (((X962Parameters) (obj)).f())
        {
            c = null;
        } else
        {
            obj = new X9ECParameters((ASN1Sequence)((X962Parameters) (obj)).g());
            org.bouncycastle.math.ec.ECCurve eccurve = ((X9ECParameters) (obj)).e();
            ((X9ECParameters) (obj)).i();
            c = new ECParameterSpec(EC5Util.a(eccurve), new ECPoint(((X9ECParameters) (obj)).f().b().a(), ((X9ECParameters) (obj)).f().c().a()), ((X9ECParameters) (obj)).g(), ((X9ECParameters) (obj)).h().intValue());
        }
        if (privatekeyinfo.f() instanceof DERInteger)
        {
            b = ((DERInteger)privatekeyinfo.f()).e();
            return;
        } else
        {
            privatekeyinfo = new ECPrivateKeyStructure((ASN1Sequence)privatekeyinfo.f());
            b = privatekeyinfo.e();
            e = privatekeyinfo.f();
            return;
        }
    }

    private static DERBitString a(JCEECPublicKey jceecpublickey)
    {
        try
        {
            jceecpublickey = SubjectPublicKeyInfo.a(ASN1Object.a(jceecpublickey.getEncoded())).g();
        }
        // Misplaced declaration of an exception variable
        catch (JCEECPublicKey jceecpublickey)
        {
            return null;
        }
        return jceecpublickey;
    }

    private org.bouncycastle.jce.spec.ECParameterSpec d()
    {
        if (c != null)
        {
            return EC5Util.a(c, d);
        } else
        {
            return ProviderUtil.a();
        }
    }

    public final DEREncodable a(DERObjectIdentifier derobjectidentifier)
    {
        return f.a(derobjectidentifier);
    }

    public final org.bouncycastle.jce.spec.ECParameterSpec a()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return EC5Util.a(c, d);
        }
    }

    public final void a(DERObjectIdentifier derobjectidentifier, DEREncodable derencodable)
    {
        f.a(derobjectidentifier, derencodable);
    }

    public final BigInteger b()
    {
        return b;
    }

    public final Enumeration c()
    {
        return f.c();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof JCEECPrivateKey)
        {
            if (b.equals(((JCEECPrivateKey) (obj = (JCEECPrivateKey)obj)).b) && d().equals(((JCEECPrivateKey) (obj)).d()))
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
        ECPrivateKeyStructure ecprivatekeystructure;
        if (c instanceof ECNamedCurveSpec)
        {
            DERObjectIdentifier derobjectidentifier = ECUtil.a(((ECNamedCurveSpec)c).a());
            obj = derobjectidentifier;
            if (derobjectidentifier == null)
            {
                obj = new DERObjectIdentifier(((ECNamedCurveSpec)c).a());
            }
            obj = new X962Parameters(((DERObjectIdentifier) (obj)));
        } else
        if (c == null)
        {
            obj = new X962Parameters(DERNull.b);
        } else
        {
            obj = EC5Util.a(c.getCurve());
            obj = new X962Parameters(new X9ECParameters(((org.bouncycastle.math.ec.ECCurve) (obj)), EC5Util.a(((org.bouncycastle.math.ec.ECCurve) (obj)), c.getGenerator(), d), c.getOrder(), BigInteger.valueOf(c.getCofactor()), c.getCurve().getSeed()));
        }
        if (e != null)
        {
            ecprivatekeystructure = new ECPrivateKeyStructure(getS(), e, ((org.bouncycastle.asn1.ASN1Encodable) (obj)));
        } else
        {
            ecprivatekeystructure = new ECPrivateKeyStructure(getS(), ((org.bouncycastle.asn1.ASN1Encodable) (obj)));
        }
        if (a.equals("ECGOST3410"))
        {
            obj = new PrivateKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.d, ((X962Parameters) (obj)).c()), ecprivatekeystructure.c());
        } else
        {
            obj = new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.k, ((X962Parameters) (obj)).c()), ecprivatekeystructure.c());
        }
        return ((PrivateKeyInfo) (obj)).b();
    }

    public String getFormat()
    {
        return "PKCS#8";
    }

    public ECParameterSpec getParams()
    {
        return c;
    }

    public BigInteger getS()
    {
        return b;
    }

    public int hashCode()
    {
        return b.hashCode() ^ d().hashCode();
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        String s = System.getProperty("line.separator");
        stringbuffer.append("EC Private Key").append(s);
        stringbuffer.append("             S: ").append(b.toString(16)).append(s);
        return stringbuffer.toString();
    }
}

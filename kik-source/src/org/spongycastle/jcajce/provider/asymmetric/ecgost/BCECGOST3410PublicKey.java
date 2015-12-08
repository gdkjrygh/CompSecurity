// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ecgost;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERBitString;
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
import org.spongycastle.asn1.x9.X9IntegerConverter;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.jcajce.provider.asymmetric.ec.EC5Util;
import org.spongycastle.jcajce.provider.asymmetric.ec.ECUtil;
import org.spongycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.ECGOST3410NamedCurveTable;
import org.spongycastle.jce.interfaces.ECPointEncoder;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.jce.spec.ECParameterSpec;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECFieldElement;
import org.spongycastle.math.ec.ECPoint;

public class BCECGOST3410PublicKey
    implements ECPublicKey, ECPointEncoder, org.spongycastle.jce.interfaces.ECPublicKey
{

    private String a;
    private boolean b;
    private transient ECPoint c;
    private transient java.security.spec.ECParameterSpec d;
    private transient GOST3410PublicKeyAlgParameters e;

    public BCECGOST3410PublicKey(String s, ECPublicKeyParameters ecpublickeyparameters)
    {
        a = "ECGOST3410";
        a = s;
        c = ecpublickeyparameters.c();
        d = null;
    }

    public BCECGOST3410PublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, java.security.spec.ECParameterSpec ecparameterspec)
    {
        a = "ECGOST3410";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.b();
        a = s;
        c = ecpublickeyparameters.c();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.a();
            ecdomainparameters.e();
            d = a(EC5Util.a(s), ecdomainparameters);
            return;
        } else
        {
            d = ecparameterspec;
            return;
        }
    }

    public BCECGOST3410PublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, ECParameterSpec ecparameterspec)
    {
        a = "ECGOST3410";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.b();
        a = s;
        c = ecpublickeyparameters.c();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.a();
            ecdomainparameters.e();
            d = a(EC5Util.a(s), ecdomainparameters);
            return;
        } else
        {
            d = EC5Util.a(EC5Util.a(ecparameterspec.b()), ecparameterspec);
            return;
        }
    }

    public BCECGOST3410PublicKey(ECPublicKeySpec ecpublickeyspec)
    {
        a = "ECGOST3410";
        d = ecpublickeyspec.getParams();
        c = EC5Util.a(d, ecpublickeyspec.getW());
    }

    BCECGOST3410PublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        a = "ECGOST3410";
        a(subjectpublickeyinfo);
    }

    public BCECGOST3410PublicKey(org.spongycastle.jce.spec.ECPublicKeySpec ecpublickeyspec)
    {
        a = "ECGOST3410";
        c = ecpublickeyspec.b();
        if (ecpublickeyspec.a() != null)
        {
            d = EC5Util.a(EC5Util.a(ecpublickeyspec.a().b()), ecpublickeyspec.a());
            return;
        }
        if (c.a() == null)
        {
            c = BouncyCastleProvider.b.a().b().a(c.b().a(), c.c().a(), false);
        }
        d = null;
    }

    private static java.security.spec.ECParameterSpec a(EllipticCurve ellipticcurve, ECDomainParameters ecdomainparameters)
    {
        return new java.security.spec.ECParameterSpec(ellipticcurve, new java.security.spec.ECPoint(ecdomainparameters.b().b().a(), ecdomainparameters.b().c().a()), ecdomainparameters.c(), ecdomainparameters.d().intValue());
    }

    private void a(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
label0:
        {
            if (subjectpublickeyinfo.c().d().equals(CryptoProObjectIdentifiers.d))
            {
                Object obj = subjectpublickeyinfo.f();
                a = "ECGOST3410";
                byte abyte0[];
                byte abyte1[];
                byte abyte2[];
                try
                {
                    obj = (ASN1OctetString)ASN1Primitive.a(((DERBitString) (obj)).c());
                }
                // Misplaced declaration of an exception variable
                catch (SubjectPublicKeyInfo subjectpublickeyinfo)
                {
                    throw new IllegalArgumentException("error recovering public key");
                }
                abyte2 = ((ASN1OctetString) (obj)).d();
                abyte0 = new byte[32];
                abyte1 = new byte[32];
                for (int i = 0; i != 32; i++)
                {
                    abyte0[i] = abyte2[31 - i];
                }

                for (int j = 0; j != 32; j++)
                {
                    abyte1[j] = abyte2[63 - j];
                }

                e = new GOST3410PublicKeyAlgParameters((ASN1Sequence)subjectpublickeyinfo.c().e());
                subjectpublickeyinfo = ECGOST3410NamedCurveTable.a(ECGOST3410NamedCurves.b(e.c()));
                ECCurve eccurve = subjectpublickeyinfo.b();
                EllipticCurve ellipticcurve = EC5Util.a(eccurve);
                c = eccurve.a(new BigInteger(1, abyte0), new BigInteger(1, abyte1), false);
                d = new ECNamedCurveSpec(ECGOST3410NamedCurves.b(e.c()), ellipticcurve, new java.security.spec.ECPoint(subjectpublickeyinfo.c().b().a(), subjectpublickeyinfo.c().c().a()), subjectpublickeyinfo.d(), subjectpublickeyinfo.e());
                return;
            }
            Object obj1 = new X962Parameters((ASN1Primitive)subjectpublickeyinfo.c().e());
            DEROctetString deroctetstring;
            byte abyte3[];
            if (((X962Parameters) (obj1)).c())
            {
                ASN1ObjectIdentifier asn1objectidentifier = (ASN1ObjectIdentifier)((X962Parameters) (obj1)).e();
                X9ECParameters x9ecparameters1 = ECUtil.a(asn1objectidentifier);
                obj1 = x9ecparameters1.c();
                x9ecparameters1.g();
                EllipticCurve ellipticcurve1 = EC5Util.a(((ECCurve) (obj1)));
                d = new ECNamedCurveSpec(ECUtil.b(asn1objectidentifier), ellipticcurve1, new java.security.spec.ECPoint(x9ecparameters1.d().b().a(), x9ecparameters1.d().c().a()), x9ecparameters1.e(), x9ecparameters1.f());
            } else
            if (((X962Parameters) (obj1)).d())
            {
                d = null;
                obj1 = BouncyCastleProvider.b.a().b();
            } else
            {
                X9ECParameters x9ecparameters = X9ECParameters.a(((X962Parameters) (obj1)).e());
                obj1 = x9ecparameters.c();
                x9ecparameters.g();
                d = new java.security.spec.ECParameterSpec(EC5Util.a(((ECCurve) (obj1))), new java.security.spec.ECPoint(x9ecparameters.d().b().a(), x9ecparameters.d().c().a()), x9ecparameters.e(), x9ecparameters.f().intValue());
            }
            abyte3 = subjectpublickeyinfo.f().c();
            deroctetstring = new DEROctetString(abyte3);
            subjectpublickeyinfo = deroctetstring;
            if (abyte3[0] != 4)
            {
                break label0;
            }
            subjectpublickeyinfo = deroctetstring;
            if (abyte3[1] != abyte3.length - 2)
            {
                break label0;
            }
            if (abyte3[2] != 2)
            {
                subjectpublickeyinfo = deroctetstring;
                if (abyte3[2] != 3)
                {
                    break label0;
                }
            }
            new X9IntegerConverter();
            subjectpublickeyinfo = deroctetstring;
            if (X9IntegerConverter.a(((ECCurve) (obj1))) >= abyte3.length - 3)
            {
                try
                {
                    subjectpublickeyinfo = (ASN1OctetString)ASN1Primitive.a(abyte3);
                }
                // Misplaced declaration of an exception variable
                catch (SubjectPublicKeyInfo subjectpublickeyinfo)
                {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
        }
        c = (new X9ECPoint(((ECCurve) (obj1)), subjectpublickeyinfo)).c();
    }

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
        if (d != null)
        {
            return EC5Util.a(d, b);
        } else
        {
            return BouncyCastleProvider.b.a();
        }
    }

    public final ECPoint a()
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

    public boolean equals(Object obj)
    {
        if (obj instanceof BCECGOST3410PublicKey)
        {
            if (c.equals(((BCECGOST3410PublicKey) (obj = (BCECGOST3410PublicKey)obj)).c) && c().equals(((BCECGOST3410PublicKey) (obj)).c()))
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
        if (d instanceof ECNamedCurveSpec)
        {
            obj = new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.b(((ECNamedCurveSpec)d).a()), CryptoProObjectIdentifiers.g);
        } else
        {
            obj = EC5Util.a(d.getCurve());
            obj = new X962Parameters(new X9ECParameters(((ECCurve) (obj)), EC5Util.a(((ECCurve) (obj)), d.getGenerator(), b), d.getOrder(), BigInteger.valueOf(d.getCofactor()), d.getCurve().getSeed()));
        }
        biginteger = c.b().a();
        biginteger1 = c.c().a();
        abyte0 = new byte[64];
        a(abyte0, 0, biginteger);
        a(abyte0, 32, biginteger1);
        obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.d, ((org.spongycastle.asn1.ASN1Encodable) (obj))), new DEROctetString(abyte0));
_L4:
        return KeyUtil.a(((SubjectPublicKeyInfo) (obj)));
_L2:
        if (!(d instanceof ECNamedCurveSpec))
        {
            break; /* Loop/switch isn't completed */
        }
        ASN1ObjectIdentifier asn1objectidentifier = ECUtil.a(((ECNamedCurveSpec)d).a());
        obj = asn1objectidentifier;
        if (asn1objectidentifier == null)
        {
            obj = new ASN1ObjectIdentifier(((ECNamedCurveSpec)d).a());
        }
        obj = new X962Parameters(((ASN1ObjectIdentifier) (obj)));
_L5:
        ASN1OctetString asn1octetstring = (ASN1OctetString)(new X9ECPoint(c.a().a(a().b().a(), a().c().a(), b))).a();
        obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.k, ((org.spongycastle.asn1.ASN1Encodable) (obj))), asn1octetstring.d());
        if (true) goto _L4; else goto _L3
_L3:
        if (d == null)
        {
            obj = new X962Parameters(DERNull.a);
        } else
        {
            obj = EC5Util.a(d.getCurve());
            obj = new X962Parameters(new X9ECParameters(((ECCurve) (obj)), EC5Util.a(((ECCurve) (obj)), d.getGenerator(), b), d.getOrder(), BigInteger.valueOf(d.getCofactor()), d.getCurve().getSeed()));
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
        return d;
    }

    public java.security.spec.ECPoint getW()
    {
        return new java.security.spec.ECPoint(c.b().a(), c.c().a());
    }

    public int hashCode()
    {
        return c.hashCode() ^ c().hashCode();
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

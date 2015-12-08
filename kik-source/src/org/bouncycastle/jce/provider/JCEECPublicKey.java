// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jce.ECGOST3410NamedCurveTable;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.provider.asymmetric.ec.EC5Util;
import org.bouncycastle.jce.provider.asymmetric.ec.ECUtil;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.jce.provider:
//            ProviderUtil

public class JCEECPublicKey
    implements ECPublicKey, ECPointEncoder, org.bouncycastle.jce.interfaces.ECPublicKey
{

    private String a;
    private ECPoint b;
    private java.security.spec.ECParameterSpec c;
    private boolean d;
    private GOST3410PublicKeyAlgParameters e;

    public JCEECPublicKey(String s, ECPublicKeySpec ecpublickeyspec)
    {
        a = "EC";
        a = s;
        c = ecpublickeyspec.getParams();
        b = EC5Util.a(c, ecpublickeyspec.getW());
    }

    public JCEECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters)
    {
        a = "EC";
        a = s;
        b = ecpublickeyparameters.getQ();
        c = null;
    }

    public JCEECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, java.security.spec.ECParameterSpec ecparameterspec)
    {
        a = "EC";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.getParameters();
        a = s;
        b = ecpublickeyparameters.getQ();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.getCurve();
            ecdomainparameters.getSeed();
            c = a(EC5Util.a(s), ecdomainparameters);
            return;
        } else
        {
            c = ecparameterspec;
            return;
        }
    }

    public JCEECPublicKey(String s, ECPublicKeyParameters ecpublickeyparameters, ECParameterSpec ecparameterspec)
    {
        a = "EC";
        ECDomainParameters ecdomainparameters = ecpublickeyparameters.getParameters();
        a = s;
        b = ecpublickeyparameters.getQ();
        if (ecparameterspec == null)
        {
            s = ecdomainparameters.getCurve();
            ecdomainparameters.getSeed();
            c = a(EC5Util.a(s), ecdomainparameters);
            return;
        } else
        {
            c = EC5Util.a(EC5Util.a(ecparameterspec.b()), ecparameterspec);
            return;
        }
    }

    public JCEECPublicKey(String s, JCEECPublicKey jceecpublickey)
    {
        a = "EC";
        a = s;
        b = jceecpublickey.b;
        c = jceecpublickey.c;
        d = jceecpublickey.d;
        e = jceecpublickey.e;
    }

    public JCEECPublicKey(String s, org.bouncycastle.jce.spec.ECPublicKeySpec ecpublickeyspec)
    {
        a = "EC";
        a = s;
        b = ecpublickeyspec.b();
        if (ecpublickeyspec.a() != null)
        {
            c = EC5Util.a(EC5Util.a(ecpublickeyspec.a().b()), ecpublickeyspec.a());
            return;
        }
        if (b.a() == null)
        {
            b = ProviderUtil.a().b().a(b.b().a(), b.c().a(), false);
        }
        c = null;
    }

    public JCEECPublicKey(ECPublicKey ecpublickey)
    {
        a = "EC";
        a = ecpublickey.getAlgorithm();
        c = ecpublickey.getParams();
        b = EC5Util.a(c, ecpublickey.getW());
    }

    JCEECPublicKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        a = "EC";
        a(subjectpublickeyinfo);
    }

    private static java.security.spec.ECParameterSpec a(EllipticCurve ellipticcurve, ECDomainParameters ecdomainparameters)
    {
        return new java.security.spec.ECParameterSpec(ellipticcurve, new java.security.spec.ECPoint(ecdomainparameters.getG().b().a(), ecdomainparameters.getG().c().a()), ecdomainparameters.getN(), ecdomainparameters.getH().intValue());
    }

    private void a(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
label0:
        {
            if (subjectpublickeyinfo.e().e().equals(CryptoProObjectIdentifiers.d))
            {
                Object obj = subjectpublickeyinfo.g();
                a = "ECGOST3410";
                byte abyte0[];
                byte abyte1[];
                byte abyte2[];
                try
                {
                    obj = (ASN1OctetString)ASN1Object.a(((DERBitString) (obj)).e());
                }
                // Misplaced declaration of an exception variable
                catch (SubjectPublicKeyInfo subjectpublickeyinfo)
                {
                    throw new IllegalArgumentException("error recovering public key");
                }
                abyte2 = ((ASN1OctetString) (obj)).f();
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

                e = new GOST3410PublicKeyAlgParameters((ASN1Sequence)subjectpublickeyinfo.e().g());
                subjectpublickeyinfo = ECGOST3410NamedCurveTable.a(ECGOST3410NamedCurves.b(e.e()));
                ECCurve eccurve = subjectpublickeyinfo.b();
                EllipticCurve ellipticcurve = EC5Util.a(eccurve);
                b = eccurve.a(new BigInteger(1, abyte0), new BigInteger(1, abyte1), false);
                c = new ECNamedCurveSpec(ECGOST3410NamedCurves.b(e.e()), ellipticcurve, new java.security.spec.ECPoint(subjectpublickeyinfo.c().b().a(), subjectpublickeyinfo.c().c().a()), subjectpublickeyinfo.d(), subjectpublickeyinfo.e());
                return;
            }
            Object obj1 = new X962Parameters((DERObject)subjectpublickeyinfo.e().g());
            DEROctetString deroctetstring;
            byte abyte3[];
            if (((X962Parameters) (obj1)).e())
            {
                DERObjectIdentifier derobjectidentifier = (DERObjectIdentifier)((X962Parameters) (obj1)).g();
                X9ECParameters x9ecparameters1 = ECUtil.a(derobjectidentifier);
                obj1 = x9ecparameters1.e();
                x9ecparameters1.i();
                EllipticCurve ellipticcurve1 = EC5Util.a(((ECCurve) (obj1)));
                c = new ECNamedCurveSpec(ECUtil.b(derobjectidentifier), ellipticcurve1, new java.security.spec.ECPoint(x9ecparameters1.f().b().a(), x9ecparameters1.f().c().a()), x9ecparameters1.g(), x9ecparameters1.h());
            } else
            if (((X962Parameters) (obj1)).f())
            {
                c = null;
                obj1 = ProviderUtil.a().b();
            } else
            {
                X9ECParameters x9ecparameters = new X9ECParameters((ASN1Sequence)((X962Parameters) (obj1)).g());
                obj1 = x9ecparameters.e();
                x9ecparameters.i();
                c = new java.security.spec.ECParameterSpec(EC5Util.a(((ECCurve) (obj1))), new java.security.spec.ECPoint(x9ecparameters.f().b().a(), x9ecparameters.f().c().a()), x9ecparameters.g(), x9ecparameters.h().intValue());
            }
            abyte3 = subjectpublickeyinfo.g().e();
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
                    subjectpublickeyinfo = (ASN1OctetString)ASN1Object.a(abyte3);
                }
                // Misplaced declaration of an exception variable
                catch (SubjectPublicKeyInfo subjectpublickeyinfo)
                {
                    throw new IllegalArgumentException("error recovering public key");
                }
            }
        }
        b = (new X9ECPoint(((ECCurve) (obj1)), subjectpublickeyinfo)).e();
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

    private ECParameterSpec d()
    {
        if (c != null)
        {
            return EC5Util.a(c, d);
        } else
        {
            return ProviderUtil.a();
        }
    }

    public final ECParameterSpec a()
    {
        if (c == null)
        {
            return null;
        } else
        {
            return EC5Util.a(c, d);
        }
    }

    public final ECPoint b()
    {
        if (c == null)
        {
            if (b instanceof org.bouncycastle.math.ec.ECPoint.Fp)
            {
                return new org.bouncycastle.math.ec.ECPoint.Fp(null, b.b(), b.c());
            } else
            {
                return new org.bouncycastle.math.ec.ECPoint.F2m(null, b.b(), b.c());
            }
        } else
        {
            return b;
        }
    }

    public final ECPoint c()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof JCEECPublicKey)
        {
            if (b.equals(((JCEECPublicKey) (obj = (JCEECPublicKey)obj)).b) && d().equals(((JCEECPublicKey) (obj)).d()))
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
        obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.d, ((ASN1Encodable) (obj)).c()), new DEROctetString(abyte0));
_L4:
        return ((SubjectPublicKeyInfo) (obj)).b();
_L2:
        if (!(c instanceof ECNamedCurveSpec))
        {
            break; /* Loop/switch isn't completed */
        }
        DERObjectIdentifier derobjectidentifier = ECUtil.a(((ECNamedCurveSpec)c).a());
        obj = derobjectidentifier;
        if (derobjectidentifier == null)
        {
            obj = new DERObjectIdentifier(((ECNamedCurveSpec)c).a());
        }
        obj = new X962Parameters(((DERObjectIdentifier) (obj)));
_L5:
        ASN1OctetString asn1octetstring = (ASN1OctetString)(new X9ECPoint(b.a().a(b().b().a(), b().c().a(), d))).c();
        obj = new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.k, ((ASN1Encodable) (obj)).c()), asn1octetstring.f());
        if (true) goto _L4; else goto _L3
_L3:
        if (c == null)
        {
            obj = new X962Parameters(DERNull.b);
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
        return b.hashCode() ^ d().hashCode();
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

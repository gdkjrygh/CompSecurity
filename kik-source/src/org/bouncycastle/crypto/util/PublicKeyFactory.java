// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.util;

import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x509.RSAPublicKeyStructure;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.DHDomainParameters;
import org.bouncycastle.asn1.x9.DHPublicKey;
import org.bouncycastle.asn1.x9.DHValidationParms;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ECPoint;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class PublicKeyFactory
{

    public PublicKeyFactory()
    {
    }

    public static AsymmetricKeyParameter createKey(InputStream inputstream)
    {
        return createKey(SubjectPublicKeyInfo.a((new ASN1InputStream(inputstream)).a()));
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectpublickeyinfo)
    {
        int i = 0;
        Object obj1 = null;
        Object obj = null;
        Object obj2 = subjectpublickeyinfo.e();
        if (((AlgorithmIdentifier) (obj2)).e().equals(PKCSObjectIdentifiers.h_) || ((AlgorithmIdentifier) (obj2)).e().equals(X509ObjectIdentifiers.l))
        {
            subjectpublickeyinfo = new RSAPublicKeyStructure((ASN1Sequence)subjectpublickeyinfo.f());
            return new RSAKeyParameters(false, subjectpublickeyinfo.e(), subjectpublickeyinfo.f());
        }
        if (((AlgorithmIdentifier) (obj2)).e().equals(X9ObjectIdentifiers.ab))
        {
            obj1 = DHPublicKey.a(subjectpublickeyinfo.f()).e().e();
            Object obj3 = DHDomainParameters.a(subjectpublickeyinfo.e().g());
            obj2 = ((DHDomainParameters) (obj3)).e().e();
            BigInteger biginteger = ((DHDomainParameters) (obj3)).f().e();
            BigInteger biginteger1 = ((DHDomainParameters) (obj3)).g().e();
            if (((DHDomainParameters) (obj3)).h() != null)
            {
                subjectpublickeyinfo = ((DHDomainParameters) (obj3)).h().e();
            } else
            {
                subjectpublickeyinfo = null;
            }
            obj3 = ((DHDomainParameters) (obj3)).i();
            if (obj3 != null)
            {
                obj = new DHValidationParameters(((DHValidationParms) (obj3)).e().e(), ((DHValidationParms) (obj3)).f().e().intValue());
            }
            return new DHPublicKeyParameters(((BigInteger) (obj1)), new DHParameters(((BigInteger) (obj2)), biginteger, biginteger1, subjectpublickeyinfo, ((DHValidationParameters) (obj))));
        }
        if (((AlgorithmIdentifier) (obj2)).e().equals(PKCSObjectIdentifiers.q))
        {
            obj = new DHParameter((ASN1Sequence)subjectpublickeyinfo.e().g());
            subjectpublickeyinfo = (DERInteger)subjectpublickeyinfo.f();
            obj1 = ((DHParameter) (obj)).g();
            if (obj1 != null)
            {
                i = ((BigInteger) (obj1)).intValue();
            }
            obj = new DHParameters(((DHParameter) (obj)).e(), ((DHParameter) (obj)).f(), null, i);
            return new DHPublicKeyParameters(subjectpublickeyinfo.e(), ((DHParameters) (obj)));
        }
        if (((AlgorithmIdentifier) (obj2)).e().equals(OIWObjectIdentifiers.l))
        {
            obj = new ElGamalParameter((ASN1Sequence)subjectpublickeyinfo.e().g());
            return new ElGamalPublicKeyParameters(((DERInteger)subjectpublickeyinfo.f()).e(), new ElGamalParameters(((ElGamalParameter) (obj)).e(), ((ElGamalParameter) (obj)).f()));
        }
        if (((AlgorithmIdentifier) (obj2)).e().equals(X9ObjectIdentifiers.U) || ((AlgorithmIdentifier) (obj2)).e().equals(OIWObjectIdentifiers.j))
        {
            obj = (DERInteger)subjectpublickeyinfo.f();
            obj2 = subjectpublickeyinfo.e().g();
            subjectpublickeyinfo = ((SubjectPublicKeyInfo) (obj1));
            if (obj2 != null)
            {
                subjectpublickeyinfo = DSAParameter.a(((DEREncodable) (obj2)).c());
                subjectpublickeyinfo = new DSAParameters(subjectpublickeyinfo.e(), subjectpublickeyinfo.f(), subjectpublickeyinfo.g());
            }
            return new DSAPublicKeyParameters(((DERInteger) (obj)).e(), subjectpublickeyinfo);
        }
        if (((AlgorithmIdentifier) (obj2)).e().equals(X9ObjectIdentifiers.k))
        {
            obj = new X962Parameters((DERObject)subjectpublickeyinfo.e().g());
            if (((X962Parameters) (obj)).e())
            {
                obj2 = (DERObjectIdentifier)((X962Parameters) (obj)).g();
                obj1 = X962NamedCurves.a(((DERObjectIdentifier) (obj2)));
                obj = obj1;
                if (obj1 == null)
                {
                    obj1 = SECNamedCurves.a(((DERObjectIdentifier) (obj2)));
                    obj = obj1;
                    if (obj1 == null)
                    {
                        obj1 = NISTNamedCurves.a(((DERObjectIdentifier) (obj2)));
                        obj = obj1;
                        if (obj1 == null)
                        {
                            obj = TeleTrusTNamedCurves.a(((DERObjectIdentifier) (obj2)));
                        }
                    }
                }
                obj = new ECDomainParameters(((X9ECParameters) (obj)).e(), ((X9ECParameters) (obj)).f(), ((X9ECParameters) (obj)).g(), ((X9ECParameters) (obj)).h(), ((X9ECParameters) (obj)).i());
            } else
            {
                obj = new X9ECParameters((ASN1Sequence)((X962Parameters) (obj)).g());
                obj = new ECDomainParameters(((X9ECParameters) (obj)).e(), ((X9ECParameters) (obj)).f(), ((X9ECParameters) (obj)).g(), ((X9ECParameters) (obj)).h(), ((X9ECParameters) (obj)).i());
            }
            subjectpublickeyinfo = new DEROctetString(subjectpublickeyinfo.g().e());
            return new ECPublicKeyParameters((new X9ECPoint(((ECDomainParameters) (obj)).getCurve(), subjectpublickeyinfo)).e(), ((ECDomainParameters) (obj)));
        } else
        {
            throw new RuntimeException("algorithm identifier in key not recognised");
        }
    }

    public static AsymmetricKeyParameter createKey(byte abyte0[])
    {
        return createKey(SubjectPublicKeyInfo.a(ASN1Object.a(abyte0)));
    }
}

// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.util;

import java.io.InputStream;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTNamedCurves;
import org.bouncycastle.asn1.oiw.ElGamalParameter;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.DHParameter;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.RSAPrivateKeyStructure;
import org.bouncycastle.asn1.sec.ECPrivateKeyStructure;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DSAParameter;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class PrivateKeyFactory
{

    public PrivateKeyFactory()
    {
    }

    public static AsymmetricKeyParameter createKey(InputStream inputstream)
    {
        return createKey(PrivateKeyInfo.a((new ASN1InputStream(inputstream)).a()));
    }

    public static AsymmetricKeyParameter createKey(PrivateKeyInfo privatekeyinfo)
    {
        Object obj = privatekeyinfo.e();
        if (((AlgorithmIdentifier) (obj)).f().equals(PKCSObjectIdentifiers.h_))
        {
            privatekeyinfo = new RSAPrivateKeyStructure((ASN1Sequence)privatekeyinfo.f());
            return new RSAPrivateCrtKeyParameters(privatekeyinfo.e(), privatekeyinfo.f(), privatekeyinfo.g(), privatekeyinfo.h(), privatekeyinfo.i(), privatekeyinfo.j(), privatekeyinfo.k(), privatekeyinfo.l());
        }
        if (((AlgorithmIdentifier) (obj)).e().equals(PKCSObjectIdentifiers.q))
        {
            obj = new DHParameter((ASN1Sequence)privatekeyinfo.e().g());
            privatekeyinfo = (DERInteger)privatekeyinfo.f();
            BigInteger biginteger = ((DHParameter) (obj)).g();
            int i;
            if (biginteger == null)
            {
                i = 0;
            } else
            {
                i = biginteger.intValue();
            }
            obj = new DHParameters(((DHParameter) (obj)).e(), ((DHParameter) (obj)).f(), null, i);
            return new DHPrivateKeyParameters(privatekeyinfo.e(), ((DHParameters) (obj)));
        }
        if (((AlgorithmIdentifier) (obj)).e().equals(OIWObjectIdentifiers.l))
        {
            obj = new ElGamalParameter((ASN1Sequence)privatekeyinfo.e().g());
            return new ElGamalPrivateKeyParameters(((DERInteger)privatekeyinfo.f()).e(), new ElGamalParameters(((ElGamalParameter) (obj)).e(), ((ElGamalParameter) (obj)).f()));
        }
        if (((AlgorithmIdentifier) (obj)).e().equals(X9ObjectIdentifiers.U))
        {
            obj = (DERInteger)privatekeyinfo.f();
            privatekeyinfo = privatekeyinfo.e().g();
            X9ECParameters x9ecparameters;
            DERObjectIdentifier derobjectidentifier;
            if (privatekeyinfo != null)
            {
                privatekeyinfo = DSAParameter.a(privatekeyinfo.c());
                privatekeyinfo = new DSAParameters(privatekeyinfo.e(), privatekeyinfo.f(), privatekeyinfo.g());
            } else
            {
                privatekeyinfo = null;
            }
            return new DSAPrivateKeyParameters(((DERInteger) (obj)).e(), privatekeyinfo);
        }
        if (((AlgorithmIdentifier) (obj)).e().equals(X9ObjectIdentifiers.k))
        {
            obj = new X962Parameters((DERObject)privatekeyinfo.e().g());
            if (((X962Parameters) (obj)).e())
            {
                derobjectidentifier = (DERObjectIdentifier)((X962Parameters) (obj)).g();
                x9ecparameters = X962NamedCurves.a(derobjectidentifier);
                obj = x9ecparameters;
                if (x9ecparameters == null)
                {
                    x9ecparameters = SECNamedCurves.a(derobjectidentifier);
                    obj = x9ecparameters;
                    if (x9ecparameters == null)
                    {
                        x9ecparameters = NISTNamedCurves.a(derobjectidentifier);
                        obj = x9ecparameters;
                        if (x9ecparameters == null)
                        {
                            obj = TeleTrusTNamedCurves.a(derobjectidentifier);
                        }
                    }
                }
                obj = new ECDomainParameters(((X9ECParameters) (obj)).e(), ((X9ECParameters) (obj)).f(), ((X9ECParameters) (obj)).g(), ((X9ECParameters) (obj)).h(), ((X9ECParameters) (obj)).i());
            } else
            {
                obj = new X9ECParameters((ASN1Sequence)((X962Parameters) (obj)).g());
                obj = new ECDomainParameters(((X9ECParameters) (obj)).e(), ((X9ECParameters) (obj)).f(), ((X9ECParameters) (obj)).g(), ((X9ECParameters) (obj)).h(), ((X9ECParameters) (obj)).i());
            }
            return new ECPrivateKeyParameters((new ECPrivateKeyStructure((ASN1Sequence)privatekeyinfo.f())).e(), ((ECDomainParameters) (obj)));
        } else
        {
            throw new RuntimeException("algorithm identifier in key not recognised");
        }
    }

    public static AsymmetricKeyParameter createKey(byte abyte0[])
    {
        return createKey(PrivateKeyInfo.a(ASN1Object.a(abyte0)));
    }
}

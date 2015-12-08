// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.util;

import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERInteger;
import org.spongycastle.asn1.nist.NISTNamedCurves;
import org.spongycastle.asn1.oiw.ElGamalParameter;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.DHParameter;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.RSAPrivateKey;
import org.spongycastle.asn1.sec.ECPrivateKey;
import org.spongycastle.asn1.sec.SECNamedCurves;
import org.spongycastle.asn1.teletrust.TeleTrusTNamedCurves;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.asn1.x9.X962NamedCurves;
import org.spongycastle.asn1.x9.X962Parameters;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;

public class PrivateKeyFactory
{

    public PrivateKeyFactory()
    {
    }

    public static AsymmetricKeyParameter a(byte abyte0[])
    {
        Object obj = PrivateKeyInfo.a(ASN1Primitive.a(abyte0));
        abyte0 = ((PrivateKeyInfo) (obj)).c();
        if (abyte0.d().equals(PKCSObjectIdentifiers.D_))
        {
            abyte0 = RSAPrivateKey.a(((PrivateKeyInfo) (obj)).e());
            return new RSAPrivateCrtKeyParameters(abyte0.c(), abyte0.d(), abyte0.e(), abyte0.f(), abyte0.g(), abyte0.h(), abyte0.i(), abyte0.j());
        }
        if (abyte0.d().equals(PKCSObjectIdentifiers.q))
        {
            abyte0 = DHParameter.a(abyte0.e());
            DERInteger derinteger = (DERInteger)((PrivateKeyInfo) (obj)).e();
            obj = abyte0.e();
            int i;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = ((BigInteger) (obj)).intValue();
            }
            abyte0 = new DHParameters(abyte0.c(), abyte0.d(), i);
            return new DHPrivateKeyParameters(derinteger.c(), abyte0);
        }
        if (abyte0.d().equals(OIWObjectIdentifiers.l))
        {
            abyte0 = new ElGamalParameter((ASN1Sequence)abyte0.e());
            return new ElGamalPrivateKeyParameters(((DERInteger)((PrivateKeyInfo) (obj)).e()).c(), new ElGamalParameters(abyte0.c(), abyte0.d()));
        }
        if (abyte0.d().equals(X9ObjectIdentifiers.U))
        {
            DERInteger derinteger1 = (DERInteger)((PrivateKeyInfo) (obj)).e();
            obj = abyte0.e();
            abyte0 = null;
            if (obj != null)
            {
                abyte0 = DSAParameter.a(((ASN1Encodable) (obj)).a());
                abyte0 = new DSAParameters(abyte0.c(), abyte0.d(), abyte0.e());
            }
            return new DSAPrivateKeyParameters(derinteger1.c(), abyte0);
        }
        if (abyte0.d().equals(X9ObjectIdentifiers.k))
        {
            abyte0 = new X962Parameters((ASN1Primitive)abyte0.e());
            if (abyte0.c())
            {
                ASN1ObjectIdentifier asn1objectidentifier = ASN1ObjectIdentifier.a(abyte0.e());
                X9ECParameters x9ecparameters = X962NamedCurves.a(asn1objectidentifier);
                abyte0 = x9ecparameters;
                if (x9ecparameters == null)
                {
                    X9ECParameters x9ecparameters1 = SECNamedCurves.a(asn1objectidentifier);
                    abyte0 = x9ecparameters1;
                    if (x9ecparameters1 == null)
                    {
                        X9ECParameters x9ecparameters2 = NISTNamedCurves.a(asn1objectidentifier);
                        abyte0 = x9ecparameters2;
                        if (x9ecparameters2 == null)
                        {
                            abyte0 = TeleTrusTNamedCurves.a(asn1objectidentifier);
                        }
                    }
                }
            } else
            {
                abyte0 = X9ECParameters.a(abyte0.e());
            }
            return new ECPrivateKeyParameters(ECPrivateKey.a(((PrivateKeyInfo) (obj)).e()).c(), new ECDomainParameters(abyte0.c(), abyte0.d(), abyte0.e(), abyte0.f(), abyte0.g()));
        } else
        {
            throw new RuntimeException("algorithm identifier in key not recognised");
        }
    }
}

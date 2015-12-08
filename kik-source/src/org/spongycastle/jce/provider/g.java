// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.DERObjectIdentifier;
import org.spongycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.RSASSAPSSparams;
import org.spongycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;

final class g
{

    private static final ASN1Null a = new DERNull();

    private static String a(DERObjectIdentifier derobjectidentifier)
    {
        if (PKCSObjectIdentifiers.G.equals(derobjectidentifier))
        {
            return "MD5";
        }
        if (OIWObjectIdentifiers.i.equals(derobjectidentifier))
        {
            return "SHA1";
        }
        if (NISTObjectIdentifiers.e.equals(derobjectidentifier))
        {
            return "SHA224";
        }
        if (NISTObjectIdentifiers.b.equals(derobjectidentifier))
        {
            return "SHA256";
        }
        if (NISTObjectIdentifiers.c.equals(derobjectidentifier))
        {
            return "SHA384";
        }
        if (NISTObjectIdentifiers.d.equals(derobjectidentifier))
        {
            return "SHA512";
        }
        if (TeleTrusTObjectIdentifiers.c.equals(derobjectidentifier))
        {
            return "RIPEMD128";
        }
        if (TeleTrusTObjectIdentifiers.b.equals(derobjectidentifier))
        {
            return "RIPEMD160";
        }
        if (TeleTrusTObjectIdentifiers.d.equals(derobjectidentifier))
        {
            return "RIPEMD256";
        }
        if (CryptoProObjectIdentifiers.a.equals(derobjectidentifier))
        {
            return "GOST3411";
        } else
        {
            return derobjectidentifier.c();
        }
    }

    static String a(AlgorithmIdentifier algorithmidentifier)
    {
        ASN1Encodable asn1encodable = algorithmidentifier.e();
        if (asn1encodable != null && !a.equals(asn1encodable))
        {
            if (algorithmidentifier.c().equals(PKCSObjectIdentifiers.k))
            {
                algorithmidentifier = RSASSAPSSparams.a(asn1encodable);
                return (new StringBuilder()).append(a(((DERObjectIdentifier) (algorithmidentifier.c().c())))).append("withRSAandMGF1").toString();
            }
            if (algorithmidentifier.c().equals(X9ObjectIdentifiers.l))
            {
                algorithmidentifier = ASN1Sequence.a(asn1encodable);
                return (new StringBuilder()).append(a((DERObjectIdentifier)algorithmidentifier.a(0))).append("withECDSA").toString();
            }
        }
        return algorithmidentifier.c().c();
    }

    static void a(Signature signature, ASN1Encodable asn1encodable)
    {
        if (asn1encodable == null || a.equals(asn1encodable))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        AlgorithmParameters algorithmparameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try
        {
            algorithmparameters.init(asn1encodable.a().b());
        }
        // Misplaced declaration of an exception variable
        catch (Signature signature)
        {
            throw new SignatureException((new StringBuilder("IOException decoding parameters: ")).append(signature.getMessage()).toString());
        }
        if (!signature.getAlgorithm().endsWith("MGF1"))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        signature.setParameter(algorithmparameters.getParameterSpec(java/security/spec/PSSParameterSpec));
        return;
        signature;
        throw new SignatureException((new StringBuilder("Exception extracting parameters: ")).append(signature.getMessage()).toString());
    }

}

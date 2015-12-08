// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

class X509SignatureUtil
{

    private static final ASN1Null derNull = new DERNull();

    X509SignatureUtil()
    {
    }

    private static String getDigestAlgName(DERObjectIdentifier derobjectidentifier)
    {
        if (PKCSObjectIdentifiers.md5.equals(derobjectidentifier))
        {
            return "MD5";
        }
        if (OIWObjectIdentifiers.idSHA1.equals(derobjectidentifier))
        {
            return "SHA1";
        }
        if (NISTObjectIdentifiers.id_sha224.equals(derobjectidentifier))
        {
            return "SHA224";
        }
        if (NISTObjectIdentifiers.id_sha256.equals(derobjectidentifier))
        {
            return "SHA256";
        }
        if (NISTObjectIdentifiers.id_sha384.equals(derobjectidentifier))
        {
            return "SHA384";
        }
        if (NISTObjectIdentifiers.id_sha512.equals(derobjectidentifier))
        {
            return "SHA512";
        }
        if (TeleTrusTObjectIdentifiers.ripemd128.equals(derobjectidentifier))
        {
            return "RIPEMD128";
        }
        if (TeleTrusTObjectIdentifiers.ripemd160.equals(derobjectidentifier))
        {
            return "RIPEMD160";
        }
        if (TeleTrusTObjectIdentifiers.ripemd256.equals(derobjectidentifier))
        {
            return "RIPEMD256";
        }
        if (CryptoProObjectIdentifiers.gostR3411.equals(derobjectidentifier))
        {
            return "GOST3411";
        } else
        {
            return derobjectidentifier.getId();
        }
    }

    static String getSignatureName(AlgorithmIdentifier algorithmidentifier)
    {
        ASN1Encodable asn1encodable = algorithmidentifier.getParameters();
        if (asn1encodable != null && !derNull.equals(asn1encodable))
        {
            if (algorithmidentifier.getObjectId().equals(PKCSObjectIdentifiers.id_RSASSA_PSS))
            {
                algorithmidentifier = RSASSAPSSparams.getInstance(asn1encodable);
                return (new StringBuilder()).append(getDigestAlgName(algorithmidentifier.getHashAlgorithm().getObjectId())).append("withRSAandMGF1").toString();
            }
            if (algorithmidentifier.getObjectId().equals(X9ObjectIdentifiers.ecdsa_with_SHA2))
            {
                algorithmidentifier = ASN1Sequence.getInstance(asn1encodable);
                return (new StringBuilder()).append(getDigestAlgName((DERObjectIdentifier)algorithmidentifier.getObjectAt(0))).append("withECDSA").toString();
            }
        }
        return algorithmidentifier.getObjectId().getId();
    }

    static void setSignatureParameters(Signature signature, ASN1Encodable asn1encodable)
        throws NoSuchAlgorithmException, SignatureException, InvalidKeyException
    {
        if (asn1encodable == null || derNull.equals(asn1encodable))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        AlgorithmParameters algorithmparameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try
        {
            algorithmparameters.init(asn1encodable.toASN1Primitive().getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (Signature signature)
        {
            throw new SignatureException((new StringBuilder()).append("IOException decoding parameters: ").append(signature.getMessage()).toString());
        }
        if (!signature.getAlgorithm().endsWith("MGF1"))
        {
            break MISSING_BLOCK_LABEL_61;
        }
        signature.setParameter(algorithmparameters.getParameterSpec(java/security/spec/PSSParameterSpec));
        return;
        signature;
        throw new SignatureException((new StringBuilder()).append("Exception extracting parameters: ").append(signature.getMessage()).toString());
    }

}
